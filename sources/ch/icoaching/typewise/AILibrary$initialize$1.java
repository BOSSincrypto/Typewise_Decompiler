package ch.icoaching.typewise;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.AILibrary", f = "AILibrary.kt", l = {96}, m = "initialize")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AILibrary$initialize$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7724a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7725b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AILibrary f7726c;

    /* renamed from: d  reason: collision with root package name */
    int f7727d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrary$initialize$1(AILibrary aILibrary, c cVar) {
        super(cVar);
        this.f7726c = aILibrary;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7725b = obj;
        this.f7727d |= Integer.MIN_VALUE;
        return this.f7726c.j(this);
    }
}
