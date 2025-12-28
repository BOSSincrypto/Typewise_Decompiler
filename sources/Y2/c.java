package Y2;

import X2.k;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2098a = new a((i) null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final m a() {
            if (b()) {
                return new c();
            }
            return null;
        }

        public final boolean b() {
            if (!k.f1971a.h() || Build.VERSION.SDK_INT < 29) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        o.e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        boolean z3;
        o.e(sSLSocket, "sslSocket");
        String a4 = sSLSocket.getApplicationProtocol();
        if (a4 == null) {
            z3 = true;
        } else {
            z3 = o.a(a4, "");
        }
        if (z3) {
            return null;
        }
        return a4;
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = k.f1971a.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }

    public boolean isSupported() {
        return f2098a.b();
    }
}
