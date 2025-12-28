package kotlin.text;

import kotlin.jvm.internal.o;

abstract class u extends t {
    public static Double j(String str) {
        o.e(str, "<this>");
        try {
            if (n.f13978b.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float k(String str) {
        o.e(str, "<this>");
        try {
            if (n.f13978b.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
