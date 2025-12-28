package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.o;
import u2.C0906a;
import v2.C0925a;

public final class z implements Iterable, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final C0906a f13869a;

    public z(C0906a aVar) {
        o.e(aVar, "iteratorFactory");
        this.f13869a = aVar;
    }

    public Iterator iterator() {
        return new A((Iterator) this.f13869a.invoke());
    }
}
