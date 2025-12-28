package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.PersistableBundle;
import androidx.work.impl.C0471e;
import androidx.work.impl.F;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.m;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C0471e {

    /* renamed from: d  reason: collision with root package name */
    private static final String f7287d = m.i("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    private F f7288a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7289b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final w f7290c = new w();

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static l0.m a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l0.m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void b(l0.m mVar, boolean z3) {
        JobParameters jobParameters;
        m e4 = m.e();
        String str = f7287d;
        e4.a(str, mVar.b() + " executed on JobScheduler");
        synchronized (this.f7289b) {
            jobParameters = (JobParameters) this.f7289b.remove(mVar);
        }
        this.f7290c.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            F p4 = F.p(getApplicationContext());
            this.f7288a = p4;
            p4.r().g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                m.e().k(f7287d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        F f4 = this.f7288a;
        if (f4 != null) {
            f4.r().n(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r2 < 24) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r3 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.b(r8) == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r3.f7098b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.a(r8) == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        r3.f7097a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r2 < 28) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        r3.f7099c = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r7.f7288a.B(r7.f7290c.d(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            androidx.work.impl.F r0 = r7.f7288a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            androidx.work.m r0 = androidx.work.m.e()
            java.lang.String r3 = f7287d
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            l0.m r0 = a(r8)
            if (r0 != 0) goto L_0x0027
            androidx.work.m r8 = androidx.work.m.e()
            java.lang.String r0 = f7287d
            java.lang.String r1 = "WorkSpec id not found!"
            r8.c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map r3 = r7.f7289b
            monitor-enter(r3)
            java.util.Map r4 = r7.f7289b     // Catch:{ all -> 0x004e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            androidx.work.m r8 = androidx.work.m.e()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = f7287d     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x004e }
            r4.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x004e }
            r8.a(r1, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return r2
        L_0x004e:
            r8 = move-exception
            goto L_0x00b3
        L_0x0050:
            androidx.work.m r2 = androidx.work.m.e()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = f7287d     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x004e }
            r5.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004e }
            r2.a(r4, r5)     // Catch:{ all -> 0x004e }
            java.util.Map r2 = r7.f7289b     // Catch:{ all -> 0x004e }
            r2.put(r0, r8)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x00a6
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            if (r4 == 0) goto L_0x008b
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f7098b = r4
        L_0x008b:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            if (r4 == 0) goto L_0x009b
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f7097a = r4
        L_0x009b:
            r4 = 28
            if (r2 < r4) goto L_0x00a7
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8)
            r3.f7099c = r8
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            androidx.work.impl.F r8 = r7.f7288a
            androidx.work.impl.w r2 = r7.f7290c
            androidx.work.impl.v r0 = r2.d(r0)
            r8.B(r0, r3)
            return r1
        L_0x00b3:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f7288a == null) {
            m.e().a(f7287d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        l0.m a4 = a(jobParameters);
        if (a4 == null) {
            m.e().c(f7287d, "WorkSpec id not found!");
            return false;
        }
        m e4 = m.e();
        String str = f7287d;
        e4.a(str, "onStopJob for " + a4);
        synchronized (this.f7289b) {
            this.f7289b.remove(a4);
        }
        v b4 = this.f7290c.b(a4);
        if (b4 != null) {
            this.f7288a.D(b4);
        }
        return !this.f7288a.r().j(a4.b());
    }
}
