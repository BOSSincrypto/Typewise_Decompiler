package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

abstract class N extends M {
    public static Set e() {
        return EmptySet.INSTANCE;
    }

    public static Set f(Object... objArr) {
        o.e(objArr, "elements");
        return (Set) ArraysKt___ArraysKt.Y(objArr, new LinkedHashSet(D.e(objArr.length)));
    }

    public static final Set g(Set set) {
        o.e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return L.e();
        }
        if (size != 1) {
            return set;
        }
        return L.d(set.iterator().next());
    }

    public static Set h(Object... objArr) {
        o.e(objArr, "elements");
        return ArraysKt___ArraysKt.e0(objArr);
    }
}
