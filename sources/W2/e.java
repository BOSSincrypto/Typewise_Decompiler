package W2;

import U2.d;
import U2.g;
import U2.k;
import c3.u;
import c3.w;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.s;
import okhttp3.x;
import okhttp3.y;

public final class e implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1836g = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List f1837h = Q2.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final List f1838i = Q2.d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final RealConnection f1839a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1840b;

    /* renamed from: c  reason: collision with root package name */
    private final d f1841c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f1842d;

    /* renamed from: e  reason: collision with root package name */
    private final Protocol f1843e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f1844f;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final List a(y yVar) {
            o.e(yVar, "request");
            s e4 = yVar.e();
            ArrayList arrayList = new ArrayList(e4.size() + 4);
            arrayList.add(new a(a.f1703g, yVar.g()));
            arrayList.add(new a(a.f1704h, U2.i.f1528a.c(yVar.j())));
            String d4 = yVar.d("Host");
            if (d4 != null) {
                arrayList.add(new a(a.f1706j, d4));
            }
            arrayList.add(new a(a.f1705i, yVar.j().r()));
            int size = e4.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                String c4 = e4.c(i4);
                Locale locale = Locale.US;
                o.d(locale, "US");
                String lowerCase = c4.toLowerCase(locale);
                o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!e.f1837h.contains(lowerCase) || (o.a(lowerCase, "te") && o.a(e4.f(i4), "trailers"))) {
                    arrayList.add(new a(lowerCase, e4.f(i4)));
                }
                i4 = i5;
            }
            return arrayList;
        }

        public final A.a b(s sVar, Protocol protocol) {
            o.e(sVar, "headerBlock");
            o.e(protocol, "protocol");
            s.a aVar = new s.a();
            int size = sVar.size();
            k kVar = null;
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                String c4 = sVar.c(i4);
                String f4 = sVar.f(i4);
                if (o.a(c4, ":status")) {
                    kVar = k.f1531d.a(o.k("HTTP/1.1 ", f4));
                } else if (!e.f1838i.contains(c4)) {
                    aVar.d(c4, f4);
                }
                i4 = i5;
            }
            if (kVar != null) {
                return new A.a().q(protocol).g(kVar.f1533b).n(kVar.f1534c).l(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public e(x xVar, RealConnection realConnection, g gVar, d dVar) {
        o.e(xVar, "client");
        o.e(realConnection, "connection");
        o.e(gVar, "chain");
        o.e(dVar, "http2Connection");
        this.f1839a = realConnection;
        this.f1840b = gVar;
        this.f1841c = dVar;
        List A3 = xVar.A();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f1843e = !A3.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public void a() {
        g gVar = this.f1842d;
        o.b(gVar);
        gVar.n().close();
    }

    public void b(y yVar) {
        boolean z3;
        o.e(yVar, "request");
        if (this.f1842d == null) {
            if (yVar.a() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f1842d = this.f1841c.G0(f1836g.a(yVar), z3);
            if (!this.f1844f) {
                g gVar = this.f1842d;
                o.b(gVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gVar.v().g((long) this.f1840b.i(), timeUnit);
                g gVar2 = this.f1842d;
                o.b(gVar2);
                gVar2.G().g((long) this.f1840b.k(), timeUnit);
                return;
            }
            g gVar3 = this.f1842d;
            o.b(gVar3);
            gVar3.f(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public void c() {
        this.f1841c.flush();
    }

    public void cancel() {
        this.f1844f = true;
        g gVar = this.f1842d;
        if (gVar != null) {
            gVar.f(ErrorCode.CANCEL);
        }
    }

    public long d(A a4) {
        o.e(a4, "response");
        if (!U2.e.b(a4)) {
            return 0;
        }
        return Q2.d.v(a4);
    }

    public w e(A a4) {
        o.e(a4, "response");
        g gVar = this.f1842d;
        o.b(gVar);
        return gVar.p();
    }

    public u f(y yVar, long j4) {
        o.e(yVar, "request");
        g gVar = this.f1842d;
        o.b(gVar);
        return gVar.n();
    }

    public A.a g(boolean z3) {
        g gVar = this.f1842d;
        if (gVar != null) {
            A.a b4 = f1836g.b(gVar.E(), this.f1843e);
            if (!z3 || b4.h() != 100) {
                return b4;
            }
            return null;
        }
        throw new IOException("stream wasn't created");
    }

    public RealConnection h() {
        return this.f1839a;
    }
}
