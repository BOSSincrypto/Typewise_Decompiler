package ch.icoaching.wrio.data.source.local;

import g2.C0657a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.data.source.local.RecentSymbolsStore$save$2", f = "RecentSymbolsStore.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class RecentSymbolsStore$save$2 extends SuspendLambda implements p {
    final /* synthetic */ List<C0657a> $symbolsData;
    int label;
    final /* synthetic */ RecentSymbolsStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentSymbolsStore$save$2(RecentSymbolsStore recentSymbolsStore, List<C0657a> list, c<? super RecentSymbolsStore$save$2> cVar) {
        super(2, cVar);
        this.this$0 = recentSymbolsStore;
        this.$symbolsData = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RecentSymbolsStore$save$2(this.this$0, this.$symbolsData, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            this.this$0.f9520a.f7497g.g(this.$symbolsData);
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((RecentSymbolsStore$save$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
