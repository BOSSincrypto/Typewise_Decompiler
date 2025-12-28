package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import l0.i;
import l0.j;
import l0.l;
import m0.C0812k;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7245a = m.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a  reason: collision with other inner class name */
    static class C0115a {
        static void a(AlarmManager alarmManager, int i4, long j4, PendingIntent pendingIntent) {
            alarmManager.setExact(i4, j4, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, l0.m mVar) {
        j G3 = workDatabase.G();
        i c4 = G3.c(mVar);
        if (c4 != null) {
            b(context, mVar, c4.f14445c);
            m e4 = m.e();
            String str = f7245a;
            e4.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            G3.a(mVar);
        }
    }

    private static void b(Context context, l0.m mVar, int i4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, b.c(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            m e4 = m.e();
            String str = f7245a;
            e4.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i4 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, l0.m mVar, long j4) {
        j G3 = workDatabase.G();
        i c4 = G3.c(mVar);
        if (c4 != null) {
            b(context, mVar, c4.f14445c);
            d(context, mVar, c4.f14445c, j4);
            return;
        }
        int c5 = new C0812k(workDatabase).c();
        G3.g(l.a(mVar, c5));
        d(context, mVar, c5, j4);
    }

    private static void d(Context context, l0.m mVar, int i4, long j4) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, b.c(context, mVar), 201326592);
        if (alarmManager != null) {
            C0115a.a(alarmManager, 0, j4, service);
        }
    }
}
