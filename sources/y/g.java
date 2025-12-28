package y;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {

    /* renamed from: d  reason: collision with root package name */
    static Object[] f16442d;

    /* renamed from: e  reason: collision with root package name */
    static int f16443e;

    /* renamed from: f  reason: collision with root package name */
    static Object[] f16444f;

    /* renamed from: g  reason: collision with root package name */
    static int f16445g;

    /* renamed from: a  reason: collision with root package name */
    int[] f16446a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f16447b;

    /* renamed from: c  reason: collision with root package name */
    int f16448c;

    public g() {
        this.f16446a = C0941c.f16411a;
        this.f16447b = C0941c.f16413c;
        this.f16448c = 0;
    }

    private void b(int i4) {
        if (i4 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f16444f;
                    if (objArr != null) {
                        this.f16447b = objArr;
                        f16444f = (Object[]) objArr[0];
                        this.f16446a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16445g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f16442d;
                    if (objArr2 != null) {
                        this.f16447b = objArr2;
                        f16442d = (Object[]) objArr2[0];
                        this.f16446a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16443e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f16446a = new int[i4];
        this.f16447b = new Object[(i4 << 1)];
    }

    private static int c(int[] iArr, int i4, int i5) {
        try {
            return C0941c.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f16445g < 10) {
                        objArr[0] = f16444f;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f16444f = objArr;
                        f16445g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f16443e < 10) {
                        objArr[0] = f16442d;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f16442d = objArr;
                        f16443e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void clear() {
        int i4 = this.f16448c;
        if (i4 > 0) {
            int[] iArr = this.f16446a;
            Object[] objArr = this.f16447b;
            this.f16446a = C0941c.f16411a;
            this.f16447b = C0941c.f16413c;
            this.f16448c = 0;
            e(iArr, objArr, i4);
        }
        if (this.f16448c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (i(obj) >= 0) {
            return true;
        }
        return false;
    }

    public void d(int i4) {
        int i5 = this.f16448c;
        int[] iArr = this.f16446a;
        if (iArr.length < i4) {
            Object[] objArr = this.f16447b;
            b(i4);
            if (this.f16448c > 0) {
                System.arraycopy(iArr, 0, this.f16446a, 0, i5);
                System.arraycopy(objArr, 0, this.f16447b, 0, i5 << 1);
            }
            e(iArr, objArr, i5);
        }
        if (this.f16448c != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f16448c) {
                try {
                    Object j4 = j(i4);
                    Object n4 = n(i4);
                    Object obj2 = gVar.get(j4);
                    if (n4 == null) {
                        if (obj2 != null || !gVar.containsKey(j4)) {
                            return false;
                        }
                    } else if (!n4.equals(obj2)) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i5 = 0;
            while (i5 < this.f16448c) {
                try {
                    Object j5 = j(i5);
                    Object n5 = n(i5);
                    Object obj3 = map.get(j5);
                    if (n5 == null) {
                        if (obj3 != null || !map.containsKey(j5)) {
                            return false;
                        }
                    } else if (!n5.equals(obj3)) {
                        return false;
                    }
                    i5++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int f(Object obj, int i4) {
        int i5 = this.f16448c;
        if (i5 == 0) {
            return -1;
        }
        int c4 = c(this.f16446a, i5, i4);
        if (c4 < 0 || obj.equals(this.f16447b[c4 << 1])) {
            return c4;
        }
        int i6 = c4 + 1;
        while (i6 < i5 && this.f16446a[i6] == i4) {
            if (obj.equals(this.f16447b[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        int i7 = c4 - 1;
        while (i7 >= 0 && this.f16446a[i7] == i4) {
            if (obj.equals(this.f16447b[i7 << 1])) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public int g(Object obj) {
        if (obj == null) {
            return h();
        }
        return f(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int g4 = g(obj);
        if (g4 >= 0) {
            return this.f16447b[(g4 << 1) + 1];
        }
        return obj2;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        int i4 = this.f16448c;
        if (i4 == 0) {
            return -1;
        }
        int c4 = c(this.f16446a, i4, 0);
        if (c4 < 0 || this.f16447b[c4 << 1] == null) {
            return c4;
        }
        int i5 = c4 + 1;
        while (i5 < i4 && this.f16446a[i5] == 0) {
            if (this.f16447b[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        int i6 = c4 - 1;
        while (i6 >= 0 && this.f16446a[i6] == 0) {
            if (this.f16447b[i6 << 1] == null) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public int hashCode() {
        int i4;
        int[] iArr = this.f16446a;
        Object[] objArr = this.f16447b;
        int i5 = this.f16448c;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            int i9 = iArr[i7];
            if (obj == null) {
                i4 = 0;
            } else {
                i4 = obj.hashCode();
            }
            i8 += i4 ^ i9;
            i7++;
            i6 += 2;
        }
        return i8;
    }

    /* access modifiers changed from: package-private */
    public int i(Object obj) {
        int i4 = this.f16448c * 2;
        Object[] objArr = this.f16447b;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f16448c <= 0) {
            return true;
        }
        return false;
    }

    public Object j(int i4) {
        return this.f16447b[i4 << 1];
    }

    public void k(g gVar) {
        int i4 = gVar.f16448c;
        d(this.f16448c + i4);
        if (this.f16448c != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(gVar.j(i5), gVar.n(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(gVar.f16446a, 0, this.f16446a, 0, i4);
            System.arraycopy(gVar.f16447b, 0, this.f16447b, 0, i4 << 1);
            this.f16448c = i4;
        }
    }

    public Object l(int i4) {
        Object[] objArr = this.f16447b;
        int i5 = i4 << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f16448c;
        int i7 = 0;
        if (i6 <= 1) {
            e(this.f16446a, objArr, i6);
            this.f16446a = C0941c.f16411a;
            this.f16447b = C0941c.f16413c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f16446a;
            int i9 = 8;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i10 = i4 + 1;
                    int i11 = i8 - i4;
                    System.arraycopy(iArr, i10, iArr, i4, i11);
                    Object[] objArr2 = this.f16447b;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i5, i11 << 1);
                }
                Object[] objArr3 = this.f16447b;
                int i12 = i8 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            } else {
                if (i6 > 8) {
                    i9 = i6 + (i6 >> 1);
                }
                b(i9);
                if (i6 == this.f16448c) {
                    if (i4 > 0) {
                        System.arraycopy(iArr, 0, this.f16446a, 0, i4);
                        System.arraycopy(objArr, 0, this.f16447b, 0, i5);
                    }
                    if (i4 < i8) {
                        int i13 = i4 + 1;
                        int i14 = i8 - i4;
                        System.arraycopy(iArr, i13, this.f16446a, i4, i14);
                        System.arraycopy(objArr, i13 << 1, this.f16447b, i5, i14 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i7 = i8;
        }
        if (i6 == this.f16448c) {
            this.f16448c = i7;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object m(int i4, Object obj) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f16447b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object n(int i4) {
        return this.f16447b[(i4 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i4;
        int i5;
        int i6 = this.f16448c;
        if (obj == null) {
            i5 = h();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            i5 = f(obj, hashCode);
        }
        if (i5 >= 0) {
            int i7 = (i5 << 1) + 1;
            Object[] objArr = this.f16447b;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~i5;
        int[] iArr = this.f16446a;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.f16447b;
            b(i9);
            if (i6 == this.f16448c) {
                int[] iArr2 = this.f16446a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f16447b, 0, objArr2.length);
                }
                e(iArr, objArr2, i6);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr3 = this.f16446a;
            int i10 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i10, i6 - i8);
            Object[] objArr3 = this.f16447b;
            System.arraycopy(objArr3, i8 << 1, objArr3, i10 << 1, (this.f16448c - i8) << 1);
        }
        int i11 = this.f16448c;
        if (i6 == i11) {
            int[] iArr4 = this.f16446a;
            if (i8 < iArr4.length) {
                iArr4[i8] = i4;
                Object[] objArr4 = this.f16447b;
                int i12 = i8 << 1;
                objArr4[i12] = obj;
                objArr4[i12 + 1] = obj2;
                this.f16448c = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int g4 = g(obj);
        if (g4 >= 0) {
            return l(g4);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int g4 = g(obj);
        if (g4 >= 0) {
            return m(g4, obj2);
        }
        return null;
    }

    public int size() {
        return this.f16448c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16448c * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f16448c; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object j4 = j(i4);
            if (j4 != this) {
                sb.append(j4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object n4 = n(i4);
            if (n4 != this) {
                sb.append(n4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g4 = g(obj);
        if (g4 < 0) {
            return false;
        }
        Object n4 = n(g4);
        if (obj2 != n4 && (obj2 == null || !obj2.equals(n4))) {
            return false;
        }
        l(g4);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int g4 = g(obj);
        if (g4 < 0) {
            return false;
        }
        Object n4 = n(g4);
        if (n4 != obj2 && (obj2 == null || !obj2.equals(n4))) {
            return false;
        }
        m(g4, obj3);
        return true;
    }

    public g(int i4) {
        if (i4 == 0) {
            this.f16446a = C0941c.f16411a;
            this.f16447b = C0941c.f16413c;
        } else {
            b(i4);
        }
        this.f16448c = 0;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            k(gVar);
        }
    }
}
