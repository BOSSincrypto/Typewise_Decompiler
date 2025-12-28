package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach", f = "ProbsAndStatePriorApproach.kt", l = {61}, m = "handleCacheMiss$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ProbsAndStatePriorApproach$handleCacheMiss$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8464a;

    /* renamed from: b  reason: collision with root package name */
    Object f8465b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8466c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ProbsAndStatePriorApproach f8467d;

    /* renamed from: e  reason: collision with root package name */
    int f8468e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProbsAndStatePriorApproach$handleCacheMiss$1(ProbsAndStatePriorApproach probsAndStatePriorApproach, c cVar) {
        super(cVar);
        this.f8467d = probsAndStatePriorApproach;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8466c = obj;
        this.f8468e |= Integer.MIN_VALUE;
        return ProbsAndStatePriorApproach.k(this.f8467d, (String) null, this);
    }
}
