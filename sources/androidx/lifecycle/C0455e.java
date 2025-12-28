package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
public abstract class C0455e implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        o.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        o.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        o.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o.e(activity, "activity");
        o.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        o.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        o.e(activity, "activity");
    }
}
