package okhttp3;

import Q2.d;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.c;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.f;
import u2.C0906a;

public final class Handshake {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f15151e = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final TlsVersion f15152a;

    /* renamed from: b  reason: collision with root package name */
    private final h f15153b;

    /* renamed from: c  reason: collision with root package name */
    private final List f15154c;

    /* renamed from: d  reason: collision with root package name */
    private final f f15155d;

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final List b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return d.w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return C0718m.j();
        }

        public final Handshake a(SSLSession sSLSession) {
            boolean z3;
            List list;
            o.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (o.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    z3 = true;
                } else {
                    z3 = o.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!z3) {
                    h b4 = h.f15253b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null");
                    } else if (!o.a("NONE", protocol)) {
                        TlsVersion a4 = TlsVersion.Companion.a(protocol);
                        try {
                            list = b(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
                            list = C0718m.j();
                        }
                        return new Handshake(a4, b4, b(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(o.k("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null");
            }
        }

        private Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, h hVar, List list, C0906a aVar) {
        o.e(tlsVersion, "tlsVersion");
        o.e(hVar, "cipherSuite");
        o.e(list, "localCertificates");
        o.e(aVar, "peerCertificatesFn");
        this.f15152a = tlsVersion;
        this.f15153b = hVar;
        this.f15154c = list;
        this.f15155d = c.b(new Handshake$peerCertificates$2(aVar));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        o.d(type, "type");
        return type;
    }

    public final h a() {
        return this.f15153b;
    }

    public final List c() {
        return this.f15154c;
    }

    public final List d() {
        return (List) this.f15155d.getValue();
    }

    public final TlsVersion e() {
        return this.f15152a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f15152a != this.f15152a || !o.a(handshake.f15153b, this.f15153b) || !o.a(handshake.d(), d()) || !o.a(handshake.f15154c, this.f15154c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f15152a.hashCode()) * 31) + this.f15153b.hashCode()) * 31) + d().hashCode()) * 31) + this.f15154c.hashCode();
    }

    public String toString() {
        Iterable<Certificate> d4 = d();
        ArrayList arrayList = new ArrayList(C0718m.t(d4, 10));
        for (Certificate b4 : d4) {
            arrayList.add(b(b4));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f15152a);
        sb.append(" cipherSuite=");
        sb.append(this.f15153b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        Iterable<Certificate> iterable = this.f15154c;
        ArrayList arrayList2 = new ArrayList(C0718m.t(iterable, 10));
        for (Certificate b5 : iterable) {
            arrayList2.add(b(b5));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
