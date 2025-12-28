package ch.icoaching.typewise.resources.char_level_vocabs;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocabRepository", f = "CharLevelVocabRepository.kt", l = {12}, m = "getCharLevelVocabByInfo")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CharLevelVocabRepository$getCharLevelVocabByInfo$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8863a;

    /* renamed from: b  reason: collision with root package name */
    Object f8864b;

    /* renamed from: c  reason: collision with root package name */
    Object f8865c;

    /* renamed from: d  reason: collision with root package name */
    Object f8866d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f8867e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CharLevelVocabRepository f8868f;

    /* renamed from: g  reason: collision with root package name */
    int f8869g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CharLevelVocabRepository$getCharLevelVocabByInfo$1(CharLevelVocabRepository charLevelVocabRepository, c cVar) {
        super(cVar);
        this.f8868f = charLevelVocabRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8867e = obj;
        this.f8869g |= Integer.MIN_VALUE;
        return this.f8868f.a((a) null, (String) null, this);
    }
}
