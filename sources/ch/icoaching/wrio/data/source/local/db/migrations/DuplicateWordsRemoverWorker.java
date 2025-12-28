package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.n;
import c.C0489b;
import ch.icoaching.wrio.logging.Log;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lch/icoaching/wrio/data/source/local/db/migrations/DuplicateWordsRemoverWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "LO2/a;", "notificationsHelper", "Lc/b;", "databaseHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LO2/a;Lc/b;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/work/l$a;", "s", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "h", "LO2/a;", "i", "Lc/b;", "j", "Lkotlinx/coroutines/CoroutineDispatcher;", "k", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DuplicateWordsRemoverWorker extends CoroutineWorker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9522k = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final O2.a f9523h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C0489b f9524i;

    /* renamed from: j  reason: collision with root package name */
    private final CoroutineDispatcher f9525j;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(WorkManager workManager) {
            o.e(workManager, "workManager");
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(5, 1);
            instance2.set(11, 3);
            instance2.set(12, 0);
            long timeInMillis = instance2.getTimeInMillis() - instance.getTimeInMillis();
            Log log = Log.f10572a;
            Log.d(log, "DuplicateWordsRemoverWorker", "scheduleWorker() :: Initial delay is '" + (timeInMillis / 60000) + " minutes", (Throwable) null, 4, (Object) null);
            b a4 = new b.a().b(NetworkType.NOT_REQUIRED).f(true).e(true).c(true).d(false).a();
            workManager.e("duplicate_words_removal_unique_work_id", ExistingWorkPolicy.KEEP, (n) ((n.a) ((n.a) ((n.a) new n.a(DuplicateWordsRemoverWorker.class).j(a4)).l(timeInMillis, TimeUnit.MILLISECONDS)).a("duplicate_words_removal")).b());
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuplicateWordsRemoverWorker(Context context, WorkerParameters workerParameters, O2.a aVar, C0489b bVar, CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "workerParams");
        o.e(aVar, "notificationsHelper");
        o.e(bVar, "databaseHandler");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f9523h = aVar;
        this.f9524i = bVar;
        this.f9525j = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$1 r0 = (ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$1 r0 = new ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$1
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
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f9525j
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$2 r2 = new ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker.s(kotlin.coroutines.c):java.lang.Object");
    }
}
