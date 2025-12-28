package c3;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;

final class v extends C0499a {

    /* renamed from: m  reason: collision with root package name */
    private final Socket f7695m;

    public v(Socket socket) {
        o.e(socket, "socket");
        this.f7695m = socket;
    }

    /* access modifiers changed from: protected */
    public IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void z() {
        try {
            this.f7695m.close();
        } catch (Exception e4) {
            Logger a4 = l.f7670a;
            Level level = Level.WARNING;
            a4.log(level, "Failed to close timed out socket " + this.f7695m, e4);
        } catch (AssertionError e5) {
            if (k.c(e5)) {
                Logger a5 = l.f7670a;
                Level level2 = Level.WARNING;
                a5.log(level2, "Failed to close timed out socket " + this.f7695m, e5);
                return;
            }
            throw e5;
        }
    }
}
