package com.capacitorjs.plugins.splashscreen;

import androidx.appcompat.app.C0370d;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0370d f11339b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f11340c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ SplashListener f11341d;

    public /* synthetic */ k(SplashScreen splashScreen, C0370d dVar, boolean z3, SplashListener splashListener) {
        this.f11338a = splashScreen;
        this.f11339b = dVar;
        this.f11340c = z3;
        this.f11341d = splashListener;
    }

    public final void run() {
        this.f11338a.lambda$showDialog$4(this.f11339b, this.f11340c, this.f11341d);
    }
}
