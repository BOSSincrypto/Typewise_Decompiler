package W2;

import c3.C0499a;
import c3.C0500b;
import c3.u;
import c3.w;
import c3.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.s;

public final class g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f1857o = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f1858a;

    /* renamed from: b  reason: collision with root package name */
    private final d f1859b;

    /* renamed from: c  reason: collision with root package name */
    private long f1860c;

    /* renamed from: d  reason: collision with root package name */
    private long f1861d;

    /* renamed from: e  reason: collision with root package name */
    private long f1862e;

    /* renamed from: f  reason: collision with root package name */
    private long f1863f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f1864g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1865h;

    /* renamed from: i  reason: collision with root package name */
    private final c f1866i;

    /* renamed from: j  reason: collision with root package name */
    private final b f1867j;

    /* renamed from: k  reason: collision with root package name */
    private final d f1868k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    private final d f1869l = new d(this);

    /* renamed from: m  reason: collision with root package name */
    private ErrorCode f1870m;

    /* renamed from: n  reason: collision with root package name */
    private IOException f1871n;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public final class b implements u {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1872a;

        /* renamed from: b  reason: collision with root package name */
        private final C0500b f1873b = new C0500b();

        /* renamed from: c  reason: collision with root package name */
        private s f1874c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1875d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f1876e;

        public b(g gVar, boolean z3) {
            o.e(gVar, "this$0");
            this.f1876e = gVar;
            this.f1872a = z3;
        }

        private final void a(boolean z3) {
            long min;
            boolean z4;
            boolean z5;
            g gVar = this.f1876e;
            synchronized (gVar) {
                try {
                    gVar.s().t();
                    while (gVar.r() >= gVar.q() && !f() && !e() && gVar.h() == null) {
                        gVar.F();
                    }
                    gVar.s().A();
                    gVar.c();
                    min = Math.min(gVar.q() - gVar.r(), this.f1873b.w0());
                    gVar.D(gVar.r() + min);
                    if (!z3 || min != this.f1873b.w0()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    z5 = z4;
                    q qVar = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1876e.s().t();
            try {
                this.f1876e.g().V0(this.f1876e.j(), z5, this.f1873b, min);
            } finally {
                this.f1876e.s().A();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (r10.f1876e.o().f1872a != false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
            if (r10.f1873b.w0() <= 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            if (r10.f1874c == null) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
            if (r10.f1873b.w0() <= 0) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
            r0 = r10.f1876e.g();
            r2 = r10.f1876e.j();
            r4 = r10.f1874c;
            kotlin.jvm.internal.o.b(r4);
            r0.W0(r2, r1, Q2.d.O(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            if (r0 == false) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
            if (r10.f1873b.w0() <= 0) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            if (r1 == false) goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
            r10.f1876e.g().V0(r10.f1876e.j(), true, (c3.C0500b) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
            r0 = r10.f1876e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b8, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            h(true);
            r1 = l2.q.f14567a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
            r10.f1876e.g().flush();
            r10.f1876e.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cd, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                W2.g r0 = r10.f1876e
                boolean r1 = Q2.d.f1353h
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                W2.g r0 = r10.f1876e
                monitor-enter(r0)
                boolean r1 = r10.e()     // Catch:{ all -> 0x00d1 }
                if (r1 == 0) goto L_0x003f
                monitor-exit(r0)
                return
            L_0x003f:
                okhttp3.internal.http2.ErrorCode r1 = r0.h()     // Catch:{ all -> 0x00d1 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0049
                r1 = r3
                goto L_0x004a
            L_0x0049:
                r1 = r2
            L_0x004a:
                l2.q r4 = l2.q.f14567a     // Catch:{ all -> 0x00d1 }
                monitor-exit(r0)
                W2.g r0 = r10.f1876e
                W2.g$b r0 = r0.o()
                boolean r0 = r0.f1872a
                if (r0 != 0) goto L_0x00b6
                c3.b r0 = r10.f1873b
                long r4 = r0.w0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0065
                r0 = r3
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                okhttp3.s r4 = r10.f1874c
                if (r4 == 0) goto L_0x0091
            L_0x006a:
                c3.b r0 = r10.f1873b
                long r4 = r0.w0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0078
                r10.a(r2)
                goto L_0x006a
            L_0x0078:
                W2.g r0 = r10.f1876e
                W2.d r0 = r0.g()
                W2.g r2 = r10.f1876e
                int r2 = r2.j()
                okhttp3.s r4 = r10.f1874c
                kotlin.jvm.internal.o.b(r4)
                java.util.List r4 = Q2.d.O(r4)
                r0.W0(r2, r1, r4)
                goto L_0x00b6
            L_0x0091:
                if (r0 == 0) goto L_0x00a1
            L_0x0093:
                c3.b r0 = r10.f1873b
                long r0 = r0.w0()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b6
                r10.a(r3)
                goto L_0x0093
            L_0x00a1:
                if (r1 == 0) goto L_0x00b6
                W2.g r0 = r10.f1876e
                W2.d r4 = r0.g()
                W2.g r0 = r10.f1876e
                int r5 = r0.j()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.V0(r5, r6, r7, r8)
            L_0x00b6:
                W2.g r0 = r10.f1876e
                monitor-enter(r0)
                r10.h(r3)     // Catch:{ all -> 0x00ce }
                l2.q r1 = l2.q.f14567a     // Catch:{ all -> 0x00ce }
                monitor-exit(r0)
                W2.g r0 = r10.f1876e
                W2.d r0 = r0.g()
                r0.flush()
                W2.g r0 = r10.f1876e
                r0.b()
                return
            L_0x00ce:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00d1:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: W2.g.b.close():void");
        }

        public x d() {
            return this.f1876e.s();
        }

        public final boolean e() {
            return this.f1875d;
        }

        public final boolean f() {
            return this.f1872a;
        }

        public void flush() {
            g gVar = this.f1876e;
            if (!Q2.d.f1353h || !Thread.holdsLock(gVar)) {
                g gVar2 = this.f1876e;
                synchronized (gVar2) {
                    gVar2.c();
                    q qVar = q.f14567a;
                }
                while (this.f1873b.w0() > 0) {
                    a(false);
                    this.f1876e.g().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + gVar);
        }

        public final void h(boolean z3) {
            this.f1875d = z3;
        }

        public void z(C0500b bVar, long j4) {
            o.e(bVar, "source");
            g gVar = this.f1876e;
            if (!Q2.d.f1353h || !Thread.holdsLock(gVar)) {
                this.f1873b.z(bVar, j4);
                while (this.f1873b.w0() >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + gVar);
        }
    }

    public final class c implements w {

        /* renamed from: a  reason: collision with root package name */
        private final long f1877a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1878b;

        /* renamed from: c  reason: collision with root package name */
        private final C0500b f1879c = new C0500b();

        /* renamed from: d  reason: collision with root package name */
        private final C0500b f1880d = new C0500b();

        /* renamed from: e  reason: collision with root package name */
        private s f1881e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1882f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f1883g;

        public c(g gVar, long j4, boolean z3) {
            o.e(gVar, "this$0");
            this.f1883g = gVar;
            this.f1877a = j4;
            this.f1878b = z3;
        }

        private final void A(long j4) {
            g gVar = this.f1883g;
            if (!Q2.d.f1353h || !Thread.holdsLock(gVar)) {
                this.f1883g.g().U0(j4);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + gVar);
        }

        /* JADX INFO: finally extract failed */
        public long N(C0500b bVar, long j4) {
            Throwable th;
            boolean z3;
            long j5;
            C0500b bVar2 = bVar;
            long j6 = j4;
            o.e(bVar2, "sink");
            long j7 = 0;
            if (j6 >= 0) {
                while (true) {
                    g gVar = this.f1883g;
                    synchronized (gVar) {
                        gVar.m().t();
                        try {
                            if (gVar.h() == null || e()) {
                                th = null;
                            } else {
                                th = gVar.i();
                                if (th == null) {
                                    ErrorCode h4 = gVar.h();
                                    o.b(h4);
                                    th = new StreamResetException(h4);
                                }
                            }
                            if (!a()) {
                                z3 = false;
                                if (f().w0() > j7) {
                                    j5 = f().N(bVar2, Math.min(j6, f().w0()));
                                    gVar.C(gVar.l() + j5);
                                    long l4 = gVar.l() - gVar.k();
                                    if (th == null && l4 >= ((long) (gVar.g().w0().c() / 2))) {
                                        gVar.g().a1(gVar.j(), l4);
                                        gVar.B(gVar.l());
                                    }
                                } else {
                                    if (!e() && th == null) {
                                        gVar.F();
                                        z3 = true;
                                    }
                                    j5 = -1;
                                }
                                gVar.m().A();
                                q qVar = q.f14567a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            gVar.m().A();
                            throw th2;
                        }
                    }
                    if (z3) {
                        j7 = 0;
                    } else if (j5 != -1) {
                        A(j5);
                        return j5;
                    } else if (th == null) {
                        return -1;
                    } else {
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(o.k("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
        }

        public final boolean a() {
            return this.f1882f;
        }

        public void close() {
            long w02;
            g gVar = this.f1883g;
            synchronized (gVar) {
                o(true);
                w02 = f().w0();
                f().o();
                gVar.notifyAll();
                q qVar = q.f14567a;
            }
            if (w02 > 0) {
                A(w02);
            }
            this.f1883g.b();
        }

        public x d() {
            return this.f1883g.m();
        }

        public final boolean e() {
            return this.f1878b;
        }

        public final C0500b f() {
            return this.f1880d;
        }

        public final C0500b h() {
            return this.f1879c;
        }

        public final void m(c3.d dVar, long j4) {
            boolean e4;
            boolean z3;
            boolean z4;
            long j5;
            o.e(dVar, "source");
            g gVar = this.f1883g;
            if (!Q2.d.f1353h || !Thread.holdsLock(gVar)) {
                while (j4 > 0) {
                    synchronized (this.f1883g) {
                        e4 = e();
                        z3 = false;
                        if (f().w0() + j4 > this.f1877a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q qVar = q.f14567a;
                    }
                    if (z4) {
                        dVar.b(j4);
                        this.f1883g.f(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (e4) {
                        dVar.b(j4);
                        return;
                    } else {
                        long N3 = dVar.N(this.f1879c, j4);
                        if (N3 != -1) {
                            j4 -= N3;
                            g gVar2 = this.f1883g;
                            synchronized (gVar2) {
                                try {
                                    if (a()) {
                                        j5 = h().w0();
                                        h().o();
                                    } else {
                                        if (f().w0() == 0) {
                                            z3 = true;
                                        }
                                        f().D0(h());
                                        if (z3) {
                                            gVar2.notifyAll();
                                        }
                                        j5 = 0;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (j5 > 0) {
                                A(j5);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + gVar);
        }

        public final void o(boolean z3) {
            this.f1882f = z3;
        }

        public final void v(boolean z3) {
            this.f1878b = z3;
        }

        public final void y(s sVar) {
            this.f1881e = sVar;
        }
    }

    public final class d extends C0499a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f1884m;

        public d(g gVar) {
            o.e(gVar, "this$0");
            this.f1884m = gVar;
        }

        public final void A() {
            if (u()) {
                throw v((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void z() {
            this.f1884m.f(ErrorCode.CANCEL);
            this.f1884m.g().N0();
        }
    }

    public g(int i4, d dVar, boolean z3, boolean z4, s sVar) {
        o.e(dVar, "connection");
        this.f1858a = i4;
        this.f1859b = dVar;
        this.f1863f = (long) dVar.x0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1864g = arrayDeque;
        this.f1866i = new c(this, (long) dVar.w0().c(), z4);
        this.f1867j = new b(this, z3);
        if (sVar != null) {
            if (!t()) {
                arrayDeque.add(sVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean e(ErrorCode errorCode, IOException iOException) {
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (h() != null) {
                    return false;
                }
                if (p().e() && o().f()) {
                    return false;
                }
                z(errorCode);
                A(iOException);
                notifyAll();
                q qVar = q.f14567a;
                this.f1859b.M0(this.f1858a);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void A(IOException iOException) {
        this.f1871n = iOException;
    }

    public final void B(long j4) {
        this.f1861d = j4;
    }

    public final void C(long j4) {
        this.f1860c = j4;
    }

    public final void D(long j4) {
        this.f1862e = j4;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized s E() {
        Object removeFirst;
        this.f1868k.t();
        while (this.f1864g.isEmpty() && this.f1870m == null) {
            try {
                F();
            } catch (Throwable th) {
                this.f1868k.A();
                throw th;
            }
        }
        this.f1868k.A();
        if (!this.f1864g.isEmpty()) {
            removeFirst = this.f1864g.removeFirst();
            o.d(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th2 = this.f1871n;
            if (th2 == null) {
                ErrorCode errorCode = this.f1870m;
                o.b(errorCode);
                th2 = new StreamResetException(errorCode);
            }
            throw th2;
        }
        return (s) removeFirst;
    }

    public final void F() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final x G() {
        return this.f1869l;
    }

    public final void a(long j4) {
        this.f1863f += j4;
        if (j4 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z3;
        boolean u3;
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (!p().e() && p().a()) {
                        if (!o().f()) {
                            if (o().e()) {
                            }
                        }
                        z3 = true;
                        u3 = u();
                        q qVar = q.f14567a;
                    }
                    z3 = false;
                    u3 = u();
                    q qVar2 = q.f14567a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                d(ErrorCode.CANCEL, (IOException) null);
            } else if (!u3) {
                this.f1859b.M0(this.f1858a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void c() {
        if (this.f1867j.e()) {
            throw new IOException("stream closed");
        } else if (this.f1867j.f()) {
            throw new IOException("stream finished");
        } else if (this.f1870m != null) {
            Throwable th = this.f1871n;
            if (th == null) {
                ErrorCode errorCode = this.f1870m;
                o.b(errorCode);
                th = new StreamResetException(errorCode);
            }
            throw th;
        }
    }

    public final void d(ErrorCode errorCode, IOException iOException) {
        o.e(errorCode, "rstStatusCode");
        if (e(errorCode, iOException)) {
            this.f1859b.Y0(this.f1858a, errorCode);
        }
    }

    public final void f(ErrorCode errorCode) {
        o.e(errorCode, "errorCode");
        if (e(errorCode, (IOException) null)) {
            this.f1859b.Z0(this.f1858a, errorCode);
        }
    }

    public final d g() {
        return this.f1859b;
    }

    public final synchronized ErrorCode h() {
        return this.f1870m;
    }

    public final IOException i() {
        return this.f1871n;
    }

    public final int j() {
        return this.f1858a;
    }

    public final long k() {
        return this.f1861d;
    }

    public final long l() {
        return this.f1860c;
    }

    public final d m() {
        return this.f1868k;
    }

    public final u n() {
        synchronized (this) {
            try {
                if (!this.f1865h) {
                    if (!t()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1867j;
    }

    public final b o() {
        return this.f1867j;
    }

    public final c p() {
        return this.f1866i;
    }

    public final long q() {
        return this.f1863f;
    }

    public final long r() {
        return this.f1862e;
    }

    public final d s() {
        return this.f1869l;
    }

    public final boolean t() {
        boolean z3;
        if ((this.f1858a & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f1859b.r0() == z3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean u() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.f1870m     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            W2.g$c r0 = r2.f1866i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x001b
            W2.g$c r0 = r2.f1866i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0019:
            r0 = move-exception
            goto L_0x0034
        L_0x001b:
            W2.g$b r0 = r2.f1867j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.f()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002b
            W2.g$b r0 = r2.f1867j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r2.f1865h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r2)
            return r1
        L_0x0031:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.g.u():boolean");
    }

    public final x v() {
        return this.f1868k;
    }

    public final void w(c3.d dVar, int i4) {
        o.e(dVar, "source");
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            this.f1866i.m(dVar, (long) i4);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(okhttp3.s r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.o.e(r3, r0)
            boolean r0 = Q2.d.f1353h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f1865h     // Catch:{ all -> 0x0048 }
            r1 = 1
            if (r0 == 0) goto L_0x004a
            if (r4 != 0) goto L_0x0040
            goto L_0x004a
        L_0x0040:
            W2.g$c r0 = r2.p()     // Catch:{ all -> 0x0048 }
            r0.y(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0051
        L_0x0048:
            r3 = move-exception
            goto L_0x006e
        L_0x004a:
            r2.f1865h = r1     // Catch:{ all -> 0x0048 }
            java.util.ArrayDeque r0 = r2.f1864g     // Catch:{ all -> 0x0048 }
            r0.add(r3)     // Catch:{ all -> 0x0048 }
        L_0x0051:
            if (r4 == 0) goto L_0x005a
            W2.g$c r3 = r2.p()     // Catch:{ all -> 0x0048 }
            r3.v(r1)     // Catch:{ all -> 0x0048 }
        L_0x005a:
            boolean r3 = r2.u()     // Catch:{ all -> 0x0048 }
            r2.notifyAll()     // Catch:{ all -> 0x0048 }
            l2.q r4 = l2.q.f14567a     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006d
            W2.d r3 = r2.f1859b
            int r4 = r2.f1858a
            r3.M0(r4)
        L_0x006d:
            return
        L_0x006e:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.g.x(okhttp3.s, boolean):void");
    }

    public final synchronized void y(ErrorCode errorCode) {
        o.e(errorCode, "errorCode");
        if (this.f1870m == null) {
            this.f1870m = errorCode;
            notifyAll();
        }
    }

    public final void z(ErrorCode errorCode) {
        this.f1870m = errorCode;
    }
}
