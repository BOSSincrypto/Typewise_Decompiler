package I2;

import H2.f;
import I2.c;
import I2.e;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlinx.serialization.SerializationException;

public abstract class a implements e, c {
    public Void A() {
        return null;
    }

    public abstract short B();

    public String C() {
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.String");
        return (String) J3;
    }

    public float D() {
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J3).floatValue();
    }

    public Object E(f fVar, int i4, F2.a aVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(aVar, "deserializer");
        return I(aVar, obj);
    }

    public int F(f fVar) {
        o.e(fVar, "enumDescriptor");
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J3).intValue();
    }

    public double G() {
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J3).doubleValue();
    }

    public final float H(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return D();
    }

    public Object I(F2.a aVar, Object obj) {
        o.e(aVar, "deserializer");
        return w(aVar);
    }

    public Object J() {
        throw new SerializationException(r.b(getClass()) + " can't retrieve untyped values");
    }

    public void c(f fVar) {
        o.e(fVar, "descriptor");
    }

    public c d(f fVar) {
        o.e(fVar, "descriptor");
        return this;
    }

    public abstract long f();

    public e g(f fVar) {
        o.e(fVar, "descriptor");
        return this;
    }

    public boolean h() {
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J3).booleanValue();
    }

    public final short i(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return B();
    }

    public boolean j() {
        return true;
    }

    public final byte k(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return y();
    }

    public char l() {
        Object J3 = J();
        o.c(J3, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J3).charValue();
    }

    public final Object m(f fVar, int i4, F2.a aVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(aVar, "deserializer");
        if (aVar.a().g() || j()) {
            return I(aVar, obj);
        }
        return A();
    }

    public final boolean n(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return h();
    }

    public int o(f fVar) {
        return c.a.a(this, fVar);
    }

    public boolean p() {
        return c.a.b(this);
    }

    public final char q(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return l();
    }

    public final long r(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return f();
    }

    public abstract int t();

    public final double u(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return G();
    }

    public final int v(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return t();
    }

    public Object w(F2.a aVar) {
        return e.a.a(this, aVar);
    }

    public e x(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return g(fVar.i(i4));
    }

    public abstract byte y();

    public final String z(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return C();
    }
}
