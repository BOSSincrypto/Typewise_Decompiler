package J2;

import F2.b;
import G2.a;
import I2.c;
import I2.d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.o;

/* renamed from: J2.o  reason: case insensitive filesystem */
public final class C0318o extends C0336x0 implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0318o f722c = new C0318o();

    private C0318o() {
        super(a.y(e.f13894a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int j(char[] cArr) {
        o.e(cArr, "<this>");
        return cArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public char[] w() {
        return new char[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void m(c cVar, int i4, C0316n nVar, boolean z3) {
        o.e(cVar, "decoder");
        o.e(nVar, "builder");
        nVar.e(cVar.q(a(), i4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C0316n p(char[] cArr) {
        o.e(cArr, "<this>");
        return new C0316n(cArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void z(d dVar, char[] cArr, int i4) {
        o.e(dVar, "encoder");
        o.e(cArr, "content");
        for (int i5 = 0; i5 < i4; i5++) {
            dVar.w(a(), i5, cArr[i5]);
        }
    }
}
