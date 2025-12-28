package D0;

import kotlin.Pair;
import kotlin.jvm.internal.o;
import y0.C0946c;

public final class S implements C0270f {
    public M c(String str) {
        o.e(str, "originalContext");
        Pair c4 = C0946c.c(str, false, 2, (Object) null);
        String str2 = (String) c4.component1();
        return new M(str, str, "", (String) c4.component2());
    }
}
