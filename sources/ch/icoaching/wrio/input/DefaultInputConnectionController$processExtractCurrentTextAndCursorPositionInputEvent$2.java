package ch.icoaching.wrio.input;

import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
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

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2", f = "DefaultInputConnectionController.kt", l = {1080, 1098}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2 extends SuspendLambda implements p {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2(DefaultInputConnectionController defaultInputConnectionController, c<? super DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        int i4;
        CharSequence charSequence2;
        Integer[] numArr;
        Object f4 = a.f();
        int i5 = this.label;
        if (i5 == 0) {
            f.b(obj);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            DefaultInputConnectionController defaultInputConnectionController = this.this$0;
            this.label = 1;
            obj = defaultInputConnectionController.E(E02, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i5 == 1) {
            f.b(obj);
        } else if (i5 == 2) {
            i4 = this.I$0;
            charSequence = (CharSequence) this.L$0;
            f.b(obj);
            this.this$0.n0(charSequence.toString(), i4);
            return q.f14567a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ExtractedText extractedText = (ExtractedText) obj;
        if (extractedText != null) {
            charSequence2 = extractedText.text;
        } else {
            charSequence2 = null;
        }
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = extractedText.text;
        }
        if (extractedText == null) {
            numArr = new Integer[]{kotlin.coroutines.jvm.internal.a.d(0), kotlin.coroutines.jvm.internal.a.d(0)};
        } else {
            numArr = new Integer[]{kotlin.coroutines.jvm.internal.a.d(extractedText.selectionStart), kotlin.coroutines.jvm.internal.a.d(extractedText.selectionEnd)};
        }
        int intValue = numArr[0].intValue();
        int intValue2 = numArr[1].intValue();
        o.b(charSequence);
        if (!f.j(charSequence, intValue, intValue2)) {
            return q.f14567a;
        }
        DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
        this.L$0 = charSequence;
        this.I$0 = intValue;
        this.label = 2;
        if (K02.t(charSequence, intValue, intValue2, this) == f4) {
            return f4;
        }
        i4 = intValue;
        this.this$0.n0(charSequence.toString(), i4);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processExtractCurrentTextAndCursorPositionInputEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
