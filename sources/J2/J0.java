package J2;

import F2.a;
import H2.f;
import I2.c;
import I2.e;
import java.util.ArrayList;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.C0906a;

public abstract class J0 implements e, c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f634a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f635b;

    /* access modifiers changed from: private */
    public static final Object K(J0 j02, a aVar, Object obj) {
        if (aVar.a().g() || j02.j()) {
            return j02.M(aVar, obj);
        }
        return j02.A();
    }

    /* access modifiers changed from: private */
    public static final Object L(J0 j02, a aVar, Object obj) {
        return j02.M(aVar, obj);
    }

    private final Object d0(Object obj, C0906a aVar) {
        c0(obj);
        Object invoke = aVar.invoke();
        if (!this.f635b) {
            b0();
        }
        this.f635b = false;
        return invoke;
    }

    public final Void A() {
        return null;
    }

    public final short B() {
        return W(b0());
    }

    public final String C() {
        return X(b0());
    }

    public final float D() {
        return S(b0());
    }

    public final Object E(f fVar, int i4, a aVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(aVar, "deserializer");
        return d0(Z(fVar, i4), new H0(this, aVar, obj));
    }

    public final int F(f fVar) {
        o.e(fVar, "enumDescriptor");
        return R(b0(), fVar);
    }

    public final double G() {
        return Q(b0());
    }

    public final float H(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return S(Z(fVar, i4));
    }

    /* access modifiers changed from: protected */
    public Object M(a aVar, Object obj) {
        o.e(aVar, "deserializer");
        return w(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract boolean N(Object obj);

    /* access modifiers changed from: protected */
    public abstract byte O(Object obj);

    /* access modifiers changed from: protected */
    public abstract char P(Object obj);

    /* access modifiers changed from: protected */
    public abstract double Q(Object obj);

    /* access modifiers changed from: protected */
    public abstract int R(Object obj, f fVar);

    /* access modifiers changed from: protected */
    public abstract float S(Object obj);

    /* access modifiers changed from: protected */
    public e T(Object obj, f fVar) {
        o.e(fVar, "inlineDescriptor");
        c0(obj);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract int U(Object obj);

    /* access modifiers changed from: protected */
    public abstract long V(Object obj);

    /* access modifiers changed from: protected */
    public abstract short W(Object obj);

    /* access modifiers changed from: protected */
    public abstract String X(Object obj);

    /* access modifiers changed from: protected */
    public final Object Y() {
        return C0718m.c0(this.f634a);
    }

    /* access modifiers changed from: protected */
    public abstract Object Z(f fVar, int i4);

    public final ArrayList a0() {
        return this.f634a;
    }

    /* access modifiers changed from: protected */
    public final Object b0() {
        ArrayList arrayList = this.f634a;
        Object remove = arrayList.remove(C0718m.l(arrayList));
        this.f635b = true;
        return remove;
    }

    /* access modifiers changed from: protected */
    public final void c0(Object obj) {
        this.f634a.add(obj);
    }

    public final long f() {
        return V(b0());
    }

    public e g(f fVar) {
        o.e(fVar, "descriptor");
        return T(b0(), fVar);
    }

    public final boolean h() {
        return N(b0());
    }

    public final short i(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return W(Z(fVar, i4));
    }

    public final byte k(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return O(Z(fVar, i4));
    }

    public final char l() {
        return P(b0());
    }

    public final Object m(f fVar, int i4, a aVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(aVar, "deserializer");
        return d0(Z(fVar, i4), new I0(this, aVar, obj));
    }

    public final boolean n(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return N(Z(fVar, i4));
    }

    public int o(f fVar) {
        return c.a.a(this, fVar);
    }

    public boolean p() {
        return c.a.b(this);
    }

    public final char q(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return P(Z(fVar, i4));
    }

    public final long r(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return V(Z(fVar, i4));
    }

    public final int t() {
        return U(b0());
    }

    public final double u(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return Q(Z(fVar, i4));
    }

    public final int v(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return U(Z(fVar, i4));
    }

    public abstract Object w(a aVar);

    public final e x(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return T(Z(fVar, i4), fVar.i(i4));
    }

    public final byte y() {
        return O(b0());
    }

    public final String z(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return X(Z(fVar, i4));
    }
}
