package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.internal.y;

public abstract class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y f14136a = new y("NONE");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final y f14137b = new y("PENDING");

    public static final k a(Object obj) {
        if (obj == null) {
            obj = k.f14124a;
        }
        return new StateFlowImpl(obj);
    }

    public static final c d(q qVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        if (((i4 < 0 || i4 >= 2) && i4 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            return o.e(qVar, coroutineContext, i4, bufferOverflow);
        }
        return qVar;
    }
}
