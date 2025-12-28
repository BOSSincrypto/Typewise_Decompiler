package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.l;
import l2.m;

public final class U0 extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final U0 f665c = new U0();

    private U0() {
        super(a.I(l.f14556b));
    }

    /* access modifiers changed from: protected */
    public int A(long[] jArr) {
        o.e(jArr, "$this$collectionSize");
        return m.k(jArr);
    }

    /* access modifiers changed from: protected */
    public long[] B() {
        return m.c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, T0 t02, boolean z3) {
        o.e(cVar, "decoder");
        o.e(t02, "builder");
        t02.e(l.b(cVar.x(a(), i4).f()));
    }

    /* access modifiers changed from: protected */
    public T0 D(long[] jArr) {
        o.e(jArr, "$this$toBuilder");
        return new T0(jArr, (i) null);
    }

    /* access modifiers changed from: protected */
    public void E(d dVar, long[] jArr, int i4) {
        o.e(dVar, "encoder");
        o.e(jArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.A(a(), i5).B(m.i(jArr, i5));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((m) obj).q());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((m) obj).q());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return m.b(B());
    }

    public /* bridge */ /* synthetic */ void z(d dVar, Object obj, int i4) {
        E(dVar, ((m) obj).q(), i4);
    }
}
