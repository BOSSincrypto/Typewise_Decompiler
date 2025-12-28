package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.V;

public abstract class W extends U {
    /* access modifiers changed from: protected */
    public abstract Thread B0();

    /* access modifiers changed from: protected */
    public void C0(long j4, V.c cVar) {
        G.f13996h.O0(j4, cVar);
    }

    /* access modifiers changed from: protected */
    public final void D0() {
        Thread B02 = B0();
        if (Thread.currentThread() != B02) {
            C0730c.a();
            LockSupport.unpark(B02);
        }
    }
}
