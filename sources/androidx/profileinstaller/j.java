package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f6133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f6134b;

    public /* synthetic */ j(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f6133a = profileInstallerInitializer;
        this.f6134b = context;
    }

    public final void run() {
        this.f6133a.i(this.f6134b);
    }
}
