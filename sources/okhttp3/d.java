package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final b f15173n = new b((i) null);

    /* renamed from: o  reason: collision with root package name */
    public static final d f15174o = new a().d().a();

    /* renamed from: p  reason: collision with root package name */
    public static final d f15175p = new a().e().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15176a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15177b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15178c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15179d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15180e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15181f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15182g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15183h;

    /* renamed from: i  reason: collision with root package name */
    private final int f15184i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f15185j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f15186k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15187l;

    /* renamed from: m  reason: collision with root package name */
    private String f15188m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15189a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15190b;

        /* renamed from: c  reason: collision with root package name */
        private int f15191c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f15192d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f15193e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15194f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f15195g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15196h;

        private final int b(long j4) {
            if (j4 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j4;
        }

        public final d a() {
            return new d(this.f15189a, this.f15190b, this.f15191c, -1, false, false, false, this.f15192d, this.f15193e, this.f15194f, this.f15195g, this.f15196h, (String) null, (i) null);
        }

        public final a c(int i4, TimeUnit timeUnit) {
            o.e(timeUnit, "timeUnit");
            if (i4 >= 0) {
                this.f15192d = b(timeUnit.toSeconds((long) i4));
                return this;
            }
            throw new IllegalArgumentException(o.k("maxStale < 0: ", Integer.valueOf(i4)).toString());
        }

        public final a d() {
            this.f15189a = true;
            return this;
        }

        public final a e() {
            this.f15194f = true;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private final int a(String str, String str2, int i4) {
            int length = str.length();
            while (i4 < length) {
                int i5 = i4 + 1;
                if (kotlin.text.o.K(str2, str.charAt(i4), false, 2, (Object) null)) {
                    return i4;
                }
                i4 = i5;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.d b(okhttp3.s r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.o.e(r1, r2)
                int r2 = r31.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0189
                int r22 = r7 + 1
                java.lang.String r3 = r1.c(r7)
                java.lang.String r7 = r1.f(r7)
                java.lang.String r6 = "Cache-Control"
                boolean r6 = kotlin.text.o.v(r3, r6, r5)
                if (r6 == 0) goto L_0x003d
                if (r9 == 0) goto L_0x003b
            L_0x0039:
                r8 = 0
                goto L_0x0046
            L_0x003b:
                r9 = r7
                goto L_0x0046
            L_0x003d:
                java.lang.String r6 = "Pragma"
                boolean r3 = kotlin.text.o.v(r3, r6, r5)
                if (r3 == 0) goto L_0x0182
                goto L_0x0039
            L_0x0046:
                r3 = 0
            L_0x0047:
                int r6 = r7.length()
                if (r3 >= r6) goto L_0x0182
                java.lang.String r6 = "=,;"
                int r6 = r0.a(r7, r6, r3)
                java.lang.String r3 = r7.substring(r3, r6)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.o.d(r3, r4)
                java.lang.CharSequence r3 = kotlin.text.o.M0(r3)
                java.lang.String r3 = r3.toString()
                int r5 = r7.length()
                if (r6 == r5) goto L_0x00c1
                char r5 = r7.charAt(r6)
                r1 = 44
                if (r5 == r1) goto L_0x00c1
                char r1 = r7.charAt(r6)
                r5 = 59
                if (r1 != r5) goto L_0x007b
                goto L_0x00c1
            L_0x007b:
                int r6 = r6 + 1
                int r1 = Q2.d.D(r7, r6)
                int r5 = r7.length()
                if (r1 >= r5) goto L_0x00ab
                char r5 = r7.charAt(r1)
                r6 = 34
                if (r5 != r6) goto L_0x00ab
                int r1 = r1 + 1
                r28 = 4
                r29 = 0
                r25 = 34
                r27 = 0
                r24 = r7
                r26 = r1
                int r5 = kotlin.text.o.U(r24, r25, r26, r27, r28, r29)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.o.d(r1, r4)
                r4 = 1
                int r5 = r5 + r4
                goto L_0x00c5
            L_0x00ab:
                java.lang.String r5 = ",;"
                int r5 = r0.a(r7, r5, r1)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.o.d(r1, r4)
                java.lang.CharSequence r1 = kotlin.text.o.M0(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c5
            L_0x00c1:
                int r6 = r6 + 1
                r5 = r6
                r1 = 0
            L_0x00c5:
                java.lang.String r4 = "no-cache"
                r6 = 1
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x00d5
                r1 = r31
                r3 = r5
                r5 = r6
                r10 = r5
                goto L_0x0047
            L_0x00d5:
                java.lang.String r4 = "no-store"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x00e4
                r1 = r31
                r3 = r5
                r5 = r6
                r11 = r5
                goto L_0x0047
            L_0x00e4:
                java.lang.String r4 = "max-age"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x00f7
                r4 = -1
                int r12 = Q2.d.V(r1, r4)
            L_0x00f1:
                r1 = r31
                r3 = r5
                r5 = r6
                goto L_0x0047
            L_0x00f7:
                java.lang.String r4 = "s-maxage"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0105
                r4 = -1
                int r13 = Q2.d.V(r1, r4)
                goto L_0x00f1
            L_0x0105:
                java.lang.String r4 = "private"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0114
                r1 = r31
                r3 = r5
                r5 = r6
                r14 = r5
                goto L_0x0047
            L_0x0114:
                java.lang.String r4 = "public"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0123
                r1 = r31
                r3 = r5
                r5 = r6
                r15 = r5
                goto L_0x0047
            L_0x0123:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0133
                r1 = r31
                r3 = r5
                r5 = r6
                r16 = r5
                goto L_0x0047
            L_0x0133:
                java.lang.String r4 = "max-stale"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0143
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = Q2.d.V(r1, r3)
                goto L_0x00f1
            L_0x0143:
                java.lang.String r4 = "min-fresh"
                boolean r4 = kotlin.text.o.v(r4, r3, r6)
                if (r4 == 0) goto L_0x0151
                r4 = -1
                int r18 = Q2.d.V(r1, r4)
                goto L_0x00f1
            L_0x0151:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = kotlin.text.o.v(r1, r3, r6)
                if (r1 == 0) goto L_0x0162
                r1 = r31
                r3 = r5
                r5 = r6
                r19 = r5
                goto L_0x0047
            L_0x0162:
                java.lang.String r1 = "no-transform"
                boolean r1 = kotlin.text.o.v(r1, r3, r6)
                if (r1 == 0) goto L_0x0172
                r1 = r31
                r3 = r5
                r5 = r6
                r20 = r5
                goto L_0x0047
            L_0x0172:
                java.lang.String r1 = "immutable"
                boolean r1 = kotlin.text.o.v(r1, r3, r6)
                if (r1 == 0) goto L_0x00f1
                r1 = r31
                r3 = r5
                r5 = r6
                r21 = r5
                goto L_0x0047
            L_0x0182:
                r4 = -1
                r1 = r31
                r7 = r22
                goto L_0x0023
            L_0x0189:
                if (r8 != 0) goto L_0x018e
                r22 = 0
                goto L_0x0190
            L_0x018e:
                r22 = r9
            L_0x0190:
                okhttp3.d r1 = new okhttp3.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.d.b.b(okhttp3.s):okhttp3.d");
        }

        private b() {
        }
    }

    public /* synthetic */ d(boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str, i iVar) {
        this(z3, z4, i4, i5, z5, z6, z7, i6, i7, z8, z9, z10, str);
    }

    public final boolean a() {
        return this.f15187l;
    }

    public final boolean b() {
        return this.f15180e;
    }

    public final boolean c() {
        return this.f15181f;
    }

    public final int d() {
        return this.f15178c;
    }

    public final int e() {
        return this.f15183h;
    }

    public final int f() {
        return this.f15184i;
    }

    public final boolean g() {
        return this.f15182g;
    }

    public final boolean h() {
        return this.f15176a;
    }

    public final boolean i() {
        return this.f15177b;
    }

    public final boolean j() {
        return this.f15186k;
    }

    public final boolean k() {
        return this.f15185j;
    }

    public final int l() {
        return this.f15179d;
    }

    public String toString() {
        String str = this.f15188m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (h()) {
            sb.append("no-cache, ");
        }
        if (i()) {
            sb.append("no-store, ");
        }
        if (d() != -1) {
            sb.append("max-age=");
            sb.append(d());
            sb.append(", ");
        }
        if (l() != -1) {
            sb.append("s-maxage=");
            sb.append(l());
            sb.append(", ");
        }
        if (b()) {
            sb.append("private, ");
        }
        if (c()) {
            sb.append("public, ");
        }
        if (g()) {
            sb.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb.append("max-stale=");
            sb.append(e());
            sb.append(", ");
        }
        if (f() != -1) {
            sb.append("min-fresh=");
            sb.append(f());
            sb.append(", ");
        }
        if (k()) {
            sb.append("only-if-cached, ");
        }
        if (j()) {
            sb.append("no-transform, ");
        }
        if (a()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f15188m = sb2;
        return sb2;
    }

    private d(boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str) {
        this.f15176a = z3;
        this.f15177b = z4;
        this.f15178c = i4;
        this.f15179d = i5;
        this.f15180e = z5;
        this.f15181f = z6;
        this.f15182g = z7;
        this.f15183h = i6;
        this.f15184i = i7;
        this.f15185j = z8;
        this.f15186k = z9;
        this.f15187l = z10;
        this.f15188m = str;
    }
}
