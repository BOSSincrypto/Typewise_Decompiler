package ch.icoaching.typewise;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.AILibrary", f = "AILibrary.kt", l = {108, 111}, m = "loadAndInitializeConfigs")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class AILibrary$loadAndInitializeConfigs$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7728a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7729b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AILibrary f7730c;

    /* renamed from: d  reason: collision with root package name */
    int f7731d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrary$loadAndInitializeConfigs$1(AILibrary aILibrary, c cVar) {
        super(cVar);
        this.f7730c = aILibrary;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7729b = obj;
        this.f7731d |= Integer.MIN_VALUE;
        return this.f7730c.k(this);
    }
}
