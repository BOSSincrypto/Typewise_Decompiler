package ch.icoaching.wrio.input;

import android.graphics.PointF;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$InputFieldState", f = "DefaultInputConnectionController.kt", l = {2147}, m = "replaceCharacter")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultInputConnectionController$InputFieldState$replaceCharacter$1 extends ContinuationImpl {
    char C$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultInputConnectionController.InputFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$InputFieldState$replaceCharacter$1(DefaultInputConnectionController.InputFieldState inputFieldState, c<? super DefaultInputConnectionController$InputFieldState$replaceCharacter$1> cVar) {
        super(cVar);
        this.this$0 = inputFieldState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.p(0, (PointF) null, this);
    }
}
