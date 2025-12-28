package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.BackToLettersOnContentChangeHandler", f = "BackToLettersOnContentChangeHandler.kt", l = {34, 46}, m = "onContentChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BackToLettersOnContentChangeHandler$onContentChanged$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackToLettersOnContentChangeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackToLettersOnContentChangeHandler$onContentChanged$1(BackToLettersOnContentChangeHandler backToLettersOnContentChangeHandler, c<? super BackToLettersOnContentChangeHandler$onContentChanged$1> cVar) {
        super(cVar);
        this.this$0 = backToLettersOnContentChangeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b((l) null, this);
    }
}
