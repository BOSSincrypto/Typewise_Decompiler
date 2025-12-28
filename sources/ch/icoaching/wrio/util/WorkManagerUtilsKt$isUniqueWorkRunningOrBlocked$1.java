package ch.icoaching.wrio.util;

import androidx.work.WorkManager;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.util.WorkManagerUtilsKt", f = "WorkManagerUtils.kt", l = {72}, m = "isUniqueWorkRunningOrBlocked")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1(c<? super WorkManagerUtilsKt$isUniqueWorkRunningOrBlocked$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WorkManagerUtilsKt.a((WorkManager) null, (String) null, this);
    }
}
