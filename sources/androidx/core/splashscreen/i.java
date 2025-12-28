package androidx.core.splashscreen;

import androidx.core.splashscreen.g;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreenViewProvider f5112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g.e f5113b;

    public /* synthetic */ i(SplashScreenViewProvider splashScreenViewProvider, g.e eVar) {
        this.f5112a = splashScreenViewProvider;
        this.f5113b = eVar;
    }

    public final void run() {
        g.b.f(this.f5112a, this.f5113b);
    }
}
