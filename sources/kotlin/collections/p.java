package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

abstract class p extends C0720o {
    public static int t(Iterable iterable, int i4) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i4;
    }

    public static final Integer u(Iterable iterable) {
        o.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List v(Iterable iterable) {
        o.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C0718m.z(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
