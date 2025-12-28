package okhttp3.internal.connection;

import Q2.d;
import U2.g;
import X2.k;
import c3.C0499a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.o;
import okhttp3.C0841a;
import okhttp3.CertificatePinner;
import okhttp3.f;
import okhttp3.q;
import okhttp3.t;
import okhttp3.x;
import okhttp3.y;

public final class e implements okhttp3.e {

    /* renamed from: a  reason: collision with root package name */
    private final x f15374a;

    /* renamed from: b  reason: collision with root package name */
    private final y f15375b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15376c;

    /* renamed from: d  reason: collision with root package name */
    private final f f15377d;

    /* renamed from: e  reason: collision with root package name */
    private final q f15378e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f15379f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f15380g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private Object f15381h;

    /* renamed from: i  reason: collision with root package name */
    private d f15382i;

    /* renamed from: j  reason: collision with root package name */
    private RealConnection f15383j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15384k;

    /* renamed from: l  reason: collision with root package name */
    private c f15385l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15386m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15387n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15388o = true;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f15389p;

    /* renamed from: q  reason: collision with root package name */
    private volatile c f15390q;

    /* renamed from: v  reason: collision with root package name */
    private volatile RealConnection f15391v;

    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f15392a;

        /* renamed from: b  reason: collision with root package name */
        private volatile AtomicInteger f15393b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f15394c;

        public a(e eVar, f fVar) {
            o.e(eVar, "this$0");
            o.e(fVar, "responseCallback");
            this.f15394c = eVar;
            this.f15392a = fVar;
        }

