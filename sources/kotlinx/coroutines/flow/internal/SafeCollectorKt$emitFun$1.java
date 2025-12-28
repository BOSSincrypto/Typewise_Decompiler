package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;
import u2.q;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(d dVar, Object obj, c<? super l2.q> cVar) {
        return dVar.emit(obj, cVar);
    }
}
