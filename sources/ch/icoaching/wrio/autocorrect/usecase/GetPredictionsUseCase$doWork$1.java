package ch.icoaching.wrio.autocorrect.usecase;

import ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase", f = "GetPredictionsUseCase.kt", l = {49}, m = "doWork")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class GetPredictionsUseCase$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetPredictionsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetPredictionsUseCase$doWork$1(GetPredictionsUseCase getPredictionsUseCase, c<? super GetPredictionsUseCase$doWork$1> cVar) {
        super(cVar);
        this.this$0 = getPredictionsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((GetPredictionsUseCase.a) null, this);
    }
}
