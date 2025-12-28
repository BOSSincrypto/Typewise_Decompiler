package ch.icoaching.wrio;

import ch.icoaching.wrio.ai_assistant.ui.a;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onSetupSmartBar$1", f = "BaseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lch/icoaching/wrio/ai_assistant/ui/a;", "lastUsedAiAssistantPrompt", "Ll2/q;", "<anonymous>", "(Lch/icoaching/wrio/ai_assistant/ui/a;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onSetupSmartBar$1 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onSetupSmartBar$1(BaseInputMethodService baseInputMethodService, c<? super BaseInputMethodService$onSetupSmartBar$1> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        BaseInputMethodService$onSetupSmartBar$1 baseInputMethodService$onSetupSmartBar$1 = new BaseInputMethodService$onSetupSmartBar$1(this.this$0, cVar);
        baseInputMethodService$onSetupSmartBar$1.L$0 = obj;
        return baseInputMethodService$onSetupSmartBar$1;
    }

    public final Object invoke(a aVar, c<? super q> cVar) {
        return ((BaseInputMethodService$onSetupSmartBar$1) create(aVar, cVar)).invokeSuspend(q.f14567a);
    }

    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        if (this.label == 0) {
            f.b(obj);
            a aVar = (a) this.L$0;
            if (aVar.e()) {
                this.this$0.w0().w(aVar);
            } else {
                this.this$0.w0().a();
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
