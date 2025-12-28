package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.W;
import androidx.core.view.P;
import androidx.core.view.X;
import androidx.core.view.Y;
import androidx.core.view.Z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import n.C0822a;
import n.f;
import n.j;

public class J extends C0367a implements ActionBarOverlayLayout.d {

    /* renamed from: D  reason: collision with root package name */
    private static final Interpolator f2564D = new AccelerateInterpolator();

    /* renamed from: E  reason: collision with root package name */
    private static final Interpolator f2565E = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    final X f2566A = new a();

    /* renamed from: B  reason: collision with root package name */
    final X f2567B = new b();

    /* renamed from: C  reason: collision with root package name */
    final Z f2568C = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f2569a;

    /* renamed from: b  reason: collision with root package name */
    private Context f2570b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f2571c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f2572d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f2573e;

    /* renamed from: f  reason: collision with root package name */
    androidx.appcompat.widget.J f2574f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f2575g;

    /* renamed from: h  reason: collision with root package name */
    View f2576h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList f2577i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private int f2578j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2579k;

    /* renamed from: l  reason: collision with root package name */
    d f2580l;

    /* renamed from: m  reason: collision with root package name */
    androidx.appcompat.view.b f2581m;

    /* renamed from: n  reason: collision with root package name */
    b.a f2582n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2583o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList f2584p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private boolean f2585q;

    /* renamed from: r  reason: collision with root package name */
    private int f2586r = 0;

    /* renamed from: s  reason: collision with root package name */
    boolean f2587s = true;

    /* renamed from: t  reason: collision with root package name */
    boolean f2588t;

    /* renamed from: u  reason: collision with root package name */
    boolean f2589u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f2590v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2591w = true;

    /* renamed from: x  reason: collision with root package name */
    h f2592x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f2593y;

    /* renamed from: z  reason: collision with root package name */
    boolean f2594z;

    class a extends Y {
        a() {
        }

