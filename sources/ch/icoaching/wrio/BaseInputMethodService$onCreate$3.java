package ch.icoaching.wrio;

import M0.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.n;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onCreate$3", f = "BaseInputMethodService.kt", l = {488}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onCreate$3 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    static final class a implements kotlinx.coroutines.flow.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInputMethodService f9030a;

        a(BaseInputMethodService baseInputMethodService) {
            this.f9030a = baseInputMethodService;
        }

        /* renamed from: a */
        public final Object emit(c cVar, kotlin.coroutines.c cVar2) {
            this.f9030a.h(cVar);
            return q.f14567a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onCreate$3(BaseInputMethodService baseInputMethodService, kotlin.coroutines.c<? super BaseInputMethodService$onCreate$3> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final kotlin.coroutines.c<q> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseInputMethodService$onCreate$3(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = kotlin.coroutines.intrinsics.a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            n E3 = this.this$0.n0().E();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (E3.a(aVar, this) == f4) {
                return f4;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final Object invoke(D d4, kotlin.coroutines.c<? super q> cVar) {
        return ((BaseInputMethodService$onCreate$3) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
