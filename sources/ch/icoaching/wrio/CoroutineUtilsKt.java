package ch.icoaching.wrio;

import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.e;

public abstract class CoroutineUtilsKt {
    public static final c a(long j4, long j5) {
        return e.h(new CoroutineUtilsKt$tickerFlow$1(j5, j4, (kotlin.coroutines.c<? super CoroutineUtilsKt$tickerFlow$1>) null));
    }

    public static /* synthetic */ c b(long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        return a(j4, j5);
    }
}
