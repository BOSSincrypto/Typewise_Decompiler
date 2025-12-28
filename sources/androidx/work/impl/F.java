package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.background.systemjob.l;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.m;
import androidx.work.p;
import h0.C0660b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k0.o;
import m0.C0803b;
import m0.r;
import m0.u;
import m0.v;
import m0.w;
import n0.c;
import n0.d;

public class F extends WorkManager {

    /* renamed from: k  reason: collision with root package name */
    private static final String f7163k = m.i("WorkManagerImpl");

    /* renamed from: l  reason: collision with root package name */
    private static F f7164l = null;

    /* renamed from: m  reason: collision with root package name */
    private static F f7165m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f7166n = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f7167a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.work.a f7168b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f7169c;

    /* renamed from: d  reason: collision with root package name */
    private c f7170d;

    /* renamed from: e  reason: collision with root package name */
    private List f7171e;

    /* renamed from: f  reason: collision with root package name */
    private r f7172f;

    /* renamed from: g  reason: collision with root package name */
    private r f7173g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7174h;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f7175i;

    /* renamed from: j  reason: collision with root package name */
    private final o f7176j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public F(Context context, androidx.work.a aVar, c cVar) {
        this(context, aVar, cVar, context.getResources().getBoolean(androidx.work.r.workmanager_test_configuration));
    }

    public static void i(Context context, androidx.work.a aVar) {
        synchronized (f7166n) {
            try {
                F f4 = f7164l;
                if (f4 != null) {
                    if (f7165m != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (f4 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f7165m == null) {
                        f7165m = new F(applicationContext, aVar, new d(aVar.m()));
                    }
                    f7164l = f7165m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static F o() {
        synchronized (f7166n) {
            try {
                F f4 = f7164l;
                if (f4 != null) {
                    return f4;
                }
                F f5 = f7165m;
                return f5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static F p(Context context) {
        F o4;
        synchronized (f7166n) {
            try {
                o4 = o();
                if (o4 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof a.c) {
                        i(applicationContext, ((a.c) applicationContext).a());
                        o4 = p(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4;
    }

    private void w(Context context, androidx.work.a aVar, c cVar, WorkDatabase workDatabase, List list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.f7167a = applicationContext;
        this.f7168b = aVar;
        this.f7170d = cVar;
        this.f7169c = workDatabase;
        this.f7171e = list;
        this.f7172f = rVar;
        this.f7173g = new r(workDatabase);
        this.f7174h = false;
        if (Build.VERSION.SDK_INT < 24 || !a.a(applicationContext)) {
            this.f7170d.c(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public void A(v vVar) {
        B(vVar, (WorkerParameters.a) null);
    }

    public void B(v vVar, WorkerParameters.a aVar) {
        this.f7170d.c(new u(this, vVar, aVar));
    }

    public void C(l0.m mVar) {
        this.f7170d.c(new w(this, new v(mVar), true));
    }

    public void D(v vVar) {
        this.f7170d.c(new w(this, vVar, false));
    }

    public androidx.work.o a(String str) {
        C0803b c4 = C0803b.c(str, this, true);
        this.f7170d.c(c4);
        return c4.d();
    }

    public androidx.work.o c(List list) {
        if (!list.isEmpty()) {
            return new x(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public androidx.work.o d(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, p pVar) {
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE) {
            return WorkerUpdater.c(this, str, pVar);
        }
        return l(str, existingPeriodicWorkPolicy, pVar).a();
    }

    public androidx.work.o f(String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        return new x(this, str, existingWorkPolicy, list).a();
    }

    public X1.a h(String str) {
        v a4 = v.a(this, str);
        this.f7170d.b().execute(a4);
        return a4.b();
    }

    public androidx.work.o j(UUID uuid) {
        C0803b b4 = C0803b.b(uuid, this);
        this.f7170d.c(b4);
        return b4.d();
    }

    public List k(Context context, androidx.work.a aVar, o oVar) {
        return Arrays.asList(new t[]{u.a(context, this), new C0660b(context, aVar, oVar, this)});
    }

    public x l(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, p pVar) {
        ExistingWorkPolicy existingWorkPolicy;
        if (existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
            existingWorkPolicy = ExistingWorkPolicy.KEEP;
        } else {
            existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        }
        return new x(this, str, existingWorkPolicy, Collections.singletonList(pVar));
    }

    public Context m() {
        return this.f7167a;
    }

    public androidx.work.a n() {
        return this.f7168b;
    }

    public r q() {
        return this.f7173g;
    }

    public r r() {
        return this.f7172f;
    }

    public List s() {
        return this.f7171e;
    }

    public o t() {
        return this.f7176j;
    }

    public WorkDatabase u() {
        return this.f7169c;
    }

    public c v() {
        return this.f7170d;
    }

    public void x() {
        synchronized (f7166n) {
            try {
                this.f7174h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f7175i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f7175i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y() {
        l.b(m());
        u().J().w();
        u.b(n(), u(), s());
    }

    public void z(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f7166n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f7175i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f7175i = pendingResult;
                if (this.f7174h) {
                    pendingResult.finish();
                    this.f7175i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public F(Context context, androidx.work.a aVar, c cVar, boolean z3) {
        this(context, aVar, cVar, WorkDatabase.D(context.getApplicationContext(), cVar.b(), z3));
    }

    public F(Context context, androidx.work.a aVar, c cVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        m.h(new m.a(aVar.j()));
        o oVar = new o(applicationContext, cVar);
        this.f7176j = oVar;
        Context context2 = context;
        androidx.work.a aVar2 = aVar;
        c cVar2 = cVar;
        WorkDatabase workDatabase2 = workDatabase;
        List k4 = k(applicationContext, aVar, oVar);
        w(context2, aVar2, cVar2, workDatabase2, k4, new r(context2, aVar2, cVar2, workDatabase2, k4));
    }
}
