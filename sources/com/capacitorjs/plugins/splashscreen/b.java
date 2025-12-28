package com.capacitorjs.plugins.splashscreen;

import androidx.appcompat.app.C0370d;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0370d f11320b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashScreenSettings f11321c;

    public /* synthetic */ b(SplashScreen splashScreen, C0370d dVar, SplashScreenSettings splashScreenSettings) {
        this.f11319a = splashScreen;
        this.f11320b = dVar;
        this.f11321c = splashScreenSettings;
    }

    public final void run() {
        this.f11319a.lambda$showWithAndroid12API$3(this.f11320b, this.f11321c);
    }
}
