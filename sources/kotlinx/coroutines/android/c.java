package kotlinx.coroutines.android;

import kotlinx.coroutines.Q;

public final /* synthetic */ class c implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HandlerContext f14029a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f14030b;

    public /* synthetic */ c(HandlerContext handlerContext, Runnable runnable) {
        this.f14029a = handlerContext;
        this.f14030b = runnable;
    }

    public final void d() {
        HandlerContext.y0(this.f14029a, this.f14030b);
    }
}
