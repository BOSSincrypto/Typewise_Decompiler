package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.P;
import androidx.core.widget.f;
import n.j;
import o.C0836a;

/* renamed from: androidx.appcompat.widget.q  reason: case insensitive filesystem */
public class C0393q {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f3649a;

    /* renamed from: b  reason: collision with root package name */
    private a0 f3650b;

    /* renamed from: c  reason: collision with root package name */
    private a0 f3651c;

    /* renamed from: d  reason: collision with root package name */
    private a0 f3652d;

    /* renamed from: e  reason: collision with root package name */
    private int f3653e = 0;

    public C0393q(ImageView imageView) {
        this.f3649a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f3652d == null) {
            this.f3652d = new a0();
        }
        a0 a0Var = this.f3652d;
        a0Var.a();
        ColorStateList a4 = f.a(this.f3649a);
        if (a4 != null) {
            a0Var.f3508d = true;
            a0Var.f3505a = a4;
        }
        PorterDuff.Mode b4 = f.b(this.f3649a);
        if (b4 != null) {
            a0Var.f3507c = true;
            a0Var.f3506b = b4;
        }
        if (!a0Var.f3508d && !a0Var.f3507c) {
            return false;
        }
        C0387k.i(drawable, a0Var, this.f3649a.getDrawableState());
        return true;
    }

    private boolean l() {
        if (this.f3650b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f3649a.getDrawable() != null) {
            this.f3649a.getDrawable().setLevel(this.f3653e);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.f3649a.getDrawable();
        if (drawable != null) {
            K.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!l() || !a(drawable)) {
            a0 a0Var = this.f3651c;
            if (a0Var != null) {
                C0387k.i(drawable, a0Var, this.f3649a.getDrawableState());
                return;
            }
            a0 a0Var2 = this.f3650b;
            if (a0Var2 != null) {
                C0387k.i(drawable, a0Var2, this.f3649a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList d() {
        a0 a0Var = this.f3651c;
        if (a0Var != null) {
            return a0Var.f3505a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode e() {
        a0 a0Var = this.f3651c;
        if (a0Var != null) {
            return a0Var.f3506b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if (this.f3649a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i4) {
        int n4;
        Context context = this.f3649a.getContext();
        int[] iArr = j.f14899P;
        c0 v3 = c0.v(context, attributeSet, iArr, i4, 0);
        ImageView imageView = this.f3649a;
        P.m0(imageView, imageView.getContext(), iArr, attributeSet, v3.r(), i4, 0);
        try {
            Drawable drawable = this.f3649a.getDrawable();
            if (!(drawable != null || (n4 = v3.n(j.f14903Q, -1)) == -1 || (drawable = C0836a.b(this.f3649a.getContext(), n4)) == null)) {
                this.f3649a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                K.b(drawable);
            }
            int i5 = j.f14907R;
            if (v3.s(i5)) {
                f.c(this.f3649a, v3.c(i5));
            }
            int i6 = j.f14911S;
            if (v3.s(i6)) {
                f.d(this.f3649a, K.d(v3.k(i6, -1), (PorterDuff.Mode) null));
            }
            v3.w();
        } catch (Throwable th) {
            v3.w();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Drawable drawable) {
        this.f3653e = drawable.getLevel();
    }

    public void i(int i4) {
        if (i4 != 0) {
            Drawable b4 = C0836a.b(this.f3649a.getContext(), i4);
            if (b4 != null) {
                K.b(b4);
            }
            this.f3649a.setImageDrawable(b4);
        } else {
            this.f3649a.setImageDrawable((Drawable) null);
        }
        c();
    }

    /* access modifiers changed from: package-private */
    public void j(ColorStateList colorStateList) {
        if (this.f3651c == null) {
            this.f3651c = new a0();
        }
        a0 a0Var = this.f3651c;
        a0Var.f3505a = colorStateList;
        a0Var.f3508d = true;
        c();
    }

    /* access modifiers changed from: package-private */
    public void k(PorterDuff.Mode mode) {
        if (this.f3651c == null) {
            this.f3651c = new a0();
        }
        a0 a0Var = this.f3651c;
        a0Var.f3506b = mode;
        a0Var.f3507c = true;
        c();
    }
}
