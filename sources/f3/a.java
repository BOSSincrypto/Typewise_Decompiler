package f3;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f13585a = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    public static Object a(Throwable th) {
        return b(th);
    }

    private static Object b(Throwable th) {
        throw th;
    }
}
