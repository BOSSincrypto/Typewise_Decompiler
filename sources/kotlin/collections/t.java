package kotlin.collections;

import B2.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import u2.l;

abstract class t extends s {
    public static boolean A(Collection collection, Object[] objArr) {
        o.e(collection, "<this>");
        o.e(objArr, "elements");
        return collection.addAll(C0713h.c(objArr));
    }

    public static final Collection B(Iterable iterable) {
        o.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = C0718m.B0(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean C(Iterable iterable, l lVar, boolean z3) {
        Iterator it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z3) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    private static final boolean D(List list, l lVar, boolean z3) {
        int i4;
        if (!(list instanceof RandomAccess)) {
            o.c(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return C(v.a(list), lVar, z3);
        }
        int l4 = C0718m.l(list);
        if (l4 >= 0) {
            int i5 = 0;
            i4 = 0;
            while (true) {
                Object obj = list.get(i5);
                if (((Boolean) lVar.invoke(obj)).booleanValue() != z3) {
                    if (i4 != i5) {
                        list.set(i4, obj);
                    }
                    i4++;
                }
                if (i5 == l4) {
                    break;
                }
                i5++;
            }
        } else {
            i4 = 0;
        }
        if (i4 >= list.size()) {
            return false;
        }
        int l5 = C0718m.l(list);
        if (i4 > l5) {
            return true;
        }
        while (true) {
            list.remove(l5);
            if (l5 == i4) {
                return true;
            }
            l5--;
        }
    }

    public static boolean E(List list, l lVar) {
        o.e(list, "<this>");
        o.e(lVar, "predicate");
        return D(list, lVar, true);
    }

    public static Object F(List list) {
        o.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C0718m.l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static boolean G(Iterable iterable, l lVar) {
        o.e(iterable, "<this>");
        o.e(lVar, "predicate");
        return C(iterable, lVar, false);
    }

    public static final boolean H(Collection collection, Iterable iterable) {
        o.e(collection, "<this>");
        o.e(iterable, "elements");
        return collection.retainAll(B(iterable));
    }

    public static boolean y(Collection collection, e eVar) {
        o.e(collection, "<this>");
        o.e(eVar, "elements");
        boolean z3 = false;
        for (Object add : eVar) {
            if (collection.add(add)) {
                z3 = true;
            }
        }
        return z3;
    }

    public static boolean z(Collection collection, Iterable iterable) {
        o.e(collection, "<this>");
        o.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z3 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z3 = true;
            }
        }
        return z3;
    }
}
