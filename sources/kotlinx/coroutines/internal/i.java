package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.H;
import kotlinx.coroutines.K;
import kotlinx.coroutines.Q;

public final class i extends CoroutineDispatcher implements Runnable, K {

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineDispatcher f14178c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14179d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ K f14180e;

    /* renamed from: f  reason: collision with root package name */
    private final n f14181f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f14182g;
    private volatile int runningWorkers;

    public i(CoroutineDispatcher coroutineDispatcher, int i4) {
        K k4;
        this.f14178c = coroutineDispatcher;
        this.f14179d = i4;
        if (coroutineDispatcher instanceof K) {
            k4 = (K) coroutineDispatcher;
        } else {
            k4 = null;
        }
        this.f14180e = k4 == null ? H.a() : k4;
        this.f14181f = new n(false);
        this.f14182g = new Object();
    }

    private final boolean s0(Runnable runnable) {
        this.f14181f.a(runnable);
        if (this.runningWorkers >= this.f14179d) {
            return true;
        }
        return false;
    }

    private final boolean t0() {
        synchronized (this.f14182g) {
            if (this.runningWorkers >= this.f14179d) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        if (!s0(runnable) && t0()) {
            this.f14178c.p0(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f14182g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f14181f.c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = l2.q.f14567a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            kotlinx.coroutines.internal.n r2 = r4.f14181f
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.B.a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f14178c
            boolean r2 = r2.q0(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f14178c
            r0.p0(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f14182g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.n r2 = r4.f14181f     // Catch:{ all -> 0x0047 }
            int r2 = r2.c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            l2.q r2 = l2.q.f14567a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.i.run():void");
    }

    public Q v(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f14180e.v(j4, runnable, coroutineContext);
    }

    public void y(long j4, C0747k kVar) {
        this.f14180e.y(j4, kVar);
    }
}
