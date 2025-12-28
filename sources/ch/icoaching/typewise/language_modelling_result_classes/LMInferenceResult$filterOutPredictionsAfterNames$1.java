package ch.icoaching.typewise.language_modelling_result_classes;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult", f = "LMInferenceResult.kt", l = {369}, m = "filterOutPredictionsAfterNames")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LMInferenceResult$filterOutPredictionsAfterNames$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8813a;

    /* renamed from: b  reason: collision with root package name */
    Object f8814b;

    /* renamed from: c  reason: collision with root package name */
    int f8815c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8816d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LMInferenceResult f8817e;

    /* renamed from: f  reason: collision with root package name */
    int f8818f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LMInferenceResult$filterOutPredictionsAfterNames$1(LMInferenceResult lMInferenceResult, c cVar) {
        super(cVar);
        this.f8817e = lMInferenceResult;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8816d = obj;
        this.f8818f |= Integer.MIN_VALUE;
        return this.f8817e.g((String) null, (String) null, 0, (ch.icoaching.typewise.word_lists.c) null, this);
    }
}
