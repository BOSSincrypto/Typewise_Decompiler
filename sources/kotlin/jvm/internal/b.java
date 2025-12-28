package kotlin.jvm.internal;

import java.util.Iterator;

public abstract class b {
    public static final Iterator a(Object[] objArr) {
        o.e(objArr, "array");
        return new a(objArr);
    }
}
