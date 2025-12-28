package com.capacitorjs.plugins.splashscreen;

import com.capacitorjs.plugins.splashscreen.SplashScreen;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.AnonymousClass3 f11349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashScreenSettings f11350b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f11351c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SplashListener f11352d;

    public /* synthetic */ n(SplashScreen.AnonymousClass3 r12, SplashScreenSettings splashScreenSettings, boolean z3, SplashListener splashListener) {
        this.f11349a = r12;
        this.f11350b = splashScreenSettings;
        this.f11351c = z3;
        this.f11352d = splashListener;
    }

    public final void run() {
        this.f11349a.lambda$onAnimationEnd$0(this.f11350b, this.f11351c, this.f11352d);
    }
}
