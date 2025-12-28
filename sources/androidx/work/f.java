package androidx.work;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class f extends v {

    /* renamed from: c  reason: collision with root package name */
    private static final String f7153c = m.i("DelegatingWkrFctry");

    /* renamed from: b  reason: collision with root package name */
    private final List f7154b = new CopyOnWriteArrayList();

    public final l a(Context context, String str, WorkerParameters workerParameters) {
        for (v a4 : this.f7154b) {
            try {
                l a5 = a4.a(context, str, workerParameters);
                if (a5 != null) {
                    return a5;
                }
            } catch (Throwable th) {
                m.e().d(f7153c, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }

    public final void d(v vVar) {
        this.f7154b.add(vVar);
    }
}
