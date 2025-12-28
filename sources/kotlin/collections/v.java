package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

abstract class v extends u {
    public static void I(List list) {
        o.e(list, "<this>");
        Collections.reverse(list);
    }
}
