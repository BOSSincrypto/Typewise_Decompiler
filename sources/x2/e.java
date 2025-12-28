package X2;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

public final class e extends k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1953e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f1954f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f1955d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final boolean a(int i4, int i5, int i6) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i4) {
                if (version.major() > i4) {
                    return true;
                }
                return false;
            } else if (version.minor() != i5) {
                if (version.minor() > i5) {
                    return true;
                }
                return false;
            } else if (version.patch() >= i6) {
                return true;
            } else {
                return false;
            }
        }

        public final e b() {
            if (c()) {
                return new e((i) null);
            }
            return null;
        }

        public final boolean c() {
            return e.f1954f;
        }

        private a() {
        }
    }

    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1956a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a((i) null);
        f1953e = aVar;
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.a(2, 1, 0)) {
                z3 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1954f = z3;
    }

    public /* synthetic */ e(i iVar) {
        this();
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = k.f1971a.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        super.e(sSLSocket, str, list);
    }

    public String g(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.g(sSLSocket);
    }

    public SSLContext m() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f1955d);
        o.d(instance, "getInstance(\"TLS\", provider)");
        return instance;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        SSLContext m4 = m();
        m4.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = m4.getSocketFactory();
        o.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public X509TrustManager o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        o.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                    Conscrypt.setHostnameVerifier(x509TrustManager, b.f1956a);
                    return x509TrustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        o.d(arrays, "toString(this)");
        throw new IllegalStateException(o.k("Unexpected default trust managers: ", arrays).toString());
    }

    private e() {
        Provider newProvider = Conscrypt.newProvider();
        o.d(newProvider, "newProvider()");
        this.f1955d = newProvider;
    }
}
