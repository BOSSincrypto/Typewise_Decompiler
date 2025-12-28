package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.o;
import okhttp3.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List f15342a;

    /* renamed from: b  reason: collision with root package name */
    private int f15343b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15344c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15345d;

    public b(List list) {
        o.e(list, "connectionSpecs");
        this.f15342a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i4 = this.f15343b;
        int size = this.f15342a.size();
        while (i4 < size) {
            int i5 = i4 + 1;
            if (((k) this.f15342a.get(i4)).e(sSLSocket)) {
                return true;
            }
            i4 = i5;
        }
        return false;
    }

    public final k a(SSLSocket sSLSocket) {
        k kVar;
        o.e(sSLSocket, "sslSocket");
        int i4 = this.f15343b;
        int size = this.f15342a.size();
        while (true) {
            if (i4 >= size) {
                kVar = null;
                break;
            }
            int i5 = i4 + 1;
            kVar = (k) this.f15342a.get(i4);
            if (kVar.e(sSLSocket)) {
                this.f15343b = i5;
                break;
            }
            i4 = i5;
        }
        if (kVar != null) {
            this.f15344c = c(sSLSocket);
            kVar.c(sSLSocket, this.f15345d);
            return kVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f15345d);
        sb.append(", modes=");
        sb.append(this.f15342a);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        o.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        o.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(IOException iOException) {
        o.e(iOException, "e");
        this.f15345d = true;
        if (this.f15344c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
            return true;
        }
        return false;
    }
}
