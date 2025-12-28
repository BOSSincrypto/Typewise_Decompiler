package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import v2.C0926b;

/* renamed from: kotlin.collections.c  reason: case insensitive filesystem */
public abstract class C0708c extends AbstractCollection implements Collection, C0926b {
    protected C0708c() {
    }

    public abstract int b();

    public final /* bridge */ int size() {
        return b();
    }
}
