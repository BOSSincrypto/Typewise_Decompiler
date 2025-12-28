package ch.icoaching.typewise.word_lists;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.word_lists.WordListRepository", f = "WordListRepository.kt", l = {299, 304}, m = "loadWordListFromDisk")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WordListRepository$loadWordListFromDisk$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8923a;

    /* renamed from: b  reason: collision with root package name */
    Object f8924b;

    /* renamed from: c  reason: collision with root package name */
    Object f8925c;

    /* renamed from: d  reason: collision with root package name */
    Object f8926d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8927e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WordListRepository f8928f;

    /* renamed from: g  reason: collision with root package name */
    int f8929g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WordListRepository$loadWordListFromDisk$1(WordListRepository wordListRepository, c cVar) {
        super(cVar);
        this.f8928f = wordListRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8927e = obj;
        this.f8929g |= Integer.MIN_VALUE;
        return this.f8928f.j((List) null, this);
    }
}
