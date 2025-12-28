package okhttp3;

import Q2.d;
import X2.k;
import a3.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.e;
import okhttp3.internal.connection.g;
import okhttp3.q;

public class x implements Cloneable, e.a {

    /* renamed from: H  reason: collision with root package name */
    public static final b f15536H = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public static final List f15537I = d.w(Protocol.HTTP_2, Protocol.HTTP_1_1);
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public static final List f15538J = d.w(k.f15430i, k.f15432k);

    /* renamed from: A  reason: collision with root package name */
    private final int f15539A;

    /* renamed from: B  reason: collision with root package name */
    private final int f15540B;

    /* renamed from: C  reason: collision with root package name */
    private final int f15541C;

    /* renamed from: D  reason: collision with root package name */
    private final int f15542D;

    /* renamed from: E  reason: collision with root package name */
    private final int f15543E;

    /* renamed from: F  reason: collision with root package name */
    private final long f15544F;

    /* renamed from: G  reason: collision with root package name */
    private final g f15545G;

    /* renamed from: a  reason: collision with root package name */
    private final o f15546a;

    /* renamed from: b  reason: collision with root package name */
    private final j f15547b;

    /* renamed from: c  reason: collision with root package name */
    private final List f15548c;

    /* renamed from: d  reason: collision with root package name */
    private final List f15549d;

    /* renamed from: e  reason: collision with root package name */
    private final q.c f15550e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f15551f;

    /* renamed from: g  reason: collision with root package name */
    private final C0842b f15552g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15553h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f15554i;

    /* renamed from: j  reason: collision with root package name */
    private final m f15555j;

    /* renamed from: k  reason: collision with root package name */
    private final p f15556k;

    /* renamed from: l  reason: collision with root package name */
    private final Proxy f15557l;

    /* renamed from: m  reason: collision with root package name */
    private final ProxySelector f15558m;

    /* renamed from: n  reason: collision with root package name */
    private final C0842b f15559n;

    /* renamed from: o  reason: collision with root package name */
    private final SocketFactory f15560o;

    /* renamed from: p  reason: collision with root package name */
    private final SSLSocketFactory f15561p;

    /* renamed from: q  reason: collision with root package name */
    private final X509TrustManager f15562q;

    /* renamed from: v  reason: collision with root package name */
    private final List f15563v;

    /* renamed from: w  reason: collision with root package name */
    private final List f15564w;

    /* renamed from: x  reason: collision with root package name */
    private final HostnameVerifier f15565x;

    /* renamed from: y  reason: collision with root package name */
    private final CertificatePinner f15566y;

    /* renamed from: z  reason: collision with root package name */
    private final c f15567z;

    public static final class a {

        /* renamed from: A  reason: collision with root package name */
        private int f15568A;

        /* renamed from: B  reason: collision with root package name */
        private long f15569B;

        /* renamed from: C  reason: collision with root package name */
        private g f15570C;

        /* renamed from: a  reason: collision with root package name */
        private o f15571a = new o();

        /* renamed from: b  reason: collision with root package name */
        private j f15572b = new j();

        /* renamed from: c  reason: collision with root package name */
        private final List f15573c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List f15574d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private q.c f15575e = d.g(q.f15477b);

        /* renamed from: f  reason: collision with root package name */
        private boolean f15576f = true;

        /* renamed from: g  reason: collision with root package name */
        private C0842b f15577g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15578h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15579i;

        /* renamed from: j  reason: collision with root package name */
        private m f15580j;

        /* renamed from: k  reason: collision with root package name */
        private p f15581k;

        /* renamed from: l  reason: collision with root package name */
        private Proxy f15582l;

        /* renamed from: m  reason: collision with root package name */
        private ProxySelector f15583m;

        /* renamed from: n  reason: collision with root package name */
        private C0842b f15584n;

        /* renamed from: o  reason: collision with root package name */
        private SocketFactory f15585o;

        /* renamed from: p  reason: collision with root package name */
        private SSLSocketFactory f15586p;

        /* renamed from: q  reason: collision with root package name */
        private X509TrustManager f15587q;

        /* renamed from: r  reason: collision with root package name */
        private List f15588r;

        /* renamed from: s  reason: collision with root package name */
        private List f15589s;

        /* renamed from: t  reason: collision with root package name */
        private HostnameVerifier f15590t;

        /* renamed from: u  reason: collision with root package name */
        private CertificatePinner f15591u;

        /* renamed from: v  reason: collision with root package name */
        private c f15592v;

        /* renamed from: w  reason: collision with root package name */
        private int f15593w;

