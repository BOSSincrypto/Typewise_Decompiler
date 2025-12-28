package x2;

import kotlin.jvm.internal.o;

/* renamed from: x2.c  reason: case insensitive filesystem */
public abstract class C0938c {
    public static final String a(Object obj, Object obj2) {
        o.e(obj, "from");
        o.e(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(double d4, double d5) {
        if (d5 <= d4) {
            throw new IllegalArgumentException(a(Double.valueOf(d4), Double.valueOf(d5)).toString());
        }
    }

    public static final void c(int i4, int i5) {
        if (i5 <= i4) {
            throw new IllegalArgumentException(a(Integer.valueOf(i4), Integer.valueOf(i5)).toString());
        }
    }

    public static final void d(long j4, long j5) {
        if (j5 <= j4) {
            throw new IllegalArgumentException(a(Long.valueOf(j4), Long.valueOf(j5)).toString());
        }
    }

    public static final int e(int i4) {
        return 31 - Integer.numberOfLeadingZeros(i4);
    }

    public static final int f(int i4, int i5) {
        return (i4 >>> (32 - i5)) & ((-i5) >> 31);
    }
}
