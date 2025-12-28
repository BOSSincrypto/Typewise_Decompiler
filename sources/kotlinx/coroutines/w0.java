package kotlinx.coroutines;

import kotlinx.coroutines.selects.d;
import l2.q;
import u2.p;

final class w0 extends l0 {

    /* renamed from: e  reason: collision with root package name */
    private final d f14320e;

    /* renamed from: f  reason: collision with root package name */
    private final p f14321f;

    public w0(d dVar, p pVar) {
        this.f14320e = dVar;
        this.f14321f = pVar;
    }

    public void R(Throwable th) {
        if (this.f14320e.q()) {
            S().u0(this.f14320e, this.f14321f);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        R((Throwable) obj);
        return q.f14567a;
    }
}
