package com.capacitorjs.plugins.splashscreen;

import android.animation.Animator;
import androidx.appcompat.app.C0370d;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0370d f11325b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SplashScreenSettings f11326c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Animator.AnimatorListener f11327d;

    public /* synthetic */ d(SplashScreen splashScreen, C0370d dVar, SplashScreenSettings splashScreenSettings, Animator.AnimatorListener animatorListener) {
        this.f11324a = splashScreen;
        this.f11325b = dVar;
        this.f11326c = splashScreenSettings;
        this.f11327d = animatorListener;
    }

    public final void run() {
        this.f11324a.lambda$show$8(this.f11325b, this.f11326c, this.f11327d);
    }
}
