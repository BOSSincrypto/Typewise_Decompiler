package kotlinx.coroutines;

import kotlinx.coroutines.internal.C0741a;

public abstract class U extends CoroutineDispatcher {

    /* renamed from: c  reason: collision with root package name */
    private long f14008c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14009d;

    /* renamed from: e  reason: collision with root package name */
    private C0741a f14010e;

    private final long t0(boolean z3) {
        return z3 ? 4294967296L : 1;
    }

    public static /* synthetic */ void x0(U u3, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            u3.w0(z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final boolean A0() {
        N n4;
        C0741a aVar = this.f14010e;
        if (aVar == null || (n4 = (N) aVar.d()) == null) {
            return false;
        }
        n4.run();
        return true;
    }

    public final void s0(boolean z3) {
        long t02 = this.f14008c - t0(z3);
        this.f14008c = t02;
        if (t02 <= 0 && this.f14009d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void u0(N n4) {
        C0741a aVar = this.f14010e;
        if (aVar == null) {
            aVar = new C0741a();
            this.f14010e = aVar;
        }
        aVar.a(n4);
    }

    /* access modifiers changed from: protected */
    public long v0() {
        C0741a aVar = this.f14010e;
        if (aVar != null && !aVar.c()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public final void w0(boolean z3) {
        this.f14008c += t0(z3);
        if (!z3) {
            this.f14009d = true;
        }
    }

    public final boolean y0() {
        if (this.f14008c >= t0(true)) {
            return true;
        }
        return false;
    }

    public final boolean z0() {
        C0741a aVar = this.f14010e;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }
}
