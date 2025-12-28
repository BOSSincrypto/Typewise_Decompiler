package U2;

import com.silkimen.http.HttpRequest;
import kotlin.jvm.internal.o;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f1515a = new f();

    private f() {
    }

    public static final boolean a(String str) {
        o.e(str, "method");
        if (o.a(str, HttpRequest.METHOD_GET) || o.a(str, HttpRequest.METHOD_HEAD)) {
            return false;
        }
        return true;
    }

    public static final boolean d(String str) {
        o.e(str, "method");
        if (o.a(str, HttpRequest.METHOD_POST) || o.a(str, HttpRequest.METHOD_PUT) || o.a(str, "PATCH") || o.a(str, "PROPPATCH") || o.a(str, "REPORT")) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        o.e(str, "method");
        return !o.a(str, "PROPFIND");
    }

    public final boolean c(String str) {
        o.e(str, "method");
        return o.a(str, "PROPFIND");
    }
}
