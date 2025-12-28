package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;
import v2.C0926b;

/* renamed from: kotlin.collections.e  reason: case insensitive filesystem */
public abstract class C0710e extends AbstractSet implements Set, C0926b {
    protected C0710e() {
    }

    public abstract int getSize();

    public final /* bridge */ int size() {
        return getSize();
    }
}
