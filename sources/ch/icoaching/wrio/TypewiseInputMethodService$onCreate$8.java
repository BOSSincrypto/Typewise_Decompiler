package ch.icoaching.wrio;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onCreate$8", f = "TypewiseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "language", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseInputMethodService$onCreate$8 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TypewiseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseInputMethodService$onCreate$8(TypewiseInputMethodService typewiseInputMethodService, c<? super TypewiseInputMethodService$onCreate$8> cVar) {
        super(2, cVar);
        this.this$0 = typewiseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        TypewiseInputMethodService$onCreate$8 typewiseInputMethodService$onCreate$8 = new TypewiseInputMethodService$onCreate$8(this.this$0, cVar);
        typewiseInputMethodService$onCreate$8.L$0 = obj;
        return typewiseInputMethodService$onCreate$8;
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            this.this$0.s1((String) this.L$0);
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(String str, c<? super q> cVar) {
        return ((TypewiseInputMethodService$onCreate$8) create(str, cVar)).invokeSuspend(q.f14567a);
    }
}
