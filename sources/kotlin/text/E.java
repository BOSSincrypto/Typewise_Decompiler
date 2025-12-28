package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.o;

public abstract class E {
    public static final String a(char c4) {
        String valueOf = String.valueOf(c4);
        o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        o.d(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c4));
        }
        if (c4 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        o.c(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        o.d(substring, "substring(...)");
        o.c(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        o.d(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
