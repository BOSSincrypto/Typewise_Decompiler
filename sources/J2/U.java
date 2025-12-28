package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.p;

public final class U extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final U f664c = new U();

    private U() {
        super(a.C(p.f13906a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(long[] jArr) {
        o.e(jArr, "<this>");
        return jArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public long[] w() {
        return new long[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, T t4, boolean z3) {
        o.e(cVar, "decoder");
        o.e(t4, "builder");
        t4.e(cVar.r(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public T p(long[] jArr) {
        o.e(jArr, "<this>");
        return new T(jArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, long[] jArr, int i4) {
        o.e(dVar, "encoder");
        o.e(jArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.t(a(), i5, jArr[i5]);
        }
    }
}
