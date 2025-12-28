package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel", f = "SentenceCompletionNaiveModel.kt", l = {36}, m = "loadWeights")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SentenceCompletionNaiveModel$loadWeights$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8739a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8740b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SentenceCompletionNaiveModel f8741c;

    /* renamed from: d  reason: collision with root package name */
    int f8742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SentenceCompletionNaiveModel$loadWeights$1(SentenceCompletionNaiveModel sentenceCompletionNaiveModel, c cVar) {
        super(cVar);
        this.f8741c = sentenceCompletionNaiveModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8740b = obj;
        this.f8742d |= Integer.MIN_VALUE;
        return this.f8741c.a((String) null, this);
    }
}
