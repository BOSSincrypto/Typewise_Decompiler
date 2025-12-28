package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15476a = new b((i) null);

    /* renamed from: b  reason: collision with root package name */
    public static final q f15477b = new a();

    public static final class a extends q {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        q a(e eVar);
    }

    public void A(e eVar, Handshake handshake) {
        o.e(eVar, "call");
    }

    public void B(e eVar) {
        o.e(eVar, "call");
    }

    public void a(e eVar, A a4) {
        o.e(eVar, "call");
        o.e(a4, "cachedResponse");
    }

    public void b(e eVar, A a4) {
        o.e(eVar, "call");
        o.e(a4, "response");
    }

    public void c(e eVar) {
        o.e(eVar, "call");
    }

    public void d(e eVar, IOException iOException) {
        o.e(eVar, "call");
        o.e(iOException, "ioe");
    }

    public void e(e eVar) {
        o.e(eVar, "call");
    }

    public void f(e eVar) {
        o.e(eVar, "call");
    }

    public void g(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        o.e(eVar, "call");
        o.e(inetSocketAddress, "inetSocketAddress");
        o.e(proxy, "proxy");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        o.e(eVar, "call");
        o.e(inetSocketAddress, "inetSocketAddress");
        o.e(proxy, "proxy");
        o.e(iOException, "ioe");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        o.e(eVar, "call");
        o.e(inetSocketAddress, "inetSocketAddress");
        o.e(proxy, "proxy");
    }

    public void j(e eVar, i iVar) {
        o.e(eVar, "call");
        o.e(iVar, "connection");
    }

    public void k(e eVar, i iVar) {
        o.e(eVar, "call");
        o.e(iVar, "connection");
    }

    public void l(e eVar, String str, List list) {
        o.e(eVar, "call");
        o.e(str, "domainName");
        o.e(list, "inetAddressList");
    }

    public void m(e eVar, String str) {
        o.e(eVar, "call");
        o.e(str, "domainName");
    }

    public void n(e eVar, t tVar, List list) {
        o.e(eVar, "call");
        o.e(tVar, "url");
        o.e(list, "proxies");
    }

    public void o(e eVar, t tVar) {
        o.e(eVar, "call");
        o.e(tVar, "url");
    }

    public void p(e eVar, long j4) {
        o.e(eVar, "call");
    }

    public void q(e eVar) {
        o.e(eVar, "call");
    }

    public void r(e eVar, IOException iOException) {
        o.e(eVar, "call");
        o.e(iOException, "ioe");
    }

    public void s(e eVar, y yVar) {
        o.e(eVar, "call");
        o.e(yVar, "request");
    }

    public void t(e eVar) {
        o.e(eVar, "call");
    }

    public void u(e eVar, long j4) {
        o.e(eVar, "call");
    }

    public void v(e eVar) {
        o.e(eVar, "call");
    }

    public void w(e eVar, IOException iOException) {
        o.e(eVar, "call");
        o.e(iOException, "ioe");
    }

    public void x(e eVar, A a4) {
        o.e(eVar, "call");
        o.e(a4, "response");
    }

    public void y(e eVar) {
        o.e(eVar, "call");
    }

    public void z(e eVar, A a4) {
        o.e(eVar, "call");
        o.e(a4, "response");
    }
}
