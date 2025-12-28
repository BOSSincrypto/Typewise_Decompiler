package ch.icoaching.wrio.input;

import android.os.SystemClock;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.logging.Log;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processUpdateSelectionInputEvent$2", f = "DefaultInputConnectionController.kt", l = {968, 1007, 1017}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processUpdateSelectionInputEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.o $inputEvent;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processUpdateSelectionInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.o oVar, c<? super DefaultInputConnectionController$processUpdateSelectionInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$inputEvent = oVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processUpdateSelectionInputEvent$2(this.this$0, this.$inputEvent, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        int i4;
        Object obj2;
        InputConnection inputConnection;
        int i5;
        CharSequence charSequence;
        int i6;
        String str;
        int c4;
        int i7;
        Object f4 = a.f();
        int i8 = this.label;
        if (i8 == 0) {
            f.b(obj);
            if (this.this$0.f9676m != null) {
                return q.f14567a;
            }
            if (this.$inputEvent.b() < 0 || this.$inputEvent.a() < 0) {
                Log log = Log.f10572a;
                Log.d(log, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: invalid selection start/end reported " + this.$inputEvent.b() + ' ' + this.$inputEvent.a(), (Throwable) null, 4, (Object) null);
                return q.f14567a;
            }
            if (this.$inputEvent.d() <= this.$inputEvent.c()) {
                c4 = this.$inputEvent.d();
            } else {
                c4 = this.$inputEvent.c();
            }
            i5 = c4;
            if (this.$inputEvent.b() <= this.$inputEvent.a()) {
                i4 = this.$inputEvent.b();
            } else {
                i4 = this.$inputEvent.a();
            }
            if (this.$inputEvent.b() <= this.$inputEvent.a()) {
                i7 = this.$inputEvent.a();
            } else {
                i7 = this.$inputEvent.b();
            }
            if (i5 > i4 && this.$inputEvent.e()) {
                for (g0 a4 : this.this$0.f9658A) {
                    g0.a.a(a4, (CancellationException) null, 1, (Object) null);
                }
                this.this$0.f9658A.clear();
            }
            int i9 = this.this$0.f9659B.i();
            int h4 = this.this$0.f9659B.h();
            Log log2 = Log.f10572a;
            Log.d(log2, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: " + i4 + ", " + i7 + ", " + i9 + ", " + h4, (Throwable) null, 4, (Object) null);
            if (!(i9 == i4 && h4 == i7)) {
                Log.d(log2, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: Possible outside text update detected", (Throwable) null, 4, (Object) null);
                inputConnection = this.this$0.f9661D;
                if (inputConnection != null) {
                    DefaultInputConnectionController defaultInputConnectionController = this.this$0;
                    this.L$0 = inputConnection;
                    this.I$0 = i5;
                    this.I$1 = i4;
                    this.label = 1;
                    obj2 = defaultInputConnectionController.E(inputConnection, this);
                    if (obj2 == f4) {
                        return f4;
                    }
                } else {
                    Log.d(log2, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: Input connection null", (Throwable) null, 4, (Object) null);
                }
            }
            return q.f14567a;
        } else if (i8 == 1) {
            i4 = this.I$1;
            i5 = this.I$0;
            inputConnection = (InputConnection) this.L$0;
            f.b(obj);
            obj2 = obj;
        } else if (i8 == 2 || i8 == 3) {
            i4 = this.I$0;
            f.b(obj);
            DefaultInputConnectionController defaultInputConnectionController2 = this.this$0;
            defaultInputConnectionController2.x0(defaultInputConnectionController2.f9659B.f(), i4);
            return q.f14567a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ExtractedText extractedText = (ExtractedText) obj2;
        if (extractedText == null || (charSequence = extractedText.text) == null || charSequence.length() == 0) {
            Log.d(Log.f10572a, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: Extracted text is null", (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController defaultInputConnectionController22 = this.this$0;
            defaultInputConnectionController22.x0(defaultInputConnectionController22.f9659B.f(), i4);
            return q.f14567a;
        }
        int i10 = extractedText.selectionStart;
        int i11 = extractedText.selectionEnd;
        if (i10 > i11) {
            i6 = i10;
        } else {
            i6 = i11;
            i11 = i10;
        }
        CharSequence charSequence2 = extractedText.text;
        if (charSequence2 == null || (str = charSequence2.toString()) == null) {
            str = "";
        }
        String f5 = this.this$0.f9659B.f();
        if (str.length() != f5.length()) {
            String c5 = e3.c.c(f5, str);
            int length = str.length() - c5.length();
            int length2 = f5.length() - length;
            Log log3 = Log.f10572a;
            StringBuilder sb = new StringBuilder();
            sb.append("processOnUpdateSelectionEvent() :: Outside text update confirmed '");
            o.b(c5);
            sb.append(I.b(c5, (Integer) null, 1, (Object) null));
            sb.append("' | ");
            sb.append(length);
            sb.append(" | ");
            sb.append(length2);
            Log log4 = log3;
            Log.d(log4, "DefaultInputConnectionController", sb.toString(), (Throwable) null, 4, (Object) null);
            Log.d(log4, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: New selection start " + i11 + ", new selection end " + i6, (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            this.L$0 = null;
            this.I$0 = i11;
            this.label = 2;
            if (K02.r(length2, c5, i11, i6, this) == f4) {
                return f4;
            }
        } else if (this.this$0.f9681r > SystemClock.elapsedRealtime() - 50) {
            Log.d(Log.f10572a, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: Cursor moved after undoing autocorrection - moving cursor back", (Throwable) null, 4, (Object) null);
            this.this$0.f9681r = 0;
            inputConnection.setSelection(i5, i5);
            return q.f14567a;
        } else {
            Log.d(Log.f10572a, "DefaultInputConnectionController", "processOnUpdateSelectionEvent() :: False alarm", (Throwable) null, 4, (Object) null);
            DefaultInputConnectionController.InputFieldState K03 = this.this$0.f9659B;
            this.L$0 = null;
            this.I$0 = i11;
            this.label = 3;
            if (K03.u(i11, i6, this) == f4) {
                return f4;
            }
        }
        i4 = i11;
        DefaultInputConnectionController defaultInputConnectionController222 = this.this$0;
        defaultInputConnectionController222.x0(defaultInputConnectionController222.f9659B.f(), i4);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processUpdateSelectionInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
