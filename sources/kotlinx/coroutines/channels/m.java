package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.B;
import kotlinx.coroutines.channels.t;
import l2.q;

final class m extends e implements n {
    public m(CoroutineContext coroutineContext, d dVar) {
        super(coroutineContext, dVar, true, true);
    }

    /* access modifiers changed from: protected */
    public void H0(Throwable th, boolean z3) {
        if (!K0().d(th) && !z3) {
            B.a(getContext(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void I0(q qVar) {
        t.a.a(K0(), (Throwable) null, 1, (Object) null);
    }

    public boolean a() {
        return super.a();
    }
}
