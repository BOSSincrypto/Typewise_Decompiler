package J2;

import F2.b;
import G2.a;
import I2.d;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.o;

/* renamed from: J2.h  reason: case insensitive filesystem */
public final class C0304h extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0304h f704c = new C0304h();

    private C0304h() {
        super(a.w(c.f13892a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(boolean[] zArr) {
        o.e(zArr, "<this>");
        return zArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean[] w() {
        return new boolean[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(I2.c cVar, int i4, C0302g gVar, boolean z3) {
        o.e(cVar, "decoder");
        o.e(gVar, "builder");
        gVar.e(cVar.n(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C0302g p(boolean[] zArr) {
        o.e(zArr, "<this>");
        return new C0302g(zArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, boolean[] zArr, int i4) {
        o.e(dVar, "encoder");
        o.e(zArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.j(a(), i5, zArr[i5]);
        }
    }
}
