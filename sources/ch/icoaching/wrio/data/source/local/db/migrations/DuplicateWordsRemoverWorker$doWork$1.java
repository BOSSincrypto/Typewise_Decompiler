package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker", f = "DuplicateWordsRemoverWorker.kt", l = {37}, m = "doWork")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DuplicateWordsRemoverWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DuplicateWordsRemoverWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DuplicateWordsRemoverWorker$doWork$1(DuplicateWordsRemoverWorker duplicateWordsRemoverWorker, c<? super DuplicateWordsRemoverWorker$doWork$1> cVar) {
        super(cVar);
        this.this$0 = duplicateWordsRemoverWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(this);
    }
}
