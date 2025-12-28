package I2;

import F2.n;
import H2.f;
import I2.d;
import I2.f;
import J2.C0295c0;
import kotlin.jvm.internal.o;

public abstract class b implements f, d {
    public final f A(f fVar, int i4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            return s(fVar.i(i4));
        }
        return C0295c0.f690a;
    }

    public abstract void B(long j4);

    public abstract void C(char c4);

    public final void D(f fVar, int i4, float f4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            y(f4);
        }
    }

    public void E() {
        f.a.b(this);
    }

    public abstract void F(String str);

    public boolean G(H2.f fVar, int i4) {
        o.e(fVar, "descriptor");
        return true;
    }

    public void H(n nVar, Object obj) {
        f.a.c(this, nVar, obj);
    }

    public void c(H2.f fVar) {
        o.e(fVar, "descriptor");
    }

    public d d(H2.f fVar) {
        o.e(fVar, "descriptor");
        return this;
    }

    public void f(H2.f fVar, int i4, n nVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(nVar, "serializer");
        if (G(fVar, i4)) {
            k(nVar, obj);
        }
    }

    public final void g(H2.f fVar, int i4, double d4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            l(d4);
        }
    }

    public final void h(H2.f fVar, int i4, short s4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            m(s4);
        }
    }

    public final void j(H2.f fVar, int i4, boolean z3) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            r(z3);
        }
    }

    public void k(n nVar, Object obj) {
        f.a.d(this, nVar, obj);
    }

    public abstract void l(double d4);

    public abstract void m(short s4);

    public boolean n(H2.f fVar, int i4) {
        return d.a.a(this, fVar, i4);
    }

    public void o(H2.f fVar, int i4, n nVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(nVar, "serializer");
        if (G(fVar, i4)) {
            H(nVar, obj);
        }
    }

    public final void p(H2.f fVar, int i4, String str) {
        o.e(fVar, "descriptor");
        o.e(str, "value");
        if (G(fVar, i4)) {
            F(str);
        }
    }

    public abstract void q(byte b4);

    public abstract void r(boolean z3);

    public f s(H2.f fVar) {
        o.e(fVar, "descriptor");
        return this;
    }

    public final void t(H2.f fVar, int i4, long j4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            B(j4);
        }
    }

    public abstract void u(int i4);

    public final void v(H2.f fVar, int i4, byte b4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            q(b4);
        }
    }

    public final void w(H2.f fVar, int i4, char c4) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            C(c4);
        }
    }

    public d x(H2.f fVar, int i4) {
        return f.a.a(this, fVar, i4);
    }

    public abstract void y(float f4);

    public final void z(H2.f fVar, int i4, int i5) {
        o.e(fVar, "descriptor");
        if (G(fVar, i4)) {
            u(i5);
        }
    }
}
