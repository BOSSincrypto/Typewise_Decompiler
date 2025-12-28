package ch.icoaching.wrio.prediction;

import ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class DefaultPredictionsController$fetchPredictions$1$1 extends FunctionReferenceImpl implements l {
    DefaultPredictionsController$fetchPredictions$1$1(Object obj) {
        super(1, obj, DefaultPredictionsController.class, "onResult", "onResult(Lch/icoaching/wrio/autocorrect/usecase/GetPredictionsUseCase$Response;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GetPredictionsUseCase.b) obj);
        return q.f14567a;
    }

    public final void invoke(GetPredictionsUseCase.b bVar) {
        o.e(bVar, "p0");
        ((DefaultPredictionsController) this.receiver).i(bVar);
    }
}
