package androidx.work;

import X1.a;
import android.content.Context;
import androidx.work.impl.F;
import java.util.Collections;
import java.util.List;

public abstract class WorkManager {

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    protected WorkManager() {
    }

    public static WorkManager g(Context context) {
        return F.p(context);
    }

    public static void i(Context context, a aVar) {
        F.i(context, aVar);
    }

    public abstract o a(String str);

    public final o b(u uVar) {
        return c(Collections.singletonList(uVar));
    }

    public abstract o c(List list);

    public abstract o d(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, p pVar);

    public o e(String str, ExistingWorkPolicy existingWorkPolicy, n nVar) {
        return f(str, existingWorkPolicy, Collections.singletonList(nVar));
    }

    public abstract o f(String str, ExistingWorkPolicy existingWorkPolicy, List list);

    public abstract a h(String str);
}
