package l2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class m implements Collection, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f14558a;

    private static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final long[] f14559a;

        /* renamed from: b  reason: collision with root package name */
        private int f14560b;

        public a(long[] jArr) {
            o.e(jArr, "array");
            this.f14559a = jArr;
        }

        public long b() {
            int i4 = this.f14560b;
            long[] jArr = this.f14559a;
            if (i4 < jArr.length) {
                this.f14560b = i4 + 1;
                return l.b(jArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f14560b));
        }

        public boolean hasNext() {
            if (this.f14560b < this.f14559a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return l.a(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ m(long[] jArr) {
        this.f14558a = jArr;
    }

    public static final /* synthetic */ m b(long[] jArr) {
        return new m(jArr);
    }

    public static long[] c(int i4) {
        return d(new long[i4]);
    }

    public static long[] d(long[] jArr) {
        o.e(jArr, "storage");
        return jArr;
    }

    public static boolean f(long[] jArr, long j4) {
        return C0713h.t(jArr, j4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(long[] r4, java.util.Collection r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.e(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x0032
        L_0x0012:
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof l2.l
            if (r2 == 0) goto L_0x0031
            l2.l r0 = (l2.l) r0
            long r2 = r0.f()
            boolean r0 = kotlin.collections.C0713h.t(r4, r2)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.m.g(long[], java.util.Collection):boolean");
    }

    public static boolean h(long[] jArr, Object obj) {
        if ((obj instanceof m) && o.a(jArr, ((m) obj).q())) {
            return true;
        }
        return false;
    }

    public static final long i(long[] jArr, int i4) {
        return l.b(jArr[i4]);
    }

    public static int k(long[] jArr) {
        return jArr.length;
    }

    public static int l(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean m(long[] jArr) {
        if (jArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator n(long[] jArr) {
        return new a(jArr);
    }

    public static final void o(long[] jArr, int i4, long j4) {
        jArr[i4] = j4;
    }

    public static String p(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (!(obj instanceof l)) {
            return false;
        }
        return e(((l) obj).f());
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return g(this.f14558a, collection);
    }

    public boolean e(long j4) {
        return f(this.f14558a, j4);
    }

    public boolean equals(Object obj) {
        return h(this.f14558a, obj);
    }

    public int hashCode() {
        return l(this.f14558a);
    }

    public boolean isEmpty() {
        return m(this.f14558a);
    }

    public Iterator iterator() {
        return n(this.f14558a);
    }

    /* renamed from: j */
    public int size() {
        return k(this.f14558a);
    }

    public final /* synthetic */ long[] q() {
        return this.f14558a;
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
        return p(this.f14558a);
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }
}
