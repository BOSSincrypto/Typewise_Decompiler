package ch.icoaching.wrio.appnomix.controller;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@d(c = "ch.icoaching.wrio.appnomix.controller.SearchController$subscribeToTextChanges$2$1$1", f = "SearchController.kt", l = {213, 228, 234}, m = "emit")
final class SearchController$subscribeToTextChanges$2$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchController$subscribeToTextChanges$2$1$1$emit$1(i iVar, c<? super SearchController$subscribeToTextChanges$2$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, this);
    }
}
