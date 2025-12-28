package E0;

import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public abstract class n {
    public static final k a(String str, List list, int i4) {
        String str2;
        o.e(str, "text");
        o.e(list, "touchPoints");
        if (str.length() > i4) {
            str2 = s.o(str, -i4, (Integer) null, 2, (Object) null);
        } else {
            str2 = str;
        }
        if (str.length() > i4) {
            int length = str.length() - i4;
            if (length >= list.size()) {
                list = C0718m.j();
            } else {
                list = list.subList(length, list.size());
            }
        }
        return new k(str2, list);
    }
}
