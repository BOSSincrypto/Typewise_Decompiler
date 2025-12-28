package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.A0;
import u2.p;

public abstract class ThreadContextKt {

    /* renamed from: a  reason: collision with root package name */
    public static final y f14159a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p f14160b = ThreadContextKt$countAll$1.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private static final p f14161c = ThreadContextKt$findOne$1.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private static final p f14162d = ThreadContextKt$updateState$1.INSTANCE;

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f14159a) {
            if (obj instanceof E) {
                ((E) obj).b(coroutineContext);
                return;
            }
            Object fold = coroutineContext.fold((Object) null, f14161c);
            if (fold != null) {
                ((A0) fold).D(coroutineContext, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f14160b);
        o.b(fold);
        return fold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f14159a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new E(coroutineContext, ((Number) obj).intValue()), f14162d);
        }
        return ((A0) obj).j0(coroutineContext);
    }
}
