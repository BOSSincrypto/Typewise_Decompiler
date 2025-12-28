package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: androidx.lifecycle.j  reason: case insensitive filesystem */
public final class C0460j {

    /* renamed from: a  reason: collision with root package name */
    public static final C0460j f6057a = new C0460j();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f6058b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    public static final class a extends C0455e {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
            w.f6088b.c(activity);
        }
    }

    private C0460j() {
    }

    public static final void a(Context context) {
        o.e(context, "context");
        if (!f6058b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            o.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
