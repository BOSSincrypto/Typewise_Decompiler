package ch.icoaching.typewise.language_modelling.inference;

import D0.Q;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.InferenceRepository", f = "InferenceRepository.kt", l = {43}, m = "getInferenceByModelNameAndInferenceTechnique")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8400a;

    /* renamed from: b  reason: collision with root package name */
    Object f8401b;

    /* renamed from: c  reason: collision with root package name */
    Object f8402c;

    /* renamed from: d  reason: collision with root package name */
    Object f8403d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8404e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ InferenceRepository f8405f;

    /* renamed from: g  reason: collision with root package name */
    int f8406g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1(InferenceRepository inferenceRepository, c cVar) {
        super(cVar);
        this.f8405f = inferenceRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8404e = obj;
        this.f8406g |= Integer.MIN_VALUE;
        return this.f8405f.a((String) null, (String) null, (ch.icoaching.typewise.word_lists.c) null, (Q) null, (Integer) null, (Integer) null, (Float) null, this);
    }
}
