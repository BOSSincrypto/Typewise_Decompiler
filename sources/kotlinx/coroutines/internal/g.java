package kotlinx.coroutines.internal;

import kotlin.coroutines.c;
import u2.l;

public abstract class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y f14176a = new y("UNDEFINED");

    /* renamed from: b  reason: collision with root package name */
    public static final y f14177b = new y("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r8.L0() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r8.L0() != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.coroutines.c r6, java.lang.Object r7, u2.l r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.f
            if (r0 == 0) goto L_0x00b2
            kotlinx.coroutines.internal.f r6 = (kotlinx.coroutines.internal.f) r6
            java.lang.Object r8 = kotlinx.coroutines.C0760y.c(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.f14172d
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.q0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f14174f = r8
            r6.f14001c = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f14172d
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.p0(r8, r6)
            goto L_0x00b5
        L_0x0026:
            kotlinx.coroutines.B0 r0 = kotlinx.coroutines.B0.f13984a
            kotlinx.coroutines.U r0 = r0.a()
            boolean r2 = r0.y0()
            if (r2 == 0) goto L_0x003b
            r6.f14174f = r8
            r6.f14001c = r1
            r0.u0(r6)
            goto L_0x00b5
        L_0x003b:
            r0.w0(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch:{ all -> 0x0068 }
            kotlinx.coroutines.g0$b r4 = kotlinx.coroutines.g0.f14139t     // Catch:{ all -> 0x0068 }
            kotlin.coroutines.CoroutineContext$a r3 = r3.get(r4)     // Catch:{ all -> 0x0068 }
            kotlinx.coroutines.g0 r3 = (kotlinx.coroutines.g0) r3     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x006a
            boolean r4 = r3.a()     // Catch:{ all -> 0x0068 }
            if (r4 != 0) goto L_0x006a
            java.util.concurrent.CancellationException r7 = r3.R()     // Catch:{ all -> 0x0068 }
            r6.a(r8, r7)     // Catch:{ all -> 0x0068 }
            kotlin.Result$a r8 = kotlin.Result.Companion     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = kotlin.f.a(r7)     // Catch:{ all -> 0x0068 }
            java.lang.Object r7 = kotlin.Result.m1constructorimpl(r7)     // Catch:{ all -> 0x0068 }
            r6.resumeWith(r7)     // Catch:{ all -> 0x0068 }
            goto L_0x0092
        L_0x0068:
            r7 = move-exception
            goto L_0x00a9
        L_0x006a:
            kotlin.coroutines.c r8 = r6.f14173e     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = r6.f14175g     // Catch:{ all -> 0x0068 }
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch:{ all -> 0x0068 }
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.c(r4, r3)     // Catch:{ all -> 0x0068 }
            kotlinx.coroutines.internal.y r5 = kotlinx.coroutines.internal.ThreadContextKt.f14159a     // Catch:{ all -> 0x0068 }
            if (r3 == r5) goto L_0x007f
            kotlinx.coroutines.D0 r8 = kotlinx.coroutines.CoroutineContextKt.g(r8, r4, r3)     // Catch:{ all -> 0x0068 }
            goto L_0x0080
        L_0x007f:
            r8 = r2
        L_0x0080:
            kotlin.coroutines.c r5 = r6.f14173e     // Catch:{ all -> 0x009c }
            r5.resumeWith(r7)     // Catch:{ all -> 0x009c }
            l2.q r7 = l2.q.f14567a     // Catch:{ all -> 0x009c }
            if (r8 == 0) goto L_0x008f
            boolean r7 = r8.L0()     // Catch:{ all -> 0x0068 }
            if (r7 == 0) goto L_0x0092
        L_0x008f:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x0092:
            boolean r7 = r0.A0()     // Catch:{ all -> 0x0068 }
            if (r7 != 0) goto L_0x0092
        L_0x0098:
            r0.s0(r1)
            goto L_0x00b5
        L_0x009c:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.L0()     // Catch:{ all -> 0x0068 }
            if (r8 == 0) goto L_0x00a8
        L_0x00a5:
            kotlinx.coroutines.internal.ThreadContextKt.a(r4, r3)     // Catch:{ all -> 0x0068 }
        L_0x00a8:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x00a9:
            r6.h(r7, r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0098
        L_0x00ad:
            r6 = move-exception
            r0.s0(r1)
            throw r6
        L_0x00b2:
            r6.resumeWith(r7)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.b(kotlin.coroutines.c, java.lang.Object, u2.l):void");
    }

    public static /* synthetic */ void c(c cVar, Object obj, l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        b(cVar, obj, lVar);
    }
}
