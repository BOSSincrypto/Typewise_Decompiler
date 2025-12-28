package com.google.android.material.button;

import N1.c;
import O1.b;
import Q1.g;
import Q1.k;
import Q1.n;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.P;
import com.google.android.material.internal.m;
import z1.C0970a;
import z1.j;

class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f11728u = true;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f11729v = false;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f11730a;

    /* renamed from: b  reason: collision with root package name */
    private k f11731b;

    /* renamed from: c  reason: collision with root package name */
    private int f11732c;

    /* renamed from: d  reason: collision with root package name */
    private int f11733d;

    /* renamed from: e  reason: collision with root package name */
    private int f11734e;

    /* renamed from: f  reason: collision with root package name */
    private int f11735f;

    /* renamed from: g  reason: collision with root package name */
    private int f11736g;

    /* renamed from: h  reason: collision with root package name */
    private int f11737h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f11738i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f11739j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f11740k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f11741l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f11742m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11743n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11744o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11745p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11746q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11747r = true;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f11748s;

    /* renamed from: t  reason: collision with root package name */
    private int f11749t;

    a(MaterialButton materialButton, k kVar) {
        this.f11730a = materialButton;
        this.f11731b = kVar;
    }

    private void G(int i4, int i5) {
        int G3 = P.G(this.f11730a);
        int paddingTop = this.f11730a.getPaddingTop();
        int F3 = P.F(this.f11730a);
        int paddingBottom = this.f11730a.getPaddingBottom();
        int i6 = this.f11734e;
        int i7 = this.f11735f;
        this.f11735f = i5;
        this.f11734e = i4;
        if (!this.f11744o) {
            H();
        }
        P.D0(this.f11730a, G3, (paddingTop + i4) - i6, F3, (paddingBottom + i5) - i7);
    }

    private void H() {
        this.f11730a.setInternalBackground(a());
        g f4 = f();
        if (f4 != null) {
            f4.S((float) this.f11749t);
            f4.setState(this.f11730a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (!f11729v || this.f11744o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int G3 = P.G(this.f11730a);
        int paddingTop = this.f11730a.getPaddingTop();
        int F3 = P.F(this.f11730a);
        int paddingBottom = this.f11730a.getPaddingBottom();
        H();
        P.D0(this.f11730a, G3, paddingTop, F3, paddingBottom);
    }

    private void J() {
        int i4;
        g f4 = f();
        g n4 = n();
        if (f4 != null) {
            f4.Y((float) this.f11737h, this.f11740k);
            if (n4 != null) {
                float f5 = (float) this.f11737h;
                if (this.f11743n) {
                    i4 = F1.a.d(this.f11730a, C0970a.colorSurface);
                } else {
                    i4 = 0;
                }
                n4.X(f5, i4);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f11732c, this.f11734e, this.f11733d, this.f11735f);
    }

    private Drawable a() {
        int i4;
        g gVar = new g(this.f11731b);
        gVar.J(this.f11730a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f11739j);
        PorterDuff.Mode mode = this.f11738i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.Y((float) this.f11737h, this.f11740k);
        g gVar2 = new g(this.f11731b);
        gVar2.setTint(0);
        float f4 = (float) this.f11737h;
        if (this.f11743n) {
            i4 = F1.a.d(this.f11730a, C0970a.colorSurface);
        } else {
            i4 = 0;
        }
        gVar2.X(f4, i4);
        if (f11728u) {
            g gVar3 = new g(this.f11731b);
            this.f11742m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.a(this.f11741l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f11742m);
            this.f11748s = rippleDrawable;
            return rippleDrawable;
        }
        O1.a aVar = new O1.a(this.f11731b);
        this.f11742m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, b.a(this.f11741l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f11742m});
        this.f11748s = layerDrawable;
        return K(layerDrawable);
    }

    private g g(boolean z3) {
        LayerDrawable layerDrawable = this.f11748s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f11728u) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f11748s.getDrawable(0)).getDrawable()).getDrawable(z3 ^ true ? 1 : 0);
        }
        return (g) this.f11748s.getDrawable(z3 ^ true ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z3) {
        this.f11743n = z3;
        J();
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f11740k != colorStateList) {
            this.f11740k = colorStateList;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i4) {
        if (this.f11737h != i4) {
            this.f11737h = i4;
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f11739j != colorStateList) {
            this.f11739j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f11739j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f11738i != mode) {
            this.f11738i = mode;
            if (f() != null && this.f11738i != null) {
                androidx.core.graphics.drawable.a.p(f(), this.f11738i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z3) {
        this.f11747r = z3;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f11736g;
    }

    public int c() {
        return this.f11735f;
    }

    public int d() {
        return this.f11734e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f11748s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f11748s.getNumberOfLayers() > 2) {
            return (n) this.f11748s.getDrawable(2);
        }
        return (n) this.f11748s.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f11741l;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return this.f11731b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f11740k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f11737h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f11739j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f11738i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f11744o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f11746q;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f11747r;
    }

    /* access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f11732c = typedArray.getDimensionPixelOffset(j.f16621a2, 0);
        this.f11733d = typedArray.getDimensionPixelOffset(j.f16626b2, 0);
        this.f11734e = typedArray.getDimensionPixelOffset(j.f16631c2, 0);
        this.f11735f = typedArray.getDimensionPixelOffset(j.f16636d2, 0);
        int i4 = j.f16656h2;
        if (typedArray.hasValue(i4)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i4, -1);
            this.f11736g = dimensionPixelSize;
            z(this.f11731b.w((float) dimensionPixelSize));
            this.f11745p = true;
        }
        this.f11737h = typedArray.getDimensionPixelSize(j.f16706r2, 0);
        this.f11738i = m.i(typedArray.getInt(j.f16651g2, -1), PorterDuff.Mode.SRC_IN);
        this.f11739j = c.a(this.f11730a.getContext(), typedArray, j.f16646f2);
        this.f11740k = c.a(this.f11730a.getContext(), typedArray, j.f16701q2);
        this.f11741l = c.a(this.f11730a.getContext(), typedArray, j.f16696p2);
        this.f11746q = typedArray.getBoolean(j.f16641e2, false);
        this.f11749t = typedArray.getDimensionPixelSize(j.f16661i2, 0);
        this.f11747r = typedArray.getBoolean(j.f16711s2, true);
        int G3 = P.G(this.f11730a);
        int paddingTop = this.f11730a.getPaddingTop();
        int F3 = P.F(this.f11730a);
        int paddingBottom = this.f11730a.getPaddingBottom();
        if (typedArray.hasValue(j.f16616Z1)) {
            t();
        } else {
            H();
        }
        P.D0(this.f11730a, G3 + this.f11732c, paddingTop + this.f11734e, F3 + this.f11733d, paddingBottom + this.f11735f);
    }

    /* access modifiers changed from: package-private */
    public void s(int i4) {
        if (f() != null) {
            f().setTint(i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f11744o = true;
        this.f11730a.setSupportBackgroundTintList(this.f11739j);
        this.f11730a.setSupportBackgroundTintMode(this.f11738i);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z3) {
        this.f11746q = z3;
    }

    /* access modifiers changed from: package-private */
    public void v(int i4) {
        if (!this.f11745p || this.f11736g != i4) {
            this.f11736g = i4;
            this.f11745p = true;
            z(this.f11731b.w((float) i4));
        }
    }

    public void w(int i4) {
        G(this.f11734e, i4);
    }

    public void x(int i4) {
        G(i4, this.f11735f);
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f11741l != colorStateList) {
            this.f11741l = colorStateList;
            boolean z3 = f11728u;
            if (z3 && (this.f11730a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f11730a.getBackground()).setColor(b.a(colorStateList));
            } else if (!z3 && (this.f11730a.getBackground() instanceof O1.a)) {
                ((O1.a) this.f11730a.getBackground()).setTintList(b.a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f11731b = kVar;
        I(kVar);
    }
}
