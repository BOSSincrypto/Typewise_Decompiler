package c3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: c3.a  reason: case insensitive filesystem */
public class C0499a extends x {

    /* renamed from: i  reason: collision with root package name */
    public static final C0127a f7637i = new C0127a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final long f7638j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final long f7639k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static C0499a f7640l;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f7641f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C0499a f7642g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f7643h;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    public static final class C0127a {
        public /* synthetic */ C0127a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean d(C0499a aVar) {
            synchronized (C0499a.class) {
                if (!aVar.f7641f) {
                    return false;
                }
                aVar.f7641f = false;
                for (C0499a i4 = C0499a.f7640l; i4 != null; i4 = i4.f7642g) {
                    if (i4.f7642g == aVar) {
                        i4.f7642g = aVar.f7642g;
                        aVar.f7642g = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        public final void e(C0499a aVar, long j4, boolean z3) {
            synchronized (C0499a.class) {
                try {
                    if (!aVar.f7641f) {
                        aVar.f7641f = true;
                        if (C0499a.f7640l == null) {
                            C0499a.f7640l = new C0499a();
                            new b().start();
                        }
                        long nanoTime = System.nanoTime();
                        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                        if (i4 != 0 && z3) {
                            aVar.f7643h = Math.min(j4, aVar.c() - nanoTime) + nanoTime;
                        } else if (i4 != 0) {
                            aVar.f7643h = j4 + nanoTime;
                        } else if (z3) {
                            aVar.f7643h = aVar.c();
                        } else {
                            throw new AssertionError();
                        }
                        long o4 = aVar.w(nanoTime);
                        C0499a i5 = C0499a.f7640l;
                        o.b(i5);
                        while (true) {
                            if (i5.f7642g == null) {
                                break;
                            }
                            C0499a m4 = i5.f7642g;
                            o.b(m4);
                            if (o4 < m4.w(nanoTime)) {
                                break;
                            }
                            i5 = i5.f7642g;
                            o.b(i5);
                        }
                        aVar.f7642g = i5.f7642g;
                        i5.f7642g = aVar;
                        if (i5 == C0499a.f7640l) {
                            C0499a.class.notify();
                        }
                        q qVar = q.f14567a;
                    } else {
                        throw new IllegalStateException("Unbalanced enter/exit");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C0499a c() {
            C0499a i4 = C0499a.f7640l;
            o.b(i4);
            C0499a m4 = i4.f7642g;
            Class<C0499a> cls = C0499a.class;
            if (m4 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(C0499a.f7638j);
                C0499a i5 = C0499a.f7640l;
                o.b(i5);
                if (i5.f7642g != null || System.nanoTime() - nanoTime < C0499a.f7639k) {
                    return null;
                }
                return C0499a.f7640l;
            }
            long o4 = m4.w(System.nanoTime());
            if (o4 > 0) {
                long j4 = o4 / 1000000;
                cls.wait(j4, (int) (o4 - (1000000 * j4)));
                return null;
            }
            C0499a i6 = C0499a.f7640l;
            o.b(i6);
            i6.f7642g = m4.f7642g;
            m4.f7642g = null;
            return m4;
        }

        private C0127a() {
        }
    }

    /* renamed from: c3.a$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
            r1.z();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<c3.a> r0 = c3.C0499a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                c3.a$a r1 = c3.C0499a.f7637i     // Catch:{ all -> 0x0015 }
                c3.a r1 = r1.c()     // Catch:{ all -> 0x0015 }
                c3.a r2 = c3.C0499a.f7640l     // Catch:{ all -> 0x0015 }
                if (r1 != r2) goto L_0x0017
                r1 = 0
                c3.C0499a.f7640l = r1     // Catch:{ all -> 0x0015 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                r1 = move-exception
                goto L_0x0020
            L_0x0017:
                l2.q r2 = l2.q.f14567a     // Catch:{ all -> 0x0015 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.z()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0020:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.C0499a.b.run():void");
        }
    }

    /* renamed from: c3.a$c */
    public static final class c implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0499a f7644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f7645b;

        c(C0499a aVar, u uVar) {
            this.f7644a = aVar;
            this.f7645b = uVar;
        }

        /* renamed from: a */
        public C0499a d() {
            return this.f7644a;
        }

        public void close() {
            C0499a aVar = this.f7644a;
            u uVar = this.f7645b;
            aVar.t();
            try {
                uVar.close();
                q qVar = q.f14567a;
                if (aVar.u()) {
                    throw aVar.n((IOException) null);
                }
            } catch (IOException e4) {
                e = e4;
                if (aVar.u()) {
                    e = aVar.n(e);
                }
                throw e;
            } finally {
                aVar.u();
            }
        }

        public void flush() {
            C0499a aVar = this.f7644a;
            u uVar = this.f7645b;
            aVar.t();
            try {
                uVar.flush();
                q qVar = q.f14567a;
                if (aVar.u()) {
                    throw aVar.n((IOException) null);
                }
            } catch (IOException e4) {
                e = e4;
                if (aVar.u()) {
                    e = aVar.n(e);
                }
                throw e;
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f7645b + ')';
        }

        public void z(C0500b bVar, long j4) {
            o.e(bVar, "source");
            B.b(bVar.w0(), 0, j4);
            while (true) {
                long j5 = 0;
                if (j4 > 0) {
                    r rVar = bVar.f7648a;
                    o.b(rVar);
                    while (true) {
                        if (j5 >= 65536) {
                            break;
                        }
                        j5 += (long) (rVar.f7685c - rVar.f7684b);
                        if (j5 >= j4) {
                            j5 = j4;
                            break;
                        } else {
                            rVar = rVar.f7688f;
                            o.b(rVar);
                        }
                    }
                    C0499a aVar = this.f7644a;
                    u uVar = this.f7645b;
                    aVar.t();
                    try {
                        uVar.z(bVar, j5);
                        q qVar = q.f14567a;
                        if (!aVar.u()) {
                            j4 -= j5;
                        } else {
                            throw aVar.n((IOException) null);
                        }
                    } catch (IOException e4) {
                        e = e4;
                        if (aVar.u()) {
                            e = aVar.n(e);
                        }
                        throw e;
                    } finally {
                        aVar.u();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c3.a$d */
    public static final class d implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0499a f7646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f7647b;

        d(C0499a aVar, w wVar) {
            this.f7646a = aVar;
            this.f7647b = wVar;
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            C0499a aVar = this.f7646a;
            w wVar = this.f7647b;
            aVar.t();
            try {
                long N3 = wVar.N(bVar, j4);
                if (!aVar.u()) {
                    return N3;
                }
                throw aVar.n((IOException) null);
            } catch (IOException e4) {
                e = e4;
                if (aVar.u()) {
                    e = aVar.n(e);
                }
                throw e;
            } finally {
                aVar.u();
            }
        }

        /* renamed from: a */
        public C0499a d() {
            return this.f7646a;
        }

        public void close() {
            C0499a aVar = this.f7646a;
            w wVar = this.f7647b;
            aVar.t();
            try {
                wVar.close();
                q qVar = q.f14567a;
                if (aVar.u()) {
                    throw aVar.n((IOException) null);
                }
            } catch (IOException e4) {
                e = e4;
                if (aVar.u()) {
                    e = aVar.n(e);
                }
                throw e;
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f7647b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f7638j = millis;
        f7639k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long w(long j4) {
        return this.f7643h - j4;
    }

    public final IOException n(IOException iOException) {
        return v(iOException);
    }

    public final void t() {
        long h4 = h();
        boolean e4 = e();
        if (h4 != 0 || e4) {
            f7637i.e(this, h4, e4);
        }
    }

    public final boolean u() {
        return f7637i.d(this);
    }

    /* access modifiers changed from: protected */
    public IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final u x(u uVar) {
        o.e(uVar, "sink");
        return new c(this, uVar);
    }

    public final w y(w wVar) {
        o.e(wVar, "source");
        return new d(this, wVar);
    }

    /* access modifiers changed from: protected */
    public void z() {
    }
}
