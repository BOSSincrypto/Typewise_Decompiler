package e3;

public abstract class c {
    public static String a(String str) {
        int length;
        int codePointAt;
        int titleCase;
        if (str == null || (length = str.length()) == 0 || (codePointAt = str.codePointAt(0)) == (titleCase = Character.toTitleCase(codePointAt))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = titleCase;
        int charCount = Character.charCount(codePointAt);
        int i4 = 1;
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i4] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i4++;
        }
        return new String(iArr, 0, i4);
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i4 = 0; i4 <= length2; i4++) {
                if (a.a(charSequence, true, i4, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String c(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int g4 = g(str, str2);
        if (g4 == -1) {
            return "";
        }
        return str2.substring(g4);
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return e(charSequence, charSequence2, false);
    }

    private static boolean e(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return a.a(charSequence, z3, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        }
    }

    public static boolean f(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return a.a(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static int g(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i4 = 0;
        if (!(charSequence == null || charSequence2 == null)) {
            while (i4 < charSequence.length() && i4 < charSequence2.length() && charSequence.charAt(i4) == charSequence2.charAt(i4)) {
                i4++;
            }
            if (i4 < charSequence2.length() || i4 < charSequence.length()) {
                return i4;
            }
            return -1;
        }
        return i4;
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence == null || k(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLowerCase(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(CharSequence charSequence) {
        if (k(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i4 = 0; i4 < length; i4++) {
                if (!Character.isWhitespace(charSequence.charAt(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean k(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean l(CharSequence charSequence) {
        return !j(charSequence);
    }

    public static int m(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String o(String str, String str2, String str3) {
        return p(str, str2, str3, -1);
    }

    public static String p(String str, String str2, String str3, int i4) {
        return q(str, str2, str3, i4, false);
    }

    private static String q(String str, String str2, String str3, int i4, boolean z3) {
        String str4;
        int i5;
        if (k(str) || k(str2) || str3 == null || i4 == 0) {
            return str;
        }
        if (z3) {
            str4 = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            str4 = str;
        }
        int i6 = 0;
        int indexOf = str4.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        if (i4 < 0) {
            i5 = 16;
        } else {
            i5 = 64;
            if (i4 <= 64) {
                i5 = i4;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * i5));
        while (indexOf != -1) {
            sb.append(str, i6, indexOf);
            sb.append(str3);
            i6 = indexOf + length;
            i4--;
            if (i4 == 0) {
                break;
            }
            indexOf = str4.indexOf(str2, i6);
        }
        sb.append(str, i6, str.length());
        return sb.toString();
    }

    public static String r(String str, String str2, String str3) {
        return b.a(str, str2, str3);
    }

    public static String s(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 < 0) {
            i5 += str.length();
        }
        if (i4 < 0) {
            i4 += str.length();
        }
        if (i5 > str.length()) {
            i5 = str.length();
        }
        if (i4 > i5) {
            return "";
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        return str.substring(i4, i5);
    }
}
