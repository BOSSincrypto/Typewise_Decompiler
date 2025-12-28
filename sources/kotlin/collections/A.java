package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class A implements Iterator, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f13816a;

    /* renamed from: b  reason: collision with root package name */
    private int f13817b;

    public A(Iterator it) {
        o.e(it, "iterator");
        this.f13816a = it;
    }

    /* renamed from: b */
    public final y next() {
        int i4 = this.f13817b;
        this.f13817b = i4 + 1;
        if (i4 < 0) {
            C0718m.s();
        }
        return new y(i4, this.f13816a.next());
    }

    public final boolean hasNext() {
        return this.f13816a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