        public void b(View view) {
            View view2;
            J j4 = J.this;
            if (j4.f2587s && (view2 = j4.f2576h) != null) {
                view2.setTranslationY(0.0f);
                J.this.f2573e.setTranslationY(0.0f);
            }
            J.this.f2573e.setVisibility(8);
            J.this.f2573e.setTransitioning(false);
            J j5 = J.this;
            j5.f2592x = null;
            j5.x();
            ActionBarOverlayLayout actionBarOverlayLayout = J.this.f2572d;
            if (actionBarOverlayLayout != null) {
                P.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends Y {
        b() {
        }

        public void b(View view) {
            J j4 = J.this;
            j4.f2592x = null;
            j4.f2573e.requestLayout();
        }
    }

    class c implements Z {
        c() {
        }

        public void a(View view) {
            ((View) J.this.f2573e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f2598c;

        /* renamed from: d  reason: collision with root package name */
        private final g f2599d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f2600e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference f2601f;

        public d(Context context, b.a aVar) {
            this.f2598c = context;
            this.f2600e = aVar;
            g S3 = new g(context).S(1);
            this.f2599d = S3;
            S3.R(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f2600e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.f2600e != null) {
                k();
                J.this.f2575g.l();
            }
        }

        public void c() {
            J j4 = J.this;
            if (j4.f2580l == this) {
                if (!J.w(j4.f2588t, j4.f2589u, false)) {
                    J j5 = J.this;
                    j5.f2581m = this;
                    j5.f2582n = this.f2600e;
                } else {
                    this.f2600e.b(this);
                }
                this.f2600e = null;
                J.this.v(false);
                J.this.f2575g.g();
                J j6 = J.this;
                j6.f2572d.setHideOnContentScrollEnabled(j6.f2594z);
                J.this.f2580l = null;
            }
        }

        public View d() {
            WeakReference weakReference = this.f2601f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f2599d;
        }

        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f2598c);
        }

        public CharSequence g() {
            return J.this.f2575g.getSubtitle();
        }

        public CharSequence i() {
            return J.this.f2575g.getTitle();
        }

        public void k() {
            if (J.this.f2580l == this) {
                this.f2599d.d0();
                try {
                    this.f2600e.a(this, this.f2599d);
                } finally {
                    this.f2599d.c0();
                }
            }
        }

        public boolean l() {
            return J.this.f2575g.j();
        }

        public void m(View view) {
            J.this.f2575g.setCustomView(view);
            this.f2601f = new WeakReference(view);
        }

        public void n(int i4) {
            o(J.this.f2569a.getResources().getString(i4));
        }

        public void o(CharSequence charSequence) {
            J.this.f2575g.setSubtitle(charSequence);
        }

        public void q(int i4) {
            r(J.this.f2569a.getResources().getString(i4));
        }

        public void r(CharSequence charSequence) {
            J.this.f2575g.setTitle(charSequence);
        }

        public void s(boolean z3) {
            super.s(z3);
            J.this.f2575g.setTitleOptional(z3);
        }

        public boolean t() {
            this.f2599d.d0();
            try {
                return this.f2600e.d(this, this.f2599d);
            } finally {
                this.f2599d.c0();
            }
        }
    }

    public J(Activity activity, boolean z3) {
        this.f2571c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (!z3) {
            this.f2576h = decorView.findViewById(16908290);
        }
    }

    private androidx.appcompat.widget.J A(View view) {
        String str;
        if (view instanceof androidx.appcompat.widget.J) {
            return (androidx.appcompat.widget.J) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f2590v) {
            this.f2590v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2572d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        boolean z3;
        boolean z4;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f14792p);
        this.f2572d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2574f = A(view.findViewById(f.f14777a));
        this.f2575g = (ActionBarContextView) view.findViewById(f.f14782f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f14779c);
        this.f2573e = actionBarContainer;
        androidx.appcompat.widget.J j4 = this.f2574f;
        if (j4 == null || this.f2575g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2569a = j4.getContext();
        if ((this.f2574f.p() & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f2579k = true;
        }
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(this.f2569a);
        if (b4.a() || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        J(z4);
        H(b4.e());
        TypedArray obtainStyledAttributes = this.f2569a.obtainStyledAttributes((AttributeSet) null, j.f14943a, C0822a.f14670c, 0);
        if (obtainStyledAttributes.getBoolean(j.f14993k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f14983i, 0);
        if (dimensionPixelSize != 0) {
            G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z3) {
        boolean z4;
        boolean z5;
        this.f2585q = z3;
        if (!z3) {
            this.f2574f.k((W) null);
            this.f2573e.setTabContainer((W) null);
        } else {
            this.f2573e.setTabContainer((W) null);
            this.f2574f.k((W) null);
        }
        boolean z6 = false;
        if (B() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        androidx.appcompat.widget.J j4 = this.f2574f;
        if (this.f2585q || !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        j4.w(z5);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2572d;
        if (!this.f2585q && z4) {
            z6 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z6);
    }

    private boolean K() {
        return P.S(this.f2573e);
    }

    private void L() {
        if (!this.f2590v) {
            this.f2590v = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2572d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    private void M(boolean z3) {
        if (w(this.f2588t, this.f2589u, this.f2590v)) {
            if (!this.f2591w) {
                this.f2591w = true;
                z(z3);
            }
        } else if (this.f2591w) {
            this.f2591w = false;
            y(z3);
        }
    }

    static boolean w(boolean z3, boolean z4, boolean z5) {
        if (z5) {
            return true;
        }
        return !z3 && !z4;
    }

    public int B() {
        return this.f2574f.s();
    }

    public void E(boolean z3) {
        int i4;
        if (z3) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        F(i4, 4);
    }

    public void F(int i4, int i5) {
        int p4 = this.f2574f.p();
        if ((i5 & 4) != 0) {
            this.f2579k = true;
        }
        this.f2574f.o((i4 & i5) | ((~i5) & p4));
    }

    public void G(float f4) {
        P.w0(this.f2573e, f4);
    }

    public void I(boolean z3) {
        if (!z3 || this.f2572d.w()) {
            this.f2594z = z3;
            this.f2572d.setHideOnContentScrollEnabled(z3);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void J(boolean z3) {
        this.f2574f.m(z3);
    }

    public void a() {
        if (this.f2589u) {
            this.f2589u = false;
            M(true);
        }
    }

    public void b() {
        h hVar = this.f2592x;
        if (hVar != null) {
            hVar.a();
            this.f2592x = null;
        }
    }

    public void c(int i4) {
        this.f2586r = i4;
    }

    public void d() {
    }

    public void e(boolean z3) {
        this.f2587s = z3;
    }

    public void f() {
        if (!this.f2589u) {
            this.f2589u = true;
            M(true);
        }
    }

    public boolean h() {
        androidx.appcompat.widget.J j4 = this.f2574f;
        if (j4 == null || !j4.n()) {
            return false;
        }
        this.f2574f.collapseActionView();
        return true;
    }

    public void i(boolean z3) {
        if (z3 != this.f2583o) {
            this.f2583o = z3;
            if (this.f2584p.size() > 0) {
                F.a(this.f2584p.get(0));
                throw null;
            }
        }
    }

    public int j() {
        return this.f2574f.p();
    }

    public Context k() {
        if (this.f2570b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2569a.getTheme().resolveAttribute(C0822a.f14672e, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f2570b = new ContextThemeWrapper(this.f2569a, i4);
            } else {
                this.f2570b = this.f2569a;
            }
        }
        return this.f2570b;
    }

    public void m(Configuration configuration) {
        H(androidx.appcompat.view.a.b(this.f2569a).e());
    }

    public boolean o(int i4, KeyEvent keyEvent) {
        Menu e4;
        int i5;
        d dVar = this.f2580l;
        if (dVar == null || (e4 = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i5 = keyEvent.getDeviceId();
        } else {
            i5 = -1;
        }
        boolean z3 = true;
        if (KeyCharacterMap.load(i5).getKeyboardType() == 1) {
            z3 = false;
        }
        e4.setQwertyMode(z3);
        return e4.performShortcut(i4, keyEvent, 0);
    }

    public void r(boolean z3) {
        if (!this.f2579k) {
            E(z3);
        }
    }

    public void s(boolean z3) {
        h hVar;
        this.f2593y = z3;
        if (!z3 && (hVar = this.f2592x) != null) {
            hVar.a();
        }
    }

    public void t(CharSequence charSequence) {
        this.f2574f.setWindowTitle(charSequence);
    }

    public androidx.appcompat.view.b u(b.a aVar) {
        d dVar = this.f2580l;
        if (dVar != null) {
            dVar.c();
        }
        this.f2572d.setHideOnContentScrollEnabled(false);
        this.f2575g.k();
        d dVar2 = new d(this.f2575g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f2580l = dVar2;
        dVar2.k();
        this.f2575g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z3) {
        androidx.core.view.W w3;
        androidx.core.view.W w4;
        if (z3) {
            L();
        } else {
            C();
        }
        if (K()) {
            if (z3) {
                w3 = this.f2574f.t(4, 100);
                w4 = this.f2575g.f(0, 200);
            } else {
                w4 = this.f2574f.t(0, 200);
                w3 = this.f2575g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(w3, w4);
            hVar.h();
        } else if (z3) {
            this.f2574f.j(4);
            this.f2575g.setVisibility(0);
        } else {
            this.f2574f.j(0);
            this.f2575g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        b.a aVar = this.f2582n;
        if (aVar != null) {
            aVar.b(this.f2581m);
            this.f2581m = null;
            this.f2582n = null;
        }
    }

    public void y(boolean z3) {
        View view;
        h hVar = this.f2592x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f2586r != 0 || (!this.f2593y && !z3)) {
            this.f2566A.b((View) null);
            return;
        }
        this.f2573e.setAlpha(1.0f);
        this.f2573e.setTransitioning(true);
        h hVar2 = new h();
        float f4 = (float) (-this.f2573e.getHeight());
        if (z3) {
            int[] iArr = {0, 0};
            this.f2573e.getLocationInWindow(iArr);
            f4 -= (float) iArr[1];
        }
        androidx.core.view.W m4 = P.e(this.f2573e).m(f4);
        m4.k(this.f2568C);
        hVar2.c(m4);
        if (this.f2587s && (view = this.f2576h) != null) {
            hVar2.c(P.e(view).m(f4));
        }
        hVar2.f(f2564D);
        hVar2.e(250);
        hVar2.g(this.f2566A);
        this.f2592x = hVar2;
        hVar2.h();
    }

    public void z(boolean z3) {
        View view;
        View view2;
        h hVar = this.f2592x;
        if (hVar != null) {
            hVar.a();
        }
        this.f2573e.setVisibility(0);
        if (this.f2586r != 0 || (!this.f2593y && !z3)) {
            this.f2573e.setAlpha(1.0f);
            this.f2573e.setTranslationY(0.0f);
            if (this.f2587s && (view = this.f2576h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2567B.b((View) null);
        } else {
            this.f2573e.setTranslationY(0.0f);
            float f4 = (float) (-this.f2573e.getHeight());
            if (z3) {
                int[] iArr = {0, 0};
                this.f2573e.getLocationInWindow(iArr);
                f4 -= (float) iArr[1];
            }
            this.f2573e.setTranslationY(f4);
            h hVar2 = new h();
            androidx.core.view.W m4 = P.e(this.f2573e).m(0.0f);
            m4.k(this.f2568C);
            hVar2.c(m4);
            if (this.f2587s && (view2 = this.f2576h) != null) {
                view2.setTranslationY(f4);
                hVar2.c(P.e(this.f2576h).m(0.0f));
            }
            hVar2.f(f2565E);
            hVar2.e(250);
            hVar2.g(this.f2567B);
            this.f2592x = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2572d;
        if (actionBarOverlayLayout != null) {
            P.l0(actionBarOverlayLayout);
        }
    }

    public J(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
