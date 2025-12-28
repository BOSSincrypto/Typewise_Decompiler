package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.B;
import l2.C0793c;
import u2.l;

public abstract class OnUndeliveredElementKt {
    public static final l a(l lVar, Object obj, CoroutineContext coroutineContext) {
        return new OnUndeliveredElementKt$bindCancellationFun$1(lVar, obj, coroutineContext);
    }

    public static final void b(l lVar, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException c4 = c(lVar, obj, (UndeliveredElementException) null);
        if (c4 != null) {
            B.a(coroutineContext, c4);
        }
    }

    public static final UndeliveredElementException c(l lVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
            C0793c.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
