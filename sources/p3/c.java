package p3;

import android.content.Context;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.notifications.a;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;
import l2.q;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ch.icoaching.wrio.subscription.a f15892a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f15893b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15894c = this.f15893b;

    /* renamed from: d  reason: collision with root package name */
    private a.C0154a f15895d;

    public c(ch.icoaching.wrio.subscription.a aVar) {
        o.e(aVar, "subscriptionChecker");
        this.f15892a = aVar;
    }

    /* access modifiers changed from: private */
    public static final q g(c cVar) {
        cVar.f15893b = false;
        a.C0154a i4 = cVar.i();
        if (i4 != null) {
            i4.a();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q h(c cVar, B b4, f fVar) {
        cVar.f15893b = false;
        b4.B(fVar);
        return q.f14567a;
    }

    public void a() {
        this.f15893b = false;
    }

    public boolean b() {
        return this.f15892a.a();
    }

    public void c(Context context, B b4) {
        o.e(context, "context");
        o.e(b4, "keyboardController");
        Log.d(Log.f10572a, "ValidatePurchaseController", "show() :: Start", (Throwable) null, 4, (Object) null);
        this.f15893b = true;
        this.f15892a.d();
        f fVar = new f(context);
        fVar.setOnExitClicked(new a(this, b4, fVar));
        fVar.setOnValidatePurchaseInfoClick(new b(this));
        b4.s(fVar);
    }

    public void d(a.C0154a aVar) {
        this.f15895d = aVar;
    }

    public a.C0154a i() {
        return this.f15895d;
    }
}
