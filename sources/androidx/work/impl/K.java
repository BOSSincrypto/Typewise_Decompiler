package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import l0.C0785b;
import l0.v;
import l0.w;
import l0.y;
import m0.C0798B;
import m0.C0799C;
import m0.C0800D;
import m0.C0818q;
import m0.x;

public class K implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    static final String f7192w = m.i("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f7193a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7194b;

    /* renamed from: c  reason: collision with root package name */
    private List f7195c;

    /* renamed from: d  reason: collision with root package name */
    private WorkerParameters.a f7196d;

    /* renamed from: e  reason: collision with root package name */
    v f7197e;

    /* renamed from: f  reason: collision with root package name */
    l f7198f;

    /* renamed from: g  reason: collision with root package name */
    n0.c f7199g;

    /* renamed from: h  reason: collision with root package name */
    l.a f7200h = l.a.a();

    /* renamed from: i  reason: collision with root package name */
    private androidx.work.a f7201i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.work.impl.foreground.a f7202j;

    /* renamed from: k  reason: collision with root package name */
    private WorkDatabase f7203k;

    /* renamed from: l  reason: collision with root package name */
    private w f7204l;

    /* renamed from: m  reason: collision with root package name */
    private C0785b f7205m;

    /* renamed from: n  reason: collision with root package name */
    private List f7206n;

    /* renamed from: o  reason: collision with root package name */
    private String f7207o;

    /* renamed from: p  reason: collision with root package name */
    androidx.work.impl.utils.futures.a f7208p = androidx.work.impl.utils.futures.a.t();

    /* renamed from: q  reason: collision with root package name */
    final androidx.work.impl.utils.futures.a f7209q = androidx.work.impl.utils.futures.a.t();

    /* renamed from: v  reason: collision with root package name */
    private volatile boolean f7210v;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ X1.a f7211a;

        a(X1.a aVar) {
            this.f7211a = aVar;
        }

        public void run() {
            if (!K.this.f7209q.isCancelled()) {
                try {
                    this.f7211a.get();
                    m e4 = m.e();
                    String str = K.f7192w;
                    e4.a(str, "Starting work for " + K.this.f7197e.f14472c);
                    K k4 = K.this;
                    k4.f7209q.r(k4.f7198f.o());
                } catch (Throwable th) {
                    K.this.f7209q.q(th);
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7213a;

        b(String str) {
            this.f7213a = str;
        }

        public void run() {
            try {
                l.a aVar = (l.a) K.this.f7209q.get();
                if (aVar == null) {
                    m e4 = m.e();
                    String str = K.f7192w;
                    e4.c(str, K.this.f7197e.f14472c + " returned a null result. Treating it as a failure.");
                } else {
                    m e5 = m.e();
                    String str2 = K.f7192w;
                    e5.a(str2, K.this.f7197e.f14472c + " returned a " + aVar + ".");
                    K.this.f7200h = aVar;
                }
            } catch (CancellationException e6) {
                m e7 = m.e();
                String str3 = K.f7192w;
                e7.g(str3, this.f7213a + " was cancelled", e6);
            } catch (InterruptedException e8) {
                e = e8;
                m e9 = m.e();
                String str4 = K.f7192w;
                e9.d(str4, this.f7213a + " failed because it threw an exception/error", e);
            } catch (ExecutionException e10) {
                e = e10;
                m e92 = m.e();
                String str42 = K.f7192w;
                e92.d(str42, this.f7213a + " failed because it threw an exception/error", e);
            } catch (Throwable th) {
                K.this.j();
                throw th;
            }
            K.this.j();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f7215a;

        /* renamed from: b  reason: collision with root package name */
        l f7216b;

        /* renamed from: c  reason: collision with root package name */
        androidx.work.impl.foreground.a f7217c;

        /* renamed from: d  reason: collision with root package name */
        n0.c f7218d;

        /* renamed from: e  reason: collision with root package name */
        androidx.work.a f7219e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f7220f;

        /* renamed from: g  reason: collision with root package name */
        v f7221g;

        /* renamed from: h  reason: collision with root package name */
        List f7222h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final List f7223i;

        /* renamed from: j  reason: collision with root package name */
        WorkerParameters.a f7224j = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, n0.c cVar, androidx.work.impl.foreground.a aVar2, WorkDatabase workDatabase, v vVar, List list) {
            this.f7215a = context.getApplicationContext();
            this.f7218d = cVar;
            this.f7217c = aVar2;
            this.f7219e = aVar;
            this.f7220f = workDatabase;
            this.f7221g = vVar;
            this.f7223i = list;
        }

        public K b() {
            return new K(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f7224j = aVar;
            }
            return this;
        }

        public c d(List list) {
            this.f7222h = list;
            return this;
        }
    }

    K(c cVar) {
        this.f7193a = cVar.f7215a;
        this.f7199g = cVar.f7218d;
        this.f7202j = cVar.f7217c;
        v vVar = cVar.f7221g;
        this.f7197e = vVar;
        this.f7194b = vVar.f14470a;
        this.f7195c = cVar.f7222h;
        this.f7196d = cVar.f7224j;
        this.f7198f = cVar.f7216b;
        this.f7201i = cVar.f7219e;
        WorkDatabase workDatabase = cVar.f7220f;
        this.f7203k = workDatabase;
        this.f7204l = workDatabase.J();
        this.f7205m = this.f7203k.E();
        this.f7206n = cVar.f7223i;
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f7194b);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z3) {
                z3 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void f(l.a aVar) {
        if (aVar instanceof l.a.c) {
            m e4 = m.e();
            String str = f7192w;
            e4.f(str, "Worker result SUCCESS for " + this.f7207o);
            if (this.f7197e.j()) {
                l();
            } else {
                q();
            }
        } else if (aVar instanceof l.a.b) {
            m e5 = m.e();
            String str2 = f7192w;
            e5.f(str2, "Worker result RETRY for " + this.f7207o);
            k();
        } else {
            m e6 = m.e();
            String str3 = f7192w;
            e6.f(str3, "Worker result FAILURE for " + this.f7207o);
            if (this.f7197e.j()) {
                l();
            } else {
                p();
            }
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f7204l.i(str2) != WorkInfo.State.CANCELLED) {
                this.f7204l.o(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f7205m.d(str2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(X1.a aVar) {
        if (this.f7209q.isCancelled()) {
            aVar.cancel(true);
        }
    }

    private void k() {
        this.f7203k.e();
        try {
            this.f7204l.o(WorkInfo.State.ENQUEUED, this.f7194b);
            this.f7204l.n(this.f7194b, System.currentTimeMillis());
            this.f7204l.e(this.f7194b, -1);
            this.f7203k.B();
        } finally {
            this.f7203k.i();
            m(true);
        }
    }

    private void l() {
        this.f7203k.e();
        try {
            this.f7204l.n(this.f7194b, System.currentTimeMillis());
            this.f7204l.o(WorkInfo.State.ENQUEUED, this.f7194b);
            this.f7204l.m(this.f7194b);
            this.f7204l.c(this.f7194b);
            this.f7204l.e(this.f7194b, -1);
            this.f7203k.B();
        } finally {
            this.f7203k.i();
            m(false);
        }
    }

    private void m(boolean z3) {
        this.f7203k.e();
        try {
            if (!this.f7203k.J().d()) {
                C0818q.a(this.f7193a, RescheduleReceiver.class, false);
            }
            if (z3) {
                this.f7204l.o(WorkInfo.State.ENQUEUED, this.f7194b);
                this.f7204l.e(this.f7194b, -1);
            }
            if (!(this.f7197e == null || this.f7198f == null || !this.f7202j.c(this.f7194b))) {
                this.f7202j.a(this.f7194b);
            }
            this.f7203k.B();
            this.f7203k.i();
            this.f7208p.p(Boolean.valueOf(z3));
        } catch (Throwable th) {
            this.f7203k.i();
            throw th;
        }
    }

    private void n() {
        WorkInfo.State i4 = this.f7204l.i(this.f7194b);
        if (i4 == WorkInfo.State.RUNNING) {
            m e4 = m.e();
            String str = f7192w;
            e4.a(str, "Status for " + this.f7194b + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        m e5 = m.e();
        String str2 = f7192w;
        e5.a(str2, "Status for " + this.f7194b + " is " + i4 + " ; not doing any work");
        m(false);
    }

    private void o() {
        e b4;
        if (!r()) {
            this.f7203k.e();
            try {
                v vVar = this.f7197e;
                if (vVar.f14471b != WorkInfo.State.ENQUEUED) {
                    n();
                    this.f7203k.B();
                    m e4 = m.e();
                    String str = f7192w;
                    e4.a(str, this.f7197e.f14472c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((vVar.j() || this.f7197e.i()) && System.currentTimeMillis() < this.f7197e.c()) {
                    m.e().a(f7192w, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f7197e.f14472c}));
                    m(true);
                    this.f7203k.B();
                    this.f7203k.i();
                } else {
                    this.f7203k.B();
                    this.f7203k.i();
                    if (this.f7197e.j()) {
                        b4 = this.f7197e.f14474e;
                    } else {
                        i b5 = this.f7201i.f().b(this.f7197e.f14473d);
                        if (b5 == null) {
                            m e5 = m.e();
                            String str2 = f7192w;
                            e5.c(str2, "Could not create Input Merger " + this.f7197e.f14473d);
                            p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f7197e.f14474e);
                        arrayList.addAll(this.f7204l.p(this.f7194b));
                        b4 = b5.b(arrayList);
                    }
                    e eVar = b4;
                    UUID fromString = UUID.fromString(this.f7194b);
                    List list = this.f7206n;
                    WorkerParameters.a aVar = this.f7196d;
                    v vVar2 = this.f7197e;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, eVar, list, aVar, vVar2.f14480k, vVar2.f(), this.f7201i.d(), this.f7199g, this.f7201i.n(), new C0800D(this.f7203k, this.f7199g), new C0799C(this.f7203k, this.f7202j, this.f7199g));
                    if (this.f7198f == null) {
                        this.f7198f = this.f7201i.n().b(this.f7193a, this.f7197e.f14472c, workerParameters);
                    }
                    l lVar = this.f7198f;
                    if (lVar == null) {
                        m e6 = m.e();
                        String str3 = f7192w;
                        e6.c(str3, "Could not create Worker " + this.f7197e.f14472c);
                        p();
                    } else if (lVar.k()) {
                        m e7 = m.e();
                        String str4 = f7192w;
                        e7.c(str4, "Received an already-used Worker " + this.f7197e.f14472c + "; Worker Factory should return new instances");
                        p();
                    } else {
                        this.f7198f.n();
                        if (!s()) {
                            n();
                        } else if (!r()) {
                            C0798B b6 = new C0798B(this.f7193a, this.f7197e, this.f7198f, workerParameters.b(), this.f7199g);
                            this.f7199g.a().execute(b6);
                            X1.a b7 = b6.b();
                            this.f7209q.a(new J(this, b7), new x());
                            b7.a(new a(b7), this.f7199g.a());
                            this.f7209q.a(new b(this.f7207o), this.f7199g.b());
                        }
                    }
                }
            } finally {
                this.f7203k.i();
            }
        }
    }

    private void q() {
        this.f7203k.e();
        try {
            this.f7204l.o(WorkInfo.State.SUCCEEDED, this.f7194b);
            this.f7204l.v(this.f7194b, ((l.a.c) this.f7200h).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f7205m.d(this.f7194b)) {
                if (this.f7204l.i(str) == WorkInfo.State.BLOCKED && this.f7205m.a(str)) {
                    m e4 = m.e();
                    String str2 = f7192w;
                    e4.f(str2, "Setting status to enqueued for " + str);
                    this.f7204l.o(WorkInfo.State.ENQUEUED, str);
                    this.f7204l.n(str, currentTimeMillis);
                }
            }
            this.f7203k.B();
            this.f7203k.i();
            m(false);
        } catch (Throwable th) {
            this.f7203k.i();
            m(false);
            throw th;
        }
    }

    private boolean r() {
        if (!this.f7210v) {
            return false;
        }
        m e4 = m.e();
        String str = f7192w;
        e4.a(str, "Work interrupted for " + this.f7207o);
        WorkInfo.State i4 = this.f7204l.i(this.f7194b);
        if (i4 == null) {
            m(false);
        } else {
            m(!i4.isFinished());
        }
        return true;
    }

    private boolean s() {
        boolean z3;
        this.f7203k.e();
        try {
            if (this.f7204l.i(this.f7194b) == WorkInfo.State.ENQUEUED) {
                this.f7204l.o(WorkInfo.State.RUNNING, this.f7194b);
                this.f7204l.q(this.f7194b);
                z3 = true;
            } else {
                z3 = false;
            }
            this.f7203k.B();
            this.f7203k.i();
            return z3;
        } catch (Throwable th) {
            this.f7203k.i();
            throw th;
        }
    }

    public X1.a c() {
        return this.f7208p;
    }

    public l0.m d() {
        return y.a(this.f7197e);
    }

    public v e() {
        return this.f7197e;
    }

    public void g() {
        this.f7210v = true;
        r();
        this.f7209q.cancel(true);
        if (this.f7198f == null || !this.f7209q.isCancelled()) {
            m.e().a(f7192w, "WorkSpec " + this.f7197e + " is already done. Not interrupting.");
            return;
        }
        this.f7198f.p();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!r()) {
            this.f7203k.e();
            try {
                WorkInfo.State i4 = this.f7204l.i(this.f7194b);
                this.f7203k.I().a(this.f7194b);
                if (i4 == null) {
                    m(false);
                } else if (i4 == WorkInfo.State.RUNNING) {
                    f(this.f7200h);
                } else if (!i4.isFinished()) {
                    k();
                }
                this.f7203k.B();
                this.f7203k.i();
            } catch (Throwable th) {
                this.f7203k.i();
                throw th;
            }
        }
        List<t> list = this.f7195c;
        if (list != null) {
            for (t a4 : list) {
                a4.a(this.f7194b);
            }
            u.b(this.f7201i, this.f7203k, this.f7195c);
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f7203k.e();
        try {
            h(this.f7194b);
            this.f7204l.v(this.f7194b, ((l.a.C0117a) this.f7200h).e());
            this.f7203k.B();
        } finally {
            this.f7203k.i();
            m(false);
        }
    }

    public void run() {
        this.f7207o = b(this.f7206n);
        o();
    }
}
