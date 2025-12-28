package ch.icoaching.wrio.dictionary;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.dictionary.ResetCaseCountersWorker", f = "ResetCaseCountersWorker.kt", l = {30}, m = "doWork")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ResetCaseCountersWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResetCaseCountersWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResetCaseCountersWorker$doWork$1(ResetCaseCountersWorker resetCaseCountersWorker, c<? super ResetCaseCountersWorker$doWork$1> cVar) {
        super(cVar);
        this.this$0 = resetCaseCountersWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
