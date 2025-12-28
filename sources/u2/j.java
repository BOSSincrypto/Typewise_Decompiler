package U2;

import Q2.d;
import com.silkimen.http.HttpRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import okhttp3.A;
import okhttp3.C;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.e;
import okhttp3.t;
import okhttp3.u;
import okhttp3.x;
import okhttp3.y;
import okhttp3.z;

public final class j implements u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1529b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final x f1530a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public j(x xVar) {
        o.e(xVar, "client");
        this.f1530a = xVar;
    }

    private final y b(A a4, String str) {
        String A3;
        t q4;
        boolean z3;
        z zVar = null;
        if (!this.f1530a.t() || (A3 = A.A(a4, HttpRequest.HEADER_LOCATION, (String) null, 2, (Object) null)) == null || (q4 = a4.o0().j().q(A3)) == null) {
            return null;
        }
        if (!o.a(q4.r(), a4.o0().j().r()) && !this.f1530a.u()) {
            return null;
        }
        y.a h4 = a4.o0().h();
        if (f.a(str)) {
            int m4 = a4.m();
            f fVar = f.f1515a;
            if (fVar.c(str) || m4 == 308 || m4 == 307) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!fVar.b(str) || m4 == 308 || m4 == 307) {
                if (z3) {
                    zVar = a4.o0().a();
                }
                h4.g(str, zVar);
            } else {
                h4.g(HttpRequest.METHOD_GET, (z) null);
            }
            if (!z3) {
                h4.h("Transfer-Encoding");
                h4.h(HttpRequest.HEADER_CONTENT_LENGTH);
                h4.h(HttpRequest.HEADER_CONTENT_TYPE);
            }
        }
        if (!d.j(a4.o0().j(), q4)) {
            h4.h(HttpRequest.HEADER_AUTHORIZATION);
        }
        return h4.p(q4).b();
    }

    private final y c(A a4, c cVar) {
        C c4;
        RealConnection h4;
        if (cVar == null || (h4 = cVar.h()) == null) {
            c4 = null;
        } else {
            c4 = h4.A();
        }
        int m4 = a4.m();
        String g4 = a4.o0().g();
        if (!(m4 == 307 || m4 == 308)) {
            if (m4 == 401) {
                return this.f1530a.g().a(c4, a4);
            }
            if (m4 == 421) {
                z a5 = a4.o0().a();
                if ((a5 != null && a5.f()) || cVar == null || !cVar.l()) {
                    return null;
                }
                cVar.h().y();
                return a4.o0();
            } else if (m4 == 503) {
                A e02 = a4.e0();
                if ((e02 == null || e02.m() != 503) && g(a4, Integer.MAX_VALUE) == 0) {
                    return a4.o0();
                }
                return null;
            } else if (m4 == 407) {
                o.b(c4);
                if (c4.b().type() == Proxy.Type.HTTP) {
                    return this.f1530a.C().a(c4, a4);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (m4 != 408) {
                switch (m4) {
                    case 300:
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        return null;
                }
            } else if (!this.f1530a.F()) {
                return null;
            } else {
                z a6 = a4.o0().a();
                if (a6 != null && a6.f()) {
                    return null;
                }
                A e03 = a4.e0();
                if ((e03 == null || e03.m() != 408) && g(a4, 0) <= 0) {
                    return a4.o0();
                }
                return null;
            }
        }
        return b(a4, g4);
    }

    private final boolean d(IOException iOException, boolean z3) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z3) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean e(IOException iOException, e eVar, y yVar, boolean z3) {
        if (!this.f1530a.F()) {
            return false;
        }
        if ((!z3 || !f(iOException, yVar)) && d(iOException, z3) && eVar.A()) {
            return true;
        }
        return false;
    }

    private final boolean f(IOException iOException, y yVar) {
        z a4 = yVar.a();
        if ((a4 == null || !a4.f()) && !(iOException instanceof FileNotFoundException)) {
            return false;
        }
        return true;
    }

    private final int g(A a4, int i4) {
        String A3 = A.A(a4, "Retry-After", (String) null, 2, (Object) null);
        if (A3 == null) {
            return i4;
        }
        if (!new Regex("\\d+").matches(A3)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(A3);
        o.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.b0().p(r7.b0().b((okhttp3.B) null).c()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.s();
        r6 = c(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.m() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1.C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.n(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r0.f() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.n(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r7.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        Q2.d.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r8 > 20) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        throw new java.net.ProtocolException(kotlin.jvm.internal.o.k("Too many follow-up requests: ", java.lang.Integer.valueOf(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.A a(okhttp3.u.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.o.e(r11, r0)
            U2.g r11 = (U2.g) r11
            okhttp3.y r0 = r11.j()
            okhttp3.internal.connection.e r1 = r11.f()
            java.util.List r2 = kotlin.collections.C0718m.j()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.l(r0, r6)
            boolean r6 = r1.e()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x00cd
            okhttp3.A r0 = r11.b(r0)     // Catch:{ RouteException -> 0x00ae, IOException -> 0x0093 }
            if (r7 == 0) goto L_0x0040
            okhttp3.A$a r0 = r0.b0()     // Catch:{ all -> 0x0042 }
            okhttp3.A$a r6 = r7.b0()     // Catch:{ all -> 0x0042 }
            okhttp3.A$a r6 = r6.b(r4)     // Catch:{ all -> 0x0042 }
            okhttp3.A r6 = r6.c()     // Catch:{ all -> 0x0042 }
            okhttp3.A$a r0 = r0.p(r6)     // Catch:{ all -> 0x0042 }
            okhttp3.A r0 = r0.c()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r7 = r0
            goto L_0x0045
        L_0x0042:
            r11 = move-exception
            goto L_0x00d5
        L_0x0045:
            okhttp3.internal.connection.c r0 = r1.s()     // Catch:{ all -> 0x0042 }
            okhttp3.y r6 = r10.c(r7, r0)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005a
            boolean r11 = r0.m()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x005a
            r1.C()     // Catch:{ all -> 0x0042 }
        L_0x005a:
            r1.n(r3)
            return r7
        L_0x005e:
            okhttp3.z r0 = r6.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.f()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            r1.n(r3)
            return r7
        L_0x006e:
            okhttp3.B r0 = r7.a()     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            Q2.d.m(r0)     // Catch:{ all -> 0x0042 }
        L_0x0078:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x0083
            r1.n(r5)
            r0 = r6
            goto L_0x0018
        L_0x0083:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Too many follow-up requests: "
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = kotlin.jvm.internal.o.k(r0, r2)     // Catch:{ all -> 0x0042 }
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x0093:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0042 }
            r9 = r9 ^ r5
            boolean r9 = r10.e(r6, r1, r0, r9)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00a9
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.util.List r2 = kotlin.collections.C0718m.j0(r2, r6)     // Catch:{ all -> 0x0042 }
        L_0x00a3:
            r1.n(r5)
            r6 = r3
            goto L_0x0019
        L_0x00a9:
            java.lang.Throwable r11 = Q2.d.Y(r6, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00ae:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch:{ all -> 0x0042 }
            boolean r9 = r10.e(r9, r1, r0, r3)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00c4
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch:{ all -> 0x0042 }
            java.util.List r2 = kotlin.collections.C0718m.j0(r2, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x00a3
        L_0x00c4:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch:{ all -> 0x0042 }
            java.lang.Throwable r11 = Q2.d.Y(r11, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00cd:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00d5:
            r1.n(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.j.a(okhttp3.u$a):okhttp3.A");
    }
}
