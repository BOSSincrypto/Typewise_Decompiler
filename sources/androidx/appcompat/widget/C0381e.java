package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.P;
import n.j;

/* renamed from: androidx.appcompat.widget.e  reason: case insensitive filesystem */
class C0381e {

    /* renamed from: a  reason: collision with root package name */
    private final View f3548a;

    /* renamed from: b  reason: collision with root package name */
    private final C0387k f3549b;

    /* renamed from: c  reason: collision with root package name */
    private int f3550c = -1;

    /* renamed from: d  reason: collision with root package name */
    private a0 f3551d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f3552e;

    /* renamed from: f  reason: collision with root package name */
    private a0 f3553f;

    C0381e(View view) {
        this.f3548a = view;
        this.f3549b = C0387k.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f3553f == null) {
            this.f3553f = new a0();
        }
        a0 a0Var = this.f3553f;
        a0Var.a();
        ColorStateList s4 = P.s(this.f3548a);
        if (s4 != null) {
            a0Var.f3508d = true;
            a0Var.f3505a = s4;
        }
        PorterDuff.Mode t4 = P.t(this.f3548a);
        if (t4 != null) {
            a0Var.f3507c = true;
            a0Var.f3506b = t4;
        }
        if (!a0Var.f3508d && !a0Var.f3507c) {
            return false;
        }
        C0387k.i(drawable, a0Var, this.f3548a.getDrawableState());
        return true;
    }

    private boolean k() {
        if (this.f3551d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.f3548a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            a0 a0Var = this.f3552e;
            if (a0Var != null) {
                C0387k.i(background, a0Var, this.f3548a.getDrawableState());
                return;
            }
            a0 a0Var2 = this.f3551d;
            if (a0Var2 != null) {
                C0387k.i(background, a0Var2, this.f3548a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        a0 a0Var = this.f3552e;
        if (a0Var != null) {
            return a0Var.f3505a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        a0 a0Var = this.f3552e;
        if (a0Var != null) {
            return a0Var.f3506b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i4) {
        Context context = this.f3548a.getContext();
        int[] iArr = j.v3;
        c0 v3 = c0.v(context, attributeSet, iArr, i4, 0);
        View view = this.f3548a;
        P.m0(view, view.getContext(), iArr, attributeSet, v3.r(), i4, 0);
        try {
            int i5 = j.w3;
            if (v3.s(i5)) {
                this.f3550c = v3.n(i5, -1);
                ColorStateList f4 = this.f3549b.f(this.f3548a.getContext(), this.f3550c);
                if (f4 != null) {
                    h(f4);
                }
            }
            int i6 = j.x3;
            if (v3.s(i6)) {
                P.t0(this.f3548a, v3.c(i6));
            }
            int i7 = j.y3;
            if (v3.s(i7)) {
                P.u0(this.f3548a, K.d(v3.k(i7, -1), (PorterDuff.Mode) null));
            }
            v3.w();
        } catch (Throwable th) {
            v3.w();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.f3550c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i4) {
        ColorStateList colorStateList;
        this.f3550c = i4;
        C0387k kVar = this.f3549b;
        if (kVar != null) {
            colorStateList = kVar.f(this.f3548a.getContext(), i4);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3551d == null) {
                this.f3551d = new a0();
            }
            a0 a0Var = this.f3551d;
            a0Var.f3505a = colorStateList;
            a0Var.f3508d = true;
        } else {
            this.f3551d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f3552e == null) {
            this.f3552e = new a0();
        }
        a0 a0Var = this.f3552e;
        a0Var.f3505a = colorStateList;
        a0Var.f3508d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f3552e == null) {
            this.f3552e = new a0();
        }
        a0 a0Var = this.f3552e;
        a0Var.f3506b = mode;
        a0Var.f3507c = true;
        b();
    }
}
