package org.apache.commons.lang3.time;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f15687a = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");

    /* renamed from: b  reason: collision with root package name */
    private static final TimeZone f15688b = new GmtTimeZone(false, 0, 0);

    public static TimeZone a(String str) {
        if ("Z".equals(str) || "UTC".equals(str)) {
            return f15688b;
        }
        Matcher matcher = f15687a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int b4 = b(matcher.group(2));
        int b5 = b(matcher.group(4));
        if (b4 == 0 && b5 == 0) {
            return f15688b;
        }
        return new GmtTimeZone(c(matcher.group(1)), b4, b5);
    }

    private static int b(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    private static boolean c(String str) {
        if (str == null || str.charAt(0) != '-') {
            return false;
        }
        return true;
    }
}
