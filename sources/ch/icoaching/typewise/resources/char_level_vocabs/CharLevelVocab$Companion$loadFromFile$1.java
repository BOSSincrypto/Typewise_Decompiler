package ch.icoaching.typewise.resources.char_level_vocabs;

import ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.resources.char_level_vocabs.CharLevelVocab$Companion", f = "CharLevelVocab.kt", l = {100, 104}, m = "loadFromFile")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class CharLevelVocab$Companion$loadFromFile$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8853a;

    /* renamed from: b  reason: collision with root package name */
    Object f8854b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f8855c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CharLevelVocab.Companion f8856d;

    /* renamed from: e  reason: collision with root package name */
    int f8857e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CharLevelVocab$Companion$loadFromFile$1(CharLevelVocab.Companion companion, c cVar) {
        super(cVar);
        this.f8856d = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8855c = obj;
        this.f8857e |= Integer.MIN_VALUE;
        return this.f8856d.b((String) null, (a) null, (String) null, this);
    }
}
