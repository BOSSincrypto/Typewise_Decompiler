package okhttp3.internal.connection;

import T2.e;
import W2.d;
import W2.g;
import X2.k;
import c3.c;
import com.getcapacitor.PluginMethod;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.C;
import okhttp3.C0841a;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.i;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.q;
import okhttp3.t;
import okhttp3.x;
import okhttp3.y;
import okhttp3.z;

public final class RealConnection extends d.c implements i {

    /* renamed from: t  reason: collision with root package name */
    public static final a f15322t = new a((kotlin.jvm.internal.i) null);

    /* renamed from: c  reason: collision with root package name */
    private final f f15323c;

    /* renamed from: d  reason: collision with root package name */
    private final C f15324d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f15325e;

    /* renamed from: f  reason: collision with root package name */
    private Socket f15326f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Handshake f15327g;

    /* renamed from: h  reason: collision with root package name */
    private Protocol f15328h;

    /* renamed from: i  reason: collision with root package name */
    private d f15329i;

    /* renamed from: j  reason: collision with root package name */
    private c3.d f15330j;

    /* renamed from: k  reason: collision with root package name */
    private c f15331k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15332l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15333m;

    /* renamed from: n  reason: collision with root package name */
    private int f15334n;

    /* renamed from: o  reason: collision with root package name */
    private int f15335o;

    /* renamed from: p  reason: collision with root package name */
    private int f15336p;

    /* renamed from: q  reason: collision with root package name */
    private int f15337q = 1;

