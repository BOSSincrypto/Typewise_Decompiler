package ch.icoaching.wrio.dictionary;

import androidx.work.l;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.dictionary.DictionaryRestorerWorker$doWork$2", f = "DictionaryRestorerWorker.kt", l = {42, 43, 51, 58}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "Landroidx/work/l$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lkotlinx/coroutines/D;)Landroidx/work/l$a;"}, k = 3, mv = {2, 0, 0})
final class DictionaryRestorerWorker$doWork$2 extends SuspendLambda implements p {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ DictionaryRestorerWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DictionaryRestorerWorker$doWork$2(DictionaryRestorerWorker dictionaryRestorerWorker, c<? super DictionaryRestorerWorker$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = dictionaryRestorerWorker;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new DictionaryRestorerWorker$doWork$2(this.this$0, cVar);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = 5000(0x1388, float:7.006E-42)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r1.label
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r7) goto L_0x003d
            if (r3 == r6) goto L_0x0034
            if (r3 == r5) goto L_0x002f
            if (r3 != r4) goto L_0x0027
            java.lang.Object r2 = r1.L$1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r1.L$0
            ch.icoaching.wrio.dictionary.b r3 = (ch.icoaching.wrio.dictionary.b) r3
            kotlin.f.b(r21)
            r4 = r21
            goto L_0x00ea
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x002f:
            kotlin.f.b(r21)
            goto L_0x00a7
        L_0x0034:
            boolean r3 = r1.Z$0
            kotlin.f.b(r21)
            r7 = r3
            r3 = r21
            goto L_0x0088
        L_0x003d:
            java.lang.Object r3 = r1.L$0
            androidx.work.WorkManager r3 = (androidx.work.WorkManager) r3
            kotlin.f.b(r21)
            r7 = r21
            goto L_0x0072
        L_0x0047:
            kotlin.f.b(r21)
            ch.icoaching.wrio.logging.Log r8 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r9 = "DictionaryRestorerWorker"
            java.lang.String r10 = "doWork() :: START"
            r12 = 4
            r13 = 0
            r11 = 0
            ch.icoaching.wrio.logging.Log.d(r8, r9, r10, r11, r12, r13)
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r3 = r1.this$0
            android.content.Context r3 = r3.a()
            androidx.work.WorkManager r3 = androidx.work.WorkManager.g(r3)
            java.lang.String r8 = "getInstance(...)"
            kotlin.jvm.internal.o.d(r3, r8)
            r1.L$0 = r3
            r1.label = r7
            java.lang.String r7 = "language_import_unique_work_id"
            java.lang.Object r7 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r3, r7, r1)
            if (r7 != r2) goto L_0x0072
            return r2
        L_0x0072:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 0
            r1.L$0 = r8
            r1.Z$0 = r7
            r1.label = r6
            java.lang.String r6 = "dictionary_integrity_checker_worker_unique_id"
            java.lang.Object r3 = ch.icoaching.wrio.util.WorkManagerUtilsKt.a(r3, r6, r1)
            if (r3 != r2) goto L_0x0088
            return r2
        L_0x0088:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r7 != 0) goto L_0x0250
            if (r3 == 0) goto L_0x0094
            goto L_0x0250
        L_0x0094:
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r3 = r1.this$0
            O2.a r6 = r3.f9595i
            androidx.work.g r6 = r6.e()
            r1.label = r5
            java.lang.Object r3 = r3.x(r6, r1)
            if (r3 != r2) goto L_0x00a7
            return r2
        L_0x00a7:
            ch.icoaching.wrio.dictionary.b r3 = new ch.icoaching.wrio.dictionary.b
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r5 = r1.this$0
            ch.icoaching.wrio.data.c r5 = r5.f9596j
            r3.<init>(r5)
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r5 = r1.this$0
            c.b r5 = r5.f9597k
            java.lang.Object r5 = r5.f7503m
            java.lang.String r6 = "databaseLock"
            kotlin.jvm.internal.o.d(r5, r6)
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r6 = r1.this$0
            monitor-enter(r5)
            h2.i$a r7 = h2.C0670i.f13642b     // Catch:{ all -> 0x024d }
            c.b r6 = r6.f9597k     // Catch:{ all -> 0x024d }
            android.database.sqlite.SQLiteDatabase r6 = r6.getReadableDatabase()     // Catch:{ all -> 0x024d }
            java.lang.String r8 = "getReadableDatabase(...)"
            kotlin.jvm.internal.o.d(r6, r8)     // Catch:{ all -> 0x024d }
            java.util.Map r6 = r7.b(r6)     // Catch:{ all -> 0x024d }
            monitor-exit(r5)
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r5 = r1.this$0
            ch.icoaching.typewise.AILibrarySingletonProvider r5 = r5.f9599m
            r1.L$0 = r3
            r1.L$1 = r6
            r1.label = r4
            java.lang.Object r4 = r5.b(r1)
            if (r4 != r2) goto L_0x00e9
            return r2
        L_0x00e9:
            r2 = r6
        L_0x00ea:
            ch.icoaching.typewise.AILibrary r4 = (ch.icoaching.typewise.AILibrary) r4
            ch.icoaching.typewise.file_handling.ConfigHolder r4 = r4.b()
            ch.icoaching.typewise.config.CompanyConfig r4 = r4.c()
            ch.icoaching.typewise.config.CompanyConfig$b r4 = r4.e()
            ch.icoaching.wrio.dictionary.DictionaryRestorerWorker r11 = r1.this$0
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0102:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x023c
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r12 = r5.intValue()
            android.content.Context r5 = r11.y()
            int r5 = r3.a(r5, r6)
            if (r5 <= 0) goto L_0x0102
            android.content.Context r7 = r11.y()
            ch.icoaching.wrio.dictionary.f r13 = r3.b(r7, r6, r12, r5)
            ch.icoaching.wrio.logging.Log r14 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "doWork() :: restoring words for language "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r16 = r5.toString()
            java.lang.String r15 = "DictionaryRestorerWorker"
            r18 = 4
            r19 = 0
            r17 = 0
            ch.icoaching.wrio.logging.Log.d(r14, r15, r16, r17, r18, r19)
            c.b r5 = r11.f9597k
            java.lang.Object r5 = r5.f7503m
            java.lang.String r6 = "databaseLock"
            kotlin.jvm.internal.o.d(r5, r6)
            monitor-enter(r5)
            h2.k$a r6 = h2.C0672k.f13645b     // Catch:{ all -> 0x0239 }
            c.b r7 = r11.f9597k     // Catch:{ all -> 0x0239 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getReadableDatabase()     // Catch:{ all -> 0x0239 }
            java.lang.String r8 = "getReadableDatabase(...)"
            kotlin.jvm.internal.o.d(r7, r8)     // Catch:{ all -> 0x0239 }
            int r6 = r6.j(r12, r7)     // Catch:{ all -> 0x0239 }
            monitor-exit(r5)
            int r5 = r13.a()
            if (r6 >= r5) goto L_0x0102
            r6 = 0
            int r14 = p2.C0854c.b(r6, r5, r0)
            if (r14 < 0) goto L_0x0102
            r15 = r6
        L_0x017c:
            c.b r5 = r11.f9597k
            java.lang.Object r10 = r5.f7503m
            java.lang.String r5 = "databaseLock"
            kotlin.jvm.internal.o.d(r10, r5)
            monitor-enter(r10)
            h2.k$a r5 = h2.C0672k.f13645b     // Catch:{ all -> 0x0227 }
            java.util.List r6 = r13.b(r15)     // Catch:{ all -> 0x0227 }
            c.b r7 = r11.f9597k     // Catch:{ all -> 0x0227 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x0227 }
            java.lang.String r8 = "getWritableDatabase(...)"
            kotlin.jvm.internal.o.d(r7, r8)     // Catch:{ all -> 0x0227 }
            java.util.List r6 = r5.d(r6, r12, r7)     // Catch:{ all -> 0x0227 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0227 }
            if (r7 != 0) goto L_0x022b
            c.b r7 = r11.f9597k     // Catch:{ all -> 0x0227 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x0227 }
            java.lang.String r8 = "getWritableDatabase(...)"
            kotlin.jvm.internal.o.d(r7, r8)     // Catch:{ all -> 0x0227 }
            c.b r8 = r11.f9597k     // Catch:{ all -> 0x0227 }
            java.lang.Object r8 = r8.f7503m     // Catch:{ all -> 0x0227 }
            java.lang.String r9 = "databaseLock"
            kotlin.jvm.internal.o.d(r8, r9)     // Catch:{ all -> 0x0227 }
            java.util.Map r9 = r5.f(r6, r7, r8)     // Catch:{ all -> 0x0227 }
            ch.icoaching.typewise.autocorrection.scripts.h r16 = new ch.icoaching.typewise.autocorrection.scripts.h     // Catch:{ all -> 0x0227 }
            java.util.Set r5 = r9.keySet()     // Catch:{ all -> 0x0227 }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x0227 }
            r17 = 4
            r18 = 0
            r8 = 0
            r5 = r16
            r7 = r4
            r0 = r9
            r9 = r17
            r17 = r10
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0225 }
            java.util.Map r5 = r16.d()     // Catch:{ all -> 0x0225 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0225 }
            c.b r6 = r11.f9597k     // Catch:{ all -> 0x0225 }
            android.database.sqlite.SQLiteDatabase r6 = r6.getWritableDatabase()     // Catch:{ all -> 0x0225 }
            java.lang.String r7 = "getWritableDatabase(...)"
            kotlin.jvm.internal.o.d(r6, r7)     // Catch:{ all -> 0x0225 }
            c.b r7 = r11.f9597k     // Catch:{ all -> 0x0225 }
            java.lang.Object r7 = r7.f7503m     // Catch:{ all -> 0x0225 }
            java.lang.String r8 = "databaseLock"
            kotlin.jvm.internal.o.d(r7, r8)     // Catch:{ all -> 0x0225 }
            java.util.Map r5 = h2.C0666e.a(r5, r6, r7)     // Catch:{ all -> 0x0225 }
            java.util.Map r6 = r16.d()     // Catch:{ all -> 0x0225 }
            java.util.List r0 = e.C0641a.a(r6, r0, r5)     // Catch:{ all -> 0x0225 }
            c.b r5 = r11.f9597k     // Catch:{ all -> 0x0225 }
            android.database.sqlite.SQLiteDatabase r5 = r5.getWritableDatabase()     // Catch:{ all -> 0x0225 }
            java.lang.String r6 = "getWritableDatabase(...)"
            kotlin.jvm.internal.o.d(r5, r6)     // Catch:{ all -> 0x0225 }
            c.b r6 = r11.f9597k     // Catch:{ all -> 0x0225 }
            java.lang.Object r6 = r6.f7503m     // Catch:{ all -> 0x0225 }
            java.lang.String r7 = "databaseLock"
            kotlin.jvm.internal.o.d(r6, r7)     // Catch:{ all -> 0x0225 }
            h2.C0666e.b(r0, r5, r6)     // Catch:{ all -> 0x0225 }
            goto L_0x022d
        L_0x0225:
            r0 = move-exception
            goto L_0x0237
        L_0x0227:
            r0 = move-exception
            r17 = r10
            goto L_0x0237
        L_0x022b:
            r17 = r10
        L_0x022d:
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x0225 }
            monitor-exit(r17)
            r0 = 5000(0x1388, float:7.006E-42)
            if (r15 == r14) goto L_0x0102
            int r15 = r15 + r0
            goto L_0x017c
        L_0x0237:
            monitor-exit(r17)
            throw r0
        L_0x0239:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x023c:
            ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r7 = "DictionaryRestorerWorker"
            java.lang.String r8 = "doWork() :: END - SUCCESS"
            r10 = 4
            r11 = 0
            r9 = 0
            ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)
            androidx.work.l$a r0 = androidx.work.l.a.c()
            return r0
        L_0x024d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0250:
            ch.icoaching.wrio.logging.Log r6 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.String r0 = "DictionaryRestorerWorker"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "doWork() :: END - RETRY - dictionary import ("
            r2.append(r4)
            r2.append(r7)
            java.lang.String r4 = ") or integrity check ("
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ") runing"
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            r10 = 4
            r11 = 0
            r9 = 0
            r7 = r0
            ch.icoaching.wrio.logging.Log.d(r6, r7, r8, r9, r10, r11)
            androidx.work.l$a r0 = androidx.work.l.a.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.dictionary.DictionaryRestorerWorker$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(D d4, c<? super l.a> cVar) {
        return ((DictionaryRestorerWorker$doWork$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
