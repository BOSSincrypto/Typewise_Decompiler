package kotlin.coroutines.intrinsics;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import u2.l;
import u2.p;
import u2.q;

abstract class IntrinsicsKt__IntrinsicsJvmKt {
    public static c a(l lVar, c cVar) {
        o.e(lVar, "<this>");
        o.e(cVar, "completion");
        c a4 = f.a(cVar);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(a4);
        }
        CoroutineContext context = a4.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(a4, lVar);
        }
        return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(a4, context, lVar);
    }

    public static c b(p pVar, Object obj, c cVar) {
        o.e(pVar, "<this>");
        o.e(cVar, "completion");
        c a4 = f.a(cVar);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(obj, a4);
        }
        CoroutineContext context = a4.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(a4, pVar, obj);
        }
        return new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(a4, context, pVar, obj);
    }

    private static final c c(c cVar) {
        CoroutineContext context = cVar.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(cVar);
        }
        return new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(cVar, context);
    }

    public static c d(c cVar) {
        ContinuationImpl continuationImpl;
        c<Object> intercepted;
        o.e(cVar, "<this>");
        if (cVar instanceof ContinuationImpl) {
            continuationImpl = (ContinuationImpl) cVar;
        } else {
            continuationImpl = null;
        }
        if (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) {
            return cVar;
        }
        return intercepted;
    }

    public static Object e(q qVar, Object obj, Object obj2, c cVar) {
        o.e(qVar, "<this>");
        o.e(cVar, "completion");
        return ((q) v.c(qVar, 3)).invoke(obj, obj2, c(f.a(cVar)));
    }
}
