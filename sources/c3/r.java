package c3;

import kotlin.collections.C0713h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class r {

    /* renamed from: h  reason: collision with root package name */
    public static final a f7682h = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7683a;

    /* renamed from: b  reason: collision with root package name */
    public int f7684b;

    /* renamed from: c  reason: collision with root package name */
    public int f7685c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7686d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7687e;

    /* renamed from: f  reason: collision with root package name */
    public r f7688f;

    /* renamed from: g  reason: collision with root package name */
    public r f7689g;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public r() {
        this.f7683a = new byte[8192];
        this.f7687e = true;
        this.f7686d = false;
    }

    public final void a() {
        int i4;
        r rVar = this.f7689g;
        if (rVar != this) {
            o.b(rVar);
            if (rVar.f7687e) {
                int i5 = this.f7685c - this.f7684b;
                r rVar2 = this.f7689g;
                o.b(rVar2);
                int i6 = 8192 - rVar2.f7685c;
                r rVar3 = this.f7689g;
                o.b(rVar3);
                if (rVar3.f7686d) {
                    i4 = 0;
                } else {
                    r rVar4 = this.f7689g;
                    o.b(rVar4);
                    i4 = rVar4.f7684b;
                }
                if (i5 <= i6 + i4) {
                    r rVar5 = this.f7689g;
                    o.b(rVar5);
                    f(rVar5, i5);
                    b();
                    t.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final r b() {
        r rVar = this.f7688f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f7689g;
        o.b(rVar2);
        rVar2.f7688f = this.f7688f;
        r rVar3 = this.f7688f;
        o.b(rVar3);
        rVar3.f7689g = this.f7689g;
        this.f7688f = null;
        this.f7689g = null;
        return rVar;
    }

    public final r c(r rVar) {
        o.e(rVar, "segment");
        rVar.f7689g = this;
        rVar.f7688f = this.f7688f;
        r rVar2 = this.f7688f;
        o.b(rVar2);
        rVar2.f7689g = rVar;
        this.f7688f = rVar;
        return rVar;
    }

    public final r d() {
        this.f7686d = true;
        return new r(this.f7683a, this.f7684b, this.f7685c, true, false);
    }

    public final r e(int i4) {
        r rVar;
        if (i4 <= 0 || i4 > this.f7685c - this.f7684b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i4 >= 1024) {
            rVar = d();
        } else {
            rVar = t.c();
            byte[] bArr = this.f7683a;
            byte[] bArr2 = rVar.f7683a;
            int i5 = this.f7684b;
            C0713h.f(bArr, bArr2, 0, i5, i5 + i4, 2, (Object) null);
        }
        rVar.f7685c = rVar.f7684b + i4;
        this.f7684b += i4;
        r rVar2 = this.f7689g;
        o.b(rVar2);
        rVar2.c(rVar);
        return rVar;
    }

    public final void f(r rVar, int i4) {
        o.e(rVar, "sink");
        if (rVar.f7687e) {
            int i5 = rVar.f7685c;
            if (i5 + i4 > 8192) {
                if (!rVar.f7686d) {
                    int i6 = rVar.f7684b;
                    if ((i5 + i4) - i6 <= 8192) {
                        byte[] bArr = rVar.f7683a;
                        C0713h.f(bArr, bArr, 0, i6, i5, 2, (Object) null);
                        rVar.f7685c -= rVar.f7684b;
                        rVar.f7684b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f7683a;
            byte[] bArr3 = rVar.f7683a;
            int i7 = rVar.f7685c;
            int i8 = this.f7684b;
            C0713h.d(bArr2, bArr3, i7, i8, i8 + i4);
            rVar.f7685c += i4;
            this.f7684b += i4;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public r(byte[] bArr, int i4, int i5, boolean z3, boolean z4) {
        o.e(bArr, "data");
        this.f7683a = bArr;
        this.f7684b = i4;
        this.f7685c = i5;
        this.f7686d = z3;
        this.f7687e = z4;
    }
}
