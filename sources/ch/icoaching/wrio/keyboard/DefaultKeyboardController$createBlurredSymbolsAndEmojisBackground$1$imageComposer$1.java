package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
import j2.C0690c;
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

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1", f = "DefaultKeyboardController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Lj2/c$b;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/D;)Lj2/c$b;"}, k = 3, mv = {2, 0, 0})
final class DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1 extends SuspendLambda implements p {
    final /* synthetic */ KeyboardLayoutView $keyboardLayoutViewLocal;
    int label;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1(KeyboardLayoutView keyboardLayoutView, DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1> cVar) {
        super(2, cVar);
        this.$keyboardLayoutViewLocal = keyboardLayoutView;
        this.this$0 = defaultKeyboardController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1(this.$keyboardLayoutViewLocal, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            C0690c.a d4 = C0690c.b(this.$keyboardLayoutViewLocal.getContext()).c(5).d(12);
            ThemeModel F12 = this.this$0.f9862Z;
            if (F12 == null) {
                o.p("selectedKeyboardTheme");
                F12 = null;
            }
            return d4.b(F12.getSpecialOverlaysTheme().getBackgroundColor()).a(this.$keyboardLayoutViewLocal);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super C0690c.b> cVar) {
        return ((DefaultKeyboardController$createBlurredSymbolsAndEmojisBackground$1$imageComposer$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
