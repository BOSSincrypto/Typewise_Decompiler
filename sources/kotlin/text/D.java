package kotlin.text;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import l2.h;
import l2.j;
import l2.l;

public abstract class D {
    public static final byte a(String str) {
        o.e(str, "<this>");
        h b4 = b(str);
        if (b4 != null) {
            return b4.f();
        }
        v.l(str);
        throw new KotlinNothingValueException();
    }

    public static final h b(String str) {
        o.e(str, "<this>");
        return c(str, 10);
    }

    public static final h c(String str, int i4) {
        o.e(str, "<this>");
        j f4 = f(str, i4);
        if (f4 == null) {
            return null;
        }
        int f5 = f4.f();
        if (Integer.compare(f5 ^ Integer.MIN_VALUE, j.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return h.a(h.b((byte) f5));
    }

    public static final int d(String str) {
        o.e(str, "<this>");
        j e4 = e(str);
        if (e4 != null) {
            return e4.f();
        }
        v.l(str);
        throw new KotlinNothingValueException();
    }

    public static final j e(String str) {
        o.e(str, "<this>");
        return f(str, 10);
    }

    public static final j f(String str, int i4) {
        int i5;
        o.e(str, "<this>");
        C0721a.a(i4);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (o.f(charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int b4 = j.b(i4);
        int i7 = 119304647;
        while (i5 < length) {
            int b5 = C0722b.b(str.charAt(i5), i4);
            if (b5 < 0) {
                return null;
            }
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) > 0) {
                if (i7 == 119304647) {
                    i7 = C.a(-1, b4);
                    if (Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int b6 = j.b(i6 * b4);
            int b7 = j.b(j.b(b5) + b6);
            if (Integer.compare(b7 ^ Integer.MIN_VALUE, b6 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i5++;
            i6 = b7;
        }
        return j.a(i6);
    }

    public static final long g(String str) {
        o.e(str, "<this>");
        l h4 = h(str);
        if (h4 != null) {
            return h4.f();
        }
        v.l(str);
        throw new KotlinNothingValueException();
    }

    public static final l h(String str) {
        o.e(str, "<this>");
        return i(str, 10);
    }

    public static final l i(String str, int i4) {
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
        if (o.f(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b4 = l.b((long) i5);
        long j4 = 0;
        long j5 = 512409557603043100L;
        while (i6 < length) {
            int b5 = C0722b.b(str2.charAt(i6), i5);
            if (b5 < 0) {
                return null;
            }
            if (Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) > 0) {
                if (j5 == 512409557603043100L) {
                    j5 = A.a(-1, b4);
                    if (Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long b6 = l.b(j4 * b4);
            long b7 = l.b(l.b(((long) j.b(b5)) & 4294967295L) + b6);
            if (Long.compare(b7 ^ Long.MIN_VALUE, b6 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i6++;
            j4 = b7;
        }
        return l.a(j4);
    }

    public static final short j(String str) {
        o.e(str, "<this>");
        l2.o k4 = k(str);
        if (k4 != null) {
            return k4.f();
        }
        v.l(str);
        throw new KotlinNothingValueException();
    }

    public static final l2.o k(String str) {
        o.e(str, "<this>");
        return l(str, 10);
    }

    public static final l2.o l(String str, int i4) {
        o.e(str, "<this>");
        j f4 = f(str, i4);
        if (f4 == null) {
            return null;
        }
        int f5 = f4.f();
        if (Integer.compare(f5 ^ Integer.MIN_VALUE, j.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return l2.o.a(l2.o.b((short) f5));
    }
}
