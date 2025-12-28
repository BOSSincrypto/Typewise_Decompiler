package ch.icoaching.wrio.data.source.local.db.migrations;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$2", f = "DuplicateWordsRemoverWorker.kt", l = {43, 44, 45, 46, 47, 54}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class DuplicateWordsRemoverWorker$doWork$2 extends SuspendLambda implements p {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    int label;
    final /* synthetic */ DuplicateWordsRemoverWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DuplicateWordsRemoverWorker$doWork$2(DuplicateWordsRemoverWorker duplicateWordsRemoverWorker, c<? super DuplicateWordsRemoverWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = duplicateWordsRemoverWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DuplicateWordsRemoverWorker$doWork$2(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        r10 = ((java.lang.Boolean) r10).booleanValue();
        r9.L$0 = r2;
        r9.Z$0 = r10;
        r9.label = 2;
        r1 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, "dictionary_integrity_checker_worker_unique_id", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0098, code lost:
        if (r1 != r0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
        r8 = r1;
        r1 = r10;
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009e, code lost:
        r10 = ((java.lang.Boolean) r10).booleanValue();
        r9.L$0 = r2;
        r9.Z$0 = r1;
        r9.Z$1 = r10;
        r9.label = 3;
        r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, "language_restoration_unique_work_id", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
        if (r3 != r0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r4 = r2;
        r2 = r1;
        r1 = r10;
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ba, code lost:
        r10 = ((java.lang.Boolean) r10).booleanValue();
        r9.L$0 = r4;
        r9.Z$0 = r2;
        r9.Z$1 = r1;
        r9.Z$2 = r10;
        r9.label = 4;
        r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r4, "reset_counters_unique_work_id", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r3 != r0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d4, code lost:
        r8 = r2;
        r2 = r10;
        r10 = r3;
        r3 = r1;
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d9, code lost:
        r10 = ((java.lang.Boolean) r10).booleanValue();
        r9.L$0 = null;
        r9.Z$0 = r1;
        r9.Z$1 = r3;
        r9.Z$2 = r2;
        r9.Z$3 = r10;
        r9.label = 5;
        r4 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r4, "restore_mixed_case_words", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f3, code lost:
        if (r4 != r0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f6, code lost:
        r8 = r1;
        r1 = r10;
        r10 = r4;
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        r10 = ((java.lang.Boolean) r10).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0100, code lost:
        if (r4 != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0102, code lost:
        if (r3 != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r2 != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        if (r1 != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r10 == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010b, code lost:
        r10 = r9.this$0;
        r1 = r10.f9523h.e();
        r9.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        if (r10.x(r1, r9) != r0) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        r10 = r9.this$0.f9524i.f7503m;
        kotlin.jvm.internal.o.d(r10, "databaseLock");
        r0 = r9.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012e, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1 = h2.C0672k.f13645b;
        r2 = r0.f9524i.getReadableDatabase();
        kotlin.jvm.internal.o.d(r2, "getReadableDatabase(...)");
        r2 = r1.c(r2);
        r0 = r0.f9524i.getWritableDatabase();
        kotlin.jvm.internal.o.d(r0, "getWritableDatabase(...)");
        r1.h(r2, r0);
        r0 = l2.q.f14567a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0154, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0155, code lost:
        ch.icoaching.wrio.logging.Log.d(ch.icoaching.wrio.logging.Log.f10572a, "DuplicateWordsRemoverWorker", "doWork() :: END - SUCCESS", (java.lang.Throwable) null, 4, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0165, code lost:
        return androidx.work.l.a.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0169, code lost:
        ch.icoaching.wrio.logging.Log.d(ch.icoaching.wrio.logging.Log.f10572a, "DuplicateWordsRemoverWorker", "doWork() :: END - RETRY - Some of the workers with higher priority are running", (java.lang.Throwable) null, 4, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0179, code lost:
        return androidx.work.l.a.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L_0x0057;
                case 1: goto L_0x004e;
                case 2: goto L_0x0044;
                case 3: goto L_0x0036;
                case 4: goto L_0x0023;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0011:
            kotlin.f.b(r10)
            goto L_0x011f
        L_0x0016:
            boolean r1 = r9.Z$3
            boolean r2 = r9.Z$2
            boolean r3 = r9.Z$1
            boolean r4 = r9.Z$0
            kotlin.f.b(r10)
            goto L_0x00fa
        L_0x0023:
            boolean r1 = r9.Z$2
            boolean r2 = r9.Z$1
            boolean r3 = r9.Z$0
            java.lang.Object r4 = r9.L$0
            androidx.work.WorkManager r4 = (androidx.work.WorkManager) r4
            kotlin.f.b(r10)
            r8 = r2
            r2 = r1
            r1 = r3
            r3 = r8
            goto L_0x00d9
        L_0x0036:
            boolean r1 = r9.Z$1
            boolean r2 = r9.Z$0
            java.lang.Object r3 = r9.L$0
            androidx.work.WorkManager r3 = (androidx.work.WorkManager) r3
            kotlin.f.b(r10)
            r4 = r3
            goto L_0x00ba
        L_0x0044:
            boolean r1 = r9.Z$0
            java.lang.Object r2 = r9.L$0
            androidx.work.WorkManager r2 = (androidx.work.WorkManager) r2
            kotlin.f.b(r10)
            goto L_0x009e
        L_0x004e:
            java.lang.Object r1 = r9.L$0
            androidx.work.WorkManager r1 = (androidx.work.WorkManager) r1
            kotlin.f.b(r10)
            r2 = r1
            goto L_0x0085
        L_0x0057:
            kotlin.f.b(r10)
            ch.icoaching.wrio.logging.Log r2 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r3 = "DuplicateWordsRemoverWorker"
            java.lang.String r4 = "doWork() :: START"
            r6 = 4
            r7 = 0
            r5 = 0
            ch.icoaching.wrio.logging.Log.d(r2, r3, r4, r5, r6, r7)
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker r10 = r9.this$0
            android.content.Context r10 = r10.a()
            androidx.work.WorkManager r10 = androidx.work.WorkManager.g(r10)
            java.lang.String r1 = "getInstance(...)"
            kotlin.jvm.internal.o.d(r10, r1)
            r9.L$0 = r10
            r1 = 1
            r9.label = r1
            java.lang.String r1 = "language_import_unique_work_id"
            java.lang.Object r1 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r10, r1, r9)
            if (r1 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r2 = r10
            r10 = r1
        L_0x0085:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r9.L$0 = r2
            r9.Z$0 = r10
            r1 = 2
            r9.label = r1
            java.lang.String r1 = "dictionary_integrity_checker_worker_unique_id"
            java.lang.Object r1 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, r1, r9)
            if (r1 != r0) goto L_0x009b
            return r0
        L_0x009b:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x009e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r9.L$0 = r2
            r9.Z$0 = r1
            r9.Z$1 = r10
            r3 = 3
            r9.label = r3
            java.lang.String r3 = "language_restoration_unique_work_id"
            java.lang.Object r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r2, r3, r9)
            if (r3 != r0) goto L_0x00b6
            return r0
        L_0x00b6:
            r4 = r2
            r2 = r1
            r1 = r10
            r10 = r3
        L_0x00ba:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r9.L$0 = r4
            r9.Z$0 = r2
            r9.Z$1 = r1
            r9.Z$2 = r10
            r3 = 4
            r9.label = r3
            java.lang.String r3 = "reset_counters_unique_work_id"
            java.lang.Object r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r4, r3, r9)
            if (r3 != r0) goto L_0x00d4
            return r0
        L_0x00d4:
            r8 = r2
            r2 = r10
            r10 = r3
            r3 = r1
            r1 = r8
        L_0x00d9:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r5 = 0
            r9.L$0 = r5
            r9.Z$0 = r1
            r9.Z$1 = r3
            r9.Z$2 = r2
            r9.Z$3 = r10
            r5 = 5
            r9.label = r5
            java.lang.String r5 = "restore_mixed_case_words"
            java.lang.Object r4 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r4, r5, r9)
            if (r4 != r0) goto L_0x00f6
            return r0
        L_0x00f6:
            r8 = r1
            r1 = r10
            r10 = r4
            r4 = r8
        L_0x00fa:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r4 != 0) goto L_0x0169
            if (r3 != 0) goto L_0x0169
            if (r2 != 0) goto L_0x0169
            if (r1 != 0) goto L_0x0169
            if (r10 == 0) goto L_0x010b
            goto L_0x0169
        L_0x010b:
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker r10 = r9.this$0
            O2.a r1 = r10.f9523h
            androidx.work.g r1 = r1.e()
            r2 = 6
            r9.label = r2
            java.lang.Object r10 = r10.x(r1, r9)
            if (r10 != r0) goto L_0x011f
            return r0
        L_0x011f:
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker r10 = r9.this$0
            c.b r10 = r10.f9524i
            java.lang.Object r10 = r10.f7503m
            java.lang.String r0 = "databaseLock"
            kotlin.jvm.internal.o.d(r10, r0)
            ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker r0 = r9.this$0
            monitor-enter(r10)
            h2.k$a r1 = h2.C0672k.f13645b     // Catch:{ all -> 0x0166 }
            c.b r2 = r0.f9524i     // Catch:{ all -> 0x0166 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = "getReadableDatabase(...)"
            kotlin.jvm.internal.o.d(r2, r3)     // Catch:{ all -> 0x0166 }
            java.util.List r2 = r1.c(r2)     // Catch:{ all -> 0x0166 }
            c.b r0 = r0.f9524i     // Catch:{ all -> 0x0166 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = "getWritableDatabase(...)"
            kotlin.jvm.internal.o.d(r0, r3)     // Catch:{ all -> 0x0166 }
            r1.h(r2, r0)     // Catch:{ all -> 0x0166 }
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x0166 }
            monitor-exit(r10)
            ch.icoaching.wrio.logging.Log r1 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r2 = "DuplicateWordsRemoverWorker"
            java.lang.String r3 = "doWork() :: END - SUCCESS"
            r5 = 4
            r6 = 0
            r4 = 0
            ch.icoaching.wrio.logging.Log.d(r1, r2, r3, r4, r5, r6)
            androidx.work.l$a r10 = androidx.work.l.a.c()
            return r10
        L_0x0166:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0169:
            ch.icoaching.wrio.logging.Log r1 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r2 = "DuplicateWordsRemoverWorker"
            java.lang.String r3 = "doWork() :: END - RETRY - Some of the workers with higher priority are running"
            r5 = 4
            r6 = 0
            r4 = 0
            ch.icoaching.wrio.logging.Log.d(r1, r2, r3, r4, r5, r6)
            androidx.work.l$a r10 = androidx.work.l.a.b()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((DuplicateWordsRemoverWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