        /* renamed from: x  reason: collision with root package name */
        private int f15594x;

        /* renamed from: y  reason: collision with root package name */
        private int f15595y;

        /* renamed from: z  reason: collision with root package name */
        private int f15596z;

        public a() {
            C0842b bVar = C0842b.f15170b;
            this.f15577g = bVar;
            this.f15578h = true;
            this.f15579i = true;
            this.f15580j = m.f15463b;
            this.f15581k = p.f15474b;
            this.f15584n = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            o.d(socketFactory, "getDefault()");
            this.f15585o = socketFactory;
            b bVar2 = x.f15536H;
            this.f15588r = bVar2.a();
            this.f15589s = bVar2.b();
            this.f15590t = a3.d.f2320a;
            this.f15591u = CertificatePinner.f15147d;
            this.f15594x = 10000;
            this.f15595y = 10000;
            this.f15596z = 10000;
            this.f15569B = 1024;
        }

        public final int A() {
            return this.f15595y;
        }

        public final boolean B() {
            return this.f15576f;
        }

        public final g C() {
            return this.f15570C;
        }

        public final SocketFactory D() {
            return this.f15585o;
        }

        public final SSLSocketFactory E() {
            return this.f15586p;
        }

        public final int F() {
            return this.f15596z;
        }

        public final X509TrustManager G() {
            return this.f15587q;
        }

        public final a H(long j4, TimeUnit timeUnit) {
            o.e(timeUnit, "unit");
            J(d.k("timeout", j4, timeUnit));
            return this;
        }

        public final void I(int i4) {
            this.f15594x = i4;
        }

        public final void J(int i4) {
            this.f15595y = i4;
        }

        public final void K(int i4) {
            this.f15596z = i4;
        }

        public final a L(long j4, TimeUnit timeUnit) {
            o.e(timeUnit, "unit");
            K(d.k("timeout", j4, timeUnit));
            return this;
        }

        public final a a(u uVar) {
            o.e(uVar, "interceptor");
            s().add(uVar);
            return this;
        }

        public final x b() {
            return new x(this);
        }

        public final a c(long j4, TimeUnit timeUnit) {
            o.e(timeUnit, "unit");
            I(d.k("timeout", j4, timeUnit));
            return this;
        }

        public final C0842b d() {
            return this.f15577g;
        }

        public final C0843c e() {
            return null;
        }

        public final int f() {
            return this.f15593w;
        }

        public final c g() {
            return this.f15592v;
        }

        public final CertificatePinner h() {
            return this.f15591u;
        }

        public final int i() {
            return this.f15594x;
        }

        public final j j() {
            return this.f15572b;
        }

        public final List k() {
            return this.f15588r;
        }

        public final m l() {
            return this.f15580j;
        }

        public final o m() {
            return this.f15571a;
        }

        public final p n() {
            return this.f15581k;
        }

        public final q.c o() {
            return this.f15575e;
        }

        public final boolean p() {
            return this.f15578h;
        }

        public final boolean q() {
            return this.f15579i;
        }

        public final HostnameVerifier r() {
            return this.f15590t;
        }

        public final List s() {
            return this.f15573c;
        }

        public final long t() {
            return this.f15569B;
        }

        public final List u() {
            return this.f15574d;
        }

        public final int v() {
            return this.f15568A;
        }

        public final List w() {
            return this.f15589s;
        }

        public final Proxy x() {
            return this.f15582l;
        }

        public final C0842b y() {
            return this.f15584n;
        }

        public final ProxySelector z() {
            return this.f15583m;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final List a() {
            return x.f15538J;
        }

        public final List b() {
            return x.f15537I;
        }

        private b() {
        }
    }

