package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

abstract /* synthetic */ class k0 {
    public static final C0755t a(g0 g0Var) {
        return new i0(g0Var);
    }

    public static /* synthetic */ C0755t b(g0 g0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            g0Var = null;
        }
        return j0.a(g0Var);
    }

    public static final void c(CoroutineContext coroutineContext, CancellationException cancellationException) {
        g0 g0Var = (g0) coroutineContext.get(g0.f14139t);
        if (g0Var != null) {
            g0Var.e(cancellationException);
        }
    }

    public static /* synthetic */ void d(CoroutineContext coroutineContext, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        j0.c(coroutineContext, cancellationException);
    }

    public static final void e(CoroutineContext coroutineContext) {
        g0 g0Var = (g0) coroutineContext.get(g0.f14139t);
        if (g0Var != null) {
            j0.f(g0Var);
        }
    }

    public static final void f(g0 g0Var) {
        if (!g0Var.a()) {
            throw g0Var.R();
        }
    }
}
