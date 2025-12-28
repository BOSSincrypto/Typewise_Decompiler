package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import l2.q;

public abstract class L {
    public static final Object a(long j4, c cVar) {
        if (j4 <= 0) {
            return q.f14567a;
        }
        C0748l lVar = new C0748l(a.d(cVar), 1);
        lVar.z();
        if (j4 < Long.MAX_VALUE) {
            b(lVar.getContext()).y(j4, lVar);
        }
        Object v3 = lVar.v();
        if (v3 == a.f()) {
            f.c(cVar);
        }
        if (v3 == a.f()) {
            return v3;
        }
        return q.f14567a;
    }

    public static final K b(CoroutineContext coroutineContext) {
        K k4;
        CoroutineContext.a aVar = coroutineContext.get(d.f13873r);
        if (aVar instanceof K) {
            k4 = (K) aVar;
        } else {
            k4 = null;
        }
        if (k4 == null) {
            return H.a();
        }
        return k4;
    }
}
