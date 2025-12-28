package ch.icoaching.typewise.language_modelling.inference;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.InferenceRepository", f = "InferenceRepository.kt", l = {61}, m = "destroyInferences")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InferenceRepository$destroyInferences$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8395a;

    /* renamed from: b  reason: collision with root package name */
    Object f8396b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8397c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ InferenceRepository f8398d;

    /* renamed from: e  reason: collision with root package name */
    int f8399e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InferenceRepository$destroyInferences$1(InferenceRepository inferenceRepository, c cVar) {
        super(cVar);
        this.f8398d = inferenceRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8397c = obj;
        this.f8399e |= Integer.MIN_VALUE;
        return this.f8398d.b(this);
    }
}
