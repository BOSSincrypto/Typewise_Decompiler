package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.o;
import l2.h;
import l2.i;

public final class O0 extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final O0 f649c = new O0();

    private O0() {
        super(a.G(h.f14546b));
    }

    /* access modifiers changed from: protected */
    public int A(byte[] bArr) {
        o.e(bArr, "$this$collectionSize");
        return i.k(bArr);
    }

    /* access modifiers changed from: protected */
    public byte[] B() {
        return i.c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, N0 n02, boolean z3) {
        o.e(cVar, "decoder");
        o.e(n02, "builder");
        n02.e(h.b(cVar.x(a(), i4).y()));
    }

    /* access modifiers changed from: protected */
    public N0 D(byte[] bArr) {
        o.e(bArr, "$this$toBuilder");
        return new N0(bArr, (kotlin.jvm.internal.i) null);
    }

    /* access modifiers changed from: protected */
    public void E(d dVar, byte[] bArr, int i4) {
        o.e(dVar, "encoder");
        o.e(bArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.A(a(), i5).q(i.i(bArr, i5));
        }
    }

    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((i) obj).q());
    }

    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((i) obj).q());
    }

    public /* bridge */ /* synthetic */ Object w() {
        return i.b(B());
    }

    public /* bridge */ /* synthetic */ void z(d dVar, Object obj, int i4) {
        E(dVar, ((i) obj).q(), i4);
    }
}
