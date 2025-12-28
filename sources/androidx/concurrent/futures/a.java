package androidx.concurrent.futures;

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

public abstract class a implements X1.a {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f3745d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f3746e;

    /* renamed from: f  reason: collision with root package name */
    static final b f3747f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f3748g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f3749a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f3750b;

    /* renamed from: c  reason: collision with root package name */
    volatile h f3751c;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a aVar, h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(h hVar, h hVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f3752c;

        /* renamed from: d  reason: collision with root package name */
        static final c f3753d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f3754a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f3755b;

        static {
            if (a.f3745d) {
                f3753d = null;
                f3752c = null;
                return;
            }
            f3753d = new c(false, (Throwable) null);
            f3752c = new c(true, (Throwable) null);
        }

        c(boolean z3, Throwable th) {
            this.f3754a = z3;
            this.f3755b = th;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Throwable f3756a;
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f3757d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f3758a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f3759b;

        /* renamed from: c  reason: collision with root package name */
        e f3760c;

        e(Runnable runnable, Executor executor) {
            this.f3758a = runnable;
            this.f3759b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3761a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3762b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3763c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3764d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater f3765e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f3761a = atomicReferenceFieldUpdater;
            this.f3762b = atomicReferenceFieldUpdater2;
            this.f3763c = atomicReferenceFieldUpdater3;
            this.f3764d = atomicReferenceFieldUpdater4;
            this.f3765e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            return b.a(this.f3764d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            return b.a(this.f3765e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            return b.a(this.f3763c, aVar, hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            this.f3762b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            this.f3761a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3750b != eVar) {
                        return false;
                    }
                    aVar.f3750b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3749a != obj) {
                        return false;
                    }
                    aVar.f3749a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f3751c != hVar) {
                        return false;
                    }
                    aVar.f3751c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(h hVar, h hVar2) {
            hVar.f3768b = hVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(h hVar, Thread thread) {
            hVar.f3767a = thread;
        }
    }

    private static final class h {

        /* renamed from: c  reason: collision with root package name */
        static final h f3766c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f3767a;

        /* renamed from: b  reason: collision with root package name */
        volatile h f3768b;

        h(boolean z3) {
        }

        /* access modifiers changed from: package-private */
        public void a(h hVar) {
            a.f3747f.d(this, hVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f3767a;
            if (thread != null) {
                this.f3767a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f3747f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.concurrent.futures.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<androidx.concurrent.futures.a$h> r2 = androidx.concurrent.futures.a.h.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f3745d = r3
            java.lang.Class<androidx.concurrent.futures.a> r3 = androidx.concurrent.futures.a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f3746e = r4
            androidx.concurrent.futures.a$f r4 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            androidx.concurrent.futures.a$g r4 = new androidx.concurrent.futures.a$g
            r4.<init>()
        L_0x004a:
            f3747f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f3746e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f3748g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private void b(StringBuilder sb) {
        try {
            Object j4 = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(p(j4));
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

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3750b;
        } while (!f3747f.a(this, eVar2, e.f3757d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f3760c;
            eVar5.f3760c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a aVar) {
        aVar.m();
        aVar.c();
        e f4 = aVar.f((e) null);
        while (f4 != null) {
            e eVar = f4.f3760c;
            h(f4.f3758a, f4.f3759b);
            f4 = eVar;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Logger logger = f3746e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e4);
        }
    }

    private Object i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f3755b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3756a);
        } else if (obj == f3748g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(Future future) {
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

    private void m() {
        h hVar;
        do {
            hVar = this.f3751c;
        } while (!f3747f.c(this, hVar, h.f3766c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f3768b;
        }
    }

    private void n(h hVar) {
        hVar.f3767a = null;
        while (true) {
            h hVar2 = this.f3751c;
            if (hVar2 != h.f3766c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f3768b;
                    if (hVar2.f3767a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f3768b = hVar4;
                        if (hVar3.f3767a == null) {
                        }
                    } else if (!f3747f.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private String p(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f3750b;
        if (eVar != e.f3757d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3760c = eVar;
                if (!f3747f.a(this, eVar, eVar2)) {
                    eVar = this.f3750b;
                } else {
                    return;
                }
            } while (eVar != e.f3757d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public final boolean cancel(boolean z3) {
        boolean z4;
        c cVar;
        Object obj = this.f3749a;
        if (obj == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (f3745d) {
                cVar = new c(z3, new CancellationException("Future.cancel() was called."));
            } else if (z3) {
                cVar = c.f3752c;
            } else {
                cVar = c.f3753d;
            }
            if (f3747f.b(this, obj, cVar)) {
                if (z3) {
                    k();
                }
                g(this);
                return true;
            }
        }
        return false;
    }

    public final Object get(long j4, TimeUnit timeUnit) {
        long j5 = j4;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j5);
        if (!Thread.interrupted()) {
            Object obj = this.f3749a;
            if (obj != null) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f3751c;
                if (hVar != h.f3766c) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (f3747f.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3749a;
                                    if (obj2 != null) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    n(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            n(hVar2);
                        } else {
                            hVar = this.f3751c;
                        }
                    } while (hVar != h.f3766c);
                }
                return i(this.f3749a);
            }
            while (nanos > 0) {
                Object obj3 = this.f3749a;
                if (obj3 != null) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
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
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f3749a instanceof c;
    }

    public final boolean isDone() {
        if (this.f3749a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public String l() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    public boolean o(Object obj) {
        if (obj == null) {
            obj = f3748g;
        }
        if (!f3747f.b(this, (Object) null, obj)) {
            return false;
        }
        g(this);
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
                str = l();
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
        boolean z3;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3749a;
            if (obj2 != null) {
                return i(obj2);
            }
            h hVar = this.f3751c;
            if (hVar != h.f3766c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f3747f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3749a;
                                if (obj != null) {
                                    z3 = true;
                                    continue;
                                } else {
                                    z3 = false;
                                    continue;
                                }
                            } else {
                                n(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!z3);
                        return i(obj);
                    }
                    hVar = this.f3751c;
                } while (hVar != h.f3766c);
            }
            return i(this.f3749a);
        }
        throw new InterruptedException();
    }
}
