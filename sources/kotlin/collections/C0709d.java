package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import v2.c;

/* renamed from: kotlin.collections.d  reason: case insensitive filesystem */
public abstract class C0709d extends AbstractList implements List, c {
    protected C0709d() {
    }

    public abstract int getSize();

    public final /* bridge */ Object remove(int i4) {
        return removeAt(i4);
    }

    public abstract Object removeAt(int i4);

    public final /* bridge */ int size() {
        return getSize();
    }
}
