package ch.icoaching.typewise.language_modelling.inference.beam_search;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher", f = "BeamSearcher.kt", l = {189, 206}, m = "invoke")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BeamSearcher$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8430a;

    /* renamed from: b  reason: collision with root package name */
    Object f8431b;

    /* renamed from: c  reason: collision with root package name */
    Object f8432c;

    /* renamed from: d  reason: collision with root package name */
    int f8433d;

    /* renamed from: e  reason: collision with root package name */
    int f8434e;

    /* renamed from: f  reason: collision with root package name */
    int f8435f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f8436g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ BeamSearcher f8437h;

    /* renamed from: i  reason: collision with root package name */
    int f8438i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeamSearcher$invoke$1(BeamSearcher beamSearcher, c cVar) {
        super(cVar);
        this.f8437h = beamSearcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8436g = obj;
        this.f8438i |= Integer.MIN_VALUE;
        return this.f8437h.f((String) null, (String) null, (Integer) null, this);
    }
}
