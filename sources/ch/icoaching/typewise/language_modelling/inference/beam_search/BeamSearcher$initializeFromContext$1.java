package ch.icoaching.typewise.language_modelling.inference.beam_search;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher", f = "BeamSearcher.kt", l = {87}, m = "initializeFromContext$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BeamSearcher$initializeFromContext$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8424a;

    /* renamed from: b  reason: collision with root package name */
    Object f8425b;

    /* renamed from: c  reason: collision with root package name */
    int f8426c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f8427d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ BeamSearcher f8428e;

    /* renamed from: f  reason: collision with root package name */
    int f8429f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeamSearcher$initializeFromContext$1(BeamSearcher beamSearcher, c cVar) {
        super(cVar);
        this.f8428e = beamSearcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8427d = obj;
        this.f8429f |= Integer.MIN_VALUE;
        return BeamSearcher.c(this.f8428e, (String) null, (String) null, 0, this);
    }
}
