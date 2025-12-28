package ch.icoaching.wrio.input;

import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processMoveCursorInputEvent$2", f = "DefaultInputConnectionController.kt", l = {1036}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processMoveCursorInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.h $inputEvent;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processMoveCursorInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.h hVar, c<? super DefaultInputConnectionController$processMoveCursorInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$inputEvent = hVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processMoveCursorInputEvent$2(this.this$0, this.$inputEvent, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        InputConnection inputConnection;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            int a4 = this.$inputEvent.a();
            this.L$0 = E02;
            this.label = 1;
            Object l4 = K02.l(a4, this);
            if (l4 == f4) {
                return f4;
            }
            inputConnection = E02;
            obj = l4;
        } else if (i4 == 1) {
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = ((Number) obj).intValue();
        Log.d(Log.f10572a, "DefaultInputConnectionController", "processMoveCursorInputEvent() :: " + intValue, (Throwable) null, 4, (Object) null);
        if (intValue < 0) {
            int abs = Math.abs(intValue);
            while (abs > 0) {
                abs--;
                f.l(inputConnection);
            }
        } else if (intValue > 0) {
            int abs2 = Math.abs(intValue);
            while (abs2 > 0) {
                abs2--;
                f.m(inputConnection);
            }
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processMoveCursorInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
