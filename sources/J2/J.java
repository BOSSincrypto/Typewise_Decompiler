package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;

public final class J extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final J f633c = new J();

    private J() {
        super(a.B(n.f13905a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(int[] iArr) {
        o.e(iArr, "<this>");
        return iArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int[] w() {
        return new int[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, I i5, boolean z3) {
        o.e(cVar, "decoder");
        o.e(i5, "builder");
        i5.e(cVar.v(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public I p(int[] iArr) {
        o.e(iArr, "<this>");
        return new I(iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, int[] iArr, int i4) {
        o.e(dVar, "encoder");
        o.e(iArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.z(a(), i5, iArr[i5]);
        }
    }
}
