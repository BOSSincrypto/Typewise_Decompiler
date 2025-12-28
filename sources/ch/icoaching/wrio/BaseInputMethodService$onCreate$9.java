package ch.icoaching.wrio;

import android.view.LayoutInflater;
import android.view.WindowInsets;
import ch.icoaching.wrio.keyboard.B;
import ch.icoaching.wrio.logging.Log;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onCreate$9", f = "BaseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/WindowInsets;", "kotlin.jvm.PlatformType", "it", "Ll2/q;", "<anonymous>", "(Landroid/view/WindowInsets;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onCreate$9 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onCreate$9(BaseInputMethodService baseInputMethodService, c<? super BaseInputMethodService$onCreate$9> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new BaseInputMethodService$onCreate$9(this.this$0, cVar);
    }

    public final Object invoke(WindowInsets windowInsets, c<? super q> cVar) {
        return ((BaseInputMethodService$onCreate$9) create(windowInsets, cVar)).invokeSuspend(q.f14567a);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            int B3 = this.this$0.d0();
            Log log = Log.f10572a;
            Log.d(log, "BaseInputMethodService", "onCreate() :: windowInsetsFlow() Update systemBarBottomInset from " + this.this$0.f8997h0 + " to " + B3, (Throwable) null, 4, (Object) null);
            if (this.this$0.f8997h0 != B3) {
                this.this$0.f8997h0 = B3;
                this.this$0.Z();
                BaseInputMethodService baseInputMethodService = this.this$0;
                B n02 = baseInputMethodService.n0();
                LayoutInflater layoutInflater = this.this$0.getLayoutInflater();
                o.d(layoutInflater, "getLayoutInflater(...)");
                baseInputMethodService.setInputView(n02.C(layoutInflater, B3, this.this$0.h0().a()));
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
