package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.P;
import androidx.core.view.W;
import androidx.core.view.Y;
import n.C0822a;
import n.e;
import n.f;
import n.h;
import n.j;
import o.C0836a;

public class g0 implements J {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f3563a;

    /* renamed from: b  reason: collision with root package name */
    private int f3564b;

    /* renamed from: c  reason: collision with root package name */
    private View f3565c;

    /* renamed from: d  reason: collision with root package name */
    private View f3566d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f3567e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f3568f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f3569g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3570h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f3571i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f3572j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f3573k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f3574l;

    /* renamed from: m  reason: collision with root package name */
    boolean f3575m;

    /* renamed from: n  reason: collision with root package name */
    private C0379c f3576n;

    /* renamed from: o  reason: collision with root package name */
    private int f3577o;

    /* renamed from: p  reason: collision with root package name */
    private int f3578p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f3579q;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f3580a;

        a() {
            this.f3580a = new androidx.appcompat.view.menu.a(g0.this.f3563a.getContext(), 0, 16908332, 0, 0, g0.this.f3571i);
        }

        public void onClick(View view) {
            g0 g0Var = g0.this;
            Window.Callback callback = g0Var.f3574l;
            if (callback != null && g0Var.f3575m) {
                callback.onMenuItemSelected(0, this.f3580a);
            }
        }
    }

    class b extends Y {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3582a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3583b;

        b(int i4) {
            this.f3583b = i4;
        }

        public void a(View view) {
            this.f3582a = true;
        }

        public void b(View view) {
            if (!this.f3582a) {
                g0.this.f3563a.setVisibility(this.f3583b);
            }
        }

        public void c(View view) {
            g0.this.f3563a.setVisibility(0);
        }
    }

    public g0(Toolbar toolbar, boolean z3) {
        this(toolbar, z3, h.f14823a, e.f14748n);
    }

    private void G(CharSequence charSequence) {
        this.f3571i = charSequence;
        if ((this.f3564b & 8) != 0) {
            this.f3563a.setTitle(charSequence);
            if (this.f3570h) {
                P.r0(this.f3563a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f3564b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3573k)) {
            this.f3563a.setNavigationContentDescription(this.f3578p);
        } else {
            this.f3563a.setNavigationContentDescription(this.f3573k);
        }
    }

    private void I() {
        if ((this.f3564b & 4) != 0) {
            Toolbar toolbar = this.f3563a;
            Drawable drawable = this.f3569g;
            if (drawable == null) {
                drawable = this.f3579q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f3563a.setNavigationIcon((Drawable) null);
    }

    private void J() {
        Drawable drawable;
        int i4 = this.f3564b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) != 0) {
            drawable = this.f3568f;
            if (drawable == null) {
                drawable = this.f3567e;
            }
        } else {
            drawable = this.f3567e;
        }
        this.f3563a.setLogo(drawable);
    }

    private int x() {
        if (this.f3563a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3579q = this.f3563a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f3568f = drawable;
        J();
    }

    public void B(int i4) {
        String str;
        if (i4 == 0) {
            str = null;
        } else {
            str = getContext().getString(i4);
        }
        C(str);
    }

    public void C(CharSequence charSequence) {
        this.f3573k = charSequence;
        H();
    }

    public void D(Drawable drawable) {
        this.f3569g = drawable;
        I();
    }

    public void E(CharSequence charSequence) {
        this.f3572j = charSequence;
        if ((this.f3564b & 8) != 0) {
            this.f3563a.setSubtitle(charSequence);
        }
    }

    public void F(CharSequence charSequence) {
        this.f3570h = true;
        G(charSequence);
    }

    public void a(Menu menu, m.a aVar) {
        if (this.f3576n == null) {
            C0379c cVar = new C0379c(this.f3563a.getContext());
            this.f3576n = cVar;
            cVar.p(f.f14783g);
        }
        this.f3576n.k(aVar);
        this.f3563a.K((g) menu, this.f3576n);
    }

    public boolean b() {
        return this.f3563a.B();
    }

    public void c() {
        this.f3575m = true;
    }

    public void collapseActionView() {
        this.f3563a.e();
    }

    public boolean d() {
        return this.f3563a.A();
    }

    public boolean e() {
        return this.f3563a.w();
    }

    public boolean f() {
        return this.f3563a.Q();
    }

    public boolean g() {
        return this.f3563a.d();
    }

    public Context getContext() {
        return this.f3563a.getContext();
    }

    public CharSequence getTitle() {
        return this.f3563a.getTitle();
    }

    public void h() {
        this.f3563a.f();
    }

    public void i(m.a aVar, g.a aVar2) {
        this.f3563a.L(aVar, aVar2);
    }

    public void j(int i4) {
        this.f3563a.setVisibility(i4);
    }

    public void k(W w3) {
        Toolbar toolbar;
        View view = this.f3565c;
        if (view != null && view.getParent() == (toolbar = this.f3563a)) {
            toolbar.removeView(this.f3565c);
        }
        this.f3565c = w3;
    }

    public ViewGroup l() {
        return this.f3563a;
    }

    public void m(boolean z3) {
    }

    public boolean n() {
        return this.f3563a.v();
    }

    public void o(int i4) {
        View view;
        int i5 = this.f3564b ^ i4;
        this.f3564b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i5 & 3) != 0) {
                J();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f3563a.setTitle(this.f3571i);
                    this.f3563a.setSubtitle(this.f3572j);
                } else {
                    this.f3563a.setTitle((CharSequence) null);
                    this.f3563a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) != 0 && (view = this.f3566d) != null) {
                if ((i4 & 16) != 0) {
                    this.f3563a.addView(view);
                } else {
                    this.f3563a.removeView(view);
                }
            }
        }
    }

    public int p() {
        return this.f3564b;
    }

    public Menu q() {
        return this.f3563a.getMenu();
    }

    public void r(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        A(drawable);
    }

    public int s() {
        return this.f3577o;
    }

    public void setIcon(int i4) {
        setIcon(i4 != 0 ? C0836a.b(getContext(), i4) : null);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f3574l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f3570h) {
            G(charSequence);
        }
    }

    public W t(int i4, long j4) {
        float f4;
        W e4 = P.e(this.f3563a);
        if (i4 == 0) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        return e4.b(f4).f(j4).h(new b(i4));
    }

    public void u() {
    }

    public void v() {
    }

    public void w(boolean z3) {
        this.f3563a.setCollapsible(z3);
    }

    public void y(View view) {
        View view2 = this.f3566d;
        if (!(view2 == null || (this.f3564b & 16) == 0)) {
            this.f3563a.removeView(view2);
        }
        this.f3566d = view;
        if (view != null && (this.f3564b & 16) != 0) {
            this.f3563a.addView(view);
        }
    }

    public void z(int i4) {
        if (i4 != this.f3578p) {
            this.f3578p = i4;
            if (TextUtils.isEmpty(this.f3563a.getNavigationContentDescription())) {
                B(this.f3578p);
            }
        }
    }

    public g0(Toolbar toolbar, boolean z3, int i4, int i5) {
        Drawable drawable;
        this.f3577o = 0;
        this.f3578p = 0;
        this.f3563a = toolbar;
        this.f3571i = toolbar.getTitle();
        this.f3572j = toolbar.getSubtitle();
        this.f3570h = this.f3571i != null;
        this.f3569g = toolbar.getNavigationIcon();
        c0 v3 = c0.v(toolbar.getContext(), (AttributeSet) null, j.f14943a, C0822a.f14670c, 0);
        this.f3579q = v3.g(j.f14998l);
        if (z3) {
            CharSequence p4 = v3.p(j.f15028r);
            if (!TextUtils.isEmpty(p4)) {
                F(p4);
            }
            CharSequence p5 = v3.p(j.f15018p);
            if (!TextUtils.isEmpty(p5)) {
                E(p5);
            }
            Drawable g4 = v3.g(j.f15008n);
            if (g4 != null) {
                A(g4);
            }
            Drawable g5 = v3.g(j.f15003m);
            if (g5 != null) {
                setIcon(g5);
            }
            if (this.f3569g == null && (drawable = this.f3579q) != null) {
                D(drawable);
            }
            o(v3.k(j.f14978h, 0));
            int n4 = v3.n(j.f14973g, 0);
            if (n4 != 0) {
                y(LayoutInflater.from(this.f3563a.getContext()).inflate(n4, this.f3563a, false));
                o(this.f3564b | 16);
            }
            int m4 = v3.m(j.f14988j, 0);
            if (m4 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3563a.getLayoutParams();
                layoutParams.height = m4;
                this.f3563a.setLayoutParams(layoutParams);
            }
            int e4 = v3.e(j.f14968f, -1);
            int e5 = v3.e(j.f14963e, -1);
            if (e4 >= 0 || e5 >= 0) {
                this.f3563a.J(Math.max(e4, 0), Math.max(e5, 0));
            }
            int n5 = v3.n(j.f15033s, 0);
            if (n5 != 0) {
                Toolbar toolbar2 = this.f3563a;
                toolbar2.N(toolbar2.getContext(), n5);
            }
            int n6 = v3.n(j.f15023q, 0);
            if (n6 != 0) {
                Toolbar toolbar3 = this.f3563a;
                toolbar3.M(toolbar3.getContext(), n6);
            }
            int n7 = v3.n(j.f15013o, 0);
            if (n7 != 0) {
                this.f3563a.setPopupTheme(n7);
            }
        } else {
            this.f3564b = x();
        }
        v3.w();
        z(i4);
        this.f3573k = this.f3563a.getNavigationContentDescription();
        this.f3563a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f3567e = drawable;
        J();
    }
}
