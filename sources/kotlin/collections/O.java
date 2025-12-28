package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

abstract class O extends N {
    public static Set i(Set set, Iterable iterable) {
        o.e(set, "<this>");
        o.e(iterable, "elements");
        Collection B3 = t.B(iterable);
        if (B3.isEmpty()) {
            return C0718m.F0(set);
        }
        if (B3 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!B3.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(B3);
        return linkedHashSet2;
    }

    public static Set j(Set set, Iterable iterable) {
        int i4;
        o.e(set, "<this>");
        o.e(iterable, "elements");
        Integer u3 = p.u(iterable);
        if (u3 != null) {
            i4 = set.size() + u3.intValue();
        } else {
            i4 = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.e(i4));
        linkedHashSet.addAll(set);
        C0718m.z(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
