package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.i;
import l2.o;
import l2.p;

public final class X0 extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final X0 f677c = new X0();

    private X0() {
        super(a.J(o.f14562b));
    }

    /* access modifiers changed from: protected */
    public int A(short[] sArr) {
        kotlin.jvm.internal.o.e(sArr, "$this$collectionSize");
        return p.k(sArr);
    }

    /* access modifiers changed from: protected */
    public short[] B() {
        return p.c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, W0 w02, boolean z3) {
        kotlin.jvm.internal.o.e(cVar, "decoder");
        kotlin.jvm.internal.o.e(w02, "builder");
        w02.e(o.b(cVar.x(a(), i4).B()));
    }

    /* access modifiers changed from: protected */
    public W0 D(short[] sArr) {
        kotlin.jvm.internal.o.e(sArr, "$this$toBuilder");
        return new W0(sArr, (i) null);
    }

    /* access modifiers changed from: protected */
    public void E(d dVar, short[] sArr, int i4) {
        kotlin.jvm.internal.o.e(dVar, "encoder");
        kotlin.jvm.internal.o.e(sArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.A(a(), i5).m(p.i(sArr, i5));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((p) obj).q());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((p) obj).q());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return p.b(B());
    }

    public /* bridge */ /* synthetic */ void z(d dVar, Object obj, int i4) {
        E(dVar, ((p) obj).q(), i4);
    }
}
