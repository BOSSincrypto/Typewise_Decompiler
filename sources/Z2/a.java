package Z2;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.C0718m;

public final class a extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2189a = new a();

    private a() {
    }

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List select(URI uri) {
        if (uri != null) {
            return C0718m.e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
