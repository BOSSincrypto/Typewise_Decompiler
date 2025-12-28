package com.ibm.icu.impl.locale;

import Y1.z;

public abstract class a {

    /* renamed from: com.ibm.icu.impl.locale.a$a  reason: collision with other inner class name */
    public static class C0178a {

        /* renamed from: a  reason: collision with root package name */
        private String f12831a;

        /* renamed from: b  reason: collision with root package name */
        private int f12832b;

        public C0178a(String str) {
            this.f12831a = str;
            this.f12832b = a.j(str).hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0178a) {
                return a.b(this.f12831a, ((C0178a) obj).f12831a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12832b;
        }
    }

    public static int a(String str, String str2) {
        if (z.l(str, str2)) {
            return 0;
        }
        return j(str).compareTo(j(str2));
    }

    public static boolean b(String str, String str2) {
        if (z.l(str, str2)) {
            return true;
        }
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            char charAt2 = str2.charAt(i4);
            if (charAt != charAt2 && i(charAt) != i(charAt2)) {
                break;
            }
            i4++;
        }
        if (i4 == length) {
            return true;
        }
        return false;
    }

    public static boolean c(char c4) {
        return (c4 >= 'A' && c4 <= 'Z') || (c4 >= 'a' && c4 <= 'z');
    }

    public static boolean d(char c4) {
        if (c(c4) || g(c4)) {
            return true;
        }
        return false;
    }

    public static boolean e(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (!d(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (!c(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(char c4) {
        return c4 >= '0' && c4 <= '9';
    }

    public static boolean h(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (!g(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static char i(char c4) {
        return (c4 < 'A' || c4 > 'Z') ? c4 : (char) (c4 + ' ');
    }

    public static String j(String str) {
        int i4 = 0;
        while (i4 < str.length() && ((r2 = str.charAt(i4)) < 'A' || r2 > 'Z')) {
            i4++;
        }
        if (i4 == str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.substring(0, i4));
        while (i4 < str.length()) {
            sb.append(i(str.charAt(i4)));
            i4++;
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String k(java.lang.String r4) {
        /*
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0007
            return r4
        L_0x0007:
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 97
            if (r1 < r2) goto L_0x0017
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 <= r2) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r2 = r0
            goto L_0x002a
        L_0x0017:
            r2 = 1
        L_0x0018:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x002a
            r3 = 65
            if (r1 < r3) goto L_0x0027
            r3 = 90
            if (r1 > r3) goto L_0x0027
            goto L_0x002a
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x002a:
            int r1 = r4.length()
            if (r2 != r1) goto L_0x0031
            return r4
        L_0x0031:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = r4.substring(r0, r2)
            r1.<init>(r0)
            if (r2 != 0) goto L_0x0049
            char r0 = r4.charAt(r2)
            char r0 = l(r0)
            r1.append(r0)
        L_0x0047:
            int r2 = r2 + 1
        L_0x0049:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x005b
            char r0 = r4.charAt(r2)
            char r0 = i(r0)
            r1.append(r0)
            goto L_0x0047
        L_0x005b:
            java.lang.String r4 = r1.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.locale.a.k(java.lang.String):java.lang.String");
    }

    public static char l(char c4) {
        return (c4 < 'a' || c4 > 'z') ? c4 : (char) (c4 - ' ');
    }

    public static String m(String str) {
        int i4 = 0;
        while (i4 < str.length() && ((r2 = str.charAt(i4)) < 'a' || r2 > 'z')) {
            i4++;
        }
        if (i4 == str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.substring(0, i4));
        while (i4 < str.length()) {
            sb.append(l(str.charAt(i4)));
            i4++;
        }
        return sb.toString();
    }
}
