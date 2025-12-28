package kotlin.text;

import kotlin.jvm.internal.o;

abstract class v extends u {
    public static final Void l(String str) {
        o.e(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer m(String str) {
        o.e(str, "<this>");
        return n(str, 10);
    }

    public static final Integer n(String str, int i4) {
        int i5;
        boolean z3;
        int i6;
        o.e(str, "<this>");
        C0721a.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        int i8 = -2147483647;
        if (o.f(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i8 = Integer.MIN_VALUE;
                z3 = true;
            }
        } else {
            z3 = false;
            i5 = 0;
        }
        int i9 = -59652323;
        while (i5 < length) {
            int b4 = C0722b.b(str.charAt(i5), i4);
            if (b4 < 0) {
                return null;
            }
            if ((i7 < i9 && (i9 != -59652323 || i7 < (i9 = i8 / i4))) || (i6 = i7 * i4) < i8 + b4) {
                return null;
            }
            i7 = i6 - b4;
            i5++;
        }
        if (z3) {
            return Integer.valueOf(i7);
        }
        return Integer.valueOf(-i7);
    }

    public static Long o(String str) {
        o.e(str, "<this>");
        return p(str, 10);
    }

    public static final Long p(String str, int i4) {
        boolean z3;
        String str2 = str;
        int i5 = i4;
        o.e(str2, "<this>");
        C0721a.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str2.charAt(0);
        long j4 = -9223372036854775807L;
        if (o.f(charAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
                i6 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j4 = Long.MIN_VALUE;
                i6 = 1;
            }
        } else {
            z3 = false;
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i6 < length) {
            int b4 = C0722b.b(str2.charAt(i6), i5);
            if (b4 < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 == j5) {
                    j7 = j4 / ((long) i5);
                    if (j6 < j7) {
                    }
                }
                return null;
            }
            long j8 = j6 * ((long) i5);
            long j9 = (long) b4;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i6++;
            j5 = -256204778801521550L;
        }
        if (z3) {
            return Long.valueOf(j6);
        }
        return Long.valueOf(-j6);
    }
}
