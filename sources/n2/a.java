package N2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker;
import ch.icoaching.wrio.dictionary.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class a extends v {

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f1021b;

    /* renamed from: c  reason: collision with root package name */
    private final O2.a f1022c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1023d;

    /* renamed from: e  reason: collision with root package name */
    private final h f1024e;

    /* renamed from: f  reason: collision with root package name */
    private final c f1025f;

    /* renamed from: g  reason: collision with root package name */
    private final C0489b f1026g;

    /* renamed from: h  reason: collision with root package name */
    private final AILibrarySingletonProvider f1027h;

    public a(CoroutineDispatcher coroutineDispatcher, O2.a aVar, d dVar, h hVar, c cVar, C0489b bVar, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(aVar, "notificationHelper");
        o.e(dVar, "dictionaryController");
        o.e(hVar, "dictionarySettings");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f1021b = coroutineDispatcher;
        this.f1022c = aVar;
        this.f1023d = dVar;
        this.f1024e = hVar;
        this.f1025f = cVar;
        this.f1026g = bVar;
        this.f1027h = aILibrarySingletonProvider;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        o.e(context, "appContext");
        o.e(str, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str, DictionaryIntegrityCheckerWorker.class.getName())) {
            return null;
        }
        return new DictionaryIntegrityCheckerWorker(context, workerParameters, this.f1021b, this.f1022c, this.f1023d, this.f1024e, this.f1025f, this.f1026g, this.f1027h);
    }
}
