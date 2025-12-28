package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.g0;
import l2.q;

abstract /* synthetic */ class FlowKt__CollectKt {
    public static final Object a(c cVar, c cVar2) {
        Object a4 = cVar.a(j.f14123a, cVar2);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }

    public static final g0 b(c cVar, D d4) {
        return C0739h.d(d4, (CoroutineContext) null, (CoroutineStart) null, new FlowKt__CollectKt$launchIn$1(cVar, (c<? super FlowKt__CollectKt$launchIn$1>) null), 3, (Object) null);
    }
}
