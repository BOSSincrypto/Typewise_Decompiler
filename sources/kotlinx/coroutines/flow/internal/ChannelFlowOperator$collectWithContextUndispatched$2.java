package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/d;", "it", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/flow/d;)V"}, k = 3, mv = {1, 6, 0})
final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowOperator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator channelFlowOperator, c<? super ChannelFlowOperator$collectWithContextUndispatched$2> cVar) {
        super(2, cVar);
        this.this$0 = channelFlowOperator;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, cVar);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            ChannelFlowOperator channelFlowOperator = this.this$0;
            this.label = 1;
            if (channelFlowOperator.n((kotlinx.coroutines.flow.d) this.L$0, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(kotlinx.coroutines.flow.d dVar, c<? super q> cVar) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(dVar, cVar)).invokeSuspend(q.f14567a);
    }
}
