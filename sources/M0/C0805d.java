package m0;

import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.b;
import androidx.work.e;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import kotlin.jvm.internal.o;
import l0.v;

/* renamed from: m0.d  reason: case insensitive filesystem */
public abstract class C0805d {
    public static final v a(v vVar) {
        v vVar2 = vVar;
        o.e(vVar2, "workSpec");
        b bVar = vVar2.f14479j;
        String str = vVar2.f14472c;
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        if (o.a(str, cls.getName())) {
            return vVar2;
        }
        if (!bVar.f() && !bVar.i()) {
            return vVar2;
        }
        e a4 = new e.a().c(vVar2.f14474e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        e eVar = a4;
        o.d(a4, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = cls.getName();
        o.d(name, "name");
        return v.e(vVar, (String) null, (WorkInfo.State) null, name, (String) null, eVar, (e) null, 0, 0, 0, (b) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048555, (Object) null);
    }

    public static final v b(List list, v vVar) {
        o.e(list, "schedulers");
        o.e(vVar, "workSpec");
        if (Build.VERSION.SDK_INT < 26) {
            return a(vVar);
        }
        return vVar;
    }
}
