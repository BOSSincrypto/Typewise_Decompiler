package ch.icoaching.typewise;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.AILibrarySingletonProvider$provideAILibrary$2$1", f = "AILibrarySingletonProvider.kt", l = {28}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class AILibrarySingletonProvider$provideAILibrary$2$1 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    int f7745a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AILibrarySingletonProvider f7746b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AILibrarySingletonProvider$provideAILibrary$2$1(AILibrarySingletonProvider aILibrarySingletonProvider, c cVar) {
        super(2, cVar);
        this.f7746b = aILibrarySingletonProvider;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((AILibrarySingletonProvider$provideAILibrary$2$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        return new AILibrarySingletonProvider$provideAILibrary$2$1(this.f7746b, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.f7745a;
        if (i4 == 0) {
            f.b(obj);
            AILibrary a4 = this.f7746b.f7739f;
            o.b(a4);
            this.f7745a = 1;
            if (a4.j(this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }
}
