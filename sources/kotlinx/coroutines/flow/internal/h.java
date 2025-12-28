package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.c;

public interface h extends c {

    public static final class a {
        public static /* synthetic */ c a(h hVar, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, Object obj) {
            if (obj == null) {
                if ((i5 & 1) != 0) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                if ((i5 & 2) != 0) {
                    i4 = -3;
                }
                if ((i5 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return hVar.b(coroutineContext, i4, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    c b(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow);
}
