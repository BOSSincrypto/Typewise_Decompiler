package kotlin.text;

import java.util.Comparator;
import kotlin.collections.C0707b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import z2.d;

abstract class w extends v {
    public static final String A(String str, String str2, String str3, boolean z3) {
        o.e(str, "<this>");
        o.e(str2, "oldValue");
        o.e(str3, "newValue");
        int i4 = 0;
        int R3 = StringsKt__StringsKt.R(str, str2, 0, z3);
        if (R3 < 0) {
            return str;
        }
        int length = str2.length();
        int b4 = d.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i4, R3);
                sb.append(str3);
                i4 = R3 + length;
                if (R3 >= str.length() || (R3 = StringsKt__StringsKt.R(str, str2, R3 + b4, z3)) <= 0) {
                    sb.append(str, i4, str.length());
                    String sb2 = sb.toString();
                    o.d(sb2, "toString(...)");
                }
                sb.append(str, i4, R3);
                sb.append(str3);
                i4 = R3 + length;
                break;
            } while ((R3 = StringsKt__StringsKt.R(str, str2, R3 + b4, z3)) <= 0);
            sb.append(str, i4, str.length());
            String sb22 = sb.toString();
            o.d(sb22, "toString(...)");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String B(String str, char c4, char c5, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return z(str, c4, c5, z3);
    }

    public static /* synthetic */ String C(String str, String str2, String str3, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return A(str, str2, str3, z3);
    }

    public static boolean D(String str, String str2, int i4, boolean z3) {
        o.e(str, "<this>");
        o.e(str2, "prefix");
        if (!z3) {
            return str.startsWith(str2, i4);
        }
        return o.x(str, i4, str2, 0, str2.length(), z3);
    }

    public static boolean E(String str, String str2, boolean z3) {
        o.e(str, "<this>");
        o.e(str2, "prefix");
        if (!z3) {
            return str.startsWith(str2);
        }
        return o.x(str, 0, str2, 0, str2.length(), z3);
    }

    public static /* synthetic */ boolean F(String str, String str2, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return o.D(str, str2, i4, z3);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return o.E(str, str2, z3);
    }

    public static String q(char[] cArr) {
        o.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String r(char[] cArr, int i4, int i5) {
        o.e(cArr, "<this>");
        C0707b.Companion.a(i4, i5, cArr.length);
        return new String(cArr, i4, i5 - i4);
    }

    public static String s(byte[] bArr) {
        o.e(bArr, "<this>");
        return new String(bArr, C0724d.f13927b);
    }

    public static final boolean t(String str, String str2, boolean z3) {
        o.e(str, "<this>");
        o.e(str2, "suffix");
        if (!z3) {
            return str.endsWith(str2);
        }
        return o.x(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return t(str, str2, z3);
    }

    public static boolean v(String str, String str2, boolean z3) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z3) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static Comparator w(u uVar) {
        o.e(uVar, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        o.d(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean x(String str, int i4, String str2, int i5, int i6, boolean z3) {
        o.e(str, "<this>");
        o.e(str2, "other");
        if (!z3) {
            return str.regionMatches(i4, str2, i5, i6);
        }
        return str.regionMatches(z3, i4, str2, i5, i6);
    }

    public static String y(CharSequence charSequence, int i4) {
        o.e(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i4 + '.').toString());
        } else if (i4 == 0) {
            return "";
        } else {
            int i5 = 1;
            if (i4 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i4);
                if (1 <= i4) {
                    while (true) {
                        sb.append(charSequence);
                        if (i5 == i4) {
                            break;
                        }
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                o.b(sb2);
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                cArr[i6] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String z(String str, char c4, char c5, boolean z3) {
        o.e(str, "<this>");
        if (!z3) {
            String replace = str.replace(c4, c5);
            o.d(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (C0723c.g(charAt, c4, z3)) {
                charAt = c5;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }
}
