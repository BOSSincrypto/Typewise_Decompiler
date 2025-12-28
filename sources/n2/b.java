package N2;

import O2.a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.dictionary.DictionaryRestorerWorker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class b extends v {

    /* renamed from: b  reason: collision with root package name */
    private final a f1028b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1029c;

    /* renamed from: d  reason: collision with root package name */
    private final C0489b f1030d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineDispatcher f1031e;

    /* renamed from: f  reason: collision with root package name */
    private final AILibrarySingletonProvider f1032f;

    public b(a aVar, c cVar, C0489b bVar, CoroutineDispatcher coroutineDispatcher, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(aVar, "notificationsHelper");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f1028b = aVar;
        this.f1029c = cVar;
        this.f1030d = bVar;
        this.f1031e = coroutineDispatcher;
        this.f1032f = aILibrarySingletonProvider;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        o.e(context, "appContext");
        o.e(str, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str, DictionaryRestorerWorker.class.getName())) {
            return null;
        }
        return new DictionaryRestorerWorker(context, workerParameters, this.f1028b, this.f1029c, this.f1030d, this.f1031e, this.f1032f);
    }
}
