package ch.icoaching.wrio.dictionary;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$2", f = "ResetCaseCountersWorker.kt", l = {34, 35, 36, 37, 47}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class ResetCaseCountersWorker$doWork$2 extends SuspendLambda implements p {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    final /* synthetic */ ResetCaseCountersWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResetCaseCountersWorker$doWork$2(ResetCaseCountersWorker resetCaseCountersWorker, c<? super ResetCaseCountersWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = resetCaseCountersWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new ResetCaseCountersWorker$doWork$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017a A[Catch:{ all -> 0x01bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "getApplicationContext(...)"
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r1.label
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L_0x0063
            if (r3 == r8) goto L_0x0059
            if (r3 == r7) goto L_0x004c
            if (r3 == r6) goto L_0x003b
            if (r3 == r5) goto L_0x002c
            if (r3 != r4) goto L_0x0024
            java.lang.Object r2 = r1.L$0
            ch.icoaching.wrio.dictionary.b r2 = (ch.icoaching.wrio.dictionary.b) r2
            kotlin.f.b(r18)
            goto L_0x0114
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002c:
            boolean r3 = r1.Z$2
            boolean r5 = r1.Z$1
            boolean r6 = r1.Z$0
            kotlin.f.b(r18)
            r7 = r6
            r6 = r5
            r5 = r18
            goto L_0x00e3
        L_0x003b:
            boolean r3 = r1.Z$1
            boolean r6 = r1.Z$0
            java.lang.Object r7 = r1.L$0
            androidx.work.WorkManager r7 = (androidx.work.WorkManager) r7
            kotlin.f.b(r18)
            r8 = r7
            r7 = r6
            r6 = r18
            goto L_0x00c4
        L_0x004c:
            boolean r3 = r1.Z$0
            java.lang.Object r7 = r1.L$0
            androidx.work.WorkManager r7 = (androidx.work.WorkManager) r7
            kotlin.f.b(r18)
            r8 = r7
            r7 = r18
            goto L_0x00a8
        L_0x0059:
            java.lang.Object r3 = r1.L$0
            androidx.work.WorkManager r3 = (androidx.work.WorkManager) r3
            kotlin.f.b(r18)
            r8 = r18
            goto L_0x008e
        L_0x0063:
            kotlin.f.b(r18)
            ch.icoaching.wrio.logging.Log r9 = ch.icoaching.wrio.logging.Log.f10572a
            r13 = 4
            r14 = 0
            java.lang.String r10 = "ResetCaseCountersWorker"
            java.lang.String r11 = "doWork() :: START"
            r12 = 0
            ch.icoaching.wrio.logging.Log.d(r9, r10, r11, r12, r13, r14)
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r3 = r1.this$0
            android.content.Context r3 = r3.a()
            androidx.work.WorkManager r3 = androidx.work.WorkManager.g(r3)
            java.lang.String r9 = "getInstance(...)"
            kotlin.jvm.internal.o.d(r3, r9)
            r1.L$0 = r3
            r1.label = r8
            java.lang.String r8 = "language_import_unique_work_id"
            java.lang.Object r8 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r3, r8, r1)
            if (r8 != r2) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1.L$0 = r3
            r1.Z$0 = r8
            r1.label = r7
            java.lang.String r7 = "dictionary_integrity_checker_worker_unique_id"
            java.lang.Object r7 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r3, r7, r1)
            if (r7 != r2) goto L_0x00a3
            return r2
        L_0x00a3:
            r16 = r8
            r8 = r3
            r3 = r16
        L_0x00a8:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.L$0 = r8
            r1.Z$0 = r3
            r1.Z$1 = r7
            r1.label = r6
            java.lang.String r6 = "restore_mixed_case_words"
            java.lang.Object r6 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r8, r6, r1)
            if (r6 != r2) goto L_0x00bf
            return r2
        L_0x00bf:
            r16 = r7
            r7 = r3
            r3 = r16
        L_0x00c4:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r9 = 0
            r1.L$0 = r9
            r1.Z$0 = r7
            r1.Z$1 = r3
            r1.Z$2 = r6
            r1.label = r5
            java.lang.String r5 = "language_restoration_unique_work_id"
            java.lang.Object r5 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r8, r5, r1)
            if (r5 != r2) goto L_0x00de
            return r2
        L_0x00de:
            r16 = r6
            r6 = r3
            r3 = r16
        L_0x00e3:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r7 != 0) goto L_0x027b
            if (r6 != 0) goto L_0x027b
            if (r3 != 0) goto L_0x027b
            if (r5 == 0) goto L_0x00f3
            goto L_0x027b
        L_0x00f3:
            ch.icoaching.wrio.dictionary.b r3 = new ch.icoaching.wrio.dictionary.b
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r5 = r1.this$0
            ch.icoaching.wrio.data.c r5 = r5.f9608i
            r3.<init>(r5)
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r5 = r1.this$0
            O2.a r6 = r5.f9607h
            androidx.work.g r6 = r6.c()
            r1.L$0 = r3
            r1.label = r4
            java.lang.Object r4 = r5.x(r6, r1)
            if (r4 != r2) goto L_0x0113
            return r2
        L_0x0113:
            r2 = r3
        L_0x0114:
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r3 = r1.this$0     // Catch:{ all -> 0x01bd }
            android.content.Context r3 = r3.a()     // Catch:{ all -> 0x01bd }
            kotlin.jvm.internal.o.d(r3, r0)     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r4 = r1.this$0     // Catch:{ all -> 0x01bd }
            K2.a r4 = r4.f9610k     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.dictionary.LanguagesInAssets r3 = ch.icoaching.wrio.dictionary.h.a(r3, r4)     // Catch:{ all -> 0x01bd }
            java.util.List r3 = r3.getLanguages()     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r4 = r1.this$0     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.data.c r4 = r4.f9608i     // Catch:{ all -> 0x01bd }
            java.util.List r4 = r4.e()     // Catch:{ all -> 0x01bd }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01bd }
            r5.<init>()     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.logging.Log r12 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x01bd }
            java.lang.String r7 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r6.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = "doWork() :: languagesInAssets = "
            r6.append(r8)     // Catch:{ all -> 0x01bd }
            r6.append(r3)     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01bd }
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01bd }
            java.lang.String r7 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r6.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = "doWork() :: languagesForCounterReset = "
            r6.append(r8)     // Catch:{ all -> 0x01bd }
            r6.append(r4)     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01bd }
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01bd }
        L_0x0170:
            int r6 = r5.size()     // Catch:{ all -> 0x01bd }
            int r7 = r4.size()     // Catch:{ all -> 0x01bd }
            if (r6 == r7) goto L_0x0268
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x01bd }
        L_0x017e:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x01bd }
            if (r7 == 0) goto L_0x0260
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x01bd }
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01bd }
            boolean r8 = r5.contains(r8)     // Catch:{ all -> 0x01bd }
            if (r8 != 0) goto L_0x017e
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01bd }
            boolean r6 = r3.contains(r7)     // Catch:{ all -> 0x01bd }
            if (r6 != 0) goto L_0x01c0
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x01bd }
            java.lang.String r9 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r6.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r10 = "doWork() :: "
            r6.append(r10)     // Catch:{ all -> 0x01bd }
            r6.append(r7)     // Catch:{ all -> 0x01bd }
            java.lang.String r10 = " is not in assets. Skipping."
            r6.append(r10)     // Catch:{ all -> 0x01bd }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x01bd }
            r12 = 4
            r13 = 0
            r11 = 0
            ch.icoaching.wrio.logging.Log.f(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01bd }
            r5.add(r7)     // Catch:{ all -> 0x01bd }
            goto L_0x0170
        L_0x01bd:
            r0 = move-exception
            goto L_0x026d
        L_0x01c0:
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r6 = r1.this$0     // Catch:{ all -> 0x01bd }
            android.content.Context r6 = r6.a()     // Catch:{ all -> 0x01bd }
            kotlin.jvm.internal.o.d(r6, r0)     // Catch:{ all -> 0x01bd }
            int r6 = r2.a(r6, r7)     // Catch:{ all -> 0x01bd }
            if (r6 != 0) goto L_0x01fe
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x01bd }
            java.lang.String r9 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r4.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r6 = "doWork() :: We don't have a CSV for "
            r4.append(r6)     // Catch:{ all -> 0x01bd }
            r4.append(r7)     // Catch:{ all -> 0x01bd }
            java.lang.String r6 = ". Considering its counters reset."
            r4.append(r6)     // Catch:{ all -> 0x01bd }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x01bd }
            r12 = 4
            r13 = 0
            r11 = 0
            ch.icoaching.wrio.logging.Log.d(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01bd }
            r5.add(r7)     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r4 = r1.this$0     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.data.c r4 = r4.f9608i     // Catch:{ all -> 0x01bd }
            java.util.List r4 = r4.e()     // Catch:{ all -> 0x01bd }
            goto L_0x0170
        L_0x01fe:
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x01bd }
            java.lang.String r9 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r10.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r11 = "Resetting counters for language "
            r10.append(r11)     // Catch:{ all -> 0x01bd }
            r10.append(r7)     // Catch:{ all -> 0x01bd }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01bd }
            r12 = 4
            r13 = 0
            r11 = 0
            ch.icoaching.wrio.logging.Log.d(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01bd }
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r8 = r1.this$0     // Catch:{ all -> 0x01bd }
            android.content.Context r8 = r8.a()     // Catch:{ all -> 0x01bd }
            kotlin.jvm.internal.o.d(r8, r0)     // Catch:{ all -> 0x01bd }
            r9 = 0
            ch.icoaching.wrio.dictionary.f r6 = r2.b(r8, r7, r9, r6)     // Catch:{ all -> 0x01bd }
            int r8 = r6.a()     // Catch:{ all -> 0x01bd }
        L_0x022b:
            if (r9 >= r8) goto L_0x0170
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker r10 = r1.this$0     // Catch:{ all -> 0x01bd }
            c.b r10 = r10.f9609j     // Catch:{ all -> 0x01bd }
            h2.p r10 = r10.f7496f     // Catch:{ all -> 0x01bd }
            java.util.List r11 = r6.b(r9)     // Catch:{ all -> 0x01bd }
            r10.u(r7, r11)     // Catch:{ all -> 0x01bd }
            int r9 = r9 + 5000
            if (r9 < r8) goto L_0x022b
            ch.icoaching.wrio.logging.Log r10 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x01bd }
            java.lang.String r11 = "ResetCaseCountersWorker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bd }
            r6.<init>()     // Catch:{ all -> 0x01bd }
            java.lang.String r8 = "doWork() :: case counters reset for language "
            r6.append(r8)     // Catch:{ all -> 0x01bd }
            r6.append(r7)     // Catch:{ all -> 0x01bd }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x01bd }
            r14 = 4
            r15 = 0
            r13 = 0
            ch.icoaching.wrio.logging.Log.d(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01bd }
            r5.add(r7)     // Catch:{ all -> 0x01bd }
            goto L_0x0170
        L_0x0260:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x01bd }
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch:{ all -> 0x01bd }
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x0268:
            androidx.work.l$a r0 = androidx.work.l.a.c()
            return r0
        L_0x026d:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r3 = "ResetCaseCountersWorker"
            java.lang.String r4 = "doWork() :: END - FAILURE"
            r2.e(r3, r4, r0)
            androidx.work.l$a r0 = androidx.work.l.a.a()
            return r0
        L_0x027b:
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            r6 = 4
            r7 = 0
            java.lang.String r3 = "ResetCaseCountersWorker"
            java.lang.String r4 = "doWork() :: end - retry - other workers are working on the dictionary"
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            androidx.work.l$a r0 = androidx.work.l.a.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((ResetCaseCountersWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
