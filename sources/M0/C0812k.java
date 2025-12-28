package m0;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.o;

/* renamed from: m0.k  reason: case insensitive filesystem */
public final class C0812k {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f14615a;

    public C0812k(WorkDatabase workDatabase) {
        o.e(workDatabase, "workDatabase");
        this.f14615a = workDatabase;
    }

    /* access modifiers changed from: private */
    public static final Integer d(C0812k kVar) {
        o.e(kVar, "this$0");
        return Integer.valueOf(C0813l.d(kVar.f14615a, "next_alarm_manager_id"));
    }

    /* access modifiers changed from: private */
    public static final Integer f(C0812k kVar, int i4, int i5) {
        o.e(kVar, "this$0");
        int a4 = C0813l.d(kVar.f14615a, "next_job_scheduler_id");
        if (i4 > a4 || a4 > i5) {
            C0813l.e(kVar.f14615a, "next_job_scheduler_id", i4 + 1);
        } else {
            i4 = a4;
        }
        return Integer.valueOf(i4);
    }

    public final int c() {
        Object z3 = this.f14615a.z(new C0810i(this));
        o.d(z3, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z3).intValue();
    }

    public final int e(int i4, int i5) {
        Object z3 = this.f14615a.z(new C0811j(this, i4, i5));
        o.d(z3, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z3).intValue();
    }
}
