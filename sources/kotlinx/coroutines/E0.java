package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import u2.p;

final class E0 implements CoroutineContext.a, CoroutineContext.b {

    /* renamed from: a  reason: collision with root package name */
    public static final E0 f13993a = new E0();

    private E0() {
    }

    public Object fold(Object obj, p pVar) {
        return CoroutineContext.a.C0200a.a(this, obj, pVar);
    }

    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0200a.b(this, bVar);
    }

    public CoroutineContext.b getKey() {
        return this;
    }

    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0200a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0200a.d(this, coroutineContext);
    }
}
