package e3;

public abstract class a {
    static boolean a(CharSequence charSequence, boolean z3, int i4, CharSequence charSequence2, int i5, int i6) {
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int length = charSequence.length() - i4;
            int length2 = charSequence2.length() - i5;
            if (i4 < 0 || i5 < 0 || i6 < 0 || length < i6 || length2 < i6) {
                return false;
            }
            while (true) {
                int i7 = i6 - 1;
                if (i6 <= 0) {
                    return true;
                }
                int i8 = i4 + 1;
                char charAt = charSequence.charAt(i4);
                int i9 = i5 + 1;
                char charAt2 = charSequence2.charAt(i5);
                if (charAt != charAt2) {
                    if (!z3) {
                        return false;
                    }
                    if (!(Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                        return false;
                    }
                }
                i4 = i8;
                i6 = i7;
                i5 = i9;
            }
        } else {
            return ((String) charSequence).regionMatches(z3, i4, (String) charSequence2, i5, i6);
        }
    }
}
