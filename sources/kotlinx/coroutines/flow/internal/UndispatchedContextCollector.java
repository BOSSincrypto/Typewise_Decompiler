package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.internal.ThreadContextKt;
import l2.q;
import u2.p;

final class UndispatchedContextCollector implements d {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f14112a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14113b;

    /* renamed from: c  reason: collision with root package name */
    private final p f14114c;

    public UndispatchedContextCollector(d dVar, CoroutineContext coroutineContext) {
        this.f14112a = coroutineContext;
        this.f14113b = ThreadContextKt.b(coroutineContext);
        this.f14114c = new UndispatchedContextCollector$emitRef$1(dVar, (c<? super UndispatchedContextCollector$emitRef$1>) null);
    }

    public Object emit(Object obj, c cVar) {
        Object b4 = d.b(this.f14112a, obj, this.f14113b, this.f14114c, cVar);
        if (b4 == a.f()) {
            return b4;
        }
        return q.f14567a;
    }
}
