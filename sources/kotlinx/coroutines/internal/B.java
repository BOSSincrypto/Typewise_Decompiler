package kotlinx.coroutines.internal;

import kotlin.text.o;

abstract /* synthetic */ class B {
    public static final int a(String str, int i4, int i5, int i6) {
        return (int) z.c(str, (long) i4, (long) i5, (long) i6);
    }

    public static final long b(String str, long j4, long j5, long j6) {
        String d4 = z.d(str);
        if (d4 == null) {
            return j4;
        }
        Long o4 = o.o(d4);
        if (o4 != null) {
            long longValue = o4.longValue();
            if (j5 <= longValue && longValue <= j6) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d4 + '\'').toString());
    }

    public static final boolean c(String str, boolean z3) {
        String d4 = z.d(str);
        if (d4 != null) {
            return Boolean.parseBoolean(d4);
        }
        return z3;
    }

    public static /* synthetic */ int d(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return z.b(str, i4, i5, i6);
    }

    public static /* synthetic */ long e(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return z.c(str, j4, j7, j6);
    }
}
