package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: y.b  reason: case insensitive filesystem */
public final class C0940b implements Collection, Set {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f16400e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f16401f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    private static Object[] f16402g;

    /* renamed from: h  reason: collision with root package name */
    private static int f16403h;

    /* renamed from: i  reason: collision with root package name */
    private static Object[] f16404i;

    /* renamed from: j  reason: collision with root package name */
    private static int f16405j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f16406a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f16407b;

    /* renamed from: c  reason: collision with root package name */
    int f16408c;

    /* renamed from: d  reason: collision with root package name */
    private f f16409d;

    /* renamed from: y.b$a */
    class a extends f {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            C0940b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i4, int i5) {
            return C0940b.this.f16407b[i4];
        }

        /* access modifiers changed from: protected */
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return C0940b.this.f16408c;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return C0940b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return C0940b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(Object obj, Object obj2) {
            C0940b.this.add(obj);
        }

        /* access modifiers changed from: protected */
        public void h(int i4) {
            C0940b.this.g(i4);
        }

        /* access modifiers changed from: protected */
        public Object i(int i4, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0940b() {
        this(0);
    }

    private void a(int i4) {
        if (i4 == 8) {
            synchronized (C0940b.class) {
                try {
                    Object[] objArr = f16404i;
                    if (objArr != null) {
                        this.f16407b = objArr;
                        f16404i = (Object[]) objArr[0];
                        this.f16406a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16405j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i4 == 4) {
            synchronized (C0940b.class) {
                try {
                    Object[] objArr2 = f16402g;
                    if (objArr2 != null) {
                        this.f16407b = objArr2;
                        f16402g = (Object[]) objArr2[0];
                        this.f16406a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16403h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f16406a = new int[i4];
        this.f16407b = new Object[i4];
    }

    private static void c(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (C0940b.class) {
                try {
                    if (f16405j < 10) {
                        objArr[0] = f16404i;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f16404i = objArr;
                        f16405j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0940b.class) {
                try {
                    if (f16403h < 10) {
                        objArr[0] = f16402g;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f16402g = objArr;
                        f16403h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private f d() {
        if (this.f16409d == null) {
            this.f16409d = new a();
        }
        return this.f16409d;
    }

    private int e(Object obj, int i4) {
        int i5 = this.f16408c;
        if (i5 == 0) {
            return -1;
        }
        int a4 = C0941c.a(this.f16406a, i5, i4);
        if (a4 < 0 || obj.equals(this.f16407b[a4])) {
            return a4;
        }
        int i6 = a4 + 1;
        while (i6 < i5 && this.f16406a[i6] == i4) {
            if (obj.equals(this.f16407b[i6])) {
                return i6;
            }
            i6++;
        }
        int i7 = a4 - 1;
        while (i7 >= 0 && this.f16406a[i7] == i4) {
            if (obj.equals(this.f16407b[i7])) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    private int f() {
        int i4 = this.f16408c;
        if (i4 == 0) {
            return -1;
        }
        int a4 = C0941c.a(this.f16406a, i4, 0);
        if (a4 < 0 || this.f16407b[a4] == null) {
            return a4;
        }
        int i5 = a4 + 1;
        while (i5 < i4 && this.f16406a[i5] == 0) {
            if (this.f16407b[i5] == null) {
                return i5;
            }
            i5++;
        }
        int i6 = a4 - 1;
        while (i6 >= 0 && this.f16406a[i6] == 0) {
            if (this.f16407b[i6] == null) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public boolean add(Object obj) {
        int i4;
        int i5;
        if (obj == null) {
            i5 = f();
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            i5 = e(obj, hashCode);
        }
        if (i5 >= 0) {
            return false;
        }
        int i6 = ~i5;
        int i7 = this.f16408c;
        int[] iArr = this.f16406a;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f16407b;
            a(i8);
            int[] iArr2 = this.f16406a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16407b, 0, objArr.length);
            }
            c(iArr, objArr, this.f16408c);
        }
        int i9 = this.f16408c;
        if (i6 < i9) {
            int[] iArr3 = this.f16406a;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f16407b;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f16408c - i6);
        }
        this.f16406a[i6] = i4;
        this.f16407b[i6] = obj;
        this.f16408c++;
        return true;
    }

    public boolean addAll(Collection collection) {
        b(this.f16408c + collection.size());
        boolean z3 = false;
        for (Object add : collection) {
            z3 |= add(add);
        }
        return z3;
    }

    public void b(int i4) {
        int[] iArr = this.f16406a;
        if (iArr.length < i4) {
            Object[] objArr = this.f16407b;
            a(i4);
            int i5 = this.f16408c;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f16406a, 0, i5);
                System.arraycopy(objArr, 0, this.f16407b, 0, this.f16408c);
            }
            c(iArr, objArr, this.f16408c);
        }
    }

    public void clear() {
        int i4 = this.f16408c;
        if (i4 != 0) {
            c(this.f16406a, this.f16407b, i4);
            this.f16406a = f16400e;
            this.f16407b = f16401f;
            this.f16408c = 0;
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f16408c) {
                try {
                    if (!set.contains(h(i4))) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public Object g(int i4) {
        Object[] objArr = this.f16407b;
        Object obj = objArr[i4];
        int i5 = this.f16408c;
        if (i5 <= 1) {
            c(this.f16406a, objArr, i5);
            this.f16406a = f16400e;
            this.f16407b = f16401f;
            this.f16408c = 0;
        } else {
            int[] iArr = this.f16406a;
            int i6 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                int i7 = i5 - 1;
                this.f16408c = i7;
                if (i4 < i7) {
                    int i8 = i4 + 1;
                    System.arraycopy(iArr, i8, iArr, i4, i7 - i4);
                    Object[] objArr2 = this.f16407b;
                    System.arraycopy(objArr2, i8, objArr2, i4, this.f16408c - i4);
                }
                this.f16407b[this.f16408c] = null;
            } else {
                if (i5 > 8) {
                    i6 = i5 + (i5 >> 1);
                }
                a(i6);
                this.f16408c--;
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f16406a, 0, i4);
                    System.arraycopy(objArr, 0, this.f16407b, 0, i4);
                }
                int i9 = this.f16408c;
                if (i4 < i9) {
                    int i10 = i4 + 1;
                    System.arraycopy(iArr, i10, this.f16406a, i4, i9 - i4);
                    System.arraycopy(objArr, i10, this.f16407b, i4, this.f16408c - i4);
                }
            }
        }
        return obj;
    }

    public Object h(int i4) {
        return this.f16407b[i4];
    }

    public int hashCode() {
        int[] iArr = this.f16406a;
        int i4 = this.f16408c;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return f();
        }
        return e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        if (this.f16408c <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z3 = false;
        for (Object remove : collection) {
            z3 |= remove(remove);
        }
        return z3;
    }

    public boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i4 = this.f16408c - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f16407b[i4])) {
                g(i4);
                z3 = true;
            }
        }
        return z3;
    }

    public int size() {
        return this.f16408c;
    }

    public Object[] toArray() {
        int i4 = this.f16408c;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f16407b, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16408c * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f16408c; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object h4 = h(i4);
            if (h4 != this) {
                sb.append(h4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0940b(int i4) {
        if (i4 == 0) {
            this.f16406a = f16400e;
            this.f16407b = f16401f;
        } else {
            a(i4);
        }
        this.f16408c = 0;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f16408c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f16408c);
        }
        System.arraycopy(this.f16407b, 0, objArr, 0, this.f16408c);
        int length = objArr.length;
        int i4 = this.f16408c;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
