package kotlinx.coroutines;

import androidx.appcompat.app.F;
import kotlin.coroutines.CoroutineContext;

public final class C0 extends CoroutineDispatcher {

    /* renamed from: c  reason: collision with root package name */
    public static final C0 f13988c = new C0();

    private C0() {
    }

    public void p0(CoroutineContext coroutineContext, Runnable runnable) {
        F.a(coroutineContext.get(F0.f13995b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public boolean q0(CoroutineContext coroutineContext) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