        public final void a(ExecutorService executorService) {
            o.e(executorService, "executorService");
            okhttp3.o q4 = this.f15394c.o().q();
            if (!d.f1353h || !Thread.holdsLock(q4)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f15394c.x(interruptedIOException);
                    this.f15392a.b(this.f15394c, interruptedIOException);
                    this.f15394c.o().q().e(this);
                } catch (Throwable th) {
                    this.f15394c.o().q().e(this);
                    throw th;
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + q4);
            }
        }

        public final e b() {
            return this.f15394c;
        }

        public final AtomicInteger c() {
            return this.f15393b;
        }

        public final String d() {
            return this.f15394c.t().j().i();
        }

        public final void e(a aVar) {
            o.e(aVar, "other");
            this.f15393b = aVar.f15393b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[Catch:{ all -> 0x005a, all -> 0x0037 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[Catch:{ all -> 0x005a, all -> 0x0037 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0078 A[Catch:{ all -> 0x005a, all -> 0x0037 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                okhttp3.internal.connection.e r0 = r8.f15394c
                java.lang.String r0 = r0.y()
                java.lang.String r1 = "OkHttp "
                java.lang.String r0 = kotlin.jvm.internal.o.k(r1, r0)
                okhttp3.internal.connection.e r1 = r8.f15394c
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                okhttp3.internal.connection.e$c r0 = r1.f15379f     // Catch:{ all -> 0x0037 }
                r0.t()     // Catch:{ all -> 0x0037 }
                r0 = 0
                okhttp3.A r0 = r1.u()     // Catch:{ IOException -> 0x005d, all -> 0x003d }
                r4 = 1
                okhttp3.f r5 = r8.f15392a     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
                r5.a(r1, r0)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
                okhttp3.x r0 = r1.o()     // Catch:{ all -> 0x0037 }
                okhttp3.o r0 = r0.q()     // Catch:{ all -> 0x0037 }
            L_0x0033:
                r0.e(r8)     // Catch:{ all -> 0x0037 }
                goto L_0x0086
            L_0x0037:
                r0 = move-exception
                goto L_0x0096
            L_0x0039:
                r0 = move-exception
                goto L_0x0041
            L_0x003b:
                r0 = move-exception
                goto L_0x0061
            L_0x003d:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x0041:
                r1.cancel()     // Catch:{ all -> 0x005a }
                if (r4 != 0) goto L_0x005c
                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005a }
                java.lang.String r5 = "canceled due to "
                java.lang.String r5 = kotlin.jvm.internal.o.k(r5, r0)     // Catch:{ all -> 0x005a }
                r4.<init>(r5)     // Catch:{ all -> 0x005a }
                l2.C0793c.a(r4, r0)     // Catch:{ all -> 0x005a }
                okhttp3.f r5 = r8.f15392a     // Catch:{ all -> 0x005a }
                r5.b(r1, r4)     // Catch:{ all -> 0x005a }
                goto L_0x005c
            L_0x005a:
                r0 = move-exception
                goto L_0x008a
            L_0x005c:
                throw r0     // Catch:{ all -> 0x005a }
            L_0x005d:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x0061:
                if (r4 == 0) goto L_0x0078
                X2.k$a r4 = X2.k.f1971a     // Catch:{ all -> 0x005a }
                X2.k r4 = r4.g()     // Catch:{ all -> 0x005a }
                java.lang.String r5 = "Callback failure for "
                java.lang.String r6 = r1.E()     // Catch:{ all -> 0x005a }
                java.lang.String r5 = kotlin.jvm.internal.o.k(r5, r6)     // Catch:{ all -> 0x005a }
                r6 = 4
                r4.j(r5, r6, r0)     // Catch:{ all -> 0x005a }
                goto L_0x007d
            L_0x0078:
                okhttp3.f r4 = r8.f15392a     // Catch:{ all -> 0x005a }
                r4.b(r1, r0)     // Catch:{ all -> 0x005a }
            L_0x007d:
                okhttp3.x r0 = r1.o()     // Catch:{ all -> 0x0037 }
                okhttp3.o r0 = r0.q()     // Catch:{ all -> 0x0037 }
                goto L_0x0033
            L_0x0086:
                r2.setName(r3)
                return
            L_0x008a:
                okhttp3.x r1 = r1.o()     // Catch:{ all -> 0x0037 }
                okhttp3.o r1 = r1.q()     // Catch:{ all -> 0x0037 }
                r1.e(r8)     // Catch:{ all -> 0x0037 }
                throw r0     // Catch:{ all -> 0x0037 }
            L_0x0096:
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.a.run():void");
        }
    }

    public static final class b extends WeakReference {

        /* renamed from: a  reason: collision with root package name */
        private final Object f15395a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            o.e(eVar, "referent");
            this.f15395a = obj;
        }

        public final Object a() {
            return this.f15395a;
        }
    }

    public static final class c extends C0499a {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f15396m;

        c(e eVar) {
            this.f15396m = eVar;
        }

        /* access modifiers changed from: protected */
        public void z() {
            this.f15396m.cancel();
        }
    }

    public e(x xVar, y yVar, boolean z3) {
        o.e(xVar, "client");
        o.e(yVar, "originalRequest");
        this.f15374a = xVar;
        this.f15375b = yVar;
        this.f15376c = z3;
        this.f15377d = xVar.n().a();
        this.f15378e = xVar.s().a(this);
        c cVar = new c(this);
        cVar.g((long) o().j(), TimeUnit.MILLISECONDS);
        this.f15379f = cVar;
    }

    private final IOException D(IOException iOException) {
        if (this.f15384k || !this.f15379f.u()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String E() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (e()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f15376c) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(y());
        return sb.toString();
    }

    private final IOException g(IOException iOException) {
        Socket z3;
        boolean z4 = d.f1353h;
        if (!z4 || !Thread.holdsLock(this)) {
            RealConnection realConnection = this.f15383j;
            if (realConnection != null) {
                if (!z4 || !Thread.holdsLock(realConnection)) {
                    synchronized (realConnection) {
                        z3 = z();
                    }
                    if (this.f15383j == null) {
                        if (z3 != null) {
                            d.n(z3);
                        }
                        this.f15378e.k(this, realConnection);
                    } else if (z3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + realConnection);
                }
            }
            IOException D3 = D(iOException);
            if (iOException != null) {
                q qVar = this.f15378e;
                o.b(D3);
                qVar.d(this, D3);
            } else {
                this.f15378e.c(this);
            }
            return D3;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    private final void i() {
        this.f15381h = k.f1971a.g().h("response.body().close()");
        this.f15378e.e(this);
    }

    private final C0841a k(t tVar) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.j()) {
            sSLSocketFactory = this.f15374a.H();
            hostnameVerifier = this.f15374a.w();
            certificatePinner = this.f15374a.k();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new C0841a(tVar.i(), tVar.n(), this.f15374a.r(), this.f15374a.G(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.f15374a.C(), this.f15374a.B(), this.f15374a.A(), this.f15374a.o(), this.f15374a.D());
    }

    public final boolean A() {
        d dVar = this.f15382i;
        o.b(dVar);
        return dVar.e();
    }

    public final void B(RealConnection realConnection) {
        this.f15391v = realConnection;
    }

    public final void C() {
        if (!this.f15384k) {
            this.f15384k = true;
            this.f15379f.u();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public y a() {
        return this.f15375b;
    }

    public void cancel() {
        if (!this.f15389p) {
            this.f15389p = true;
            c cVar = this.f15390q;
            if (cVar != null) {
                cVar.b();
            }
            RealConnection realConnection = this.f15391v;
            if (realConnection != null) {
                realConnection.e();
            }
            this.f15378e.f(this);
        }
    }

    public final void d(RealConnection realConnection) {
        o.e(realConnection, "connection");
        if (d.f1353h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        } else if (this.f15383j == null) {
            this.f15383j = realConnection;
            realConnection.o().add(new b(this, this.f15381h));
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean e() {
        return this.f15389p;
    }

    public void h(f fVar) {
        o.e(fVar, "responseCallback");
        if (this.f15380g.compareAndSet(false, true)) {
            i();
            this.f15374a.q().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    /* renamed from: j */
    public e clone() {
        return new e(this.f15374a, this.f15375b, this.f15376c);
    }

    public final void l(y yVar, boolean z3) {
        o.e(yVar, "request");
        if (this.f15385l == null) {
            synchronized (this) {
                if (this.f15387n) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                } else if (!this.f15386m) {
                    l2.q qVar = l2.q.f14567a;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z3) {
                this.f15382i = new d(this.f15377d, k(yVar.j()), this, this.f15378e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void n(boolean z3) {
        c cVar;
        synchronized (this) {
            if (this.f15388o) {
                l2.q qVar = l2.q.f14567a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z3 && (cVar = this.f15390q) != null) {
            cVar.d();
        }
        this.f15385l = null;
    }

    public final x o() {
        return this.f15374a;
    }

    public final RealConnection p() {
        return this.f15383j;
    }

    public final q q() {
        return this.f15378e;
    }

    public final boolean r() {
        return this.f15376c;
    }

    public final c s() {
        return this.f15385l;
    }

    public final y t() {
        return this.f15375b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.A u() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.x r0 = r12.f15374a
            java.util.List r0 = r0.x()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.C0718m.z(r2, r0)
            U2.j r0 = new U2.j
            okhttp3.x r1 = r12.f15374a
            r0.<init>(r1)
            r2.add(r0)
            U2.a r0 = new U2.a
            okhttp3.x r1 = r12.f15374a
            okhttp3.m r1 = r1.p()
            r0.<init>(r1)
            r2.add(r0)
            S2.a r0 = new S2.a
            okhttp3.x r1 = r12.f15374a
            r1.i()
            r9 = 0
            r0.<init>(r9)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.a.f15341a
            r2.add(r0)
            boolean r0 = r12.f15376c
            if (r0 != 0) goto L_0x004a
            okhttp3.x r0 = r12.f15374a
            java.util.List r0 = r0.y()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.C0718m.z(r2, r0)
        L_0x004a:
            U2.b r0 = new U2.b
            boolean r1 = r12.f15376c
            r0.<init>(r1)
            r2.add(r0)
            U2.g r10 = new U2.g
            okhttp3.y r5 = r12.f15375b
            okhttp3.x r0 = r12.f15374a
            int r6 = r0.l()
            okhttp3.x r0 = r12.f15374a
            int r7 = r0.E()
            okhttp3.x r0 = r12.f15374a
            int r8 = r0.J()
            r3 = 0
            r4 = 0
            r0 = r10
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            okhttp3.y r1 = r12.f15375b     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            okhttp3.A r1 = r10.b(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            boolean r2 = r12.e()     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            if (r2 != 0) goto L_0x0082
            r12.x(r9)
            return r1
        L_0x0082:
            Q2.d.m(r1)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x008f, all -> 0x008d }
            throw r1     // Catch:{ IOException -> 0x008f, all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            goto L_0x00a5
        L_0x008f:
            r0 = move-exception
            r1 = 1
            java.io.IOException r0 = r12.x(r0)     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x00a4
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x00a5
        L_0x00a4:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x00a5:
            if (r0 != 0) goto L_0x00aa
            r12.x(r9)
        L_0x00aa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.u():okhttp3.A");
    }

    public final c v(g gVar) {
        o.e(gVar, "chain");
        synchronized (this) {
            if (!this.f15388o) {
                throw new IllegalStateException("released");
            } else if (this.f15387n) {
                throw new IllegalStateException("Check failed.");
            } else if (!this.f15386m) {
                l2.q qVar = l2.q.f14567a;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        d dVar = this.f15382i;
        o.b(dVar);
        c cVar = new c(this, this.f15378e, dVar, dVar.a(this.f15374a, gVar));
        this.f15385l = cVar;
        this.f15390q = cVar;
        synchronized (this) {
            this.f15386m = true;
            this.f15387n = true;
        }
        if (!this.f15389p) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException w(okhttp3.internal.connection.c r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.o.e(r2, r0)
            okhttp3.internal.connection.c r0 = r1.f15390q
            boolean r2 = kotlin.jvm.internal.o.a(r2, r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f15386m     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x005a
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.f15387n     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f15386m = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f15387n = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f15386m     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f15387n     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = r4
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f15387n     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f15388o     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = r4
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            l2.q r4 = l2.q.f14567a     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0052
            r2 = 0
            r1.f15390q = r2
            okhttp3.internal.connection.RealConnection r2 = r1.f15383j
            if (r2 != 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            r2.t()
        L_0x0052:
            if (r3 == 0) goto L_0x0059
            java.io.IOException r2 = r1.g(r5)
            return r2
        L_0x0059:
            return r5
        L_0x005a:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.w(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException x(IOException iOException) {
        boolean z3;
        synchronized (this) {
            try {
                z3 = false;
                if (this.f15388o) {
                    this.f15388o = false;
                    if (!this.f15386m && !this.f15387n) {
                        z3 = true;
                    }
                }
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return g(iOException);
        }
        return iOException;
    }

    public final String y() {
        return this.f15375b.j().p();
    }

    public final Socket z() {
        RealConnection realConnection = this.f15383j;
        o.b(realConnection);
        if (!d.f1353h || Thread.holdsLock(realConnection)) {
            List o4 = realConnection.o();
            Iterator it = o4.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (o.a(((Reference) it.next()).get(), this)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 != -1) {
                o4.remove(i4);
                this.f15383j = null;
                if (o4.isEmpty()) {
                    realConnection.C(System.nanoTime());
                    if (this.f15377d.c(realConnection)) {
                        return realConnection.E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
    }
}
