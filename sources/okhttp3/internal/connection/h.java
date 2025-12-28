package okhttp3.internal.connection;

import Q2.d;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.C;
import okhttp3.C0841a;
import okhttp3.e;
import okhttp3.q;
import okhttp3.t;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f15405i = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0841a f15406a;

    /* renamed from: b  reason: collision with root package name */
    private final g f15407b;

    /* renamed from: c  reason: collision with root package name */
    private final e f15408c;

    /* renamed from: d  reason: collision with root package name */
    private final q f15409d;

    /* renamed from: e  reason: collision with root package name */
    private List f15410e = C0718m.j();

    /* renamed from: f  reason: collision with root package name */
    private int f15411f;

    /* renamed from: g  reason: collision with root package name */
    private List f15412g = C0718m.j();

    /* renamed from: h  reason: collision with root package name */
    private final List f15413h = new ArrayList();

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            o.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                o.d(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            o.d(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f15414a;

        /* renamed from: b  reason: collision with root package name */
        private int f15415b;

        public b(List list) {
            o.e(list, "routes");
            this.f15414a = list;
        }

        public final List a() {
            return this.f15414a;
        }

        public final boolean b() {
            if (this.f15415b < this.f15414a.size()) {
                return true;
            }
            return false;
        }

        public final C c() {
            if (b()) {
                List list = this.f15414a;
                int i4 = this.f15415b;
                this.f15415b = i4 + 1;
                return (C) list.get(i4);
            }
            throw new NoSuchElementException();
        }
    }

    public h(C0841a aVar, g gVar, e eVar, q qVar) {
        o.e(aVar, "address");
        o.e(gVar, "routeDatabase");
        o.e(eVar, "call");
        o.e(qVar, "eventListener");
        this.f15406a = aVar;
        this.f15407b = gVar;
        this.f15408c = eVar;
        this.f15409d = qVar;
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        if (this.f15411f < this.f15410e.size()) {
            return true;
        }
        return false;
    }

    private final Proxy d() {
        if (b()) {
            List list = this.f15410e;
            int i4 = this.f15411f;
            this.f15411f = i4 + 1;
            Proxy proxy = (Proxy) list.get(i4);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f15406a.l().i() + "; exhausted proxy configurations: " + this.f15410e);
    }

    private final void e(Proxy proxy) {
        String str;
        int i4;
        List<InetAddress> list;
        ArrayList arrayList = new ArrayList();
        this.f15412g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f15406a.l().i();
            i4 = this.f15406a.l().n();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                a aVar = f15405i;
                o.d(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = aVar.a(inetSocketAddress);
                i4 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(o.k("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
            }
        }
        if (1 > i4 || i4 >= 65536) {
            throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i4));
        } else {
            if (d.i(str)) {
                list = C0718m.e(InetAddress.getByName(str));
            } else {
                this.f15409d.m(this.f15408c, str);
                list = this.f15406a.c().a(str);
                if (!list.isEmpty()) {
                    this.f15409d.l(this.f15408c, str, list);
                } else {
                    throw new UnknownHostException(this.f15406a.c() + " returned no addresses for " + str);
                }
            }
            for (InetAddress inetSocketAddress2 : list) {
                arrayList.add(new InetSocketAddress(inetSocketAddress2, i4));
            }
        }
    }

    private final void f(t tVar, Proxy proxy) {
        this.f15409d.o(this.f15408c, tVar);
        List g4 = g(proxy, tVar, this);
        this.f15410e = g4;
        this.f15411f = 0;
        this.f15409d.n(this.f15408c, tVar, g4);
    }

    private static final List g(Proxy proxy, t tVar, h hVar) {
        if (proxy != null) {
            return C0718m.e(proxy);
        }
        URI s4 = tVar.s();
        if (s4.getHost() == null) {
            return d.w(Proxy.NO_PROXY);
        }
        List<Proxy> select = hVar.f15406a.i().select(s4);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            return d.w(Proxy.NO_PROXY);
        }
        o.d(select, "proxiesOrNull");
        return d.S(select);
    }

    public final boolean a() {
        if (b() || !this.f15413h.isEmpty()) {
            return true;
        }
        return false;
    }

    public final b c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d4 = d();
                for (InetSocketAddress c4 : this.f15412g) {
                    C c5 = new C(this.f15406a, d4, c4);
                    if (this.f15407b.c(c5)) {
                        this.f15413h.add(c5);
                    } else {
                        arrayList.add(c5);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C0718m.z(arrayList, this.f15413h);
                this.f15413h.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
