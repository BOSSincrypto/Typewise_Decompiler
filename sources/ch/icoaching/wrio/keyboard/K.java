package ch.icoaching.wrio.keyboard;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.text.o;

public abstract class K {
    /* access modifiers changed from: private */
    public static final Character[] b(String str) {
        if (str == null || str.length() == 0) {
            return new Character[0];
        }
        List t02 = o.t0(str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : t02) {
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(C0718m.t(arrayList, 10));
        for (String charArray : arrayList) {
            char[] charArray2 = charArray.toCharArray();
            kotlin.jvm.internal.o.d(charArray2, "toCharArray(...)");
            arrayList3.add(Boolean.valueOf(C0718m.A(arrayList2, C0713h.p(charArray2))));
        }
        return (Character[]) arrayList2.toArray(new Character[0]);
    }
}
