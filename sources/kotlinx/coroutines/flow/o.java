package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.e;
import kotlinx.coroutines.internal.y;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final y f14133a = new y("NO_VALUE");

    public static final j a(int i4, int i5, BufferOverflow bufferOverflow) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i4).toString());
        } else if (i5 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i5).toString());
        } else if (i4 > 0 || i5 > 0 || bufferOverflow == BufferOverflow.SUSPEND) {
            int i6 = i5 + i4;
            if (i6 < 0) {
                i6 = Integer.MAX_VALUE;
            }
            return new SharedFlowImpl(i4, i6, bufferOverflow);
        } else {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
    }

    public static /* synthetic */ j b(int i4, int i5, BufferOverflow bufferOverflow, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i4, i5, bufferOverflow);
    }

    public static final c e(n nVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        if ((i4 == 0 || i4 == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return nVar;
        }
        return new e(nVar, coroutineContext, i4, bufferOverflow);
    }

    /* access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j4) {
        return objArr[((int) j4) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    public static final void g(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }
}
