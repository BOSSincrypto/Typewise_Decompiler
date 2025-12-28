package z2;

import kotlin.jvm.internal.o;
import z2.C0973a;

abstract class f extends e {
    public static int b(int i4, int i5) {
        if (i4 < i5) {
            return i5;
        }
        return i4;
    }

    public static long c(long j4, long j5) {
        if (j4 < j5) {
            return j5;
        }
        return j4;
    }

    public static int d(int i4, int i5) {
        if (i4 > i5) {
            return i5;
        }
        return i4;
    }

    public static long e(long j4, long j5) {
        if (j4 > j5) {
            return j5;
        }
        return j4;
    }

    public static int f(int i4, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i6 + " is less than minimum " + i5 + '.');
        } else if (i4 < i5) {
            return i5;
        } else {
            if (i4 > i6) {
                return i6;
            }
            return i4;
        }
    }

    public static long g(long j4, long j5, long j6) {
        if (j5 > j6) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
        } else if (j4 < j5) {
            return j5;
        } else {
            if (j4 > j6) {
                return j6;
            }
            return j4;
        }
    }

    public static C0973a h(int i4, int i5) {
        return C0973a.f16742d.a(i4, i5, -1);
    }

    public static C0973a i(C0973a aVar, int i4) {
        boolean z3;
        o.e(aVar, "<this>");
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        e.a(z3, Integer.valueOf(i4));
        C0973a.C0252a aVar2 = C0973a.f16742d;
        int b4 = aVar.b();
        int c4 = aVar.c();
        if (aVar.d() <= 0) {
            i4 = -i4;
        }
        return aVar2.a(b4, c4, i4);
    }

    public static c j(int i4, int i5) {
        if (i5 <= Integer.MIN_VALUE) {
            return c.f16750e.a();
        }
        return new c(i4, i5 - 1);
    }
}
