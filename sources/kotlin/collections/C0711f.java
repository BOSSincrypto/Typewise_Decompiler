package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.o;
import v2.C0925a;

/* renamed from: kotlin.collections.f  reason: case insensitive filesystem */
final class C0711f implements Collection, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f13859a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13860b;

    public C0711f(Object[] objArr, boolean z3) {
        o.e(objArr, "values");
        this.f13859a = objArr;
        this.f13860b = z3;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f13859a.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C0713h.u(this.f13859a, obj);
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        if (this.f13859a.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return b.a(this.f13859a);
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

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }

    public final Object[] toArray() {
        return C0719n.b(this.f13859a, this.f13860b);
    }
}
