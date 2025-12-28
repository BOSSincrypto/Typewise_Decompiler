package N2;

import K2.C0341a;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.v;
import c.C0489b;
import c2.C0497c;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.a;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.dictionary.WriteWordsWorker;
import ch.icoaching.wrio.dictionary.d;
import i2.C0680a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

public final class g extends v {

    /* renamed from: b  reason: collision with root package name */
    private final C0497c f1045b;

    /* renamed from: c  reason: collision with root package name */
    private final C0680a f1046c;

    /* renamed from: d  reason: collision with root package name */
    private final a f1047d;

    /* renamed from: e  reason: collision with root package name */
    private final O2.a f1048e;

    /* renamed from: f  reason: collision with root package name */
    private final d f1049f;

    /* renamed from: g  reason: collision with root package name */
    private final h f1050g;

    /* renamed from: h  reason: collision with root package name */
    private final c f1051h;

    /* renamed from: i  reason: collision with root package name */
    private final C0489b f1052i;

    /* renamed from: j  reason: collision with root package name */
    private final C0341a f1053j;

    /* renamed from: k  reason: collision with root package name */
    private final CoroutineDispatcher f1054k;

    /* renamed from: l  reason: collision with root package name */
    private final AILibrarySingletonProvider f1055l;

    public g(C0497c cVar, C0680a aVar, a aVar2, O2.a aVar3, d dVar, h hVar, c cVar2, C0489b bVar, C0341a aVar4, CoroutineDispatcher coroutineDispatcher, AILibrarySingletonProvider aILibrarySingletonProvider) {
        o.e(cVar, "dictionaryRepository");
        o.e(aVar, "defaultSharedPreferences");
        o.e(aVar2, "autocorrectionSettings");
        o.e(aVar3, "notificationHelper");
        o.e(dVar, "dictionaryController");
        o.e(hVar, "dictionarySettings");
        o.e(cVar2, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(aVar4, "json");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f1045b = cVar;
        this.f1046c = aVar;
        this.f1047d = aVar2;
        this.f1048e = aVar3;
        this.f1049f = dVar;
        this.f1050g = hVar;
        this.f1051h = cVar2;
        this.f1052i = bVar;
        this.f1053j = aVar4;
        this.f1054k = coroutineDispatcher;
        this.f1055l = aILibrarySingletonProvider;
    }

    public l a(Context context, String str, WorkerParameters workerParameters) {
        String str2 = str;
        o.e(context, "appContext");
        o.e(str2, "workerClassName");
        o.e(workerParameters, "workerParameters");
        if (!o.a(str2, WriteWordsWorker.class.getName())) {
            return null;
        }
        return new WriteWordsWorker(context, workerParameters, this.f1045b, this.f1046c, this.f1047d, this.f1048e, this.f1049f, this.f1050g, this.f1051h, this.f1052i, this.f1053j, this.f1054k, this.f1055l);
    }
}
