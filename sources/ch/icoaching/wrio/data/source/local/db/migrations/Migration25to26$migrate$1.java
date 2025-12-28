package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.Migration25to26", f = "Migration25to26.kt", l = {28}, m = "migrate$suspendImpl")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Migration25to26$migrate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Migration25to26 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Migration25to26$migrate$1(Migration25to26 migration25to26, c<? super Migration25to26$migrate$1> cVar) {
        super(cVar);
        this.this$0 = migration25to26;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return Migration25to26.a(this.this$0, this);
    }
}
