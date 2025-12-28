package androidx.core.splashscreen;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.window.SplashScreenView;
import kotlin.c;
import kotlin.jvm.internal.o;
import l2.f;

public final class SplashScreenViewProvider {

    /* renamed from: a  reason: collision with root package name */
    private final ViewImpl f5074a;

    private static class ViewImpl {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f5075a;

        /* renamed from: b  reason: collision with root package name */
        private final f f5076b = c.b(new SplashScreenViewProvider$ViewImpl$_splashScreenView$2(this));

        public ViewImpl(Activity activity) {
            o.e(activity, "activity");
            this.f5075a = activity;
        }

        private final ViewGroup d() {
            return (ViewGroup) this.f5076b.getValue();
        }

        public void a() {
            ViewGroup viewGroup;
            View rootView = ((ViewGroup) this.f5075a.findViewById(16908290)).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.addView(d());
            }
        }

        public final Activity b() {
            return this.f5075a;
        }

        public ViewGroup c() {
            return d();
        }

        public void e() {
            ViewGroup viewGroup;
            ViewParent parent = c().getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(c());
            }
        }
    }

    private static final class a extends ViewImpl {

        /* renamed from: c  reason: collision with root package name */
        public SplashScreenView f5077c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            o.e(activity, "activity");
        }

        public void a() {
        }

        public void e() {
            f().remove();
            Resources.Theme theme = b().getTheme();
            o.d(theme, "activity.theme");
            View decorView = b().getWindow().getDecorView();
            o.d(decorView, "activity.window.decorView");
            x.c(theme, decorView, (TypedValue) null, 4, (Object) null);
        }

        public final SplashScreenView f() {
            SplashScreenView splashScreenView = this.f5077c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            o.p("platformView");
            return null;
        }

        /* renamed from: g */
        public SplashScreenView c() {
            return f();
        }

        public final void h(SplashScreenView splashScreenView) {
            o.e(splashScreenView, "<set-?>");
            this.f5077c = splashScreenView;
        }
    }

    public SplashScreenViewProvider(Activity activity) {
        ViewImpl viewImpl;
        o.e(activity, "ctx");
        if (Build.VERSION.SDK_INT >= 31) {
            viewImpl = new a(activity);
        } else {
            viewImpl = new ViewImpl(activity);
        }
        viewImpl.a();
        this.f5074a = viewImpl;
    }

    public final View a() {
        return this.f5074a.c();
    }

    public final void b() {
        this.f5074a.e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider(SplashScreenView splashScreenView, Activity activity) {
        this(activity);
        o.e(splashScreenView, "platformView");
        o.e(activity, "ctx");
        ((a) this.f5074a).h(splashScreenView);
    }
}
