package m0;

import Z.g;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.o;
import l0.d;

/* renamed from: m0.l  reason: case insensitive filesystem */
public abstract class C0813l {
    public static final void c(Context context, g gVar) {
        o.e(context, "context");
        o.e(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i4 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i5 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.j();
            try {
                gVar.X("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i4)});
                gVar.X("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                sharedPreferences.edit().clear().apply();
                gVar.V();
            } finally {
                gVar.i();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        int i4;
        Long b4 = workDatabase.F().b(str);
        int i5 = 0;
        if (b4 != null) {
            i4 = (int) b4.longValue();
        } else {
            i4 = 0;
        }
        if (i4 != Integer.MAX_VALUE) {
            i5 = i4 + 1;
        }
        e(workDatabase, str, i5);
        return i4;
    }

    /* access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i4) {
        workDatabase.F().a(new d(str, Long.valueOf((long) i4)));
    }
}
