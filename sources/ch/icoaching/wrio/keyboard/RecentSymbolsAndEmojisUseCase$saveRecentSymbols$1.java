package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.data.source.local.RecentSymbolsStore;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1", f = "RecentSymbolsAndEmojisUseCase.kt", l = {87}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ RecentSymbolsAndEmojisUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1(RecentSymbolsAndEmojisUseCase recentSymbolsAndEmojisUseCase, c<? super RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1> cVar) {
        super(2, cVar);
        this.this$0 = recentSymbolsAndEmojisUseCase;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            ArrayList arrayList = new ArrayList(this.this$0.f9976d);
            this.this$0.f9976d.clear();
            RecentSymbolsStore l4 = this.this$0.f9973a;
            this.label = 1;
            if (l4.b(arrayList, this) == f4) {
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
        return ((RecentSymbolsAndEmojisUseCase$saveRecentSymbols$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
