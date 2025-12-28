package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Z;

abstract /* synthetic */ class i {
    public static final void a(p pVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = Z.a("Channel was consumed, consumer had failed", th);
            }
        }
        pVar.e(cancellationException);
    }
}
