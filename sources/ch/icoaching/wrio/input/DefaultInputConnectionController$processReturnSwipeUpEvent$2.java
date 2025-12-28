package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processReturnSwipeUpEvent$2", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processReturnSwipeUpEvent$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processReturnSwipeUpEvent$2(DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processReturnSwipeUpEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processReturnSwipeUpEvent$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            j L02 = this.this$0.f9662E;
            if (L02 == null) {
                return q.f14567a;
            }
            if (L02.b() != null) {
                Log.d(Log.f10572a, "DefaultInputConnectionController", "processReturnSwipeUpEvent() :: Not inserting non-numeric character into a numeric input field", (Throwable) null, 4, (Object) null);
                return q.f14567a;
            }
            this.this$0.f9679p = SystemClock.elapsedRealtime();
            E02.commitText("\n", 1);
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processReturnSwipeUpEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
