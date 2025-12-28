package ch.icoaching.wrio.input;

import android.content.Context;
import android.net.Uri;
import c.C0489b;
import ch.icoaching.wrio.data.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;

public final class CommandProcessorOnContentChangeHandler extends m {

    /* renamed from: b  reason: collision with root package name */
    private final Context f9653b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9654c;

    /* renamed from: d  reason: collision with root package name */
    private final D f9655d;

    /* renamed from: e  reason: collision with root package name */
    private final i f9656e;

    /* renamed from: f  reason: collision with root package name */
    private final C0489b f9657f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommandProcessorOnContentChangeHandler(Context context, Context context2, D d4, i iVar, C0489b bVar, m mVar) {
        super(mVar);
        o.e(context, "applicationContext");
        o.e(context2, "serviceContext");
        o.e(d4, "serviceCoroutineScope");
        o.e(iVar, "otherSettings");
        o.e(bVar, "databaseHandler");
        this.f9653b = context;
        this.f9654c = context2;
        this.f9655d = d4;
        this.f9656e = iVar;
        this.f9657f = bVar;
    }

    /* access modifiers changed from: private */
    public static final q d(CommandProcessorOnContentChangeHandler commandProcessorOnContentChangeHandler, Uri uri) {
        if (uri != null) {
            e.b(commandProcessorOnContentChangeHandler.f9654c, uri);
        }
        return q.f14567a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(ch.icoaching.wrio.input.l r12, kotlin.coroutines.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler$onContentChanged$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler$onContentChanged$1 r0 = (ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler$onContentChanged$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler$onContentChanged$1 r0 = new ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler$onContentChanged$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0042
            if (r2 == r3) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r12 = r0.L$0
            ch.icoaching.wrio.input.l r12 = (ch.icoaching.wrio.input.l) r12
            kotlin.f.b(r13)
            goto L_0x015f
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            java.lang.Object r12 = r0.L$0
            ch.icoaching.wrio.input.l r12 = (ch.icoaching.wrio.input.l) r12
            kotlin.f.b(r13)
            goto L_0x0176
        L_0x0042:
            kotlin.f.b(r13)
            ch.icoaching.wrio.logging.Log r13 = ch.icoaching.wrio.logging.Log.f10572a
            r9 = 4
            r10 = 0
            java.lang.String r6 = "CommandProcessorOnContentChangeHandler"
            java.lang.String r7 = "onContentChanged()"
            r8 = 0
            r5 = r13
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r12.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r5 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.DELETE
            if (r2 == r5) goto L_0x0165
            ch.icoaching.wrio.input.OnContentChangeEventFlags r2 = r12.g()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r2 = r2.a()
            ch.icoaching.wrio.input.OnContentChangeEventFlags$TriggerEventType r5 = ch.icoaching.wrio.input.OnContentChangeEventFlags.TriggerEventType.RESTORE
            if (r2 != r5) goto L_0x006c
            goto L_0x0165
        L_0x006c:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/dumpDB#"
            r6 = 0
            r7 = 0
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x008c
            ch.icoaching.wrio.util.DictionaryExporter r13 = new ch.icoaching.wrio.util.DictionaryExporter
            kotlinx.coroutines.D r0 = r11.f9655d
            r13.<init>(r0)
            android.content.Context r0 = r11.f9654c
            ch.icoaching.wrio.input.a r1 = new ch.icoaching.wrio.input.a
            r1.<init>(r11)
            r13.b(r0, r1)
            return r12
        L_0x008c:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/resetCounters#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x00ad
            android.content.Context r13 = r11.f9653b
            androidx.work.WorkManager r13 = androidx.work.WorkManager.g(r13)
            androidx.work.ExistingWorkPolicy r2 = androidx.work.ExistingWorkPolicy.KEEP
            ch.icoaching.wrio.dictionary.ResetCaseCountersWorker$a r3 = ch.icoaching.wrio.dictionary.ResetCaseCountersWorker.f9606m
            androidx.work.n r3 = r3.a()
            java.lang.String r5 = "reset_counters_unique_work_id"
            r13.e(r5, r2, r3)
            goto L_0x014e
        L_0x00ad:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/restoreMixedCaseWords#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x00ce
            android.content.Context r13 = r11.f9653b
            androidx.work.WorkManager r13 = androidx.work.WorkManager.g(r13)
            androidx.work.ExistingWorkPolicy r2 = androidx.work.ExistingWorkPolicy.REPLACE
            ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker$a r3 = ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker.f9542l
            androidx.work.n r3 = r3.a()
            java.lang.String r5 = "restore_mixed_case_words"
            r13.e(r5, r2, r3)
            goto L_0x014e
        L_0x00ce:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/exportLogFile#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x00e1
            android.content.Context r13 = r11.f9653b
            ch.icoaching.wrio.util.c.a(r13)
            goto L_0x014e
        L_0x00e1:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/logToFileCLEAR#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x00fc
            r13.b()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "CommandProcessorOnContentChangeHandler"
            java.lang.String r7 = "onContentChanged() :: Log file cleared."
            r8 = 0
            r5 = r13
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            goto L_0x014e
        L_0x00fc:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/logToFileOFF#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x0119
            ch.icoaching.wrio.data.i r2 = r11.f9656e
            r2.c(r6)
            r9 = 4
            r10 = 0
            java.lang.String r6 = "CommandProcessorOnContentChangeHandler"
            java.lang.String r7 = "onContentChanged() :: Logging turned OFF"
            r8 = 0
            r5 = r13
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            goto L_0x014e
        L_0x0119:
            java.lang.String r2 = r12.d()
            java.lang.String r5 = "/logToFileON#"
            boolean r2 = kotlin.text.o.u(r2, r5, r6, r4, r7)
            if (r2 == 0) goto L_0x0136
            ch.icoaching.wrio.data.i r2 = r11.f9656e
            r2.c(r3)
            r9 = 4
            r10 = 0
            java.lang.String r6 = "CommandProcessorOnContentChangeHandler"
            java.lang.String r7 = "onContentChanged() :: Logging turned ON"
            r8 = 0
            r5 = r13
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            goto L_0x014e
        L_0x0136:
            java.lang.String r13 = r12.d()
            java.lang.String r2 = "/resetApostrophes#"
            boolean r13 = kotlin.text.o.u(r13, r2, r6, r4, r7)
            if (r13 == 0) goto L_0x014e
            ch.icoaching.wrio.util.WordWithApostrophesReSetter r13 = new ch.icoaching.wrio.util.WordWithApostrophesReSetter
            c.b r2 = r11.f9657f
            kotlinx.coroutines.D r3 = r11.f9655d
            r13.<init>(r2, r3)
            r13.b()
        L_0x014e:
            ch.icoaching.wrio.input.m r13 = r11.a()
            if (r13 == 0) goto L_0x0163
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = r13.b(r12, r0)
            if (r13 != r1) goto L_0x015f
            return r1
        L_0x015f:
            ch.icoaching.wrio.input.l r13 = (ch.icoaching.wrio.input.l) r13
            if (r13 != 0) goto L_0x0164
        L_0x0163:
            r13 = r12
        L_0x0164:
            return r13
        L_0x0165:
            ch.icoaching.wrio.input.m r13 = r11.a()
            if (r13 == 0) goto L_0x017a
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r13 = r13.b(r12, r0)
            if (r13 != r1) goto L_0x0176
            return r1
        L_0x0176:
            ch.icoaching.wrio.input.l r13 = (ch.icoaching.wrio.input.l) r13
            if (r13 != 0) goto L_0x017b
        L_0x017a:
            r13 = r12
        L_0x017b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.input.CommandProcessorOnContentChangeHandler.b(ch.icoaching.wrio.input.l, kotlin.coroutines.c):java.lang.Object");
    }
}
