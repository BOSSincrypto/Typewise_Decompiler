package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion", f = "SentenceDBInMemory.kt", l = {111, 112}, m = "invoke")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SentenceDBInMemory$Companion$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8745a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8746b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SentenceDBInMemory.Companion f8747c;

    /* renamed from: d  reason: collision with root package name */
    int f8748d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SentenceDBInMemory$Companion$invoke$1(SentenceDBInMemory.Companion companion, c cVar) {
        super(cVar);
        this.f8747c = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8746b = obj;
        this.f8748d |= Integer.MIN_VALUE;
        return this.f8747c.a((String) null, (String) null, this);
    }
}
