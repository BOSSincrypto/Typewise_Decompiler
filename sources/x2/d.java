package X2;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

public final class d extends k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1950e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f1951f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f1952d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final d a() {
            if (b()) {
                return new d((i) null);
            }
            return null;
        }

        public final boolean b() {
            return d.f1951f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((i) null);
        f1950e = aVar;
        boolean z3 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1951f = z3;
    }

    public /* synthetic */ d(i iVar) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        super.e(sSLSocket, str, list);
    }

    public String g(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return super.g(sSLSocket);
    }

    public SSLContext m() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f1952d);
        o.d(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public X509TrustManager o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        o.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        o.d(arrays, "toString(this)");
        throw new IllegalStateException(o.k("Unexpected default trust managers: ", arrays).toString());
    }

    private d() {
        this.f1952d = new BouncyCastleJsseProvider();
    }
}
