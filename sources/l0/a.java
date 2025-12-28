package L0;

import kotlin.jvm.internal.o;

public abstract class a {
    public static final float a(String str) {
        o.e(str, "packageName");
        if (o.a(str, "org.mozilla.firefox")) {
            return 0.8f;
        }
        return 0.87f;
    }
}
