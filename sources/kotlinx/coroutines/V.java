package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.K;
import kotlinx.coroutines.internal.C;
import kotlinx.coroutines.internal.D;
import kotlinx.coroutines.internal.o;
import l2.q;

public abstract class V extends W implements K {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14011f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f14012g;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    private final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        private final C0747k f14013c;

        public a(long j4, C0747k kVar) {
            super(j4);
            this.f14013c = kVar;
        }

        public void run() {
            this.f14013c.f(V.this, q.f14567a);
        }

        public String toString() {
            return super.toString() + this.f14013c;
        }
    }

    private static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f14015c;

        public b(long j4, Runnable runnable) {
            super(j4);
            this.f14015c = runnable;
        }

        public void run() {
            this.f14015c.run();
        }

        public String toString() {
            return super.toString() + this.f14015c;
        }
    }

    public static abstract class c implements Runnable, Comparable, Q, D {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f14016a;

        /* renamed from: b  reason: collision with root package name */
        private int f14017b = -1;

        public c(long j4) {
            this.f14016a = j4;
        }

        public void a(int i4) {
            this.f14017b = i4;
        }

        public void b(C c4) {
            if (this._heap != Y.f14019a) {
                this._heap = c4;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public int c() {
            return this.f14017b;
        }

        public final synchronized void d() {
            d dVar;
            try {
                Object obj = this._heap;
                if (obj != Y.f14019a) {
                    if (obj instanceof d) {
                        dVar = (d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.g(this);
                    }
                    this._heap = Y.f14019a;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public C e() {
            Object obj = this._heap;
            if (obj instanceof C) {
                return (C) obj;
            }
            return null;
        }

        /* renamed from: f */
        public int compareTo(c cVar) {
            int i4 = ((this.f14016a - cVar.f14016a) > 0 ? 1 : ((this.f14016a - cVar.f14016a) == 0 ? 0 : -1));
            if (i4 > 0) {
                return 1;
            }
            if (i4 < 0) {
                return -1;
            }
            return 0;
        }

        public final synchronized int g(long j4, d dVar, V v3) {
            if (this._heap == Y.f14019a) {
                return 2;
            }
            synchronized (dVar) {
                try {
                    c cVar = (c) dVar.b();
                    if (v3.J0()) {
                        return 1;
                    }
                    if (cVar == null) {
                        dVar.f14018b = j4;
                    } else {
                        long j5 = cVar.f14016a;
                        if (j5 - j4 < 0) {
                            j4 = j5;
                        }
                        if (j4 - dVar.f14018b > 0) {
                            dVar.f14018b = j4;
                        }
                    }
                    long j6 = this.f14016a;
                    long j7 = dVar.f14018b;
                    if (j6 - j7 < 0) {
                        this.f14016a = j7;
                    }
                    dVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean h(long j4) {
            if (j4 - this.f14016a >= 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f14016a + ']';
        }
    }

    public static final class d extends C {

        /* renamed from: b  reason: collision with root package name */
        public long f14018b;

        public d(long j4) {
            this.f14018b = j4;
        }
    }

    static {
        Class<V> cls = V.class;
        Class<Object> cls2 = Object.class;
        f14011f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f14012g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    private final void F0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f14011f, this, (Object) null, Y.f14020b)) {
                    return;
                }
            } else if (obj instanceof o) {
                ((o) obj).d();
                return;
            } else if (obj != Y.f14020b) {
                o oVar = new o(8, true);
                oVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f14011f, this, obj, oVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable G0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                Object j4 = oVar.j();
                if (j4 != o.f14190h) {
                    return (Runnable) j4;
                }
                androidx.concurrent.futures.b.a(f14011f, this, obj, oVar.i());
            } else if (obj == Y.f14020b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f14011f, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean I0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (J0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f14011f, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof o) {
                o oVar = (o) obj;
                int a4 = oVar.a(runnable);
                if (a4 == 0) {
                    return true;
                }
                if (a4 == 1) {
                    androidx.concurrent.futures.b.a(f14011f, this, obj, oVar.i());
                } else if (a4 == 2) {
                    return false;
                }
            } else if (obj == Y.f14020b) {
                return false;
            } else {
                o oVar2 = new o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f14011f, this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    public final boolean J0() {
        return this._isCompleted;
    }

    private final void M0() {
        c cVar;
        C0730c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (cVar = (c) dVar.i()) != null) {
                C0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }

    private final int P0(long j4, c cVar) {
        if (J0()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f14012g, this, (Object) null, new d(j4));
            Object obj = this._delayed;
            kotlin.jvm.internal.o.b(obj);
            dVar = (d) obj;
        }
        return cVar.g(j4, dVar, this);
    }

    private final void R0(boolean z3) {
        this._isCompleted = z3 ? 1 : 0;
    }

    private final boolean S0(c cVar) {
        c cVar2;
        d dVar = (d) this._delayed;
        if (dVar != null) {
            cVar2 = (c) dVar.e();
        } else {
            cVar2 = null;
        }
        if (cVar2 == cVar) {
            return true;
        }
        return false;
    }

    public void H0(Runnable runnable) {
        if (I0(runnable)) {
            D0();
        } else {
            G.f13996h.H0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean K0() {
        if (!z0()) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof o) {
                return ((o) obj).g();
            }
            if (obj != Y.f14020b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long L0() {
        /*
            r9 = this;
            boolean r0 = r9.A0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.V$d r0 = (kotlinx.coroutines.V.d) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0045
            kotlinx.coroutines.C0730c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.D r5 = r0.b()     // Catch:{ all -> 0x0034 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003e
        L_0x0026:
            kotlinx.coroutines.V$c r5 = (kotlinx.coroutines.V.c) r5     // Catch:{ all -> 0x0034 }
            boolean r7 = r5.h(r3)     // Catch:{ all -> 0x0034 }
            r8 = 0
            if (r7 == 0) goto L_0x0036
            boolean r5 = r9.I0(r5)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r1 = move-exception
            goto L_0x0043
        L_0x0036:
            r5 = r8
        L_0x0037:
            if (r5 == 0) goto L_0x003d
            kotlinx.coroutines.internal.D r6 = r0.h(r8)     // Catch:{ all -> 0x0034 }
        L_0x003d:
            monitor-exit(r0)
        L_0x003e:
            kotlinx.coroutines.V$c r6 = (kotlinx.coroutines.V.c) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0043:
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.G0()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.V.L0():long");
    }

    /* access modifiers changed from: protected */
    public final void N0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void O0(long j4, c cVar) {
        int P02 = P0(j4, cVar);
        if (P02 != 0) {
            if (P02 == 1) {
                C0(j4, cVar);
            } else if (P02 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (S0(cVar)) {
            D0();
        }
    }

    /* access modifiers changed from: protected */
    public final Q Q0(long j4, Runnable runnable) {
        long c4 = Y.c(j4);
        if (c4 >= 4611686018427387903L) {
            return s0.f14230a;
        }
        C0730c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c4 + nanoTime, runnable);
        O0(nanoTime, bVar);
        return bVar;
    }

    public final void p0(CoroutineContext coroutineContext, Runnable runnable) {
        H0(runnable);
    }

    public void shutdown() {
        B0.f13984a.b();
        R0(true);
        F0();
        do {
        } while (L0() <= 0);
        M0();
    }

    public Q v(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return K.a.a(this, j4, runnable, coroutineContext);
    }

    /* access modifiers changed from: protected */
    public long v0() {
        c cVar;
        if (super.v0() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof o) {
                if (!((o) obj).g()) {
                    return 0;
                }
            } else if (obj == Y.f14020b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (cVar = (c) dVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j4 = cVar.f14016a;
        C0730c.a();
        return z2.d.c(j4 - System.nanoTime(), 0);
    }

    public void y(long j4, C0747k kVar) {
        long c4 = Y.c(j4);
        if (c4 < 4611686018427387903L) {
            C0730c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c4 + nanoTime, kVar);
            O0(nanoTime, aVar);
            C0750n.a(kVar, aVar);
        }
    }
}
