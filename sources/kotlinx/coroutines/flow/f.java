package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import u2.p;

abstract /* synthetic */ class f {
    public static final c a(p pVar) {
        return new CallbackFlowBuilder(pVar, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (i) null);
    }

    public static final c b(p pVar) {
        return new m(pVar);
    }
}
