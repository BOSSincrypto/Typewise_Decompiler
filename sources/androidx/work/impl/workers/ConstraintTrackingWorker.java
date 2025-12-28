package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.F;
import androidx.work.impl.utils.futures.a;
import androidx.work.l;
import androidx.work.m;
import i0.c;
import i0.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l0.v;
import l0.w;
import l2.q;
import o0.C0837a;
import o0.b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR8\u0010$\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\r0\r !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\r0\r\u0018\u00010 0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00018G@BX\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/l;", "Li0/c;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ll2/q;", "s", "()V", "LX1/a;", "Landroidx/work/l$a;", "o", "()LX1/a;", "l", "", "Ll0/v;", "workSpecs", "e", "(Ljava/util/List;)V", "c", "Landroidx/work/WorkerParameters;", "", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "areConstraintsUnmet", "Landroidx/work/impl/utils/futures/a;", "kotlin.jvm.PlatformType", "h", "Landroidx/work/impl/utils/futures/a;", "future", "<set-?>", "i", "Landroidx/work/l;", "getDelegate", "()Landroidx/work/l;", "delegate", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConstraintTrackingWorker extends l implements c {

    /* renamed from: e  reason: collision with root package name */
    private final WorkerParameters f7403e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f7404f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f7405g;

    /* renamed from: h  reason: collision with root package name */
    private final a f7406h = a.t();

    /* renamed from: i  reason: collision with root package name */
    private l f7407i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        o.e(context, "appContext");
        o.e(workerParameters, "workerParameters");
        this.f7403e = workerParameters;
    }

    private final void s() {
        if (!this.f7406h.isCancelled()) {
            String i4 = g().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            m e4 = m.e();
            o.d(e4, "get()");
            if (i4 == null || i4.length() == 0) {
                e4.c(o0.c.f15090a, "No worker to delegate to.");
                a aVar = this.f7406h;
                o.d(aVar, "future");
                boolean unused = o0.c.d(aVar);
                return;
            }
            l b4 = i().b(a(), i4, this.f7403e);
            this.f7407i = b4;
            if (b4 == null) {
                e4.a(o0.c.f15090a, "No worker to delegate to.");
                a aVar2 = this.f7406h;
                o.d(aVar2, "future");
                boolean unused2 = o0.c.d(aVar2);
                return;
            }
            F p4 = F.p(a());
            o.d(p4, "getInstance(applicationContext)");
            w J3 = p4.u().J();
            String uuid = f().toString();
            o.d(uuid, "id.toString()");
            v l4 = J3.l(uuid);
            if (l4 == null) {
                a aVar3 = this.f7406h;
                o.d(aVar3, "future");
                boolean unused3 = o0.c.d(aVar3);
                return;
            }
            k0.o t4 = p4.t();
            o.d(t4, "workManagerImpl.trackers");
            e eVar = new e(t4, (c) this);
            eVar.a(C0718m.e(l4));
            String uuid2 = f().toString();
            o.d(uuid2, "id.toString()");
            if (eVar.e(uuid2)) {
                String a4 = o0.c.f15090a;
                e4.a(a4, "Constraints met for delegate " + i4);
                try {
                    l lVar = this.f7407i;
                    o.b(lVar);
                    X1.a o4 = lVar.o();
                    o.d(o4, "delegate!!.startWork()");
                    o4.a(new b(this, o4), b());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                String a5 = o0.c.f15090a;
                e4.a(a5, "Constraints not met for delegate " + i4 + ". Requesting retry.");
                a aVar4 = this.f7406h;
                o.d(aVar4, "future");
                boolean unused4 = o0.c.e(aVar4);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void t(ConstraintTrackingWorker constraintTrackingWorker, X1.a aVar) {
        o.e(constraintTrackingWorker, "this$0");
        o.e(aVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f7404f) {
            try {
                if (constraintTrackingWorker.f7405g) {
                    a aVar2 = constraintTrackingWorker.f7406h;
                    o.d(aVar2, "future");
                    boolean unused = o0.c.e(aVar2);
                } else {
                    constraintTrackingWorker.f7406h.r(aVar);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void u(ConstraintTrackingWorker constraintTrackingWorker) {
        o.e(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.s();
    }

    public void c(List list) {
        o.e(list, "workSpecs");
        m e4 = m.e();
        String a4 = o0.c.f15090a;
        e4.a(a4, "Constraints changed for " + list);
        synchronized (this.f7404f) {
            this.f7405g = true;
            q qVar = q.f14567a;
        }
    }

    public void e(List list) {
        o.e(list, "workSpecs");
    }

    public void l() {
        super.l();
        l lVar = this.f7407i;
        if (lVar != null && !lVar.j()) {
            lVar.p();
        }
    }

    public X1.a o() {
        b().execute(new C0837a(this));
        a aVar = this.f7406h;
        o.d(aVar, "future");
        return aVar;
    }
}
