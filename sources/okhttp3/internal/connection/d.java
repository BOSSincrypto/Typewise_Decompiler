package okhttp3.internal.connection;

import U2.g;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import kotlin.jvm.internal.o;
import okhttp3.C;
import okhttp3.C0841a;
import okhttp3.internal.connection.h;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.q;
import okhttp3.t;
import okhttp3.x;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final f f15364a;

    /* renamed from: b  reason: collision with root package name */
    private final C0841a f15365b;

    /* renamed from: c  reason: collision with root package name */
    private final e f15366c;

    /* renamed from: d  reason: collision with root package name */
    private final q f15367d;

    /* renamed from: e  reason: collision with root package name */
    private h.b f15368e;

    /* renamed from: f  reason: collision with root package name */
    private h f15369f;

    /* renamed from: g  reason: collision with root package name */
    private int f15370g;

    /* renamed from: h  reason: collision with root package name */
    private int f15371h;

    /* renamed from: i  reason: collision with root package name */
    private int f15372i;

    /* renamed from: j  reason: collision with root package name */
    private C f15373j;

    public d(f fVar, C0841a aVar, e eVar, q qVar) {
        o.e(fVar, "connectionPool");
        o.e(aVar, "address");
        o.e(eVar, "call");
        o.e(qVar, "eventListener");
        this.f15364a = fVar;
        this.f15365b = aVar;
        this.f15366c = eVar;
        this.f15367d = qVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.RealConnection b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.e r0 = r1.f15366c
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0172
            okhttp3.internal.connection.e r0 = r1.f15366c
            okhttp3.internal.connection.RealConnection r2 = r0.p()
            r3 = 0
            if (r2 == 0) goto L_0x005c
            monitor-enter(r2)
            boolean r0 = r2.q()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0030
            okhttp3.C r0 = r2.A()     // Catch:{ all -> 0x002e }
            okhttp3.a r0 = r0.a()     // Catch:{ all -> 0x002e }
            okhttp3.t r0 = r0.l()     // Catch:{ all -> 0x002e }
            boolean r0 = r14.g(r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = r3
            goto L_0x0036
        L_0x002e:
            r0 = move-exception
            goto L_0x005a
        L_0x0030:
            okhttp3.internal.connection.e r0 = r1.f15366c     // Catch:{ all -> 0x002e }
            java.net.Socket r0 = r0.z()     // Catch:{ all -> 0x002e }
        L_0x0036:
            l2.q r4 = l2.q.f14567a     // Catch:{ all -> 0x002e }
            monitor-exit(r2)
            okhttp3.internal.connection.e r4 = r1.f15366c
            okhttp3.internal.connection.RealConnection r4 = r4.p()
            if (r4 == 0) goto L_0x004c
            if (r0 != 0) goto L_0x0044
            return r2
        L_0x0044:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            Q2.d.n(r0)
        L_0x0052:
            okhttp3.q r0 = r1.f15367d
            okhttp3.internal.connection.e r4 = r1.f15366c
            r0.k(r4, r2)
            goto L_0x005c
        L_0x005a:
            monitor-exit(r2)
            throw r0
        L_0x005c:
            r0 = 0
            r1.f15370g = r0
            r1.f15371h = r0
            r1.f15372i = r0
            okhttp3.internal.connection.f r2 = r1.f15364a
            okhttp3.a r4 = r1.f15365b
            okhttp3.internal.connection.e r5 = r1.f15366c
            boolean r2 = r2.a(r4, r5, r3, r0)
            if (r2 == 0) goto L_0x0080
            okhttp3.internal.connection.e r0 = r1.f15366c
            okhttp3.internal.connection.RealConnection r0 = r0.p()
            kotlin.jvm.internal.o.b(r0)
            okhttp3.q r2 = r1.f15367d
            okhttp3.internal.connection.e r3 = r1.f15366c
            r2.j(r3, r0)
            return r0
        L_0x0080:
            okhttp3.C r2 = r1.f15373j
            if (r2 == 0) goto L_0x008b
            kotlin.jvm.internal.o.b(r2)
            r1.f15373j = r3
        L_0x0089:
            r4 = r3
            goto L_0x00f0
        L_0x008b:
            okhttp3.internal.connection.h$b r2 = r1.f15368e
            if (r2 == 0) goto L_0x00a2
            kotlin.jvm.internal.o.b(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00a2
            okhttp3.internal.connection.h$b r0 = r1.f15368e
            kotlin.jvm.internal.o.b(r0)
            okhttp3.C r2 = r0.c()
            goto L_0x0089
        L_0x00a2:
            okhttp3.internal.connection.h r2 = r1.f15369f
            if (r2 != 0) goto L_0x00bd
            okhttp3.internal.connection.h r2 = new okhttp3.internal.connection.h
            okhttp3.a r4 = r1.f15365b
            okhttp3.internal.connection.e r5 = r1.f15366c
            okhttp3.x r5 = r5.o()
            okhttp3.internal.connection.g r5 = r5.v()
            okhttp3.internal.connection.e r6 = r1.f15366c
            okhttp3.q r7 = r1.f15367d
            r2.<init>(r4, r5, r6, r7)
            r1.f15369f = r2
        L_0x00bd:
            okhttp3.internal.connection.h$b r2 = r2.c()
            r1.f15368e = r2
            java.util.List r4 = r2.a()
            okhttp3.internal.connection.e r5 = r1.f15366c
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x016a
            okhttp3.internal.connection.f r5 = r1.f15364a
            okhttp3.a r6 = r1.f15365b
            okhttp3.internal.connection.e r7 = r1.f15366c
            boolean r0 = r5.a(r6, r7, r4, r0)
            if (r0 == 0) goto L_0x00ec
            okhttp3.internal.connection.e r0 = r1.f15366c
            okhttp3.internal.connection.RealConnection r0 = r0.p()
            kotlin.jvm.internal.o.b(r0)
            okhttp3.q r2 = r1.f15367d
            okhttp3.internal.connection.e r3 = r1.f15366c
            r2.j(r3, r0)
            return r0
        L_0x00ec:
            okhttp3.C r2 = r2.c()
        L_0x00f0:
            okhttp3.internal.connection.RealConnection r13 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.f r0 = r1.f15364a
            r13.<init>(r0, r2)
            okhttp3.internal.connection.e r0 = r1.f15366c
            r0.B(r13)
            okhttp3.internal.connection.e r11 = r1.f15366c     // Catch:{ all -> 0x0163 }
            okhttp3.q r12 = r1.f15367d     // Catch:{ all -> 0x0163 }
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.g(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0163 }
            okhttp3.internal.connection.e r0 = r1.f15366c
            r0.B(r3)
            okhttp3.internal.connection.e r0 = r1.f15366c
            okhttp3.x r0 = r0.o()
            okhttp3.internal.connection.g r0 = r0.v()
            okhttp3.C r3 = r13.A()
            r0.a(r3)
            okhttp3.internal.connection.f r0 = r1.f15364a
            okhttp3.a r3 = r1.f15365b
            okhttp3.internal.connection.e r5 = r1.f15366c
            r6 = 1
            boolean r0 = r0.a(r3, r5, r4, r6)
            if (r0 == 0) goto L_0x014a
            okhttp3.internal.connection.e r0 = r1.f15366c
            okhttp3.internal.connection.RealConnection r0 = r0.p()
            kotlin.jvm.internal.o.b(r0)
            r1.f15373j = r2
            java.net.Socket r2 = r13.E()
            Q2.d.n(r2)
            okhttp3.q r2 = r1.f15367d
            okhttp3.internal.connection.e r3 = r1.f15366c
            r2.j(r3, r0)
            return r0
        L_0x014a:
            monitor-enter(r13)
            okhttp3.internal.connection.f r0 = r1.f15364a     // Catch:{ all -> 0x0160 }
            r0.e(r13)     // Catch:{ all -> 0x0160 }
            okhttp3.internal.connection.e r0 = r1.f15366c     // Catch:{ all -> 0x0160 }
            r0.d(r13)     // Catch:{ all -> 0x0160 }
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x0160 }
            monitor-exit(r13)
            okhttp3.q r0 = r1.f15367d
            okhttp3.internal.connection.e r2 = r1.f15366c
            r0.j(r2, r13)
            return r13
        L_0x0160:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0163:
            r0 = move-exception
            okhttp3.internal.connection.e r2 = r1.f15366c
            r2.B(r3)
            throw r0
        L_0x016a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0172:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.d.b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection c(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        boolean z5;
        while (true) {
            RealConnection b4 = b(i4, i5, i6, i7, z3);
            if (b4.v(z4)) {
                return b4;
            }
            b4.z();
            if (this.f15373j == null) {
                h.b bVar = this.f15368e;
                boolean z6 = true;
                if (bVar == null) {
                    z5 = true;
                } else {
                    z5 = bVar.b();
                }
                if (!z5) {
                    h hVar = this.f15369f;
                    if (hVar != null) {
                        z6 = hVar.a();
                    }
                    if (!z6) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final C f() {
        RealConnection p4;
        if (this.f15370g > 1 || this.f15371h > 1 || this.f15372i > 0 || (p4 = this.f15366c.p()) == null) {
            return null;
        }
        synchronized (p4) {
            if (p4.r() != 0) {
                return null;
            }
            if (!Q2.d.j(p4.A().a().l(), d().l())) {
                return null;
            }
            C A3 = p4.A();
            return A3;
        }
    }

    public final U2.d a(x xVar, g gVar) {
        o.e(xVar, "client");
        o.e(gVar, "chain");
        try {
            return c(gVar.g(), gVar.i(), gVar.k(), xVar.z(), xVar.F(), !o.a(gVar.j().g(), HttpRequest.METHOD_GET)).x(xVar, gVar);
        } catch (RouteException e4) {
            h(e4.getLastConnectException());
            throw e4;
        } catch (IOException e5) {
            h(e5);
            throw new RouteException(e5);
        }
    }

    public final C0841a d() {
        return this.f15365b;
    }

    public final boolean e() {
        h hVar;
        if (this.f15370g == 0 && this.f15371h == 0 && this.f15372i == 0) {
            return false;
        }
        if (this.f15373j != null) {
            return true;
        }
        C f4 = f();
        if (f4 != null) {
            this.f15373j = f4;
            return true;
        }
        h.b bVar = this.f15368e;
        if ((bVar != null && bVar.b()) || (hVar = this.f15369f) == null) {
            return true;
        }
        return hVar.a();
    }

    public final boolean g(t tVar) {
        o.e(tVar, "url");
        t l4 = this.f15365b.l();
        if (tVar.n() != l4.n() || !o.a(tVar.i(), l4.i())) {
            return false;
        }
        return true;
    }

    public final void h(IOException iOException) {
        o.e(iOException, "e");
        this.f15373j = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f15370g++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.f15371h++;
        } else {
            this.f15372i++;
        }
    }
}
