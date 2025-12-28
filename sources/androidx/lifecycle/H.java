package androidx.lifecycle;

import U.a;
import kotlin.jvm.internal.o;

public abstract class H {
    public static final a a(J j4) {
        o.e(j4, "owner");
        if (j4 instanceof C0458h) {
            return ((C0458h) j4).getDefaultViewModelCreationExtras();
        }
        return a.C0027a.f1484b;
    }
}
