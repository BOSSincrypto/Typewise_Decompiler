package R2;

import com.silkimen.http.HttpRequest;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.C;
import okhttp3.C0841a;
import okhttp3.C0842b;
import okhttp3.g;
import okhttp3.n;
import okhttp3.p;
import okhttp3.t;
import okhttp3.y;

public final class a implements C0842b {

    /* renamed from: d  reason: collision with root package name */
    private final p f1385d;

    /* renamed from: R2.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0023a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1386a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f1386a = iArr;
        }
    }

    public a(p pVar) {
        o.e(pVar, "defaultDns");
        this.f1385d = pVar;
    }

    private final InetAddress b(Proxy proxy, t tVar, p pVar) {
        int i4;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i4 = -1;
        } else {
            i4 = C0023a.f1386a[type.ordinal()];
        }
        if (i4 == 1) {
            return (InetAddress) C0718m.R(pVar.a(tVar.i()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            o.d(address2, "address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    public y a(C c4, A a4) {
        boolean z3;
        Proxy proxy;
        p pVar;
        PasswordAuthentication passwordAuthentication;
        String str;
        C0841a a5;
        o.e(a4, "response");
        List<g> h4 = a4.h();
        y o02 = a4.o0();
        t j4 = o02.j();
        if (a4.m() == 407) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c4 == null) {
            proxy = null;
        } else {
            proxy = c4.b();
        }
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (g gVar : h4) {
            if (kotlin.text.o.v("Basic", gVar.c(), true)) {
                if (c4 == null || (a5 = c4.a()) == null) {
                    pVar = null;
                } else {
                    pVar = a5.c();
                }
                if (pVar == null) {
                    pVar = this.f1385d;
                }
                if (z3) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        o.d(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, j4, pVar), inetSocketAddress.getPort(), j4.r(), gVar.b(), gVar.c(), j4.t(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String i4 = j4.i();
                    o.d(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i4, b(proxy, j4, pVar), j4.n(), j4.r(), gVar.b(), gVar.c(), j4.t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    if (z3) {
                        str = HttpRequest.HEADER_PROXY_AUTHORIZATION;
                    } else {
                        str = HttpRequest.HEADER_AUTHORIZATION;
                    }
                    String userName = passwordAuthentication.getUserName();
                    o.d(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    o.d(password, "auth.password");
                    return o02.h().e(str, n.a(userName, new String(password), gVar.a())).b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, int i4, i iVar) {
        this((i4 & 1) != 0 ? p.f15474b : pVar);
    }
}
