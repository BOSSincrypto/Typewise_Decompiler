package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach", f = "ProbsAndStatePriorApproach.kt", l = {49}, m = "encodeMissingPartOfContext$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ProbsAndStatePriorApproach$encodeMissingPartOfContext$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8459a;

    /* renamed from: b  reason: collision with root package name */
    Object f8460b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8461c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ProbsAndStatePriorApproach f8462d;

    /* renamed from: e  reason: collision with root package name */
    int f8463e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProbsAndStatePriorApproach$encodeMissingPartOfContext$1(ProbsAndStatePriorApproach probsAndStatePriorApproach, c cVar) {
        super(cVar);
        this.f8462d = probsAndStatePriorApproach;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8461c = obj;
        this.f8463e |= Integer.MIN_VALUE;
        return ProbsAndStatePriorApproach.j(this.f8462d, (String) null, (String) null, (Pair) null, this);
    }
}
