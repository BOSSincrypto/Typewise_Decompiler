package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.o;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final C0841a f15143a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f15144b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f15145c;

    public C(C0841a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        o.e(aVar, "address");
        o.e(proxy, "proxy");
        o.e(inetSocketAddress, "socketAddress");
        this.f15143a = aVar;
        this.f15144b = proxy;
        this.f15145c = inetSocketAddress;
    }

    public final C0841a a() {
        return this.f15143a;
    }

    public final Proxy b() {
        return this.f15144b;
    }

    public final boolean c() {
        if (this.f15143a.k() == null || this.f15144b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final InetSocketAddress d() {
        return this.f15145c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C) {
            C c4 = (C) obj;
            if (!o.a(c4.f15143a, this.f15143a) || !o.a(c4.f15144b, this.f15144b) || !o.a(c4.f15145c, this.f15145c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f15143a.hashCode()) * 31) + this.f15144b.hashCode()) * 31) + this.f15145c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f15145c + '}';
    }
}
