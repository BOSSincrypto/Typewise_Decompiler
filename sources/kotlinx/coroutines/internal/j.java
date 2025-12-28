package kotlinx.coroutines.internal;

public abstract class j {
    public static final void a(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i4).toString());
        }
    }
}
