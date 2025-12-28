package Y1;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f2049a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 0, 3, 3, 0, 3, 0, 3, 3, 0, 0, 0, 0, 3, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f2050b = {2, 3, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 9};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2051c = {0, -1, -65536, 2147418367, 2146435070, -65536, 4194303, -1048576, -242, 65537};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f2052d = {0, -1, -16384, 2147419135, 2146435070, -65536, 4194303, -1048576, -242, 65537};

    public static boolean a(int i4) {
        if (i4 < 0) {
            return false;
        }
        if (i4 <= 255) {
            if (f2049a[i4] == 5) {
                return true;
            }
            return false;
        } else if (8206 > i4 || i4 > 8233) {
            return false;
        } else {
            if (i4 <= 8207 || 8232 <= i4) {
                return true;
            }
            return false;
        }
    }

    public static int b(CharSequence charSequence, int i4) {
        while (i4 < charSequence.length() && a(charSequence.charAt(i4))) {
            i4++;
        }
        return i4;
    }

    public static String c(String str) {
        if (str.length() == 0) {
            return str;
        }
        int i4 = 0;
        if (!a(str.charAt(0)) && !a(str.charAt(str.length() - 1))) {
            return str;
        }
        int length = str.length();
        while (i4 < length && a(str.charAt(i4))) {
            i4++;
        }
        if (i4 < length) {
            while (a(str.charAt(length - 1))) {
                length--;
            }
        }
        return str.substring(i4, length);
    }
}
