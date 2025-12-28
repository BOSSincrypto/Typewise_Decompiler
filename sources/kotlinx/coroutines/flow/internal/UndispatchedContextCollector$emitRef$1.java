package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"T", "it", "Ll2/q;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements p {
    final /* synthetic */ kotlinx.coroutines.flow.d $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UndispatchedContextCollector$emitRef$1(kotlinx.coroutines.flow.d dVar, c<? super UndispatchedContextCollector$emitRef$1> cVar) {
        super(2, cVar);
        this.$downstream = dVar;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, cVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            Object obj2 = this.L$0;
            kotlinx.coroutines.flow.d dVar = this.$downstream;
            this.label = 1;
            if (dVar.emit(obj2, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(Object obj, c<? super q> cVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(obj, cVar)).invokeSuspend(q.f14567a);
    }
}
