package l2;

import kotlin.jvm.internal.o;
import kotlin.text.C0721a;

public abstract class r {
    public static final int a(int i4, int i5) {
        return o.f(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j4, long j5) {
        return o.g(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    public static final String c(long j4, int i4) {
        if (j4 >= 0) {
            String l4 = Long.toString(j4, C0721a.a(i4));
            o.d(l4, "toString(...)");
            return l4;
        }
        long j5 = (long) i4;
        long j6 = ((j4 >>> 1) / j5) << 1;
        long j7 = j4 - (j6 * j5);
        if (j7 >= j5) {
            j7 -= j5;
            j6++;
        }
        StringBuilder sb = new StringBuilder();
        String l5 = Long.toString(j6, C0721a.a(i4));
        o.d(l5, "toString(...)");
        sb.append(l5);
        String l6 = Long.toString(j7, C0721a.a(i4));
        o.d(l6, "toString(...)");
        sb.append(l6);
        return sb.toString();
    }
}
