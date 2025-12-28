package ch.icoaching.wrio;

import ch.icoaching.wrio.input.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$createOnContentChangeHandlers$1", f = "BaseInputMethodService.kt", l = {1183}, m = "onContentChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BaseInputMethodService$createOnContentChangeHandlers$1$onContentChanged$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseInputMethodService$createOnContentChangeHandlers$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$createOnContentChangeHandlers$1$onContentChanged$1(BaseInputMethodService$createOnContentChangeHandlers$1 baseInputMethodService$createOnContentChangeHandlers$1, c<? super BaseInputMethodService$createOnContentChangeHandlers$1$onContentChanged$1> cVar) {
        super(cVar);
        this.this$0 = baseInputMethodService$createOnContentChangeHandlers$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b((l) null, this);
    }
}
