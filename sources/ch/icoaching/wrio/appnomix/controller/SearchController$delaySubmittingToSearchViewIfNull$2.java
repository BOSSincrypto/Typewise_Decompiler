package ch.icoaching.wrio.appnomix.controller;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.L;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.appnomix.controller.SearchController$delaySubmittingToSearchViewIfNull$2", f = "SearchController.kt", l = {265}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
public final class SearchController$delaySubmittingToSearchViewIfNull$2 extends SuspendLambda implements p {
    int label;

    public SearchController$delaySubmittingToSearchViewIfNull$2(c<? super SearchController$delaySubmittingToSearchViewIfNull$2> cVar) {
        super(2, cVar);
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SearchController$delaySubmittingToSearchViewIfNull$2(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            this.label = 1;
            if (L.a(100, this) == f4) {
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
        return ((SearchController$delaySubmittingToSearchViewIfNull$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
