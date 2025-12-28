package ch.icoaching.wrio.dictionary;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2", f = "DictionaryIntegrityCheckerWorker.kt", l = {61, 70, 73}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class DictionaryIntegrityCheckerWorker$doWork$2 extends SuspendLambda implements p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DictionaryIntegrityCheckerWorker this$0;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9592a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ch.icoaching.wrio.dictionary.IntegrityCheckStatus[] r0 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ch.icoaching.wrio.dictionary.IntegrityCheckStatus r1 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.OK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ch.icoaching.wrio.dictionary.IntegrityCheckStatus r1 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.MISSING_WORDS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ch.icoaching.wrio.dictionary.IntegrityCheckStatus r1 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.MISSING_DELETES     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ch.icoaching.wrio.dictionary.IntegrityCheckStatus r1 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.DUPLICATE_WORDS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f9592a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DictionaryIntegrityCheckerWorker$doWork$2(DictionaryIntegrityCheckerWorker dictionaryIntegrityCheckerWorker, c<? super DictionaryIntegrityCheckerWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = dictionaryIntegrityCheckerWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DictionaryIntegrityCheckerWorker$doWork$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec A[Catch:{ all -> 0x0026 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ed A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0109 A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0373 A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03d0 A[Catch:{ all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0368 A[EDGE_INSN: B:91:0x0368->B:74:0x0368 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r0 = "getApplicationContext(...)"
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r1.label
            java.lang.String r4 = "getInstance(...)"
            java.lang.String r5 = "dictionary_integrity_checker_worker_unique_id"
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0042
            if (r3 == r8) goto L_0x003c
            if (r3 == r7) goto L_0x0031
            if (r3 != r6) goto L_0x0029
            java.lang.Object r2 = r1.L$1
            ch.icoaching.typewise.config.CompanyConfig$b r2 = (ch.icoaching.typewise.config.CompanyConfig.b) r2
            java.lang.Object r3 = r1.L$0
            ch.icoaching.wrio.dictionary.b r3 = (ch.icoaching.wrio.dictionary.b) r3
            kotlin.f.b(r30)     // Catch:{ all -> 0x0026 }
            goto L_0x00ee
        L_0x0026:
            r0 = move-exception
            goto L_0x03f8
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0031:
            java.lang.Object r3 = r1.L$0
            ch.icoaching.wrio.dictionary.b r3 = (ch.icoaching.wrio.dictionary.b) r3
            kotlin.f.b(r30)
            r9 = r30
            goto L_0x00c8
        L_0x003c:
            kotlin.f.b(r30)
            r3 = r30
            goto L_0x0093
        L_0x0042:
            kotlin.f.b(r30)
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a
            r13 = 4
            r14 = 0
            java.lang.String r10 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r11 = "doWork() :: START"
            r12 = 0
            r9 = r3
            ch.icoaching.wrio.logging.Log.d(r9, r10, r11, r12, r13, r14)
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r9 = r1.this$0
            ch.icoaching.wrio.data.h r9 = r9.f9588k
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x007b
            r13 = 4
            r14 = 0
            java.lang.String r10 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r11 = "doWork() :: END - NOT NEEDED"
            r12 = 0
            r9 = r3
            ch.icoaching.wrio.logging.Log.d(r9, r10, r11, r12, r13, r14)
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r0 = r1.this$0
            android.content.Context r0 = r0.a()
            androidx.work.WorkManager r0 = androidx.work.WorkManager.g(r0)
            r0.a(r5)
            androidx.work.l$a r0 = androidx.work.l.a.c()
            return r0
        L_0x007b:
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r3 = r1.this$0
            android.content.Context r3 = r3.a()
            androidx.work.WorkManager r3 = androidx.work.WorkManager.g(r3)
            kotlin.jvm.internal.o.d(r3, r4)
            r1.label = r8
            java.lang.String r9 = "language_import_unique_work_id"
            java.lang.Object r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r3, r9, r1)
            if (r3 != r2) goto L_0x0093
            return r2
        L_0x0093:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00ac
            ch.icoaching.wrio.logging.Log r9 = ch.icoaching.wrio.logging.Log.f10572a
            r13 = 4
            r14 = 0
            java.lang.String r10 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r11 = "doWork() :: END - RETRY - LANGUAGE IMPORT IN PROGRESS"
            r12 = 0
            ch.icoaching.wrio.logging.Log.d(r9, r10, r11, r12, r13, r14)
            androidx.work.l$a r0 = androidx.work.l.a.b()
            return r0
        L_0x00ac:
            ch.icoaching.wrio.dictionary.b r3 = new ch.icoaching.wrio.dictionary.b
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r9 = r1.this$0
            ch.icoaching.wrio.data.c r9 = r9.f9589l
            r3.<init>(r9)
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r9 = r1.this$0
            ch.icoaching.typewise.AILibrarySingletonProvider r9 = r9.f9591n
            r1.L$0 = r3
            r1.label = r7
            java.lang.Object r9 = r9.b(r1)
            if (r9 != r2) goto L_0x00c8
            return r2
        L_0x00c8:
            ch.icoaching.typewise.AILibrary r9 = (ch.icoaching.typewise.AILibrary) r9
            ch.icoaching.typewise.file_handling.ConfigHolder r9 = r9.b()
            ch.icoaching.typewise.config.CompanyConfig r9 = r9.c()
            ch.icoaching.typewise.config.CompanyConfig$b r9 = r9.e()
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r10 = r1.this$0     // Catch:{ all -> 0x0026 }
            O2.a r11 = r10.f9586i     // Catch:{ all -> 0x0026 }
            androidx.work.g r11 = r11.b()     // Catch:{ all -> 0x0026 }
            r1.L$0 = r3     // Catch:{ all -> 0x0026 }
            r1.L$1 = r9     // Catch:{ all -> 0x0026 }
            r1.label = r6     // Catch:{ all -> 0x0026 }
            java.lang.Object r10 = r10.x(r11, r1)     // Catch:{ all -> 0x0026 }
            if (r10 != r2) goto L_0x00ed
            return r2
        L_0x00ed:
            r2 = r9
        L_0x00ee:
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r9 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.OK     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r10 = r1.this$0     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.data.c r10 = r10.f9589l     // Catch:{ all -> 0x0026 }
            java.util.List r10 = r10.e()     // Catch:{ all -> 0x0026 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0026 }
            r15.<init>()     // Catch:{ all -> 0x0026 }
        L_0x00ff:
            int r11 = r15.size()     // Catch:{ all -> 0x0026 }
            int r12 = r10.size()     // Catch:{ all -> 0x0026 }
            if (r11 == r12) goto L_0x0368
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r11 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.OK     // Catch:{ all -> 0x0026 }
            if (r9 == r11) goto L_0x010f
            goto L_0x0368
        L_0x010f:
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x0026 }
        L_0x0113:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0026 }
            if (r12 == 0) goto L_0x0360
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0026 }
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0026 }
            boolean r14 = r15.contains(r14)     // Catch:{ all -> 0x0026 }
            if (r14 != 0) goto L_0x0113
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r11 = r1.this$0     // Catch:{ all -> 0x0026 }
            android.content.Context r11 = r11.a()     // Catch:{ all -> 0x0026 }
            kotlin.jvm.internal.o.d(r11, r0)     // Catch:{ all -> 0x0026 }
            int r11 = r3.a(r11, r14)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.logging.Log r12 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r17 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r6.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "doWork() :: Start checking integrity of '"
            r6.append(r7)     // Catch:{ all -> 0x0026 }
            r6.append(r14)     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "' language of version "
            r6.append(r7)     // Catch:{ all -> 0x0026 }
            r6.append(r11)     // Catch:{ all -> 0x0026 }
            java.lang.String r18 = r6.toString()     // Catch:{ all -> 0x0026 }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r12
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0026 }
            if (r11 != 0) goto L_0x0165
            r15.add(r14)     // Catch:{ all -> 0x0026 }
            goto L_0x0272
        L_0x0165:
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r6 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r6 = r6.f9590m     // Catch:{ all -> 0x0026 }
            h2.f r6 = r6.f7495e     // Catch:{ all -> 0x0026 }
            java.util.Map r6 = r6.a()     // Catch:{ all -> 0x0026 }
            boolean r7 = r6.containsKey(r14)     // Catch:{ all -> 0x0026 }
            r8 = 39
            if (r7 != 0) goto L_0x019f
            java.lang.String r17 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r0.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "doWork() :: Language import was never started for '"
            r0.append(r2)     // Catch:{ all -> 0x0026 }
            r0.append(r14)     // Catch:{ all -> 0x0026 }
            r0.append(r8)     // Catch:{ all -> 0x0026 }
            java.lang.String r18 = r0.toString()     // Catch:{ all -> 0x0026 }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r12
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r0 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.MISSING_WORDS     // Catch:{ all -> 0x0026 }
        L_0x019c:
            r9 = r0
            goto L_0x0368
        L_0x019f:
            java.lang.Object r6 = r6.get(r14)     // Catch:{ all -> 0x0026 }
            kotlin.jvm.internal.o.b(r6)     // Catch:{ all -> 0x0026 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x0026 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0026 }
            h2.k$a r7 = h2.C0672k.f13645b     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r13 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r13 = r13.f9590m     // Catch:{ all -> 0x0026 }
            android.database.sqlite.SQLiteDatabase r13 = r13.getReadableDatabase()     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "getReadableDatabase(...)"
            kotlin.jvm.internal.o.d(r13, r8)     // Catch:{ all -> 0x0026 }
            java.util.List r7 = r7.c(r13)     // Catch:{ all -> 0x0026 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r7 != 0) goto L_0x01ef
            java.lang.String r0 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r2.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "doWork() :: Duplicate words discovered for language '"
            r2.append(r3)     // Catch:{ all -> 0x0026 }
            r2.append(r14)     // Catch:{ all -> 0x0026 }
            r3 = 39
            r2.append(r3)     // Catch:{ all -> 0x0026 }
            java.lang.String r18 = r2.toString()     // Catch:{ all -> 0x0026 }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r12
            r17 = r0
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r0 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.DUPLICATE_WORDS     // Catch:{ all -> 0x0026 }
            goto L_0x019c
        L_0x01ef:
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r7 = r1.this$0     // Catch:{ all -> 0x0026 }
            android.content.Context r7 = r7.a()     // Catch:{ all -> 0x0026 }
            kotlin.jvm.internal.o.d(r7, r0)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.f r6 = r3.b(r7, r14, r6, r11)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r7 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r7 = r7.f9590m     // Catch:{ all -> 0x0026 }
            int r7 = r7.a(r14)     // Catch:{ all -> 0x0026 }
            int r6 = r6.a()     // Catch:{ all -> 0x0026 }
            if (r6 <= r7) goto L_0x0235
            java.lang.String r0 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r2.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "doWork() :: Language import was interrupted for '"
            r2.append(r3)     // Catch:{ all -> 0x0026 }
            r2.append(r14)     // Catch:{ all -> 0x0026 }
            r3 = 39
            r2.append(r3)     // Catch:{ all -> 0x0026 }
            java.lang.String r18 = r2.toString()     // Catch:{ all -> 0x0026 }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r12
            r17 = r0
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r0 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.MISSING_WORDS     // Catch:{ all -> 0x0026 }
            goto L_0x019c
        L_0x0235:
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r6 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r6 = r6.f9590m     // Catch:{ all -> 0x0026 }
            h2.p r6 = r6.f7496f     // Catch:{ all -> 0x0026 }
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = 0
            java.util.Map r6 = r6.z(r14, r8, r7)     // Catch:{ all -> 0x0026 }
            boolean r8 = r6.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r8 == 0) goto L_0x0275
            java.lang.String r6 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r7.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "doWork() :: All deletes present for '"
            r7.append(r8)     // Catch:{ all -> 0x0026 }
            r7.append(r14)     // Catch:{ all -> 0x0026 }
            r8 = 39
            r7.append(r8)     // Catch:{ all -> 0x0026 }
            java.lang.String r18 = r7.toString()     // Catch:{ all -> 0x0026 }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r12
            r17 = r6
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0026 }
            r15.add(r14)     // Catch:{ all -> 0x0026 }
        L_0x0272:
            r6 = r15
            goto L_0x0342
        L_0x0275:
            r8 = 0
        L_0x0276:
            ch.icoaching.typewise.autocorrection.scripts.h r18 = new ch.icoaching.typewise.autocorrection.scripts.h     // Catch:{ all -> 0x0026 }
            java.util.Set r11 = r6.keySet()     // Catch:{ all -> 0x0026 }
            java.util.Iterator r12 = r11.iterator()     // Catch:{ all -> 0x0026 }
            r16 = 4
            r19 = 0
            r20 = 0
            r11 = r18
            r13 = r2
            r7 = r14
            r14 = r20
            r22 = r15
            r15 = r16
            r16 = r19
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0026 }
            java.util.Map r11 = r18.d()     // Catch:{ all -> 0x0026 }
            java.util.Set r11 = r11.keySet()     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r12 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r12 = r12.f9590m     // Catch:{ all -> 0x0026 }
            java.util.Map r11 = r12.y(r11)     // Catch:{ all -> 0x0026 }
            java.util.Map r12 = r18.d()     // Catch:{ all -> 0x0026 }
            kotlin.jvm.internal.o.b(r11)     // Catch:{ all -> 0x0026 }
            java.util.List r11 = e.C0641a.a(r12, r6, r11)     // Catch:{ all -> 0x0026 }
            int r12 = r8 / 5000
            ch.icoaching.wrio.logging.Log r13 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r24 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r14.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r15 = "doWork() :: Inserting "
            r14.append(r15)     // Catch:{ all -> 0x0026 }
            int r15 = r11.size()     // Catch:{ all -> 0x0026 }
            r14.append(r15)     // Catch:{ all -> 0x0026 }
            java.lang.String r15 = " deletes for "
            r14.append(r15)     // Catch:{ all -> 0x0026 }
            int r15 = r6.size()     // Catch:{ all -> 0x0026 }
            r14.append(r15)     // Catch:{ all -> 0x0026 }
            java.lang.String r15 = " words of chunk #"
            r14.append(r15)     // Catch:{ all -> 0x0026 }
            r14.append(r12)     // Catch:{ all -> 0x0026 }
            java.lang.String r25 = r14.toString()     // Catch:{ all -> 0x0026 }
            r27 = 4
            r28 = 0
            r26 = 0
            r23 = r13
            ch.icoaching.wrio.logging.Log.d(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r14 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r14 = r14.f9590m     // Catch:{ all -> 0x0026 }
            boolean r14 = r14.o0(r11)     // Catch:{ all -> 0x0026 }
            if (r14 != 0) goto L_0x0334
            java.lang.String r24 = "DictionaryIntegrityCheckerWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r6.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "doWork() :: Couldn't insert "
            r6.append(r8)     // Catch:{ all -> 0x0026 }
            int r8 = r11.size()     // Catch:{ all -> 0x0026 }
            r6.append(r8)     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = " deletes of chunk #"
            r6.append(r8)     // Catch:{ all -> 0x0026 }
            r6.append(r12)     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = " for language '"
            r6.append(r8)     // Catch:{ all -> 0x0026 }
            r6.append(r7)     // Catch:{ all -> 0x0026 }
            r11 = 39
            r6.append(r11)     // Catch:{ all -> 0x0026 }
            java.lang.String r25 = r6.toString()     // Catch:{ all -> 0x0026 }
            r27 = 4
            r28 = 0
            r26 = 0
            r23 = r13
            ch.icoaching.wrio.logging.Log.f(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.IntegrityCheckStatus r9 = ch.icoaching.wrio.dictionary.IntegrityCheckStatus.MISSING_DELETES     // Catch:{ all -> 0x0026 }
        L_0x0331:
            r6 = r22
            goto L_0x033f
        L_0x0334:
            r11 = 39
            int r6 = r6.size()     // Catch:{ all -> 0x0026 }
            r12 = 5000(0x1388, float:7.006E-42)
            if (r6 >= r12) goto L_0x0348
            goto L_0x0331
        L_0x033f:
            r6.add(r7)     // Catch:{ all -> 0x0026 }
        L_0x0342:
            r15 = r6
            r6 = 3
            r7 = 2
            r8 = 1
            goto L_0x00ff
        L_0x0348:
            r6 = r22
            int r8 = r8 + 5000
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r12 = r1.this$0     // Catch:{ all -> 0x0026 }
            c.b r12 = r12.f9590m     // Catch:{ all -> 0x0026 }
            h2.p r12 = r12.f7496f     // Catch:{ all -> 0x0026 }
            r13 = 5000(0x1388, float:7.006E-42)
            java.util.Map r12 = r12.z(r7, r8, r13)     // Catch:{ all -> 0x0026 }
            r15 = r6
            r14 = r7
            r6 = r12
            r7 = r13
            goto L_0x0276
        L_0x0360:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0368:
            int[] r0 = ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2.a.f9592a     // Catch:{ all -> 0x0026 }
            int r2 = r9.ordinal()     // Catch:{ all -> 0x0026 }
            r0 = r0[r2]     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 == r2) goto L_0x03d0
            r2 = 2
            if (r0 == r2) goto L_0x03b6
            r2 = 3
            if (r0 == r2) goto L_0x03a5
            r2 = 4
            if (r0 != r2) goto L_0x039f
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r7 = "doWork() :: END - SUCCESS - DUPLICATE WORDS"
            r9 = 4
            r10 = 0
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$a r0 = ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker.f9522k     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r2 = r1.this$0     // Catch:{ all -> 0x0026 }
            android.content.Context r2 = r2.a()     // Catch:{ all -> 0x0026 }
            androidx.work.WorkManager r2 = androidx.work.WorkManager.g(r2)     // Catch:{ all -> 0x0026 }
            kotlin.jvm.internal.o.d(r2, r4)     // Catch:{ all -> 0x0026 }
            r0.a(r2)     // Catch:{ all -> 0x0026 }
            androidx.work.l$a r0 = androidx.work.l.a.c()     // Catch:{ all -> 0x0026 }
            goto L_0x03f7
        L_0x039f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0026 }
            r0.<init>()     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x03a5:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r4 = "doWork() :: END - RETRY"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0026 }
            androidx.work.l$a r0 = androidx.work.l.a.b()     // Catch:{ all -> 0x0026 }
            goto L_0x03f7
        L_0x03b6:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r4 = "doWork() :: END - SUCCESS - MISSING WORDS"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r0 = r1.this$0     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.d r0 = r0.f9587j     // Catch:{ all -> 0x0026 }
            r0.c()     // Catch:{ all -> 0x0026 }
            androidx.work.l$a r0 = androidx.work.l.a.c()     // Catch:{ all -> 0x0026 }
            goto L_0x03f7
        L_0x03d0:
            ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "DictionaryIntegrityCheckerWorker"
            java.lang.String r8 = "doWork() :: END - SUCCESS"
            r10 = 4
            r11 = 0
            r9 = 0
            ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r0 = r1.this$0     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.data.h r0 = r0.f9588k     // Catch:{ all -> 0x0026 }
            r2 = 0
            r0.c(r2)     // Catch:{ all -> 0x0026 }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker r0 = r1.this$0     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = r0.a()     // Catch:{ all -> 0x0026 }
            androidx.work.WorkManager r0 = androidx.work.WorkManager.g(r0)     // Catch:{ all -> 0x0026 }
            r0.a(r5)     // Catch:{ all -> 0x0026 }
            androidx.work.l$a r0 = androidx.work.l.a.c()     // Catch:{ all -> 0x0026 }
        L_0x03f7:
            return r0
        L_0x03f8:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "doWork() :: END FAILURE "
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "DictionaryIntegrityCheckerWorker"
            r2.e(r4, r3, r0)
            androidx.work.l$a r0 = androidx.work.l.a.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((DictionaryIntegrityCheckerWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
