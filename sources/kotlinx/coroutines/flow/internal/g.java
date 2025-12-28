package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.internal.w;

final class g extends w {
    public g(CoroutineContext coroutineContext, c cVar) {
        super(coroutineContext, cVar);
    }

    public boolean I(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return B(th);
    }
}
