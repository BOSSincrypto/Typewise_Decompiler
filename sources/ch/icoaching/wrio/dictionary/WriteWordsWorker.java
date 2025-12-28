package ch.icoaching.wrio.dictionary;

import K2.C0341a;
import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.n;
import c.C0489b;
import c2.C0497c;
import ch.icoaching.typewise.AILibrarySingletonProvider;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.data.h;
import i2.C0680a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001;Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108¨\u0006<"}, d2 = {"Lch/icoaching/wrio/dictionary/WriteWordsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lc2/c;", "userDictionaryRepository", "Li2/a;", "defaultSharedPreferences", "Lch/icoaching/wrio/data/a;", "autocorrectionSettings", "LO2/a;", "notificationHelper", "Lch/icoaching/wrio/dictionary/d;", "dictionaryController", "Lch/icoaching/wrio/data/h;", "dictionarySettings", "Lch/icoaching/wrio/data/c;", "languageSettings", "Lc/b;", "databaseHandler", "LK2/a;", "json", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lch/icoaching/typewise/AILibrarySingletonProvider;", "aiLibrarySingletonProvider", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lc2/c;Li2/a;Lch/icoaching/wrio/data/a;LO2/a;Lch/icoaching/wrio/dictionary/d;Lch/icoaching/wrio/data/h;Lch/icoaching/wrio/data/c;Lc/b;LK2/a;Lkotlinx/coroutines/CoroutineDispatcher;Lch/icoaching/typewise/AILibrarySingletonProvider;)V", "Landroidx/work/l$a;", "s", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "h", "Lc2/c;", "i", "Li2/a;", "j", "Lch/icoaching/wrio/data/a;", "k", "LO2/a;", "l", "Lch/icoaching/wrio/dictionary/d;", "m", "Lch/icoaching/wrio/data/h;", "n", "Lch/icoaching/wrio/data/c;", "o", "Lc/b;", "p", "LK2/a;", "q", "Lkotlinx/coroutines/CoroutineDispatcher;", "r", "Lch/icoaching/typewise/AILibrarySingletonProvider;", "", "Z", "notificationShown", "t", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WriteWordsWorker extends CoroutineWorker {

    /* renamed from: t  reason: collision with root package name */
    public static final a f9612t = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C0497c f9613h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C0680a f9614i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final ch.icoaching.wrio.data.a f9615j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final O2.a f9616k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final d f9617l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final h f9618m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final c f9619n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C0489b f9620o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C0341a f9621p;

    /* renamed from: q  reason: collision with root package name */
    private final CoroutineDispatcher f9622q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final AILibrarySingletonProvider f9623r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f9624s;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final n a() {
            return (n) ((n.a) ((n.a) new n.a(WriteWordsWorker.class).i(BackoffPolicy.EXPONENTIAL, 30, TimeUnit.MINUTES)).a("language_import")).b();
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WriteWordsWorker(Context context, WorkerParameters workerParameters, C0497c cVar, C0680a aVar, ch.icoaching.wrio.data.a aVar2, O2.a aVar3, d dVar, h hVar, c cVar2, C0489b bVar, C0341a aVar4, CoroutineDispatcher coroutineDispatcher, AILibrarySingletonProvider aILibrarySingletonProvider) {
        super(context, workerParameters);
        o.e(context, "context");
        o.e(workerParameters, "workerParams");
        o.e(cVar, "userDictionaryRepository");
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
        this.f9613h = cVar;
        this.f9614i = aVar;
        this.f9615j = aVar2;
        this.f9616k = aVar3;
        this.f9617l = dVar;
        this.f9618m = hVar;
        this.f9619n = cVar2;
        this.f9620o = bVar;
        this.f9621p = aVar4;
        this.f9622q = coroutineDispatcher;
        this.f9623r = aILibrarySingletonProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object s(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$1 r0 = (ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$1 r0 = new ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$1
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
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f9622q
            ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$2 r2 = new ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.WriteWordsWorker.s(kotlin.coroutines.c):java.lang.Object");
    }
}
