package y;

/* renamed from: y.d  reason: case insensitive filesystem */
public class C0942d implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f16414e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f16415a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f16416b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f16417c;

    /* renamed from: d  reason: collision with root package name */
    private int f16418d;

    public C0942d() {
        this(10);
    }

    private void g() {
        int i4 = this.f16418d;
        long[] jArr = this.f16416b;
        Object[] objArr = this.f16417c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f16414e) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f16415a = false;
        this.f16418d = i5;
    }

    public void b(long j4, Object obj) {
        int i4 = this.f16418d;
        if (i4 == 0 || j4 > this.f16416b[i4 - 1]) {
            if (this.f16415a && i4 >= this.f16416b.length) {
                g();
            }
            int i5 = this.f16418d;
            if (i5 >= this.f16416b.length) {
                int f4 = C0941c.f(i5 + 1);
                long[] jArr = new long[f4];
                Object[] objArr = new Object[f4];
                long[] jArr2 = this.f16416b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f16417c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f16416b = jArr;
                this.f16417c = objArr;
            }
            this.f16416b[i5] = j4;
            this.f16417c[i5] = obj;
            this.f16418d = i5 + 1;
            return;
        }
        n(j4, obj);
    }

    public void c() {
        int i4 = this.f16418d;
        Object[] objArr = this.f16417c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f16418d = 0;
        this.f16415a = false;
    }

    /* renamed from: d */
    public C0942d clone() {
        try {
            C0942d dVar = (C0942d) super.clone();
            dVar.f16416b = (long[]) this.f16416b.clone();
            dVar.f16417c = (Object[]) this.f16417c.clone();
            return dVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public Object i(long j4) {
        return j(j4, (Object) null);
    }

    public Object j(long j4, Object obj) {
        Object obj2;
        int b4 = C0941c.b(this.f16416b, this.f16418d, j4);
        if (b4 < 0 || (obj2 = this.f16417c[b4]) == f16414e) {
            return obj;
        }
        return obj2;
    }

    public int k(long j4) {
        if (this.f16415a) {
            g();
        }
        return C0941c.b(this.f16416b, this.f16418d, j4);
    }

    public long l(int i4) {
        if (this.f16415a) {
            g();
        }
        return this.f16416b[i4];
    }

    public void n(long j4, Object obj) {
        int b4 = C0941c.b(this.f16416b, this.f16418d, j4);
        if (b4 >= 0) {
            this.f16417c[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f16418d;
        if (i4 < i5) {
            Object[] objArr = this.f16417c;
            if (objArr[i4] == f16414e) {
                this.f16416b[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f16415a && i5 >= this.f16416b.length) {
            g();
            i4 = ~C0941c.b(this.f16416b, this.f16418d, j4);
        }
        int i6 = this.f16418d;
        if (i6 >= this.f16416b.length) {
            int f4 = C0941c.f(i6 + 1);
            long[] jArr = new long[f4];
            Object[] objArr2 = new Object[f4];
            long[] jArr2 = this.f16416b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f16417c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16416b = jArr;
            this.f16417c = objArr2;
        }
        int i7 = this.f16418d;
        if (i7 - i4 != 0) {
            long[] jArr3 = this.f16416b;
            int i8 = i4 + 1;
            System.arraycopy(jArr3, i4, jArr3, i8, i7 - i4);
            Object[] objArr4 = this.f16417c;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f16418d - i4);
        }
        this.f16416b[i4] = j4;
        this.f16417c[i4] = obj;
        this.f16418d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f16417c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f16416b
            int r1 = r2.f16418d
            int r3 = y.C0941c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f16417c
            r0 = r4[r3]
            java.lang.Object r1 = f16414e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f16415a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C0942d.o(long):void");
    }

    public void p(int i4) {
        Object[] objArr = this.f16417c;
        Object obj = objArr[i4];
        Object obj2 = f16414e;
        if (obj != obj2) {
            objArr[i4] = obj2;
            this.f16415a = true;
        }
    }

    public int q() {
        if (this.f16415a) {
            g();
        }
        return this.f16418d;
    }

    public Object r(int i4) {
        if (this.f16415a) {
            g();
        }
        return this.f16417c[i4];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16418d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f16418d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(l(i4));
            sb.append('=');
            Object r4 = r(i4);
            if (r4 != this) {
                sb.append(r4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0942d(int i4) {
        this.f16415a = false;
        if (i4 == 0) {
            this.f16416b = C0941c.f16412b;
            this.f16417c = C0941c.f16413c;
            return;
        }
        int f4 = C0941c.f(i4);
        this.f16416b = new long[f4];
        this.f16417c = new Object[f4];
    }
}
