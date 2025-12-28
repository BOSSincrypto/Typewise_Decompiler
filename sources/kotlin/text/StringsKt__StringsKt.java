package kotlin.text;

import B2.e;
import B2.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.g;
import z2.C0973a;
import z2.c;
import z2.d;

abstract class StringsKt__StringsKt extends w {
    public static final String A0(CharSequence charSequence, c cVar) {
        o.e(charSequence, "<this>");
        o.e(cVar, "range");
        return charSequence.subSequence(cVar.h().intValue(), cVar.g().intValue() + 1).toString();
    }

    public static String B0(String str, char c4, String str2) {
        o.e(str, "<this>");
        o.e(str2, "missingDelimiterValue");
        int U3 = o.U(str, c4, 0, false, 6, (Object) null);
        if (U3 == -1) {
            return str2;
        }
        String substring = str.substring(U3 + 1, str.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public static final String C0(String str, String str2, String str3) {
        o.e(str, "<this>");
        o.e(str2, "delimiter");
        o.e(str3, "missingDelimiterValue");
        int V3 = o.V(str, str2, 0, false, 6, (Object) null);
        if (V3 == -1) {
            return str3;
        }
        String substring = str.substring(V3 + str2.length(), str.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String D0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return o.B0(str, c4, str2);
    }

    public static /* synthetic */ String E0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return C0(str, str2, str3);
    }

    public static final String F0(String str, char c4, String str2) {
        o.e(str, "<this>");
        o.e(str2, "missingDelimiterValue");
        int a02 = o.a0(str, c4, 0, false, 6, (Object) null);
        if (a02 == -1) {
            return str2;
        }
        String substring = str.substring(a02 + 1, str.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String G0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return F0(str, c4, str2);
    }

    public static final String H0(String str, char c4, String str2) {
        o.e(str, "<this>");
        o.e(str2, "missingDelimiterValue");
        int U3 = o.U(str, c4, 0, false, 6, (Object) null);
        if (U3 == -1) {
            return str2;
        }
        String substring = str.substring(0, U3);
        o.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean I(CharSequence charSequence, char c4, boolean z3) {
        o.e(charSequence, "<this>");
        if (o.U(charSequence, c4, 0, z3, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String I0(String str, String str2, String str3) {
        o.e(str, "<this>");
        o.e(str2, "delimiter");
        o.e(str3, "missingDelimiterValue");
        int V3 = o.V(str, str2, 0, false, 6, (Object) null);
        if (V3 == -1) {
            return str3;
        }
        String substring = str.substring(0, V3);
        o.d(substring, "substring(...)");
        return substring;
    }

    public static final boolean J(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (o.V(charSequence, (String) charSequence2, 0, z3, 2, (Object) null) < 0) {
                return false;
            }
        } else {
            if (T(charSequence, charSequence2, 0, charSequence.length(), z3, false, 16, (Object) null) < 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String J0(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return H0(str, c4, str2);
    }

    public static /* synthetic */ boolean K(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return I(charSequence, c4, z3);
    }

    public static /* synthetic */ String K0(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return I0(str, str2, str3);
    }

    public static /* synthetic */ boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return J(charSequence, charSequence2, z3);
    }

    public static Boolean L0(String str) {
        o.e(str, "<this>");
        if (o.a(str, "true")) {
            return Boolean.TRUE;
        }
        if (o.a(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(charSequence2, "suffix");
        if (!z3 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o.u((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return l0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z3);
    }

    public static CharSequence M0(CharSequence charSequence) {
        int i4;
        o.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean d4 = C0721a.d(charSequence.charAt(i4));
            if (!z3) {
                if (!d4) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else if (!d4) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return M(charSequence, charSequence2, z3);
    }

    public static String N0(String str, char... cArr) {
        int i4;
        o.e(str, "<this>");
        o.e(cArr, "chars");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean r4 = C0713h.r(cArr, str.charAt(i4));
            if (!z3) {
                if (!r4) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else if (!r4) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    /* access modifiers changed from: private */
    public static final Pair O(CharSequence charSequence, Collection collection, int i4, boolean z3, boolean z4) {
        C0973a aVar;
        Object obj;
        Object obj2;
        int i5;
        if (z3 || collection.size() != 1) {
            if (!z4) {
                aVar = new c(d.b(i4, 0), charSequence.length());
            } else {
                aVar = d.h(d.d(i4, o.P(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int b4 = aVar.b();
                int c4 = aVar.c();
                int d4 = aVar.d();
                if ((d4 > 0 && b4 <= c4) || (d4 < 0 && c4 <= b4)) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (o.x(str, 0, (String) charSequence, b4, str.length(), z3)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (b4 == c4) {
                                break;
                            }
                            b4 += d4;
                        } else {
                            return g.a(Integer.valueOf(b4), str2);
                        }
                    }
                }
            } else {
                int b5 = aVar.b();
                int c5 = aVar.c();
                int d5 = aVar.d();
                if ((d5 > 0 && b5 <= c5) || (d5 < 0 && c5 <= b5)) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (l0(str3, 0, charSequence, b5, str3.length(), z3)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (b5 == c5) {
                                break;
                            }
                            b5 += d5;
                        } else {
                            return g.a(Integer.valueOf(b5), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C0718m.l0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i6 = i4;
        if (!z4) {
            i5 = o.V(charSequence2, str6, i6, false, 4, (Object) null);
        } else {
            i5 = o.b0(charSequence2, str6, i6, false, 4, (Object) null);
        }
        if (i5 < 0) {
            return null;
        }
        return g.a(Integer.valueOf(i5), str5);
    }

    public static CharSequence O0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!C0721a.d(charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    public static int P(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String P0(String str, char... cArr) {
        Object obj;
        o.e(str, "<this>");
        o.e(cArr, "chars");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                obj = "";
                break;
            } else if (!C0713h.r(cArr, str.charAt(i4))) {
                obj = str.subSequence(i4, str.length());
                break;
            } else {
                i4++;
            }
        }
        return obj.toString();
    }

    public static final int Q(CharSequence charSequence, char c4, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c4, i4);
        }
        return W(charSequence, new char[]{c4}, i4, z3);
    }

    public static final int R(CharSequence charSequence, String str, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(str, "string");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i4);
        }
        return T(charSequence, str, i4, charSequence.length(), z3, false, 16, (Object) null);
    }

    private static final int S(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4) {
        C0973a aVar;
        if (!z4) {
            aVar = new c(d.b(i4, 0), d.d(i5, charSequence.length()));
        } else {
            aVar = d.h(d.d(i4, o.P(charSequence)), d.b(i5, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b4 = aVar.b();
            int c4 = aVar.c();
            int d4 = aVar.d();
            if ((d4 <= 0 || b4 > c4) && (d4 >= 0 || c4 > b4)) {
                return -1;
            }
            while (true) {
                if (l0(charSequence2, 0, charSequence, b4, charSequence2.length(), z3)) {
                    return b4;
                }
                if (b4 == c4) {
                    return -1;
                }
                b4 += d4;
            }
        } else {
            int b5 = aVar.b();
            int c5 = aVar.c();
            int d5 = aVar.d();
            if ((d5 <= 0 || b5 > c5) && (d5 >= 0 || c5 > b5)) {
                return -1;
            }
            while (true) {
                if (o.x((String) charSequence2, 0, (String) charSequence, b5, charSequence2.length(), z3)) {
                    return b5;
                }
                if (b5 == c5) {
                    return -1;
                }
                b5 += d5;
            }
        }
    }

    static /* synthetic */ int T(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z4 = false;
        }
        return S(charSequence, charSequence2, i4, i5, z3, z4);
    }

    public static /* synthetic */ int U(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return Q(charSequence, c4, i4, z3);
    }

    public static /* synthetic */ int V(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return R(charSequence, str, i4, z3);
    }

    public static final int W(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(cArr, "chars");
        if (z3 || cArr.length != 1 || !(charSequence instanceof String)) {
            int b4 = d.b(i4, 0);
            int P3 = o.P(charSequence);
            if (b4 > P3) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(b4);
                for (char g4 : cArr) {
                    if (C0723c.g(g4, charAt, z3)) {
                        return b4;
                    }
                }
                if (b4 == P3) {
                    return -1;
                }
                b4++;
            }
        } else {
            return ((String) charSequence).indexOf(C0713h.V(cArr), i4);
        }
    }

    public static boolean X(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!C0721a.d(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final int Y(CharSequence charSequence, char c4, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        if (!z3 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c4, i4);
        }
        return c0(charSequence, new char[]{c4}, i4, z3);
    }

    public static final int Z(CharSequence charSequence, String str, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(str, "string");
        if (z3 || !(charSequence instanceof String)) {
            return S(charSequence, str, i4, 0, z3, true);
        }
        return ((String) charSequence).lastIndexOf(str, i4);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = o.P(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return Y(charSequence, c4, i4, z3);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = o.P(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return Z(charSequence, str, i4, z3);
    }

    public static final int c0(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(cArr, "chars");
        if (z3 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d4 = d.d(i4, o.P(charSequence)); -1 < d4; d4--) {
                char charAt = charSequence.charAt(d4);
                for (char g4 : cArr) {
                    if (C0723c.g(g4, charAt, z3)) {
                        return d4;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C0713h.V(cArr), i4);
    }

    public static final e d0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        return v0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List e0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        return h.o(d0(charSequence));
    }

    public static final CharSequence f0(CharSequence charSequence, int i4, char c4) {
        o.e(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
        } else if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i4);
            int length = i4 - charSequence.length();
            int i5 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c4);
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String g0(String str, int i4, char c4) {
        o.e(str, "<this>");
        return f0(str, i4, c4).toString();
    }

    private static final e h0(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5) {
        o0(i5);
        return new C0725e(charSequence, i4, i5, new StringsKt__StringsKt$rangesDelimitedBy$1(cArr, z3));
    }

    private static final e i0(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5) {
        o0(i5);
        return new C0725e(charSequence, i4, i5, new StringsKt__StringsKt$rangesDelimitedBy$2(C0713h.c(strArr), z3));
    }

    static /* synthetic */ e j0(CharSequence charSequence, char[] cArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return h0(charSequence, cArr, i4, z3, i5);
    }

    static /* synthetic */ e k0(CharSequence charSequence, String[] strArr, int i4, boolean z3, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z3 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return i0(charSequence, strArr, i4, z3, i5);
    }

    public static final boolean l0(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(charSequence2, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!C0723c.g(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z3)) {
                return false;
            }
        }
        return true;
    }

    public static String m0(String str, CharSequence charSequence) {
        o.e(str, "<this>");
        o.e(charSequence, "prefix");
        if (!z0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public static String n0(String str, CharSequence charSequence) {
        o.e(str, "<this>");
        o.e(charSequence, "suffix");
        if (!N(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public static final void o0(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i4).toString());
        }
    }

    public static final List p0(CharSequence charSequence, char[] cArr, boolean z3, int i4) {
        o.e(charSequence, "<this>");
        o.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return r0(charSequence, String.valueOf(cArr[0]), z3, i4);
        }
        Iterable<c> f4 = h.f(j0(charSequence, cArr, 0, z3, i4, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C0718m.t(f4, 10));
        for (c A02 : f4) {
            arrayList.add(A0(charSequence, A02));
        }
        return arrayList;
    }

    public static final List q0(CharSequence charSequence, String[] strArr, boolean z3, int i4) {
        o.e(charSequence, "<this>");
        o.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return r0(charSequence, str, z3, i4);
            }
        }
        Iterable<c> f4 = h.f(k0(charSequence, strArr, 0, z3, i4, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C0718m.t(f4, 10));
        for (c A02 : f4) {
            arrayList.add(A0(charSequence, A02));
        }
        return arrayList;
    }

    private static final List r0(CharSequence charSequence, String str, boolean z3, int i4) {
        boolean z4;
        o0(i4);
        int i5 = 0;
        int R3 = R(charSequence, str, 0, z3);
        if (R3 == -1 || i4 == 1) {
            return C0718m.e(charSequence.toString());
        }
        if (i4 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i6 = 10;
        if (z4) {
            i6 = d.d(i4, 10);
        }
        ArrayList arrayList = new ArrayList(i6);
        do {
            arrayList.add(charSequence.subSequence(i5, R3).toString());
            i5 = str.length() + R3;
            if ((z4 && arrayList.size() == i4 - 1) || (R3 = R(charSequence, str, i5, z3)) == -1) {
                arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i5, R3).toString());
            i5 = str.length() + R3;
            break;
        } while ((R3 = R(charSequence, str, i5, z3)) == -1);
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List s0(CharSequence charSequence, char[] cArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return p0(charSequence, cArr, z3, i4);
    }

    public static /* synthetic */ List t0(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return q0(charSequence, strArr, z3, i4);
    }

    public static final e u0(CharSequence charSequence, String[] strArr, boolean z3, int i4) {
        o.e(charSequence, "<this>");
        o.e(strArr, "delimiters");
        return h.m(k0(charSequence, strArr, 0, z3, i4, 2, (Object) null), new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    public static /* synthetic */ e v0(CharSequence charSequence, String[] strArr, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return u0(charSequence, strArr, z3, i4);
    }

    public static final boolean w0(CharSequence charSequence, char c4, boolean z3) {
        o.e(charSequence, "<this>");
        if (charSequence.length() <= 0 || !C0723c.g(charSequence.charAt(0), c4, z3)) {
            return false;
        }
        return true;
    }

    public static final boolean x0(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        o.e(charSequence, "<this>");
        o.e(charSequence2, "prefix");
        if (!z3 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o.G((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return l0(charSequence, 0, charSequence2, 0, charSequence2.length(), z3);
    }

    public static /* synthetic */ boolean y0(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return w0(charSequence, c4, z3);
    }

    public static /* synthetic */ boolean z0(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return x0(charSequence, charSequence2, z3);
    }
}
