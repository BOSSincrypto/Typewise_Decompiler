package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import u2.l;

public abstract class b implements CoroutineContext.b {

    /* renamed from: a  reason: collision with root package name */
    private final l f13871a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext.b f13872b;

    public b(CoroutineContext.b bVar, l lVar) {
        o.e(bVar, "baseKey");
        o.e(lVar, "safeCast");
        this.f13871a = lVar;
        this.f13872b = bVar instanceof b ? ((b) bVar).f13872b : bVar;
    }

    public final boolean a(CoroutineContext.b bVar) {
        o.e(bVar, "key");
        if (bVar == this || this.f13872b == bVar) {
            return true;
        }
        return false;
    }

    public final CoroutineContext.a b(CoroutineContext.a aVar) {
        o.e(aVar, "element");
        return (CoroutineContext.a) this.f13871a.invoke(aVar);
    }
}
