package ch.icoaching.wrio.dictionary;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$2", f = "WriteWordsWorker.kt", l = {51, 72, 146}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class WriteWordsWorker$doWork$2 extends SuspendLambda implements p {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    final /* synthetic */ WriteWordsWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WriteWordsWorker$doWork$2(WriteWordsWorker writeWordsWorker, c<? super WriteWordsWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = writeWordsWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new WriteWordsWorker$doWork$2(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01fa, code lost:
        r15 = (java.lang.String) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0200, code lost:
        if (r11.contains(r15) != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0206, code lost:
        if (r10.contains(r15) != false) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0208, code lost:
        r16 = ch.icoaching.wrio.logging.Log.f10572a;
        ch.icoaching.wrio.logging.Log.f(r16, "WriteWordsWorker", r3 + r15 + " is NOT in assets NOR it is downloaded. Skipping.", (java.lang.Throwable) null, 4, (java.lang.Object) null);
        r2.add(r15);
        r18 = r9;
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0232, code lost:
        r6 = kotlin.jvm.internal.o.a(r1.this$0.f9619n.b(), r15);
        r14 = r1.this$0.a();
        kotlin.jvm.internal.o.d(r14, r7);
        r14 = r12.a(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x024d, code lost:
        if (r14 != 0) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x024f, code lost:
        r16 = ch.icoaching.wrio.logging.Log.f10572a;
        ch.icoaching.wrio.logging.Log.d(r16, "WriteWordsWorker", "doWork() :: We don't have a CSV for " + r15 + " v" + r14 + ", we'll consider it imported.", (java.lang.Throwable) null, 4, (java.lang.Object) null);
        r8.add(r15);
        r9 = r1.this$0.f9619n.e();
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x028b, code lost:
        r16 = r6;
        r6 = r1.this$0.f9620o.f7495e.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x029d, code lost:
        if (r6.containsKey(r15) == false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x029f, code lost:
        r6 = r6.get(r15);
        kotlin.jvm.internal.o.b(r6);
        r6 = ((java.lang.Number) r6).intValue();
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02af, code lost:
        r18 = r9;
        r17 = r10;
        r6 = (int) r1.this$0.f9620o.f7495e.h(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02c0, code lost:
        if (r6 >= 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x02c2, code lost:
        r5.add(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x02c5, code lost:
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02c8, code lost:
        r9 = r1.this$0.a();
        kotlin.jvm.internal.o.d(r9, r7);
        r9 = r12.b(r9, r15, r6, r14);
        r10 = r1.this$0.f9620o.a(r15);
        r18 = r6;
        r6 = r9.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x02e5, code lost:
        if (r10 < r6) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02e7, code lost:
        ch.icoaching.wrio.logging.Log.d(ch.icoaching.wrio.logging.Log.f10572a, "WriteWordsWorker", "doWork() :: Language is already imported.", (java.lang.Throwable) null, 4, (java.lang.Object) null);
        r6 = r1.this$0.f9619n.e();
        r8.add(r15);
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0304, code lost:
        r6 = r32;
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x030a, code lost:
        if (r10 <= 0) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x030c, code lost:
        r9 = r1.this$0.f9619n.e();
        r8.add(r15);
        r1.this$0.f9617l.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0323, code lost:
        r19 = r6;
        r20 = r7;
        r1.this$0.f9618m.c(true);
        r6 = ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker.f9584o;
        r7 = androidx.work.WorkManager.g(r1.this$0.a());
        kotlin.jvm.internal.o.d(r7, r4);
        r6.a(r7);
        r7 = r32;
        r21 = r0;
        r6 = r2;
        r0 = r15;
        r15 = r16;
        r2 = r19;
        r19 = r3;
        r16 = r4;
        r3 = r9;
        r4 = r13;
        r13 = r18;
        r9 = r5;
        r5 = r17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0561 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0504 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01d5 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x035a A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0364 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x03a1 A[Catch:{ all -> 0x006e, all -> 0x05c1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x03a2 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x03fe A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0422 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x042e A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0432 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x04bb A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0506 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0516 A[Catch:{ all -> 0x006e, all -> 0x05c1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r1.label
            java.lang.String r3 = "doWork() :: "
            java.lang.String r4 = "getInstance(...)"
            r5 = 3
            r6 = 2
            java.lang.String r7 = "getApplicationContext(...)"
            r9 = 1
            if (r2 == 0) goto L_0x00a7
            if (r2 == r9) goto L_0x00a1
            if (r2 == r6) goto L_0x0079
            if (r2 != r5) goto L_0x0071
            int r2 = r1.I$4
            int r6 = r1.I$3
            int r10 = r1.I$2
            int r11 = r1.I$1
            boolean r12 = r1.Z$0
            int r13 = r1.I$0
            java.lang.Object r14 = r1.L$8
            ch.icoaching.wrio.dictionary.f r14 = (ch.icoaching.wrio.dictionary.f) r14
            java.lang.Object r15 = r1.L$7
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r8 = r1.L$6
            ch.icoaching.typewise.config.CompanyConfig$b r8 = (ch.icoaching.typewise.config.CompanyConfig.b) r8
            java.lang.Object r5 = r1.L$5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r1.L$4
            java.util.List r9 = (java.util.List) r9
            r16 = r2
            java.lang.Object r2 = r1.L$3
            java.util.List r2 = (java.util.List) r2
            r17 = r2
            java.lang.Object r2 = r1.L$2
            java.util.List r2 = (java.util.List) r2
            r18 = r2
            java.lang.Object r2 = r1.L$1
            java.util.List r2 = (java.util.List) r2
            r19 = r2
            java.lang.Object r2 = r1.L$0
            ch.icoaching.wrio.dictionary.b r2 = (ch.icoaching.wrio.dictionary.b) r2
            kotlin.f.b(r32)     // Catch:{ all -> 0x006e }
            r20 = r7
            r7 = r8
            r8 = r17
            r17 = r16
            r16 = r4
            r29 = r2
            r2 = r0
            r0 = r15
            r15 = r12
            r12 = r29
            r30 = r19
            r19 = r3
            r3 = r14
            r14 = r11
            r11 = r30
            goto L_0x03aa
        L_0x006e:
            r0 = move-exception
            goto L_0x059f
        L_0x0071:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0079:
            java.lang.Object r2 = r1.L$6
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r1.L$5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.L$4
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r1.L$3
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r1.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.L$0
            ch.icoaching.wrio.dictionary.b r11 = (ch.icoaching.wrio.dictionary.b) r11
            kotlin.f.b(r32)     // Catch:{ all -> 0x006e }
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r32
            goto L_0x01b2
        L_0x00a1:
            kotlin.f.b(r32)
            r2 = r32
            goto L_0x00d2
        L_0x00a7:
            kotlin.f.b(r32)
            ch.icoaching.wrio.logging.Log r16 = ch.icoaching.wrio.logging.Log.f10572a
            r20 = 4
            r21 = 0
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.String r18 = "doWork() :: START"
            r19 = 0
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0
            android.content.Context r2 = r2.a()
            androidx.work.WorkManager r2 = androidx.work.WorkManager.g(r2)
            kotlin.jvm.internal.o.d(r2, r4)
            r5 = 1
            r1.label = r5
            java.lang.String r5 = "dictionary_integrity_checker_worker_unique_id"
            java.lang.Object r2 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, r5, r1)
            if (r2 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00eb
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a
            r12 = 4
            r13 = 0
            java.lang.String r9 = "WriteWordsWorker"
            java.lang.String r10 = "doWork() :: END - RETRY - INTEGRITY CHECK IN PROGRESS"
            r11 = 0
            ch.icoaching.wrio.logging.Log.d(r8, r9, r10, r11, r12, r13)
            androidx.work.l$a r0 = androidx.work.l.a.b()
            return r0
        L_0x00eb:
            ch.icoaching.wrio.dictionary.b r11 = new ch.icoaching.wrio.dictionary.b
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0
            ch.icoaching.wrio.data.c r2 = r2.f9619n
            r11.<init>(r2)
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0     // Catch:{ all -> 0x006e }
            android.content.Context r2 = r2.a()     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.d(r2, r7)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r5 = r1.this$0     // Catch:{ all -> 0x006e }
            K2.a r5 = r5.f9621p     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.LanguagesInAssets r2 = ch.icoaching.wrio.dictionary.h.a(r2, r5)     // Catch:{ all -> 0x006e }
            java.util.List r10 = r2.getLanguages()     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r2 = r2.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r9 = r2.g()     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r2 = r2.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r8 = r2.e()     // Catch:{ all -> 0x006e }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x006e }
            r2.<init>()     // Catch:{ all -> 0x006e }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x006e }
            r12.<init>()     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.logging.Log r13 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r14.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r15 = "doWork() :: languagesInAssets = "
            r14.append(r15)     // Catch:{ all -> 0x006e }
            r14.append(r10)     // Catch:{ all -> 0x006e }
            java.lang.String r18 = r14.toString()     // Catch:{ all -> 0x006e }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r13
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x006e }
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r14.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r15 = "doWork() :: downloadedLanguages = "
            r14.append(r15)     // Catch:{ all -> 0x006e }
            r14.append(r9)     // Catch:{ all -> 0x006e }
            java.lang.String r18 = r14.toString()     // Catch:{ all -> 0x006e }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r13
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x006e }
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r14.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r15 = "doWork() :: languagesForImport = "
            r14.append(r15)     // Catch:{ all -> 0x006e }
            r14.append(r8)     // Catch:{ all -> 0x006e }
            java.lang.String r18 = r14.toString()     // Catch:{ all -> 0x006e }
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r13
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r13 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.typewise.AILibrarySingletonProvider r13 = r13.f9623r     // Catch:{ all -> 0x006e }
            r1.L$0 = r11     // Catch:{ all -> 0x006e }
            r1.L$1 = r10     // Catch:{ all -> 0x006e }
            r1.L$2 = r9     // Catch:{ all -> 0x006e }
            r1.L$3 = r8     // Catch:{ all -> 0x006e }
            r1.L$4 = r2     // Catch:{ all -> 0x006e }
            r1.L$5 = r5     // Catch:{ all -> 0x006e }
            r1.L$6 = r12     // Catch:{ all -> 0x006e }
            r1.label = r6     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r13.b(r1)     // Catch:{ all -> 0x006e }
            if (r6 != r0) goto L_0x01a9
            return r0
        L_0x01a9:
            r29 = r8
            r8 = r2
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r29
        L_0x01b2:
            ch.icoaching.typewise.AILibrary r6 = (ch.icoaching.typewise.AILibrary) r6     // Catch:{ all -> 0x006e }
            ch.icoaching.typewise.file_handling.ConfigHolder r6 = r6.b()     // Catch:{ all -> 0x006e }
            ch.icoaching.typewise.config.CompanyConfig r6 = r6.c()     // Catch:{ all -> 0x006e }
            ch.icoaching.typewise.config.CompanyConfig$b r6 = r6.e()     // Catch:{ all -> 0x006e }
            r13 = 0
        L_0x01c1:
            int r14 = r8.size()     // Catch:{ all -> 0x006e }
            int r15 = r5.size()     // Catch:{ all -> 0x006e }
            int r14 = r14 + r15
            int r15 = r2.size()     // Catch:{ all -> 0x006e }
            int r14 = r14 + r15
            int r15 = r9.size()     // Catch:{ all -> 0x006e }
            if (r14 == r15) goto L_0x0504
            java.util.Iterator r14 = r9.iterator()     // Catch:{ all -> 0x006e }
        L_0x01d9:
            boolean r15 = r14.hasNext()     // Catch:{ all -> 0x006e }
            if (r15 == 0) goto L_0x04fc
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x006e }
            r32 = r6
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x006e }
            boolean r16 = r8.contains(r6)     // Catch:{ all -> 0x006e }
            if (r16 != 0) goto L_0x04f8
            boolean r16 = r5.contains(r6)     // Catch:{ all -> 0x006e }
            if (r16 != 0) goto L_0x04f8
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x006e }
            if (r6 != 0) goto L_0x04f8
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x006e }
            boolean r6 = r11.contains(r15)     // Catch:{ all -> 0x006e }
            if (r6 != 0) goto L_0x0232
            boolean r6 = r10.contains(r15)     // Catch:{ all -> 0x006e }
            if (r6 != 0) goto L_0x0232
            ch.icoaching.wrio.logging.Log r16 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r6.<init>()     // Catch:{ all -> 0x006e }
            r6.append(r3)     // Catch:{ all -> 0x006e }
            r6.append(r15)     // Catch:{ all -> 0x006e }
            java.lang.String r14 = " is NOT in assets NOR it is downloaded. Skipping."
            r6.append(r14)     // Catch:{ all -> 0x006e }
            java.lang.String r18 = r6.toString()     // Catch:{ all -> 0x006e }
            r20 = 4
            r21 = 0
            r19 = 0
            ch.icoaching.wrio.logging.Log.f(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x006e }
            r2.add(r15)     // Catch:{ all -> 0x006e }
            r18 = r9
            r17 = r10
            goto L_0x02c5
        L_0x0232:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r6 = r6.f9619n     // Catch:{ all -> 0x006e }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x006e }
            boolean r6 = kotlin.jvm.internal.o.a(r6, r15)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r14 = r1.this$0     // Catch:{ all -> 0x006e }
            android.content.Context r14 = r14.a()     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.d(r14, r7)     // Catch:{ all -> 0x006e }
            int r14 = r12.a(r14, r15)     // Catch:{ all -> 0x006e }
            if (r14 != 0) goto L_0x028b
            ch.icoaching.wrio.logging.Log r16 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r17 = "WriteWordsWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r6.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r9 = "doWork() :: We don't have a CSV for "
            r6.append(r9)     // Catch:{ all -> 0x006e }
            r6.append(r15)     // Catch:{ all -> 0x006e }
            java.lang.String r9 = " v"
            r6.append(r9)     // Catch:{ all -> 0x006e }
            r6.append(r14)     // Catch:{ all -> 0x006e }
            java.lang.String r9 = ", we'll consider it imported."
            r6.append(r9)     // Catch:{ all -> 0x006e }
            java.lang.String r18 = r6.toString()     // Catch:{ all -> 0x006e }
            r20 = 4
            r21 = 0
            r19 = 0
            ch.icoaching.wrio.logging.Log.d(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x006e }
            r8.add(r15)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r6 = r6.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r9 = r6.e()     // Catch:{ all -> 0x006e }
            r6 = r32
            goto L_0x01c1
        L_0x028b:
            r16 = r6
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r6 = r6.f9620o     // Catch:{ all -> 0x006e }
            h2.f r6 = r6.f7495e     // Catch:{ all -> 0x006e }
            java.util.Map r6 = r6.a()     // Catch:{ all -> 0x006e }
            boolean r17 = r6.containsKey(r15)     // Catch:{ all -> 0x006e }
            if (r17 == 0) goto L_0x02af
            java.lang.Object r6 = r6.get(r15)     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.b(r6)     // Catch:{ all -> 0x006e }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x006e }
            int r6 = r6.intValue()     // Catch:{ all -> 0x006e }
            r17 = r10
            goto L_0x02c8
        L_0x02af:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r6 = r6.f9620o     // Catch:{ all -> 0x006e }
            h2.f r6 = r6.f7495e     // Catch:{ all -> 0x006e }
            r18 = r9
            r17 = r10
            long r9 = r6.h(r15)     // Catch:{ all -> 0x006e }
            int r6 = (int) r9     // Catch:{ all -> 0x006e }
            if (r6 >= 0) goto L_0x02c8
            r5.add(r15)     // Catch:{ all -> 0x006e }
        L_0x02c5:
            r9 = r18
            goto L_0x0304
        L_0x02c8:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r9 = r1.this$0     // Catch:{ all -> 0x006e }
            android.content.Context r9 = r9.a()     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.d(r9, r7)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.f r9 = r12.b(r9, r15, r6, r14)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r10 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r10 = r10.f9620o     // Catch:{ all -> 0x006e }
            int r10 = r10.a(r15)     // Catch:{ all -> 0x006e }
            r18 = r6
            int r6 = r9.a()     // Catch:{ all -> 0x006e }
            if (r10 < r6) goto L_0x030a
            ch.icoaching.wrio.logging.Log r19 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r20 = "WriteWordsWorker"
            java.lang.String r21 = "doWork() :: Language is already imported."
            r23 = 4
            r24 = 0
            r22 = 0
            ch.icoaching.wrio.logging.Log.d(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r6 = r6.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r6 = r6.e()     // Catch:{ all -> 0x006e }
            r8.add(r15)     // Catch:{ all -> 0x006e }
            r9 = r6
        L_0x0304:
            r6 = r32
            r10 = r17
            goto L_0x01c1
        L_0x030a:
            if (r10 <= 0) goto L_0x0323
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r6 = r6.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r9 = r6.e()     // Catch:{ all -> 0x006e }
            r8.add(r15)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.d r6 = r6.f9617l     // Catch:{ all -> 0x006e }
            r6.c()     // Catch:{ all -> 0x006e }
            goto L_0x0304
        L_0x0323:
            r19 = r6
            ch.icoaching.wrio.dictionary.WriteWordsWorker r6 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.h r6 = r6.f9618m     // Catch:{ all -> 0x006e }
            r20 = r7
            r7 = 1
            r6.c(r7)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker$a r6 = ch.icoaching.wrio.dictionary.DictionaryIntegrityCheckerWorker.f9584o     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r7 = r1.this$0     // Catch:{ all -> 0x006e }
            android.content.Context r7 = r7.a()     // Catch:{ all -> 0x006e }
            androidx.work.WorkManager r7 = androidx.work.WorkManager.g(r7)     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.d(r7, r4)     // Catch:{ all -> 0x006e }
            r6.a(r7)     // Catch:{ all -> 0x006e }
            r7 = r32
            r21 = r0
            r6 = r2
            r0 = r15
            r15 = r16
            r2 = r19
            r19 = r3
            r16 = r4
            r3 = r9
            r4 = r13
            r13 = r18
            r9 = r5
            r5 = r17
        L_0x0358:
            if (r10 > r2) goto L_0x04bb
            r17 = r2
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0     // Catch:{ all -> 0x006e }
            boolean r2 = r2.f9624s     // Catch:{ all -> 0x006e }
            if (r2 != 0) goto L_0x03fe
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0     // Catch:{ all -> 0x006e }
            O2.a r18 = r2.f9616k     // Catch:{ all -> 0x006e }
            r22 = r2
            androidx.work.g r2 = r18.f()     // Catch:{ all -> 0x006e }
            r1.L$0 = r12     // Catch:{ all -> 0x006e }
            r1.L$1 = r11     // Catch:{ all -> 0x006e }
            r1.L$2 = r5     // Catch:{ all -> 0x006e }
            r1.L$3 = r8     // Catch:{ all -> 0x006e }
            r1.L$4 = r9     // Catch:{ all -> 0x006e }
            r1.L$5 = r6     // Catch:{ all -> 0x006e }
            r1.L$6 = r7     // Catch:{ all -> 0x006e }
            r1.L$7 = r0     // Catch:{ all -> 0x006e }
            r1.L$8 = r3     // Catch:{ all -> 0x006e }
            r1.I$0 = r4     // Catch:{ all -> 0x006e }
            r1.Z$0 = r15     // Catch:{ all -> 0x006e }
            r1.I$1 = r14     // Catch:{ all -> 0x006e }
            r1.I$2 = r13     // Catch:{ all -> 0x006e }
            r1.I$3 = r10     // Catch:{ all -> 0x006e }
            r18 = r0
            r0 = r17
            r1.I$4 = r0     // Catch:{ all -> 0x006e }
            r17 = r0
            r0 = 3
            r1.label = r0     // Catch:{ all -> 0x006e }
            r0 = r22
            java.lang.Object r0 = r0.x(r2, r1)     // Catch:{ all -> 0x006e }
            r2 = r21
            if (r0 != r2) goto L_0x03a2
            return r2
        L_0x03a2:
            r0 = r18
            r18 = r5
            r5 = r6
            r6 = r10
            r10 = r13
            r13 = r4
        L_0x03aa:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r4 = r1.this$0     // Catch:{ all -> 0x006e }
            i2.a r4 = r4.f9614i     // Catch:{ all -> 0x006e }
            r21 = r2
            r2 = 1
            r4.T(r2)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r4 = r1.this$0     // Catch:{ all -> 0x006e }
            r4.f9624s = r2     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.logging.Log r22 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r23 = "WriteWordsWorker"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r2.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "doWork() :: Show the progress indicator while importing "
            r2.append(r4)     // Catch:{ all -> 0x006e }
            int r4 = r17 - r6
            r2.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = " words of '"
            r2.append(r4)     // Catch:{ all -> 0x006e }
            r2.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "' language."
            r2.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r24 = r2.toString()     // Catch:{ all -> 0x006e }
            r26 = 4
            r27 = 0
            r25 = 0
            ch.icoaching.wrio.logging.Log.d(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x006e }
            r4 = r13
            r22 = r15
            r2 = r17
            r13 = r7
            r15 = r9
            r17 = r11
            r11 = r14
            r14 = r8
            r29 = r6
            r6 = r5
            r5 = r18
            r18 = r12
            r12 = r10
            r10 = r29
            goto L_0x040d
        L_0x03fe:
            r18 = r0
            r22 = r15
            r2 = r17
            r15 = r9
            r17 = r11
            r18 = r12
            r12 = r13
            r11 = r14
            r13 = r7
            r14 = r8
        L_0x040d:
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r10 < r7) goto L_0x042c
            r7 = 15000(0x3a98, float:2.102E-41)
            if (r10 >= r7) goto L_0x042c
            ch.icoaching.wrio.dictionary.WriteWordsWorker r7 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r7 = r7.f9620o     // Catch:{ all -> 0x006e }
            h2.f r7 = r7.f7495e     // Catch:{ all -> 0x006e }
            r7.g(r0, r11)     // Catch:{ all -> 0x006e }
            if (r22 == 0) goto L_0x042c
            ch.icoaching.wrio.dictionary.WriteWordsWorker r7 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.a r7 = r7.f9615j     // Catch:{ all -> 0x006e }
            r8 = 1
            r7.b(r8)     // Catch:{ all -> 0x006e }
        L_0x042c:
            if (r10 < r2) goto L_0x0432
            r14.add(r0)     // Catch:{ all -> 0x006e }
            goto L_0x0492
        L_0x0432:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r7 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r7 = r7.f9620o     // Catch:{ all -> 0x006e }
            h2.p r7 = r7.f7496f     // Catch:{ all -> 0x006e }
            java.util.List r8 = r3.b(r10)     // Catch:{ all -> 0x006e }
            java.util.Map r10 = r7.B(r8, r12)     // Catch:{ all -> 0x006e }
            ch.icoaching.typewise.autocorrection.scripts.h r23 = new ch.icoaching.typewise.autocorrection.scripts.h     // Catch:{ all -> 0x006e }
            java.util.Set r7 = r10.keySet()     // Catch:{ all -> 0x006e }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x006e }
            r24 = 4
            r25 = 0
            r26 = 0
            r7 = r23
            r9 = r13
            r28 = r10
            r10 = r26
            r26 = r11
            r11 = r24
            r24 = r12
            r12 = r25
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x006e }
            java.util.Map r7 = r23.d()     // Catch:{ all -> 0x006e }
            java.util.Set r7 = r7.keySet()     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r8 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r8 = r8.f9620o     // Catch:{ all -> 0x006e }
            java.util.Map r7 = r8.y(r7)     // Catch:{ all -> 0x006e }
            java.util.Map r8 = r23.d()     // Catch:{ all -> 0x006e }
            kotlin.jvm.internal.o.b(r7)     // Catch:{ all -> 0x006e }
            r9 = r28
            java.util.List r7 = e.C0641a.a(r8, r9, r7)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r8 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r8 = r8.f9620o     // Catch:{ all -> 0x006e }
            boolean r7 = r8.o0(r7)     // Catch:{ all -> 0x006e }
            if (r7 != 0) goto L_0x049d
            r15.add(r0)     // Catch:{ all -> 0x006e }
        L_0x0492:
            r10 = r5
            r2 = r6
            r6 = r13
            r8 = r14
            r5 = r15
            r11 = r17
            r12 = r18
            r13 = r4
            goto L_0x04c2
        L_0x049d:
            ch.icoaching.wrio.dictionary.WriteWordsWorker r7 = r1.this$0     // Catch:{ all -> 0x006e }
            c.b r7 = r7.f9620o     // Catch:{ all -> 0x006e }
            int r10 = r7.a(r0)     // Catch:{ all -> 0x006e }
            int r7 = r9.size()     // Catch:{ all -> 0x006e }
            int r4 = r4 + r7
            r7 = r13
            r8 = r14
            r9 = r15
            r11 = r17
            r12 = r18
            r15 = r22
            r13 = r24
            r14 = r26
            goto L_0x0358
        L_0x04bb:
            r18 = r0
            r13 = r4
            r10 = r5
            r2 = r6
            r6 = r7
            r5 = r9
        L_0x04c2:
            ch.icoaching.wrio.logging.Log r22 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r23 = "WriteWordsWorker"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r3.<init>()     // Catch:{ all -> 0x006e }
            r4 = r19
            r3.append(r4)     // Catch:{ all -> 0x006e }
            r3.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = " imported."
            r3.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r24 = r3.toString()     // Catch:{ all -> 0x006e }
            r26 = 4
            r27 = 0
            r25 = 0
            ch.icoaching.wrio.logging.Log.d(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.dictionary.WriteWordsWorker r0 = r1.this$0     // Catch:{ all -> 0x006e }
            ch.icoaching.wrio.data.c r0 = r0.f9619n     // Catch:{ all -> 0x006e }
            java.util.List r9 = r0.e()     // Catch:{ all -> 0x006e }
            r3 = r4
            r4 = r16
            r7 = r20
            r0 = r21
            goto L_0x01c1
        L_0x04f8:
            r6 = r32
            goto L_0x01d9
        L_0x04fc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0504:
            if (r13 <= 0) goto L_0x0510
            ch.icoaching.wrio.dictionary.WriteWordsWorker r0 = r1.this$0     // Catch:{ all -> 0x006e }
            c2.c r0 = r0.f9613h     // Catch:{ all -> 0x006e }
            r3 = 1
            r0.c(r3)     // Catch:{ all -> 0x006e }
        L_0x0510:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0561
            int r0 = r2.size()     // Catch:{ all -> 0x006e }
            r3 = 1
            if (r0 != r3) goto L_0x053b
            r3 = 0
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "ga"
            boolean r0 = kotlin.jvm.internal.o.a(r0, r3)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x053b
            ch.icoaching.wrio.logging.Log r3 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r4 = "WriteWordsWorker"
            java.lang.String r5 = "doWork() :: END - SUCCESS without Irish language"
            r7 = 4
            r8 = 0
            r6 = 0
            ch.icoaching.wrio.logging.Log.d(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006e }
            androidx.work.l$a r0 = androidx.work.l.a.c()     // Catch:{ all -> 0x006e }
            goto L_0x0588
        L_0x053b:
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r4.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r5 = "doWork() :: END - FAILURE - "
            r4.append(r5)     // Catch:{ all -> 0x006e }
            r4.append(r2)     // Catch:{ all -> 0x006e }
            java.lang.String r2 = " NOT IN ASSETS NOR DOWNLOADED"
            r4.append(r2)     // Catch:{ all -> 0x006e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006e }
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r0
            ch.icoaching.wrio.logging.Log.f(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            androidx.work.l$a r0 = androidx.work.l.a.a()     // Catch:{ all -> 0x006e }
            goto L_0x0588
        L_0x0561:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0578
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: END - RETRY"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            androidx.work.l$a r0 = androidx.work.l.a.b()     // Catch:{ all -> 0x006e }
            goto L_0x0588
        L_0x0578:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x006e }
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: END - SUCCESS"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            androidx.work.l$a r0 = androidx.work.l.a.c()     // Catch:{ all -> 0x006e }
        L_0x0588:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            r6 = 4
            r7 = 0
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: Hide the progress indicator."
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0
            i2.a r2 = r2.f9614i
            r3 = 0
            r2.T(r3)
            return r0
        L_0x059f:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x05c1 }
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: END - FAILURE"
            r2.e(r3, r4, r0)     // Catch:{ all -> 0x05c1 }
            androidx.work.l$a r0 = androidx.work.l.a.a()     // Catch:{ all -> 0x05c1 }
            r6 = 4
            r7 = 0
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: Hide the progress indicator."
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0
            i2.a r2 = r2.f9614i
            r3 = 0
            r2.T(r3)
            return r0
        L_0x05c1:
            r0 = move-exception
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            r6 = 4
            r7 = 0
            java.lang.String r3 = "WriteWordsWorker"
            java.lang.String r4 = "doWork() :: Hide the progress indicator."
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            ch.icoaching.wrio.dictionary.WriteWordsWorker r2 = r1.this$0
            i2.a r2 = r2.f9614i
            r3 = 0
            r2.T(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.WriteWordsWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((WriteWordsWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
