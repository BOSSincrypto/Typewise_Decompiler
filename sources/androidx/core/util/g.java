package androidx.core.util;

import java.util.Locale;

public abstract class g {
    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i4, int i5, int i6, String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i6)}));
        } else if (i4 <= i6) {
            return i4;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i5), Integer.valueOf(i6)}));
        }
    }

    public static int d(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i4, String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    public static Object g(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void i(boolean z3, String str) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }
}
