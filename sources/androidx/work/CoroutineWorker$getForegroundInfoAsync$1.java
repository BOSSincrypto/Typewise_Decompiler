package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {1, 7, 1})
final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements p {
    final /* synthetic */ JobListenableFuture $jobFuture;
    Object L$0;
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture jobListenableFuture, CoroutineWorker coroutineWorker, c<? super CoroutineWorker$getForegroundInfoAsync$1> cVar) {
        super(2, cVar);
        this.$jobFuture = jobListenableFuture;
        this.this$0 = coroutineWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.$jobFuture, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        JobListenableFuture jobListenableFuture;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            JobListenableFuture jobListenableFuture2 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = jobListenableFuture2;
            this.label = 1;
            Object u3 = coroutineWorker.u(this);
            if (u3 == f4) {
                return f4;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = u3;
        } else if (i4 == 1) {
            jobListenableFuture = (JobListenableFuture) this.L$0;
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jobListenableFuture.c(obj);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
