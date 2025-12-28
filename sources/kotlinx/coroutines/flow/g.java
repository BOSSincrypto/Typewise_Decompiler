package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.g0;

abstract /* synthetic */ class g {
    private static final void a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(g0.f14139t) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }

    public static final c b(c cVar, CoroutineContext coroutineContext) {
        a(coroutineContext);
        if (o.a(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            return cVar;
        }
        if (cVar instanceof h) {
            return h.a.a((h) cVar, coroutineContext, 0, (BufferOverflow) null, 6, (Object) null);
        }
        return new e(cVar, coroutineContext, 0, (BufferOverflow) null, 12, (i) null);
    }
}
