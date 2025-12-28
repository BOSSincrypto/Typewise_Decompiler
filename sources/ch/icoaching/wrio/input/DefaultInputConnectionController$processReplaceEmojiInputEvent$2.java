package ch.icoaching.wrio.input;

import android.os.SystemClock;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processReplaceEmojiInputEvent$2", f = "DefaultInputConnectionController.kt", l = {673}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processReplaceEmojiInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.l $it;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processReplaceEmojiInputEvent$2(DefaultInputConnectionController.a.l lVar, DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processReplaceEmojiInputEvent$2> cVar) {
        super(2, cVar);
        this.$it = lVar;
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processReplaceEmojiInputEvent$2(this.$it, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        InputConnection inputConnection;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "processReplaceEmojiInputEvent() :: " + this.$it.a(), (Throwable) null, 4, (Object) null);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            j L02 = this.this$0.f9662E;
            if (L02 == null) {
                return q.f14567a;
            }
            String f5 = this.this$0.f9659B.f();
            if (L02.b() != null) {
                Log.d(log, "DefaultInputConnectionController", "processReplaceEmojiInputEvent() :: Not replacing an emoji into a numeric input field", (Throwable) null, 4, (Object) null);
                return q.f14567a;
            }
            if (this.this$0.f9677n == null) {
                this.this$0.f9677n = f5;
            }
            this.this$0.f9678o = this.$it.a();
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            String a4 = this.$it.a();
            this.L$0 = E02;
            this.label = 1;
            Object q4 = K02.q(a4, this);
            if (q4 == f4) {
                return f4;
            }
            inputConnection = E02;
            obj = q4;
        } else if (i4 == 1) {
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        inputConnection.beginBatchEdit();
        inputConnection.deleteSurroundingText(((String) obj).length(), 0);
        inputConnection.commitText(this.$it.a(), 1);
        inputConnection.endBatchEdit();
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processReplaceEmojiInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
