package ch.icoaching.wrio.input;

import ch.icoaching.wrio.input.DefaultInputConnectionController;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$AutoSpaceUseCase", f = "DefaultInputConnectionController.kt", l = {1726}, m = "execute")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultInputConnectionController$AutoSpaceUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultInputConnectionController.AutoSpaceUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$AutoSpaceUseCase$execute$1(DefaultInputConnectionController.AutoSpaceUseCase autoSpaceUseCase, c<? super DefaultInputConnectionController$AutoSpaceUseCase$execute$1> cVar) {
        super(cVar);
        this.this$0 = autoSpaceUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
