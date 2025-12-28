package C2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.time.DurationUnit;
import l0.t;
import z2.d;

public final class a implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0001a f225b = new C0001a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f226c = h(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f227d = c.j(4611686018427387903L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f228e = c.j(-4611686018427387903L);

    /* renamed from: a  reason: collision with root package name */
    private final long f229a;

    /* renamed from: C2.a$a  reason: collision with other inner class name */
    public static final class C0001a {
        public /* synthetic */ C0001a(i iVar) {
            this();
        }

        public final long a() {
            return a.f227d;
        }

        public final long b() {
            return a.f226c;
        }

        public final long c(String str) {
            o.e(str, "value");
            try {
                return c.p(str, true);
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e4);
            }
        }

        private C0001a() {
        }
    }

    private /* synthetic */ a(long j4) {
        this.f229a = j4;
    }

    public static final long A(long j4, long j5) {
        if (y(j4)) {
            if (v(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (y(j5)) {
            return j5;
        } else {
            if ((((int) j4) & 1) == (((int) j5) & 1)) {
                long t4 = t(j4) + t(j5);
                if (x(j4)) {
                    return c.m(t4);
                }
                return c.k(t4);
            } else if (w(j4)) {
                return c(j4, t(j4), t(j5));
            } else {
                return c(j4, t(j5), t(j4));
            }
        }
    }

    public static final String B(long j4) {
        boolean z3;
        boolean z4;
        StringBuilder sb = new StringBuilder();
        if (z(j4)) {
            sb.append('-');
        }
        sb.append("PT");
        long j5 = j(j4);
        long m4 = m(j5);
        int p4 = p(j5);
        int r4 = r(j5);
        int q4 = q(j5);
        if (y(j4)) {
            m4 = 9999999999999L;
        }
        boolean z5 = false;
        if (m4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (r4 == 0 && q4 == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (p4 != 0 || (z4 && z3)) {
            z5 = true;
        }
        if (z3) {
            sb.append(m4);
            sb.append('H');
        }
        if (z5) {
            sb.append(p4);
            sb.append('M');
        }
        if (z4 || (!z3 && !z5)) {
            d(j4, sb, r4, q4, 9, "S", true);
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static final long C(long j4, DurationUnit durationUnit) {
        o.e(durationUnit, "unit");
        if (j4 == f227d) {
            return Long.MAX_VALUE;
        }
        if (j4 == f228e) {
            return Long.MIN_VALUE;
        }
        return d.b(t(j4), s(j4), durationUnit);
    }

    public static String D(long j4) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f227d) {
            return "Infinity";
        }
        if (j4 == f228e) {
            return "-Infinity";
        }
        boolean z7 = z(j4);
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append('-');
        }
        long j5 = j(j4);
        long l4 = l(j5);
        int k4 = k(j5);
        int p4 = p(j5);
        int r4 = r(j5);
        int q4 = q(j5);
        int i4 = 0;
        if (l4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (k4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (p4 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (r4 == 0 && q4 == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3) {
            sb.append(l4);
            sb.append('d');
            i4 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(k4);
            sb.append('h');
            i4 = i5;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(p4);
            sb.append('m');
            i4 = i6;
        }
        if (z6) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (r4 != 0 || z3 || z4 || z5) {
                d(j4, sb, r4, q4, 9, "s", false);
            } else if (q4 >= 1000000) {
                d(j4, sb, q4 / 1000000, q4 % 1000000, 6, "ms", false);
            } else if (q4 >= 1000) {
                d(j4, sb, q4 / 1000, q4 % 1000, 3, "us", false);
            } else {
                sb.append(q4);
                sb.append("ns");
            }
            i4 = i7;
        }
        if (z7 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static final long E(long j4) {
        return c.i(-t(j4), ((int) j4) & 1);
    }

    private static final long c(long j4, long j5, long j6) {
        long g4 = c.o(j6);
        long j7 = j5 + g4;
        if (-4611686018426L > j7 || j7 >= 4611686018427L) {
            return c.j(d.g(j7, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j7) + (j6 - c.n(g4)));
    }

    private static final void d(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z3) {
        sb.append(i4);
        if (i5 != 0) {
            sb.append('.');
            String g02 = kotlin.text.o.g0(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = g02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (g02.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (z3 || i9 >= 3) {
                sb.append(g02, 0, ((i7 + 3) / 3) * 3);
                o.d(sb, "append(...)");
            } else {
                sb.append(g02, 0, i9);
                o.d(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a e(long j4) {
        return new a(j4);
    }

    public static int g(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return o.g(j4, j5);
        }
        int i4 = (((int) j4) & 1) - (((int) j5) & 1);
        if (z(j4)) {
            return -i4;
        }
        return i4;
    }

    public static long h(long j4) {
        if (b.a()) {
            if (x(j4)) {
                long t4 = t(j4);
                if (-4611686018426999999L > t4 || t4 >= 4611686018427000000L) {
                    throw new AssertionError(t(j4) + " ns is out of nanoseconds range");
                }
            } else {
                long t5 = t(j4);
                if (-4611686018427387903L > t5 || t5 >= 4611686018427387904L) {
                    throw new AssertionError(t(j4) + " ms is out of milliseconds range");
                }
                long t6 = t(j4);
                if (-4611686018426L <= t6 && t6 < 4611686018427L) {
                    throw new AssertionError(t(j4) + " ms is denormalized");
                }
            }
        }
        return j4;
    }

    public static boolean i(long j4, Object obj) {
        if ((obj instanceof a) && j4 == ((a) obj).F()) {
            return true;
        }
        return false;
    }

    public static final long j(long j4) {
        if (z(j4)) {
            return E(j4);
        }
        return j4;
    }

    public static final int k(long j4) {
        if (y(j4)) {
            return 0;
        }
        return (int) (m(j4) % ((long) 24));
    }

    public static final long l(long j4) {
        return C(j4, DurationUnit.DAYS);
    }

    public static final long m(long j4) {
        return C(j4, DurationUnit.HOURS);
    }

    public static final long n(long j4) {
        return C(j4, DurationUnit.MINUTES);
    }

    public static final long o(long j4) {
        return C(j4, DurationUnit.SECONDS);
    }

    public static final int p(long j4) {
        if (y(j4)) {
            return 0;
        }
        return (int) (n(j4) % ((long) 60));
    }

    public static final int q(long j4) {
        long t4;
        if (y(j4)) {
            return 0;
        }
        if (w(j4)) {
            t4 = c.n(t(j4) % ((long) 1000));
        } else {
            t4 = t(j4) % ((long) 1000000000);
        }
        return (int) t4;
    }

    public static final int r(long j4) {
        if (y(j4)) {
            return 0;
        }
        return (int) (o(j4) % ((long) 60));
    }

    private static final DurationUnit s(long j4) {
        if (x(j4)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    private static final long t(long j4) {
        return j4 >> 1;
    }

    public static int u(long j4) {
        return t.a(j4);
    }

    public static final boolean v(long j4) {
        return !y(j4);
    }

    private static final boolean w(long j4) {
        if ((((int) j4) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean x(long j4) {
        if ((((int) j4) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean y(long j4) {
        if (j4 == f227d || j4 == f228e) {
            return true;
        }
        return false;
    }

    public static final boolean z(long j4) {
        if (j4 < 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ long F() {
        return this.f229a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((a) obj).F());
    }

    public boolean equals(Object obj) {
        return i(this.f229a, obj);
    }

    public int f(long j4) {
        return g(this.f229a, j4);
    }

    public int hashCode() {
        return u(this.f229a);
    }

    public String toString() {
        return D(this.f229a);
    }
}
