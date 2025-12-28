package androidx.profileinstaller;

import android.content.Context;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f6135a;

    public /* synthetic */ k(Context context) {
        this.f6135a = context;
    }

    public final void run() {
        ProfileInstallerInitializer.l(this.f6135a);
    }
}
