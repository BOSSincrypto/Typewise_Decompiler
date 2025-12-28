package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class f0 implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f3558a;

    public /* synthetic */ f0(Runnable runnable) {
        this.f3558a = runnable;
    }

    public final void onBackInvoked() {
        this.f3558a.run();
    }
}
