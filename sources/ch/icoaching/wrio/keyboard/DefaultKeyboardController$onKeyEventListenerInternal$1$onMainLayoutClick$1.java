package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1(DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            if (this.this$0.G1()) {
                Log.d(Log.f10572a, "DefaultKeyboardController", "onMainLayoutClick() :: Remove more math", (Throwable) null, 4, (Object) null);
                DefaultKeyboardController.x0(this.this$0, false, 1, (Object) null);
            }
            if (this.this$0.I1()) {
                Log.d(Log.f10572a, "DefaultKeyboardController", "onMainLayoutClick() :: Remove more numbers", (Throwable) null, 4, (Object) null);
                this.this$0.R0(true);
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultKeyboardController$onKeyEventListenerInternal$1$onMainLayoutClick$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
