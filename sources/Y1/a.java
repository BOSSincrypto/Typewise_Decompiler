package Y1;

public abstract class a {
    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalStateException("assert failed");
        }
    }

    public static void b(Exception exc) {
        c(exc.toString());
    }

    public static void c(String str) {
        throw new IllegalStateException("failure '" + str + "'");
    }
}
