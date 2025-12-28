package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.Migration29to32", f = "Migration29to32.kt", l = {19}, m = "migrate")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Migration29to32$migrate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Migration29to32 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Migration29to32$migrate$1(Migration29to32 migration29to32, c<? super Migration29to32$migrate$1> cVar) {
        super(cVar);
        this.this$0 = migration29to32;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
