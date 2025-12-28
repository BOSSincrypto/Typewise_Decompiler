package E0;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import kotlin.text.C0721a;
import kotlin.text.Regex;
import r0.f;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Regex f392a = new Regex("\\s+");

    /* renamed from: b  reason: collision with root package name */
    private static final Set f393b = L.d('-');

    /* renamed from: c  reason: collision with root package name */
    private static final Set f394c = L.h('\'', '`');

    /* renamed from: d  reason: collision with root package name */
    private static final Regex f395d = new Regex(".*\\s$");

    public static final String a(String str) {
        o.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z3 = true;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (z3) {
                sb.append(Character.toUpperCase(charAt));
                z3 = false;
            } else {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static final boolean b(String str) {
        o.e(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(str.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final String c(String str) {
        o.e(str, "<this>");
        if (f395d.matches(str)) {
            return "";
        }
        List s02 = kotlin.text.o.s0(str, new char[]{' '}, false, 0, 6, (Object) null);
        if (s02.isEmpty()) {
            return str;
        }
        return (String) C0718m.b0(s02);
    }

    public static final o d(String str) {
        List list;
        boolean z3;
        o oVar;
        if (str == null || str.length() == 0) {
            return new o("", "");
        }
        boolean z4 = false;
        List<String> split = f392a.split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = C0718m.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = C0718m.j();
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (strArr.length == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && C0721a.d(kotlin.text.o.T0(str))) {
            return new o(strArr[strArr.length - 1], "");
        }
        if (strArr.length > 1) {
            return new o(strArr[strArr.length - 2], strArr[strArr.length - 1]);
        }
        if (strArr.length == 0) {
            z4 = true;
        }
        if (!z4) {
            String str2 = strArr[strArr.length - 1];
            return oVar;
        }
        oVar = new o("", "");
        return oVar;
    }

    public static final List e(String str, f fVar) {
        o.e(str, "<this>");
        o.e(fVar, "wordInfo");
        ArrayList arrayList = new ArrayList();
        if (((long) fVar.a()) > 0) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        if (((long) fVar.c()) > 0) {
            arrayList.add(q(str, false));
        }
        if (((long) fVar.b()) > 0 && fVar.d().length() > 0) {
            arrayList.add(fVar.d());
        }
        return arrayList;
    }

    public static final boolean f(String str) {
        o.e(str, "<this>");
        if (str.length() == 0) {
            return false;
        }
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isUpperCase(charAt)) {
                return false;
            }
            if (!Character.isLetter(charAt)) {
                i4++;
            }
        }
        if (i4 == str.length()) {
            return false;
        }
        return true;
    }

    public static final boolean g(String str) {
        boolean z3;
        o.e(str, "<this>");
        if (str.length() < 2) {
            return false;
        }
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                z3 = false;
                break;
            } else if (Character.isLetter(str.charAt(i4))) {
                z3 = Character.isUpperCase(str.charAt(i4));
                break;
            } else {
                i4++;
            }
        }
        if (z3) {
            int length2 = str.length();
            boolean z4 = false;
            boolean z5 = false;
            for (int i5 = 0; i5 < length2; i5++) {
                if (i5 > i4) {
                    char charAt = str.charAt(i5);
                    if (Character.isLetterOrDigit(charAt)) {
                        if (Character.isUpperCase(charAt)) {
                            z5 = true;
                        } else if (Character.isLowerCase(charAt)) {
                            z4 = true;
                        }
                        if (z4 && z5) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (!z4 || !z5) {
                return false;
            }
            return true;
        }
        int length3 = str.length();
        boolean z6 = false;
        for (int i6 = 0; i6 < length3; i6++) {
            char charAt2 = str.charAt(i6);
            if (Character.isLetterOrDigit(charAt2)) {
                if (Character.isUpperCase(charAt2)) {
                    return z6;
                }
                if (Character.isLowerCase(charAt2)) {
                    z6 = true;
                }
            }
        }
        return false;
    }

    public static final boolean h(String str, f fVar) {
        o.e(str, "<this>");
        o.e(fVar, "wordInfo");
        if (f(str) && ((long) fVar.a()) > 0) {
            return true;
        }
        if (i(str) && ((long) fVar.c()) > 0) {
            return true;
        }
        if (j(str) && (((long) fVar.c()) > 0 || ((long) fVar.a()) > 0 || ((long) fVar.b()) > 0 || j(fVar.d()))) {
            return true;
        }
        if (!g(str) || ((long) fVar.b()) <= 0 || !o.a(str, fVar.d())) {
            return false;
        }
        return true;
    }

    public static final boolean i(String str) {
        o.e(str, "<this>");
        if (str.length() == 0) {
            return false;
        }
        int length = str.length();
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isLetterOrDigit(charAt)) {
                if (Character.isLowerCase(charAt)) {
                    if (!z3) {
                        return false;
                    }
                    z4 = true;
                } else if (!Character.isUpperCase(charAt)) {
                    continue;
                } else if (z3) {
                    return false;
                } else {
                    z3 = true;
                }
            }
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    public static final boolean j(String str) {
        o.e(str, "<this>");
        if (str.length() == 0) {
            return false;
        }
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (Character.isLowerCase(charAt)) {
                return false;
            }
            if (!Character.isLetter(charAt)) {
                i4++;
            }
        }
        if (i4 == str.length()) {
            return false;
        }
        return true;
    }

    public static final j k(String str, String str2, int i4) {
        String str3;
        int i5;
        String str4;
        o.e(str, "before");
        o.e(str2, "after");
        if (str.length() > i4) {
            str3 = o(str, -i4, (Integer) null, 2, (Object) null);
        } else {
            str3 = str;
        }
        int i6 = 0;
        if (str.length() > i4) {
            i5 = str.length() - i4;
        } else {
            i5 = 0;
        }
        if (str2.length() > i4) {
            str4 = n(str2, 0, Integer.valueOf(i4));
        } else {
            str4 = str2;
        }
        if (str2.length() > i4) {
            i6 = str2.length() - i4;
        }
        return new j(str3, str4, i5, i6);
    }

    public static final char l(String str, int i4) {
        int i5;
        o.e(str, "<this>");
        if (i4 >= 0) {
            i5 = i4;
        } else if (i4 * -1 <= str.length()) {
            i5 = str.length() + i4;
        } else {
            int length = str.length();
            throw new IndexOutOfBoundsException("Index " + i4 + " is out of bounds for String of length " + length);
        }
        if (i5 <= str.length() - 1) {
            return str.charAt(i5);
        }
        int length2 = str.length();
        throw new IndexOutOfBoundsException("Index " + i4 + " is out of bounds for String of length " + length2);
    }

    public static final String m(String str, String str2) {
        o.e(str, "<this>");
        o.e(str2, "text");
        while (kotlin.text.o.G(str, str2, false, 2, (Object) null)) {
            str = str.substring(str2.length());
            o.d(str, "substring(...)");
        }
        while (kotlin.text.o.u(str, str2, false, 2, (Object) null)) {
            str = str.substring(0, str.length() - str2.length());
            o.d(str, "substring(...)");
        }
        return str;
    }

    public static final String n(String str, int i4, Integer num) {
        int i5;
        String substring;
        o.e(str, "<this>");
        if (i4 < 0) {
            if (i4 * -1 > str.length()) {
                i4 = 0;
            } else {
                i4 += str.length();
            }
        } else if (i4 > str.length()) {
            i4 = str.length();
        }
        if (num != null) {
            if (num.intValue() < 0) {
                i5 = str.length() + num.intValue();
            } else if (num.intValue() > str.length()) {
                i5 = str.length();
            } else {
                i5 = num.intValue();
            }
            if (i4 > i5) {
                return "";
            }
            substring = str.substring(i4, i5);
        } else if (i4 < 0) {
            return "";
        } else {
            substring = str.substring(i4);
        }
        o.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String o(String str, int i4, Integer num, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            num = null;
        }
        return n(str, i4, num);
    }

    public static final String p(String str) {
        char c4;
        o.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z3 = true;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (!Character.isLetterOrDigit(charAt)) {
                c4 = charAt;
            } else if (z3) {
                c4 = Character.toUpperCase(charAt);
            } else {
                c4 = Character.toLowerCase(charAt);
            }
            sb.append(c4);
            z3 = !Character.isLetterOrDigit(charAt);
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static final String q(String str, boolean z3) {
        char c4;
        o.e(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        char c5 = ' ';
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (!Character.isLetterOrDigit(charAt)) {
                c4 = charAt;
            } else if (Character.isLetterOrDigit(c5) || ((!z3 && f394c.contains(Character.valueOf(c5))) || (sb.length() != 0 && ((c5 == '\'' || c5 == '`' || c5 == 8216 || c5 == 8217) && !z3)))) {
                c4 = Character.toLowerCase(charAt);
            } else {
                c4 = Character.toUpperCase(charAt);
            }
            sb.append(c4);
            i4++;
            c5 = charAt;
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String r(String str, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return q(str, z3);
    }
}
