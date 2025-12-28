package Y1;

import java.io.PrintStream;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f2003a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2004b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2005c;

    static {
        boolean z3;
        try {
            f2003a = System.getProperty("ICUDebug");
        } catch (SecurityException unused) {
        }
        String str = f2003a;
        boolean z4 = false;
        if (str != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f2004b = z3;
        if (z3 && (str.equals("") || f2003a.indexOf("help") != -1)) {
            z4 = true;
        }
        f2005c = z4;
        if (f2004b) {
            System.out.println("\nICUDebug=" + f2003a);
        }
    }

    public static boolean a(String str) {
        boolean z3 = false;
        if (f2004b) {
            if (f2003a.indexOf(str) != -1) {
                z3 = true;
            }
            if (f2005c) {
                PrintStream printStream = System.out;
                printStream.println("\nICUDebug.enabled(" + str + ") = " + z3);
            }
        }
        return z3;
    }

    public static String b(String str) {
        String str2 = "false";
        if (f2004b) {
            int indexOf = f2003a.indexOf(str);
            if (indexOf != -1) {
                int length = indexOf + str.length();
                if (f2003a.length() <= length || f2003a.charAt(length) != '=') {
                    str2 = "true";
                } else {
                    int i4 = length + 1;
                    int indexOf2 = f2003a.indexOf(",", i4);
                    String str3 = f2003a;
                    if (indexOf2 == -1) {
                        indexOf2 = str3.length();
                    }
                    str2 = str3.substring(i4, indexOf2);
                }
            }
            if (f2005c) {
                PrintStream printStream = System.out;
                printStream.println("\nICUDebug.value(" + str + ") = " + str2);
            }
        }
        return str2;
    }
}
