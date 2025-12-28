package okhttp3;

import a3.c;
import androidx.appcompat.app.F;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okio.ByteString;
import u2.C0906a;

public final class CertificatePinner {

    /* renamed from: c  reason: collision with root package name */
    public static final b f15146c = new b((i) null);

    /* renamed from: d  reason: collision with root package name */
    public static final CertificatePinner f15147d = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set f15148a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15149b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f15150a = new ArrayList();

        public final CertificatePinner a() {
            return new CertificatePinner(C0718m.F0(this.f15150a), (c) null, 2, (i) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final String a(Certificate certificate) {
            o.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return o.k("sha256/", b((X509Certificate) certificate).base64());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }

        public final ByteString b(X509Certificate x509Certificate) {
            o.e(x509Certificate, "<this>");
            ByteString.a aVar = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            o.d(encoded, "publicKey.encoded");
            return ByteString.a.h(aVar, encoded, 0, 0, 3, (Object) null).sha256();
        }

        private b() {
        }
    }

    public CertificatePinner(Set set, c cVar) {
        o.e(set, "pins");
        this.f15148a = set;
        this.f15149b = cVar;
    }

    public final void a(String str, List list) {
        o.e(str, "hostname");
        o.e(list, "peerCertificates");
        b(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void b(String str, C0906a aVar) {
        o.e(str, "hostname");
        o.e(aVar, "cleanedPeerCertificatesFn");
        List<Object> c4 = c(str);
        if (!c4.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            for (X509Certificate x509Certificate : list) {
                Iterator it = c4.iterator();
                if (it.hasNext()) {
                    F.a(it.next());
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(f15146c.a(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Object a4 : c4) {
                F.a(a4);
                sb.append("\n    ");
                sb.append((Object) null);
            }
            String sb2 = sb.toString();
            o.d(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public final List c(String str) {
        o.e(str, "hostname");
        List j4 = C0718m.j();
        Iterator it = this.f15148a.iterator();
        if (!it.hasNext()) {
            return j4;
        }
        F.a(it.next());
        throw null;
    }

    public final c d() {
        return this.f15149b;
    }

    public final CertificatePinner e(c cVar) {
        o.e(cVar, "certificateChainCleaner");
        if (o.a(this.f15149b, cVar)) {
            return this;
        }
        return new CertificatePinner(this.f15148a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!o.a(certificatePinner.f15148a, this.f15148a) || !o.a(certificatePinner.f15149b, this.f15149b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = (1517 + this.f15148a.hashCode()) * 41;
        c cVar = this.f15149b;
        if (cVar != null) {
            i4 = cVar.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, c cVar, int i4, i iVar) {
        this(set, (i4 & 2) != 0 ? null : cVar);
    }
}
