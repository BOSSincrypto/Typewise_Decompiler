package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach", f = "KeepEncodingFromInWordCachingPriorApproach.kt", l = {32, 38}, m = "getProbabilitiesAndStateFromText$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    boolean f8454a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8455b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ KeepEncodingFromInWordCachingPriorApproach f8456c;

    /* renamed from: d  reason: collision with root package name */
    int f8457d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1(KeepEncodingFromInWordCachingPriorApproach keepEncodingFromInWordCachingPriorApproach, c cVar) {
        super(cVar);
        this.f8456c = keepEncodingFromInWordCachingPriorApproach;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8455b = obj;
        this.f8457d |= Integer.MIN_VALUE;
        return KeepEncodingFromInWordCachingPriorApproach.r(this.f8456c, (String) null, (String) null, false, this);
    }
}
