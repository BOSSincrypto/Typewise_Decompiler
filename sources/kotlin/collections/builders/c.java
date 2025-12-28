package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C0708c;
import kotlin.jvm.internal.o;
import v2.C0926b;

public final class c extends C0708c implements Collection, C0926b {

    /* renamed from: a  reason: collision with root package name */
    private final MapBuilder f13858a;

    public c(MapBuilder mapBuilder) {
        o.e(mapBuilder, "backing");
        this.f13858a = mapBuilder;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        o.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.f13858a.size();
    }

    public void clear() {
        this.f13858a.clear();
    }

    public boolean contains(Object obj) {
        return this.f13858a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f13858a.isEmpty();
    }

    public Iterator iterator() {
        return this.f13858a.valuesIterator$kotlin_stdlib();
    }

    public boolean remove(Object obj) {
        return this.f13858a.removeValue$kotlin_stdlib(obj);
    }

    public boolean removeAll(Collection collection) {
        o.e(collection, "elements");
        this.f13858a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        o.e(collection, "elements");
        this.f13858a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
