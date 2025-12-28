package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import u2.p;

public abstract class a implements CoroutineContext.a {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext.b f13870a;

    public a(CoroutineContext.b bVar) {
        o.e(bVar, "key");
        this.f13870a = bVar;
    }

    public Object fold(Object obj, p pVar) {
        return CoroutineContext.a.C0200a.a(this, obj, pVar);
    }

    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0200a.b(this, bVar);
    }

    public CoroutineContext.b getKey() {
        return this.f13870a;
    }

    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0200a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0200a.d(this, coroutineContext);
    }
}
