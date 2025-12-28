package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.internal.w;

public abstract class SafeCollector_commonKt {
    public static final void a(SafeCollector safeCollector, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new SafeCollector_commonKt$checkContext$result$1(safeCollector))).intValue() != safeCollector.collectContextSize) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final g0 b(g0 g0Var, g0 g0Var2) {
        while (g0Var != null) {
            if (g0Var == g0Var2 || !(g0Var instanceof w)) {
                return g0Var;
            }
            g0Var = ((w) g0Var).K0();
        }
        return null;
    }
}
