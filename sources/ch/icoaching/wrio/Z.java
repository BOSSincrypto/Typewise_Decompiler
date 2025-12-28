package ch.icoaching.wrio;

import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.keyboard.DiacriticsStore;
import ch.icoaching.wrio.subscription.a;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;

public abstract class Z {
    public static final String a(String[] strArr, b bVar, a aVar) {
        o.e(strArr, "words");
        o.e(bVar, "keyboardSettings");
        o.e(aVar, "subscriptionChecker");
        if (strArr.length == 0) {
            return "";
        }
        String str = strArr[strArr.length - 1];
        if (!kotlin.text.o.L(str, " ", false, 2, (Object) null)) {
            return str;
        }
        String[] strArr2 = (String[]) new Regex(" ").split(str, 0).toArray(new String[0]);
        if (strArr2.length == 0) {
            return str;
        }
        String str2 = strArr2[strArr2.length - 1];
        if (bVar.b(str2) == null || !aVar.b()) {
            return str;
        }
        return str2;
    }

    public static final String b(String[] strArr, String str) {
        o.e(strArr, "words");
        o.e(str, "bestSuggestion");
        int length = strArr.length - 1;
        StringBuilder sb = new StringBuilder(strArr[length]);
        while (length >= 0 && sb.length() < str.length()) {
            length--;
            sb.insert(0, strArr[length] + ' ');
        }
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public static final boolean c(String str) {
        Character ch2;
        o.e(str, "<this>");
        int i4 = 0;
        while (true) {
            if (i4 >= str.length()) {
                ch2 = null;
                break;
            }
            char charAt = str.charAt(i4);
            if (Character.isLetter(charAt) && Character.isUpperCase(charAt)) {
                ch2 = Character.valueOf(charAt);
                break;
            }
            i4++;
        }
        if (ch2 == null) {
            return true;
        }
        return false;
    }

    public static final String d(String str) {
        int i4;
        boolean z3;
        o.e(str, "<this>");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z4 = false;
        while (i5 <= length) {
            if (!z4) {
                i4 = i5;
            } else {
                i4 = length;
            }
            if (str.charAt(i4) == '\'') {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z4) {
                if (!z3) {
                    z4 = true;
                } else {
                    i5++;
                }
            } else if (!z3) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public static final String e(String str) {
        o.e(str, "<this>");
        return d(DiacriticsStore.f9950j.a(str));
    }
}
