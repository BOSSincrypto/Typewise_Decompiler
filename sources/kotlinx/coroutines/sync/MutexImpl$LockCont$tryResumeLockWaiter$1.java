package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.sync.MutexImpl;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class MutexImpl$LockCont$tryResumeLockWaiter$1 extends Lambda implements l {
    final /* synthetic */ MutexImpl this$0;
    final /* synthetic */ MutexImpl.LockCont this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutexImpl$LockCont$tryResumeLockWaiter$1(MutexImpl mutexImpl, MutexImpl.LockCont lockCont) {
        super(1);
        this.this$0 = mutexImpl;
        this.this$1 = lockCont;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return q.f14567a;
    }

    public final void invoke(Throwable th) {
        this.this$0.b(this.this$1.f14300d);
    }
}
