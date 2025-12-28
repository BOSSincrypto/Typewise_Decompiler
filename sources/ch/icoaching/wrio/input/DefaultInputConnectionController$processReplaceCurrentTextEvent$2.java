package ch.icoaching.wrio.input;

import android.view.inputmethod.InputConnection;
import ch.icoaching.wrio.input.DefaultInputConnectionController;
import ch.icoaching.wrio.input.OnContentChangeEventFlags;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DefaultInputConnectionController$processReplaceCurrentTextEvent$2", f = "DefaultInputConnectionController.kt", l = {1117}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultInputConnectionController$processReplaceCurrentTextEvent$2 extends SuspendLambda implements p {
    final /* synthetic */ DefaultInputConnectionController.a.k $inputEvent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultInputConnectionController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultInputConnectionController$processReplaceCurrentTextEvent$2(DefaultInputConnectionController defaultInputConnectionController, DefaultInputConnectionController.a.k kVar, c<? super DefaultInputConnectionController$processReplaceCurrentTextEvent$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultInputConnectionController;
        this.$inputEvent = kVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DefaultInputConnectionController$processReplaceCurrentTextEvent$2(this.this$0, this.$inputEvent, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            InputConnection E02 = this.this$0.f9661D;
            if (E02 == null) {
                return q.f14567a;
            }
            String f5 = this.this$0.f9659B.f();
            String a4 = this.$inputEvent.a();
            int length = a4.length();
            int i5 = this.this$0.f9659B.i();
            E02.beginBatchEdit();
            E02.deleteSurroundingText(i5, f5.length() - i5);
            E02.setComposingText(a4, 1);
            E02.setSelection(length, length);
            E02.finishComposingText();
            E02.endBatchEdit();
            DefaultInputConnectionController.InputFieldState K02 = this.this$0.f9659B;
            this.L$0 = f5;
            this.L$1 = a4;
            this.label = 1;
            if (K02.t(a4, length, length, this) == f4) {
                return f4;
            }
            str2 = f5;
            str = a4;
        } else if (i4 == 1) {
            f.b(obj);
            str = (String) this.L$1;
            str2 = (String) this.L$0;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.m0(new l(str2, str, this.this$0.f9659B.g(), this.this$0.f9659B.i(), str, new OnContentChangeEventFlags(false, false, OnContentChangeEventFlags.TriggerEventType.TEXT_REPLACEMENT_DONE)));
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DefaultInputConnectionController$processReplaceCurrentTextEvent$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
