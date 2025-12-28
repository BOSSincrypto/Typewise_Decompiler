package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion", f = "SentenceCompletionNaiveModel.kt", l = {215}, m = "invoke")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SentenceCompletionNaiveModel$Companion$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8728a;

    /* renamed from: b  reason: collision with root package name */
    Object f8729b;

    /* renamed from: c  reason: collision with root package name */
    Object f8730c;

    /* renamed from: d  reason: collision with root package name */
    Object f8731d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8732e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f8733f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ SentenceCompletionNaiveModel.Companion f8734g;

    /* renamed from: h  reason: collision with root package name */
    int f8735h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SentenceCompletionNaiveModel$Companion$invoke$1(SentenceCompletionNaiveModel.Companion companion, c cVar) {
        super(cVar);
        this.f8734g = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8733f = obj;
        this.f8735h |= Integer.MIN_VALUE;
        return this.f8734g.b((String) null, (String) null, (String) null, (String) null, false, this);
    }
}
