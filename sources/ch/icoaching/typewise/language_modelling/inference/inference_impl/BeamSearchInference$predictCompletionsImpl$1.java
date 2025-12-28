package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference", f = "BeamSearchInference.kt", l = {107}, m = "predictCompletionsImpl$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BeamSearchInference$predictCompletionsImpl$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8485a;

    /* renamed from: b  reason: collision with root package name */
    Object f8486b;

    /* renamed from: c  reason: collision with root package name */
    Object f8487c;

    /* renamed from: d  reason: collision with root package name */
    Object f8488d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8489e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ BeamSearchInference f8490f;

    /* renamed from: g  reason: collision with root package name */
    int f8491g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeamSearchInference$predictCompletionsImpl$1(BeamSearchInference beamSearchInference, c cVar) {
        super(cVar);
        this.f8490f = beamSearchInference;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8489e = obj;
        this.f8491g |= Integer.MIN_VALUE;
        return BeamSearchInference.l(this.f8490f, (String) null, (String) null, (Float) null, (Integer) null, (String) null, this);
    }
}
