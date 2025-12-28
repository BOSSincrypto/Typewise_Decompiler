package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.p;
import l2.q;

abstract /* synthetic */ class FlowKt__ChannelsKt {
    public static final c b(p pVar) {
        return new a(pVar, true, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (i) null);
    }

    public static final Object c(d dVar, p pVar, c cVar) {
        Object d4 = d(dVar, pVar, true, cVar);
        if (d4 == a.f()) {
            return d4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC, Splitter:B:35:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(kotlinx.coroutines.flow.d r6, kotlinx.coroutines.channels.p r7, boolean r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.d r8 = (kotlinx.coroutines.flow.d) r8
            kotlin.f.b(r9)     // Catch:{ all -> 0x0039 }
        L_0x0035:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x005d
        L_0x0039:
            r8 = move-exception
            goto L_0x009c
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            boolean r6 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.d r8 = (kotlinx.coroutines.flow.d) r8
            kotlin.f.b(r9)     // Catch:{ all -> 0x0039 }
            kotlinx.coroutines.channels.g r9 = (kotlinx.coroutines.channels.g) r9     // Catch:{ all -> 0x0039 }
            java.lang.Object r9 = r9.j()     // Catch:{ all -> 0x0039 }
            goto L_0x006f
        L_0x0057:
            kotlin.f.b(r9)
            kotlinx.coroutines.flow.e.g(r6)
        L_0x005d:
            r0.L$0 = r6     // Catch:{ all -> 0x0098 }
            r0.L$1 = r7     // Catch:{ all -> 0x0098 }
            r0.Z$0 = r8     // Catch:{ all -> 0x0098 }
            r0.label = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r9 = r7.q(r0)     // Catch:{ all -> 0x0098 }
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x006f:
            boolean r2 = kotlinx.coroutines.channels.g.h(r9)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0085
            java.lang.Throwable r8 = kotlinx.coroutines.channels.g.e(r9)     // Catch:{ all -> 0x0039 }
            if (r8 != 0) goto L_0x0084
            if (r6 == 0) goto L_0x0081
            r6 = 0
            kotlinx.coroutines.channels.h.a(r7, r6)
        L_0x0081:
            l2.q r6 = l2.q.f14567a
            return r6
        L_0x0084:
            throw r8     // Catch:{ all -> 0x0039 }
        L_0x0085:
            java.lang.Object r9 = kotlinx.coroutines.channels.g.f(r9)     // Catch:{ all -> 0x0039 }
            r0.L$0 = r8     // Catch:{ all -> 0x0039 }
            r0.L$1 = r7     // Catch:{ all -> 0x0039 }
            r0.Z$0 = r6     // Catch:{ all -> 0x0039 }
            r0.label = r3     // Catch:{ all -> 0x0039 }
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch:{ all -> 0x0039 }
            if (r9 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x009c:
            throw r8     // Catch:{ all -> 0x009d }
        L_0x009d:
            r9 = move-exception
            if (r6 == 0) goto L_0x00a3
            kotlinx.coroutines.channels.h.a(r7, r8)
        L_0x00a3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.d(kotlinx.coroutines.flow.d, kotlinx.coroutines.channels.p, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
