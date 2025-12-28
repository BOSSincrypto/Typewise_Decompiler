package w2;

/* renamed from: w2.c  reason: case insensitive filesystem */
abstract class C0932c extends C0931b {
    public static int a(double d4) {
        if (Double.isNaN(d4)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d4 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d4 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d4);
        }
    }

    public static int b(float f4) {
        if (!Float.isNaN(f4)) {
            return Math.round(f4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long c(double d4) {
        if (!Double.isNaN(d4)) {
            return Math.round(d4);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
