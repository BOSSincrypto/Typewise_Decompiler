package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture implements X1.a {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f7372d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f7373e;

    /* renamed from: f  reason: collision with root package name */
    static final b f7374f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f7375g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f7376a;

    /* renamed from: b  reason: collision with root package name */
    volatile d f7377b;

    /* renamed from: c  reason: collision with root package name */
    volatile h f7378c;

    private static final class Failure {

        /* renamed from: b  reason: collision with root package name */
        static final Failure f7379b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a  reason: collision with root package name */
        final Throwable f7380a;

        Failure(Throwable th) {
            this.f7380a = (Throwable) AbstractFuture.e(th);
        }
    }

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(AbstractFuture abstractFuture, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(AbstractFuture abstractFuture, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f7381c;

        /* renamed from: d  reason: collision with root package name */
        static final c f7382d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f7383a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f7384b;

        static {
            if (AbstractFuture.f7372d) {
                f7382d = null;
                f7381c = null;
                return;
            }
            f7382d = new c(false, (Throwable) null);
            f7381c = new c(true, (Throwable) null);
        }

        c(boolean z3, Throwable th) {
            this.f7383a = z3;
            this.f7384b = th;
        }
    }

    private static final class d {

        /* renamed from: d  reason: collision with root package name */
        static final d f7385d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f7386a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f7387b;

        /* renamed from: c  reason: collision with root package name */
        d f7388c;

        d(Runnable runnable, Executor executor) {
            this.f7386a = runnable;
            this.f7387b = executor;
        }
    }

    private static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7389a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7390b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7391c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7392d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f7393e;

        e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f7389a = atomicReferenceFieldUpdater;
            this.f7390b = atomicReferenceFieldUpdater2;
            this.f7391c = atomicReferenceFieldUpdater3;
            this.f7392d = atomicReferenceFieldUpdater4;
            this.f7393e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            return androidx.concurrent.futures.b.a(this.f7392d, abstractFuture, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f7393e, abstractFuture, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f7391c, abstractFuture, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            this.f7390b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            this.f7389a.lazySet(hVar, thread);
        }
    }

    private static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final AbstractFuture f7394a;

        /* renamed from: b  reason: collision with root package name */
        final X1.a f7395b;

        f(AbstractFuture abstractFuture, X1.a aVar) {
            this.f7394a = abstractFuture;
            this.f7395b = aVar;
        }

        public void run() {
            if (this.f7394a.f7376a == this) {
                if (AbstractFuture.f7374f.b(this.f7394a, this, AbstractFuture.j(this.f7395b))) {
                    AbstractFuture.g(this.f7394a);
                }
            }
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(AbstractFuture abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f7377b != dVar) {
                        return false;
                    }
                    abstractFuture.f7377b = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f7376a != obj) {
                        return false;
                    }
                    abstractFuture.f7376a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(AbstractFuture abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f7378c != hVar) {
                        return false;
                    }
                    abstractFuture.f7378c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            hVar.f7398b = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            hVar.f7397a = thread;
        }
    }

    private static final class h {

        /* renamed from: c  reason: collision with root package name */
        static final h f7396c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f7397a;

        /* renamed from: b  reason: collision with root package name */
        volatile h f7398b;

        h(boolean z3) {
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            AbstractFuture.f7374f.d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f7397a;
            if (thread != null) {
                this.f7397a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            AbstractFuture.f7374f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.work.impl.utils.futures.AbstractFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$h> r2 = androidx.work.impl.utils.futures.AbstractFuture.h.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f7372d = r3
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r3 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f7373e = r4
            androidx.work.impl.utils.futures.AbstractFuture$e r4 = new androidx.work.impl.utils.futures.AbstractFuture$e     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$d> r2 = androidx.work.impl.utils.futures.AbstractFuture.d.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$g r4 = new androidx.work.impl.utils.futures.AbstractFuture$g
            r4.<init>()
        L_0x004a:
            f7374f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f7373e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f7375g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    protected AbstractFuture() {
    }

    private void b(StringBuilder sb) {
        try {
            Object k4 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k4));
            sb.append("]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    private d f(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f7377b;
        } while (!f7374f.a(this, dVar2, d.f7385d));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.f7388c;
            dVar5.f7388c = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    static void g(AbstractFuture abstractFuture) {
        d dVar = null;
        while (true) {
            abstractFuture.n();
            abstractFuture.c();
            d f4 = abstractFuture.f(dVar);
            while (true) {
                if (f4 != null) {
                    dVar = f4.f7388c;
                    Runnable runnable = f4.f7386a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        abstractFuture = fVar.f7394a;
                        if (abstractFuture.f7376a == fVar) {
                            if (f7374f.b(abstractFuture, fVar, j(fVar.f7395b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f4.f7387b);
                    }
                    f4 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f7373e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e4);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f7384b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f7380a);
        } else if (obj == f7375g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(X1.a aVar) {
        if (aVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) aVar).f7376a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f7383a) {
                return obj;
            }
            if (cVar.f7384b != null) {
                return new c(false, cVar.f7384b);
            }
            return c.f7382d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f7372d) && isCancelled) {
            return c.f7382d;
        }
        try {
            Object k4 = k(aVar);
            if (k4 == null) {
                return f7375g;
            }
            return k4;
        } catch (ExecutionException e4) {
            return new Failure(e4.getCause());
        } catch (CancellationException e5) {
            if (isCancelled) {
                return new c(false, e5);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e5));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    private static Object k(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void n() {
        h hVar;
        do {
            hVar = this.f7378c;
        } while (!f7374f.c(this, hVar, h.f7396c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f7398b;
        }
    }

    private void o(h hVar) {
        hVar.f7397a = null;
        while (true) {
            h hVar2 = this.f7378c;
            if (hVar2 != h.f7396c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f7398b;
                    if (hVar2.f7397a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f7398b = hVar4;
                        if (hVar3.f7397a == null) {
                        }
                    } else if (!f7374f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        d dVar = this.f7377b;
        if (dVar != d.f7385d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f7388c = dVar;
                if (!f7374f.a(this, dVar, dVar2)) {
                    dVar = this.f7377b;
                } else {
                    return;
                }
            } while (dVar != d.f7385d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, X1.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7376a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f7372d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f7381c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.f7382d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = f7374f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.f) r0
            X1.a r0 = r0.f7395b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.f7376a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f7376a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    public final Object get(long j4, TimeUnit timeUnit) {
        long j5 = j4;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.f7376a;
            if ((obj != null) && (!(obj instanceof f))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f7378c;
                if (hVar != h.f7396c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f7374f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f7376a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(hVar2);
                        } else {
                            hVar = this.f7378c;
                        }
                    } while (hVar != h.f7396c);
                }
                return i(this.f7376a);
            }
            while (nanos > 0) {
                Object obj3 = this.f7376a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j6 = -nanos;
                long convert = timeUnit2.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit2.toNanos(convert);
                int i4 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z3 = i4 == 0 || nanos2 > 1000;
                if (i4 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z3) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z3) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractFuture);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f7376a instanceof c;
    }

    public final boolean isDone() {
        boolean z3;
        Object obj = this.f7376a;
        if (obj != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return (!(obj instanceof f)) & z3;
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f7376a;
        if (obj instanceof f) {
            return "setFuture=[" + s(((f) obj).f7395b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(Object obj) {
        if (obj == null) {
            obj = f7375g;
        }
        if (!f7374f.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (!f7374f.b(this, (Object) null, new Failure((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(X1.a aVar) {
        f fVar;
        Failure failure;
        e(aVar);
        Object obj = this.f7376a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f7374f.b(this, (Object) null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            fVar = new f(this, aVar);
            if (f7374f.b(this, (Object) null, fVar)) {
                try {
                    aVar.a(fVar, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f7379b;
                }
                return true;
            }
            obj = this.f7376a;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f7383a);
        }
        return false;
        f7374f.b(this, fVar, failure);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f7376a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return i(obj2);
            }
            h hVar = this.f7378c;
            if (hVar != h.f7396c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f7374f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f7376a;
                            } else {
                                o(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return i(obj);
                    }
                    hVar = this.f7378c;
                } while (hVar != h.f7396c);
            }
            return i(this.f7376a);
        }
        throw new InterruptedException();
    }
}
