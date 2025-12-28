package Y0;

import android.net.Uri;

public abstract class b {
    public static boolean a(Uri uri) {
        if (!b(uri) || e(uri)) {
            return false;
        }
        return true;
    }

    public static boolean b(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    public static boolean c(Uri uri) {
        if (!b(uri) || !e(uri)) {
            return false;
        }
        return true;
    }

    public static boolean d(int i4, int i5) {
        if (i4 == Integer.MIN_VALUE || i5 == Integer.MIN_VALUE || i4 > 512 || i5 > 384) {
            return false;
        }
        return true;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
