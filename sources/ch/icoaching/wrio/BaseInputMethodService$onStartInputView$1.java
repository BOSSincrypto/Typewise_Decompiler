package ch.icoaching.wrio;

import ch.icoaching.wrio.keyboard.KeyCase;
import ch.icoaching.wrio.keyboard.view.smartbar.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onStartInputView$1", f = "BaseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lch/icoaching/wrio/keyboard/KeyCase;", "newKeyCase", "Ll2/q;", "<anonymous>", "(Lch/icoaching/wrio/keyboard/KeyCase;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onStartInputView$1 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onStartInputView$1(BaseInputMethodService baseInputMethodService, c<? super BaseInputMethodService$onStartInputView$1> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        BaseInputMethodService$onStartInputView$1 baseInputMethodService$onStartInputView$1 = new BaseInputMethodService$onStartInputView$1(this.this$0, cVar);
        baseInputMethodService$onStartInputView$1.L$0 = obj;
        return baseInputMethodService$onStartInputView$1;
    }

    public final Object invoke(KeyCase keyCase, c<? super q> cVar) {
        return ((BaseInputMethodService$onStartInputView$1) create(keyCase, cVar)).invokeSuspend(q.f14567a);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            this.this$0.f8981Z.c((KeyCase) this.L$0);
            ArrayList arrayList = new ArrayList();
            List<e> s4 = this.this$0.f8980Y;
            BaseInputMethodService baseInputMethodService = this.this$0;
            for (e eVar : s4) {
                arrayList.add(e.d(eVar, baseInputMethodService.f8981Z.f(eVar.l()), (String) null, 0.0f, 0.0f, 0, (String) null, (String) null, (String) null, false, 510, (Object) null));
            }
            this.this$0.f8980Y.clear();
            this.this$0.f8980Y.addAll(arrayList);
            this.this$0.Q0();
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
