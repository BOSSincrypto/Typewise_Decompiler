package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import com.getcapacitor.PluginMethod;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class v implements m {

    /* renamed from: i  reason: collision with root package name */
    public static final b f6076i = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final v f6077j = new v();

    /* renamed from: a  reason: collision with root package name */
    private int f6078a;

    /* renamed from: b  reason: collision with root package name */
    private int f6079b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6080c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6081d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f6082e;

    /* renamed from: f  reason: collision with root package name */
    private final n f6083f = new n(this);

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f6084g = new u(this);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final w.a f6085h = new d(this);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6086a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            o.e(activity, "activity");
            o.e(activityLifecycleCallbacks, PluginMethod.RETURN_CALLBACK);
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        public final m a() {
            return v.f6077j;
        }

        public final void b(Context context) {
            o.e(context, "context");
            v.f6077j.h(context);
        }

        private b() {
        }
    }

    public static final class c extends C0455e {
        final /* synthetic */ v this$0;

        public static final class a extends C0455e {
            final /* synthetic */ v this$0;

            a(v vVar) {
                this.this$0 = vVar;
            }

            public void onActivityPostResumed(Activity activity) {
                o.e(activity, "activity");
                this.this$0.e();
            }

            public void onActivityPostStarted(Activity activity) {
                o.e(activity, "activity");
                this.this$0.f();
            }
        }

        c(v vVar) {
            this.this$0 = vVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                w.f6088b.b(activity).f(this.this$0.f6085h);
            }
        }

        public void onActivityPaused(Activity activity) {
            o.e(activity, "activity");
            this.this$0.d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            o.e(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            o.e(activity, "activity");
            this.this$0.g();
        }
    }

    public static final class d implements w.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f6087a;

        d(v vVar) {
            this.f6087a = vVar;
        }

        public void a() {
            this.f6087a.f();
        }

        public void b() {
        }

        public void c() {
            this.f6087a.e();
        }
    }

    private v() {
    }

    /* access modifiers changed from: private */
    public static final void i(v vVar) {
        o.e(vVar, "this$0");
        vVar.j();
        vVar.k();
    }

    public final void d() {
        int i4 = this.f6079b - 1;
        this.f6079b = i4;
        if (i4 == 0) {
            Handler handler = this.f6082e;
            o.b(handler);
            handler.postDelayed(this.f6084g, 700);
        }
    }

    public final void e() {
        int i4 = this.f6079b + 1;
        this.f6079b = i4;
        if (i4 != 1) {
            return;
        }
        if (this.f6080c) {
            this.f6083f.h(Lifecycle.Event.ON_RESUME);
            this.f6080c = false;
            return;
        }
        Handler handler = this.f6082e;
        o.b(handler);
        handler.removeCallbacks(this.f6084g);
    }

    public final void f() {
        int i4 = this.f6078a + 1;
        this.f6078a = i4;
        if (i4 == 1 && this.f6081d) {
            this.f6083f.h(Lifecycle.Event.ON_START);
            this.f6081d = false;
        }
    }

    public final void g() {
        this.f6078a--;
        k();
    }

    public Lifecycle getLifecycle() {
        return this.f6083f;
    }

    public final void h(Context context) {
        o.e(context, "context");
        this.f6082e = new Handler();
        this.f6083f.h(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        o.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void j() {
        if (this.f6079b == 0) {
            this.f6080c = true;
            this.f6083f.h(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f6078a == 0 && this.f6080c) {
            this.f6083f.h(Lifecycle.Event.ON_STOP);
            this.f6081d = true;
        }
    }
}
