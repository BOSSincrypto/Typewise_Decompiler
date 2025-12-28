package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

abstract class E {
    public static final Object a(Map map, Object obj) {
        o.e(map, "<this>");
        if (map instanceof C) {
            return ((C) map).a(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
