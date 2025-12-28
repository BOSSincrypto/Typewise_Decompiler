package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import okhttp3.Handshake;
import u2.C0906a;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class RealConnection$connectTls$2 extends Lambda implements C0906a {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake d4 = this.this$0.f15327g;
        o.b(d4);
        Iterable<Certificate> d5 = d4.d();
        ArrayList arrayList = new ArrayList(C0718m.t(d5, 10));
        for (Certificate certificate : d5) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
