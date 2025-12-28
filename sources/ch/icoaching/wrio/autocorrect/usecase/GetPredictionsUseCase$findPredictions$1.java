package ch.icoaching.wrio.autocorrect.usecase;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase", f = "GetPredictionsUseCase.kt", l = {69, 80}, m = "findPredictions")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class GetPredictionsUseCase$findPredictions$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetPredictionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetPredictionsUseCase$findPredictions$1(GetPredictionsUseCase getPredictionsUseCase, c<? super GetPredictionsUseCase$findPredictions$1> cVar) {
        super(cVar);
        this.this$0 = getPredictionsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(0, (String) null, (String) null, this);
    }
}
