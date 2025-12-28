package kotlinx.coroutines.channels;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import u2.l;
import u2.p;

public abstract class ProduceKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: u2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlinx.coroutines.channels.n r4, u2.C0906a r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r4 = r0.L$1
            r5 = r4
            u2.a r5 = (u2.C0906a) r5
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
            kotlin.f.b(r6)     // Catch:{ all -> 0x0032 }
            goto L_0x0075
        L_0x0032:
            r4 = move-exception
            goto L_0x007b
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003c:
            kotlin.f.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.g0$b r2 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r2)
            if (r6 != r4) goto L_0x007f
            r0.L$0 = r4     // Catch:{ all -> 0x0032 }
            r0.L$1 = r5     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch:{ all -> 0x0032 }
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.a.d(r0)     // Catch:{ all -> 0x0032 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0032 }
            r6.z()     // Catch:{ all -> 0x0032 }
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch:{ all -> 0x0032 }
            r2.<init>(r6)     // Catch:{ all -> 0x0032 }
            r4.s(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r6.v()     // Catch:{ all -> 0x0032 }
            java.lang.Object r6 = kotlin.coroutines.intrinsics.a.f()     // Catch:{ all -> 0x0032 }
            if (r4 != r6) goto L_0x0072
            kotlin.coroutines.jvm.internal.f.c(r0)     // Catch:{ all -> 0x0032 }
        L_0x0072:
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r5.invoke()
            l2.q r4 = l2.q.f14567a
            return r4
        L_0x007b:
            r5.invoke()
            throw r4
        L_0x007f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(kotlinx.coroutines.channels.n, u2.a, kotlin.coroutines.c):java.lang.Object");
    }

    public static final p b(D d4, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar) {
        m mVar = new m(CoroutineContextKt.e(d4, coroutineContext), f.b(i4, bufferOverflow, (l) null, 4, (Object) null));
        if (lVar != null) {
            mVar.G(lVar);
        }
        mVar.J0(coroutineStart, mVar, pVar);
        return mVar;
    }

    public static final p c(D d4, CoroutineContext coroutineContext, int i4, p pVar) {
        return b(d4, coroutineContext, i4, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, (l) null, pVar);
    }

    public static /* synthetic */ p d(D d4, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l lVar, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i5 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        return b(d4, coroutineContext2, i6, bufferOverflow2, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ p e(D d4, CoroutineContext coroutineContext, int i4, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return c(d4, coroutineContext, i4, pVar);
    }
}
