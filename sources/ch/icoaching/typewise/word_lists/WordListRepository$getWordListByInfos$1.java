package ch.icoaching.typewise.word_lists;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.word_lists.WordListRepository", f = "WordListRepository.kt", l = {72}, m = "getWordListByInfos")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WordListRepository$getWordListByInfos$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8916a;

    /* renamed from: b  reason: collision with root package name */
    Object f8917b;

    /* renamed from: c  reason: collision with root package name */
    Object f8918c;

    /* renamed from: d  reason: collision with root package name */
    Object f8919d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8920e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WordListRepository f8921f;

    /* renamed from: g  reason: collision with root package name */
    int f8922g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WordListRepository$getWordListByInfos$1(WordListRepository wordListRepository, c cVar) {
        super(cVar);
        this.f8921f = wordListRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8920e = obj;
        this.f8922g |= Integer.MIN_VALUE;
        return this.f8921f.h((List) null, this);
    }
}
