package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C0710e;
import kotlin.jvm.internal.o;
import v2.C0926b;

public final class b extends C0710e implements Set, C0926b {

    /* renamed from: a  reason: collision with root package name */
    private final MapBuilder f13857a;

    public b(MapBuilder mapBuilder) {
        o.e(mapBuilder, "backing");
        this.f13857a = mapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        o.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f13857a.clear();
    }

    public boolean contains(Object obj) {
        return this.f13857a.containsKey(obj);
    }

    public int getSize() {
        return this.f13857a.size();
    }

    public boolean isEmpty() {
        return this.f13857a.isEmpty();
    }

    public Iterator iterator() {
        return this.f13857a.keysIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.f13857a.removeKey$kotlin_stdlib(obj);
    }

    public boolean removeAll(Collection collection) {
        o.e(collection, "elements");
        this.f13857a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        o.e(collection, "elements");
        this.f13857a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
