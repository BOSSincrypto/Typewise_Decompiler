package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.g0;

final class l implements n, c, h {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f14130a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f14131b;

    public l(n nVar, g0 g0Var) {
        this.f14130a = g0Var;
        this.f14131b = nVar;
    }

    public Object a(d dVar, c cVar) {
        return this.f14131b.a(dVar, cVar);
    }

    public c b(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        return o.e(this, coroutineContext, i4, bufferOverflow);
    }
}
