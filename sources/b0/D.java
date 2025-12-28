package B0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;

public abstract class D {
    /* access modifiers changed from: private */
    public static final List c(C c4) {
        int max = Math.max(c4.m().size(), Math.max(c4.n().size(), Math.max(c4.b().size(), c4.k().size())));
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < max; i4++) {
            arrayList.add(new C0261i((Float) C0718m.T(c4.b(), i4), (String) C0718m.T(c4.m(), i4), (Integer) C0718m.T(c4.n(), i4), (Integer) C0718m.T(c4.k(), i4)));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List d(C c4, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new C0260h(((Number) list.get(i4)).doubleValue(), (String) C0718m.T(c4.m(), i4), (Float) C0718m.T(c4.b(), i4), (Integer) C0718m.T(c4.n(), i4), (Integer) C0718m.T(c4.k(), i4)));
        }
        return arrayList;
    }
}
