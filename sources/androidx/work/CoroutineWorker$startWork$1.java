package androidx.work;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {1, 7, 1})
final class CoroutineWorker$startWork$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineWorker$startWork$1(CoroutineWorker coroutineWorker, c<? super CoroutineWorker$startWork$1> cVar) {
        super(2, cVar);
        this.this$0 = coroutineWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new CoroutineWorker$startWork$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineWorker coroutineWorker = this.this$0;
            this.label = 1;
            obj = coroutineWorker.s(this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            try {
                f.b(obj);
            } catch (Throwable th) {
                this.this$0.w().q(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.w().p((l.a) obj);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((CoroutineWorker$startWork$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
