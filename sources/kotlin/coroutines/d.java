package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;

public interface d extends CoroutineContext.a {

    /* renamed from: r  reason: collision with root package name */
    public static final b f13873r = b.f13874a;

    public static final class a {
        public static CoroutineContext.a a(d dVar, CoroutineContext.b bVar) {
            o.e(bVar, "key");
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (!bVar2.a(dVar.getKey())) {
                    return null;
                }
                CoroutineContext.a b4 = bVar2.b(dVar);
                if (b4 instanceof CoroutineContext.a) {
                    return b4;
                }
                return null;
            } else if (d.f13873r != bVar) {
                return null;
            } else {
                o.c(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        public static CoroutineContext b(d dVar, CoroutineContext.b bVar) {
            o.e(bVar, "key");
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (!bVar2.a(dVar.getKey()) || bVar2.b(dVar) == null) {
                    return dVar;
                }
                return EmptyCoroutineContext.INSTANCE;
            } else if (d.f13873r == bVar) {
                return EmptyCoroutineContext.INSTANCE;
            } else {
                return dVar;
            }
        }
    }

    public static final class b implements CoroutineContext.b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f13874a = new b();

        private b() {
        }
    }

    void h(c cVar);

    c o(c cVar);
}
