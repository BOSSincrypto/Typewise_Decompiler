package n2;

import java.util.Comparator;
import kotlin.jvm.internal.o;

/* renamed from: n2.e  reason: case insensitive filesystem */
final class C0834e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final C0834e f15073a = new C0834e();

    private C0834e() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        o.e(comparable, "a");
        o.e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return C0835f.f15074a;
    }
}
