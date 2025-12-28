package D0;

import kotlin.jvm.internal.o;
import y0.C0946c;

public abstract class L {
    public static final String a(String str, boolean z3) {
        o.e(str, "text");
        return (String) C0946c.b(str, z3).getSecond();
    }

    public static /* synthetic */ String b(String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return a(str, z3);
    }
}
