package Y2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.o;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a f2122a;

    /* renamed from: b  reason: collision with root package name */
    private m f2123b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a aVar) {
        o.e(aVar, "socketAdapterFactory");
        this.f2122a = aVar;
    }

    private final synchronized m d(SSLSocket sSLSocket) {
        try {
            if (this.f2123b == null && this.f2122a.a(sSLSocket)) {
                this.f2123b = this.f2122a.b(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f2123b;
    }

    public boolean a(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return this.f2122a.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        m d4 = d(sSLSocket);
        if (d4 == null) {
            return null;
        }
        return d4.b(sSLSocket);
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        m d4 = d(sSLSocket);
        if (d4 != null) {
            d4.c(sSLSocket, str, list);
        }
    }

    public boolean isSupported() {
        return true;
    }
}
