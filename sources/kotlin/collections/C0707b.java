package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import v2.C0925a;

/* renamed from: kotlin.collections.b  reason: case insensitive filesystem */
public abstract class C0707b extends AbstractCollection implements List, C0925a {
    public static final a Companion = new a((i) null);

    /* renamed from: kotlin.collections.b$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("startIndex: " + i4 + ", endIndex: " + i5 + ", size: " + i6);
            } else if (i4 > i5) {
                throw new IllegalArgumentException("startIndex: " + i4 + " > endIndex: " + i5);
            }
        }

        public final void b(int i4, int i5) {
            if (i4 < 0 || i4 >= i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void c(int i4, int i5) {
            if (i4 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void d(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
            } else if (i4 > i5) {
                throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
            }
        }

        public final int e(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                return i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i6;
        }

        public final boolean f(Collection collection, Collection collection2) {
            o.e(collection, "c");
            o.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a4 : collection) {
                if (!o.a(a4, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection collection) {
            int i4;
            o.e(collection, "c");
            int i5 = 1;
            for (Object next : collection) {
                int i6 = i5 * 31;
                if (next != null) {
                    i4 = next.hashCode();
                } else {
                    i4 = 0;
                }
                i5 = i6 + i4;
            }
            return i5;
        }

        private a() {
        }
    }

    /* renamed from: kotlin.collections.b$b  reason: collision with other inner class name */
    private class C0199b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private int f13831a;

        public C0199b() {
        }

        /* access modifiers changed from: protected */
        public final int b() {
            return this.f13831a;
        }

        /* access modifiers changed from: protected */
        public final void c(int i4) {
            this.f13831a = i4;
        }

        public boolean hasNext() {
            if (this.f13831a < C0707b.this.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                C0707b bVar = C0707b.this;
                int i4 = this.f13831a;
                this.f13831a = i4 + 1;
                return bVar.get(i4);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    private class c extends C0199b implements ListIterator, C0925a {
        public c(int i4) {
            super();
            C0707b.Companion.c(i4, C0707b.this.size());
            c(i4);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            if (b() > 0) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return b();
        }

        public Object previous() {
            if (hasPrevious()) {
                C0707b bVar = C0707b.this;
                c(b() - 1);
                return bVar.get(b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return b() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    private static final class d extends C0707b implements RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        private final C0707b f13834a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13835b;

        /* renamed from: c  reason: collision with root package name */
        private int f13836c;

        public d(C0707b bVar, int i4, int i5) {
            o.e(bVar, "list");
            this.f13834a = bVar;
            this.f13835b = i4;
            C0707b.Companion.d(i4, i5, bVar.size());
            this.f13836c = i5 - i4;
        }

        public Object get(int i4) {
            C0707b.Companion.b(i4, this.f13836c);
            return this.f13834a.get(this.f13835b + i4);
        }

        public int getSize() {
            return this.f13836c;
        }
    }

    protected C0707b() {
    }

    public void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i4, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.f(this, (Collection) obj);
    }

    public abstract Object get(int i4);

    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(Object obj) {
        int i4 = 0;
        for (Object a4 : this) {
            if (o.a(a4, obj)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public Iterator<Object> iterator() {
        return new C0199b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<Object> listIterator() {
        return new c(0);
    }

    public Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<Object> subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    public ListIterator<Object> listIterator(int i4) {
        return new c(i4);
    }
}
