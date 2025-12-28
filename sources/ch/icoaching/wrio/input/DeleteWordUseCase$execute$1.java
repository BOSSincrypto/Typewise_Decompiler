package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.input.DeleteWordUseCase$execute$1", f = "DeleteWordUseCase.kt", l = {32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class DeleteWordUseCase$execute$1 extends SuspendLambda implements p {
    final /* synthetic */ String $word;
    int label;
    final /* synthetic */ DeleteWordUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DeleteWordUseCase$execute$1(DeleteWordUseCase deleteWordUseCase, String str, c<? super DeleteWordUseCase$execute$1> cVar) {
        super(2, cVar);
        this.this$0 = deleteWordUseCase;
        this.$word = str;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DeleteWordUseCase$execute$1(this.this$0, this.$word, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            DeleteWordUseCase deleteWordUseCase = this.this$0;
            String str = this.$word;
            this.label = 1;
            if (deleteWordUseCase.c(str, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            try {
                f.b(obj);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((DeleteWordUseCase$execute$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
