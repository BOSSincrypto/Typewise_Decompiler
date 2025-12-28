package n2;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: n2.f  reason: case insensitive filesystem */
final class C0835f implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final C0835f f15074a = new C0835f();

    private C0835f() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        o.e(comparable, "a");
        o.e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return C0834e.f15073a;
    }
}
