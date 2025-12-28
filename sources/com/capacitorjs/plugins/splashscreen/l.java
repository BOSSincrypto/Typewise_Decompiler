package com.capacitorjs.plugins.splashscreen;

import androidx.appcompat.app.C0370d;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0370d f11343b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashScreenSettings f11344c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f11345d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ SplashListener f11346e;

    public /* synthetic */ l(SplashScreen splashScreen, C0370d dVar, SplashScreenSettings splashScreenSettings, boolean z3, SplashListener splashListener) {
        this.f11342a = splashScreen;
        this.f11343b = dVar;
        this.f11344c = splashScreenSettings;
        this.f11345d = z3;
        this.f11346e = splashListener;
    }

    public final void run() {
        this.f11342a.lambda$showDialog$5(this.f11343b, this.f11344c, this.f11345d, this.f11346e);
    }
}
