package T2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final b f1471h = new b((i) null);

    /* renamed from: i  reason: collision with root package name */
    public static final e f1472i = new e(new c(Q2.d.M(o.k(Q2.d.f1354i, " TaskRunner"), true)));
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f1473j;

    /* renamed from: a  reason: collision with root package name */
    private final a f1474a;

    /* renamed from: b  reason: collision with root package name */
    private int f1475b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1476c;

    /* renamed from: d  reason: collision with root package name */
    private long f1477d;

    /* renamed from: e  reason: collision with root package name */
    private final List f1478e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f1479f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f1480g = new d(this);

    public interface a {
        void a(e eVar, long j4);

        void b(e eVar);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final Logger a() {
            return e.f1473j;
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadPoolExecutor f1481a;

        public c(ThreadFactory threadFactory) {
            o.e(threadFactory, "threadFactory");
            this.f1481a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(e eVar, long j4) {
            o.e(eVar, "taskRunner");
            long j5 = j4 / 1000000;
            long j6 = j4 - (1000000 * j5);
            if (j5 > 0 || j4 > 0) {
                eVar.wait(j5, (int) j6);
            }
        }

        public void b(e eVar) {
            o.e(eVar, "taskRunner");
            eVar.notify();
        }

        public long c() {
            return System.nanoTime();
        }

        public void execute(Runnable runnable) {
            o.e(runnable, "runnable");
            this.f1481a.execute(runnable);
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f1482a;

        d(e eVar) {
            this.f1482a = eVar;
        }

        public void run() {
            a d4;
            long j4;
            while (true) {
                e eVar = this.f1482a;
                synchronized (eVar) {
                    d4 = eVar.d();
                }
                if (d4 != null) {
                    d d5 = d4.d();
                    o.b(d5);
                    e eVar2 = this.f1482a;
                    boolean isLoggable = e.f1471h.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j4 = d5.h().g().c();
                        b.c(d4, d5, "starting");
                    } else {
                        j4 = -1;
                    }
                    try {
                        eVar2.j(d4);
                        q qVar = q.f14567a;
                        if (isLoggable) {
                            b.c(d4, d5, o.k("finished run in ", b.b(d5.h().g().c() - j4)));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            b.c(d4, d5, o.k("failed a run in ", b.b(d5.h().g().c() - j4)));
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        o.d(logger, "getLogger(TaskRunner::class.java.name)");
        f1473j = logger;
    }

    public e(a aVar) {
        o.e(aVar, "backend");
        this.f1474a = aVar;
    }

    private final void c(a aVar, long j4) {
        if (!Q2.d.f1353h || Thread.holdsLock(this)) {
            d d4 = aVar.d();
            o.b(d4);
            if (d4.c() == aVar) {
                boolean d5 = d4.d();
                d4.m(false);
                d4.l((a) null);
                this.f1478e.remove(d4);
                if (j4 != -1 && !d5 && !d4.g()) {
                    d4.k(aVar, j4, true);
                }
                if (!d4.e().isEmpty()) {
                    this.f1479f.add(d4);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void e(a aVar) {
        if (!Q2.d.f1353h || Thread.holdsLock(this)) {
            aVar.g(-1);
            d d4 = aVar.d();
            o.b(d4);
            d4.e().remove(aVar);
            this.f1479f.remove(d4);
            d4.l(aVar);
            this.f1478e.add(d4);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* access modifiers changed from: private */
    public final void j(a aVar) {
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f4 = aVar.f();
                synchronized (this) {
                    c(aVar, f4);
                    q qVar = q.f14567a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    c(aVar, -1);
                    q qVar2 = q.f14567a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T2.a d() {
        /*
            r14 = this;
            boolean r0 = Q2.d.f1353h
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List r0 = r14.f1479f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            T2.e$a r0 = r14.f1474a
            long r2 = r0.c()
            java.util.List r0 = r14.f1479f
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            T2.d r7 = (T2.d) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            T2.a r7 = (T2.a) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009e
            r14.e(r6)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r14.f1476c
            if (r0 != 0) goto L_0x009d
            java.util.List r0 = r14.f1479f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
        L_0x0096:
            T2.e$a r0 = r14.f1474a
            java.lang.Runnable r1 = r14.f1480g
            r0.execute(r1)
        L_0x009d:
            return r6
        L_0x009e:
            boolean r0 = r14.f1476c
            if (r0 == 0) goto L_0x00af
            long r6 = r14.f1477d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            T2.e$a r0 = r14.f1474a
            r0.b(r14)
        L_0x00ae:
            return r1
        L_0x00af:
            r14.f1476c = r8
            long r2 = r2 + r4
            r14.f1477d = r2
            T2.e$a r0 = r14.f1474a     // Catch:{ InterruptedException -> 0x00bf }
            r0.a(r14, r4)     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b9:
            r14.f1476c = r9
            goto L_0x0032
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r14.f()     // Catch:{ all -> 0x00bd }
            goto L_0x00b9
        L_0x00c3:
            r14.f1476c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.d():T2.a");
    }

    public final void f() {
        int size = this.f1478e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                ((d) this.f1478e.get(size)).b();
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        int size2 = this.f1479f.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i5 = size2 - 1;
                d dVar = (d) this.f1479f.get(size2);
                dVar.b();
                if (dVar.e().isEmpty()) {
                    this.f1479f.remove(size2);
                }
                if (i5 >= 0) {
                    size2 = i5;
                } else {
                    return;
                }
            }
        }
    }

    public final a g() {
        return this.f1474a;
    }

    public final void h(d dVar) {
        o.e(dVar, "taskQueue");
        if (!Q2.d.f1353h || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    Q2.d.c(this.f1479f, dVar);
                } else {
                    this.f1479f.remove(dVar);
                }
            }
            if (this.f1476c) {
                this.f1474a.b(this);
            } else {
                this.f1474a.execute(this.f1480g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    public final d i() {
        int i4;
        synchronized (this) {
            i4 = this.f1475b;
            this.f1475b = i4 + 1;
        }
        return new d(this, o.k("Q", Integer.valueOf(i4)));
    }
}
