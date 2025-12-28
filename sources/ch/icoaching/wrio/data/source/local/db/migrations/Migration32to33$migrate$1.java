package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.Migration32to33", f = "Migration32to33.kt", l = {16}, m = "migrate")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Migration32to33$migrate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Migration32to33 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Migration32to33$migrate$1(Migration32to33 migration32to33, c<? super Migration32to33$migrate$1> cVar) {
        super(cVar);
        this.this$0 = migration32to33;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
