package okhttp3;

import a3.c;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.Lambda;
import u2.C0906a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class CertificatePinner$check$1 extends Lambda implements C0906a {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List<Certificate> $peerCertificates;
    final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    public final List<X509Certificate> invoke() {
        c d4 = this.this$0.d();
        List<Certificate> a4 = d4 == null ? null : d4.a(this.$peerCertificates, this.$hostname);
        if (a4 == null) {
            a4 = this.$peerCertificates;
        }
        Iterable<Certificate> iterable = a4;
        ArrayList arrayList = new ArrayList(C0718m.t(iterable, 10));
        for (Certificate certificate : iterable) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
