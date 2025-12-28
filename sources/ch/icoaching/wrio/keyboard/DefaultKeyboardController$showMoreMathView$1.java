package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.keyboard.DefaultKeyboardController", f = "DefaultKeyboardController.kt", l = {1512}, m = "showMoreMathView")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultKeyboardController$showMoreMathView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultKeyboardController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultKeyboardController$showMoreMathView$1(DefaultKeyboardController defaultKeyboardController, c<? super DefaultKeyboardController$showMoreMathView$1> cVar) {
        super(cVar);
        this.this$0 = defaultKeyboardController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.L0(this);
    }
}
