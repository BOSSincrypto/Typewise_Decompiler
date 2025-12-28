package e3;

public abstract class d {
    public static Object a(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.format(str, objArr));
    }
}
