package kotlinx.coroutines;

import E2.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.internal.C0745e;
import kotlinx.coroutines.internal.w;
import u2.p;

public abstract class E {
    public static final D a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(g0.f14139t) == null) {
            coroutineContext = coroutineContext.plus(k0.b((g0) null, 1, (Object) null));
        }
        return new C0745e(coroutineContext);
    }

    public static final void b(D d4, CancellationException cancellationException) {
        g0 g0Var = (g0) d4.g().get(g0.f14139t);
        if (g0Var != null) {
            g0Var.e(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + d4).toString());
    }

    public static /* synthetic */ void c(D d4, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        b(d4, cancellationException);
    }

    public static final Object d(p pVar, c cVar) {
        w wVar = new w(cVar.getContext(), cVar);
        Object e4 = b.e(wVar, wVar, pVar);
        if (e4 == a.f()) {
            f.c(cVar);
        }
        return e4;
    }
}
