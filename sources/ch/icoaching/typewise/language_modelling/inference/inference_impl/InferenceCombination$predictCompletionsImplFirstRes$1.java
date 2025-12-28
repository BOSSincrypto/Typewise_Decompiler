package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination", f = "InferenceCombination.kt", l = {67}, m = "predictCompletionsImplFirstRes$typewise_autocorrect_library_predictions_3_0_19_161__release")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InferenceCombination$predictCompletionsImplFirstRes$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8508a;

    /* renamed from: b  reason: collision with root package name */
    Object f8509b;

    /* renamed from: c  reason: collision with root package name */
    Object f8510c;

    /* renamed from: d  reason: collision with root package name */
    Object f8511d;

    /* renamed from: e  reason: collision with root package name */
    int f8512e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f8513f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ InferenceCombination f8514g;

    /* renamed from: h  reason: collision with root package name */
    int f8515h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InferenceCombination$predictCompletionsImplFirstRes$1(InferenceCombination inferenceCombination, c cVar) {
        super(cVar);
        this.f8514g = inferenceCombination;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8513f = obj;
        this.f8515h |= Integer.MIN_VALUE;
        return this.f8514g.l((String) null, (Float) null, (String) null, this);
    }
}
