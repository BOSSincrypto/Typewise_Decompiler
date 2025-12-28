package ch.icoaching.wrio.util;

public abstract class WorkManagerUtilsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.work.WorkManager r4, java.lang.String r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof ch.icoaching.wrio.util.WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.wrio.util.WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1 r0 = (ch.icoaching.wrio.util.WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.util.WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1 r0 = new ch.icoaching.wrio.util.WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            X1.a r4 = (X1.a) r4
            kotlin.f.b(r6)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.f.b(r6)
            X1.a r4 = r4.h(r5)
            java.lang.String r5 = "getWorkInfosForUniqueWork(...)"
            kotlin.jvm.internal.o.d(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r6 = r4.get()     // Catch:{ ExecutionException -> 0x004c }
            goto L_0x0088
        L_0x004c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r4 = r5
        L_0x0055:
            throw r4
        L_0x0056:
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.l r5 = new kotlinx.coroutines.l
            kotlin.coroutines.c r6 = kotlin.coroutines.intrinsics.a.d(r0)
            r5.<init>(r6, r3)
            r5.z()
            ch.icoaching.wrio.util.h r6 = new ch.icoaching.wrio.util.h
            r6.<init>(r5, r4)
            ch.icoaching.wrio.util.DirectExecutor r2 = ch.icoaching.wrio.util.DirectExecutor.INSTANCE
            r4.a(r6, r2)
            ch.icoaching.wrio.util.i r6 = new ch.icoaching.wrio.util.i
            r6.<init>(r4)
            r5.j(r6)
            java.lang.Object r6 = r5.v()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            if (r6 != r4) goto L_0x0085
            kotlin.coroutines.jvm.internal.f.c(r0)
        L_0x0085:
            if (r6 != r1) goto L_0x0088
            return r1
        L_0x0088:
            java.util.List r6 = (java.util.List) r6
            kotlin.jvm.internal.o.b(r6)
            java.lang.Object r4 = kotlin.collections.C0718m.S(r6)
            androidx.work.WorkInfo r4 = (androidx.work.WorkInfo) r4
            if (r4 == 0) goto L_0x00a6
            androidx.work.WorkInfo$State r5 = r4.a()
            androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.RUNNING
            if (r5 == r6) goto L_0x00a7
            androidx.work.WorkInfo$State r4 = r4.a()
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.BLOCKED
            if (r4 != r5) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.util.WorkManagerUtilsKt.a(androidx.work.WorkManager, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
