package kotlinx.coroutines.flow;

import kotlin.coroutines.c;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import u2.l;

abstract /* synthetic */ class FlowKt__DelayKt {
    public static final c a(c cVar, long j4) {
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        } else if (i4 == 0) {
            return cVar;
        } else {
            return b(cVar, new FlowKt__DelayKt$debounce$2(j4));
        }
    }

    private static final c b(c cVar, l lVar) {
        return FlowCoroutineKt.b(new FlowKt__DelayKt$debounceInternal$1(lVar, cVar, (c<? super FlowKt__DelayKt$debounceInternal$1>) null));
    }
}
