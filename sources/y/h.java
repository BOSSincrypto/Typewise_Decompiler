package y;

public class h implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f16449e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f16450a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f16451b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f16452c;

    /* renamed from: d  reason: collision with root package name */
    private int f16453d;

    public h() {
        this(10);
    }

    private void g() {
        int i4 = this.f16453d;
        int[] iArr = this.f16451b;
        Object[] objArr = this.f16452c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f16449e) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f16450a = false;
        this.f16453d = i5;
    }

    public void b(int i4, Object obj) {
        int i5 = this.f16453d;
        if (i5 == 0 || i4 > this.f16451b[i5 - 1]) {
            if (this.f16450a && i5 >= this.f16451b.length) {
                g();
            }
            int i6 = this.f16453d;
            if (i6 >= this.f16451b.length) {
                int e4 = C0941c.e(i6 + 1);
                int[] iArr = new int[e4];
                Object[] objArr = new Object[e4];
                int[] iArr2 = this.f16451b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f16452c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f16451b = iArr;
                this.f16452c = objArr;
            }
            this.f16451b[i6] = i4;
            this.f16452c[i6] = obj;
            this.f16453d = i6 + 1;
            return;
        }
        n(i4, obj);
    }

    public void c() {
        int i4 = this.f16453d;
        Object[] objArr = this.f16452c;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f16453d = 0;
        this.f16450a = false;
    }

    /* renamed from: d */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f16451b = (int[]) this.f16451b.clone();
            hVar.f16452c = (Object[]) this.f16452c.clone();
            return hVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public Object i(int i4) {
        return j(i4, (Object) null);
    }

    public Object j(int i4, Object obj) {
        Object obj2;
        int a4 = C0941c.a(this.f16451b, this.f16453d, i4);
        if (a4 < 0 || (obj2 = this.f16452c[a4]) == f16449e) {
            return obj;
        }
        return obj2;
    }

    public int k(Object obj) {
        if (this.f16450a) {
            g();
        }
        for (int i4 = 0; i4 < this.f16453d; i4++) {
            if (this.f16452c[i4] == obj) {
                return i4;
            }
        }
        return -1;
    }

    public int l(int i4) {
        if (this.f16450a) {
            g();
        }
        return this.f16451b[i4];
    }

    public void n(int i4, Object obj) {
        int a4 = C0941c.a(this.f16451b, this.f16453d, i4);
        if (a4 >= 0) {
            this.f16452c[a4] = obj;
            return;
        }
        int i5 = ~a4;
        int i6 = this.f16453d;
        if (i5 < i6) {
            Object[] objArr = this.f16452c;
            if (objArr[i5] == f16449e) {
                this.f16451b[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f16450a && i6 >= this.f16451b.length) {
            g();
            i5 = ~C0941c.a(this.f16451b, this.f16453d, i4);
        }
        int i7 = this.f16453d;
        if (i7 >= this.f16451b.length) {
            int e4 = C0941c.e(i7 + 1);
            int[] iArr = new int[e4];
            Object[] objArr2 = new Object[e4];
            int[] iArr2 = this.f16451b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f16452c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f16451b = iArr;
            this.f16452c = objArr2;
        }
        int i8 = this.f16453d;
        if (i8 - i5 != 0) {
            int[] iArr3 = this.f16451b;
            int i9 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i9, i8 - i5);
            Object[] objArr4 = this.f16452c;
            System.arraycopy(objArr4, i5, objArr4, i9, this.f16453d - i5);
        }
        this.f16451b[i5] = i4;
        this.f16452c[i5] = obj;
        this.f16453d++;
    }

    public int o() {
        if (this.f16450a) {
            g();
        }
        return this.f16453d;
    }

    public Object p(int i4) {
        if (this.f16450a) {
            g();
        }
        return this.f16452c[i4];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16453d * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f16453d; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(l(i4));
            sb.append('=');
            Object p4 = p(i4);
            if (p4 != this) {
                sb.append(p4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i4) {
        this.f16450a = false;
        if (i4 == 0) {
            this.f16451b = C0941c.f16411a;
            this.f16452c = C0941c.f16413c;
            return;
        }
        int e4 = C0941c.e(i4);
        this.f16451b = new int[e4];
        this.f16452c = new Object[e4];
    }
}
