package v1;

/* renamed from: v1.b  reason: case insensitive filesystem */
public abstract class C0923b {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void c(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
