package okhttp3;

import Q2.d;
import c3.C0500b;
import com.getcapacitor.Bridge;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.uuid.Uuid;
import z2.C0973a;

public final class t {

    /* renamed from: k  reason: collision with root package name */
    public static final b f15488k = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f15489l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    private final String f15490a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15491b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15492c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15493d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15494e;

    /* renamed from: f  reason: collision with root package name */
    private final List f15495f;

    /* renamed from: g  reason: collision with root package name */
    private final List f15496g;

    /* renamed from: h  reason: collision with root package name */
    private final String f15497h;

    /* renamed from: i  reason: collision with root package name */
    private final String f15498i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f15499j;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C0216a f15500i = new C0216a((i) null);

        /* renamed from: a  reason: collision with root package name */
        private String f15501a;

        /* renamed from: b  reason: collision with root package name */
        private String f15502b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f15503c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f15504d;

        /* renamed from: e  reason: collision with root package name */
        private int f15505e = -1;

        /* renamed from: f  reason: collision with root package name */
        private final List f15506f;

        /* renamed from: g  reason: collision with root package name */
        private List f15507g;

        /* renamed from: h  reason: collision with root package name */
        private String f15508h;

        /* renamed from: okhttp3.t$a$a  reason: collision with other inner class name */
        public static final class C0216a {
            public /* synthetic */ C0216a(i iVar) {
                this();
            }

