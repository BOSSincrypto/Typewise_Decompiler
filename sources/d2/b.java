package d2;

import ch.icoaching.wrio.Y;
import e3.c;

public abstract class b {
    public static Integer a(char c4) {
        return Integer.valueOf(c4);
    }

    public static String b(String str) {
        return c.r(str, "'+", "'");
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        if (Y.c(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && (str2.indexOf(sb.charAt(0)) != -1 || Character.isWhitespace(sb.charAt(0)))) {
            sb.delete(0, 1);
        }
        while (sb.length() > 0 && (str2.indexOf(sb.charAt(sb.length() - 1)) != -1 || Character.isWhitespace(sb.charAt(sb.length() - 1)))) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }
}
