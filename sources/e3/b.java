package e3;

public abstract class b {
    public static String a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return str;
        }
        return str.replaceAll(str2, str3);
    }
}
