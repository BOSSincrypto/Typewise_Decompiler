package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import u2.p;

public abstract class e {
    public static final n a(j jVar) {
        return i.a(jVar);
    }

    public static final c b(p pVar) {
        return f.a(pVar);
    }

    public static final Object c(c cVar, c cVar2) {
        return FlowKt__CollectKt.a(cVar, cVar2);
    }

    public static final c d(kotlinx.coroutines.channels.p pVar) {
        return FlowKt__ChannelsKt.b(pVar);
    }

    public static final c e(c cVar, long j4) {
        return FlowKt__DelayKt.a(cVar, j4);
    }

    public static final Object f(d dVar, kotlinx.coroutines.channels.p pVar, c cVar) {
        return FlowKt__ChannelsKt.c(dVar, pVar, cVar);
    }

    public static final void g(d dVar) {
        h.a(dVar);
    }

    public static final c h(p pVar) {
        return f.b(pVar);
    }

    public static final c i(c cVar, CoroutineContext coroutineContext) {
        return g.b(cVar, coroutineContext);
    }

    public static final g0 j(c cVar, D d4) {
        return FlowKt__CollectKt.b(cVar, d4);
    }

    public static final c k(c cVar, p pVar) {
        return FlowKt__TransformKt.a(cVar, pVar);
    }
}
