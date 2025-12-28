package kotlinx.coroutines;

import kotlin.jvm.internal.o;

public abstract class l0 extends C0759x implements Q, C0729b0 {

    /* renamed from: d  reason: collision with root package name */
    public m0 f14208d;

    public final m0 S() {
        m0 m0Var = this.f14208d;
        if (m0Var != null) {
            return m0Var;
        }
        o.p("job");
        return null;
    }

    public final void T(m0 m0Var) {
        this.f14208d = m0Var;
    }

    public boolean a() {
        return true;
    }

    public void d() {
        S().t0(this);
    }

    public String toString() {
        return F.a(this) + '@' + F.b(this) + "[job@" + F.b(S()) + ']';
    }

    public r0 u() {
        return null;
    }
}
