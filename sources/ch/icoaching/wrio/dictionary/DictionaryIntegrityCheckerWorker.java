package ch.icoaching.wrio.dictionary;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.p;
import c.C0489b;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.h;
import ch.icoaching.wrio.logging.Log;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 '2\u00020\u0001:\u0001(BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lch/icoaching/wrio/dictionary/DictionaryIntegrityCheckerWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "LO2/a;", "notificationHelper", "Lch/icoaching/wrio/dictionary/d;", "dictionaryController", "Lch/icoaching/wrio/data/h;", "dictionarySettings", "Lch/icoaching/wrio/data/c;", "languageSettings", "Lc/b;", "databaseHandler", "Lch/icoaching/typewise/AILibrarySingletonProvider;", "aiLibrarySingletonProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlinx/coroutines/CoroutineDispatcher;LO2/a;Lch/icoaching/wrio/dictionary/d;Lch/icoaching/wrio/data/h;Lch/icoaching/wrio/data/c;Lc/b;Lch/icoaching/typewise/AILibrarySingletonProvider;)V", "Landroidx/work/l$a;", "s", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "h", "Lkotlinx/coroutines/CoroutineDispatcher;", "i", "LO2/a;", "j", "Lch/icoaching/wrio/dictionary/d;", "k", "Lch/icoaching/wrio/data/h;", "l", "Lch/icoaching/wrio/data/c;", "m", "Lc/b;", "n", "Lch/icoaching/typewise/AILibrarySingletonProvider;", "o", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DictionaryIntegrityCheckerWorker extends CoroutineWorker {

    /* renamed from: o  reason: collision with root package name */
    public static final a f9584o = new a((i) null);

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineDispatcher f9585h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final O2.a f9586i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final d f9587j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final h f9588k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final c f9589l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C0489b f9590m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final AILibrarySingletonProvider f9591n;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(WorkManager workManager) {
            o.e(workManager, "workManager");
            Calendar instance = Calendar.getInstance();
            o.d(instance, "getInstance(...)");
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, 1);
            instance2.set(11, 2);
            instance2.set(12, 0);
            if (instance2.getTimeInMillis() - instance.getTimeInMillis() < 43200000) {
                instance2.add(5, 1);
            }
            o.d(instance2, "apply(...)");
            long timeInMillis = instance2.getTimeInMillis() - instance.getTimeInMillis();
            Log log = Log.f10572a;
            Log.d(log, "DictionaryIntegrityCheckerWorker", "scheduleWorker() :: Initial delay is '" + (timeInMillis / 60000) + "' minutes", (Throwable) null, 4, (Object) null);
            ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy = ExistingPeriodicWorkPolicy.KEEP;
            workManager.d("dictionary_integrity_checker_worker_unique_id", existingPeriodicWorkPolicy, (p) ((p.a) ((p.a) ((p.a) new p.a(DictionaryIntegrityCheckerWorker.class, 1, TimeUnit.DAYS, 2, TimeUnit.HOURS).l(timeInMillis, TimeUnit.MILLISECONDS)).j(new b.a().b(NetworkType.NOT_REQUIRED).f(true).e(true).c(true).d(false).a())).a("dictionary_integrity_checker")).b());
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DictionaryIntegrityCheckerWorker(Context context, WorkerParameters workerParameters, CoroutineDispatcher coroutineDispatcher, O2.a aVar, d dVar, h hVar, c cVar, C0489b bVar, AILibrarySingletonProvider aILibrarySingletonProvider) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "workerParams");
        o.e(coroutineDispatcher, "ioDispatcher");
        o.e(aVar, "notificationHelper");
        o.e(dVar, "dictionaryController");
        o.e(hVar, "dictionarySettings");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(aILibrarySingletonProvider, "aiLibrarySingletonProvider");
        this.f9585h = coroutineDispatcher;
        this.f9586i = aVar;
        this.f9587j = dVar;
        this.f9588k = hVar;
        this.f9589l = cVar;
        this.f9590m = bVar;
        this.f9591n = aILibrarySingletonProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$1 r0 = (ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$1 r0 = new ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r6)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            kotlin.f.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f9585h
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2 r2 = new ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.C0738g.e(r6, r2, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.o.d(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker.s(kotlin.coroutines.c):java.lang.Object");
    }
}
