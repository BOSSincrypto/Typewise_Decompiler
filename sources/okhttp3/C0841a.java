package okhttp3;

import Q2.d;
import com.getcapacitor.Bridge;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.o;
import okhttp3.t;

/* renamed from: okhttp3.a  reason: case insensitive filesystem */
public final class C0841a {

    /* renamed from: a  reason: collision with root package name */
    private final p f15158a;

    /* renamed from: b  reason: collision with root package name */
    private final SocketFactory f15159b;

    /* renamed from: c  reason: collision with root package name */
    private final SSLSocketFactory f15160c;

    /* renamed from: d  reason: collision with root package name */
    private final HostnameVerifier f15161d;

    /* renamed from: e  reason: collision with root package name */
    private final CertificatePinner f15162e;

    /* renamed from: f  reason: collision with root package name */
    private final C0842b f15163f;

    /* renamed from: g  reason: collision with root package name */
    private final Proxy f15164g;

    /* renamed from: h  reason: collision with root package name */
    private final ProxySelector f15165h;

    /* renamed from: i  reason: collision with root package name */
    private final t f15166i;

    /* renamed from: j  reason: collision with root package name */
    private final List f15167j;

    /* renamed from: k  reason: collision with root package name */
    private final List f15168k;

    public C0841a(String str, int i4, p pVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, C0842b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        String str2;
        o.e(str, "uriHost");
        o.e(pVar, "dns");
        o.e(socketFactory, "socketFactory");
        o.e(bVar, "proxyAuthenticator");
        o.e(list, "protocols");
        o.e(list2, "connectionSpecs");
        o.e(proxySelector, "proxySelector");
        this.f15158a = pVar;
        this.f15159b = socketFactory;
        this.f15160c = sSLSocketFactory;
        this.f15161d = hostnameVerifier;
        this.f15162e = certificatePinner;
        this.f15163f = bVar;
        this.f15164g = proxy;
        this.f15165h = proxySelector;
        t.a aVar = new t.a();
        if (sSLSocketFactory != null) {
            str2 = Bridge.CAPACITOR_HTTPS_SCHEME;
        } else {
            str2 = Bridge.CAPACITOR_HTTP_SCHEME;
        }
        this.f15166i = aVar.x(str2).n(str).t(i4).c();
        this.f15167j = d.S(list);
        this.f15168k = d.S(list2);
    }

    public final CertificatePinner a() {
        return this.f15162e;
    }

    public final List b() {
        return this.f15168k;
    }

    public final p c() {
        return this.f15158a;
    }

    public final boolean d(C0841a aVar) {
        o.e(aVar, "that");
        if (!o.a(this.f15158a, aVar.f15158a) || !o.a(this.f15163f, aVar.f15163f) || !o.a(this.f15167j, aVar.f15167j) || !o.a(this.f15168k, aVar.f15168k) || !o.a(this.f15165h, aVar.f15165h) || !o.a(this.f15164g, aVar.f15164g) || !o.a(this.f15160c, aVar.f15160c) || !o.a(this.f15161d, aVar.f15161d) || !o.a(this.f15162e, aVar.f15162e) || this.f15166i.n() != aVar.f15166i.n()) {
            return false;
        }
        return true;
    }

    public final HostnameVerifier e() {
        return this.f15161d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0841a) {
            C0841a aVar = (C0841a) obj;
            if (!o.a(this.f15166i, aVar.f15166i) || !d(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f15167j;
    }

    public final Proxy g() {
        return this.f15164g;
    }

    public final C0842b h() {
        return this.f15163f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f15166i.hashCode()) * 31) + this.f15158a.hashCode()) * 31) + this.f15163f.hashCode()) * 31) + this.f15167j.hashCode()) * 31) + this.f15168k.hashCode()) * 31) + this.f15165h.hashCode()) * 31) + Objects.hashCode(this.f15164g)) * 31) + Objects.hashCode(this.f15160c)) * 31) + Objects.hashCode(this.f15161d)) * 31) + Objects.hashCode(this.f15162e);
    }

    public final ProxySelector i() {
        return this.f15165h;
    }

    public final SocketFactory j() {
        return this.f15159b;
    }

    public final SSLSocketFactory k() {
        return this.f15160c;
    }

    public final t l() {
        return this.f15166i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f15166i.i());
        sb.append(':');
        sb.append(this.f15166i.n());
        sb.append(", ");
        Proxy proxy = this.f15164g;
        if (proxy != null) {
            str = o.k("proxy=", proxy);
        } else {
            str = o.k("proxySelector=", this.f15165h);
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
