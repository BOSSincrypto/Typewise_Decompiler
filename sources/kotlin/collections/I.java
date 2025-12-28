package kotlin.collections;

import B2.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.o;

abstract class I extends H {
    public static e t(Map map) {
        o.e(map, "<this>");
        return C0718m.J(map.entrySet());
    }

    public static List u(Map map) {
        o.e(map, "<this>");
        if (map.size() == 0) {
            return C0718m.j();
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C0718m.j();
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return C0718m.e(new Pair(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
