package E0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

public abstract class i {
    public static final Set a(Iterator it) {
        o.e(it, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
