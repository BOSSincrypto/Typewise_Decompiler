package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

public interface K {

    public static final class a {
        public static Q a(K k4, long j4, Runnable runnable, CoroutineContext coroutineContext) {
            return H.a().v(j4, runnable, coroutineContext);
        }
    }

    Q v(long j4, Runnable runnable, CoroutineContext coroutineContext);

    void y(long j4, C0747k kVar);
}
