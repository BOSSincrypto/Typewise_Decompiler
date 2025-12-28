package l2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class i implements Collection, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f14548a;

    private static final class a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f14549a;

        /* renamed from: b  reason: collision with root package name */
        private int f14550b;

        public a(byte[] bArr) {
            o.e(bArr, "array");
            this.f14549a = bArr;
        }

        public byte b() {
            int i4 = this.f14550b;
            byte[] bArr = this.f14549a;
            if (i4 < bArr.length) {
                this.f14550b = i4 + 1;
                return h.b(bArr[i4]);
            }
            throw new NoSuchElementException(String.valueOf(this.f14550b));
        }

        public boolean hasNext() {
            if (this.f14550b < this.f14549a.length) {
                return true;
            }
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return h.a(b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ i(byte[] bArr) {
        this.f14548a = bArr;
    }

    public static final /* synthetic */ i b(byte[] bArr) {
        return new i(bArr);
    }

    public static byte[] c(int i4) {
        return d(new byte[i4]);
    }

    public static byte[] d(byte[] bArr) {
        o.e(bArr, "storage");
        return bArr;
    }

    public static boolean f(byte[] bArr, byte b4) {
        return C0713h.q(bArr, b4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(byte[] r3, java.util.Collection r4) {
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
            boolean r2 = r0 instanceof l2.h
            if (r2 == 0) goto L_0x0031
            l2.h r0 = (l2.h) r0
            byte r0 = r0.f()
            boolean r0 = kotlin.collections.C0713h.q(r3, r0)
            if (r0 == 0) goto L_0x0031
            goto L_0x0016
        L_0x0031:
            r1 = 0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i.g(byte[], java.util.Collection):boolean");
    }

    public static boolean h(byte[] bArr, Object obj) {
        if ((obj instanceof i) && o.a(bArr, ((i) obj).q())) {
            return true;
        }
        return false;
    }

    public static final byte i(byte[] bArr, int i4) {
        return h.b(bArr[i4]);
    }

    public static int k(byte[] bArr) {
        return bArr.length;
    }

    public static int l(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean m(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator n(byte[] bArr) {
        return new a(bArr);
    }

    public static final void o(byte[] bArr, int i4, byte b4) {
        bArr[i4] = b4;
    }

    public static String p(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (!(obj instanceof h)) {
            return false;
        }
        return e(((h) obj).f());
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return g(this.f14548a, collection);
    }

    public boolean e(byte b4) {
        return f(this.f14548a, b4);
    }

    public boolean equals(Object obj) {
        return h(this.f14548a, obj);
    }

    public int hashCode() {
        return l(this.f14548a);
    }

    public boolean isEmpty() {
        return m(this.f14548a);
    }

    public Iterator iterator() {
        return n(this.f14548a);
    }

    /* renamed from: j */
    public int size() {
        return k(this.f14548a);
    }

    public final /* synthetic */ byte[] q() {
        return this.f14548a;
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
        return p(this.f14548a);
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }
}
