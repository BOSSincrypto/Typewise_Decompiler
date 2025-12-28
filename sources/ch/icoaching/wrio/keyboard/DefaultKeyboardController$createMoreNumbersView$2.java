package ch.icoaching.wrio.keyboard;

import android.content.Context;
import android.widget.FrameLayout;
import ch.icoaching.wrio.keyboard.view.x;
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

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$createMoreNumbersView$2", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/view/x;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/view/x;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$createMoreNumbersView$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$createMoreNumbersView$2(DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$createMoreNumbersView$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultKeyboardController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$createMoreNumbersView$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            FrameLayout j12 = this.this$0.f9899s;
            if (j12 != null) {
                Context context = j12.getContext();
                o.d(context, "getContext(...)");
                x xVar = new x(context);
                xVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                xVar.setKeyClickDetectionEnabled(this.this$0.f9838B);
                this.this$0.B0(xVar, true);
                return xVar;
            }
            throw new IllegalStateException("Keyboard root View not inflated");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super x> cVar) {
        return ((DefaultKeyboardController$createMoreNumbersView$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
