package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;
import z2.d;

final class K extends C0707b implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f13822a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f13823b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f13824c;

    /* renamed from: d  reason: collision with root package name */
    private int f13825d;

    public static final class a extends C0706a {

        /* renamed from: c  reason: collision with root package name */
        private int f13826c;

        /* renamed from: d  reason: collision with root package name */
        private int f13827d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f13828e;

        a(K k4) {
            this.f13828e = k4;
            this.f13826c = k4.size();
            this.f13827d = k4.f13824c;
        }

        /* access modifiers changed from: protected */
        public void b() {
            if (this.f13826c == 0) {
                c();
                return;
            }
            d(this.f13828e.f13822a[this.f13827d]);
            this.f13827d = (this.f13827d + 1) % this.f13828e.f13823b;
            this.f13826c--;
        }
    }

    public K(Object[] objArr, int i4) {
        o.e(objArr, "buffer");
        this.f13822a = objArr;
        if (i4 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i4).toString());
        } else if (i4 <= objArr.length) {
            this.f13823b = objArr.length;
            this.f13825d = i4;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i4 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public final void e(Object obj) {
        if (!g()) {
            this.f13822a[(this.f13824c + size()) % this.f13823b] = obj;
            this.f13825d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final K f(int i4) {
        Object[] objArr;
        int i5 = this.f13823b;
        int d4 = d.d(i5 + (i5 >> 1) + 1, i4);
        if (this.f13824c == 0) {
            objArr = Arrays.copyOf(this.f13822a, d4);
            o.d(objArr, "copyOf(...)");
        } else {
            objArr = toArray(new Object[d4]);
        }
        return new K(objArr, size());
    }

    public final boolean g() {
        if (size() == this.f13823b) {
            return true;
        }
        return false;
    }

    public Object get(int i4) {
        C0707b.Companion.b(i4, size());
        return this.f13822a[(this.f13824c + i4) % this.f13823b];
    }

    public int getSize() {
        return this.f13825d;
    }

    public final void h(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i4).toString());
        } else if (i4 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i4 + ", size = " + size()).toString());
        } else if (i4 > 0) {
            int i5 = this.f13824c;
            int c4 = (i5 + i4) % this.f13823b;
            if (i5 > c4) {
                C0713h.j(this.f13822a, (Object) null, i5, this.f13823b);
                C0713h.j(this.f13822a, (Object) null, 0, c4);
            } else {
                C0713h.j(this.f13822a, (Object) null, i5, c4);
            }
            this.f13824c = c4;
            this.f13825d = size() - i4;
        }
    }

    public Iterator iterator() {
        return new a(this);
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            o.d(objArr, "copyOf(...)");
        }
        int size = size();
        int i4 = this.f13824c;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size && i4 < this.f13823b) {
            objArr[i6] = this.f13822a[i4];
            i6++;
            i4++;
        }
        while (i6 < size) {
            objArr[i6] = this.f13822a[i5];
            i6++;
            i5++;
        }
        return C0718m.f(size, objArr);
    }

    public K(int i4) {
        this(new Object[i4], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
