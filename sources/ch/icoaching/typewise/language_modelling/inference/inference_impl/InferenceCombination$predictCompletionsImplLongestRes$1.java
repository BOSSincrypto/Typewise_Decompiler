package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination", f = "InferenceCombination.kt", l = {89}, m = "predictCompletionsImplLongestRes$typewise_autocorrect_library_predictions_3_0_19_161__release")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InferenceCombination$predictCompletionsImplLongestRes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8516a;

    /* renamed from: b  reason: collision with root package name */
    Object f8517b;

    /* renamed from: c  reason: collision with root package name */
    Object f8518c;

    /* renamed from: d  reason: collision with root package name */
    Object f8519d;

    /* renamed from: e  reason: collision with root package name */
    Object f8520e;

    /* renamed from: f  reason: collision with root package name */
    int f8521f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8522g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ InferenceCombination f8523h;

    /* renamed from: i  reason: collision with root package name */
    int f8524i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InferenceCombination$predictCompletionsImplLongestRes$1(InferenceCombination inferenceCombination, c cVar) {
        super(cVar);
        this.f8523h = inferenceCombination;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8522g = obj;
        this.f8524i |= Integer.MIN_VALUE;
        return this.f8523h.m((String) null, (Float) null, (String) null, this);
    }
}
