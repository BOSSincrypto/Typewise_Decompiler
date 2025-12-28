package ch.icoaching.wrio.subscription;

import I0.b;
import android.content.Context;
import ch.icoaching.wrio.logging.Log;
import e3.c;
import i2.C0680a;
import java.util.Calendar;
import kotlin.jvm.internal.o;

public final class TypewiseSubscriptionChecker implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0680a f10630a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f10631b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10632c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f10633d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f10634e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f10635f = o();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public long f10636g = n();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f10637h;

    public TypewiseSubscriptionChecker(C0680a aVar, b bVar, Context context) {
        o.e(aVar, "defaultSharedPreferences");
        o.e(bVar, "appnomixSharedPreferences");
        o.e(context, "context");
        this.f10630a = aVar;
        this.f10631b = bVar;
        this.f10632c = c.f("ch.icoaching.wrio", context.getPackageName());
        this.f10633d = bVar.h();
        this.f10634e = aVar.l();
        this.f10637h = aVar.M0();
    }

    /* access modifiers changed from: private */
    public final long n() {
        return this.f10630a.k();
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        return kotlin.text.o.G(this.f10630a.E0(), "ch.icoaching.typewise.prolifetime", false, 2, (Object) null);
    }

    public boolean a() {
        if (this.f10632c || this.f10635f) {
            Log.d(Log.f10572a, "TypewiseSubscriptionChecker", "shouldValidatePurchaseInfo() :: subscription active", (Throwable) null, 4, (Object) null);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.f10636g;
        long j5 = ((long) 172800000) + j4;
        long j6 = j4 + ((long) 604800000);
        if (j5 > currentTimeMillis || currentTimeMillis > j6) {
            Log log = Log.f10572a;
            Log.d(log, "TypewiseSubscriptionChecker", "shouldValidatePurchaseInfo() :: outside of validation scope " + currentTimeMillis + ' ' + j5 + ' ' + j6, (Throwable) null, 4, (Object) null);
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f10637h);
        Calendar instance2 = Calendar.getInstance();
        if (instance2.get(6) == instance.get(6) && instance2.get(1) == instance.get(1)) {
            Log.d(Log.f10572a, "TypewiseSubscriptionChecker", "shouldValidatePurchaseInfo() :: purchase validation dialog already displayed today", (Throwable) null, 4, (Object) null);
            return false;
        }
        Log.d(Log.f10572a, "TypewiseSubscriptionChecker", "shouldValidatePurchaseInfo() :: purchase validation dialog should be displayed", (Throwable) null, 4, (Object) null);
        return true;
    }

    public boolean b() {
        if (this.f10632c || this.f10635f || this.f10633d || System.currentTimeMillis() <= this.f10636g + ((long) 604800000)) {
            return true;
        }
        return this.f10634e;
    }

    public void d() {
        this.f10630a.J(System.currentTimeMillis());
    }

    public kotlinx.coroutines.flow.c e() {
        return new TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1(new TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$filter$1(this.f10630a.J0()), this);
    }

    public String c() {
        if (this.f10633d) {
            return "appnomix_mode";
        }
        if (b()) {
            return "pro";
        }
        return "free";
    }
}
