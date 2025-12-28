package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.util.a;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.t;
import androidx.work.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l0.i;
import l0.v;
import l0.w;
import l0.y;
import m0.C0812k;

public class l implements t {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7294e = m.i("SystemJobScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f7295a;

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f7296b;

    /* renamed from: c  reason: collision with root package name */
    private final F f7297c;

    /* renamed from: d  reason: collision with root package name */
    private final k f7298d;

    public l(Context context, F f4) {
        this(context, f4, (JobScheduler) context.getSystemService("jobscheduler"), new k(context));
    }

    public static void b(Context context) {
        List<JobInfo> g4;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g4 = g(context, jobScheduler)) != null && !g4.isEmpty()) {
            for (JobInfo id : g4) {
                c(jobScheduler, id.getId());
            }
        }
    }

    private static void c(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th) {
            m.e().d(f7294e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i4)}), th);
        }
    }

    private static List e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g4 = g(context, jobScheduler);
        if (g4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g4) {
            l0.m h4 = h(jobInfo);
            if (h4 != null && str.equals(h4.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.e().d(f7294e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static l0.m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l0.m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, F f4) {
        int i4;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g4 = g(context, jobScheduler);
        List<String> b4 = f4.u().G().b();
        boolean z3 = false;
        if (g4 != null) {
            i4 = g4.size();
        } else {
            i4 = 0;
        }
        HashSet hashSet = new HashSet(i4);
        if (g4 != null && !g4.isEmpty()) {
            for (JobInfo jobInfo : g4) {
                l0.m h4 = h(jobInfo);
                if (h4 != null) {
                    hashSet.add(h4.b());
                } else {
                    c(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = b4.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    m.e().a(f7294e, "Reconciling jobs");
                    z3 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z3) {
            WorkDatabase u3 = f4.u();
            u3.e();
            try {
                w J3 = u3.J();
                for (String e4 : b4) {
                    J3.e(e4, -1);
                }
                u3.B();
                u3.i();
            } catch (Throwable th) {
                u3.i();
                throw th;
            }
        }
        return z3;
    }

    public void a(String str) {
        List<Integer> e4 = e(this.f7295a, this.f7296b, str);
        if (e4 != null && !e4.isEmpty()) {
            for (Integer intValue : e4) {
                c(this.f7296b, intValue.intValue());
            }
            this.f7297c.u().G().e(str);
        }
    }

    public void d(v... vVarArr) {
        int i4;
        List e4;
        int i5;
        WorkDatabase u3 = this.f7297c.u();
        C0812k kVar = new C0812k(u3);
        int length = vVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            v vVar = vVarArr[i6];
            u3.e();
            try {
                v l4 = u3.J().l(vVar.f14470a);
                if (l4 == null) {
                    m.e().k(f7294e, "Skipping scheduling " + vVar.f14470a + " because it's no longer in the DB");
                    u3.B();
                } else if (l4.f14471b != WorkInfo.State.ENQUEUED) {
                    m.e().k(f7294e, "Skipping scheduling " + vVar.f14470a + " because it is no longer enqueued");
                    u3.B();
                } else {
                    l0.m a4 = y.a(vVar);
                    i c4 = u3.G().c(a4);
                    if (c4 != null) {
                        i4 = c4.f14445c;
                    } else {
                        i4 = kVar.e(this.f7297c.n().i(), this.f7297c.n().g());
                    }
                    if (c4 == null) {
                        this.f7297c.u().G().g(l0.l.a(a4, i4));
                    }
                    j(vVar, i4);
                    if (Build.VERSION.SDK_INT == 23 && (e4 = e(this.f7295a, this.f7296b, vVar.f14470a)) != null) {
                        int indexOf = e4.indexOf(Integer.valueOf(i4));
                        if (indexOf >= 0) {
                            e4.remove(indexOf);
                        }
                        if (!e4.isEmpty()) {
                            i5 = ((Integer) e4.get(0)).intValue();
                        } else {
                            i5 = kVar.e(this.f7297c.n().i(), this.f7297c.n().g());
                        }
                        j(vVar, i5);
                    }
                    u3.B();
                }
                i6++;
            } finally {
                u3.i();
            }
        }
    }

    public boolean f() {
        return true;
    }

    public void j(v vVar, int i4) {
        int i5;
        JobInfo a4 = this.f7298d.a(vVar, i4);
        m e4 = m.e();
        String str = f7294e;
        e4.a(str, "Scheduling work ID " + vVar.f14470a + "Job ID " + i4);
        try {
            if (this.f7296b.schedule(a4) == 0) {
                m.e().k(str, "Unable to schedule work ID " + vVar.f14470a);
                if (vVar.f14486q && vVar.f14487r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    vVar.f14486q = false;
                    m.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{vVar.f14470a}));
                    j(vVar, i4);
                }
            }
        } catch (IllegalStateException e5) {
            List g4 = g(this.f7295a, this.f7296b);
            if (g4 != null) {
                i5 = g4.size();
            } else {
                i5 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i5), Integer.valueOf(this.f7297c.u().J().s().size()), Integer.valueOf(this.f7297c.n().h())});
            m.e().c(f7294e, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e5);
            a l4 = this.f7297c.n().l();
            if (l4 != null) {
                l4.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th) {
            m.e().d(f7294e, "Unable to schedule " + vVar, th);
        }
    }

    public l(Context context, F f4, JobScheduler jobScheduler, k kVar) {
        this.f7295a = context;
        this.f7297c = f4;
        this.f7296b = jobScheduler;
        this.f7298d = kVar;
    }
}
