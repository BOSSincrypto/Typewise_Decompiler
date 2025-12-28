package androidx.core.splashscreen;

import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.core.splashscreen.g;

public final /* synthetic */ class r implements SplashScreen.OnExitAnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f5114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g.e f5115b;

    public /* synthetic */ r(g.c cVar, g.e eVar) {
        this.f5114a = cVar;
        this.f5115b = eVar;
    }

    public final void onSplashScreenExit(SplashScreenView splashScreenView) {
        g.c.t(this.f5114a, this.f5115b, splashScreenView);
    }
}
