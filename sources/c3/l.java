package c3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;

abstract /* synthetic */ class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f7670a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        boolean z3;
        o.e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z3 = kotlin.text.o.L(message, "getsockname failed", false, 2, (Object) null);
        } else {
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return false;
    }

    public static final u c(Socket socket) {
        o.e(socket, "<this>");
        v vVar = new v(socket);
        OutputStream outputStream = socket.getOutputStream();
        o.d(outputStream, "getOutputStream()");
        return vVar.x(new o(outputStream, vVar));
    }

    public static final w d(InputStream inputStream) {
        o.e(inputStream, "<this>");
        return new j(inputStream, new x());
    }

    public static final w e(Socket socket) {
        o.e(socket, "<this>");
        v vVar = new v(socket);
        InputStream inputStream = socket.getInputStream();
        o.d(inputStream, "getInputStream()");
        return vVar.y(new j(inputStream, vVar));
    }
}
