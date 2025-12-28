package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.AutoSpaceOnContentChangeHandler", f = "AutoSpaceOnContentChangeHandler.kt", l = {26, 31, 48, 55, 59}, m = "onContentChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AutoSpaceOnContentChangeHandler$onContentChanged$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutoSpaceOnContentChangeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutoSpaceOnContentChangeHandler$onContentChanged$1(AutoSpaceOnContentChangeHandler autoSpaceOnContentChangeHandler, c<? super AutoSpaceOnContentChangeHandler$onContentChanged$1> cVar) {
        super(cVar);
        this.this$0 = autoSpaceOnContentChangeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b((l) null, this);
    }
}
