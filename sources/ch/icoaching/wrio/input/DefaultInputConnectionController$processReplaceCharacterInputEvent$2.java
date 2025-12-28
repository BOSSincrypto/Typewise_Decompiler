package ch.icoaching.wrio.input;

import android.graphics.PointF;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processReplaceCharacterInputEvent$2", f = "DefaultInputConnectionController.kt", l = {709, 739}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processReplaceCharacterInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.j $it;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processReplaceCharacterInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.j jVar, c<? super DefaultInputConnectionController$processReplaceCharacterInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$it = jVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processReplaceCharacterInputEvent$2(this.this$0, this.$it, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        InputConnection inputConnection;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            if (this.this$0.f9659B.i() == 0) {
                Log log = Log.f10572a;
                Log.d(log, "DefaultInputConnectionController", "processReplaceCharacterInputEvent() :: No text in the input field. Processing event as plain insert for '" + this.$it.a() + '\'', (Throwable) null, 4, (Object) null);
                DefaultInputConnectionController defaultInputConnectionController = this.this$0;
                DefaultInputConnectionController.a.f fVar = new DefaultInputConnectionController.a.f(this.$it.a(), this.$it.b());
                this.label = 1;
                if (defaultInputConnectionController.G(fVar, this) == f4) {
                    return f4;
                }
            } else {
                Log log2 = Log.f10572a;
                Log.d(log2, "DefaultInputConnectionController", "processReplaceCharacterInputEvent() :: " + this.$it.a() + " | " + this.$it.b(), (Throwable) null, 4, (Object) null);
                InputConnection E02 = this.this$0.f9661D;
                if (E02 == null) {
                    return q.f14567a;
                }
                j L02 = this.this$0.f9662E;
                if (L02 == null) {
                    return q.f14567a;
                }
                String f5 = this.this$0.f9659B.f();
                NumberInputType b4 = L02.b();
                if (b4 == null || k.d(b4, this.$it.a(), this.this$0.f9659B.i(), f5)) {
                    if (this.this$0.f9677n == null) {
                        this.this$0.f9677n = f5;
                    }
                    this.this$0.f9678o = String.valueOf(this.$it.a());
                    DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
                    char a4 = this.$it.a();
                    PointF b5 = this.$it.b();
                    this.L$0 = E02;
                    this.label = 2;
                    if (K02.p(a4, b5, this) == f4) {
                        return f4;
                    }
                    inputConnection = E02;
                    this.this$0.f9679p = SystemClock.elapsedRealtime();
                    inputConnection.beginBatchEdit();
                    inputConnection.deleteSurroundingText(1, 0);
                    inputConnection.commitText(String.valueOf(this.$it.a()), 1);
                    inputConnection.endBatchEdit();
                    return q.f14567a;
                }
                Log.d(log2, "DefaultInputConnectionController", "processInsertCharacterInputEvent() :: Not inserting '" + this.$it.a() + "' in a numeric input field of type " + L02.b(), (Throwable) null, 4, (Object) null);
                return q.f14567a;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else if (i4 == 2) {
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
            this.this$0.f9679p = SystemClock.elapsedRealtime();
            inputConnection.beginBatchEdit();
            inputConnection.deleteSurroundingText(1, 0);
            inputConnection.commitText(String.valueOf(this.$it.a()), 1);
            inputConnection.endBatchEdit();
            return q.f14567a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processReplaceCharacterInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