    /* renamed from: r  reason: collision with root package name */
    private final List f15338r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    private long f15339s = Long.MAX_VALUE;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15340a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f15340a = iArr;
        }
    }

    public RealConnection(f fVar, C c4) {
        o.e(fVar, "connectionPool");
        o.e(c4, "route");
        this.f15323c = fVar;
        this.f15324d = c4;
    }

    private final boolean B(List list) {
        Iterable<C> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C c4 : iterable) {
            Proxy.Type type = c4.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f15324d.b().type() == type2 && o.a(this.f15324d.d(), c4.d())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int i4) {
        Socket socket = this.f15326f;
        o.b(socket);
        c3.d dVar = this.f15330j;
        o.b(dVar);
        c cVar = this.f15331k;
        o.b(cVar);
        socket.setSoTimeout(0);
        d a4 = new d.a(true, e.f1472i).s(socket, this.f15324d.a().l().i(), dVar, cVar).k(this).l(i4).a();
        this.f15329i = a4;
        this.f15337q = d.f1736G.a().d();
        d.T0(a4, false, (e) null, 3, (Object) null);
    }

    private final boolean G(t tVar) {
        Handshake handshake;
        if (!Q2.d.f1353h || Thread.holdsLock(this)) {
            t l4 = this.f15324d.a().l();
            if (tVar.n() != l4.n()) {
                return false;
            }
            if (o.a(tVar.i(), l4.i())) {
                return true;
            }
            if (this.f15333m || (handshake = this.f15327g) == null) {
                return false;
            }
            o.b(handshake);
            if (f(tVar, handshake)) {
                return true;
            }
            return false;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean f(t tVar, Handshake handshake) {
        List d4 = handshake.d();
        if (d4.isEmpty() || !a3.d.f2320a.e(tVar.i(), (X509Certificate) d4.get(0))) {
            return false;
        }
        return true;
    }

    private final void i(int i4, int i5, okhttp3.e eVar, q qVar) {
        int i6;
        Socket socket;
        Proxy b4 = this.f15324d.b();
        C0841a a4 = this.f15324d.a();
        Proxy.Type type = b4.type();
        if (type == null) {
            i6 = -1;
        } else {
            i6 = b.f15340a[type.ordinal()];
        }
        if (i6 == 1 || i6 == 2) {
            socket = a4.j().createSocket();
            o.b(socket);
        } else {
            socket = new Socket(b4);
        }
        this.f15325e = socket;
        qVar.i(eVar, this.f15324d.d(), b4);
        socket.setSoTimeout(i5);
        try {
            k.f1971a.g().f(socket, this.f15324d.d(), i4);
            try {
                this.f15330j = c3.k.b(c3.k.f(socket));
                this.f15331k = c3.k.a(c3.k.d(socket));
            } catch (NullPointerException e4) {
                if (o.a(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException(o.k("Failed to connect to ", this.f15324d.d()));
            connectException.initCause(e5);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(okhttp3.internal.connection.b r11) {
        /*
            r10 = this;
            okhttp3.C r0 = r10.f15324d
            okhttp3.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            kotlin.jvm.internal.o.b(r1)     // Catch:{ all -> 0x016c }
            java.net.Socket r3 = r10.f15325e     // Catch:{ all -> 0x016c }
            okhttp3.t r4 = r0.l()     // Catch:{ all -> 0x016c }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x016c }
            okhttp3.t r5 = r0.l()     // Catch:{ all -> 0x016c }
            int r5 = r5.n()     // Catch:{ all -> 0x016c }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x016c }
            if (r1 == 0) goto L_0x016e
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x016c }
            okhttp3.k r11 = r11.a(r1)     // Catch:{ all -> 0x0049 }
            boolean r3 = r11.h()     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x004d
            X2.k$a r3 = X2.k.f1971a     // Catch:{ all -> 0x0049 }
            X2.k r3 = r3.g()     // Catch:{ all -> 0x0049 }
            okhttp3.t r4 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.i()     // Catch:{ all -> 0x0049 }
            java.util.List r5 = r0.f()     // Catch:{ all -> 0x0049 }
            r3.e(r1, r4, r5)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r11 = move-exception
            r2 = r1
            goto L_0x0176
        L_0x004d:
            r1.startHandshake()     // Catch:{ all -> 0x0049 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x0049 }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.f15151e     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.o.d(r3, r5)     // Catch:{ all -> 0x0049 }
            okhttp3.Handshake r4 = r4.a(r3)     // Catch:{ all -> 0x0049 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ all -> 0x0049 }
            kotlin.jvm.internal.o.b(r5)     // Catch:{ all -> 0x0049 }
            okhttp3.t r7 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x0049 }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x0100
            java.util.List r11 = r4.d()     // Catch:{ all -> 0x0049 }
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0049 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r3 != 0) goto L_0x00dc
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0049 }
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x0049 }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            okhttp3.t r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            okhttp3.CertificatePinner$b r0 = okhttp3.CertificatePinner.f15146c     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.a(r11)     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0049 }
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            a3.d r0 = a3.d.f2320a     // Catch:{ all -> 0x0049 }
            java.util.List r11 = r0.a(r11)     // Catch:{ all -> 0x0049 }
            r4.append(r11)     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0049 }
            java.lang.String r11 = kotlin.text.o.h(r11, r2, r6, r2)     // Catch:{ all -> 0x0049 }
            r3.<init>(r11)     // Catch:{ all -> 0x0049 }
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x00dc:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r2.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x0049 }
            okhttp3.t r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            r2.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0049 }
            r11.<init>(r0)     // Catch:{ all -> 0x0049 }
            throw r11     // Catch:{ all -> 0x0049 }
        L_0x0100:
            okhttp3.CertificatePinner r3 = r0.a()     // Catch:{ all -> 0x0049 }
            kotlin.jvm.internal.o.b(r3)     // Catch:{ all -> 0x0049 }
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x0049 }
            okhttp3.TlsVersion r6 = r4.e()     // Catch:{ all -> 0x0049 }
            okhttp3.h r7 = r4.a()     // Catch:{ all -> 0x0049 }
            java.util.List r8 = r4.c()     // Catch:{ all -> 0x0049 }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x0049 }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x0049 }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x0049 }
            r10.f15327g = r5     // Catch:{ all -> 0x0049 }
            okhttp3.t r0 = r0.l()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0049 }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x0049 }
            r4.<init>(r10)     // Catch:{ all -> 0x0049 }
            r3.b(r0, r4)     // Catch:{ all -> 0x0049 }
            boolean r11 = r11.h()     // Catch:{ all -> 0x0049 }
            if (r11 == 0) goto L_0x013f
            X2.k$a r11 = X2.k.f1971a     // Catch:{ all -> 0x0049 }
            X2.k r11 = r11.g()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r11.g(r1)     // Catch:{ all -> 0x0049 }
        L_0x013f:
            r10.f15326f = r1     // Catch:{ all -> 0x0049 }
            c3.w r11 = c3.k.f(r1)     // Catch:{ all -> 0x0049 }
            c3.d r11 = c3.k.b(r11)     // Catch:{ all -> 0x0049 }
            r10.f15330j = r11     // Catch:{ all -> 0x0049 }
            c3.u r11 = c3.k.d(r1)     // Catch:{ all -> 0x0049 }
            c3.c r11 = c3.k.a(r11)     // Catch:{ all -> 0x0049 }
            r10.f15331k = r11     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x015e
            okhttp3.Protocol$a r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x0049 }
            okhttp3.Protocol r11 = r11.a(r2)     // Catch:{ all -> 0x0049 }
            goto L_0x0160
        L_0x015e:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x0049 }
        L_0x0160:
            r10.f15328h = r11     // Catch:{ all -> 0x0049 }
            X2.k$a r11 = X2.k.f1971a
            X2.k r11 = r11.g()
            r11.b(r1)
            return
        L_0x016c:
            r11 = move-exception
            goto L_0x0176
        L_0x016e:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x016c }
            throw r11     // Catch:{ all -> 0x016c }
        L_0x0176:
            if (r2 == 0) goto L_0x0181
            X2.k$a r0 = X2.k.f1971a
            X2.k r0 = r0.g()
            r0.b(r2)
        L_0x0181:
            if (r2 != 0) goto L_0x0184
            goto L_0x0187
        L_0x0184:
            Q2.d.n(r2)
        L_0x0187:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.j(okhttp3.internal.connection.b):void");
    }

    private final void k(int i4, int i5, int i6, okhttp3.e eVar, q qVar) {
        y m4 = m();
        t j4 = m4.j();
        int i7 = 0;
        while (i7 < 21) {
            i7++;
            i(i4, i5, eVar, qVar);
            m4 = l(i5, i6, m4, j4);
            if (m4 != null) {
                Socket socket = this.f15325e;
                if (socket != null) {
                    Q2.d.n(socket);
                }
                this.f15325e = null;
                this.f15331k = null;
                this.f15330j = null;
                qVar.g(eVar, this.f15324d.d(), this.f15324d.b(), (Protocol) null);
            } else {
                return;
            }
        }
    }

    private final y l(int i4, int i5, y yVar, t tVar) {
        String str = "CONNECT " + Q2.d.Q(tVar, true) + " HTTP/1.1";
        while (true) {
            c3.d dVar = this.f15330j;
            o.b(dVar);
            c cVar = this.f15331k;
            o.b(cVar);
            V2.b bVar = new V2.b((x) null, this, dVar, cVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.d().g((long) i4, timeUnit);
            cVar.d().g((long) i5, timeUnit);
            bVar.A(yVar.e(), str);
            bVar.a();
            A.a g4 = bVar.g(false);
            o.b(g4);
            A c4 = g4.s(yVar).c();
            bVar.z(c4);
            int m4 = c4.m();
            if (m4 != 200) {
                if (m4 == 407) {
                    y a4 = this.f15324d.a().h().a(this.f15324d, c4);
                    if (a4 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if (kotlin.text.o.v("close", A.A(c4, "Connection", (String) null, 2, (Object) null), true)) {
                        return a4;
                    } else {
                        yVar = a4;
                    }
                } else {
                    throw new IOException(o.k("Unexpected response code for CONNECT: ", Integer.valueOf(c4.m())));
                }
            } else if (dVar.c().H() && cVar.c().H()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private final y m() {
        y b4 = new y.a().p(this.f15324d.a().l()).g("CONNECT", (z) null).e("Host", Q2.d.Q(this.f15324d.a().l(), true)).e("Proxy-Connection", "Keep-Alive").e(HttpRequest.HEADER_USER_AGENT, "okhttp/4.11.0").b();
        y a4 = this.f15324d.a().h().a(this.f15324d, new A.a().s(b4).q(Protocol.HTTP_1_1).g(407).n("Preemptive Authenticate").b(Q2.d.f1348c).t(-1).r(-1).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        if (a4 == null) {
            return b4;
        }
        return a4;
    }

    private final void n(b bVar, int i4, okhttp3.e eVar, q qVar) {
        if (this.f15324d.a().k() == null) {
            List f4 = this.f15324d.a().f();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (f4.contains(protocol)) {
                this.f15326f = this.f15325e;
                this.f15328h = protocol;
                F(i4);
                return;
            }
            this.f15326f = this.f15325e;
            this.f15328h = Protocol.HTTP_1_1;
            return;
        }
        qVar.B(eVar);
        j(bVar);
        qVar.A(eVar, this.f15327g);
        if (this.f15328h == Protocol.HTTP_2) {
            F(i4);
        }
    }

    public C A() {
        return this.f15324d;
    }

    public final void C(long j4) {
        this.f15339s = j4;
    }

    public final void D(boolean z3) {
        this.f15332l = z3;
    }

    public Socket E() {
        Socket socket = this.f15326f;
        o.b(socket);
        return socket;
    }

    public final synchronized void H(e eVar, IOException iOException) {
        try {
            o.e(eVar, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i4 = this.f15336p + 1;
                    this.f15336p = i4;
                    if (i4 > 1) {
                        this.f15332l = true;
                        this.f15334n++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !eVar.e()) {
                    this.f15332l = true;
                    this.f15334n++;
                }
            } else if (!w() || (iOException instanceof ConnectionShutdownException)) {
                this.f15332l = true;
                if (this.f15335o == 0) {
                    if (iOException != null) {
                        h(eVar.o(), this.f15324d, iOException);
                    }
                    this.f15334n++;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public Protocol a() {
        Protocol protocol = this.f15328h;
        o.b(protocol);
        return protocol;
    }

    public synchronized void b(d dVar, W2.k kVar) {
        o.e(dVar, "connection");
        o.e(kVar, "settings");
        this.f15337q = kVar.d();
    }

    public void c(g gVar) {
        o.e(gVar, "stream");
        gVar.d(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public final void e() {
        Socket socket = this.f15325e;
        if (socket != null) {
            Q2.d.n(socket);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009c A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r17, int r18, int r19, int r20, boolean r21, okhttp3.e r22, okhttp3.q r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.o.e(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.o.e(r9, r0)
            okhttp3.Protocol r0 = r7.f15328h
            if (r0 != 0) goto L_0x0159
            okhttp3.C r0 = r7.f15324d
            okhttp3.a r0 = r0.a()
            java.util.List r0 = r0.b()
            okhttp3.internal.connection.b r10 = new okhttp3.internal.connection.b
            r10.<init>(r0)
            okhttp3.C r1 = r7.f15324d
            okhttp3.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0080
            okhttp3.k r1 = okhttp3.k.f15432k
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0073
            okhttp3.C r0 = r7.f15324d
            okhttp3.a r0 = r0.a()
            okhttp3.t r0 = r0.l()
            java.lang.String r0 = r0.i()
            X2.k$a r1 = X2.k.f1971a
            X2.k r1 = r1.g()
            boolean r1 = r1.i(r0)
            if (r1 == 0) goto L_0x0052
            goto L_0x0092
        L_0x0052:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0073:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0080:
            okhttp3.C r0 = r7.f15324d
            okhttp3.a r0 = r0.a()
            java.util.List r0 = r0.f()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014c
        L_0x0092:
            r11 = 0
            r12 = r11
        L_0x0094:
            okhttp3.C r0 = r7.f15324d     // Catch:{ IOException -> 0x00b7 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00b7 }
            if (r0 == 0) goto L_0x00bf
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00b7 }
            java.net.Socket r0 = r7.f15325e     // Catch:{ IOException -> 0x00b7 }
            if (r0 != 0) goto L_0x00b0
            goto L_0x00db
        L_0x00b0:
            r13 = r17
            r14 = r18
        L_0x00b4:
            r15 = r20
            goto L_0x00c7
        L_0x00b7:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00bc:
            r15 = r20
            goto L_0x0100
        L_0x00bf:
            r13 = r17
            r14 = r18
            r7.i(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00fe }
            goto L_0x00b4
        L_0x00c7:
            r7.n(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00fc }
            okhttp3.C r0 = r7.f15324d     // Catch:{ IOException -> 0x00fc }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00fc }
            okhttp3.C r1 = r7.f15324d     // Catch:{ IOException -> 0x00fc }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00fc }
            okhttp3.Protocol r2 = r7.f15328h     // Catch:{ IOException -> 0x00fc }
            r9.g(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00fc }
        L_0x00db:
            okhttp3.C r0 = r7.f15324d
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00f5
            java.net.Socket r0 = r7.f15325e
            if (r0 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            long r0 = java.lang.System.nanoTime()
            r7.f15339s = r0
            return
        L_0x00fc:
            r0 = move-exception
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            goto L_0x00bc
        L_0x0100:
            java.net.Socket r1 = r7.f15326f
            if (r1 != 0) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            Q2.d.n(r1)
        L_0x0108:
            java.net.Socket r1 = r7.f15325e
            if (r1 != 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            Q2.d.n(r1)
        L_0x0110:
            r7.f15326f = r11
            r7.f15325e = r11
            r7.f15330j = r11
            r7.f15331k = r11
            r7.f15327g = r11
            r7.f15328h = r11
            r7.f15329i = r11
            r1 = 1
            r7.f15337q = r1
            okhttp3.C r1 = r7.f15324d
            java.net.InetSocketAddress r3 = r1.d()
            okhttp3.C r1 = r7.f15324d
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.h(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x013e
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x0141
        L_0x013e:
            r12.addConnectException(r0)
        L_0x0141:
            if (r21 == 0) goto L_0x014b
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x014b
            goto L_0x0094
        L_0x014b:
            throw r12
        L_0x014c:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0159:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.g(int, int, int, int, boolean, okhttp3.e, okhttp3.q):void");
    }

    public final void h(x xVar, C c4, IOException iOException) {
        o.e(xVar, "client");
        o.e(c4, "failedRoute");
        o.e(iOException, "failure");
        if (c4.b().type() != Proxy.Type.DIRECT) {
            C0841a a4 = c4.a();
            a4.i().connectFailed(a4.l().s(), c4.b().address(), iOException);
        }
        xVar.v().b(c4);
    }

    public final List o() {
        return this.f15338r;
    }

    public final long p() {
        return this.f15339s;
    }

    public final boolean q() {
        return this.f15332l;
    }

    public final int r() {
        return this.f15334n;
    }

    public Handshake s() {
        return this.f15327g;
    }

    public final synchronized void t() {
        this.f15335o++;
    }

    public String toString() {
        Object a4;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f15324d.a().l().i());
        sb.append(':');
        sb.append(this.f15324d.a().l().n());
        sb.append(", proxy=");
        sb.append(this.f15324d.b());
        sb.append(" hostAddress=");
        sb.append(this.f15324d.d());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f15327g;
        Object obj = PluginMethod.RETURN_NONE;
        if (!(handshake == null || (a4 = handshake.a()) == null)) {
            obj = a4;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f15328h);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u(C0841a aVar, List list) {
        o.e(aVar, "address");
        if (Q2.d.f1353h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        } else if (this.f15338r.size() >= this.f15337q || this.f15332l || !this.f15324d.a().d(aVar)) {
            return false;
        } else {
            if (o.a(aVar.l().i(), A().a().l().i())) {
                return true;
            }
            if (this.f15329i == null || list == null || !B(list) || aVar.e() != a3.d.f2320a || !G(aVar.l())) {
                return false;
            }
            try {
                CertificatePinner a4 = aVar.a();
                o.b(a4);
                String i4 = aVar.l().i();
                Handshake s4 = s();
                o.b(s4);
                a4.a(i4, s4.d());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
                return false;
            }
        }
    }

    public final boolean v(boolean z3) {
        long p4;
        if (!Q2.d.f1353h || !Thread.holdsLock(this)) {
            long nanoTime = System.nanoTime();
            Socket socket = this.f15325e;
            o.b(socket);
            Socket socket2 = this.f15326f;
            o.b(socket2);
            c3.d dVar = this.f15330j;
            o.b(dVar);
            if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            }
            d dVar2 = this.f15329i;
            if (dVar2 != null) {
                return dVar2.E0(nanoTime);
            }
            synchronized (this) {
                p4 = nanoTime - p();
            }
            if (p4 < 10000000000L || !z3) {
                return true;
            }
            return Q2.d.F(socket2, dVar);
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean w() {
        if (this.f15329i != null) {
            return true;
        }
        return false;
    }

    public final U2.d x(x xVar, U2.g gVar) {
        o.e(xVar, "client");
        o.e(gVar, "chain");
        Socket socket = this.f15326f;
        o.b(socket);
        c3.d dVar = this.f15330j;
        o.b(dVar);
        c cVar = this.f15331k;
        o.b(cVar);
        d dVar2 = this.f15329i;
        if (dVar2 != null) {
            return new W2.e(xVar, this, gVar, dVar2);
        }
        socket.setSoTimeout(gVar.l());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dVar.d().g((long) gVar.i(), timeUnit);
        cVar.d().g((long) gVar.k(), timeUnit);
        return new V2.b(xVar, this, dVar, cVar);
    }

    public final synchronized void y() {
        this.f15333m = true;
    }

    public final synchronized void z() {
        this.f15332l = true;
    }
}
