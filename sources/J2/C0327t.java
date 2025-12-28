package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.o;

/* renamed from: J2.t  reason: case insensitive filesystem */
public final class C0327t extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0327t f744c = new C0327t();

    private C0327t() {
        super(a.z(j.f13903a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(double[] dArr) {
        o.e(dArr, "<this>");
        return dArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public double[] w() {
        return new double[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, C0325s sVar, boolean z3) {
        o.e(cVar, "decoder");
        o.e(sVar, "builder");
        sVar.e(cVar.u(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C0325s p(double[] dArr) {
        o.e(dArr, "<this>");
        return new C0325s(dArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, double[] dArr, int i4) {
        o.e(dVar, "encoder");
        o.e(dArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.g(a(), i5, dArr[i5]);
        }
    }
}
