package kotlinx.coroutines.channels;

import u2.l;

public abstract class f {
    public static final d a(int i4, BufferOverflow bufferOverflow, l lVar) {
        int i5 = 1;
        if (i4 == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                i5 = d.f14062u.a();
            }
            return new c(i5, bufferOverflow, lVar);
        } else if (i4 != -1) {
            if (i4 != 0) {
                if (i4 == Integer.MAX_VALUE) {
                    return new l(lVar);
                }
                if (i4 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                    return new k(lVar);
                }
                return new c(i4, bufferOverflow, lVar);
            } else if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new r(lVar);
            } else {
                return new c(1, bufferOverflow, lVar);
            }
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new k(lVar);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ d b(int i4, BufferOverflow bufferOverflow, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        if ((i5 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        return a(i4, bufferOverflow, lVar);
    }
}
