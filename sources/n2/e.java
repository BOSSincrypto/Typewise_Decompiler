package N2;

import O2.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class e extends v {

    /* renamed from: b  reason: collision with root package name */
    private final a f1041b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1042c;

    /* renamed from: d  reason: collision with root package name */
    private final C0489b f1043d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineDispatcher f1044e;

    public e(a aVar, c cVar, C0489b bVar, CoroutineDispatcher coroutineDispatcher) {
        o.e(aVar, "notificationHelper");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f1041b = aVar;
        this.f1042c = cVar;
        this.f1043d = bVar;
        this.f1044e = coroutineDispatcher;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        o.e(context, "appContext");
        o.e(str, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str, RestoreMixedCaseWordsWorker.class.getName())) {
            return null;
        }
        return new RestoreMixedCaseWordsWorker(context, workerParameters, this.f1041b, this.f1042c, this.f1043d, this.f1044e);
    }
}
