package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.e;
import l2.q;
import u2.p;

@d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {1, 6, 0})
final class ChannelFlow$collect$2 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.d $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelFlow$collect$2(kotlinx.coroutines.flow.d dVar, ChannelFlow channelFlow, c<? super ChannelFlow$collect$2> cVar) {
        super(2, cVar);
        this.$collector = dVar;
        this.this$0 = channelFlow;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, cVar);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            kotlinx.coroutines.flow.d dVar = this.$collector;
            kotlinx.coroutines.channels.p j4 = this.this$0.j((D) this.L$0);
            this.label = 1;
            if (e.f(dVar, j4, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((ChannelFlow$collect$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
