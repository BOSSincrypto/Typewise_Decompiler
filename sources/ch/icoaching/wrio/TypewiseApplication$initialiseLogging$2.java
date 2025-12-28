package ch.icoaching.wrio;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.TypewiseApplication$initialiseLogging$2", f = "TypewiseApplication.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseApplication$initialiseLogging$2 extends SuspendLambda implements p {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ TypewiseApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseApplication$initialiseLogging$2(TypewiseApplication typewiseApplication, c<? super TypewiseApplication$initialiseLogging$2> cVar) {
        super(2, cVar);
        this.this$0 = typewiseApplication;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        TypewiseApplication$initialiseLogging$2 typewiseApplication$initialiseLogging$2 = new TypewiseApplication$initialiseLogging$2(this.this$0, cVar);
        typewiseApplication$initialiseLogging$2.J$0 = ((Number) obj).longValue();
        return typewiseApplication$initialiseLogging$2;
    }

    public final Object invoke(long j4, c<? super q> cVar) {
        return ((TypewiseApplication$initialiseLogging$2) create(Long.valueOf(j4), cVar)).invokeSuspend(q.f14567a);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            long j4 = this.J$0;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.this$0.f9055f;
            if (j4 > 0 && elapsedRealtime > 10000) {
                this.this$0.f9055f = SystemClock.elapsedRealtime();
                ch.icoaching.wrio.util.c.a(this.this$0);
            }
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (c<? super q>) (c) obj2);
    }
}
