package ch.icoaching.wrio.personalization.dynamic;

import ch.icoaching.wrio.keyboard.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.personalization.dynamic.DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1", f = "DefaultDynamicLayoutController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/D;", "", "Lch/icoaching/wrio/keyboard/t;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lkotlinx/coroutines/D;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
final class DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultDynamicLayoutController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1(DefaultDynamicLayoutController defaultDynamicLayoutController, c<? super DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultDynamicLayoutController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            return this.this$0.f10591c.f(this.this$0.f10592d.C());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super List<t>> cVar) {
        return ((DefaultDynamicLayoutController$loadDynamicOffsets$1$1$loadedDynamicOffsets$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
