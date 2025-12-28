package kotlin.collections;

import java.util.Iterator;
import v2.C0925a;

public abstract class B implements Iterator, C0925a {
    public abstract int b();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
