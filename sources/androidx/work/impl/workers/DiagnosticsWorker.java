package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import androidx.work.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l0.C0782A;
import l0.j;
import l0.w;
import o0.d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/l$a;", "q", "()Landroidx/work/l$a;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "parameters");
    }

    public l.a q() {
        F p4 = F.p(a());
        o.d(p4, "getInstance(applicationContext)");
        WorkDatabase u3 = p4.u();
        o.d(u3, "workManager.workDatabase");
        w J3 = u3.J();
        l0.o H3 = u3.H();
        C0782A K3 = u3.K();
        j G3 = u3.G();
        List h4 = J3.h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List b4 = J3.b();
        List u4 = J3.u(200);
        if (!h4.isEmpty()) {
            m.e().f(d.f15091a, "Recently completed work:\n\n");
            m.e().f(d.f15091a, d.d(H3, K3, G3, h4));
        }
        if (!b4.isEmpty()) {
            m.e().f(d.f15091a, "Running work:\n\n");
            m.e().f(d.f15091a, d.d(H3, K3, G3, b4));
        }
        if (!u4.isEmpty()) {
            m.e().f(d.f15091a, "Enqueued work:\n\n");
            m.e().f(d.f15091a, d.d(H3, K3, G3, u4));
        }
        l.a c4 = l.a.c();
        o.d(c4, "success()");
        return c4;
    }
}
