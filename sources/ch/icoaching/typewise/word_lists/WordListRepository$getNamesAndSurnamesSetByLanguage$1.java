package ch.icoaching.typewise.word_lists;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.word_lists.WordListRepository", f = "WordListRepository.kt", l = {102, 102}, m = "getNamesAndSurnamesSetByLanguage")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WordListRepository$getNamesAndSurnamesSetByLanguage$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8908a;

    /* renamed from: b  reason: collision with root package name */
    Object f8909b;

    /* renamed from: c  reason: collision with root package name */
    Object f8910c;

    /* renamed from: d  reason: collision with root package name */
    Object f8911d;

    /* renamed from: e  reason: collision with root package name */
    Object f8912e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f8913f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ WordListRepository f8914g;

    /* renamed from: h  reason: collision with root package name */
    int f8915h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WordListRepository$getNamesAndSurnamesSetByLanguage$1(WordListRepository wordListRepository, c cVar) {
        super(cVar);
        this.f8914g = wordListRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8913f = obj;
        this.f8915h |= Integer.MIN_VALUE;
        return this.f8914g.c((String) null, this);
    }
}
