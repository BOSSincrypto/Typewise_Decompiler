package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.z;
import z2.d;

public final class a extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14253d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final CoroutineDispatcher f14254e = l.f14273c.r0(B.d("kotlinx.coroutines.io.parallelism", d.b(64, z.a()), 0, 0, 12, (Object) null));

    private a() {
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    public void execute(Runnable runnable) {
        p0(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        f14254e.p0(coroutineContext, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
