package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.a;
import androidx.work.impl.A;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.l;
import androidx.work.impl.u;
import androidx.work.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l0.v;
import l0.w;
import m0.C0807f;
import m0.r;
import m0.s;

public class ForceStopRunnable implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7365e = m.i("ForceStopRunnable");

    /* renamed from: f  reason: collision with root package name */
    private static final long f7366f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f7367a;

    /* renamed from: b  reason: collision with root package name */
    private final F f7368b;

    /* renamed from: c  reason: collision with root package name */
    private final r f7369c;

    /* renamed from: d  reason: collision with root package name */
    private int f7370d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f7371a = m.i("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                m.e().j(f7371a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, F f4) {
        this.f7367a = context.getApplicationContext();
        this.f7368b = f4;
        this.f7369c = f4.q();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i4) {
        return PendingIntent.getBroadcast(context, -1, c(context), i4);
    }

    static void g(Context context) {
        int i4;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 167772160;
        } else {
            i4 = 134217728;
        }
        PendingIntent d4 = d(context, i4);
        long currentTimeMillis = System.currentTimeMillis() + f7366f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d4);
        }
    }

    public boolean a() {
        boolean z3;
        boolean i4 = l.i(this.f7367a, this.f7368b);
        WorkDatabase u3 = this.f7368b.u();
        w J3 = u3.J();
        l0.r I3 = u3.I();
        u3.e();
        try {
            List<v> b4 = J3.b();
            if (b4 == null || b4.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                for (v vVar : b4) {
                    J3.o(WorkInfo.State.ENQUEUED, vVar.f14470a);
                    J3.e(vVar.f14470a, -1);
                }
            }
            I3.b();
            u3.B();
            u3.i();
            if (z3 || i4) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            u3.i();
            throw th;
        }
    }

    public void b() {
        boolean a4 = a();
        if (h()) {
            m.e().a(f7365e, "Rescheduling Workers.");
            this.f7368b.y();
            this.f7368b.q().e(false);
        } else if (e()) {
            m.e().a(f7365e, "Application was force-stopped, rescheduling.");
            this.f7368b.y();
            this.f7369c.d(System.currentTimeMillis());
        } else if (a4) {
            m.e().a(f7365e, "Found unfinished work, scheduling it.");
            u.b(this.f7368b.n(), this.f7368b.u(), this.f7368b.s());
        }
    }

    public boolean e() {
        int i4;
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 31) {
                i4 = 570425344;
            } else {
                i4 = 536870912;
            }
            PendingIntent d4 = d(this.f7367a, i4);
            if (i5 >= 30) {
                if (d4 != null) {
                    d4.cancel();
                }
                List a4 = ((ActivityManager) this.f7367a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a4 != null && !a4.isEmpty()) {
                    long a5 = this.f7369c.a();
                    for (int i6 = 0; i6 < a4.size(); i6++) {
                        ApplicationExitInfo a6 = C0807f.a(a4.get(i6));
                        if (a6.getReason() == 10 && a6.getTimestamp() >= a5) {
                            return true;
                        }
                    }
                }
            } else if (d4 == null) {
                g(this.f7367a);
                return true;
            }
            return false;
        } catch (SecurityException e4) {
            e = e4;
            m.e().l(f7365e, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e5) {
            e = e5;
            m.e().l(f7365e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        a n4 = this.f7368b.n();
        if (TextUtils.isEmpty(n4.c())) {
            m.e().a(f7365e, "The default process name was not specified.");
            return true;
        }
        boolean b4 = s.b(this.f7367a, n4);
        m e4 = m.e();
        String str = f7365e;
        e4.a(str, "Is default app process = " + b4);
        return b4;
    }

    public boolean h() {
        return this.f7368b.q().b();
    }

    public void i(long j4) {
        try {
            Thread.sleep(j4);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!f()) {
                this.f7368b.x();
                return;
            }
            while (true) {
                A.d(this.f7367a);
                m.e().a(f7365e, "Performing cleanup operations.");
                b();
                break;
            }
            this.f7368b.x();
        } catch (SQLiteException e4) {
            m.e().c(f7365e, "Unexpected SQLite exception during migrations");
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
            androidx.core.util.a e5 = this.f7368b.n().e();
            if (e5 != null) {
                e5.accept(illegalStateException);
            } else {
                throw illegalStateException;
            }
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e6) {
            int i4 = this.f7370d + 1;
            this.f7370d = i4;
            if (i4 >= 3) {
                m e7 = m.e();
                String str = f7365e;
                e7.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                androidx.core.util.a e8 = this.f7368b.n().e();
                if (e8 != null) {
                    m.e().b(str, "Routing exception to the specified exception handler", illegalStateException2);
                    e8.accept(illegalStateException2);
                } else {
                    throw illegalStateException2;
                }
            } else {
                m e9 = m.e();
                String str2 = f7365e;
                e9.b(str2, "Retrying after " + (((long) i4) * 300), e6);
                i(((long) this.f7370d) * 300);
            }
        } catch (Throwable th) {
            this.f7368b.x();
            throw th;
        }
    }
}
