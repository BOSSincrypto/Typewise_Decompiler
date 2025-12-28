package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;

public final class D extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final D f613c = new D();

    private D() {
        super(a.A(k.f13904a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(float[] fArr) {
        o.e(fArr, "<this>");
        return fArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public float[] w() {
        return new float[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, C c4, boolean z3) {
        o.e(cVar, "decoder");
        o.e(c4, "builder");
        c4.e(cVar.H(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C p(float[] fArr) {
        o.e(fArr, "<this>");
        return new C(fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, float[] fArr, int i4) {
        o.e(dVar, "encoder");
        o.e(fArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.D(a(), i5, fArr[i5]);
        }
    }
}
