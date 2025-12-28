package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public abstract class ChannelFlowOperator extends ChannelFlow {

    /* renamed from: d  reason: collision with root package name */
    protected final c f14109d;

    public ChannelFlowOperator(c cVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f14109d = cVar;
    }

    static /* synthetic */ Object k(ChannelFlowOperator channelFlowOperator, d dVar, kotlin.coroutines.c cVar) {
        if (channelFlowOperator.f14107b == -3) {
            CoroutineContext context = cVar.getContext();
            CoroutineContext plus = context.plus(channelFlowOperator.f14106a);
            if (o.a(plus, context)) {
                Object n4 = channelFlowOperator.n(dVar, cVar);
                if (n4 == a.f()) {
                    return n4;
                }
                return q.f14567a;
            }
            d.b bVar = kotlin.coroutines.d.f13873r;
            if (o.a(plus.get(bVar), context.get(bVar))) {
                Object m4 = channelFlowOperator.m(dVar, plus, cVar);
                if (m4 == a.f()) {
                    return m4;
                }
                return q.f14567a;
            }
        }
        Object a4 = super.a(dVar, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }

    static /* synthetic */ Object l(ChannelFlowOperator channelFlowOperator, n nVar, kotlin.coroutines.c cVar) {
        Object n4 = channelFlowOperator.n(new l(nVar), cVar);
        if (n4 == a.f()) {
            return n4;
        }
        return q.f14567a;
    }

    private final Object m(kotlinx.coroutines.flow.d dVar, CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        Object c4 = d.c(coroutineContext, d.d(dVar, cVar.getContext()), (Object) null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, (kotlin.coroutines.c<? super ChannelFlowOperator$collectWithContextUndispatched$2>) null), cVar, 4, (Object) null);
        if (c4 == a.f()) {
            return c4;
        }
        return q.f14567a;
    }

    public Object a(kotlinx.coroutines.flow.d dVar, kotlin.coroutines.c cVar) {
        return k(this, dVar, cVar);
    }

    /* access modifiers changed from: protected */
    public Object f(n nVar, kotlin.coroutines.c cVar) {
        return l(this, nVar, cVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object n(kotlinx.coroutines.flow.d dVar, kotlin.coroutines.c cVar);

    public String toString() {
        return this.f14109d + " -> " + super.toString();
    }
}
