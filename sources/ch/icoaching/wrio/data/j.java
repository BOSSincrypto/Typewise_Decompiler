package ch.icoaching.wrio.data;

import ch.icoaching.wrio.J;
import ch.icoaching.wrio.ai_assistant.ui.a;
import ch.icoaching.wrio.keyboard.KeyboardLayoutType;
import i2.C0680a;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.c;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f9516a;

    /* renamed from: b  reason: collision with root package name */
    private final C0680a f9517b;

    public j(b bVar, C0680a aVar) {
        o.e(bVar, "innerKeyboardSettings");
        o.e(aVar, "defaultSharedPreferences");
        this.f9516a = bVar;
        this.f9517b = aVar;
    }

    public c A() {
        return this.f9516a.A();
    }

    public int B() {
        return this.f9516a.B();
    }

    public KeyboardLayoutType C() {
        return this.f9516a.C();
    }

    public c D() {
        return this.f9516a.D();
    }

    public KeyboardLayoutType E() {
        return this.f9516a.E();
    }

    public boolean F() {
        return this.f9516a.F();
    }

    public c G() {
        return this.f9516a.G();
    }

    public c H() {
        return this.f9516a.H();
    }

    public boolean I() {
        return this.f9516a.I();
    }

    public c J() {
        return this.f9516a.J();
    }

    public c K() {
        return this.f9516a.K();
    }

    public boolean L() {
        return this.f9516a.L();
    }

    public boolean M() {
        return this.f9516a.M();
    }

    public c N() {
        return this.f9516a.N();
    }

    public void O(KeyboardLayoutType keyboardLayoutType) {
        o.e(keyboardLayoutType, "value");
        this.f9516a.O(keyboardLayoutType);
    }

    public boolean P() {
        return this.f9516a.P();
    }

    public c Q() {
        return this.f9516a.Q();
    }

    public c R() {
        return this.f9516a.R();
    }

    public boolean S() {
        if (this.f9517b.m0()) {
            return false;
        }
        return this.f9516a.S();
    }

    public String[] T() {
        return this.f9516a.T();
    }

    public boolean U() {
        return this.f9516a.U();
    }

    public boolean V() {
        return this.f9516a.V();
    }

    public boolean W() {
        return this.f9516a.W();
    }

    public float X() {
        return this.f9516a.X();
    }

    public c a() {
        return this.f9516a.a();
    }

    public String b(String str) {
        o.e(str, "key");
        return this.f9516a.b(str);
    }

    public boolean c() {
        return this.f9516a.c();
    }

    public boolean d() {
        return this.f9516a.d();
    }

    public c e() {
        return this.f9516a.e();
    }

    public boolean f() {
        return this.f9516a.f();
    }

    public c g() {
        return this.f9516a.g();
    }

    public c h() {
        return this.f9516a.h();
    }

    public Map i() {
        return this.f9516a.i();
    }

    public long j() {
        return this.f9516a.j();
    }

    public c k() {
        return this.f9516a.k();
    }

    public boolean l() {
        return this.f9516a.l();
    }

    public void m(boolean z3) {
        this.f9516a.m(z3);
    }

    public J n() {
        return this.f9516a.n();
    }

    public boolean o() {
        return this.f9516a.o();
    }

    public boolean p() {
        return this.f9516a.p();
    }

    public void q(a aVar) {
        o.e(aVar, "lastAiAssistantPrompt");
        this.f9516a.q(aVar);
    }

    public boolean r() {
        if (this.f9517b.m0()) {
            return false;
        }
        return this.f9516a.r();
    }

    public int s() {
        return this.f9516a.s();
    }

    public void t(String str, String str2) {
        this.f9516a.t(str, str2);
    }

    public boolean u() {
        return this.f9516a.u();
    }

    public int v() {
        return this.f9516a.v();
    }

    public void w(Map map) {
        o.e(map, "promptUsage");
        this.f9516a.w(map);
    }

    public c x() {
        return this.f9516a.x();
    }

    public a y() {
        return this.f9516a.y();
    }

    public boolean z() {
        return this.f9516a.z();
    }
}
