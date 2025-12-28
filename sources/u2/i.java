package U2;

import java.net.Proxy;
import kotlin.jvm.internal.o;
import okhttp3.t;
import okhttp3.y;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1528a = new i();

    private i() {
    }

    private final boolean b(y yVar, Proxy.Type type) {
        if (yVar.f() || type != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final String a(y yVar, Proxy.Type type) {
        o.e(yVar, "request");
        o.e(type, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.g());
        sb.append(' ');
        i iVar = f1528a;
        if (iVar.b(yVar, type)) {
            sb.append(yVar.j());
        } else {
            sb.append(iVar.c(yVar.j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String c(t tVar) {
        o.e(tVar, "url");
        String d4 = tVar.d();
        String f4 = tVar.f();
        if (f4 == null) {
            return d4;
        }
        return d4 + '?' + f4;
    }
}
