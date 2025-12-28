package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import l2.q;
import u2.p;

abstract class b extends ChannelFlow {

    /* renamed from: d  reason: collision with root package name */
    private final p f14105d;

    public b(p pVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f14105d = pVar;
    }

    static /* synthetic */ Object k(b bVar, n nVar, c cVar) {
        Object invoke = bVar.f14105d.invoke(nVar, cVar);
        if (invoke == a.f()) {
            return invoke;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: protected */
    public Object f(n nVar, c cVar) {
        return k(this, nVar, cVar);
    }

    public String toString() {
        return "block[" + this.f14105d + "] -> " + super.toString();
    }
}
