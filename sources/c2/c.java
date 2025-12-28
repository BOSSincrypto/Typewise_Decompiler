package C2;

import C2.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.B;
import kotlin.text.o;
import kotlin.time.DurationUnit;
import w2.C0930a;
import z2.d;

public abstract class c {
    /* access modifiers changed from: private */
    public static final long i(long j4, int i4) {
        return a.h((j4 << 1) + ((long) i4));
    }

    /* access modifiers changed from: private */
    public static final long j(long j4) {
        return a.h((j4 << 1) + 1);
    }

    /* access modifiers changed from: private */
    public static final long k(long j4) {
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return j(d.g(j4, -4611686018427387903L, 4611686018427387903L));
        }
        return l(n(j4));
    }

    /* access modifiers changed from: private */
    public static final long l(long j4) {
        return a.h(j4 << 1);
    }

    /* access modifiers changed from: private */
    public static final long m(long j4) {
        if (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) {
            return j(o(j4));
        }
        return l(j4);
    }

    /* access modifiers changed from: private */
    public static final long n(long j4) {
        return j4 * ((long) 1000000);
    }

    /* access modifiers changed from: private */
    public static final long o(long j4) {
        return j4 / ((long) 1000000);
    }

    /* access modifiers changed from: private */
    public static final long p(String str, boolean z3) {
        int i4;
        boolean z4;
        boolean z5;
        long j4;
        long j5;
        int i5;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            a.C0001a aVar = a.f225b;
            long b4 = aVar.b();
            char charAt = str2.charAt(0);
            boolean z6 = true;
            if (charAt == '+' || charAt == '-') {
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 || !o.y0(str2, '-', false, 2, (Object) null)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (length > i4) {
                char c4 = ':';
                String str3 = "No components";
                char c5 = '0';
                if (str2.charAt(i4) == 'P') {
                    int i6 = i4 + 1;
                    if (i6 != length) {
                        DurationUnit durationUnit = null;
                        boolean z7 = false;
                        while (i6 < length) {
                            if (str2.charAt(i6) != 'T') {
                                int i7 = i6;
                                while (true) {
                                    if (i7 >= str.length()) {
                                        break;
                                    }
                                    char charAt2 = str2.charAt(i7);
                                    if (c5 > charAt2 || charAt2 >= c4) {
                                        if (!o.K("+-.", charAt2, false, 2, (Object) null)) {
                                            break;
                                        }
                                    }
                                    i7++;
                                    c4 = ':';
                                    c5 = '0';
                                }
                                kotlin.jvm.internal.o.c(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i6, i7);
                                kotlin.jvm.internal.o.d(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i6 + substring.length();
                                    if (length2 < 0 || length2 >= str.length()) {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                    char charAt3 = str2.charAt(length2);
                                    int i8 = length2 + 1;
                                    DurationUnit d4 = e.d(charAt3, z7);
                                    if (durationUnit == null || durationUnit.compareTo(d4) > 0) {
                                        int U3 = o.U(substring, '.', 0, false, 6, (Object) null);
                                        if (d4 != DurationUnit.SECONDS || U3 <= 0) {
                                            i5 = i8;
                                            b4 = a.A(b4, s(q(substring), d4));
                                        } else {
                                            kotlin.jvm.internal.o.c(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, U3);
                                            kotlin.jvm.internal.o.d(substring2, "substring(...)");
                                            i5 = i8;
                                            long A3 = a.A(b4, s(q(substring2), d4));
                                            kotlin.jvm.internal.o.c(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(U3);
                                            kotlin.jvm.internal.o.d(substring3, "substring(...)");
                                            b4 = a.A(A3, r(Double.parseDouble(substring3), d4));
                                        }
                                        i6 = i5;
                                        durationUnit = d4;
                                        c4 = ':';
                                        c5 = '0';
                                        z6 = true;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (z7 || (i6 = i6 + 1) == length) {
                                throw new IllegalArgumentException();
                            } else {
                                z7 = z6;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z3) {
                    String str4 = "substring(...)";
                    String str5 = "Unexpected order of duration components";
                    long j6 = b4;
                    String str6 = str3;
                    if (o.x(str, i4, "Infinity", 0, Math.max(length - i4, 8), true)) {
                        b4 = aVar.a();
                    } else {
                        boolean z8 = !z4;
                        if (z4 && str2.charAt(i4) == '(' && o.T0(str) == ')') {
                            i4++;
                            length--;
                            if (i4 != length) {
                                j4 = j6;
                                z8 = true;
                            } else {
                                throw new IllegalArgumentException(str6);
                            }
                        } else {
                            j4 = j6;
                        }
                        DurationUnit durationUnit2 = null;
                        boolean z9 = false;
                        while (i4 < length) {
                            if (z9 && z8) {
                                while (i4 < str.length() && str2.charAt(i4) == ' ') {
                                    i4++;
                                }
                            }
                            int i9 = i4;
                            while (true) {
                                if (i9 >= str.length()) {
                                    break;
                                }
                                char charAt4 = str2.charAt(i9);
                                if (('0' > charAt4 || charAt4 >= ':') && charAt4 != '.') {
                                    break;
                                }
                                i9++;
                            }
                            kotlin.jvm.internal.o.c(str2, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str2.substring(i4, i9);
                            kotlin.jvm.internal.o.d(substring4, str4);
                            if (substring4.length() != 0) {
                                int length3 = i4 + substring4.length();
                                int i10 = length3;
                                while (i10 < str.length() && 'a' <= (r9 = str2.charAt(i10)) && r9 < '{') {
                                    i10++;
                                }
                                kotlin.jvm.internal.o.c(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str2.substring(length3, i10);
                                kotlin.jvm.internal.o.d(substring5, str4);
                                int length4 = length3 + substring5.length();
                                DurationUnit e4 = e.e(substring5);
                                if (durationUnit2 == null || durationUnit2.compareTo(e4) > 0) {
                                    String str7 = str5;
                                    int U4 = o.U(substring4, '.', 0, false, 6, (Object) null);
                                    if (U4 > 0) {
                                        kotlin.jvm.internal.o.c(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, U4);
                                        kotlin.jvm.internal.o.d(substring6, str4);
                                        long A4 = a.A(j5, s(Long.parseLong(substring6), e4));
                                        kotlin.jvm.internal.o.c(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(U4);
                                        kotlin.jvm.internal.o.d(substring7, str4);
                                        j5 = a.A(A4, r(Double.parseDouble(substring7), e4));
                                        length4 = length4;
                                        if (length4 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j5 = a.A(j5, s(Long.parseLong(substring4), e4));
                                    }
                                    str5 = str7;
                                    durationUnit2 = e4;
                                    z9 = true;
                                } else {
                                    throw new IllegalArgumentException(str5);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        b4 = j5;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                if (z5) {
                    return a.E(b4);
                }
                return b4;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long q(String str) {
        int i4;
        int length = str.length();
        if (length <= 0 || !o.K("+-", str.charAt(0), false, 2, (Object) null)) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        if (length - i4 > 16) {
            z2.c cVar = new z2.c(i4, o.P(str));
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((B) it).b());
                    if ('0' <= charAt) {
                        if (charAt >= ':') {
                        }
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (o.G(str, "+", false, 2, (Object) null)) {
            str = o.Q0(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d4, DurationUnit durationUnit) {
        kotlin.jvm.internal.o.e(durationUnit, "unit");
        double a4 = d.a(d4, durationUnit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(a4)) {
            long c4 = C0930a.c(a4);
            if (-4611686018426999999L > c4 || c4 >= 4611686018427000000L) {
                return k(C0930a.c(d.a(d4, durationUnit, DurationUnit.MILLISECONDS)));
            }
            return l(c4);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long s(long j4, DurationUnit durationUnit) {
        kotlin.jvm.internal.o.e(durationUnit, "unit");
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        long c4 = d.c(4611686018426999999L, durationUnit2, durationUnit);
        if ((-c4) > j4 || j4 > c4) {
            return j(d.g(d.b(j4, durationUnit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
        }
        return l(d.c(j4, durationUnit, durationUnit2));
    }
}
