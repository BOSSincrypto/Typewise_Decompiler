package okhttp3;

import Q2.d;
import androidx.work.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import l0.t;

public final class l {

    /* renamed from: j  reason: collision with root package name */
    public static final a f15441j = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f15442k = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f15443l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f15444m = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f15445n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f15446a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15447b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15448c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15449d;

    /* renamed from: e  reason: collision with root package name */
    private final String f15450e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15451f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15452g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15453h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f15454i;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private final int a(String str, int i4, int i5, boolean z3) {
            boolean z4;
            while (i4 < i5) {
                int i6 = i4 + 1;
                char charAt = str.charAt(i4);
                if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt > '9' || '0' > charAt) && ((charAt > 'z' || 'a' > charAt) && ((charAt > 'Z' || 'A' > charAt) && charAt != ':')))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 == (!z3)) {
                    return i4;
                }
                i4 = i6;
            }
            return i5;
        }

        private final boolean b(String str, String str2) {
            if (o.a(str, str2)) {
                return true;
            }
            if (!kotlin.text.o.u(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || d.i(str)) {
                return false;
            }
            return true;
        }

        private final String f(String str) {
            if (!kotlin.text.o.u(str, ".", false, 2, (Object) null)) {
                String e4 = Q2.a.e(kotlin.text.o.m0(str, "."));
                if (e4 != null) {
                    return e4;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long g(String str, int i4, int i5) {
            String str2 = str;
            int i6 = i5;
            int a4 = a(str2, i4, i6, false);
            Matcher matcher = l.f15445n.matcher(str2);
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            while (a4 < i6) {
                int a5 = a(str2, a4 + 1, i6, true);
                matcher.region(a4, a5);
                if (i8 == -1 && matcher.usePattern(l.f15445n).matches()) {
                    String group = matcher.group(1);
                    o.d(group, "matcher.group(1)");
                    i8 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    o.d(group2, "matcher.group(2)");
                    i11 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    o.d(group3, "matcher.group(3)");
                    i12 = Integer.parseInt(group3);
                } else if (i9 == -1 && matcher.usePattern(l.f15444m).matches()) {
                    String group4 = matcher.group(1);
                    o.d(group4, "matcher.group(1)");
                    i9 = Integer.parseInt(group4);
                } else if (i10 == -1 && matcher.usePattern(l.f15443l).matches()) {
                    String group5 = matcher.group(1);
                    o.d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    o.d(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = l.f15443l.pattern();
                    o.d(pattern, "MONTH_PATTERN.pattern()");
                    i10 = kotlin.text.o.V(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i7 == -1 && matcher.usePattern(l.f15442k).matches()) {
                    String group6 = matcher.group(1);
                    o.d(group6, "matcher.group(1)");
                    i7 = Integer.parseInt(group6);
                }
                a4 = a(str2, a5 + 1, i6, false);
            }
            if (70 <= i7 && i7 < 100) {
                i7 += 1900;
            }
            if (i7 >= 0 && i7 < 70) {
                i7 += 2000;
            }
            if (i7 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i10 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (1 > i9 || i9 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i8 < 0 || i8 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i11 < 0 || i11 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            } else {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(d.f1351f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i7);
                gregorianCalendar.set(2, i10 - 1);
                gregorianCalendar.set(5, i9);
                gregorianCalendar.set(11, i8);
                gregorianCalendar.set(12, i11);
                gregorianCalendar.set(13, i12);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e4) {
                if (!new Regex("-?\\d+").matches(str)) {
                    throw e4;
                } else if (kotlin.text.o.G(str, "-", false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        public final l c(t tVar, String str) {
            o.e(tVar, "url");
            o.e(str, "setCookie");
            return d(System.currentTimeMillis(), tVar, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
            if (r1 > 253402300799999L) goto L_0x0105;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0132 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0133  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.l d(long r26, okhttp3.t r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                kotlin.jvm.internal.o.e(r8, r1)
                java.lang.String r1 = "setCookie"
                kotlin.jvm.internal.o.e(r7, r1)
                r5 = 6
                r6 = 0
                r2 = 59
                r3 = 0
                r4 = 0
                r1 = r29
                int r9 = Q2.d.r(r1, r2, r3, r4, r5, r6)
                r5 = 2
                r2 = 61
                r4 = r9
                int r1 = Q2.d.r(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = Q2.d.X(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0035
                goto L_0x003c
            L_0x0035:
                int r5 = Q2.d.y(r11)
                r6 = -1
                if (r5 == r6) goto L_0x003d
            L_0x003c:
                return r2
            L_0x003d:
                int r1 = r1 + r4
                java.lang.String r12 = Q2.d.W(r7, r1, r9)
                int r1 = Q2.d.y(r12)
                if (r1 == r6) goto L_0x0049
                return r2
            L_0x0049:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0061:
                if (r9 >= r1) goto L_0x00d1
                r2 = 59
                int r2 = Q2.d.p(r7, r2, r9, r1)
                r13 = 61
                int r13 = Q2.d.p(r7, r13, r9, r2)
                java.lang.String r9 = Q2.d.W(r7, r9, r13)
                if (r13 >= r2) goto L_0x007c
                int r13 = r13 + 1
                java.lang.String r13 = Q2.d.W(r7, r13, r2)
                goto L_0x007e
            L_0x007c:
                java.lang.String r13 = ""
            L_0x007e:
                java.lang.String r14 = "expires"
                boolean r14 = kotlin.text.o.v(r9, r14, r4)
                if (r14 == 0) goto L_0x0091
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00cd }
                long r23 = r0.g(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00cd }
            L_0x008e:
                r19 = r4
                goto L_0x00cd
            L_0x0091:
                java.lang.String r14 = "max-age"
                boolean r14 = kotlin.text.o.v(r9, r14, r4)
                if (r14 == 0) goto L_0x009e
                long r15 = r0.h(r13)     // Catch:{  }
                goto L_0x008e
            L_0x009e:
                java.lang.String r14 = "domain"
                boolean r14 = kotlin.text.o.v(r9, r14, r4)
                if (r14 == 0) goto L_0x00ad
                java.lang.String r10 = r0.f(r13)     // Catch:{ IllegalArgumentException -> 0x00cd }
                r20 = r3
                goto L_0x00cd
            L_0x00ad:
                java.lang.String r14 = "path"
                boolean r14 = kotlin.text.o.v(r9, r14, r4)
                if (r14 == 0) goto L_0x00b8
                r22 = r13
                goto L_0x00cd
            L_0x00b8:
                java.lang.String r13 = "secure"
                boolean r13 = kotlin.text.o.v(r9, r13, r4)
                if (r13 == 0) goto L_0x00c3
                r17 = r4
                goto L_0x00cd
            L_0x00c3:
                java.lang.String r13 = "httponly"
                boolean r9 = kotlin.text.o.v(r9, r13, r4)
                if (r9 == 0) goto L_0x00cd
                r18 = r4
            L_0x00cd:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0061
            L_0x00d1:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00d9
            L_0x00d7:
                r13 = r1
                goto L_0x0109
            L_0x00d9:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x0107
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00eb
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f0
            L_0x00eb:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f0:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0100
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00d7
                goto L_0x0105
            L_0x0100:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0105:
                r13 = r4
                goto L_0x0109
            L_0x0107:
                r13 = r23
            L_0x0109:
                java.lang.String r1 = r28.i()
                if (r10 != 0) goto L_0x0112
                r15 = r1
                r2 = 0
                goto L_0x011c
            L_0x0112:
                boolean r2 = r0.b(r1, r10)
                if (r2 != 0) goto L_0x011a
                r2 = 0
                return r2
            L_0x011a:
                r2 = 0
                r15 = r10
            L_0x011c:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0133
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f15417e
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.c()
                java.lang.String r1 = r1.c(r15)
                if (r1 != 0) goto L_0x0133
                return r2
            L_0x0133:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0144
                r5 = 2
                boolean r2 = kotlin.text.o.G(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0141
                goto L_0x0144
            L_0x0141:
                r16 = r4
                goto L_0x0160
            L_0x0144:
                java.lang.String r2 = r28.d()
                r9 = 6
                r10 = 0
                r6 = 47
                r7 = 0
                r8 = 0
                r5 = r2
                int r4 = kotlin.text.o.a0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x015e
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.o.d(r1, r2)
            L_0x015e:
                r16 = r1
            L_0x0160:
                okhttp3.l r1 = new okhttp3.l
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.l.a.d(long, okhttp3.t, java.lang.String):okhttp3.l");
        }

        public final List e(t tVar, s sVar) {
            o.e(tVar, "url");
            o.e(sVar, "headers");
            List g4 = sVar.g("Set-Cookie");
            int size = g4.size();
            ArrayList arrayList = null;
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                l c4 = c(tVar, (String) g4.get(i4));
                if (c4 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c4);
                }
                i4 = i5;
            }
            if (arrayList == null) {
                return C0718m.j();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            o.d(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ l(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6, i iVar) {
        this(str, str2, j4, str3, str4, z3, z4, z5, z6);
    }

    public final String e() {
        return this.f15449d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (o.a(lVar.f15446a, this.f15446a) && o.a(lVar.f15447b, this.f15447b) && lVar.f15448c == this.f15448c && o.a(lVar.f15449d, this.f15449d) && o.a(lVar.f15450e, this.f15450e) && lVar.f15451f == this.f15451f && lVar.f15452g == this.f15452g && lVar.f15453h == this.f15453h && lVar.f15454i == this.f15454i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long f() {
        return this.f15448c;
    }

    public final boolean g() {
        return this.f15454i;
    }

    public final boolean h() {
        return this.f15452g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f15446a.hashCode()) * 31) + this.f15447b.hashCode()) * 31) + t.a(this.f15448c)) * 31) + this.f15449d.hashCode()) * 31) + this.f15450e.hashCode()) * 31) + c.a(this.f15451f)) * 31) + c.a(this.f15452g)) * 31) + c.a(this.f15453h)) * 31) + c.a(this.f15454i);
    }

    public final String i() {
        return this.f15446a;
    }

    public final String j() {
        return this.f15450e;
    }

    public final boolean k() {
        return this.f15453h;
    }

    public final boolean l() {
        return this.f15451f;
    }

    public final String m(boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i());
        sb.append('=');
        sb.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(U2.c.b(new Date(f())));
            }
        }
        if (!g()) {
            sb.append("; domain=");
            if (z3) {
                sb.append(".");
            }
            sb.append(e());
        }
        sb.append("; path=");
        sb.append(j());
        if (l()) {
            sb.append("; secure");
        }
        if (h()) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString()");
        return sb2;
    }

    public final String n() {
        return this.f15447b;
    }

    public String toString() {
        return m(false);
    }

    private l(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f15446a = str;
        this.f15447b = str2;
        this.f15448c = j4;
        this.f15449d = str3;
        this.f15450e = str4;
        this.f15451f = z3;
        this.f15452g = z4;
        this.f15453h = z5;
        this.f15454i = z6;
    }
}
