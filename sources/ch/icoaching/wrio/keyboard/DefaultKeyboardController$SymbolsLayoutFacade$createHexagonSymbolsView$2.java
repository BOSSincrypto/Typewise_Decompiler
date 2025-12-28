package ch.icoaching.wrio.keyboard;

import android.content.Context;
import android.widget.FrameLayout;
import ch.icoaching.wrio.keyboard.DefaultKeyboardController;
import ch.icoaching.wrio.keyboard.view.r;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/keyboard/view/r;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/keyboard/view/r;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2 extends SuspendLambda implements p {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ DefaultKeyboardController.SymbolsLayoutFacade this$0;
    final /* synthetic */ DefaultKeyboardController this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2(Context context, DefaultKeyboardController.SymbolsLayoutFacade symbolsLayoutFacade, DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2> cVar) {
        super(2, cVar);
        this.$context = context;
        this.this$0 = symbolsLayoutFacade;
        this.this$1 = defaultKeyboardController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2(this.$context, this.this$0, this.this$1, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            r rVar = new r(this.$context);
            rVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            rVar.setKeyClickDetectionEnabled(this.this$0.s());
            this.this$1.z0(rVar);
            return rVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super r> cVar) {
        return ((DefaultKeyboardController$SymbolsLayoutFacade$createHexagonSymbolsView$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
