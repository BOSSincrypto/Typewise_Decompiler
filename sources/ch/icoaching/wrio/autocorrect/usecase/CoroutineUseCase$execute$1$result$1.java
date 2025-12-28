package ch.icoaching.wrio.autocorrect.usecase;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.autocorrect.usecase.CoroutineUseCase$execute$1$result$1", f = "CoroutineUseCase.kt", l = {18}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"RESULT", "Lkotlinx/coroutines/D;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class CoroutineUseCase$execute$1$result$1 extends SuspendLambda implements p {
    final /* synthetic */ Object $request;
    int label;
    final /* synthetic */ CoroutineUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineUseCase$execute$1$result$1(CoroutineUseCase coroutineUseCase, Object obj, c<? super CoroutineUseCase$execute$1$result$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineUseCase;
        this.$request = obj;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new CoroutineUseCase$execute$1$result$1(this.this$0, this.$request, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineUseCase coroutineUseCase = this.this$0;
            Object obj2 = this.$request;
            this.label = 1;
            obj = coroutineUseCase.a(obj2, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invoke(D d4, c<Object> cVar) {
        return ((CoroutineUseCase$execute$1$result$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
