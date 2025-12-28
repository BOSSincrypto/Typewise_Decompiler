package ch.icoaching.wrio.keyboard;

import java.util.concurrent.Executor;

public final /* synthetic */ class r implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultSmartBarController f10106a;

    public /* synthetic */ r(DefaultSmartBarController defaultSmartBarController) {
        this.f10106a = defaultSmartBarController;
    }

    public final void execute(Runnable runnable) {
        DefaultSmartBarController.A(this.f10106a, runnable);
    }
}
