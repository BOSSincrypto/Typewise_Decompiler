package kotlinx.coroutines.scheduling;

public final class b extends e {

    /* renamed from: i  reason: collision with root package name */
    public static final b f14255i = new b();

    private b() {
        super(k.f14267b, k.f14268c, k.f14269d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
