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
import org.openjsse.net.ssl.OpenJSSE;

public final class j extends k {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1968e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f1969f;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f1970d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new j((i) null);
            }
            return null;
        }

        public final boolean b() {
            return j.f1969f;
        }

        private a() {
        }
    }

    static {
        a aVar = new a((i) null);
        f1968e = aVar;
        boolean z3 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1969f = z3;
    }

    public /* synthetic */ j(i iVar) {
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
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f1970d);
        o.d(instance, "getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    public X509TrustManager o() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f1970d);
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

    private j() {
        this.f1970d = new OpenJSSE();
    }
}
