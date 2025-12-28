package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.D;

/* renamed from: kotlinx.coroutines.internal.e  reason: case insensitive filesystem */
public final class C0745e implements D {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f14170a;

    public C0745e(CoroutineContext coroutineContext) {
        this.f14170a = coroutineContext;
    }

    public CoroutineContext g() {
        return this.f14170a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + g() + ')';
    }
}
