package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.CorrectionInfo;
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
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processCorrection$2", f = "DefaultInputConnectionController.kt", l = {407}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/wrio/input/t;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/wrio/input/t;"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processCorrection$2 extends SuspendLambda implements p {
    final /* synthetic */ CorrectionInfo $correctionInfo;
    final /* synthetic */ boolean $isCorrectionUndone;
    final /* synthetic */ boolean $isEmojiTriggered;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processCorrection$2(CorrectionInfo correctionInfo, boolean z3, DefaultInputConnectionController defaultInputConnectionController, boolean z4, c<? super DefaultInputConnectionController$processCorrection$2> cVar) {
        super(2, cVar);
        this.$correctionInfo = correctionInfo;
        this.$isEmojiTriggered = z3;
        this.this$0 = defaultInputConnectionController;
        this.$isCorrectionUndone = z4;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processCorrection$2(this.$correctionInfo, this.$isEmojiTriggered, this.this$0, this.$isCorrectionUndone, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        InputConnection inputConnection;
        int i4;
        Object f4 = a.f();
        int i5 = this.label;
        if (i5 == 0) {
            f.b(obj);
            Log log = Log.f10572a;
            Log.d(log, "DefaultInputConnectionController", "processCorrection() :: " + this.$correctionInfo + " | " + this.$isEmojiTriggered + " | " + this.this$0.f9661D, (Throwable) null, 4, (Object) null);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return null;
            }
            String f5 = this.this$0.f9659B.f();
            int i6 = this.this$0.f9659B.i();
            int h4 = this.this$0.f9659B.h();
            Log.d(log, "DefaultInputConnectionController", "processCorrection() :: FROM: '" + I.a(f5, kotlin.coroutines.jvm.internal.a.d(h4)) + "' | " + i6 + " | " + h4, (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            CorrectionInfo correctionInfo = this.$correctionInfo;
            this.L$0 = E02;
            this.L$1 = f5;
            this.I$0 = i6;
            this.label = 1;
            if (K02.m(correctionInfo, this) == f4) {
                return f4;
            }
            inputConnection = E02;
            str = f5;
            i4 = i6;
        } else if (i5 == 1) {
            i4 = this.I$0;
            String str2 = (String) this.L$1;
            inputConnection = (InputConnection) this.L$0;
            try {
                f.b(obj);
                str = str2;
            } catch (DefaultInputConnectionController.ProcessCorrectionException e4) {
                Log.f10572a.e("DefaultInputConnectionController", "Not processing correction due to an exception", e4);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.f9685v = SystemClock.elapsedRealtime();
        if (this.$isCorrectionUndone) {
            this.this$0.f9681r = SystemClock.elapsedRealtime();
        }
        String f6 = this.this$0.f9659B.f();
        List g4 = this.this$0.f9659B.g();
        int h5 = this.this$0.f9659B.h();
        Log log2 = Log.f10572a;
        Log.d(log2, "DefaultInputConnectionController", "processCorrection() :: TO: '" + I.a(f6, kotlin.coroutines.jvm.internal.a.d(h5)) + "' | " + this.this$0.f9659B.i() + " | " + h5, (Throwable) null, 4, (Object) null);
        CharSequence oldText = this.$correctionInfo.getOldText();
        o.c(oldText, "null cannot be cast to non-null type kotlin.String");
        CharSequence newText = this.$correctionInfo.getNewText();
        o.c(newText, "null cannot be cast to non-null type kotlin.String");
        f.i(inputConnection, i4, (String) oldText, (String) newText, this.$correctionInfo.getOffset());
        this.this$0.f9679p = SystemClock.elapsedRealtime();
        this.this$0.m0(new l(str, f6, g4, this.this$0.f9659B.i(), this.$correctionInfo.getNewText().toString(), new OnContentChangeEventFlags(this.$isEmojiTriggered, false, OnContentChangeEventFlags.TriggerEventType.AUTOCORRECTION)));
        return new t(this.this$0.f9659B.f(), this.this$0.f9659B.g(), this.this$0.f9659B.i());
    }

    public final Object invoke(D d4, c<? super t> cVar) {
        return ((DefaultInputConnectionController$processCorrection$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
