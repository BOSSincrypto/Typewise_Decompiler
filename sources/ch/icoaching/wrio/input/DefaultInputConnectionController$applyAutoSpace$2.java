package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.I;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$applyAutoSpace$2", f = "DefaultInputConnectionController.kt", l = {388}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/input/t;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/input/t;"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$applyAutoSpace$2 extends SuspendLambda implements p {
    final /* synthetic */ String $change;
    final /* synthetic */ String $textBeforeCursor;
    final /* synthetic */ boolean $triggeredByUserInsertingCharacter;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$applyAutoSpace$2(DefaultInputConnectionController defaultInputConnectionController, String str, String str2, boolean z3, c<? super DefaultInputConnectionController$applyAutoSpace$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$textBeforeCursor = str;
        this.$change = str2;
        this.$triggeredByUserInsertingCharacter = z3;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$applyAutoSpace$2(this.this$0, this.$textBeforeCursor, this.$change, this.$triggeredByUserInsertingCharacter, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        j L02;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null || (L02 = this.this$0.f9662E) == null) {
                return null;
            }
            this.this$0.f9685v = SystemClock.elapsedRealtime();
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "applyAutoSpace() :: textBeforeCursor = '" + I.b(this.$textBeforeCursor, (Integer) null, 1, (Object) null) + "', change = '" + this.$change + '\'', (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController.AutoSpaceUseCase autoSpaceUseCase = new DefaultInputConnectionController.AutoSpaceUseCase(this.$textBeforeCursor, this.$change, L02, E02, this.this$0.f9659B, this.this$0, this.$triggeredByUserInsertingCharacter);
            this.label = 1;
            obj = autoSpaceUseCase.c(this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invoke(D d4, c<? super t> cVar) {
        return ((DefaultInputConnectionController$applyAutoSpace$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
