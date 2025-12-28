package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.random.Random;
import kotlinx.coroutines.C0730c;
import kotlinx.coroutines.F;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.y;
import l2.q;
import z2.d;

public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f14231h = new a((i) null);

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f14232i;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f14233j;

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14234k;

    /* renamed from: l  reason: collision with root package name */
    public static final y f14235l = new y("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f14236a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14237b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14238c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f14239d;

    /* renamed from: e  reason: collision with root package name */
    public final c f14240e;

    /* renamed from: f  reason: collision with root package name */
    public final c f14241f;

    /* renamed from: g  reason: collision with root package name */
    public final v f14242g;
    private volatile /* synthetic */ long parkedWorkersStack;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14244a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            iArr[WorkerState.PARKING.ordinal()] = 1;
            iArr[WorkerState.BLOCKING.ordinal()] = 2;
            iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            iArr[WorkerState.DORMANT.ordinal()] = 4;
            iArr[WorkerState.TERMINATED.ordinal()] = 5;
            f14244a = iArr;
        }
    }

    static {
        Class<CoroutineScheduler> cls = CoroutineScheduler.class;
        f14232i = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f14233j = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f14234k = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public CoroutineScheduler(int i4, int i5, long j4, String str) {
        this.f14236a = i4;
        this.f14237b = i5;
        this.f14238c = j4;
        this.f14239d = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        } else if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        } else if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j4 > 0) {
            this.f14240e = new c();
            this.f14241f = new c();
            this.parkedWorkersStack = 0;
            this.f14242g = new v(i4 + 1);
            this.controlState = ((long) i4) << 42;
            this._isTerminated = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
    }

    private final c D() {
        while (true) {
            long j4 = this.parkedWorkersStack;
            c cVar = (c) this.f14242g.b((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (2097152 + j4) & -2097152;
            int y3 = y(cVar);
            if (y3 >= 0) {
                if (f14232i.compareAndSet(this, j4, ((long) y3) | j5)) {
                    cVar.p(f14235l);
                    return cVar;
                }
            }
        }
    }

    private final boolean a(g gVar) {
        if (gVar.f14263b.b() == 1) {
            return this.f14241f.a(gVar);
        }
        return this.f14240e.a(gVar);
    }

    private final int e() {
        synchronized (this.f14242g) {
            if (isTerminated()) {
                return -1;
            }
            long j4 = this.controlState;
            int i4 = (int) (j4 & 2097151);
            int b4 = d.b(i4 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
            if (b4 >= this.f14236a) {
                return 0;
            }
            if (i4 >= this.f14237b) {
                return 0;
            }
            int i5 = ((int) (this.controlState & 2097151)) + 1;
            if (i5 <= 0 || this.f14242g.b(i5) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c cVar = new c(this, i5);
            this.f14242g.c(i5, cVar);
            if (i5 == ((int) (2097151 & f14233j.incrementAndGet(this)))) {
                cVar.start();
                int i6 = b4 + 1;
                return i6;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final void e0(boolean z3) {
        long addAndGet = f14233j.addAndGet(this, 2097152);
        if (!z3 && !r0() && !p0(addAndGet)) {
            r0();
        }
    }

    private final c m() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !o.a(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    private final g o0(c cVar, g gVar, boolean z3) {
        if (cVar == null || cVar.f14247b == WorkerState.TERMINATED) {
            return gVar;
        }
        if (gVar.f14263b.b() == 0 && cVar.f14247b == WorkerState.BLOCKING) {
            return gVar;
        }
        cVar.f14251f = true;
        return cVar.f14246a.a(gVar, z3);
    }

    private final boolean p0(long j4) {
        if (d.b(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0) < this.f14236a) {
            int e4 = e();
            if (e4 == 1 && this.f14236a > 1) {
                e();
            }
            if (e4 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean q0(CoroutineScheduler coroutineScheduler, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = coroutineScheduler.controlState;
        }
        return coroutineScheduler.p0(j4);
    }

    private final boolean r0() {
        c D3;
        do {
            D3 = D();
            if (D3 == null) {
                return false;
            }
        } while (!c.f14245h.compareAndSet(D3, -1, 0));
        LockSupport.unpark(D3);
        return true;
    }

    public static /* synthetic */ void v(CoroutineScheduler coroutineScheduler, Runnable runnable, h hVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            hVar = k.f14271f;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        coroutineScheduler.o(runnable, hVar, z3);
    }

    private final int y(c cVar) {
        Object h4 = cVar.h();
        while (h4 != f14235l) {
            if (h4 == null) {
                return 0;
            }
            c cVar2 = (c) h4;
            int g4 = cVar2.g();
            if (g4 != 0) {
                return g4;
            }
            h4 = cVar2.h();
        }
        return -1;
    }

    public final boolean G(c cVar) {
        long j4;
        int g4;
        if (cVar.h() != f14235l) {
            return false;
        }
        do {
            j4 = this.parkedWorkersStack;
            g4 = cVar.g();
            cVar.p(this.f14242g.b((int) (2097151 & j4)));
        } while (!f14232i.compareAndSet(this, j4, ((2097152 + j4) & -2097152) | ((long) g4)));
        return true;
    }

    public final void Q(c cVar, int i4, int i5) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & -2097152;
            if (i6 == i4) {
                if (i5 == 0) {
                    i6 = y(cVar);
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f14232i.compareAndSet(this, j4, j5 | ((long) i6))) {
                    return;
                }
            }
        }
    }

    public final void R(g gVar) {
        try {
            gVar.run();
        } catch (Throwable th) {
            C0730c.a();
            throw th;
        }
        C0730c.a();
    }

    public final void b0(long j4) {
        int i4;
        g gVar;
        if (f14234k.compareAndSet(this, 0, 1)) {
            c m4 = m();
            synchronized (this.f14242g) {
                i4 = (int) (this.controlState & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object b4 = this.f14242g.b(i5);
                    o.b(b4);
                    c cVar = (c) b4;
                    if (cVar != m4) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j4);
                        }
                        cVar.f14246a.g(this.f14241f);
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
            this.f14241f.b();
            this.f14240e.b();
            while (true) {
                if (m4 != null) {
                    gVar = m4.f(true);
                    if (gVar != null) {
                        continue;
                        R(gVar);
                    }
                }
                gVar = (g) this.f14240e.d();
                if (gVar == null && (gVar = (g) this.f14241f.d()) == null) {
                    break;
                }
                R(gVar);
            }
            if (m4 != null) {
                m4.s(WorkerState.TERMINATED);
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    public void close() {
        b0(10000);
    }

    public void execute(Runnable runnable) {
        v(this, runnable, (h) null, false, 6, (Object) null);
    }

    public final g h(Runnable runnable, h hVar) {
        long a4 = k.f14270e.a();
        if (!(runnable instanceof g)) {
            return new j(runnable, a4, hVar);
        }
        g gVar = (g) runnable;
        gVar.f14262a = a4;
        gVar.f14263b = hVar;
        return gVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j0() {
        if (!r0() && !q0(this, 0, 1, (Object) null)) {
            r0();
        }
    }

    public final void o(Runnable runnable, h hVar, boolean z3) {
        boolean z4;
        C0730c.a();
        g h4 = h(runnable, hVar);
        c m4 = m();
        g o02 = o0(m4, h4, z3);
        if (o02 == null || a(o02)) {
            if (!z3 || m4 == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (h4.f14263b.b() != 0) {
                e0(z4);
            } else if (!z4) {
                j0();
            }
        } else {
            throw new RejectedExecutionException(this.f14239d + " was terminated");
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a4 = this.f14242g.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            c cVar = (c) this.f14242g.b(i9);
            if (cVar != null) {
                int f4 = cVar.f14246a.f();
                int i10 = b.f14244a[cVar.f14247b.ordinal()];
                if (i10 == 1) {
                    i6++;
                } else if (i10 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f4);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i10 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f4);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i10 == 4) {
                    i7++;
                    if (f4 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f4);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i10 == 5) {
                    i8++;
                }
            }
        }
        long j4 = this.controlState;
        return this.f14239d + '@' + F.b(this) + "[Pool Size {core = " + this.f14236a + ", max = " + this.f14237b + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f14240e.c() + ", global blocking queue size = " + this.f14241f.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f14236a - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    public final class c extends Thread {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f14245h = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final n f14246a;

        /* renamed from: b  reason: collision with root package name */
        public WorkerState f14247b;

        /* renamed from: c  reason: collision with root package name */
        private long f14248c;

        /* renamed from: d  reason: collision with root package name */
        private long f14249d;

        /* renamed from: e  reason: collision with root package name */
        private int f14250e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14251f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f14246a = new n();
            this.f14247b = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f14235l;
            this.f14250e = Random.Default.nextInt();
        }

        private final void b(int i4) {
            if (i4 != 0) {
                CoroutineScheduler.f14233j.addAndGet(CoroutineScheduler.this, -2097152);
                if (this.f14247b != WorkerState.TERMINATED) {
                    this.f14247b = WorkerState.DORMANT;
                }
            }
        }

        private final void c(int i4) {
            if (i4 != 0 && s(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.j0();
            }
        }

        private final void d(g gVar) {
            int b4 = gVar.f14263b.b();
            i(b4);
            c(b4);
            CoroutineScheduler.this.R(gVar);
            b(b4);
        }

        private final g e(boolean z3) {
            boolean z4;
            g m4;
            g m5;
            if (z3) {
                if (k(CoroutineScheduler.this.f14236a * 2) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && (m5 = m()) != null) {
                    return m5;
                }
                g h4 = this.f14246a.h();
                if (h4 != null) {
                    return h4;
                }
                if (!z4 && (m4 = m()) != null) {
                    return m4;
                }
            } else {
                g m6 = m();
                if (m6 != null) {
                    return m6;
                }
            }
            return t(false);
        }

        private final void i(int i4) {
            this.f14248c = 0;
            if (this.f14247b == WorkerState.PARKING) {
                this.f14247b = WorkerState.BLOCKING;
            }
        }

        private final boolean j() {
            if (this.nextParkedWorker != CoroutineScheduler.f14235l) {
                return true;
            }
            return false;
        }

        private final void l() {
            if (this.f14248c == 0) {
                this.f14248c = System.nanoTime() + CoroutineScheduler.this.f14238c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f14238c);
            if (System.nanoTime() - this.f14248c >= 0) {
                this.f14248c = 0;
                u();
            }
        }

        private final g m() {
            if (k(2) == 0) {
                g gVar = (g) CoroutineScheduler.this.f14240e.d();
                if (gVar != null) {
                    return gVar;
                }
                return (g) CoroutineScheduler.this.f14241f.d();
            }
            g gVar2 = (g) CoroutineScheduler.this.f14241f.d();
            if (gVar2 != null) {
                return gVar2;
            }
            return (g) CoroutineScheduler.this.f14240e.d();
        }

        private final void n() {
            loop0:
            while (true) {
                boolean z3 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f14247b != WorkerState.TERMINATED) {
                    g f4 = f(this.f14251f);
                    if (f4 != null) {
                        this.f14249d = 0;
                        d(f4);
                    } else {
                        this.f14251f = false;
                        if (this.f14249d == 0) {
                            r();
                        } else if (!z3) {
                            z3 = true;
                        } else {
                            s(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f14249d);
                            this.f14249d = 0;
                        }
                    }
                }
            }
            s(WorkerState.TERMINATED);
        }

        private final boolean q() {
            long j4;
            if (this.f14247b == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            do {
                j4 = coroutineScheduler.controlState;
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.f14233j.compareAndSet(coroutineScheduler, j4, j4 - 4398046511104L));
            this.f14247b = WorkerState.CPU_ACQUIRED;
            return true;
        }

        private final void r() {
            if (!j()) {
                CoroutineScheduler.this.G(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f14247b != WorkerState.TERMINATED) {
                s(WorkerState.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final g t(boolean z3) {
            long j4;
            int i4 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i4 < 2) {
                return null;
            }
            int k4 = k(i4);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j5 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                k4++;
                if (k4 > i4) {
                    k4 = 1;
                }
                c cVar = (c) coroutineScheduler.f14242g.b(k4);
                if (!(cVar == null || cVar == this)) {
                    if (z3) {
                        j4 = this.f14246a.k(cVar.f14246a);
                    } else {
                        j4 = this.f14246a.l(cVar.f14246a);
                    }
                    if (j4 == -1) {
                        return this.f14246a.h();
                    }
                    if (j4 > 0) {
                        j5 = Math.min(j5, j4);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f14249d = j5;
            return null;
        }

        private final void u() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f14242g) {
                try {
                    if (!coroutineScheduler.isTerminated()) {
                        if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f14236a) {
                            if (f14245h.compareAndSet(this, -1, 1)) {
                                int i4 = this.indexInArray;
                                o(0);
                                coroutineScheduler.Q(this, i4, 0);
                                int andDecrement = (int) (CoroutineScheduler.f14233j.getAndDecrement(coroutineScheduler) & 2097151);
                                if (andDecrement != i4) {
                                    Object b4 = coroutineScheduler.f14242g.b(andDecrement);
                                    o.b(b4);
                                    c cVar = (c) b4;
                                    coroutineScheduler.f14242g.c(i4, cVar);
                                    cVar.o(i4);
                                    coroutineScheduler.Q(cVar, andDecrement, i4);
                                }
                                coroutineScheduler.f14242g.c(andDecrement, (Object) null);
                                q qVar = q.f14567a;
                                this.f14247b = WorkerState.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g f(boolean z3) {
            g gVar;
            if (q()) {
                return e(z3);
            }
            if (z3) {
                gVar = this.f14246a.h();
                if (gVar == null) {
                    gVar = (g) CoroutineScheduler.this.f14241f.d();
                }
            } else {
                gVar = (g) CoroutineScheduler.this.f14241f.d();
            }
            if (gVar == null) {
                return t(true);
            }
            return gVar;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i4) {
            int i5 = this.f14250e;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f14250e = i8;
            int i9 = i4 - 1;
            if ((i9 & i4) == 0) {
                return i8 & i9;
            }
            return (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void o(int i4) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f14239d);
            sb.append("-worker-");
            if (i4 == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i4);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            n();
        }

        public final boolean s(WorkerState workerState) {
            boolean z3;
            WorkerState workerState2 = this.f14247b;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                CoroutineScheduler.f14233j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f14247b = workerState;
            }
            return z3;
        }

        public c(CoroutineScheduler coroutineScheduler, int i4) {
            this();
            o(i4);
        }
    }
}
