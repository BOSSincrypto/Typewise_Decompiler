package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processRestoreInputEvent$2", f = "DefaultInputConnectionController.kt", l = {783}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processRestoreInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.m $inputEvent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processRestoreInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.m mVar, c<? super DefaultInputConnectionController$processRestoreInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$inputEvent = mVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processRestoreInputEvent$2(this.this$0, this.$inputEvent, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        InputConnection inputConnection;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            inputConnection = this.this$0.f9661D;
            if (inputConnection == null) {
                return q.f14567a;
            }
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "onRestoreCharacters() :: " + this.$inputEvent.a(), (Throwable) null, 4, (Object) null);
            String f5 = this.this$0.f9659B.f();
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            int a4 = this.$inputEvent.a();
            this.L$0 = inputConnection;
            this.L$1 = f5;
            this.label = 1;
            Object s4 = K02.s(a4, this);
            if (s4 == f4) {
                return f4;
            }
            str = f5;
            obj = s4;
        } else if (i4 == 1) {
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
            str = (String) this.L$1;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) obj;
        if (str2.length() == 0) {
            return q.f14567a;
        }
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        inputConnection.beginBatchEdit();
        inputConnection.commitText(str2, 1);
        inputConnection.endBatchEdit();
        l lVar = new l(str, this.this$0.f9659B.f(), this.this$0.f9659B.g(), this.this$0.f9659B.i(), str2, new OnContentChangeEventFlags(false, true, OnContentChangeEventFlags.TriggerEventType.RESTORE));
        this.this$0.f9676m = lVar;
        this.this$0.m0(lVar);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processRestoreInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
