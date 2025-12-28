package E0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

public abstract class q {
    public static final List a(String str, List list) {
        o.e(str, "text");
        o.e(list, "existingTouchPoints");
        if (str.length() > list.size()) {
            ArrayList arrayList = new ArrayList();
            int length = str.length() - list.size();
            for (int i4 = 0; i4 < length; i4++) {
                arrayList.add((Object) null);
            }
            arrayList.addAll(list);
            return arrayList;
        } else if (str.length() < list.size()) {
            return list.subList(0, str.length());
        } else {
            return list;
        }
    }
}
