package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.m;
import l0.v;

class k {

    /* renamed from: b  reason: collision with root package name */
    private static final String f7291b = m.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f7292a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7293a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7293a = r0
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7293a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7293a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7293a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7293a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.k.a.<clinit>():void");
        }
    }

    k(Context context) {
        this.f7292a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(b.c cVar) {
        boolean b4 = cVar.b();
        i.a();
        return h.a(cVar.a(), b4 ? 1 : 0);
    }

    static int c(NetworkType networkType) {
        int i4 = a.f7293a[networkType.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 != 4) {
            if (i4 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        m e4 = m.e();
        String str = f7291b;
        e4.a(str, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    static void d(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(v vVar, int i4) {
        boolean z3;
        int i5;
        b bVar = vVar.f14479j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", vVar.f14470a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i4, this.f7292a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.d());
        boolean z4 = false;
        if (!bVar.h()) {
            if (vVar.f14481l == BackoffPolicy.LINEAR) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            extras.setBackoffCriteria(vVar.f14482m, i5);
        }
        long max = Math.max(vVar.c() - System.currentTimeMillis(), 0);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!vVar.f14486q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (i6 >= 24 && bVar.e()) {
            for (b.c b4 : bVar.c()) {
                JobInfo.Builder unused2 = extras.addTriggerContentUri(b(b4));
            }
            JobInfo.Builder unused3 = extras.setTriggerContentUpdateDelay(bVar.b());
            JobInfo.Builder unused4 = extras.setTriggerContentMaxDelay(bVar.a());
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            JobInfo.Builder unused5 = extras.setRequiresBatteryNotLow(bVar.f());
            JobInfo.Builder unused6 = extras.setRequiresStorageNotLow(bVar.i());
        }
        if (vVar.f14480k > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (max > 0) {
            z4 = true;
        }
        if (i7 >= 31 && vVar.f14486q && !z3 && !z4) {
            JobInfo.Builder unused7 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
