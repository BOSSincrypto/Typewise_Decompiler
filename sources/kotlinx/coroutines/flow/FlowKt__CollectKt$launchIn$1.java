package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {1, 6, 0})
final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements p {
    final /* synthetic */ c $this_launchIn;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__CollectKt$launchIn$1(c cVar, c<? super FlowKt__CollectKt$launchIn$1> cVar2) {
        super(2, cVar2);
        this.$this_launchIn = cVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            c cVar = this.$this_launchIn;
            this.label = 1;
            if (e.c(cVar, this) == f4) {
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
        return ((FlowKt__CollectKt$launchIn$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
