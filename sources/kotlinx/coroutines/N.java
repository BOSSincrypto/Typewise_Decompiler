package kotlinx.coroutines;

import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.scheduling.g;
import l2.C0793c;

public abstract class N extends g {

    /* renamed from: c  reason: collision with root package name */
    public int f14001c;

    public N(int i4) {
        this.f14001c = i4;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract c d();

    public Throwable e(Object obj) {
        C0757v vVar;
        if (obj instanceof C0757v) {
            vVar = (C0757v) obj;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar.f14316a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C0793c.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            o.b(th);
            B.a(d().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r4.L0() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r4.L0() != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            kotlinx.coroutines.scheduling.h r0 = r10.f14263b
            kotlin.coroutines.c r1 = r10.d()     // Catch:{ all -> 0x001e }
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.f) r1     // Catch:{ all -> 0x001e }
            kotlin.coroutines.c r2 = r1.f14173e     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = r1.f14175g     // Catch:{ all -> 0x001e }
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch:{ all -> 0x001e }
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.c(r3, r1)     // Catch:{ all -> 0x001e }
            kotlinx.coroutines.internal.y r4 = kotlinx.coroutines.internal.ThreadContextKt.f14159a     // Catch:{ all -> 0x001e }
            r5 = 0
            if (r1 == r4) goto L_0x0021
            kotlinx.coroutines.D0 r4 = kotlinx.coroutines.CoroutineContextKt.g(r2, r3, r1)     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r1 = move-exception
            goto L_0x00b4
        L_0x0021:
            r4 = r5
        L_0x0022:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch:{ all -> 0x0041 }
            java.lang.Object r7 = r10.i()     // Catch:{ all -> 0x0041 }
            java.lang.Throwable r8 = r10.e(r7)     // Catch:{ all -> 0x0041 }
            if (r8 != 0) goto L_0x0043
            int r9 = r10.f14001c     // Catch:{ all -> 0x0041 }
            boolean r9 = kotlinx.coroutines.O.b(r9)     // Catch:{ all -> 0x0041 }
            if (r9 == 0) goto L_0x0043
            kotlinx.coroutines.g0$b r9 = kotlinx.coroutines.g0.f14139t     // Catch:{ all -> 0x0041 }
            kotlin.coroutines.CoroutineContext$a r6 = r6.get(r9)     // Catch:{ all -> 0x0041 }
            kotlinx.coroutines.g0 r6 = (kotlinx.coroutines.g0) r6     // Catch:{ all -> 0x0041 }
            goto L_0x0044
        L_0x0041:
            r2 = move-exception
            goto L_0x00a8
        L_0x0043:
            r6 = r5
        L_0x0044:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.a()     // Catch:{ all -> 0x0041 }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.R()     // Catch:{ all -> 0x0041 }
            r10.a(r7, r6)     // Catch:{ all -> 0x0041 }
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.f.a(r6)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
            goto L_0x007e
        L_0x0061:
            if (r8 == 0) goto L_0x0071
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.f.a(r8)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
            goto L_0x007e
        L_0x0071:
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = r10.g(r7)     // Catch:{ all -> 0x0041 }
            java.lang.Object r6 = kotlin.Result.m1constructorimpl(r6)     // Catch:{ all -> 0x0041 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x0041 }
        L_0x007e:
            l2.q r2 = l2.q.f14567a     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0088
            boolean r2 = r4.L0()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x008b
        L_0x0088:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x008b:
            r0.a()     // Catch:{ all -> 0x0095 }
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.f.a(r0)
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)
        L_0x00a0:
            java.lang.Throwable r0 = kotlin.Result.m4exceptionOrNullimpl(r0)
            r10.h(r5, r0)
            goto L_0x00d2
        L_0x00a8:
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r4.L0()     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x00b3
        L_0x00b0:
            kotlinx.coroutines.internal.ThreadContextKt.a(r3, r1)     // Catch:{ all -> 0x001e }
        L_0x00b3:
            throw r2     // Catch:{ all -> 0x001e }
        L_0x00b4:
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch:{ all -> 0x00c0 }
            r0.a()     // Catch:{ all -> 0x00c0 }
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00cb
        L_0x00c0:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.f.a(r0)
            java.lang.Object r0 = kotlin.Result.m1constructorimpl(r0)
        L_0x00cb:
            java.lang.Throwable r0 = kotlin.Result.m4exceptionOrNullimpl(r0)
            r10.h(r1, r0)
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.N.run():void");
    }
}
