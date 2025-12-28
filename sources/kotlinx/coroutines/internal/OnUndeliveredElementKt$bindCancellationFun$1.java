package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Ll2/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class OnUndeliveredElementKt$bindCancellationFun$1 extends Lambda implements l {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Object $element;
    final /* synthetic */ l $this_bindCancellationFun;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OnUndeliveredElementKt$bindCancellationFun$1(l lVar, Object obj, CoroutineContext coroutineContext) {
        super(1);
        this.$this_bindCancellationFun = lVar;
        this.$element = obj;
        this.$context = coroutineContext;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return q.f14567a;
    }

    public final void invoke(Throwable th) {
        OnUndeliveredElementKt.b(this.$this_bindCancellationFun, this.$element, this.$context);
    }
}
