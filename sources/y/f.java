package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    b f16427a;

    /* renamed from: b  reason: collision with root package name */
    c f16428b;

    /* renamed from: c  reason: collision with root package name */
    e f16429c;

    final class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final int f16430a;

        /* renamed from: b  reason: collision with root package name */
        int f16431b;

        /* renamed from: c  reason: collision with root package name */
        int f16432c;

        /* renamed from: d  reason: collision with root package name */
        boolean f16433d = false;

        a(int i4) {
            this.f16430a = i4;
            this.f16431b = f.this.d();
        }

        public boolean hasNext() {
            if (this.f16432c < this.f16431b) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                Object b4 = f.this.b(this.f16432c, this.f16430a);
                this.f16432c++;
                this.f16433d = true;
                return b4;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f16433d) {
                int i4 = this.f16432c - 1;
                this.f16432c = i4;
                this.f16431b--;
                this.f16433d = false;
                f.this.h(i4);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set {
        b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            int d4 = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            if (d4 != f.this.d()) {
                return true;
            }
            return false;
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e4 = f.this.e(entry.getKey());
            if (e4 < 0) {
                return false;
            }
            return C0941c.c(f.this.b(e4, 1), entry.getValue());
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
            return f.k(this, obj);
        }

        public int hashCode() {
            int i4;
            int i5;
            int i6 = 0;
            for (int d4 = f.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = f.this.b(d4, 0);
                Object b5 = f.this.b(d4, 1);
                if (b4 == null) {
                    i4 = 0;
                } else {
                    i4 = b4.hashCode();
                }
                if (b5 == null) {
                    i5 = 0;
                } else {
                    i5 = b5.hashCode();
                }
                i6 += i4 ^ i5;
            }
            return i6;
        }

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set {
        c() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (f.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i4;
            int i5 = 0;
            for (int d4 = f.this.d() - 1; d4 >= 0; d4--) {
                Object b4 = f.this.b(d4, 0);
                if (b4 == null) {
                    i4 = 0;
                } else {
                    i4 = b4.hashCode();
                }
                i5 += i4;
            }
            return i5;
        }

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e4 = f.this.e(obj);
            if (e4 < 0) {
                return false;
            }
            f.this.h(e4);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    final class d implements Iterator, Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        int f16437a;

        /* renamed from: b  reason: collision with root package name */
        int f16438b;

        /* renamed from: c  reason: collision with root package name */
        boolean f16439c = false;

        d() {
            this.f16437a = f.this.d() - 1;
            this.f16438b = -1;
        }

        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                this.f16438b++;
                this.f16439c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f16439c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0941c.c(entry.getKey(), f.this.b(this.f16438b, 0)) || !C0941c.c(entry.getValue(), f.this.b(this.f16438b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public Object getKey() {
            if (this.f16439c) {
                return f.this.b(this.f16438b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.f16439c) {
                return f.this.b(this.f16438b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.f16438b < this.f16437a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i4;
            if (this.f16439c) {
                int i5 = 0;
                Object b4 = f.this.b(this.f16438b, 0);
                Object b5 = f.this.b(this.f16438b, 1);
                if (b4 == null) {
                    i4 = 0;
                } else {
                    i4 = b4.hashCode();
                }
                if (b5 != null) {
                    i5 = b5.hashCode();
                }
                return i4 ^ i5;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f16439c) {
                f.this.h(this.f16438b);
                this.f16438b--;
                this.f16437a--;
                this.f16439c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object obj) {
            if (this.f16439c) {
                return f.this.i(this.f16438b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection {
        e() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (f.this.f(obj) >= 0) {
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

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f4 = f.this.f(obj);
            if (f4 < 0) {
                return false;
            }
            f.this.h(f4);
            return true;
        }

        public boolean removeAll(Collection collection) {
            int d4 = f.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < d4) {
                if (collection.contains(f.this.b(i4, 1))) {
                    f.this.h(i4);
                    i4--;
                    d4--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        public boolean retainAll(Collection collection) {
            int d4 = f.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < d4) {
                if (!collection.contains(f.this.b(i4, 1))) {
                    f.this.h(i4);
                    i4--;
                    d4--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    f() {
    }

    public static boolean j(Map map, Collection collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i4, int i5);

    /* access modifiers changed from: protected */
    public abstract Map c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public abstract void h(int i4);

    /* access modifiers changed from: protected */
    public abstract Object i(int i4, Object obj);

    public Set l() {
        if (this.f16427a == null) {
            this.f16427a = new b();
        }
        return this.f16427a;
    }

    public Set m() {
        if (this.f16428b == null) {
            this.f16428b = new c();
        }
        return this.f16428b;
    }

    public Collection n() {
        if (this.f16429c == null) {
            this.f16429c = new e();
        }
        return this.f16429c;
    }

    public Object[] q(int i4) {
        int d4 = d();
        Object[] objArr = new Object[d4];
        for (int i5 = 0; i5 < d4; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i4) {
        int d4 = d();
        if (objArr.length < d4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d4);
        }
        for (int i5 = 0; i5 < d4; i5++) {
            objArr[i5] = b(i5, i4);
        }
        if (objArr.length > d4) {
            objArr[d4] = null;
        }
        return objArr;
    }
}
