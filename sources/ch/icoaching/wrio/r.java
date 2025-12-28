package ch.icoaching.wrio;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

public abstract class r {
    public static final void a(Map map) {
        o.e(map, "<this>");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getValue()).intValue() < 0) {
                it.remove();
            }
        }
    }
}
