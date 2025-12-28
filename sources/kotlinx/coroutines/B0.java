package kotlinx.coroutines;

public final class B0 {

    /* renamed from: a  reason: collision with root package name */
    public static final B0 f13984a = new B0();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f13985b = new ThreadLocal();

    private B0() {
    }

    public final U a() {
        ThreadLocal threadLocal = f13985b;
        U u3 = (U) threadLocal.get();
        if (u3 != null) {
            return u3;
        }
        U a4 = X.a();
        threadLocal.set(a4);
        return a4;
    }

    public final void b() {
        f13985b.set((Object) null);
    }

    public final void c(U u3) {
        f13985b.set(u3);
    }
}