            /* access modifiers changed from: private */
            public final int e(String str, int i4, int i5) {
                try {
                    int parseInt = Integer.parseInt(b.b(t.f15488k, str, i4, i5, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int f(String str, int i4, int i5) {
                while (i4 < i5) {
                    char charAt = str.charAt(i4);
                    if (charAt == '[') {
                        do {
                            i4++;
                            if (i4 >= i5) {
                                break;
                            }
                        } while (str.charAt(i4) == ']');
                    } else if (charAt == ':') {
                        return i4;
                    }
                    i4++;
                }
                return i5;
            }

            /* access modifiers changed from: private */
            public final int g(String str, int i4, int i5) {
                if (i5 - i4 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i4);
                if ((o.f(charAt, 97) < 0 || o.f(charAt, 122) > 0) && (o.f(charAt, 65) < 0 || o.f(charAt, 90) > 0)) {
                    return -1;
                }
                int i6 = i4 + 1;
                while (i6 < i5) {
                    int i7 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if (('a' <= charAt2 && charAt2 < '{') || (('A' <= charAt2 && charAt2 < '[') || (('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i6 = i7;
                    } else if (charAt2 == ':') {
                        return i6;
                    } else {
                        return -1;
                    }
                }
                return -1;
            }

            /* access modifiers changed from: private */
            public final int h(String str, int i4, int i5) {
                int i6 = 0;
                while (i4 < i5) {
                    int i7 = i4 + 1;
                    char charAt = str.charAt(i4);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i6++;
                    i4 = i7;
                }
                return i6;
            }

            private C0216a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f15506f = arrayList;
            arrayList.add("");
        }

        private final int d() {
            int i4 = this.f15505e;
            if (i4 != -1) {
                return i4;
            }
            b bVar = t.f15488k;
            String str = this.f15501a;
            o.b(str);
            return bVar.c(str);
        }

        private final boolean o(String str) {
            if (o.a(str, ".") || kotlin.text.o.v(str, "%2e", true)) {
                return true;
            }
            return false;
        }

        private final boolean p(String str) {
            if (o.a(str, "..") || kotlin.text.o.v(str, "%2e.", true) || kotlin.text.o.v(str, ".%2e", true) || kotlin.text.o.v(str, "%2e%2e", true)) {
                return true;
            }
            return false;
        }

        private final void s() {
            List list = this.f15506f;
            if (((String) list.remove(list.size() - 1)).length() != 0 || this.f15506f.isEmpty()) {
                this.f15506f.add("");
                return;
            }
            List list2 = this.f15506f;
            list2.set(list2.size() - 1, "");
        }

        private final void u(String str, int i4, int i5, boolean z3, boolean z4) {
            String b4 = b.b(t.f15488k, str, i4, i5, " \"<>^`{}|/\\?#", z4, false, false, false, (Charset) null, 240, (Object) null);
            if (!o(b4)) {
                if (p(b4)) {
                    s();
                    return;
                }
                List list = this.f15506f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    List list2 = this.f15506f;
                    list2.set(list2.size() - 1, b4);
                } else {
                    this.f15506f.add(b4);
                }
                if (z3) {
                    this.f15506f.add("");
                }
            }
        }

        private final void w(String str, int i4, int i5) {
            boolean z3;
            if (i4 != i5) {
                char charAt = str.charAt(i4);
                if (charAt == '/' || charAt == '\\') {
                    this.f15506f.clear();
                    this.f15506f.add("");
                    i4++;
                } else {
                    List list = this.f15506f;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i6 = i4;
                    while (true) {
                        if (i6 < i5) {
                            i4 = d.q(str, "/\\", i6, i5);
                            if (i4 < i5) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            u(str, i6, i4, z3, true);
                            if (z3) {
                                i6 = i4 + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void A(List list) {
            this.f15507g = list;
        }

        public final void B(String str) {
            o.e(str, "<set-?>");
            this.f15502b = str;
        }

        public final void C(String str) {
            this.f15504d = str;
        }

        public final void D(int i4) {
            this.f15505e = i4;
        }

        public final void E(String str) {
            this.f15501a = str;
        }

        public final a F(String str) {
            o.e(str, "username");
            B(b.b(t.f15488k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        public final a a(String str, String str2) {
            String str3;
            o.e(str, "encodedName");
            if (i() == null) {
                A(new ArrayList());
            }
            List i4 = i();
            o.b(i4);
            b bVar = t.f15488k;
            i4.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List i5 = i();
            o.b(i5);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null);
            }
            i5.add(str3);
            return this;
        }

        public final a b(String str, String str2) {
            String str3;
            o.e(str, "name");
            if (i() == null) {
                A(new ArrayList());
            }
            List i4 = i();
            o.b(i4);
            b bVar = t.f15488k;
            i4.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List i5 = i();
            o.b(i5);
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null);
            }
            i5.add(str3);
            return this;
        }

        public final t c() {
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f15501a;
            if (str3 != null) {
                b bVar = t.f15488k;
                String g4 = b.g(bVar, this.f15502b, 0, 0, false, 7, (Object) null);
                String g5 = b.g(bVar, this.f15503c, 0, 0, false, 7, (Object) null);
                String str4 = this.f15504d;
                if (str4 != null) {
                    int d4 = d();
                    Iterable<String> iterable = this.f15506f;
                    ArrayList arrayList2 = new ArrayList(C0718m.t(iterable, 10));
                    for (String g6 : iterable) {
                        arrayList2.add(b.g(t.f15488k, g6, 0, 0, false, 7, (Object) null));
                    }
                    List list = this.f15507g;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(C0718m.t(iterable2, 10));
                        for (String str5 : iterable2) {
                            if (str5 == null) {
                                str2 = null;
                            } else {
                                str2 = b.g(t.f15488k, str5, 0, 0, true, 3, (Object) null);
                            }
                            arrayList.add(str2);
                        }
                    }
                    String str6 = this.f15508h;
                    if (str6 == null) {
                        str = null;
                    } else {
                        str = b.g(t.f15488k, str6, 0, 0, false, 7, (Object) null);
                    }
                    return new t(str3, g4, g5, str4, d4, arrayList2, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a e(String str) {
            List list = null;
            if (str != null) {
                b bVar = t.f15488k;
                String b4 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b4 != null) {
                    list = bVar.i(b4);
                }
            }
            A(list);
            return this;
        }

        public final String f() {
            return this.f15508h;
        }

        public final String g() {
            return this.f15503c;
        }

        public final List h() {
            return this.f15506f;
        }

        public final List i() {
            return this.f15507g;
        }

        public final String j() {
            return this.f15502b;
        }

        public final String k() {
            return this.f15504d;
        }

        public final int l() {
            return this.f15505e;
        }

        public final String m() {
            return this.f15501a;
        }

        public final a n(String str) {
            o.e(str, "host");
            String e4 = Q2.a.e(b.g(t.f15488k, str, 0, 0, false, 7, (Object) null));
            if (e4 != null) {
                C(e4);
                return this;
            }
            throw new IllegalArgumentException(o.k("unexpected host: ", str));
        }

        public final a q(t tVar, String str) {
            int i4;
            int q4;
            char c4;
            int i5;
            int i6;
            boolean z3;
            boolean z4;
            String str2 = str;
            o.e(str2, "input");
            int A3 = d.A(str2, 0, 0, 3, (Object) null);
            int C3 = d.C(str2, A3, 0, 2, (Object) null);
            C0216a aVar = f15500i;
            int c5 = aVar.g(str2, A3, C3);
            boolean z5 = true;
            char c6 = 65535;
            if (c5 != -1) {
                if (kotlin.text.o.D(str2, "https:", A3, true)) {
                    this.f15501a = Bridge.CAPACITOR_HTTPS_SCHEME;
                    A3 += 6;
                } else if (kotlin.text.o.D(str2, "http:", A3, true)) {
                    this.f15501a = Bridge.CAPACITOR_HTTP_SCHEME;
                    A3 += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str2.substring(0, c5);
                    o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (tVar != null) {
                this.f15501a = tVar.r();
            } else {
                if (str.length() > 6) {
                    str2 = o.k(kotlin.text.o.W0(str2, 6), "...");
                }
                throw new IllegalArgumentException(o.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
            }
            int d4 = aVar.h(str2, A3, C3);
            char c7 = '?';
            char c8 = '#';
            if (d4 >= 2 || tVar == null || !o.a(tVar.r(), this.f15501a)) {
                boolean z6 = false;
                boolean z7 = false;
                int i7 = A3 + d4;
                while (true) {
                    q4 = d.q(str2, "@/\\?#", i7, C3);
                    if (q4 != C3) {
                        c4 = str2.charAt(q4);
                    } else {
                        c4 = c6;
                    }
                    if (c4 == c6 || c4 == c8 || c4 == '/' || c4 == '\\' || c4 == c7) {
                        int i8 = q4;
                        boolean z8 = z5;
                        i4 = C3;
                        C0216a aVar2 = f15500i;
                        int b4 = aVar2.f(str2, i7, i8);
                        int i9 = b4 + 1;
                    } else if (c4 == '@') {
                        if (!z6) {
                            int p4 = d.p(str2, ':', i7, q4);
                            b bVar = t.f15488k;
                            String str3 = "%40";
                            int i10 = q4;
                            int i11 = p4;
                            z3 = z5;
                            String b5 = b.b(bVar, str, i7, p4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                            if (z7) {
                                b5 = this.f15502b + str3 + b5;
                            }
                            this.f15502b = b5;
                            int i12 = i10;
                            int i13 = i11;
                            if (i13 != i12) {
                                i5 = i12;
                                this.f15503c = b.b(bVar, str, i13 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                z4 = z3;
                            } else {
                                i5 = i12;
                                z4 = z6;
                            }
                            z6 = z4;
                            i6 = C3;
                            z7 = z3;
                        } else {
                            i5 = q4;
                            z3 = z5;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f15503c);
                            sb2.append("%40");
                            i6 = C3;
                            StringBuilder sb3 = sb2;
                            sb3.append(b.b(t.f15488k, str, i7, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                            this.f15503c = sb3.toString();
                        }
                        i7 = i5 + 1;
                        z5 = z3;
                        C3 = i6;
                        c8 = '#';
                        c7 = '?';
                        c6 = 65535;
                    }
                }
                int i82 = q4;
                boolean z82 = z5;
                i4 = C3;
                C0216a aVar22 = f15500i;
                int b42 = aVar22.f(str2, i7, i82);
                int i92 = b42 + 1;
                if (i92 < i82) {
                    this.f15504d = Q2.a.e(b.g(t.f15488k, str, i7, b42, false, 4, (Object) null));
                    int a4 = aVar22.e(str2, i92, i82);
                    this.f15505e = a4;
                    if (a4 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str2.substring(i92, i82);
                        o.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    b bVar2 = t.f15488k;
                    this.f15504d = Q2.a.e(b.g(bVar2, str, i7, b42, false, 4, (Object) null));
                    String str4 = this.f15501a;
                    o.b(str4);
                    this.f15505e = bVar2.c(str4);
                }
                if (this.f15504d != null) {
                    A3 = i82;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str2.substring(i7, b42);
                    o.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f15502b = tVar.g();
                this.f15503c = tVar.c();
                this.f15504d = tVar.i();
                this.f15505e = tVar.n();
                this.f15506f.clear();
                this.f15506f.addAll(tVar.e());
                if (A3 == C3 || str2.charAt(A3) == '#') {
                    e(tVar.f());
                }
                i4 = C3;
            }
            int i14 = i4;
            int q5 = d.q(str2, "?#", A3, i14);
            w(str2, A3, q5);
            if (q5 < i14 && str2.charAt(q5) == '?') {
                int p5 = d.p(str2, '#', q5, i14);
                b bVar3 = t.f15488k;
                this.f15507g = bVar3.i(b.b(bVar3, str, q5 + 1, p5, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                q5 = p5;
            }
            if (q5 < i14 && str2.charAt(q5) == '#') {
                this.f15508h = b.b(t.f15488k, str, q5 + 1, i14, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final a r(String str) {
            o.e(str, "password");
            z(b.b(t.f15488k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null));
            return this;
        }

        public final a t(int i4) {
            if (1 > i4 || i4 >= 65536) {
                throw new IllegalArgumentException(o.k("unexpected port: ", Integer.valueOf(i4)).toString());
            }
            D(i4);
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
            if (r1 != r3.c(r4)) goto L_0x00a9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.m()
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = r6.m()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x001d
            L_0x0018:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x001d:
                java.lang.String r1 = r6.j()
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L_0x002a
                goto L_0x0034
            L_0x002a:
                java.lang.String r1 = r6.g()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0054
            L_0x0034:
                java.lang.String r1 = r6.j()
                r0.append(r1)
                java.lang.String r1 = r6.g()
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x004f
                r0.append(r2)
                java.lang.String r1 = r6.g()
                r0.append(r1)
            L_0x004f:
                r1 = 64
                r0.append(r1)
            L_0x0054:
                java.lang.String r1 = r6.k()
                if (r1 == 0) goto L_0x0083
                java.lang.String r1 = r6.k()
                kotlin.jvm.internal.o.b(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.o.K(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L_0x007c
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.k()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0083
            L_0x007c:
                java.lang.String r1 = r6.k()
                r0.append(r1)
            L_0x0083:
                int r1 = r6.l()
                r3 = -1
                if (r1 != r3) goto L_0x0090
                java.lang.String r1 = r6.m()
                if (r1 == 0) goto L_0x00af
            L_0x0090:
                int r1 = r6.d()
                java.lang.String r3 = r6.m()
                if (r3 == 0) goto L_0x00a9
                okhttp3.t$b r3 = okhttp3.t.f15488k
                java.lang.String r4 = r6.m()
                kotlin.jvm.internal.o.b(r4)
                int r3 = r3.c(r4)
                if (r1 == r3) goto L_0x00af
            L_0x00a9:
                r0.append(r2)
                r0.append(r1)
            L_0x00af:
                okhttp3.t$b r1 = okhttp3.t.f15488k
                java.util.List r2 = r6.h()
                r1.h(r2, r0)
                java.util.List r2 = r6.i()
                if (r2 == 0) goto L_0x00cd
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.i()
                kotlin.jvm.internal.o.b(r2)
                r1.j(r2, r0)
            L_0x00cd:
                java.lang.String r1 = r6.f()
                if (r1 == 0) goto L_0x00df
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f()
                r0.append(r1)
            L_0x00df:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.o.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.t.a.toString():java.lang.String");
        }

        public final a v() {
            String str;
            String str2;
            String k4 = k();
            String str3 = null;
            if (k4 == null) {
                str = null;
            } else {
                str = new Regex("[\"<>^`{|}]").replace((CharSequence) k4, "");
            }
            C(str);
            int size = h().size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                h().set(i5, b.b(t.f15488k, (String) h().get(i5), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List i6 = i();
            if (i6 != null) {
                int size2 = i6.size();
                while (i4 < size2) {
                    int i7 = i4 + 1;
                    String str4 = (String) i6.get(i4);
                    if (str4 == null) {
                        str2 = null;
                    } else {
                        str2 = b.b(t.f15488k, str4, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null);
                    }
                    i6.set(i4, str2);
                    i4 = i7;
                }
            }
            String f4 = f();
            if (f4 != null) {
                str3 = b.b(t.f15488k, f4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            y(str3);
            return this;
        }

        public final a x(String str) {
            o.e(str, "scheme");
            if (kotlin.text.o.v(str, Bridge.CAPACITOR_HTTP_SCHEME, true)) {
                E(Bridge.CAPACITOR_HTTP_SCHEME);
            } else if (kotlin.text.o.v(str, Bridge.CAPACITOR_HTTPS_SCHEME, true)) {
                E(Bridge.CAPACITOR_HTTPS_SCHEME);
            } else {
                throw new IllegalArgumentException(o.k("unexpected scheme: ", str));
            }
            return this;
        }

        public final void y(String str) {
            this.f15508h = str;
        }

        public final void z(String str) {
            o.e(str, "<set-?>");
            this.f15503c = str;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i4, int i5, String str2, boolean z3, boolean z4, boolean z5, boolean z6, Charset charset, int i6, Object obj) {
            int i7;
            int i8;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            Charset charset2;
            int i9 = i6;
            if ((i9 & 1) != 0) {
                i7 = 0;
            } else {
                i7 = i4;
            }
            if ((i9 & 2) != 0) {
                i8 = str.length();
            } else {
                i8 = i5;
            }
            if ((i9 & 8) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            if ((i9 & 16) != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if ((i9 & 32) != 0) {
                z9 = false;
            } else {
                z9 = z5;
            }
            if ((i9 & 64) != 0) {
                z10 = false;
            } else {
                z10 = z6;
            }
            if ((i9 & Uuid.SIZE_BITS) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return bVar.a(str, i7, i8, str2, z7, z8, z9, z10, charset2);
        }

        private final boolean e(String str, int i4, int i5) {
            int i6 = i4 + 2;
            if (i6 >= i5 || str.charAt(i4) != '%' || d.H(str.charAt(i4 + 1)) == -1 || d.H(str.charAt(i6)) == -1) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ String g(b bVar, String str, int i4, int i5, boolean z3, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z3 = false;
            }
            return bVar.f(str, i4, i5, z3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
            if (e(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void k(c3.C0500b r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.f0(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x004a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x004a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004e
                if (r23 == 0) goto L_0x004a
                goto L_0x004e
            L_0x004a:
                r8 = r14
                r12 = r19
                goto L_0x006f
            L_0x004e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.o.K(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0069
                if (r7 != r9) goto L_0x0067
                if (r20 == 0) goto L_0x0069
                if (r21 == 0) goto L_0x0067
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x006b
                goto L_0x006f
            L_0x0067:
                r8 = r14
                goto L_0x006b
            L_0x0069:
                r8 = r14
                goto L_0x006f
            L_0x006b:
                r15.M0(r7)
                goto L_0x00b5
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                c3.b r6 = new c3.b
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.o.a(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.J0(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.M0(r7)
            L_0x008d:
                boolean r10 = r6.H()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.I(r9)
                char[] r13 = okhttp3.t.f15489l
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.I(r11)
                char[] r11 = okhttp3.t.f15489l
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.I(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.t.b.k(c3.b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void l(C0500b bVar, String str, int i4, int i5, boolean z3) {
            int i6;
            while (i4 < i5) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt == 37 && (i6 = i4 + 2) < i5) {
                    int H3 = d.H(str.charAt(i4 + 1));
                    int H4 = d.H(str.charAt(i6));
                    if (!(H3 == -1 || H4 == -1)) {
                        bVar.I((H3 << 4) + H4);
                        i4 = Character.charCount(codePointAt) + i6;
                    }
                } else if (codePointAt == 43 && z3) {
                    bVar.I(32);
                    i4++;
                }
                bVar.M0(codePointAt);
                i4 += Character.charCount(codePointAt);
            }
        }

        public final String a(String str, int i4, int i5, String str2, boolean z3, boolean z4, boolean z5, boolean z6, Charset charset) {
            String str3 = str;
            int i6 = i5;
            String str4 = str2;
            o.e(str, "<this>");
            o.e(str4, "encodeSet");
            int i7 = i4;
            while (i7 < i6) {
                int codePointAt = str.codePointAt(i7);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z6) && !kotlin.text.o.K(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z3) {
                            if (z4) {
                                if (!e(str, i7, i6)) {
                                    C0500b bVar = new C0500b();
                                    int i8 = i4;
                                    bVar.L0(str, i4, i7);
                                    k(bVar, str, i7, i5, str2, z3, z4, z5, z6, charset);
                                    return bVar.s0();
                                }
                                if (codePointAt == 43 || !z5) {
                                    i7 += Character.charCount(codePointAt);
                                } else {
                                    C0500b bVar2 = new C0500b();
                                    int i82 = i4;
                                    bVar2.L0(str, i4, i7);
                                    k(bVar2, str, i7, i5, str2, z3, z4, z5, z6, charset);
                                    return bVar2.s0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i7 += Character.charCount(codePointAt);
                }
                C0500b bVar22 = new C0500b();
                int i822 = i4;
                bVar22.L0(str, i4, i7);
                k(bVar22, str, i7, i5, str2, z3, z4, z5, z6, charset);
                return bVar22.s0();
            }
            int i9 = i4;
            String substring = str.substring(i4, i5);
            o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            o.e(str, "scheme");
            if (o.a(str, Bridge.CAPACITOR_HTTP_SCHEME)) {
                return 80;
            }
            if (o.a(str, Bridge.CAPACITOR_HTTPS_SCHEME)) {
                return 443;
            }
            return -1;
        }

        public final t d(String str) {
            o.e(str, "<this>");
            return new a().q((t) null, str).c();
        }

        public final String f(String str, int i4, int i5, boolean z3) {
            o.e(str, "<this>");
            int i6 = i4;
            while (i6 < i5) {
                int i7 = i6 + 1;
                char charAt = str.charAt(i6);
                if (charAt == '%' || (charAt == '+' && z3)) {
                    C0500b bVar = new C0500b();
                    bVar.L0(str, i4, i6);
                    l(bVar, str, i6, i5, z3);
                    return bVar.s0();
                }
                i6 = i7;
            }
            String substring = str.substring(i4, i5);
            o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void h(List list, StringBuilder sb) {
            o.e(list, "<this>");
            o.e(sb, "out");
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append('/');
                sb.append((String) list.get(i4));
            }
        }

        public final List i(String str) {
            o.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                int U3 = kotlin.text.o.U(str, '&', i4, false, 4, (Object) null);
                if (U3 == -1) {
                    U3 = str.length();
                }
                int i5 = U3;
                int U4 = kotlin.text.o.U(str, '=', i4, false, 4, (Object) null);
                if (U4 == -1 || U4 > i5) {
                    String substring = str.substring(i4, i5);
                    o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i4, U4);
                    o.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(U4 + 1, i5);
                    o.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i4 = i5 + 1;
            }
            return arrayList;
        }

        public final void j(List list, StringBuilder sb) {
            o.e(list, "<this>");
            o.e(sb, "out");
            C0973a i4 = z2.d.i(z2.d.j(0, list.size()), 2);
            int b4 = i4.b();
            int c4 = i4.c();
            int d4 = i4.d();
            if ((d4 > 0 && b4 <= c4) || (d4 < 0 && c4 <= b4)) {
                while (true) {
                    int i5 = b4 + d4;
                    String str = (String) list.get(b4);
                    String str2 = (String) list.get(b4 + 1);
                    if (b4 > 0) {
                        sb.append('&');
                    }
                    sb.append(str);
                    if (str2 != null) {
                        sb.append('=');
                        sb.append(str2);
                    }
                    if (b4 != c4) {
                        b4 = i5;
                    } else {
                        return;
                    }
                }
            }
        }

        private b() {
        }
    }

    public t(String str, String str2, String str3, String str4, int i4, List list, List list2, String str5, String str6) {
        o.e(str, "scheme");
        o.e(str2, "username");
        o.e(str3, "password");
        o.e(str4, "host");
        o.e(list, "pathSegments");
        o.e(str6, "url");
        this.f15490a = str;
        this.f15491b = str2;
        this.f15492c = str3;
        this.f15493d = str4;
        this.f15494e = i4;
        this.f15495f = list;
        this.f15496g = list2;
        this.f15497h = str5;
        this.f15498i = str6;
        this.f15499j = o.a(str, Bridge.CAPACITOR_HTTPS_SCHEME);
    }

    public static final t h(String str) {
        return f15488k.d(str);
    }

    public final String b() {
        if (this.f15497h == null) {
            return null;
        }
        String substring = this.f15498i.substring(kotlin.text.o.U(this.f15498i, '#', 0, false, 6, (Object) null) + 1);
        o.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f15492c.length() == 0) {
            return "";
        }
        int U3 = kotlin.text.o.U(this.f15498i, '@', 0, false, 6, (Object) null);
        String substring = this.f15498i.substring(kotlin.text.o.U(this.f15498i, ':', this.f15490a.length() + 3, false, 4, (Object) null) + 1, U3);
        o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int U3 = kotlin.text.o.U(this.f15498i, '/', this.f15490a.length() + 3, false, 4, (Object) null);
        String str = this.f15498i;
        String substring = this.f15498i.substring(U3, d.q(str, "?#", U3, str.length()));
        o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List e() {
        int U3 = kotlin.text.o.U(this.f15498i, '/', this.f15490a.length() + 3, false, 4, (Object) null);
        String str = this.f15498i;
        int q4 = d.q(str, "?#", U3, str.length());
        ArrayList arrayList = new ArrayList();
        while (U3 < q4) {
            int i4 = U3 + 1;
            int p4 = d.p(this.f15498i, '/', i4, q4);
            String substring = this.f15498i.substring(i4, p4);
            o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            U3 = p4;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t) || !o.a(((t) obj).f15498i, this.f15498i)) {
            return false;
        }
        return true;
    }

    public final String f() {
        if (this.f15496g == null) {
            return null;
        }
        int U3 = kotlin.text.o.U(this.f15498i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f15498i;
        String substring = this.f15498i.substring(U3, d.p(str, '#', U3, str.length()));
        o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f15491b.length() == 0) {
            return "";
        }
        int length = this.f15490a.length() + 3;
        String str = this.f15498i;
        String substring = this.f15498i.substring(length, d.q(str, ":@", length, str.length()));
        o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f15498i.hashCode();
    }

    public final String i() {
        return this.f15493d;
    }

    public final boolean j() {
        return this.f15499j;
    }

    public final a k() {
        int i4;
        a aVar = new a();
        aVar.E(this.f15490a);
        aVar.B(g());
        aVar.z(c());
        aVar.C(this.f15493d);
        if (this.f15494e != f15488k.c(this.f15490a)) {
            i4 = this.f15494e;
        } else {
            i4 = -1;
        }
        aVar.D(i4);
        aVar.h().clear();
        aVar.h().addAll(e());
        aVar.e(f());
        aVar.y(b());
        return aVar;
    }

    public final a l(String str) {
        o.e(str, "link");
        try {
            return new a().q(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List m() {
        return this.f15495f;
    }

    public final int n() {
        return this.f15494e;
    }

    public final String o() {
        if (this.f15496g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f15488k.j(this.f15496g, sb);
        return sb.toString();
    }

    public final String p() {
        a l4 = l("/...");
        o.b(l4);
        return l4.F("").r("").c().toString();
    }

    public final t q(String str) {
        o.e(str, "link");
        a l4 = l(str);
        if (l4 == null) {
            return null;
        }
        return l4.c();
    }

    public final String r() {
        return this.f15490a;
    }

    public final URI s() {
        String aVar = k().v().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e4) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace((CharSequence) aVar, ""));
                o.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final URL t() {
        try {
            return new URL(this.f15498i);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        return this.f15498i;
    }
}
