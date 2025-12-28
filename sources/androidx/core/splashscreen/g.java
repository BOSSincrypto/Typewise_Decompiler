package androidx.core.splashscreen;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5090b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f5091a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final g a(Activity activity) {
            o.e(activity, "<this>");
            g gVar = new g(activity, (i) null);
            gVar.b();
            return gVar;
        }

        private a() {
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f5092a;

        /* renamed from: b  reason: collision with root package name */
        private int f5093b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f5094c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f5095d;

        /* renamed from: e  reason: collision with root package name */
        private Drawable f5096e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5097f;

        /* renamed from: g  reason: collision with root package name */
        private d f5098g = new h();

        /* renamed from: h  reason: collision with root package name */
        private e f5099h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public SplashScreenViewProvider f5100i;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f5101a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f5102b;

            a(b bVar, View view) {
                this.f5101a = bVar;
                this.f5102b = view;
            }

            public boolean onPreDraw() {
                if (this.f5101a.i().a()) {
                    return false;
                }
                this.f5102b.getViewTreeObserver().removeOnPreDrawListener(this);
                SplashScreenViewProvider c4 = this.f5101a.f5100i;
                if (c4 == null) {
                    return true;
                }
                this.f5101a.e(c4);
                return true;
            }
        }

        /* renamed from: androidx.core.splashscreen.g$b$b  reason: collision with other inner class name */
        public static final class C0077b implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f5103a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SplashScreenViewProvider f5104b;

            C0077b(b bVar, SplashScreenViewProvider splashScreenViewProvider) {
                this.f5103a = bVar;
                this.f5104b = splashScreenViewProvider;
            }

            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                o.e(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!this.f5103a.i().a()) {
                        this.f5103a.e(this.f5104b);
                    } else {
                        this.f5103a.f5100i = this.f5104b;
                    }
                }
            }
        }

        public b(Activity activity) {
            o.e(activity, "activity");
            this.f5092a = activity;
        }

        /* access modifiers changed from: private */
        public static final void f(SplashScreenViewProvider splashScreenViewProvider, e eVar) {
            o.e(splashScreenViewProvider, "$splashScreenViewProvider");
            o.e(eVar, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            eVar.a(splashScreenViewProvider);
        }

        private final void g(View view, Drawable drawable) {
            float f4;
            ImageView imageView = (ImageView) view.findViewById(e.f5088a);
            if (this.f5097f) {
                Drawable drawable2 = imageView.getContext().getDrawable(d.f5087a);
                f4 = imageView.getResources().getDimension(c.f5086b) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new a(drawable2, f4));
                }
            } else {
                f4 = imageView.getResources().getDimension(c.f5085a) * 0.6666667f;
            }
            imageView.setImageDrawable(new a(drawable, f4));
        }

        /* access modifiers changed from: private */
        public static final boolean o() {
            return false;
        }

        public final void e(SplashScreenViewProvider splashScreenViewProvider) {
            o.e(splashScreenViewProvider, "splashScreenViewProvider");
            e eVar = this.f5099h;
            if (eVar != null) {
                this.f5099h = null;
                splashScreenViewProvider.a().postOnAnimation(new i(splashScreenViewProvider, eVar));
            }
        }

        public final Activity h() {
            return this.f5092a;
        }

        public final d i() {
            return this.f5098g;
        }

        public void j() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f5092a.getTheme();
            boolean z3 = true;
            if (theme.resolveAttribute(b.f5084d, typedValue, true)) {
                this.f5094c = Integer.valueOf(typedValue.resourceId);
                this.f5095d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(b.f5083c, typedValue, true)) {
                this.f5096e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(b.f5082b, typedValue, true)) {
                if (typedValue.resourceId != c.f5086b) {
                    z3 = false;
                }
                this.f5097f = z3;
            }
            o.d(theme, "currentTheme");
            m(theme, typedValue);
        }

        public void k(d dVar) {
            o.e(dVar, "keepOnScreenCondition");
            this.f5098g = dVar;
            View findViewById = this.f5092a.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new a(this, findViewById));
        }

        public void l(e eVar) {
            o.e(eVar, "exitAnimationListener");
            this.f5099h = eVar;
            SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.f5092a);
            Integer num = this.f5094c;
            Integer num2 = this.f5095d;
            View a4 = splashScreenViewProvider.a();
            if (num != null && num.intValue() != 0) {
                a4.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                a4.setBackgroundColor(num2.intValue());
            } else {
                a4.setBackground(this.f5092a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f5096e;
            if (drawable != null) {
                g(a4, drawable);
            }
            a4.addOnLayoutChangeListener(new C0077b(this, splashScreenViewProvider));
        }

        /* access modifiers changed from: protected */
        public final void m(Resources.Theme theme, TypedValue typedValue) {
            o.e(theme, "currentTheme");
            o.e(typedValue, "typedValue");
            if (theme.resolveAttribute(b.f5081a, typedValue, true)) {
                int i4 = typedValue.resourceId;
                this.f5093b = i4;
                if (i4 != 0) {
                    this.f5092a.setTheme(i4);
                }
            }
        }

        public final void n(d dVar) {
            o.e(dVar, "<set-?>");
            this.f5098g = dVar;
        }
    }

    private static final class c extends b {

        /* renamed from: j  reason: collision with root package name */
        private ViewTreeObserver.OnPreDrawListener f5105j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f5106k = true;

        /* renamed from: l  reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f5107l;

        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f5108a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f5109b;

            a(c cVar, Activity activity) {
                this.f5108a = cVar;
                this.f5109b = activity;
            }

            public void onChildViewAdded(View view, View view2) {
                if (s.a(view2)) {
                    c cVar = this.f5108a;
                    cVar.s(cVar.r(t.a(view2)));
                    ((ViewGroup) this.f5109b.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                }
            }

            public void onChildViewRemoved(View view, View view2) {
            }
        }

        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f5110a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f5111b;

            b(c cVar, View view) {
                this.f5110a = cVar;
                this.f5111b = view;
            }

            public boolean onPreDraw() {
                if (this.f5110a.i().a()) {
                    return false;
                }
                this.f5111b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            o.e(activity, "activity");
            this.f5107l = new a(this, activity);
        }

        private final void q() {
            boolean z3;
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = h().getTheme();
            Window window = h().getWindow();
            boolean z4 = true;
            if (theme.resolveAttribute(16843857, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843858, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843856, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            if (theme.resolveAttribute(16844293, typedValue, true)) {
                if (typedValue.data != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                window.setNavigationBarContrastEnforced(z3);
            }
            if (theme.resolveAttribute(16844292, typedValue, true)) {
                if (typedValue.data == 0) {
                    z4 = false;
                }
                window.setStatusBarContrastEnforced(z4);
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            o.d(theme, "theme");
            x.b(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
            window.setDecorFitsSystemWindows(this.f5106k);
        }

        /* access modifiers changed from: private */
        public static final void t(c cVar, e eVar, SplashScreenView splashScreenView) {
            o.e(cVar, "this$0");
            o.e(eVar, "$exitAnimationListener");
            o.e(splashScreenView, "splashScreenView");
            cVar.q();
            eVar.a(new SplashScreenViewProvider(splashScreenView, cVar.h()));
        }

        public void j() {
            Resources.Theme theme = h().getTheme();
            o.d(theme, "activity.theme");
            m(theme, new TypedValue());
            ((ViewGroup) h().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f5107l);
        }

        public void k(d dVar) {
            o.e(dVar, "keepOnScreenCondition");
            n(dVar);
            View findViewById = h().findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.f5105j != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f5105j);
            }
            b bVar = new b(this, findViewById);
            this.f5105j = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public void l(e eVar) {
            o.e(eVar, "exitAnimationListener");
            h().getSplashScreen().setOnExitAnimationListener(new r(this, eVar));
        }

        public final boolean r(SplashScreenView splashScreenView) {
            o.e(splashScreenView, "child");
            WindowInsets a4 = j.a().build();
            o.d(a4, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (a4 != splashScreenView.getRootView().computeSystemWindowInsets(a4, rect) || !rect.isEmpty()) {
                return true;
            }
            return false;
        }

        public final void s(boolean z3) {
            this.f5106k = z3;
        }
    }

    public interface d {
        boolean a();
    }

    public interface e {
        void a(SplashScreenViewProvider splashScreenViewProvider);
    }

    public /* synthetic */ g(Activity activity, i iVar) {
        this(activity);
    }

    /* access modifiers changed from: private */
    public final void b() {
        this.f5091a.j();
    }

    public static final g c(Activity activity) {
        return f5090b.a(activity);
    }

    public final void d(d dVar) {
        o.e(dVar, "condition");
        this.f5091a.k(dVar);
    }

    public final void e(e eVar) {
        o.e(eVar, "listener");
        this.f5091a.l(eVar);
    }

    private g(Activity activity) {
        b bVar;
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new c(activity);
        } else {
            bVar = new b(activity);
        }
        this.f5091a = bVar;
    }
}
