package okhttp3.internal.connection;

import a3.c;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import okhttp3.C0841a;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import u2.C0906a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class RealConnection$connectTls$1 extends Lambda implements C0906a {
    final /* synthetic */ C0841a $address;
    final /* synthetic */ CertificatePinner $certificatePinner;
    final /* synthetic */ Handshake $unverifiedHandshake;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, C0841a aVar) {
        super(0);
        this.$certificatePinner = certificatePinner;
        this.$unverifiedHandshake = handshake;
        this.$address = aVar;
    }

    public final List<Certificate> invoke() {
        c d4 = this.$certificatePinner.d();
        o.b(d4);
        return d4.a(this.$unverifiedHandshake.d(), this.$address.l().i());
    }
}
