package z2;

import kotlin.jvm.internal.o;

abstract class e {
    public static final void a(boolean z3, Number number) {
        o.e(number, "step");
        if (!z3) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}
