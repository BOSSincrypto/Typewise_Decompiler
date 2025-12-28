package ch.icoaching.wrio;

import java.util.Locale;
import kotlin.jvm.internal.o;

public abstract class I {
    public static final CharSequence a(CharSequence charSequence, Integer num) {
        int i4;
        o.e(charSequence, "<this>");
        if (charSequence.length() <= 180) {
            return charSequence;
        }
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = charSequence.length();
        }
        if (i4 > charSequence.length()) {
            i4 = charSequence.length();
        }
        int max = Math.max(0, i4 - 180);
        if (max == 0) {
            return charSequence.subSequence(0, i4).toString();
        }
        return "<...>" + charSequence.subSequence(max, i4).toString();
    }

    public static /* synthetic */ CharSequence b(CharSequence charSequence, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = null;
        }
        return a(charSequence, num);
    }

    public static final String c(String str) {
        o.e(str, "<this>");
        if (str.charAt(0) == 223) {
            String substring = str.substring(1);
            o.d(substring, "substring(...)");
            return 7838 + substring;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        o.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
