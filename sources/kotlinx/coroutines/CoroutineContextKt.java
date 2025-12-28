package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Ref$ObjectRef;

public abstract class CoroutineContextKt {
    private static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z3) {
        boolean c4 = c(coroutineContext);
        boolean c5 = c(coroutineContext2);
        if (!c4 && !c5) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z3));
        if (c5) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.INSTANCE);
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final String b(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.INSTANCE)).booleanValue();
    }

    public static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!c(coroutineContext2)) {
            return coroutineContext.plus(coroutineContext2);
        }
        return a(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext e(D d4, CoroutineContext coroutineContext) {
        CoroutineContext a4 = a(d4.g(), coroutineContext, true);
        if (a4 == P.a() || a4.get(d.f13873r) != null) {
            return a4;
        }
        return a4.plus(P.a());
    }

    public static final D0 f(c cVar) {
        while (!(cVar instanceof M) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof D0) {
                return (D0) cVar;
            }
        }
        return null;
    }

    public static final D0 g(kotlin.coroutines.c cVar, CoroutineContext coroutineContext, Object obj) {
        if (!(cVar instanceof c) || coroutineContext.get(E0.f13993a) == null) {
            return null;
        }
        D0 f4 = f((c) cVar);
        if (f4 != null) {
            f4.M0(coroutineContext, obj);
        }
        return f4;
    }
}
