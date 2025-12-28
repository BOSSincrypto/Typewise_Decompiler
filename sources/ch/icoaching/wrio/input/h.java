package ch.icoaching.wrio.input;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.o;

public abstract class h {
    /* access modifiers changed from: private */
    public static final Set b(Map map, String str) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (((Number) entry.getValue()).intValue() > 0 && o.L(str, str2, false, 2, (Object) null)) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }
}
