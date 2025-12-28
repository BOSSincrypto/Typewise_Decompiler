package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.o;

abstract class G extends F {
    public static Map h() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        o.c(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object i(Map map, Object obj) {
        o.e(map, "<this>");
        return E.a(map, obj);
    }

    public static Map j(Pair... pairArr) {
        o.e(pairArr, "pairs");
        if (pairArr.length > 0) {
            return r(pairArr, new LinkedHashMap(D.e(pairArr.length)));
        }
        return D.h();
    }

    public static final Map k(Map map) {
        o.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return D.h();
        }
        if (size != 1) {
            return map;
        }
        return F.g(map);
    }

    public static Map l(Map map, Pair pair) {
        o.e(map, "<this>");
        o.e(pair, "pair");
        if (map.isEmpty()) {
            return D.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static final void m(Map map, Iterable iterable) {
        o.e(map, "<this>");
        o.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.component1(), pair.component2());
        }
    }

    public static final void n(Map map, Pair[] pairArr) {
        o.e(map, "<this>");
        o.e(pairArr, "pairs");
        for (Pair pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    public static Map o(Iterable iterable) {
        Object next;
        o.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k(p(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return D.h();
        }
        if (size != 1) {
            return p(iterable, new LinkedHashMap(D.e(collection.size())));
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return D.f((Pair) next);
    }

    public static final Map p(Iterable iterable, Map map) {
        o.e(iterable, "<this>");
        o.e(map, "destination");
        m(map, iterable);
        return map;
    }

    public static Map q(Map map) {
        o.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return D.h();
        }
        if (size != 1) {
            return D.s(map);
        }
        return F.g(map);
    }

    public static final Map r(Pair[] pairArr, Map map) {
        o.e(pairArr, "<this>");
        o.e(map, "destination");
        n(map, pairArr);
        return map;
    }

    public static Map s(Map map) {
        o.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
