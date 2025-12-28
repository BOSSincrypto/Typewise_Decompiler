package ch.icoaching.wrio.autocorrect;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.autocorrect.AutocorrectFacade", f = "AutocorrectFacade.kt", l = {193, 206, 202, 219}, m = "onDominantLanguageChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AutocorrectFacade$onDominantLanguageChanged$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AutocorrectFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AutocorrectFacade$onDominantLanguageChanged$1(AutocorrectFacade autocorrectFacade, c<? super AutocorrectFacade$onDominantLanguageChanged$1> cVar) {
        super(cVar);
        this.this$0 = autocorrectFacade;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c((String) null, this);
    }
}
