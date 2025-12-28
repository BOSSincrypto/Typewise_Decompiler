package N2;

import O2.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class c extends v {

    /* renamed from: b  reason: collision with root package name */
    private final a f1033b;

    /* renamed from: c  reason: collision with root package name */
    private final C0489b f1034c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f1035d;

    public c(a aVar, C0489b bVar, CoroutineDispatcher coroutineDispatcher) {
        o.e(aVar, "notificationsHelper");
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f1033b = aVar;
        this.f1034c = bVar;
        this.f1035d = coroutineDispatcher;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        o.e(context, "appContext");
        o.e(str, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str, DuplicateWordsRemoverWorker.class.getName())) {
            return null;
        }
        return new DuplicateWordsRemoverWorker(context, workerParameters, this.f1033b, this.f1034c, this.f1035d);
    }
}
