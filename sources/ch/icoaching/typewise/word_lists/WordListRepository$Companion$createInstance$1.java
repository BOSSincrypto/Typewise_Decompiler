package ch.icoaching.typewise.word_lists;

import ch.icoaching.typewise.word_lists.WordListRepository;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.word_lists.WordListRepository$Companion", f = "WordListRepository.kt", l = {332}, m = "createInstance")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WordListRepository$Companion$createInstance$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8902a;

    /* renamed from: b  reason: collision with root package name */
    Object f8903b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8904c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ WordListRepository.Companion f8905d;

    /* renamed from: e  reason: collision with root package name */
    int f8906e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WordListRepository$Companion$createInstance$1(WordListRepository.Companion companion, c cVar) {
        super(cVar);
        this.f8905d = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8904c = obj;
        this.f8906e |= Integer.MIN_VALUE;
        return this.f8905d.b((WordListRepository.b) null, (WordListRepository.a) null, this);
    }
}
