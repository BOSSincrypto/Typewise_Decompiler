package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.l;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/CombineContinuationsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/l$a;", "q", "()Landroidx/work/l$a;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "workerParams");
    }

    public l.a q() {
        l.a d4 = l.a.d(g());
        o.d(d4, "success(inputData)");
        return d4;
    }
}
