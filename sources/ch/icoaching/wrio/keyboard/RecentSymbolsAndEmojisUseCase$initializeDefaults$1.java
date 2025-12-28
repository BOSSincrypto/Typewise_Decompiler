package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.data.source.local.RecentSymbolsStore;
import g2.C0657a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.RecentSymbolsAndEmojisUseCase$initializeDefaults$1", f = "RecentSymbolsAndEmojisUseCase.kt", l = {20, 24}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class RecentSymbolsAndEmojisUseCase$initializeDefaults$1 extends SuspendLambda implements p {
    final /* synthetic */ List<Character> $defaultFrequentlyUsedSymbols;
    int label;
    final /* synthetic */ RecentSymbolsAndEmojisUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentSymbolsAndEmojisUseCase$initializeDefaults$1(RecentSymbolsAndEmojisUseCase recentSymbolsAndEmojisUseCase, List<Character> list, c<? super RecentSymbolsAndEmojisUseCase$initializeDefaults$1> cVar) {
        super(2, cVar);
        this.this$0 = recentSymbolsAndEmojisUseCase;
        this.$defaultFrequentlyUsedSymbols = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RecentSymbolsAndEmojisUseCase$initializeDefaults$1(this.this$0, this.$defaultFrequentlyUsedSymbols, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            RecentSymbolsStore l4 = this.this$0.f9973a;
            this.label = 1;
            obj = l4.c(this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else if (i4 == 2) {
            f.b(obj);
            return q.f14567a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue() && !this.$defaultFrequentlyUsedSymbols.isEmpty()) {
            List<Character> list = this.$defaultFrequentlyUsedSymbols;
            ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
            for (Character charValue : list) {
                arrayList.add(new C0657a((char) charValue.charValue(), 1));
            }
            RecentSymbolsStore l5 = this.this$0.f9973a;
            this.label = 2;
            if (l5.b(arrayList, this) == f4) {
                return f4;
            }
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((RecentSymbolsAndEmojisUseCase$initializeDefaults$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
