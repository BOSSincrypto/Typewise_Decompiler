package ch.icoaching.wrio.input;

import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$getExtractedText$2", f = "DefaultInputConnectionController.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroid/view/inputmethod/ExtractedText;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroid/view/inputmethod/ExtractedText;"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$getExtractedText$2 extends SuspendLambda implements p {
    final /* synthetic */ InputConnection $this_getExtractedText;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$getExtractedText$2(InputConnection inputConnection, c<? super DefaultInputConnectionController$getExtractedText$2> cVar) {
        super(2, cVar);
        this.$this_getExtractedText = inputConnection;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$getExtractedText$2(this.$this_getExtractedText, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            return this.$this_getExtractedText.getExtractedText(new ExtractedTextRequest(), 0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super ExtractedText> cVar) {
        return ((DefaultInputConnectionController$getExtractedText$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
