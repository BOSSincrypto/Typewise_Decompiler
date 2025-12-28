package B0;

import E0.s;
import com.ibm.icu.util.ULocale;
import java.util.Set;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import kotlin.text.C0721a;

/* renamed from: B0.f  reason: case insensitive filesystem */
public abstract class C0258f {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f105a = L.h('a', 'e', 'i', 'o', Character.valueOf(ULocale.UNICODE_LOCALE_EXTENSION), 'h');

    public static final String a(String str) {
        String str2;
        o.e(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '\'') {
                int i5 = i4 + 1;
                String substring = str.substring(0, i5);
                o.d(substring, "substring(...)");
                String substring2 = str.substring(i5);
                o.d(substring2, "substring(...)");
                if (substring2.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char charAt = substring2.charAt(0);
                    if (Character.isLowerCase(charAt)) {
                        str2 = C0721a.h(charAt);
                    } else {
                        str2 = String.valueOf(charAt);
                    }
                    sb.append(str2);
                    String substring3 = substring2.substring(1);
                    o.d(substring3, "substring(...)");
                    sb.append(substring3);
                    substring2 = sb.toString();
                }
                return substring + substring2;
            }
        }
        return str;
    }

    public static final Set b() {
        return f105a;
    }

    public static final String c(String str) {
        o.e(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (Character.isLetter(str.charAt(i4))) {
                String substring = str.substring(0, i4);
                o.d(substring, "substring(...)");
                String substring2 = str.substring(i4);
                o.d(substring2, "substring(...)");
                return substring + s.a(substring2);
            }
        }
        return str;
    }

    public static final String d(String str) {
        o.e(str, "<this>");
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (Character.isLetter(str.charAt(i5))) {
                i4++;
                if (i4 == 1) {
                    String substring = str.substring(0, i5);
                    o.d(substring, "substring(...)");
                    String substring2 = str.substring(i5);
                    o.d(substring2, "substring(...)");
                    str = substring + s.a(substring2);
                } else if (i4 == 2) {
                    String substring3 = str.substring(0, i5);
                    o.d(substring3, "substring(...)");
                    String substring4 = str.substring(i5);
                    o.d(substring4, "substring(...)");
                    return substring3 + s.a(substring4);
                }
            }
        }
        return str;
    }

    public static final String e(String str) {
        o.e(str, "<this>");
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (Character.isLetter(str.charAt(i4))) {
                String substring = str.substring(0, i4);
                o.d(substring, "substring(...)");
                char upperCase = Character.toUpperCase(str.charAt(i4));
                String substring2 = str.substring(i4 + 1);
                o.d(substring2, "substring(...)");
                return substring + upperCase + substring2;
            }
        }
        return str;
    }

    public static final Character f(String str) {
        o.e(str, "<this>");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (Character.isLetter(str.charAt(i4))) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 != -1) {
            return Character.valueOf(str.charAt(i4));
        }
        return null;
    }
}
