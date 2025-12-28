package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import l2.C0793c;

public abstract class B {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        try {
            C0761z zVar = (C0761z) coroutineContext.get(C0761z.f14322s);
            if (zVar != null) {
                zVar.e0(coroutineContext, th);
            } else {
                A.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            A.a(coroutineContext, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C0793c.a(runtimeException, th);
        return runtimeException;
    }
}
