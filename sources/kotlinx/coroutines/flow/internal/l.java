package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    private final t f14127a;

    public l(t tVar) {
        this.f14127a = tVar;
    }

    public Object emit(Object obj, c cVar) {
        Object n4 = this.f14127a.n(obj, cVar);
        if (n4 == a.f()) {
            return n4;
        }
        return q.f14567a;
    }
}
