package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0748l;
import kotlinx.coroutines.C0755t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.E;
import kotlinx.coroutines.P;
import kotlinx.coroutines.g0;
import l2.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0014\u0010\u000bJ\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\u00020#8\u0016X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0016\u001a\u0004\b&\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/l;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LX1/a;", "Landroidx/work/l$a;", "o", "()LX1/a;", "s", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/work/g;", "u", "foregroundInfo", "Ll2/q;", "x", "(Landroidx/work/g;Lkotlin/coroutines/c;)Ljava/lang/Object;", "d", "l", "()V", "Lkotlinx/coroutines/t;", "e", "Lkotlinx/coroutines/t;", "getJob$work_runtime_ktx_release", "()Lkotlinx/coroutines/t;", "job", "Landroidx/work/impl/utils/futures/a;", "f", "Landroidx/work/impl/utils/futures/a;", "w", "()Landroidx/work/impl/utils/futures/a;", "future", "Lkotlinx/coroutines/CoroutineDispatcher;", "g", "Lkotlinx/coroutines/CoroutineDispatcher;", "t", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "coroutineContext", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CoroutineWorker extends l {

    /* renamed from: e  reason: collision with root package name */
    private final C0755t f7062e = k0.b((g0) null, 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final a f7063f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineDispatcher f7064g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o.e(context, "appContext");
        o.e(workerParameters, "params");
        a t4 = a.t();
        o.d(t4, "create()");
        this.f7063f = t4;
        t4.a(new d(this), h().b());
        this.f7064g = P.a();
    }

    /* access modifiers changed from: private */
    public static final void r(CoroutineWorker coroutineWorker) {
        o.e(coroutineWorker, "this$0");
        if (coroutineWorker.f7063f.isCancelled()) {
            g0.a.a(coroutineWorker.f7062e, (CancellationException) null, 1, (Object) null);
        }
    }

    static /* synthetic */ Object v(CoroutineWorker coroutineWorker, c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public final X1.a d() {
        C0755t b4 = k0.b((g0) null, 1, (Object) null);
        D a4 = E.a(t().plus(b4));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(b4, (a) null, 2, (i) null);
        g0 unused = C0739h.d(a4, (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$getForegroundInfoAsync$1(jobListenableFuture, this, (c<? super CoroutineWorker$getForegroundInfoAsync$1>) null), 3, (Object) null);
        return jobListenableFuture;
    }

    public final void l() {
        super.l();
        this.f7063f.cancel(false);
    }

    public final X1.a o() {
        g0 unused = C0739h.d(E.a(t().plus(this.f7062e)), (CoroutineContext) null, (CoroutineStart) null, new CoroutineWorker$startWork$1(this, (c<? super CoroutineWorker$startWork$1>) null), 3, (Object) null);
        return this.f7063f;
    }

    public abstract Object s(c cVar);

    public CoroutineDispatcher t() {
        return this.f7064g;
    }

    public Object u(c cVar) {
        return v(this, cVar);
    }

    public final a w() {
        return this.f7063f;
    }

    public final Object x(g gVar, c cVar) {
        X1.a m4 = m(gVar);
        o.d(m4, "setForegroundAsync(foregroundInfo)");
        if (m4.isDone()) {
            try {
                m4.get();
            } catch (ExecutionException e4) {
                e = e4;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                throw e;
            }
        } else {
            C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
            lVar.z();
            m4.a(new k(lVar, m4), DirectExecutor.INSTANCE);
            lVar.j(new ListenableFutureKt$await$2$2(m4));
            Object v3 = lVar.v();
            if (v3 == kotlin.coroutines.intrinsics.a.f()) {
                f.c(cVar);
            }
            if (v3 == kotlin.coroutines.intrinsics.a.f()) {
                return v3;
            }
        }
        return q.f14567a;
    }
}
