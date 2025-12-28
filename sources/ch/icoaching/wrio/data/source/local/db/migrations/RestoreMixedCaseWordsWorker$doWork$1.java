package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.RestoreMixedCaseWordsWorker", f = "RestoreMixedCaseWordsWorker.kt", l = {32}, m = "doWork")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RestoreMixedCaseWordsWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RestoreMixedCaseWordsWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RestoreMixedCaseWordsWorker$doWork$1(RestoreMixedCaseWordsWorker restoreMixedCaseWordsWorker, c<? super RestoreMixedCaseWordsWorker$doWork$1> cVar) {
        super(cVar);
        this.this$0 = restoreMixedCaseWordsWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
