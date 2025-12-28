package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class e extends ChannelFlowOperator {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(c cVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, i iVar) {
        this(cVar, (i5 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* access modifiers changed from: protected */
    public ChannelFlow g(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        return new e(this.f14109d, coroutineContext, i4, bufferOverflow);
    }

    /* access modifiers changed from: protected */
    public Object n(d dVar, kotlin.coroutines.c cVar) {
        Object a4 = this.f14109d.a(dVar, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }

    public e(c cVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        super(cVar, coroutineContext, i4, bufferOverflow);
    }
}
