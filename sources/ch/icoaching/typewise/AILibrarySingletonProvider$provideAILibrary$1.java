package ch.icoaching.typewise;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.AILibrarySingletonProvider", f = "AILibrarySingletonProvider.kt", l = {40, 27}, m = "provideAILibrary")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AILibrarySingletonProvider$provideAILibrary$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7740a;

    /* renamed from: b  reason: collision with root package name */
    Object f7741b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f7742c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AILibrarySingletonProvider f7743d;

    /* renamed from: e  reason: collision with root package name */
    int f7744e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrarySingletonProvider$provideAILibrary$1(AILibrarySingletonProvider aILibrarySingletonProvider, c cVar) {
        super(cVar);
        this.f7743d = aILibrarySingletonProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7742c = obj;
        this.f7744e |= Integer.MIN_VALUE;
        return this.f7743d.b(this);
    }
}
