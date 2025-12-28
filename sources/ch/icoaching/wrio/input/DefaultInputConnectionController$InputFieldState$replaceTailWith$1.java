package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.DefaultInputConnectionController;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState", f = "DefaultInputConnectionController.kt", l = {2147}, m = "replaceTailWith")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultInputConnectionController$InputFieldState$replaceTailWith$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultInputConnectionController.InputFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$InputFieldState$replaceTailWith$1(DefaultInputConnectionController.InputFieldState inputFieldState, c<? super DefaultInputConnectionController$InputFieldState$replaceTailWith$1> cVar) {
        super(cVar);
        this.this$0 = inputFieldState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.r(0, (String) null, 0, 0, this);
    }
}
