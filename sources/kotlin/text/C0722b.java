package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.o;
import z2.c;

/* renamed from: kotlin.text.b  reason: case insensitive filesystem */
abstract class C0722b {
    public static int a(int i4) {
        if (2 <= i4 && i4 < 37) {
            return i4;
        }
        throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new c(2, 36));
    }

    public static final int b(char c4, int i4) {
        return Character.digit(c4, i4);
    }

    public static CharCategory c(char c4) {
        return CharCategory.Companion.a(Character.getType(c4));
    }

    public static boolean d(char c4) {
        if (Character.isWhitespace(c4) || Character.isSpaceChar(c4)) {
            return true;
        }
        return false;
    }

    public static String e(char c4, Locale locale) {
        o.e(locale, "locale");
        String f4 = f(c4, locale);
        if (f4.length() <= 1) {
            String valueOf = String.valueOf(c4);
            o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            o.d(upperCase, "toUpperCase(...)");
            if (!o.a(f4, upperCase)) {
                return f4;
            }
            return String.valueOf(Character.toTitleCase(c4));
        } else if (c4 == 329) {
            return f4;
        } else {
            char charAt = f4.charAt(0);
            o.c(f4, "null cannot be cast to non-null type java.lang.String");
            String substring = f4.substring(1);
            o.d(substring, "substring(...)");
            o.c(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            return charAt + lowerCase;
        }
    }

    public static final String f(char c4, Locale locale) {
        o.e(locale, "locale");
        String valueOf = String.valueOf(c4);
        o.c(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        o.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
