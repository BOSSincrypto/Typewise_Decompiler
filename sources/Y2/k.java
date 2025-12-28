package Y2;

import X2.e;
import Y2.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import org.conscrypt.Conscrypt;

public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2120a = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final l.a f2121b = new a();

    public static final class a implements l.a {
        a() {
        }

        public boolean a(SSLSocket sSLSocket) {
            o.e(sSLSocket, "sslSocket");
            if (!e.f1953e.c() || !Conscrypt.isConscrypt(sSLSocket)) {
                return false;
            }
            return true;
        }

        public m b(SSLSocket sSLSocket) {
            o.e(sSLSocket, "sslSocket");
            return new k();
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final l.a a() {
            return k.f2121b;
        }

        private b() {
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = X2.k.f1971a.b(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public boolean isSupported() {
        return e.f1953e.c();
    }
}
