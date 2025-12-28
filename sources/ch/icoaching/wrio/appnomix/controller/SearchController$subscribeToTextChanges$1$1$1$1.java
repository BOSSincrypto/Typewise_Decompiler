package ch.icoaching.wrio.appnomix.controller;

import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
@d(c = "ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$1$1$1$1", f = "SearchController.kt", l = {197}, m = "invokeSuspend")
final class SearchController$subscribeToTextChanges$1$1$1$1 extends SuspendLambda implements p {
    final /* synthetic */ List<SearchSuggestion> $suggestions;
    int label;
    final /* synthetic */ SearchController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchController$subscribeToTextChanges$1$1$1$1(SearchController searchController, List<SearchSuggestion> list, c<? super SearchController$subscribeToTextChanges$1$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = searchController;
        this.$suggestions = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SearchController$subscribeToTextChanges$1$1$1$1(this.this$0, this.$suggestions, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            g a4 = g.a((g) this.this$0.f9221m.getValue(), !this.$suggestions.isEmpty(), false, 2);
            this.this$0.f9221m.d(a4);
            a4.toString();
            SearchController searchController = this.this$0;
            this.label = 1;
            if (searchController.l(this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        K0.c j4 = this.this$0.f9216h;
        if (j4 != null) {
            j4.b0(this.$suggestions);
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((SearchController$subscribeToTextChanges$1$1$1$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
