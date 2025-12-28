package l2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class p implements Collection, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final short[] f14564a;

    private static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final short[] f14565a;

        /* renamed from: b  reason: collision with root package name */
        private int f14566b;

        public a(short[] sArr) {
            o.e(sArr, "array");
            this.f14565a = sArr;
        }

        public short b() {
            int i4 = this.f14566b;
            short[] sArr = this.f14565a;
            if (i4 < sArr.length) {
                this.f14566b = i4 + 1;
                return o.b(sArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f14566b));
        }

        public boolean hasNext() {
            if (this.f14566b < this.f14565a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return o.a(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ p(short[] sArr) {
        this.f14564a = sArr;
    }

    public static final /* synthetic */ p b(short[] sArr) {
        return new p(sArr);
    }

    public static short[] c(int i4) {
        return d(new short[i4]);
    }

    public static short[] d(short[] sArr) {
        o.e(sArr, "storage");
        return sArr;
    }

    public static boolean f(short[] sArr, short s4) {
        return C0713h.v(sArr, s4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(short[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof l2.o
            if (r2 == 0) goto L_0x0031
            l2.o r0 = (l2.o) r0
            short r0 = r0.f()
            boolean r0 = kotlin.collections.C0713h.v(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.p.g(short[], java.util.Collection):boolean");
    }

    public static boolean h(short[] sArr, Object obj) {
        if ((obj instanceof p) && o.a(sArr, ((p) obj).q())) {
            return true;
        }
        return false;
    }

    public static final short i(short[] sArr, int i4) {
        return o.b(sArr[i4]);
    }

    public static int k(short[] sArr) {
        return sArr.length;
    }

    public static int l(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean m(short[] sArr) {
        if (sArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator n(short[] sArr) {
        return new a(sArr);
    }

    public static final void o(short[] sArr, int i4, short s4) {
        sArr[i4] = s4;
    }

    public static String p(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (!(obj instanceof o)) {
            return false;
        }
        return e(((o) obj).f());
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return g(this.f14564a, collection);
    }

    public boolean e(short s4) {
        return f(this.f14564a, s4);
    }

    public boolean equals(Object obj) {
        return h(this.f14564a, obj);
    }

    public int hashCode() {
        return l(this.f14564a);
    }

    public boolean isEmpty() {
        return m(this.f14564a);
    }

    public Iterator iterator() {
        return n(this.f14564a);
    }

    /* renamed from: j */
    public int size() {
        return k(this.f14564a);
    }

    public final /* synthetic */ short[] q() {
        return this.f14564a;
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
        return p(this.f14564a);
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }
}
