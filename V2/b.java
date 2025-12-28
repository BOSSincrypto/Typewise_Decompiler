package V2;

import U2.k;
import c3.C0500b;
import c3.u;
import c3.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.internal.connection.RealConnection;
import okhttp3.m;
import okhttp3.s;
import okhttp3.t;
import okhttp3.x;
import okhttp3.y;

public final class b implements U2.d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f1622h = new d((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f1623a;

    /* renamed from: b  reason: collision with root package name */
    private final RealConnection f1624b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c3.d f1625c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c3.c f1626d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f1627e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a f1628f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public s f1629g;

    private abstract class a implements w {

        /* renamed from: a  reason: collision with root package name */
        private final c3.g f1630a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f1632c;

        public a(b bVar) {
            o.e(bVar, "this$0");
            this.f1632c = bVar;
            this.f1630a = new c3.g(bVar.f1625c.d());
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            try {
                return this.f1632c.f1625c.N(bVar, j4);
            } catch (IOException e4) {
                this.f1632c.h().z();
                e();
                throw e4;
            }
        }

        /* access modifiers changed from: protected */
        public final boolean a() {
            return this.f1631b;
        }

        public c3.x d() {
            return this.f1630a;
        }

        public final void e() {
            if (this.f1632c.f1627e != 6) {
                if (this.f1632c.f1627e == 5) {
                    this.f1632c.r(this.f1630a);
                    this.f1632c.f1627e = 6;
                    return;
                }
                throw new IllegalStateException(o.k("state: ", Integer.valueOf(this.f1632c.f1627e)));
            }
        }

        /* access modifiers changed from: protected */
        public final void f(boolean z3) {
            this.f1631b = z3;
        }
    }

    /* renamed from: V2.b$b  reason: collision with other inner class name */
    private final class C0030b implements u {

        /* renamed from: a  reason: collision with root package name */
        private final c3.g f1633a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1634b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f1635c;

        public C0030b(b bVar) {
            o.e(bVar, "this$0");
            this.f1635c = bVar;
            this.f1633a = new c3.g(bVar.f1626d.d());
        }

        public synchronized void close() {
            if (!this.f1634b) {
                this.f1634b = true;
                this.f1635c.f1626d.f0("0\r\n\r\n");
                this.f1635c.r(this.f1633a);
                this.f1635c.f1627e = 3;
            }
        }

        public c3.x d() {
            return this.f1633a;
        }

        public synchronized void flush() {
            if (!this.f1634b) {
                this.f1635c.f1626d.flush();
            }
        }

        public void z(C0500b bVar, long j4) {
            o.e(bVar, "source");
            if (this.f1634b) {
                throw new IllegalStateException("closed");
            } else if (j4 != 0) {
                this.f1635c.f1626d.k(j4);
                this.f1635c.f1626d.f0("\r\n");
                this.f1635c.f1626d.z(bVar, j4);
                this.f1635c.f1626d.f0("\r\n");
            }
        }
    }

    private final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        private final t f1636d;

        /* renamed from: e  reason: collision with root package name */
        private long f1637e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1638f = true;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f1639g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, t tVar) {
            super(bVar);
            o.e(bVar, "this$0");
            o.e(tVar, "url");
            this.f1639g = bVar;
            this.f1636d = tVar;
        }

        private final void h() {
            if (this.f1637e != -1) {
                this.f1639g.f1625c.C();
            }
            try {
                this.f1637e = this.f1639g.f1625c.m0();
                String obj = kotlin.text.o.M0(this.f1639g.f1625c.C()).toString();
                if (this.f1637e < 0 || (obj.length() > 0 && !kotlin.text.o.G(obj, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1637e + obj + '\"');
                } else if (this.f1637e == 0) {
                    this.f1638f = false;
                    b bVar = this.f1639g;
                    bVar.f1629g = bVar.f1628f.a();
                    x j4 = this.f1639g.f1623a;
                    o.b(j4);
                    m p4 = j4.p();
                    t tVar = this.f1636d;
                    s o4 = this.f1639g.f1629g;
                    o.b(o4);
                    U2.e.f(p4, tVar, o4);
                    e();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(o.k("byteCount < 0: ", Long.valueOf(j4)).toString());
            } else if (a()) {
                throw new IllegalStateException("closed");
            } else if (!this.f1638f) {
                return -1;
            } else {
                long j5 = this.f1637e;
                if (j5 == 0 || j5 == -1) {
                    h();
                    if (!this.f1638f) {
                        return -1;
                    }
                }
                long N3 = super.N(bVar, Math.min(j4, this.f1637e));
                if (N3 != -1) {
                    this.f1637e -= N3;
                    return N3;
                }
                this.f1639g.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            }
        }

        public void close() {
            if (!a()) {
                if (this.f1638f && !Q2.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f1639g.h().z();
                    e();
                }
                f(true);
            }
        }
    }

    public static final class d {
        public /* synthetic */ d(i iVar) {
            this();
        }

        private d() {
        }
    }

    private final class e extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f1640d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f1641e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(b bVar, long j4) {
            super(bVar);
            o.e(bVar, "this$0");
            this.f1641e = bVar;
            this.f1640d = j4;
            if (j4 == 0) {
                e();
            }
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(o.k("byteCount < 0: ", Long.valueOf(j4)).toString());
            } else if (!a()) {
                long j5 = this.f1640d;
                if (j5 == 0) {
                    return -1;
                }
                long N3 = super.N(bVar, Math.min(j5, j4));
                if (N3 != -1) {
                    long j6 = this.f1640d - N3;
                    this.f1640d = j6;
                    if (j6 == 0) {
                        e();
                    }
                    return N3;
                }
                this.f1641e.h().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                e();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!a()) {
                if (this.f1640d != 0 && !Q2.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f1641e.h().z();
                    e();
                }
                f(true);
            }
        }
    }

    private final class f implements u {

        /* renamed from: a  reason: collision with root package name */
        private final c3.g f1642a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f1643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f1644c;

        public f(b bVar) {
            o.e(bVar, "this$0");
            this.f1644c = bVar;
            this.f1642a = new c3.g(bVar.f1626d.d());
        }

        public void close() {
            if (!this.f1643b) {
                this.f1643b = true;
                this.f1644c.r(this.f1642a);
                this.f1644c.f1627e = 3;
            }
        }

        public c3.x d() {
            return this.f1642a;
        }

        public void flush() {
            if (!this.f1643b) {
                this.f1644c.f1626d.flush();
            }
        }

        public void z(C0500b bVar, long j4) {
            o.e(bVar, "source");
            if (!this.f1643b) {
                Q2.d.l(bVar.w0(), 0, j4);
                this.f1644c.f1626d.z(bVar, j4);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    private final class g extends a {

        /* renamed from: d  reason: collision with root package name */
        private boolean f1645d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f1646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(b bVar) {
            super(bVar);
            o.e(bVar, "this$0");
            this.f1646e = bVar;
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(o.k("byteCount < 0: ", Long.valueOf(j4)).toString());
            } else if (a()) {
                throw new IllegalStateException("closed");
            } else if (this.f1645d) {
                return -1;
            } else {
                long N3 = super.N(bVar, j4);
                if (N3 != -1) {
                    return N3;
                }
                this.f1645d = true;
                e();
                return -1;
            }
        }

        public void close() {
            if (!a()) {
                if (!this.f1645d) {
                    e();
                }
                f(true);
            }
        }
    }

    public b(x xVar, RealConnection realConnection, c3.d dVar, c3.c cVar) {
        o.e(realConnection, "connection");
        o.e(dVar, "source");
        o.e(cVar, "sink");
        this.f1623a = xVar;
        this.f1624b = realConnection;
        this.f1625c = dVar;
        this.f1626d = cVar;
        this.f1628f = new a(dVar);
    }

    /* access modifiers changed from: private */
    public final void r(c3.g gVar) {
        c3.x i4 = gVar.i();
        gVar.j(c3.x.f7697e);
        i4.a();
        i4.b();
    }

    private final boolean s(y yVar) {
        return kotlin.text.o.v("chunked", yVar.d("Transfer-Encoding"), true);
    }

    private final boolean t(A a4) {
        return kotlin.text.o.v("chunked", A.A(a4, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final u u() {
        int i4 = this.f1627e;
        if (i4 == 1) {
            this.f1627e = 2;
            return new C0030b(this);
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    private final w v(t tVar) {
        int i4 = this.f1627e;
        if (i4 == 4) {
            this.f1627e = 5;
            return new c(this, tVar);
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    private final w w(long j4) {
        int i4 = this.f1627e;
        if (i4 == 4) {
            this.f1627e = 5;
            return new e(this, j4);
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    private final u x() {
        int i4 = this.f1627e;
        if (i4 == 1) {
            this.f1627e = 2;
            return new f(this);
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    private final w y() {
        int i4 = this.f1627e;
        if (i4 == 4) {
            this.f1627e = 5;
            h().z();
            return new g(this);
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    public final void A(s sVar, String str) {
        o.e(sVar, "headers");
        o.e(str, "requestLine");
        int i4 = this.f1627e;
        if (i4 == 0) {
            this.f1626d.f0(str).f0("\r\n");
            int size = sVar.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f1626d.f0(sVar.c(i5)).f0(": ").f0(sVar.f(i5)).f0("\r\n");
            }
            this.f1626d.f0("\r\n");
            this.f1627e = 1;
            return;
        }
        throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
    }

    public void a() {
        this.f1626d.flush();
    }

    public void b(y yVar) {
        o.e(yVar, "request");
        U2.i iVar = U2.i.f1528a;
        Proxy.Type type = h().A().b().type();
        o.d(type, "connection.route().proxy.type()");
        A(yVar.e(), iVar.a(yVar, type));
    }

    public void c() {
        this.f1626d.flush();
    }

    public void cancel() {
        h().e();
    }

    public long d(A a4) {
        o.e(a4, "response");
        if (!U2.e.b(a4)) {
            return 0;
        }
        if (t(a4)) {
            return -1;
        }
        return Q2.d.v(a4);
    }

    public w e(A a4) {
        o.e(a4, "response");
        if (!U2.e.b(a4)) {
            return w(0);
        }
        if (t(a4)) {
            return v(a4.o0().j());
        }
        long v3 = Q2.d.v(a4);
        if (v3 != -1) {
            return w(v3);
        }
        return y();
    }

    public u f(y yVar, long j4) {
        o.e(yVar, "request");
        if (yVar.a() != null && yVar.a().e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(yVar)) {
            return u();
        } else {
            if (j4 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public A.a g(boolean z3) {
        int i4 = this.f1627e;
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            try {
                k a4 = k.f1531d.a(this.f1628f.b());
                A.a l4 = new A.a().q(a4.f1532a).g(a4.f1533b).n(a4.f1534c).l(this.f1628f.a());
                if (z3 && a4.f1533b == 100) {
                    return null;
                }
                int i5 = a4.f1533b;
                if (i5 == 100) {
                    this.f1627e = 3;
                    return l4;
                } else if (102 > i5 || i5 >= 200) {
                    this.f1627e = 4;
                    return l4;
                } else {
                    this.f1627e = 3;
                    return l4;
                }
            } catch (EOFException e4) {
                throw new IOException(o.k("unexpected end of stream on ", h().A().a().l().p()), e4);
            }
        } else {
            throw new IllegalStateException(o.k("state: ", Integer.valueOf(i4)).toString());
        }
    }

    public RealConnection h() {
        return this.f1624b;
    }

    public final void z(A a4) {
        o.e(a4, "response");
        long v3 = Q2.d.v(a4);
        if (v3 != -1) {
            w w3 = w(v3);
            Q2.d.L(w3, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w3.close();
        }
    }
}
