package ch.icoaching.typewise;

import ch.icoaching.typewise.word_lists.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import u2.l;

@d(c = "ch.icoaching.typewise.AILibrary", f = "AILibrary.kt", l = {126, 66}, m = "getWordListRepository")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AILibrary$getWordListRepository$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7709a;

    /* renamed from: b  reason: collision with root package name */
    Object f7710b;

    /* renamed from: c  reason: collision with root package name */
    Object f7711c;

    /* renamed from: d  reason: collision with root package name */
    Object f7712d;

    /* renamed from: e  reason: collision with root package name */
    Object f7713e;

    /* renamed from: f  reason: collision with root package name */
    Object f7714f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f7715g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AILibrary f7716h;

    /* renamed from: i  reason: collision with root package name */
    int f7717i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrary$getWordListRepository$1(AILibrary aILibrary, c cVar) {
        super(cVar);
        this.f7716h = aILibrary;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7715g = obj;
        this.f7717i |= Integer.MIN_VALUE;
        return this.f7716h.f((List) null, (b) null, (b) null, (l) null, this);
    }
}
