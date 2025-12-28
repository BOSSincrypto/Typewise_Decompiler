package ch.icoaching.wrio.autocorrect;

import E0.t;
import kotlin.jvm.internal.o;

public abstract class f {
    public static final t a(String str, String str2) {
        int i4;
        o.e(str, "first");
        o.e(str2, "second");
        int length = str.length();
        int length2 = str2.length();
        if (length2 < length) {
            i4 = length2;
        } else {
            i4 = length;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            char charAt = str.charAt(i7);
            char charAt2 = str2.charAt(i7);
            if (charAt != charAt2 || Character.isLetterOrDigit(charAt) || Character.isLetterOrDigit(charAt2)) {
                break;
            }
            i6++;
        }
        int i8 = length - 1;
        int i9 = length2 - 1;
        while (i8 >= 0 && i9 >= 0) {
            char charAt3 = str.charAt(i8);
            char charAt4 = str2.charAt(i9);
            if (charAt3 != charAt4 || Character.isLetterOrDigit(charAt3) || Character.isLetterOrDigit(charAt4)) {
                break;
            }
            i5++;
            i8--;
            i9--;
        }
        String substring = str.substring(i6, length - i5);
        o.d(substring, "substring(...)");
        return new t(substring, Integer.valueOf(i6), Integer.valueOf(i5));
    }
}
