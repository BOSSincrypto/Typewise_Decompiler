package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.AutocorrectOnContentChangeHandler", f = "AutocorrectOnContentChangeHandler.kt", l = {23, 26, 40, 43}, m = "onContentChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AutocorrectOnContentChangeHandler$onContentChanged$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutocorrectOnContentChangeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutocorrectOnContentChangeHandler$onContentChanged$1(AutocorrectOnContentChangeHandler autocorrectOnContentChangeHandler, c<? super AutocorrectOnContentChangeHandler$onContentChanged$1> cVar) {
        super(cVar);
        this.this$0 = autocorrectOnContentChangeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b((l) null, this);
    }
}
