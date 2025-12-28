package ch.icoaching.wrio;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.BaseInputMethodService$onFinishInputView$1", f = "BaseInputMethodService.kt", l = {815}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class BaseInputMethodService$onFinishInputView$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ BaseInputMethodService this$0;

    @d(c = "ch.icoaching.wrio.BaseInputMethodService$onFinishInputView$1$1", f = "BaseInputMethodService.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.BaseInputMethodService$onFinishInputView$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(baseInputMethodService, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            a.f();
            if (this.label == 0) {
                f.b(obj);
                baseInputMethodService.D0();
                baseInputMethodService.E0();
                baseInputMethodService.F0();
                baseInputMethodService.G0();
                return q.f14567a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseInputMethodService$onFinishInputView$1(BaseInputMethodService baseInputMethodService, c<? super BaseInputMethodService$onFinishInputView$1> cVar) {
        super(2, cVar);
        this.this$0 = baseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new BaseInputMethodService$onFinishInputView$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher m02 = this.this$0.m0();
            final BaseInputMethodService baseInputMethodService = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(m02, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((BaseInputMethodService$onFinishInputView$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
