package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;

final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final i f14121a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final CoroutineContext f14122b = EmptyCoroutineContext.INSTANCE;

    private i() {
    }

    public CoroutineContext getContext() {
        return f14122b;
    }

    public void resumeWith(Object obj) {
    }
}
