package X2;

import Y2.e;
import a3.b;
import a3.c;
import c3.C0500b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.Protocol;
import okhttp3.x;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1971a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile k f1972b;

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f1973c = Logger.getLogger(x.class.getName());

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private final k d() {
            e.f2102a.b();
            k a4 = b.f1941e.a();
            if (a4 != null) {
                return a4;
            }
            k a5 = c.f1944f.a();
            o.b(a5);
            return a5;
        }

        private final k e() {
            j a4;
            d a5;
            e b4;
            if (j() && (b4 = e.f1953e.b()) != null) {
                return b4;
            }
            if (i() && (a5 = d.f1950e.a()) != null) {
                return a5;
            }
            if (k() && (a4 = j.f1968e.a()) != null) {
                return a4;
            }
            i a6 = i.f1966d.a();
            if (a6 != null) {
                return a6;
            }
            k a7 = f.f1957i.a();
            if (a7 != null) {
                return a7;
            }
            return new k();
        }

        /* access modifiers changed from: private */
        public final k f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            return o.a("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return o.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return o.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List b(List list) {
            o.e(list, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((Protocol) next) != Protocol.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List list) {
            o.e(list, "protocols");
            C0500b bVar = new C0500b();
            for (String str : b(list)) {
                bVar.I(str.length());
                bVar.f0(str);
            }
            return bVar.g0();
        }

        public final k g() {
            return k.f1972b;
        }

        public final boolean h() {
            return o.a("Dalvik", System.getProperty("java.vm.name"));
        }

        private a() {
        }
    }

    static {
        a aVar = new a((i) null);
        f1971a = aVar;
        f1972b = aVar.f();
    }

    public static /* synthetic */ void k(k kVar, String str, int i4, Throwable th, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 2) != 0) {
                i4 = 4;
            }
            if ((i5 & 4) != 0) {
                th = null;
            }
            kVar.j(str, i4, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
    }

    public c c(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        return new a3.a(d(x509TrustManager));
    }

    public a3.e d(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        o.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i4) {
        o.e(socket, "socket");
        o.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i4);
    }

    public String g(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object h(String str) {
        o.e(str, "closer");
        if (f1973c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean i(String str) {
        o.e(str, "hostname");
        return true;
    }

    public void j(String str, int i4, Throwable th) {
        Level level;
        o.e(str, "message");
        if (i4 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f1973c.log(level, str, th);
    }

    public void l(String str, Object obj) {
        o.e(str, "message");
        if (obj == null) {
            str = o.k(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext instance = SSLContext.getInstance("TLS");
        o.d(instance, "getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        o.e(x509TrustManager, "trustManager");
        try {
            SSLContext m4 = m();
            m4.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = m4.getSocketFactory();
            o.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError(o.k("No System TLS: ", e4), e4);
        }
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
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        o.d(arrays, "toString(this)");
        throw new IllegalStateException(o.k("Unexpected default trust managers: ", arrays).toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        o.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
