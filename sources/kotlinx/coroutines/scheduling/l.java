package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

final class l extends CoroutineDispatcher {

    /* renamed from: c  reason: collision with root package name */
    public static final l f14273c = new l();

    private l() {
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        b.f14255i.t0(runnable, k.f14272g, false);
    }
}
