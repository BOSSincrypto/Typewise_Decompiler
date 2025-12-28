package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.internal.ThreadContextKt;
import u2.p;

public abstract class d {
    /* JADX INFO: finally extract failed */
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, p pVar, c cVar) {
        Object c4 = ThreadContextKt.c(coroutineContext, obj2);
        try {
            Object invoke = ((p) v.c(pVar, 2)).invoke(obj, new m(cVar, coroutineContext));
            ThreadContextKt.a(coroutineContext, c4);
            if (invoke == a.f()) {
                f.c(cVar);
            }
            return invoke;
        } catch (Throwable th) {
            ThreadContextKt.a(coroutineContext, c4);
            throw th;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, p pVar, c cVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = ThreadContextKt.b(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, pVar, cVar);
    }

    /* access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.d d(kotlinx.coroutines.flow.d dVar, CoroutineContext coroutineContext) {
        boolean z3;
        if (dVar instanceof l) {
            z3 = true;
        } else {
            z3 = dVar instanceof j;
        }
        if (z3) {
            return dVar;
        }
        return new UndispatchedContextCollector(dVar, coroutineContext);
    }
}
