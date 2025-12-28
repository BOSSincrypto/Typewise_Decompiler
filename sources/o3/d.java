package o3;

import android.content.Context;
import ch.icoaching.wrio.data.i;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.keyboard.notifications.a;
import ch.icoaching.wrio.logging.Log;
import i2.C0680a;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f15100a;

    /* renamed from: b  reason: collision with root package name */
    private final C0680a f15101b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f15102c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15103d = this.f15102c;

    /* renamed from: e  reason: collision with root package name */
    private a.C0154a f15104e;

    /* renamed from: f  reason: collision with root package name */
    private C0906a f15105f;

    /* renamed from: g  reason: collision with root package name */
    private int f15106g;

    /* renamed from: h  reason: collision with root package name */
    private int f15107h;

    public d(i iVar, C0680a aVar) {
        o.e(iVar, "otherSettings");
        o.e(aVar, "defaultSharedPreferences");
        this.f15100a = iVar;
        this.f15101b = aVar;
        this.f15106g = aVar.O0();
        this.f15107h = aVar.P0();
    }

    /* access modifiers changed from: private */
    public static final q h(B b4, g gVar) {
        b4.B(gVar);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q i(d dVar) {
        C0680a aVar = dVar.f15101b;
        aVar.Z(aVar.f() + 1);
        dVar.f15102c = false;
        a.C0154a k4 = dVar.k();
        if (k4 != null) {
            k4.a();
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q j(d dVar, B b4, g gVar) {
        dVar.f15102c = false;
        b4.B(gVar);
        return q.f14567a;
    }

    private final boolean l() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        int g4 = (int) this.f15100a.g();
        if (this.f15106g != 0 || (currentTimeMillis - g4) / 86400 >= 24) {
            return true;
        }
        return false;
    }

    private final boolean m() {
        if ((((int) (System.currentTimeMillis() / ((long) 1000))) - this.f15107h) / 86400 > 180) {
            return true;
        }
        return false;
    }

    private final boolean n() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        int i4 = this.f15106g;
        if (i4 != 0 && (currentTimeMillis - i4) / 86400 <= 365) {
            return false;
        }
        return true;
    }

    private final boolean o() {
        if (this.f15101b.f() >= 3) {
            return true;
        }
        return false;
    }

    public void a() {
        this.f15102c = false;
        C0906a aVar = this.f15105f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public boolean b() {
        this.f15106g = this.f15101b.O0();
        this.f15107h = this.f15101b.P0();
        if (!n() || o() || !m() || !l()) {
            return false;
        }
        return true;
    }

    public void c(Context context, B b4) {
        o.e(context, "context");
        o.e(b4, "keyboardController");
        Log.d(Log.f10572a, "RatingController", "show() :: Start", (Throwable) null, 4, (Object) null);
        this.f15102c = true;
        this.f15101b.W((int) (System.currentTimeMillis() / ((long) 1000)));
        g gVar = new g(context);
        gVar.setOnExitClicked(new a(this, b4, gVar));
        gVar.setOnRateClicked(new b(this));
        b4.s(gVar);
        this.f15105f = new c(b4, gVar);
    }

    public void d(a.C0154a aVar) {
        this.f15104e = aVar;
    }

    public a.C0154a k() {
        return this.f15104e;
    }
}
