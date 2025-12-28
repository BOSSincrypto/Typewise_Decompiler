package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import m2.C0820a;

public final class a extends C0820a {

    /* renamed from: a  reason: collision with root package name */
    private final MapBuilder f13856a;

    public a(MapBuilder mapBuilder) {
        o.e(mapBuilder, "backing");
        this.f13856a = mapBuilder;
    }

    public boolean addAll(Collection collection) {
        o.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public boolean c(Map.Entry entry) {
        o.e(entry, "element");
        return this.f13856a.containsEntry$kotlin_stdlib(entry);
    }

    public void clear() {
        this.f13856a.clear();
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return this.f13856a.containsAllEntries$kotlin_stdlib(collection);
    }

    public boolean d(Map.Entry entry) {
        o.e(entry, "element");
        return this.f13856a.removeEntry$kotlin_stdlib(entry);
    }

    /* renamed from: e */
    public boolean add(Map.Entry entry) {
        o.e(entry, "element");
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        return this.f13856a.size();
    }

    public boolean isEmpty() {
        return this.f13856a.isEmpty();
    }

    public Iterator iterator() {
        return this.f13856a.entriesIterator$kotlin_stdlib();
    }

    public boolean removeAll(Collection collection) {
        o.e(collection, "elements");
        this.f13856a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        o.e(collection, "elements");
        this.f13856a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(collection);
    }
}
