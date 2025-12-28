package ch.icoaching.wrio;

import ch.icoaching.wrio.keyboard.view.E;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onCreate$9", f = "TypewiseInputMethodService.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLanguageFlagVisible", "Ll2/q;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseInputMethodService$onCreate$9 extends SuspendLambda implements p {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TypewiseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseInputMethodService$onCreate$9(TypewiseInputMethodService typewiseInputMethodService, c<? super TypewiseInputMethodService$onCreate$9> cVar) {
        super(2, cVar);
        this.this$0 = typewiseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        TypewiseInputMethodService$onCreate$9 typewiseInputMethodService$onCreate$9 = new TypewiseInputMethodService$onCreate$9(this.this$0, cVar);
        typewiseInputMethodService$onCreate$9.Z$0 = ((Boolean) obj).booleanValue();
        return typewiseInputMethodService$onCreate$9;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (c<? super q>) (c) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            boolean z3 = this.Z$0;
            if (this.this$0.f9060n0 != null) {
                E c12 = this.this$0.f9060n0;
                if (c12 == null) {
                    o.p("smartBarLogoView");
                    c12 = null;
                }
                c12.setLanguageFlagVisible(z3);
            }
            if (z3) {
                TypewiseInputMethodService typewiseInputMethodService = this.this$0;
                typewiseInputMethodService.s1(typewiseInputMethodService.r0().b());
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(boolean z3, c<? super q> cVar) {
        return ((TypewiseInputMethodService$onCreate$9) create(Boolean.valueOf(z3), cVar)).invokeSuspend(q.f14567a);
    }
}
