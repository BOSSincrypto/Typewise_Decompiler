package ch.icoaching.wrio.data.source.local.db.migrations;

import java.util.List;
import kotlin.jvm.internal.o;

public abstract class b {
    /* access modifiers changed from: private */
    public static final String b(List list, String str) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append(((Number) list.get(i4)).intValue());
            if (i4 < list.size() - 1) {
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }
}
