package ch.icoaching.wrio.data.source.local.db.migrations;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.data.source.local.db.migrations.Migration35to36", f = "Migration35to36.kt", l = {31}, m = "migrate")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Migration35to36$migrate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Migration35to36 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Migration35to36$migrate$1(Migration35to36 migration35to36, c<? super Migration35to36$migrate$1> cVar) {
        super(cVar);
        this.this$0 = migration35to36;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
