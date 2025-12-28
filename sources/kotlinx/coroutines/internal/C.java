package kotlinx.coroutines.internal;

import java.util.Arrays;
import kotlin.jvm.internal.o;

public abstract class C {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a  reason: collision with root package name */
    private D[] f14143a;

    private final D[] f() {
        D[] dArr = this.f14143a;
        if (dArr == null) {
            D[] dArr2 = new D[4];
            this.f14143a = dArr2;
            return dArr2;
        } else if (c() < dArr.length) {
            return dArr;
        } else {
            Object[] copyOf = Arrays.copyOf(dArr, c() * 2);
            o.d(copyOf, "copyOf(this, newSize)");
            D[] dArr3 = (D[]) copyOf;
            this.f14143a = dArr3;
            return dArr3;
        }
    }

    private final void j(int i4) {
        this._size = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.internal.D[] r2 = r5.f14143a
            kotlin.jvm.internal.o.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L_0x002b
            r3 = r2[r0]
            kotlin.jvm.internal.o.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.o.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r1 = r2[r6]
            kotlin.jvm.internal.o.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.o.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L_0x003f
            return
        L_0x003f:
            r5.m(r6, r0)
            r6 = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C.k(int):void");
    }

    private final void l(int i4) {
        while (i4 > 0) {
            D[] dArr = this.f14143a;
            o.b(dArr);
            int i5 = (i4 - 1) / 2;
            D d4 = dArr[i5];
            o.b(d4);
            D d5 = dArr[i4];
            o.b(d5);
            if (((Comparable) d4).compareTo(d5) > 0) {
                m(i4, i5);
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private final void m(int i4, int i5) {
        D[] dArr = this.f14143a;
        o.b(dArr);
        D d4 = dArr[i5];
        o.b(d4);
        D d5 = dArr[i4];
        o.b(d5);
        dArr[i4] = d4;
        dArr[i5] = d5;
        d4.a(i4);
        d5.a(i5);
    }

    public final void a(D d4) {
        d4.b(this);
        D[] f4 = f();
        int c4 = c();
        j(c4 + 1);
        f4[c4] = d4;
        d4.a(c4);
        l(c4);
    }

    public final D b() {
        D[] dArr = this.f14143a;
        if (dArr != null) {
            return dArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final D e() {
        D b4;
        synchronized (this) {
            b4 = b();
        }
        return b4;
    }

    public final boolean g(D d4) {
        boolean z3;
        synchronized (this) {
            if (d4.e() == null) {
                z3 = false;
            } else {
                h(d4.c());
                z3 = true;
            }
        }
        return z3;
    }

    public final D h(int i4) {
        D[] dArr = this.f14143a;
        o.b(dArr);
        j(c() - 1);
        if (i4 < c()) {
            m(i4, c());
            int i5 = (i4 - 1) / 2;
            if (i4 > 0) {
                D d4 = dArr[i4];
                o.b(d4);
                D d5 = dArr[i5];
                o.b(d5);
                if (((Comparable) d4).compareTo(d5) < 0) {
                    m(i4, i5);
                    l(i5);
                }
            }
            k(i4);
        }
        D d6 = dArr[c()];
        o.b(d6);
        d6.b((C) null);
        d6.a(-1);
        dArr[c()] = null;
        return d6;
    }

    public final D i() {
        D d4;
        synchronized (this) {
            if (c() > 0) {
                d4 = h(0);
            } else {
                d4 = null;
            }
        }
        return d4;
    }
}
