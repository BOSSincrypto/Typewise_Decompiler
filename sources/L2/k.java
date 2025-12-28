package l2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class k implements Collection, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f14553a;

    private static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f14554a;

        /* renamed from: b  reason: collision with root package name */
        private int f14555b;

        public a(int[] iArr) {
            o.e(iArr, "array");
            this.f14554a = iArr;
        }

        public int b() {
            int i4 = this.f14555b;
            int[] iArr = this.f14554a;
            if (i4 < iArr.length) {
                this.f14555b = i4 + 1;
                return j.b(iArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f14555b));
        }

        public boolean hasNext() {
            if (this.f14555b < this.f14554a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return j.a(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ k(int[] iArr) {
        this.f14553a = iArr;
    }

    public static final /* synthetic */ k b(int[] iArr) {
        return new k(iArr);
    }

    public static int[] c(int i4) {
        return d(new int[i4]);
    }

    public static int[] d(int[] iArr) {
        o.e(iArr, "storage");
        return iArr;
    }

    public static boolean f(int[] iArr, int i4) {
        return C0713h.s(iArr, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(int[] r3, java.util.Collection r4) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.e(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r4 = r4.iterator()
        L_0x0016:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r4.next()
            boolean r2 = r0 instanceof l2.j
            if (r2 == 0) goto L_0x0031
            l2.j r0 = (l2.j) r0
            int r0 = r0.f()
            boolean r0 = kotlin.collections.C0713h.s(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.k.g(int[], java.util.Collection):boolean");
    }

    public static boolean h(int[] iArr, Object obj) {
        if ((obj instanceof k) && o.a(iArr, ((k) obj).q())) {
            return true;
        }
        return false;
    }

    public static final int i(int[] iArr, int i4) {
        return j.b(iArr[i4]);
    }

    public static int k(int[] iArr) {
        return iArr.length;
    }

    public static int l(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean m(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator n(int[] iArr) {
        return new a(iArr);
    }

    public static final void o(int[] iArr, int i4, int i5) {
        iArr[i4] = i5;
    }

    public static String p(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return e(((j) obj).f());
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return g(this.f14553a, collection);
    }

    public boolean e(int i4) {
        return f(this.f14553a, i4);
    }

    public boolean equals(Object obj) {
        return h(this.f14553a, obj);
    }

    public int hashCode() {
        return l(this.f14553a);
    }

    public boolean isEmpty() {
        return m(this.f14553a);
    }

    public Iterator iterator() {
        return n(this.f14553a);
    }

    /* renamed from: j */
    public int size() {
        return k(this.f14553a);
    }

    public final /* synthetic */ int[] q() {
        return this.f14553a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public String toString() {
        return p(this.f14553a);
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }
}
