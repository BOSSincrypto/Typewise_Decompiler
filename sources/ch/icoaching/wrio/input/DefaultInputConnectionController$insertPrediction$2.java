package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import ch.icoaching.wrio.logging.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$insertPrediction$2", f = "DefaultInputConnectionController.kt", l = {1213}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$insertPrediction$2 extends SuspendLambda implements p {
    final /* synthetic */ InputConnection $inputConnection;
    final /* synthetic */ int $length;
    final /* synthetic */ String $prediction;
    final /* synthetic */ int $startIndex;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$insertPrediction$2(DefaultInputConnectionController defaultInputConnectionController, int i4, int i5, String str, InputConnection inputConnection, c<? super DefaultInputConnectionController$insertPrediction$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$startIndex = i4;
        this.$length = i5;
        this.$prediction = str;
        this.$inputConnection = inputConnection;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$insertPrediction$2(this.this$0, this.$startIndex, this.$length, this.$prediction, this.$inputConnection, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            String f5 = this.this$0.f9659B.f();
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "insertPrediction() :: FROM: " + I.a(f5, kotlin.coroutines.jvm.internal.a.d(this.this$0.f9659B.h())) + " | " + this.this$0.f9659B.i() + " | " + this.this$0.f9659B.h(), (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            int i5 = this.$startIndex;
            int i6 = this.$length;
            String str2 = this.$prediction;
            this.L$0 = f5;
            this.label = 1;
            if (K02.n(i5, i6, str2, this) == f4) {
                return f4;
            }
            str = f5;
        } else if (i4 == 1) {
            f.b(obj);
            str = (String) this.L$0;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String f6 = this.this$0.f9659B.f();
        List g4 = this.this$0.f9659B.g();
        int i7 = this.this$0.f9659B.i();
        Log log2 = Log.f10572a;
        Log.d(log2, "DefaultInputConnectionController", "insertPrediction() :: TO: " + I.a(f6, kotlin.coroutines.jvm.internal.a.d(this.this$0.f9659B.h())) + " | " + i7 + " | " + this.this$0.f9659B.h(), (Throwable) null, 4, (Object) null);
        InputConnection inputConnection = this.$inputConnection;
        int i8 = this.$startIndex;
        inputConnection.setComposingRegion(i8, this.$length + i8);
        this.$inputConnection.setComposingText(this.$prediction, 1);
        this.$inputConnection.finishComposingText();
        this.$inputConnection.setSelection(this.$startIndex + this.$prediction.length(), this.$startIndex + this.$prediction.length());
        this.this$0.f9680q = true;
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        this.this$0.m0(new l(str, f6, g4, this.this$0.f9659B.i(), this.$prediction, new OnContentChangeEventFlags(false, false, OnContentChangeEventFlags.TriggerEventType.PREDICTION)));
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$insertPrediction$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
