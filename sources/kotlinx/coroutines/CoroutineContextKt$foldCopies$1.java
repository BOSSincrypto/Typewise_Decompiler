package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class CoroutineContextKt$foldCopies$1 extends Lambda implements p {
    public static final CoroutineContextKt$foldCopies$1 INSTANCE = new CoroutineContextKt$foldCopies$1();

    CoroutineContextKt$foldCopies$1() {
        super(2);
    }

    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        return coroutineContext.plus(aVar);
    }
}
