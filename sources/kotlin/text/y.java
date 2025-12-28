package kotlin.text;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import z2.d;

abstract class y extends x {
    public static String Q0(String str, int i4) {
        o.e(str, "<this>");
        if (i4 >= 0) {
            String substring = str.substring(d.d(i4, str.length()));
            o.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    public static String R0(String str, int i4) {
        o.e(str, "<this>");
        if (i4 >= 0) {
            return o.W0(str, d.b(str.length() - i4, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    public static char S0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char T0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(o.P(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence U0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        o.d(reverse, "reverse(...)");
        return reverse;
    }

    public static char V0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    public static String W0(String str, int i4) {
        o.e(str, "<this>");
        if (i4 >= 0) {
            String substring = str.substring(0, d.d(i4, str.length()));
            o.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    public static final Collection X0(CharSequence charSequence, Collection collection) {
        o.e(charSequence, "<this>");
        o.e(collection, "destination");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            collection.add(Character.valueOf(charSequence.charAt(i4)));
        }
        return collection;
    }

    public static Set Y0(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return L.e();
        }
        if (length != 1) {
            return (Set) X0(charSequence, new LinkedHashSet(D.e(d.d(charSequence.length(), Uuid.SIZE_BITS))));
        }
        return L.d(Character.valueOf(charSequence.charAt(0)));
    }
}
