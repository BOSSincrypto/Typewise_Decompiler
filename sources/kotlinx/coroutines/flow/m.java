package kotlinx.coroutines.flow;

import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import l2.q;
import u2.p;

final class m extends AbstractFlow {

    /* renamed from: a  reason: collision with root package name */
    private final p f14132a;

    public m(p pVar) {
        this.f14132a = pVar;
    }

    public Object c(d dVar, c cVar) {
        Object invoke = this.f14132a.invoke(dVar, cVar);
        if (invoke == a.f()) {
            return invoke;
        }
        return q.f14567a;
    }
}
