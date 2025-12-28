package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A0;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$a;)Ljava/lang/Object;", "<no name provided>"}, k = 3, mv = {1, 6, 0})
final class ThreadContextKt$countAll$1 extends Lambda implements p {
    public static final ThreadContextKt$countAll$1 INSTANCE = new ThreadContextKt$countAll$1();

    ThreadContextKt$countAll$1() {
        super(2);
    }

    public final Object invoke(Object obj, CoroutineContext.a aVar) {
        if (!(aVar instanceof A0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
    }
}
