package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory", f = "SentenceDBInMemory.kt", l = {61}, m = "load")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SentenceDBInMemory$load$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8749a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8750b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SentenceDBInMemory f8751c;

    /* renamed from: d  reason: collision with root package name */
    int f8752d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SentenceDBInMemory$load$1(SentenceDBInMemory sentenceDBInMemory, c cVar) {
        super(cVar);
        this.f8751c = sentenceDBInMemory;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8750b = obj;
        this.f8752d |= Integer.MIN_VALUE;
        return this.f8751c.c(this);
    }
}
