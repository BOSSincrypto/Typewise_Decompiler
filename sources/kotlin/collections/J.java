package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;

public final class J extends C0707b implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final List f13819a;

    /* renamed from: b  reason: collision with root package name */
    private int f13820b;

    /* renamed from: c  reason: collision with root package name */
    private int f13821c;

    public J(List list) {
        o.e(list, "list");
        this.f13819a = list;
    }

    public final void b(int i4, int i5) {
        C0707b.Companion.d(i4, i5, this.f13819a.size());
        this.f13820b = i4;
        this.f13821c = i5 - i4;
    }

    public Object get(int i4) {
        C0707b.Companion.b(i4, this.f13821c);
        return this.f13819a.get(this.f13820b + i4);
    }

    public int getSize() {
        return this.f13821c;
    }
}
