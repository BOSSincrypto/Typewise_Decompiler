package a3;

import X2.k;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2319a = new a((i) null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a(X509TrustManager x509TrustManager) {
            o.e(x509TrustManager, "trustManager");
            return k.f1971a.g().c(x509TrustManager);
        }

        private a() {
        }
    }

    public abstract List a(List list, String str);
}
