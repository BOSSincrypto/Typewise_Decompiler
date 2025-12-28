package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.t;

public final class E0 extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final E0 f618c = new E0();

    private E0() {
        super(a.D(t.f13911a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(short[] sArr) {
        o.e(sArr, "<this>");
        return sArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public short[] w() {
        return new short[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, D0 d02, boolean z3) {
        o.e(cVar, "decoder");
        o.e(d02, "builder");
        d02.e(cVar.i(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public D0 p(short[] sArr) {
        o.e(sArr, "<this>");
        return new D0(sArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, short[] sArr, int i4) {
        o.e(dVar, "encoder");
        o.e(sArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.h(a(), i5, sArr[i5]);
        }
    }
}
