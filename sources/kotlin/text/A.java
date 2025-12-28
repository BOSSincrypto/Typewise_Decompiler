package kotlin.text;

public abstract /* synthetic */ class A {
    public static /* synthetic */ long a(long j4, long j5) {
        if (j5 < 0) {
            if ((j4 ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE)) {
                return 0;
            }
            return 1;
        } else if (j4 >= 0) {
            return j4 / j5;
        } else {
            int i4 = 1;
            long j6 = ((j4 >>> 1) / j5) << 1;
            if (((j4 - (j6 * j5)) ^ Long.MIN_VALUE) < (j5 ^ Long.MIN_VALUE)) {
                i4 = 0;
            }
            return j6 + ((long) i4);
        }
    }
}
