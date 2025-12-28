package com.ibm.icu.impl.locale;

import com.ibm.icu.impl.locale.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class f {

    /* renamed from: h  reason: collision with root package name */
    public static String f12862h = "und";

    /* renamed from: i  reason: collision with root package name */
    private static final Map f12863i = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private String f12864a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f12865b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f12866c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f12867d = "";

    /* renamed from: e  reason: collision with root package name */
    private List f12868e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private List f12869f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private List f12870g = Collections.emptyList();

    static {
        String[][] strArr = {new String[]{"art-lojban", "jbo"}, new String[]{"cel-gaulish", "xtg"}, new String[]{"en-GB-oed", "en-GB-x-oed"}, new String[]{"i-ami", "ami"}, new String[]{"i-bnn", "bnn"}, new String[]{"i-default", "en-x-i-default"}, new String[]{"i-enochian", "und-x-i-enochian"}, new String[]{"i-hak", "hak"}, new String[]{"i-klingon", "tlh"}, new String[]{"i-lux", "lb"}, new String[]{"i-mingo", "see-x-i-mingo"}, new String[]{"i-navajo", "nv"}, new String[]{"i-pwn", "pwn"}, new String[]{"i-tao", "tao"}, new String[]{"i-tay", "tay"}, new String[]{"i-tsu", "tsu"}, new String[]{"no-bok", "nb"}, new String[]{"no-nyn", "nn"}, new String[]{"sgn-BE-FR", "sfb"}, new String[]{"sgn-BE-NL", "vgt"}, new String[]{"sgn-CH-DE", "sgg"}, new String[]{"zh-guoyu", "cmn"}, new String[]{"zh-hakka", "hak"}, new String[]{"zh-min", "nan-x-zh-min"}, new String[]{"zh-min-nan", "nan"}, new String[]{"zh-xiang", "hsn"}};
        for (int i4 = 0; i4 < 26; i4++) {
            String[] strArr2 = strArr[i4];
            f12863i.put(new a.C0178a(strArr2[0]), strArr2);
        }
    }

    private f() {
    }

    private boolean A(k kVar, j jVar) {
        if (kVar.e() || jVar.a()) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            if (kVar.e()) {
                break;
            }
            String a4 = kVar.a();
            if (!n(a4)) {
                break;
            }
            int c4 = kVar.c();
            String lowerCase = a4.toLowerCase();
            StringBuilder sb = new StringBuilder(lowerCase);
            kVar.f();
            while (!kVar.e()) {
                String a5 = kVar.a();
                if (!p(a5)) {
                    break;
                }
                sb.append("-");
                sb.append(a5);
                jVar.f12895a = kVar.b();
                kVar.f();
            }
            if (jVar.f12895a <= c4) {
                jVar.f12896b = c4;
                jVar.f12897c = "Incomplete extension '" + lowerCase + "'";
                break;
            }
            if (this.f12870g.size() == 0) {
                this.f12870g = new ArrayList(4);
            }
            Iterator it = this.f12870g.iterator();
            boolean z4 = false;
            while (true) {
                boolean z5 = true;
                if (!it.hasNext()) {
                    break;
                }
                if (((String) it.next()).charAt(0) != sb.charAt(0)) {
                    z5 = false;
                }
                z4 |= z5;
            }
            if (!z4) {
                this.f12870g.add(sb.toString());
            }
            z3 = true;
        }
        return z3;
    }

    private boolean B(k kVar, j jVar) {
        boolean z3 = false;
        if (!kVar.e() && !jVar.a()) {
            while (!kVar.e()) {
                String a4 = kVar.a();
                if (!q(a4)) {
                    break;
                }
                if (this.f12868e.isEmpty()) {
                    this.f12868e = new ArrayList(3);
                }
                this.f12868e.add(a4);
                jVar.f12895a = kVar.b();
                kVar.f();
                z3 = true;
                if (this.f12868e.size() == 3) {
                    break;
                }
            }
        }
        return z3;
    }

    private boolean C(k kVar, j jVar) {
        if (kVar.e() || jVar.a()) {
            return false;
        }
        String a4 = kVar.a();
        if (!r(a4)) {
            return false;
        }
        this.f12864a = a4;
        jVar.f12895a = kVar.b();
        kVar.f();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ibm.icu.impl.locale.f D(com.ibm.icu.impl.locale.b r11, com.ibm.icu.impl.locale.h r12) {
        /*
            com.ibm.icu.impl.locale.f r0 = new com.ibm.icu.impl.locale.f
            r0.<init>()
            java.lang.String r1 = r11.b()
            java.lang.String r2 = r11.d()
            java.lang.String r3 = r11.c()
            java.lang.String r11 = r11.e()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x0043
            boolean r4 = r(r1)
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = "iw"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x002c
            java.lang.String r1 = "he"
            goto L_0x0041
        L_0x002c:
            java.lang.String r4 = "ji"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r1 = "yi"
            goto L_0x0041
        L_0x0037:
            java.lang.String r4 = "in"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.String r1 = "id"
        L_0x0041:
            r0.f12864a = r1
        L_0x0043:
            int r1 = r2.length()
            r4 = 1
            if (r1 <= 0) goto L_0x0058
            boolean r1 = w(r2)
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = e(r2)
            r0.f12865b = r1
            r1 = r4
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r2 = r3.length()
            if (r2 <= 0) goto L_0x006c
            boolean r2 = v(r3)
            if (r2 == 0) goto L_0x006c
            java.lang.String r1 = d(r3)
            r0.f12866c = r1
            r1 = r4
        L_0x006c:
            int r2 = r11.length()
            java.lang.String r3 = "_"
            java.lang.String r5 = "-"
            r6 = 0
            if (r2 <= 0) goto L_0x00e0
            com.ibm.icu.impl.locale.k r2 = new com.ibm.icu.impl.locale.k
            r2.<init>(r11, r3)
            r11 = r6
        L_0x007d:
            boolean r7 = r2.e()
            if (r7 != 0) goto L_0x00a0
            java.lang.String r7 = r2.a()
            boolean r8 = y(r7)
            if (r8 != 0) goto L_0x008e
            goto L_0x00a0
        L_0x008e:
            if (r11 != 0) goto L_0x0095
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0095:
            java.lang.String r7 = f(r7)
            r11.add(r7)
            r2.f()
            goto L_0x007d
        L_0x00a0:
            if (r11 == 0) goto L_0x00a5
            r0.f12869f = r11
            r1 = r4
        L_0x00a5:
            boolean r11 = r2.e()
            if (r11 != 0) goto L_0x00e0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L_0x00b0:
            boolean r7 = r2.e()
            if (r7 != 0) goto L_0x00d5
            java.lang.String r7 = r2.a()
            boolean r8 = u(r7)
            if (r8 != 0) goto L_0x00c1
            goto L_0x00d5
        L_0x00c1:
            int r8 = r11.length()
            if (r8 <= 0) goto L_0x00ca
            r11.append(r5)
        L_0x00ca:
            java.lang.String r7 = com.ibm.icu.impl.locale.a.j(r7)
            r11.append(r7)
            r2.f()
            goto L_0x00b0
        L_0x00d5:
            int r2 = r11.length()
            if (r2 <= 0) goto L_0x00e0
            java.lang.String r11 = r11.toString()
            goto L_0x00e1
        L_0x00e0:
            r11 = r6
        L_0x00e1:
            java.util.Set r2 = r12.c()
            java.util.Iterator r2 = r2.iterator()
            r7 = r6
        L_0x00ea:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x012e
            java.lang.Object r8 = r2.next()
            java.lang.Character r8 = (java.lang.Character) r8
            com.ibm.icu.impl.locale.c r9 = r12.a(r8)
            char r10 = r8.charValue()
            boolean r10 = t(r10)
            if (r10 == 0) goto L_0x0109
            java.lang.String r7 = r9.b()
            goto L_0x00ea
        L_0x0109:
            if (r6 != 0) goto L_0x0110
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0110:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r8 = r8.toString()
            r10.append(r8)
            r10.append(r5)
            java.lang.String r8 = r9.b()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r6.add(r8)
            goto L_0x00ea
        L_0x012e:
            if (r6 == 0) goto L_0x0133
            r0.f12870g = r6
            goto L_0x0134
        L_0x0133:
            r4 = r1
        L_0x0134:
            if (r11 == 0) goto L_0x0168
            if (r7 != 0) goto L_0x014a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "lvariant-"
            r12.append(r1)
            r12.append(r11)
            java.lang.String r7 = r12.toString()
            goto L_0x0168
        L_0x014a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r5)
            java.lang.String r1 = "lvariant"
            r12.append(r1)
            r12.append(r5)
            java.lang.String r11 = r11.replace(r3, r5)
            r12.append(r11)
            java.lang.String r7 = r12.toString()
        L_0x0168:
            if (r7 == 0) goto L_0x016c
            r0.f12867d = r7
        L_0x016c:
            java.lang.String r11 = r0.f12864a
            int r11 = r11.length()
            if (r11 != 0) goto L_0x017c
            if (r4 != 0) goto L_0x0178
            if (r7 != 0) goto L_0x017c
        L_0x0178:
            java.lang.String r11 = f12862h
            r0.f12864a = r11
        L_0x017c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.f.D(com.ibm.icu.impl.locale.b, com.ibm.icu.impl.locale.h):com.ibm.icu.impl.locale.f");
    }

    private boolean E(k kVar, j jVar) {
        if (kVar.e() || jVar.a()) {
            return false;
        }
        String a4 = kVar.a();
        if (!s(a4)) {
            return false;
        }
        int c4 = kVar.c();
        StringBuilder sb = new StringBuilder(a4);
        kVar.f();
        while (!kVar.e()) {
            String a5 = kVar.a();
            if (!u(a5)) {
                break;
            }
            sb.append("-");
            sb.append(a5);
            jVar.f12895a = kVar.b();
            kVar.f();
        }
        if (jVar.f12895a <= c4) {
            jVar.f12896b = c4;
            jVar.f12897c = "Incomplete privateuse";
            return false;
        }
        this.f12867d = sb.toString();
        return true;
    }

    private boolean F(k kVar, j jVar) {
        if (kVar.e() || jVar.a()) {
            return false;
        }
        String a4 = kVar.a();
        if (!v(a4)) {
            return false;
        }
        this.f12866c = a4;
        jVar.f12895a = kVar.b();
        kVar.f();
        return true;
    }

    private boolean G(k kVar, j jVar) {
        if (kVar.e() || jVar.a()) {
            return false;
        }
        String a4 = kVar.a();
        if (!w(a4)) {
            return false;
        }
        this.f12865b = a4;
        jVar.f12895a = kVar.b();
        kVar.f();
        return true;
    }

    private boolean H(k kVar, j jVar) {
        boolean z3 = false;
        if (!kVar.e() && !jVar.a()) {
            while (!kVar.e()) {
                String a4 = kVar.a();
                if (!y(a4)) {
                    break;
                }
                if (this.f12869f.isEmpty()) {
                    this.f12869f = new ArrayList(3);
                }
                String upperCase = a4.toUpperCase();
                if (!this.f12869f.contains(upperCase)) {
                    this.f12869f.add(upperCase);
                }
                jVar.f12895a = kVar.b();
                kVar.f();
                z3 = true;
            }
        }
        return z3;
    }

    public static String a(String str) {
        String j4 = a.j(str);
        if (j4.startsWith("u-")) {
            while (j4.endsWith("-true")) {
                j4 = j4.substring(0, j4.length() - 5);
            }
            while (true) {
                int indexOf = j4.indexOf("-true-");
                if (indexOf <= 0) {
                    break;
                }
                j4 = j4.substring(0, indexOf) + j4.substring(indexOf + 5);
            }
            while (j4.endsWith("-yes")) {
                j4 = j4.substring(0, j4.length() - 4);
            }
            while (true) {
                int indexOf2 = j4.indexOf("-yes-");
                if (indexOf2 <= 0) {
                    break;
                }
                j4 = j4.substring(0, indexOf2) + j4.substring(indexOf2 + 4);
            }
        }
        return j4;
    }

    public static String b(String str) {
        return a.j(str);
    }

    public static String c(String str) {
        return a.j(str);
    }

    public static String d(String str) {
        return a.m(str);
    }

    public static String e(String str) {
        return a.k(str);
    }

    public static String f(String str) {
        return a.j(str);
    }

    public static boolean n(String str) {
        if (str.length() != 1 || !a.e(str) || a.b("x", str)) {
            return false;
        }
        return true;
    }

    public static boolean o(char c4) {
        return n(String.valueOf(c4));
    }

    public static boolean p(String str) {
        if (str.length() < 2 || str.length() > 8 || !a.e(str)) {
            return false;
        }
        return true;
    }

    public static boolean q(String str) {
        if (str.length() != 3 || !a.f(str)) {
            return false;
        }
        return true;
    }

    public static boolean r(String str) {
        if (str.length() < 2 || str.length() > 8 || !a.f(str)) {
            return false;
        }
        return true;
    }

    public static boolean s(String str) {
        if (str.length() != 1 || !a.b("x", str)) {
            return false;
        }
        return true;
    }

    public static boolean t(char c4) {
        return a.b("x", String.valueOf(c4));
    }

    public static boolean u(String str) {
        if (str.length() < 1 || str.length() > 8 || !a.e(str)) {
            return false;
        }
        return true;
    }

    public static boolean v(String str) {
        if ((str.length() != 2 || !a.f(str)) && (str.length() != 3 || !a.h(str))) {
            return false;
        }
        return true;
    }

    public static boolean w(String str) {
        if (str.length() != 4 || !a.f(str)) {
            return false;
        }
        return true;
    }

    public static boolean x(String str) {
        if (str.length() != 2 || !a.c(str.charAt(0)) || !a.g(str.charAt(1))) {
            return false;
        }
        return true;
    }

    public static boolean y(String str) {
        int length = str.length();
        if (length >= 5 && length <= 8) {
            return a.e(str);
        }
        if (length != 4 || !a.g(str.charAt(0)) || !a.d(str.charAt(1)) || !a.d(str.charAt(2)) || !a.d(str.charAt(3))) {
            return false;
        }
        return true;
    }

    public static f z(String str, j jVar) {
        boolean z3;
        k kVar;
        if (jVar == null) {
            jVar = new j();
        } else {
            jVar.b();
        }
        String[] strArr = (String[]) f12863i.get(new a.C0178a(str));
        int i4 = 2;
        while (true) {
            z3 = false;
            if (strArr == null && (i4 = str.indexOf(45, i4 + 1)) != -1) {
                strArr = (String[]) f12863i.get(new a.C0178a(str.substring(0, i4)));
            }
        }
        if (strArr != null) {
            if (strArr[0].length() == str.length()) {
                kVar = new k(strArr[1], "-");
            } else {
                kVar = new k(strArr[1] + str.substring(i4), "-");
            }
            z3 = true;
        } else {
            kVar = new k(str, "-");
        }
        f fVar = new f();
        if (fVar.C(kVar, jVar)) {
            if (fVar.f12864a.length() <= 3) {
                fVar.B(kVar, jVar);
            }
            fVar.G(kVar, jVar);
            fVar.F(kVar, jVar);
            fVar.H(kVar, jVar);
            fVar.A(kVar, jVar);
        }
        fVar.E(kVar, jVar);
        if (z3) {
            jVar.f12895a = str.length();
        } else if (!kVar.e() && !jVar.a()) {
            String a4 = kVar.a();
            jVar.f12896b = kVar.c();
            if (a4.length() == 0) {
                jVar.f12897c = "Empty subtag";
            } else {
                jVar.f12897c = "Invalid subtag: " + a4;
            }
        }
        return fVar;
    }

    public List g() {
        return Collections.unmodifiableList(this.f12870g);
    }

    public List h() {
        return Collections.unmodifiableList(this.f12868e);
    }

    public String i() {
        return this.f12864a;
    }

    public String j() {
        return this.f12867d;
    }

    public String k() {
        return this.f12866c;
    }

    public String l() {
        return this.f12865b;
    }

    public List m() {
        return Collections.unmodifiableList(this.f12869f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f12864a.length() > 0) {
            sb.append(this.f12864a);
            for (String append : this.f12868e) {
                sb.append("-");
                sb.append(append);
            }
            if (this.f12865b.length() > 0) {
                sb.append("-");
                sb.append(this.f12865b);
            }
            if (this.f12866c.length() > 0) {
                sb.append("-");
                sb.append(this.f12866c);
            }
            for (String append2 : this.f12869f) {
                sb.append("-");
                sb.append(append2);
            }
            for (String append3 : this.f12870g) {
                sb.append("-");
                sb.append(append3);
            }
        }
        if (this.f12867d.length() > 0) {
            if (sb.length() > 0) {
                sb.append("-");
            }
            sb.append(this.f12867d);
        }
        return sb.toString();
    }
}
