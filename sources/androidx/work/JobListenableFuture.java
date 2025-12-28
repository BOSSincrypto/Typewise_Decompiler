package androidx.work;

import X1.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.g0;
import l2.q;
import u2.l;

public final class JobListenableFuture implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f7068a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a f7069b;

    public JobListenableFuture(g0 g0Var, androidx.work.impl.utils.futures.a aVar) {
        o.e(g0Var, "job");
        o.e(aVar, "underlying");
        this.f7068a = g0Var;
        this.f7069b = aVar;
        g0Var.G(new l(this) {
            final /* synthetic */ JobListenableFuture this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return q.f14567a;
            }

            public final void invoke(Throwable th) {
                if (th == null) {
                    if (!this.this$0.f7069b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    this.this$0.f7069b.cancel(true);
                } else {
                    androidx.work.impl.utils.futures.a b4 = this.this$0.f7069b;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    b4.q(th);
                }
            }
        });
    }

    public void a(Runnable runnable, Executor executor) {
        this.f7069b.a(runnable, executor);
    }

    public final void c(Object obj) {
        this.f7069b.p(obj);
    }

    public boolean cancel(boolean z3) {
        return this.f7069b.cancel(z3);
    }

    public Object get() {
        return this.f7069b.get();
    }

    public boolean isCancelled() {
        return this.f7069b.isCancelled();
    }

    public boolean isDone() {
        return this.f7069b.isDone();
    }

    public Object get(long j4, TimeUnit timeUnit) {
        return this.f7069b.get(j4, timeUnit);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JobListenableFuture(kotlinx.coroutines.g0 r1, androidx.work.impl.utils.futures.a r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000d
            androidx.work.impl.utils.futures.a r2 = androidx.work.impl.utils.futures.a.t()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.o.d(r2, r3)
        L_0x000d:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.JobListenableFuture.<init>(kotlinx.coroutines.g0, androidx.work.impl.utils.futures.a, int, kotlin.jvm.internal.i):void");
    }
}