    public x(a aVar) {
        ProxySelector proxySelector;
        o.e(aVar, "builder");
        this.f15546a = aVar.m();
        this.f15547b = aVar.j();
        this.f15548c = d.S(aVar.s());
        this.f15549d = d.S(aVar.u());
        this.f15550e = aVar.o();
        this.f15551f = aVar.B();
        this.f15552g = aVar.d();
        this.f15553h = aVar.p();
        this.f15554i = aVar.q();
        this.f15555j = aVar.l();
        aVar.e();
        this.f15556k = aVar.n();
        this.f15557l = aVar.x();
        if (aVar.x() != null) {
            proxySelector = Z2.a.f2189a;
        } else {
            proxySelector = aVar.z();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = Z2.a.f2189a;
            }
        }
        this.f15558m = proxySelector;
        this.f15559n = aVar.y();
        this.f15560o = aVar.D();
        List k4 = aVar.k();
        this.f15563v = k4;
        this.f15564w = aVar.w();
        this.f15565x = aVar.r();
        this.f15539A = aVar.f();
        this.f15540B = aVar.i();
        this.f15541C = aVar.A();
        this.f15542D = aVar.F();
        this.f15543E = aVar.v();
        this.f15544F = aVar.t();
        g C3 = aVar.C();
        this.f15545G = C3 == null ? new g() : C3;
        Iterable iterable = k4;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((k) it.next()).f()) {
                    if (aVar.E() != null) {
                        this.f15561p = aVar.E();
                        c g4 = aVar.g();
                        o.b(g4);
                        this.f15567z = g4;
                        X509TrustManager G3 = aVar.G();
                        o.b(G3);
                        this.f15562q = G3;
                        CertificatePinner h4 = aVar.h();
                        o.b(g4);
                        this.f15566y = h4.e(g4);
                    } else {
                        k.a aVar2 = k.f1971a;
                        X509TrustManager o4 = aVar2.g().o();
                        this.f15562q = o4;
                        k g5 = aVar2.g();
                        o.b(o4);
                        this.f15561p = g5.n(o4);
                        c.a aVar3 = c.f2319a;
                        o.b(o4);
                        c a4 = aVar3.a(o4);
                        this.f15567z = a4;
                        CertificatePinner h5 = aVar.h();
                        o.b(a4);
                        this.f15566y = h5.e(a4);
                    }
                }
            }
        }
        this.f15561p = null;
        this.f15567z = null;
        this.f15562q = null;
        this.f15566y = CertificatePinner.f15147d;
        I();
    }

    private final void I() {
        if (this.f15548c.contains((Object) null)) {
            throw new IllegalStateException(o.k("Null interceptor: ", x()).toString());
        } else if (!this.f15549d.contains((Object) null)) {
            Iterable<k> iterable = this.f15563v;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (k f4 : iterable) {
                    if (f4.f()) {
                        if (this.f15561p == null) {
                            throw new IllegalStateException("sslSocketFactory == null");
                        } else if (this.f15567z == null) {
                            throw new IllegalStateException("certificateChainCleaner == null");
                        } else if (this.f15562q == null) {
                            throw new IllegalStateException("x509TrustManager == null");
                        } else {
                            return;
                        }
                    }
                }
            }
            if (this.f15561p != null) {
                throw new IllegalStateException("Check failed.");
            } else if (this.f15567z != null) {
                throw new IllegalStateException("Check failed.");
            } else if (this.f15562q != null) {
                throw new IllegalStateException("Check failed.");
            } else if (!o.a(this.f15566y, CertificatePinner.f15147d)) {
                throw new IllegalStateException("Check failed.");
            }
        } else {
            throw new IllegalStateException(o.k("Null network interceptor: ", y()).toString());
        }
    }

    public final List A() {
        return this.f15564w;
    }

    public final Proxy B() {
        return this.f15557l;
    }

    public final C0842b C() {
        return this.f15559n;
    }

    public final ProxySelector D() {
        return this.f15558m;
    }

    public final int E() {
        return this.f15541C;
    }

    public final boolean F() {
        return this.f15551f;
    }

    public final SocketFactory G() {
        return this.f15560o;
    }

    public final SSLSocketFactory H() {
        SSLSocketFactory sSLSocketFactory = this.f15561p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int J() {
        return this.f15542D;
    }

    public e b(y yVar) {
        o.e(yVar, "request");
        return new okhttp3.internal.connection.e(this, yVar, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final C0842b g() {
        return this.f15552g;
    }

    public final C0843c i() {
        return null;
    }

    public final int j() {
        return this.f15539A;
    }

    public final CertificatePinner k() {
        return this.f15566y;
    }

    public final int l() {
        return this.f15540B;
    }

    public final j n() {
        return this.f15547b;
    }

    public final List o() {
        return this.f15563v;
    }

    public final m p() {
        return this.f15555j;
    }

    public final o q() {
        return this.f15546a;
    }

    public final p r() {
        return this.f15556k;
    }

    public final q.c s() {
        return this.f15550e;
    }

    public final boolean t() {
        return this.f15553h;
    }

    public final boolean u() {
        return this.f15554i;
    }

    public final g v() {
        return this.f15545G;
    }

    public final HostnameVerifier w() {
        return this.f15565x;
    }

    public final List x() {
        return this.f15548c;
    }

    public final List y() {
        return this.f15549d;
    }

    public final int z() {
        return this.f15543E;
    }

    public x() {
        this(new a());
    }
}
