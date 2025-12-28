package n3;

import android.content.Context;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.notifications.a;
import ch.icoaching.wrio.logging.Log;
import i2.C0680a;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C0680a f15080a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f15081b;

    /* renamed from: c  reason: collision with root package name */
    private a.C0154a f15082c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15083d = this.f15081b;

    /* renamed from: e  reason: collision with root package name */
    private C0906a f15084e;

    public c(C0680a aVar) {
        o.e(aVar, "defaultSharedPreferences");
        this.f15080a = aVar;
    }

    /* access modifiers changed from: private */
    public static final q g(B b4, e eVar) {
        b4.B(eVar);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q h(c cVar, B b4, e eVar) {
        cVar.f15081b = false;
        b4.B(eVar);
        return q.f14567a;
    }

    private final boolean i() {
        long currentTimeMillis = System.currentTimeMillis();
        long q02 = this.f15080a.q0();
        if (q02 != 0 && (currentTimeMillis - q02) / ((long) 86400000) <= 3) {
            return false;
        }
        return true;
    }

    public void a() {
        this.f15081b = false;
        C0906a aVar = this.f15084e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public boolean b() {
        if (!i() || !this.f15080a.G()) {
            return false;
        }
        return true;
    }

    public void c(Context context, B b4) {
        o.e(context, "context");
        o.e(b4, "keyboardController");
        Log.d(Log.f10572a, "DbBuildingKeyboardNotificationController", "show() :: Start", (Throwable) null, 4, (Object) null);
        this.f15081b = true;
        e eVar = new e(context);
        eVar.setOnExitClicked(new a(this, b4, eVar));
        b4.s(eVar);
        this.f15080a.A(System.currentTimeMillis());
        this.f15084e = new b(b4, eVar);
    }

    public void d(a.C0154a aVar) {
        this.f15082c = aVar;
    }
}
