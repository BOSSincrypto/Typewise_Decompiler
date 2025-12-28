package okhttp3;

import U2.e;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import okhttp3.internal.connection.c;
import okhttp3.s;

public final class A implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final y f15112a;

    /* renamed from: b  reason: collision with root package name */
    private final Protocol f15113b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15114c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15115d;

    /* renamed from: e  reason: collision with root package name */
    private final Handshake f15116e;

    /* renamed from: f  reason: collision with root package name */
    private final s f15117f;

    /* renamed from: g  reason: collision with root package name */
    private final B f15118g;

    /* renamed from: h  reason: collision with root package name */
    private final A f15119h;

    /* renamed from: i  reason: collision with root package name */
    private final A f15120i;

    /* renamed from: j  reason: collision with root package name */
    private final A f15121j;

    /* renamed from: k  reason: collision with root package name */
    private final long f15122k;

    /* renamed from: l  reason: collision with root package name */
    private final long f15123l;

    /* renamed from: m  reason: collision with root package name */
    private final c f15124m;

    /* renamed from: n  reason: collision with root package name */
    private d f15125n;

    public A(y yVar, Protocol protocol, String str, int i4, Handshake handshake, s sVar, B b4, A a4, A a5, A a6, long j4, long j5, c cVar) {
        o.e(yVar, "request");
        o.e(protocol, "protocol");
        o.e(str, "message");
        o.e(sVar, "headers");
        this.f15112a = yVar;
        this.f15113b = protocol;
        this.f15114c = str;
        this.f15115d = i4;
        this.f15116e = handshake;
        this.f15117f = sVar;
        this.f15118g = b4;
        this.f15119h = a4;
        this.f15120i = a5;
        this.f15121j = a6;
        this.f15122k = j4;
        this.f15123l = j5;
        this.f15124m = cVar;
    }

    public static /* synthetic */ String A(A a4, String str, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return a4.y(str, str2);
    }

    public final s D() {
        return this.f15117f;
    }

    public final boolean G() {
        int i4 = this.f15115d;
        if (200 > i4 || i4 >= 300) {
            return false;
        }
        return true;
    }

    public final String Q() {
        return this.f15114c;
    }

    public final A R() {
        return this.f15119h;
    }

    public final B a() {
        return this.f15118g;
    }

    public final a b0() {
        return new a(this);
    }

    public void close() {
        B b4 = this.f15118g;
        if (b4 != null) {
            b4.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final d e() {
        d dVar = this.f15125n;
        if (dVar != null) {
            return dVar;
        }
        d b4 = d.f15173n.b(this.f15117f);
        this.f15125n = b4;
        return b4;
    }

    public final A e0() {
        return this.f15121j;
    }

    public final A f() {
        return this.f15120i;
    }

    public final Protocol g0() {
        return this.f15113b;
    }

    public final List h() {
        String str;
        s sVar = this.f15117f;
        int i4 = this.f15115d;
        if (i4 == 401) {
            str = "WWW-Authenticate";
        } else if (i4 != 407) {
            return C0718m.j();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(sVar, str);
    }

    public final long j0() {
        return this.f15123l;
    }

    public final int m() {
        return this.f15115d;
    }

    public final c o() {
        return this.f15124m;
    }

    public final y o0() {
        return this.f15112a;
    }

    public final long p0() {
        return this.f15122k;
    }

    public String toString() {
        return "Response{protocol=" + this.f15113b + ", code=" + this.f15115d + ", message=" + this.f15114c + ", url=" + this.f15112a.j() + '}';
    }

    public final Handshake v() {
        return this.f15116e;
    }

    public final String y(String str, String str2) {
        o.e(str, "name");
        String b4 = this.f15117f.b(str);
        if (b4 == null) {
            return str2;
        }
        return b4;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private y f15126a;

        /* renamed from: b  reason: collision with root package name */
        private Protocol f15127b;

        /* renamed from: c  reason: collision with root package name */
        private int f15128c;

        /* renamed from: d  reason: collision with root package name */
        private String f15129d;

        /* renamed from: e  reason: collision with root package name */
        private Handshake f15130e;

        /* renamed from: f  reason: collision with root package name */
        private s.a f15131f;

        /* renamed from: g  reason: collision with root package name */
        private B f15132g;

        /* renamed from: h  reason: collision with root package name */
        private A f15133h;

        /* renamed from: i  reason: collision with root package name */
        private A f15134i;

        /* renamed from: j  reason: collision with root package name */
        private A f15135j;

        /* renamed from: k  reason: collision with root package name */
        private long f15136k;

        /* renamed from: l  reason: collision with root package name */
        private long f15137l;

        /* renamed from: m  reason: collision with root package name */
        private c f15138m;

        public a() {
            this.f15128c = -1;
            this.f15131f = new s.a();
        }

        private final void e(A a4) {
            if (a4 != null && a4.a() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, A a4) {
            if (a4 != null) {
                if (a4.a() != null) {
                    throw new IllegalArgumentException(o.k(str, ".body != null").toString());
                } else if (a4.R() != null) {
                    throw new IllegalArgumentException(o.k(str, ".networkResponse != null").toString());
                } else if (a4.f() != null) {
                    throw new IllegalArgumentException(o.k(str, ".cacheResponse != null").toString());
                } else if (a4.e0() != null) {
                    throw new IllegalArgumentException(o.k(str, ".priorResponse != null").toString());
                }
            }
        }

        public final void A(A a4) {
            this.f15133h = a4;
        }

        public final void B(A a4) {
            this.f15135j = a4;
        }

        public final void C(Protocol protocol) {
            this.f15127b = protocol;
        }

        public final void D(long j4) {
            this.f15137l = j4;
        }

        public final void E(y yVar) {
            this.f15126a = yVar;
        }

        public final void F(long j4) {
            this.f15136k = j4;
        }

        public a a(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            i().a(str, str2);
            return this;
        }

        public a b(B b4) {
            u(b4);
            return this;
        }

        public A c() {
            int i4 = this.f15128c;
            if (i4 >= 0) {
                y yVar = this.f15126a;
                if (yVar != null) {
                    Protocol protocol = this.f15127b;
                    if (protocol != null) {
                        String str = this.f15129d;
                        if (str != null) {
                            return new A(yVar, protocol, str, i4, this.f15130e, this.f15131f.f(), this.f15132g, this.f15133h, this.f15134i, this.f15135j, this.f15136k, this.f15137l, this.f15138m);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(o.k("code < 0: ", Integer.valueOf(h())).toString());
        }

        public a d(A a4) {
            f("cacheResponse", a4);
            v(a4);
            return this;
        }

        public a g(int i4) {
            w(i4);
            return this;
        }

        public final int h() {
            return this.f15128c;
        }

        public final s.a i() {
            return this.f15131f;
        }

        public a j(Handshake handshake) {
            x(handshake);
            return this;
        }

        public a k(String str, String str2) {
            o.e(str, "name");
            o.e(str2, "value");
            i().i(str, str2);
            return this;
        }

        public a l(s sVar) {
            o.e(sVar, "headers");
            y(sVar.d());
            return this;
        }

        public final void m(c cVar) {
            o.e(cVar, "deferredTrailers");
            this.f15138m = cVar;
        }

        public a n(String str) {
            o.e(str, "message");
            z(str);
            return this;
        }

        public a o(A a4) {
            f("networkResponse", a4);
            A(a4);
            return this;
        }

        public a p(A a4) {
            e(a4);
            B(a4);
            return this;
        }

        public a q(Protocol protocol) {
            o.e(protocol, "protocol");
            C(protocol);
            return this;
        }

        public a r(long j4) {
            D(j4);
            return this;
        }

        public a s(y yVar) {
            o.e(yVar, "request");
            E(yVar);
            return this;
        }

        public a t(long j4) {
            F(j4);
            return this;
        }

        public final void u(B b4) {
            this.f15132g = b4;
        }

        public final void v(A a4) {
            this.f15134i = a4;
        }

        public final void w(int i4) {
            this.f15128c = i4;
        }

        public final void x(Handshake handshake) {
            this.f15130e = handshake;
        }

        public final void y(s.a aVar) {
            o.e(aVar, "<set-?>");
            this.f15131f = aVar;
        }

        public final void z(String str) {
            this.f15129d = str;
        }

        public a(A a4) {
            o.e(a4, "response");
            this.f15128c = -1;
            this.f15126a = a4.o0();
            this.f15127b = a4.g0();
            this.f15128c = a4.m();
            this.f15129d = a4.Q();
            this.f15130e = a4.v();
            this.f15131f = a4.D().d();
            this.f15132g = a4.a();
            this.f15133h = a4.R();
            this.f15134i = a4.f();
            this.f15135j = a4.e0();
            this.f15136k = a4.p0();
            this.f15137l = a4.j0();
            this.f15138m = a4.o();
        }
    }
}
