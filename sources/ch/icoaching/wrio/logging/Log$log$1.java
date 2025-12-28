package ch.icoaching.wrio.logging;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.logging.Log$log$1", f = "Log.kt", l = {62}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class Log$log$1 extends SuspendLambda implements p {
    final /* synthetic */ String $message;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $tag;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Log$log$1(int i4, String str, String str2, Throwable th, c<? super Log$log$1> cVar) {
        super(2, cVar);
        this.$priority = i4;
        this.$tag = str;
        this.$message = str2;
        this.$throwable = th;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new Log$log$1(this.$priority, this.$tag, this.$message, this.$throwable, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            LogFile a4 = Log.f10575d;
            if (a4 != null) {
                int i5 = this.$priority;
                String str = this.$tag;
                String str2 = this.$message;
                Throwable th = this.$throwable;
                this.label = 1;
                if (a4.g(i5, str, str2, th, this) == f4) {
                    return f4;
                }
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((Log$log$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
