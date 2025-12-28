package ch.icoaching.wrio;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onCreate$7", f = "BaseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isEnabled", "Ll2/q;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onCreate$7 extends SuspendLambda implements p {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onCreate$7(BaseInputMethodService baseInputMethodService, c<? super BaseInputMethodService$onCreate$7> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        BaseInputMethodService$onCreate$7 baseInputMethodService$onCreate$7 = new BaseInputMethodService$onCreate$7(this.this$0, cVar);
        baseInputMethodService$onCreate$7.Z$0 = ((Boolean) obj).booleanValue();
        return baseInputMethodService$onCreate$7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (c<? super q>) (c) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            boolean z3 = this.Z$0;
            BaseInputMethodService baseInputMethodService = this.this$0;
            baseInputMethodService.n(z3, baseInputMethodService.p0().o());
            this.this$0.C0();
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z3, c<? super q> cVar) {
        return ((BaseInputMethodService$onCreate$7) create(Boolean.valueOf(z3), cVar)).invokeSuspend(q.f14567a);
    }
}
