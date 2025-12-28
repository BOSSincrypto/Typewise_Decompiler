package N2;

import K2.C0341a;
import O2.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.dictionary.ResetCaseCountersWorker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class d extends v {

    /* renamed from: b  reason: collision with root package name */
    private final a f1036b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1037c;

    /* renamed from: d  reason: collision with root package name */
    private final C0489b f1038d;

    /* renamed from: e  reason: collision with root package name */
    private final C0341a f1039e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineDispatcher f1040f;

    public d(a aVar, c cVar, C0489b bVar, C0341a aVar2, CoroutineDispatcher coroutineDispatcher) {
        o.e(aVar, "notificationHelper");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(aVar2, "json");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f1036b = aVar;
        this.f1037c = cVar;
        this.f1038d = bVar;
        this.f1039e = aVar2;
        this.f1040f = coroutineDispatcher;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        o.e(context, "appContext");
        o.e(str, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str, ResetCaseCountersWorker.class.getName())) {
            return null;
        }
        return new ResetCaseCountersWorker(context, workerParameters, this.f1036b, this.f1037c, this.f1038d, this.f1039e, this.f1040f);
    }
}
