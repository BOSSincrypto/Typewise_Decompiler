package m0;

import Z.g;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import l0.d;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f14617a;

    public r(WorkDatabase workDatabase) {
        this.f14617a = workDatabase;
    }

    public static void c(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j4 = 0;
            long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j4 = 1;
            }
            gVar.j();
            try {
                gVar.X("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                gVar.X("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j4)});
                sharedPreferences.edit().clear().apply();
                gVar.V();
            } finally {
                gVar.i();
            }
        }
    }

    public long a() {
        Long b4 = this.f14617a.F().b("last_force_stop_ms");
        if (b4 != null) {
            return b4.longValue();
        }
        return 0;
    }

    public boolean b() {
        Long b4 = this.f14617a.F().b("reschedule_needed");
        if (b4 == null || b4.longValue() != 1) {
            return false;
        }
        return true;
    }

    public void d(long j4) {
        this.f14617a.F().a(new d("last_force_stop_ms", Long.valueOf(j4)));
    }

    public void e(boolean z3) {
        this.f14617a.F().a(new d("reschedule_needed", z3));
    }
}
