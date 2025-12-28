package ch.icoaching.wrio.util;

import kotlin.jvm.internal.o;

public abstract class g {
    public static final CharSequence a(CharSequence charSequence) {
        int i4;
        o.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z3 = false;
        while (i5 <= length) {
            if (!z3) {
                i4 = i5;
            } else {
                i4 = length;
            }
            boolean isLetterOrDigit = Character.isLetterOrDigit(charSequence.charAt(i4));
            if (!z3) {
                if (isLetterOrDigit) {
                    z3 = true;
                } else {
                    i5++;
                }
            } else if (isLetterOrDigit) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static final CharSequence b(CharSequence charSequence) {
        o.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (Character.isLetterOrDigit(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return "";
    }
}
