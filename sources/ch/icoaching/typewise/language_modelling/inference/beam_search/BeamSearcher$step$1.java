package ch.icoaching.typewise.language_modelling.inference.beam_search;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher", f = "BeamSearcher.kt", l = {140}, m = "step$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BeamSearcher$step$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8439a;

    /* renamed from: b  reason: collision with root package name */
    Object f8440b;

    /* renamed from: c  reason: collision with root package name */
    Object f8441c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8442d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BeamSearcher f8443e;

    /* renamed from: f  reason: collision with root package name */
    int f8444f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeamSearcher$step$1(BeamSearcher beamSearcher, c cVar) {
        super(cVar);
        this.f8443e = beamSearcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8442d = obj;
        this.f8444f |= Integer.MIN_VALUE;
        return BeamSearcher.b(this.f8443e, (e) null, (String) null, this);
    }
}
