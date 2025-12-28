package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A0;
import u2.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/internal/E;", "state", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlinx/coroutines/internal/E;Lkotlin/coroutines/CoroutineContext$a;)Lkotlinx/coroutines/internal/E;", "<no name provided>"}, k = 3, mv = {1, 6, 0})
final class ThreadContextKt$updateState$1 extends Lambda implements p {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    ThreadContextKt$updateState$1() {
        super(2);
    }

    public final E invoke(E e4, CoroutineContext.a aVar) {
        if (aVar instanceof A0) {
            A0 a02 = (A0) aVar;
            e4.a(a02, a02.j0(e4.f14144a));
        }
        return e4;
    }
}
