package J2;

import F2.b;
import G2.a;
import I2.c;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.o;

/* renamed from: J2.k  reason: case insensitive filesystem */
public final class C0310k extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0310k f715c = new C0310k();

    private C0310k() {
        super(a.x(d.f13893a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(byte[] bArr) {
        o.e(bArr, "<this>");
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public byte[] w() {
        return new byte[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, C0308j jVar, boolean z3) {
        o.e(cVar, "decoder");
        o.e(jVar, "builder");
        jVar.e(cVar.k(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C0308j p(byte[] bArr) {
        o.e(bArr, "<this>");
        return new C0308j(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(I2.d dVar, byte[] bArr, int i4) {
        o.e(dVar, "encoder");
        o.e(bArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.v(a(), i5, bArr[i5]);
        }
    }
}
