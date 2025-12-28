package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

public abstract class e extends ExecutorCoroutineDispatcher {

    /* renamed from: d  reason: collision with root package name */
    private final int f14257d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14258e;

    /* renamed from: f  reason: collision with root package name */
    private final long f14259f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14260g;

    /* renamed from: h  reason: collision with root package name */
    private CoroutineScheduler f14261h = s0();

    public e(int i4, int i5, long j4, String str) {
        this.f14257d = i4;
        this.f14258e = i5;
        this.f14259f = j4;
        this.f14260g = str;
    }

    private final CoroutineScheduler s0() {
        return new CoroutineScheduler(this.f14257d, this.f14258e, this.f14259f, this.f14260g);
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.v(this.f14261h, runnable, (h) null, false, 6, (Object) null);
    }

    public final void t0(Runnable runnable, h hVar, boolean z3) {
        this.f14261h.o(runnable, hVar, z3);
    }
}
