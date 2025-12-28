package Y2;

import a3.c;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class d extends c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2099d = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final X509TrustManager f2100b;

    /* renamed from: c  reason: collision with root package name */
    private final X509TrustManagerExtensions f2101c;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final d a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            o.e(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        private a() {
        }
    }

    public d(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        o.e(x509TrustManager, "trustManager");
        o.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f2100b = x509TrustManager;
        this.f2101c = x509TrustManagerExtensions;
    }

    public List a(List list, String str) {
        o.e(list, "chain");
        o.e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.f2101c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                o.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e4) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
                sSLPeerUnverifiedException.initCause(e4);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d) || ((d) obj).f2100b != this.f2100b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f2100b);
    }
}
