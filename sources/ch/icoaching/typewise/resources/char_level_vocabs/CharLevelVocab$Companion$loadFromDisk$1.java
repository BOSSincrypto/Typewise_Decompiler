package ch.icoaching.typewise.resources.char_level_vocabs;

import ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion", f = "CharLevelVocab.kt", l = {90}, m = "loadFromDisk")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CharLevelVocab$Companion$loadFromDisk$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f8850a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CharLevelVocab.Companion f8851b;

    /* renamed from: c  reason: collision with root package name */
    int f8852c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CharLevelVocab$Companion$loadFromDisk$1(CharLevelVocab.Companion companion, c cVar) {
        super(cVar);
        this.f8851b = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8850a = obj;
        this.f8852c |= Integer.MIN_VALUE;
        return this.f8851b.a((a) null, (String) null, this);
    }
}
