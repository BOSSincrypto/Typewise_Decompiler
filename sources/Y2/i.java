package Y2;

import X2.d;
import X2.k;
import Y2.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.o;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2114a = new b((kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f2115b = new a();

    public static final class a implements l.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            o.e(sSLSocket, "sslSocket");
            boolean b4 = d.f1950e.b();
            return false;
        }

        public m b(SSLSocket sSLSocket) {
            o.e(sSLSocket, "sslSocket");
            return new i();
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final l.a a() {
            return i.f2115b;
        }

        private b() {
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return false;
    }

    public String b(SSLSocket sSLSocket) {
        boolean z3;
        o.e(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null) {
            z3 = true;
        } else {
            z3 = o.a(applicationProtocol, "");
        }
        if (z3) {
            return null;
        }
        return applicationProtocol;
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = k.f1971a.b(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public boolean isSupported() {
        return d.f1950e.b();
    }
}
