package e;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.o;

/* renamed from: e.a  reason: case insensitive filesystem */
public abstract class C0641a {
    public static final List a(Map map, Map map2, Map map3) {
        o.e(map, "deletes");
        o.e(map2, "wordMap");
        o.e(map3, "deletesMap");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Set<String> set = (Set) entry.getValue();
            Integer num = (Integer) map3.get((String) entry.getKey());
            if (num != null) {
                for (String str : set) {
                    Integer num2 = (Integer) map2.get(str);
                    if (num2 != null) {
                        arrayList.add(new Pair(num, num2));
                    }
                }
            }
        }
        return arrayList;
    }
}
