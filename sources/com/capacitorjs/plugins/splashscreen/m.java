package com.capacitorjs.plugins.splashscreen;

import com.capacitorjs.plugins.splashscreen.SplashScreen;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen.AnonymousClass2 f11347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashScreenSettings f11348b;

    public /* synthetic */ m(SplashScreen.AnonymousClass2 r12, SplashScreenSettings splashScreenSettings) {
        this.f11347a = r12;
        this.f11348b = splashScreenSettings;
    }

    public final void run() {
        this.f11347a.lambda$onPreDraw$0(this.f11348b);
    }
}
