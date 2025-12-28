package ch.icoaching.wrio.data.source.local.db.migrations;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker$doWork$2", f = "RestoreMixedCaseWordsWorker.kt", l = {36, 37, 38, 50}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class RestoreMixedCaseWordsWorker$doWork$2 extends SuspendLambda implements p {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ RestoreMixedCaseWordsWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RestoreMixedCaseWordsWorker$doWork$2(RestoreMixedCaseWordsWorker restoreMixedCaseWordsWorker, c<? super RestoreMixedCaseWordsWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = restoreMixedCaseWordsWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RestoreMixedCaseWordsWorker$doWork$2(this.this$0, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0 A[Catch:{ all -> 0x001f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "getApplicationContext(...)"
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r14.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r6) goto L_0x003d
            if (r2 == r5) goto L_0x0033
            if (r2 == r4) goto L_0x002a
            if (r2 != r3) goto L_0x0022
            java.lang.Object r1 = r14.L$0
            ch.icoaching.wrio.dictionary.b r1 = (ch.icoaching.wrio.dictionary.b) r1
            kotlin.f.b(r15)     // Catch:{ all -> 0x001f }
            goto L_0x00d7
        L_0x001f:
            r15 = move-exception
            goto L_0x01fc
        L_0x0022:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002a:
            boolean r2 = r14.Z$1
            boolean r4 = r14.Z$0
            kotlin.f.b(r15)
            goto L_0x00a8
        L_0x0033:
            boolean r2 = r14.Z$0
            java.lang.Object r5 = r14.L$0
            androidx.work.WorkManager r5 = (androidx.work.WorkManager) r5
            kotlin.f.b(r15)
            goto L_0x008c
        L_0x003d:
            java.lang.Object r2 = r14.L$0
            androidx.work.WorkManager r2 = (androidx.work.WorkManager) r2
            kotlin.f.b(r15)
            goto L_0x0073
        L_0x0045:
            kotlin.f.b(r15)
            ch.icoaching.wrio.logging.Log r7 = ch.icoaching.wrio.logging.Log.f10572a
            r11 = 4
            r12 = 0
            java.lang.String r8 = "RestoreMixedCaseWordsWorker"
            java.lang.String r9 = "doWork() :: START"
            r10 = 0
            ch.icoaching.wrio.logging.Log.d(r7, r8, r9, r10, r11, r12)
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r15 = r14.this$0
            android.content.Context r15 = r15.a()
            androidx.work.WorkManager r15 = androidx.work.WorkManager.g(r15)
            java.lang.String r2 = "getInstance(...)"
            kotlin.jvm.internal.o.d(r15, r2)
            r14.L$0 = r15
            r14.label = r6
            java.lang.String r2 = "language_import_unique_work_id"
            java.lang.Object r2 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r15, r2, r14)
            if (r2 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r13 = r2
            r2 = r15
            r15 = r13
        L_0x0073:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r14.L$0 = r2
            r14.Z$0 = r15
            r14.label = r5
            java.lang.String r5 = "dictionary_integrity_checker_worker_unique_id"
            java.lang.Object r5 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, r5, r14)
            if (r5 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r13 = r2
            r2 = r15
            r15 = r5
            r5 = r13
        L_0x008c:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r7 = 0
            r14.L$0 = r7
            r14.Z$0 = r2
            r14.Z$1 = r15
            r14.label = r4
            java.lang.String r4 = "language_restoration_unique_work_id"
            java.lang.Object r4 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r5, r4, r14)
            if (r4 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r13 = r2
            r2 = r15
            r15 = r4
            r4 = r13
        L_0x00a8:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r4 != 0) goto L_0x020a
            if (r2 != 0) goto L_0x020a
            if (r15 == 0) goto L_0x00b6
            goto L_0x020a
        L_0x00b6:
            ch.icoaching.wrio.dictionary.b r15 = new ch.icoaching.wrio.dictionary.b
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r2 = r14.this$0
            ch.icoaching.wrio.data.c r2 = r2.f9544i
            r15.<init>(r2)
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r2 = r14.this$0     // Catch:{ all -> 0x001f }
            O2.a r4 = r2.f9543h     // Catch:{ all -> 0x001f }
            androidx.work.g r4 = r4.d()     // Catch:{ all -> 0x001f }
            r14.L$0 = r15     // Catch:{ all -> 0x001f }
            r14.label = r3     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r2.x(r4, r14)     // Catch:{ all -> 0x001f }
            if (r2 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            r1 = r15
        L_0x00d7:
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r15 = r14.this$0     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.c r15 = r15.f9544i     // Catch:{ all -> 0x001f }
            java.util.List r15 = r15.e()     // Catch:{ all -> 0x001f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            r2.<init>()     // Catch:{ all -> 0x001f }
        L_0x00e6:
            int r3 = r2.size()     // Catch:{ all -> 0x001f }
            int r4 = r15.size()     // Catch:{ all -> 0x001f }
            if (r3 == r4) goto L_0x01eb
            java.util.Iterator r3 = r15.iterator()     // Catch:{ all -> 0x001f }
        L_0x00f4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x001f }
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x001f }
            boolean r5 = r2.contains(r5)     // Catch:{ all -> 0x001f }
            if (r5 != 0) goto L_0x00f4
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r3 = r14.this$0     // Catch:{ all -> 0x001f }
            android.content.Context r3 = r3.a()     // Catch:{ all -> 0x001f }
            kotlin.jvm.internal.o.d(r3, r0)     // Catch:{ all -> 0x001f }
            int r3 = r1.a(r3, r4)     // Catch:{ all -> 0x001f }
            if (r3 != 0) goto L_0x011c
            r2.add(r4)     // Catch:{ all -> 0x001f }
            goto L_0x00e6
        L_0x011c:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            r15.<init>()     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r5 = r14.this$0     // Catch:{ all -> 0x001f }
            android.content.Context r5 = r5.a()     // Catch:{ all -> 0x001f }
            kotlin.jvm.internal.o.d(r5, r0)     // Catch:{ all -> 0x001f }
            r7 = 0
            ch.icoaching.wrio.dictionary.f r3 = r1.b(r5, r4, r7, r3)     // Catch:{ all -> 0x001f }
            int r5 = r3.a()     // Catch:{ all -> 0x001f }
        L_0x0133:
            if (r7 >= r5) goto L_0x01a0
            java.util.List r8 = r3.b(r7)     // Catch:{ all -> 0x001f }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            r9.<init>()     // Catch:{ all -> 0x001f }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x001f }
        L_0x0142:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x001f }
            if (r10 == 0) goto L_0x0168
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x001f }
            r11 = r10
            ch.icoaching.wrio.dictionary.g r11 = (ch.icoaching.wrio.dictionary.g) r11     // Catch:{ all -> 0x001f }
            int r12 = r11.j()     // Catch:{ all -> 0x001f }
            if (r12 >= r6) goto L_0x0164
            java.lang.String r11 = r11.m()     // Catch:{ all -> 0x001f }
            java.lang.String r12 = "getWordMixedCase(...)"
            kotlin.jvm.internal.o.d(r11, r12)     // Catch:{ all -> 0x001f }
            boolean r11 = kotlin.text.o.X(r11)     // Catch:{ all -> 0x001f }
            if (r11 != 0) goto L_0x0142
        L_0x0164:
            r9.add(r10)     // Catch:{ all -> 0x001f }
            goto L_0x0142
        L_0x0168:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x001f }
            r10 = 10
            int r10 = kotlin.collections.C0718m.t(r9, r10)     // Catch:{ all -> 0x001f }
            r8.<init>(r10)     // Catch:{ all -> 0x001f }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x001f }
        L_0x0177:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x001f }
            if (r10 == 0) goto L_0x0194
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.dictionary.g r10 = (ch.icoaching.wrio.dictionary.g) r10     // Catch:{ all -> 0x001f }
            kotlin.Pair r11 = new kotlin.Pair     // Catch:{ all -> 0x001f }
            java.lang.String r12 = r10.l()     // Catch:{ all -> 0x001f }
            java.lang.String r10 = r10.m()     // Catch:{ all -> 0x001f }
            r11.<init>(r12, r10)     // Catch:{ all -> 0x001f }
            r8.add(r11)     // Catch:{ all -> 0x001f }
            goto L_0x0177
        L_0x0194:
            r15.addAll(r8)     // Catch:{ all -> 0x001f }
            int r7 = r7 + 5000
            if (r7 < r5) goto L_0x0133
            r2.add(r4)     // Catch:{ all -> 0x001f }
            r7 = r5
            goto L_0x0133
        L_0x01a0:
            ch.icoaching.wrio.logging.Log r7 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x001f }
            java.lang.String r8 = "RestoreMixedCaseWordsWorker"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "doWork() :: Update "
            r3.append(r5)     // Catch:{ all -> 0x001f }
            int r5 = r15.size()     // Catch:{ all -> 0x001f }
            r3.append(r5)     // Catch:{ all -> 0x001f }
            java.lang.String r5 = " mixed case words for '"
            r3.append(r5)     // Catch:{ all -> 0x001f }
            r3.append(r4)     // Catch:{ all -> 0x001f }
            java.lang.String r5 = "' language."
            r3.append(r5)     // Catch:{ all -> 0x001f }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x001f }
            r11 = 4
            r12 = 0
            r10 = 0
            ch.icoaching.wrio.logging.Log.d(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r3 = r14.this$0     // Catch:{ all -> 0x001f }
            c.b r3 = r3.f9545j     // Catch:{ all -> 0x001f }
            h2.p r3 = r3.f7496f     // Catch:{ all -> 0x001f }
            r3.y(r4, r15)     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker r15 = r14.this$0     // Catch:{ all -> 0x001f }
            ch.icoaching.wrio.data.c r15 = r15.f9544i     // Catch:{ all -> 0x001f }
            java.util.List r15 = r15.e()     // Catch:{ all -> 0x001f }
            goto L_0x00e6
        L_0x01e3:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r15.<init>(r0)     // Catch:{ all -> 0x001f }
            throw r15     // Catch:{ all -> 0x001f }
        L_0x01eb:
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "RestoreMixedCaseWordsWorker"
            java.lang.String r2 = "doWork() :: END - SUCCESS"
            r4 = 4
            r5 = 0
            r3 = 0
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001f }
            androidx.work.l$a r15 = androidx.work.l.a.c()     // Catch:{ all -> 0x001f }
            return r15
        L_0x01fc:
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r1 = "RestoreMixedCaseWordsWorker"
            java.lang.String r2 = "doWork() :: END - FAILURE"
            r0.e(r1, r2, r15)
            androidx.work.l$a r15 = androidx.work.l.a.a()
            return r15
        L_0x020a:
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a
            r4 = 4
            r5 = 0
            java.lang.String r1 = "RestoreMixedCaseWordsWorker"
            java.lang.String r2 = "doWork() :: END - RETRY"
            r3 = 0
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)
            androidx.work.l$a r15 = androidx.work.l.a.b()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((RestoreMixedCaseWordsWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
