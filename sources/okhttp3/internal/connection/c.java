package okhttp3.internal.connection;

import U2.d;
import U2.h;
import c3.C0500b;
import c3.e;
import c3.f;
import c3.k;
import c3.u;
import c3.w;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.B;
import okhttp3.q;
import okhttp3.y;
import okhttp3.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final e f15346a;

    /* renamed from: b  reason: collision with root package name */
    private final q f15347b;

    /* renamed from: c  reason: collision with root package name */
    private final d f15348c;

    /* renamed from: d  reason: collision with root package name */
    private final d f15349d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15350e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15351f;

    /* renamed from: g  reason: collision with root package name */
    private final RealConnection f15352g;

    private final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        private final long f15353b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15354c;

        /* renamed from: d  reason: collision with root package name */
        private long f15355d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15356e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f15357f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, u uVar, long j4) {
            super(uVar);
            o.e(cVar, "this$0");
            o.e(uVar, "delegate");
            this.f15357f = cVar;
            this.f15353b = j4;
        }

        private final IOException a(IOException iOException) {
            if (this.f15354c) {
                return iOException;
            }
            this.f15354c = true;
            return this.f15357f.a(this.f15355d, false, true, iOException);
        }

        public void close() {
            if (!this.f15356e) {
                this.f15356e = true;
                long j4 = this.f15353b;
                if (j4 == -1 || this.f15355d == j4) {
                    try {
                        super.close();
                        a((IOException) null);
                    } catch (IOException e4) {
                        throw a(e4);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e4) {
                throw a(e4);
            }
        }

        public void z(C0500b bVar, long j4) {
            o.e(bVar, "source");
            if (!this.f15356e) {
                long j5 = this.f15353b;
                if (j5 == -1 || this.f15355d + j4 <= j5) {
                    try {
                        super.z(bVar, j4);
                        this.f15355d += j4;
                    } catch (IOException e4) {
                        throw a(e4);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f15353b + " bytes but received " + (this.f15355d + j4));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        private final long f15358b;

        /* renamed from: c  reason: collision with root package name */
        private long f15359c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15360d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15361e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15362f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f15363g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, w wVar, long j4) {
            super(wVar);
            o.e(cVar, "this$0");
            o.e(wVar, "delegate");
            this.f15363g = cVar;
            this.f15358b = j4;
            if (j4 == 0) {
                e((IOException) null);
            }
        }

        public long N(C0500b bVar, long j4) {
            o.e(bVar, "sink");
            if (!this.f15362f) {
                try {
                    long N3 = a().N(bVar, j4);
                    if (this.f15360d) {
                        this.f15360d = false;
                        this.f15363g.i().v(this.f15363g.g());
                    }
                    if (N3 == -1) {
                        e((IOException) null);
                        return -1;
                    }
                    long j5 = this.f15359c + N3;
                    long j6 = this.f15358b;
                    if (j6 != -1) {
                        if (j5 > j6) {
                            throw new ProtocolException("expected " + this.f15358b + " bytes but received " + j5);
                        }
                    }
                    this.f15359c = j5;
                    if (j5 == j6) {
                        e((IOException) null);
                    }
                    return N3;
                } catch (IOException e4) {
                    throw e(e4);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f15362f) {
                this.f15362f = true;
                try {
                    super.close();
                    e((IOException) null);
                } catch (IOException e4) {
                    throw e(e4);
                }
            }
        }

        public final IOException e(IOException iOException) {
            if (this.f15361e) {
                return iOException;
            }
            this.f15361e = true;
            if (iOException == null && this.f15360d) {
                this.f15360d = false;
                this.f15363g.i().v(this.f15363g.g());
            }
            return this.f15363g.a(this.f15359c, true, false, iOException);
        }
    }

    public c(e eVar, q qVar, d dVar, d dVar2) {
        o.e(eVar, "call");
        o.e(qVar, "eventListener");
        o.e(dVar, "finder");
        o.e(dVar2, "codec");
        this.f15346a = eVar;
        this.f15347b = qVar;
        this.f15348c = dVar;
        this.f15349d = dVar2;
        this.f15352g = dVar2.h();
    }

    private final void t(IOException iOException) {
        this.f15351f = true;
        this.f15348c.h(iOException);
        this.f15349d.h().H(this.f15346a, iOException);
    }

    public final IOException a(long j4, boolean z3, boolean z4, IOException iOException) {
        if (iOException != null) {
            t(iOException);
        }
        if (z4) {
            if (iOException != null) {
                this.f15347b.r(this.f15346a, iOException);
            } else {
                this.f15347b.p(this.f15346a, j4);
            }
        }
        if (z3) {
            if (iOException != null) {
                this.f15347b.w(this.f15346a, iOException);
            } else {
                this.f15347b.u(this.f15346a, j4);
            }
        }
        return this.f15346a.w(this, z4, z3, iOException);
    }

    public final void b() {
        this.f15349d.cancel();
    }

    public final u c(y yVar, boolean z3) {
        o.e(yVar, "request");
        this.f15350e = z3;
        z a4 = yVar.a();
        o.b(a4);
        long a5 = a4.a();
        this.f15347b.q(this.f15346a);
        return new a(this, this.f15349d.f(yVar, a5), a5);
    }

    public final void d() {
        this.f15349d.cancel();
        this.f15346a.w(this, true, true, (IOException) null);
    }

    public final void e() {
        try {
            this.f15349d.a();
        } catch (IOException e4) {
            this.f15347b.r(this.f15346a, e4);
            t(e4);
            throw e4;
        }
    }

    public final void f() {
        try {
            this.f15349d.c();
        } catch (IOException e4) {
            this.f15347b.r(this.f15346a, e4);
            t(e4);
            throw e4;
        }
    }

    public final e g() {
        return this.f15346a;
    }

    public final RealConnection h() {
        return this.f15352g;
    }

    public final q i() {
        return this.f15347b;
    }

    public final d j() {
        return this.f15348c;
    }

    public final boolean k() {
        return this.f15351f;
    }

    public final boolean l() {
        return !o.a(this.f15348c.d().l().i(), this.f15352g.A().a().l().i());
    }

    public final boolean m() {
        return this.f15350e;
    }

    public final void n() {
        this.f15349d.h().z();
    }

    public final void o() {
        this.f15346a.w(this, true, false, (IOException) null);
    }

    public final B p(A a4) {
        o.e(a4, "response");
        try {
            String A3 = A.A(a4, HttpRequest.HEADER_CONTENT_TYPE, (String) null, 2, (Object) null);
            long d4 = this.f15349d.d(a4);
            return new h(A3, d4, k.b(new b(this, this.f15349d.e(a4), d4)));
        } catch (IOException e4) {
            this.f15347b.w(this.f15346a, e4);
            t(e4);
            throw e4;
        }
    }

    public final A.a q(boolean z3) {
        try {
            A.a g4 = this.f15349d.g(z3);
            if (g4 != null) {
                g4.m(this);
            }
            return g4;
        } catch (IOException e4) {
            this.f15347b.w(this.f15346a, e4);
            t(e4);
            throw e4;
        }
    }

    public final void r(A a4) {
        o.e(a4, "response");
        this.f15347b.x(this.f15346a, a4);
    }

    public final void s() {
        this.f15347b.y(this.f15346a);
    }

    public final void u(y yVar) {
        o.e(yVar, "request");
        try {
            this.f15347b.t(this.f15346a);
            this.f15349d.b(yVar);
            this.f15347b.s(this.f15346a, yVar);
        } catch (IOException e4) {
            this.f15347b.r(this.f15346a, e4);
            t(e4);
            throw e4;
        }
    }
}
