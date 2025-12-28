package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import u2.p;

public final class f implements CoroutineContext {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f14119a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f14120b;

    public f(Throwable th, CoroutineContext coroutineContext) {
        this.f14119a = th;
        this.f14120b = coroutineContext;
    }

    public Object fold(Object obj, p pVar) {
        return this.f14120b.fold(obj, pVar);
    }

    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return this.f14120b.get(bVar);
    }

    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.f14120b.minusKey(bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f14120b.plus(coroutineContext);
    }
}
