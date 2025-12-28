package E0;

import B2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public abstract class m {
    public static final boolean b(List list, List list2) {
        o.e(list, "<this>");
        o.e(list2, "other");
        if (list.size() == list2.size()) {
            for (Boolean booleanValue : h.n(C0718m.J(list), new l(list2))) {
                if (!booleanValue.booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean c(List list, int i4, Object obj) {
        return o.a(obj, list.get(i4));
    }

    public static final int d(List list) {
        o.e(list, "<this>");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() * ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final Object e(List list, int i4) {
        o.e(list, "<this>");
        if (i4 < 0) {
            i4 += list.size();
        }
        return list.get(i4);
    }

    public static final void f(List list, int i4, Object obj) {
        o.e(list, "<this>");
        if (i4 < 0) {
            i4 += list.size();
        }
        list.add(i4, obj);
    }

    public static final List g(List list, int i4, Integer num) {
        int i5;
        o.e(list, "<this>");
        if (i4 < 0) {
            if (i4 * -1 > list.size()) {
                i4 = 0;
            } else {
                i4 += list.size();
            }
        } else if (i4 > list.size()) {
            i4 = list.size();
        }
        if (num != null) {
            if (num.intValue() < 0) {
                i5 = list.size() + num.intValue();
            } else if (num.intValue() > list.size()) {
                i5 = list.size();
            } else {
                i5 = num.intValue();
            }
            if (i4 < 0 || i4 > i5) {
                return C0718m.j();
            }
            return list.subList(i4, i5);
        } else if (i4 < 0) {
            return C0718m.j();
        } else {
            return list.subList(i4, list.size());
        }
    }

    public static /* synthetic */ List h(List list, int i4, Integer num, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            num = null;
        }
        return g(list, i4, num);
    }

    public static final List i(Iterator it) {
        o.e(it, "<this>");
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
