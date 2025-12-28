package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.j;
import l2.k;

public final class R0 extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final R0 f655c = new R0();

    private R0() {
        super(a.H(j.f14551b));
    }

    /* access modifiers changed from: protected */
    public int A(int[] iArr) {
        o.e(iArr, "$this$collectionSize");
        return k.k(iArr);
    }

    /* access modifiers changed from: protected */
    public int[] B() {
        return k.c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, Q0 q02, boolean z3) {
        o.e(cVar, "decoder");
        o.e(q02, "builder");
        q02.e(j.b(cVar.x(a(), i4).t()));
    }

    /* access modifiers changed from: protected */
    public Q0 D(int[] iArr) {
        o.e(iArr, "$this$toBuilder");
        return new Q0(iArr, (i) null);
    }

    /* access modifiers changed from: protected */
    public void E(d dVar, int[] iArr, int i4) {
        o.e(dVar, "encoder");
        o.e(iArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.A(a(), i5).u(k.i(iArr, i5));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((k) obj).q());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((k) obj).q());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return k.b(B());
    }

    public /* bridge */ /* synthetic */ void z(d dVar, Object obj, int i4) {
        E(dVar, ((k) obj).q(), i4);
    }
}
