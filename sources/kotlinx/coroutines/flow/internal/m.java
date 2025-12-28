package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;

final class m implements c, kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    private final c f14128a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f14129b;

    public m(c cVar, CoroutineContext coroutineContext) {
        this.f14128a = cVar;
        this.f14129b = coroutineContext;
    }

    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
        c cVar = this.f14128a;
        if (cVar instanceof kotlin.coroutines.jvm.internal.c) {
            return (kotlin.coroutines.jvm.internal.c) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f14129b;
    }

    public void resumeWith(Object obj) {
        this.f14128a.resumeWith(obj);
    }
}
