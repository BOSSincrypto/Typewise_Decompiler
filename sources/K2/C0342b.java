package K2;

import F2.b;
import F2.m;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;
import v2.C0925a;

@m(with = C0343c.class)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\r\b\u0007\u0018\u0000 /2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001+B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010\u0018\u001a\u00020\u000bH\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u00060"}, d2 = {"LK2/b;", "LK2/h;", "", "content", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "b", "(LK2/h;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "c", "(I)LK2/h;", "e", "(LK2/h;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "f", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "d", "size", "Companion", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: K2.b  reason: case insensitive filesystem */
public final class C0342b extends h implements List<h>, C0925a {
    public static final a Companion = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f816a;

    /* renamed from: K2.b$a */
    public static final class a {
        private a() {
        }

        public final b serializer() {
            return C0343c.f817a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0342b(List list) {
        super((i) null);
        o.e(list, "content");
        this.f816a = list;
    }

    public /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(h hVar) {
        o.e(hVar, "element");
        return this.f816a.contains(hVar);
    }

    /* renamed from: c */
    public h get(int i4) {
        return (h) this.f816a.get(i4);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return b((h) obj);
    }

    public boolean containsAll(Collection collection) {
        o.e(collection, "elements");
        return this.f816a.containsAll(collection);
    }

    public int d() {
        return this.f816a.size();
    }

    public int e(h hVar) {
        o.e(hVar, "element");
        return this.f816a.indexOf(hVar);
    }

    public boolean equals(Object obj) {
        return o.a(this.f816a, obj);
    }

    public int f(h hVar) {
        o.e(hVar, "element");
        return this.f816a.lastIndexOf(hVar);
    }

    public int hashCode() {
        return this.f816a.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return e((h) obj);
    }

    public boolean isEmpty() {
        return this.f816a.isEmpty();
    }

    public Iterator iterator() {
        return this.f816a.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return f((h) obj);
    }

    public ListIterator listIterator() {
        return this.f816a.listIterator();
    }

    public /* bridge */ /* synthetic */ Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return d();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i4, int i5) {
        return this.f816a.subList(i4, i5);
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public String toString() {
        return C0718m.Z(this.f816a, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i4) {
        return this.f816a.listIterator(i4);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        return h.b(this, objArr);
    }
}
