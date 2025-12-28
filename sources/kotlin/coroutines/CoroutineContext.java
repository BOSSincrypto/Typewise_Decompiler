package kotlin.coroutines;

import kotlin.jvm.internal.o;
import u2.p;

public interface CoroutineContext {

    public static final class DefaultImpls {
        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            o.e(coroutineContext2, "context");
            if (coroutineContext2 == EmptyCoroutineContext.INSTANCE) {
                return coroutineContext;
            }
            return (CoroutineContext) coroutineContext2.fold(coroutineContext, CoroutineContext$plus$1.INSTANCE);
        }
    }

    public interface a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a  reason: collision with other inner class name */
        public static final class C0200a {
            public static Object a(a aVar, Object obj, p pVar) {
                o.e(pVar, "operation");
                return pVar.invoke(obj, aVar);
            }

            public static a b(a aVar, b bVar) {
                o.e(bVar, "key");
                if (!o.a(aVar.getKey(), bVar)) {
                    return null;
                }
                o.c(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            public static CoroutineContext c(a aVar, b bVar) {
                o.e(bVar, "key");
                if (o.a(aVar.getKey(), bVar)) {
                    return EmptyCoroutineContext.INSTANCE;
                }
                return aVar;
            }

            public static CoroutineContext d(a aVar, CoroutineContext coroutineContext) {
                o.e(coroutineContext, "context");
                return DefaultImpls.a(aVar, coroutineContext);
            }
        }

        a get(b bVar);

        b getKey();
    }

    public interface b {
    }

    Object fold(Object obj, p pVar);

    a get(b bVar);

    CoroutineContext minusKey(b bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
