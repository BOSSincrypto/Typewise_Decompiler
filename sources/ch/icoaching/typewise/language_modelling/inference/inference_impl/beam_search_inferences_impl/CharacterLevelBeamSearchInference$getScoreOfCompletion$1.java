package ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference", f = "CharacterLevelBeamSearchInference.kt", l = {71, 85}, m = "getScoreOfCompletion")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CharacterLevelBeamSearchInference$getScoreOfCompletion$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8569a;

    /* renamed from: b  reason: collision with root package name */
    Object f8570b;

    /* renamed from: c  reason: collision with root package name */
    Object f8571c;

    /* renamed from: d  reason: collision with root package name */
    Object f8572d;

    /* renamed from: e  reason: collision with root package name */
    Object f8573e;

    /* renamed from: f  reason: collision with root package name */
    Object f8574f;

    /* renamed from: g  reason: collision with root package name */
    Object f8575g;

    /* renamed from: h  reason: collision with root package name */
    int f8576h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f8577i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ CharacterLevelBeamSearchInference f8578j;

    /* renamed from: k  reason: collision with root package name */
    int f8579k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CharacterLevelBeamSearchInference$getScoreOfCompletion$1(CharacterLevelBeamSearchInference characterLevelBeamSearchInference, c cVar) {
        super(cVar);
        this.f8578j = characterLevelBeamSearchInference;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8577i = obj;
        this.f8579k |= Integer.MIN_VALUE;
        return this.f8578j.c((String) null, (String) null, this);
    }
}
