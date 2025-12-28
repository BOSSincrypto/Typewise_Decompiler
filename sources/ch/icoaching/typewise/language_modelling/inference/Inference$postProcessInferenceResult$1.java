package ch.icoaching.typewise.language_modelling.inference;

import ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.Inference", f = "Inference.kt", l = {137, 142, 153}, m = "postProcessInferenceResult")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Inference$postProcessInferenceResult$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8372a;

    /* renamed from: b  reason: collision with root package name */
    Object f8373b;

    /* renamed from: c  reason: collision with root package name */
    Object f8374c;

    /* renamed from: d  reason: collision with root package name */
    Object f8375d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8376e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Inference f8377f;

    /* renamed from: g  reason: collision with root package name */
    int f8378g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Inference$postProcessInferenceResult$1(Inference inference, c cVar) {
        super(cVar);
        this.f8377f = inference;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8376e = obj;
        this.f8378g |= Integer.MIN_VALUE;
        return this.f8377f.g((LMInferenceResult) null, (String) null, (String) null, this);
    }
}
