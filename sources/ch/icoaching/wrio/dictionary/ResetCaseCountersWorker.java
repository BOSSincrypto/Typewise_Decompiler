package ch.icoaching.wrio.dictionary;

import K2.C0341a;
import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import c.C0489b;
import ch.icoaching.wrio.data.c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001f2\u00020\u0001:\u0001 B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lch/icoaching/wrio/dictionary/ResetCaseCountersWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "LO2/a;", "notificationHelper", "Lch/icoaching/wrio/data/c;", "languageSettings", "Lc/b;", "databaseHandler", "LK2/a;", "json", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LO2/a;Lch/icoaching/wrio/data/c;Lc/b;LK2/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/work/l$a;", "s", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "h", "LO2/a;", "i", "Lch/icoaching/wrio/data/c;", "j", "Lc/b;", "k", "LK2/a;", "l", "Lkotlinx/coroutines/CoroutineDispatcher;", "m", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResetCaseCountersWorker extends CoroutineWorker {

    /* renamed from: m  reason: collision with root package name */
    public static final a f9606m = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final O2.a f9607h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c f9608i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C0489b f9609j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C0341a f9610k;

    /* renamed from: l  reason: collision with root package name */
    private final CoroutineDispatcher f9611l;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final n a() {
            return (n) ((n.a) ((n.a) new n.a(ResetCaseCountersWorker.class).i(BackoffPolicy.EXPONENTIAL, 30, TimeUnit.MINUTES)).a("reset_case_counters")).b();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResetCaseCountersWorker(Context context, WorkerParameters workerParameters, O2.a aVar, c cVar, C0489b bVar, C0341a aVar2, CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "workerParams");
        o.e(aVar, "notificationHelper");
        o.e(cVar, "languageSettings");
        o.e(bVar, "databaseHandler");
        o.e(aVar2, "json");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f9607h = aVar;
        this.f9608i = cVar;
        this.f9609j = bVar;
        this.f9610k = aVar2;
        this.f9611l = coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$1 r0 = (ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$1 r0 = new ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$1
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
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f9611l
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$2 r2 = new ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.ResetCaseCountersWorker.s(kotlin.coroutines.c):java.lang.Object");
    }
}
