package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.g0;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(ILkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements p {
    final /* synthetic */ SafeCollector<?> $this_checkContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.$this_checkContext = safeCollector;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (CoroutineContext.a) obj2);
    }

    public final Integer invoke(int i4, CoroutineContext.a aVar) {
        CoroutineContext.b key = aVar.getKey();
        CoroutineContext.a aVar2 = this.$this_checkContext.collectContext.get(key);
        if (key != g0.f14139t) {
            return Integer.valueOf(aVar != aVar2 ? Integer.MIN_VALUE : i4 + 1);
        }
        g0 g0Var = (g0) aVar2;
        g0 b4 = SafeCollector_commonKt.b((g0) aVar, g0Var);
        if (b4 == g0Var) {
            if (g0Var != null) {
                i4++;
            }
            return Integer.valueOf(i4);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b4 + ", expected child of " + g0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
