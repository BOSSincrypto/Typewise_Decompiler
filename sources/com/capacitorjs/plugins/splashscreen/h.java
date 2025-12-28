package com.capacitorjs.plugins.splashscreen;

import android.animation.Animator;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SplashScreen f11331a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11332b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Animator.AnimatorListener f11333c;

    public /* synthetic */ h(SplashScreen splashScreen, int i4, Animator.AnimatorListener animatorListener) {
        this.f11331a = splashScreen;
        this.f11332b = i4;
        this.f11333c = animatorListener;
    }

    public final void run() {
        this.f11331a.lambda$hide$9(this.f11332b, this.f11333c);
    }
}
