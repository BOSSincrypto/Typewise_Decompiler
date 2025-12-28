package com.google.android.material.textfield;

import N1.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.c0;
import androidx.core.view.P;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m;
import z1.C0972c;
import z1.e;
import z1.g;
import z1.j;

class A extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f12236a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f12237b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f12238c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckableImageButton f12239d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f12240e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f12241f;

    /* renamed from: g  reason: collision with root package name */
    private int f12242g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView.ScaleType f12243h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnLongClickListener f12244i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12245j;

    A(TextInputLayout textInputLayout, c0 c0Var) {
        super(textInputLayout.getContext());
        this.f12236a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(g.design_text_input_start_icon, this, false);
        this.f12239d = checkableImageButton;
        u.e(checkableImageButton);
        D d4 = new D(getContext());
        this.f12237b = d4;
        j(c0Var);
        i(c0Var);
        addView(checkableImageButton);
        addView(d4);
    }

    private void C() {
        int i4;
        int i5 = 8;
        if (this.f12238c == null || this.f12245j) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        if (this.f12239d.getVisibility() == 0 || i4 == 0) {
            i5 = 0;
        }
        setVisibility(i5);
        this.f12237b.setVisibility(i4);
        this.f12236a.m0();
    }

    private void i(c0 c0Var) {
        this.f12237b.setVisibility(8);
        this.f12237b.setId(e.textinput_prefix_text);
        this.f12237b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        P.q0(this.f12237b, 1);
        o(c0Var.n(j.s6, 0));
        int i4 = j.t6;
        if (c0Var.s(i4)) {
            p(c0Var.c(i4));
        }
        n(c0Var.p(j.r6));
    }

    private void j(c0 c0Var) {
        if (c.g(getContext())) {
            r.c((ViewGroup.MarginLayoutParams) this.f12239d.getLayoutParams(), 0);
        }
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        int i4 = j.z6;
        if (c0Var.s(i4)) {
            this.f12240e = c.b(getContext(), c0Var, i4);
        }
        int i5 = j.A6;
        if (c0Var.s(i5)) {
            this.f12241f = m.i(c0Var.k(i5, -1), (PorterDuff.Mode) null);
        }
        int i6 = j.w6;
        if (c0Var.s(i6)) {
            s(c0Var.g(i6));
            int i7 = j.v6;
            if (c0Var.s(i7)) {
                r(c0Var.p(i7));
            }
            q(c0Var.a(j.u6, true));
        }
        t(c0Var.f(j.x6, getResources().getDimensionPixelSize(C0972c.mtrl_min_touch_target_size)));
        int i8 = j.y6;
        if (c0Var.s(i8)) {
            w(u.b(c0Var.k(i8, -1)));
        }
    }

    /* access modifiers changed from: package-private */
    public void A(androidx.core.view.accessibility.A a4) {
        if (this.f12237b.getVisibility() == 0) {
            a4.u0(this.f12237b);
            a4.G0(this.f12237b);
            return;
        }
        a4.G0(this.f12239d);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i4;
        EditText editText = this.f12236a.f12279d;
        if (editText != null) {
            if (k()) {
                i4 = 0;
            } else {
                i4 = P.G(editText);
            }
            P.D0(this.f12237b, i4, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C0972c.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f12238c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f12237b.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i4;
        if (k()) {
            i4 = this.f12239d.getMeasuredWidth() + r.a((ViewGroup.MarginLayoutParams) this.f12239d.getLayoutParams());
        } else {
            i4 = 0;
        }
        return P.G(this) + P.G(this.f12237b) + i4;
    }

    /* access modifiers changed from: package-private */
    public TextView d() {
        return this.f12237b;
    }

    /* access modifiers changed from: package-private */
    public CharSequence e() {
        return this.f12239d.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable f() {
        return this.f12239d.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f12242g;
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType h() {
        return this.f12243h;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        if (this.f12239d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z3) {
        this.f12245j = z3;
        C();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        u.d(this.f12236a, this.f12239d, this.f12240e);
    }

    /* access modifiers changed from: package-private */
    public void n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f12238c = charSequence2;
        this.f12237b.setText(charSequence);
        C();
    }

    /* access modifiers changed from: package-private */
    public void o(int i4) {
        androidx.core.widget.j.o(this.f12237b, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        B();
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        this.f12237b.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z3) {
        this.f12239d.setCheckable(z3);
    }

    /* access modifiers changed from: package-private */
    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f12239d.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Drawable drawable) {
        this.f12239d.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f12236a, this.f12239d, this.f12240e, this.f12241f);
            z(true);
            m();
            return;
        }
        z(false);
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        r((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void t(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i4 != this.f12242g) {
            this.f12242g = i4;
            u.g(this.f12239d, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View.OnClickListener onClickListener) {
        u.h(this.f12239d, onClickListener, this.f12244i);
    }

    /* access modifiers changed from: package-private */
    public void v(View.OnLongClickListener onLongClickListener) {
        this.f12244i = onLongClickListener;
        u.i(this.f12239d, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void w(ImageView.ScaleType scaleType) {
        this.f12243h = scaleType;
        u.j(this.f12239d, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f12240e != colorStateList) {
            this.f12240e = colorStateList;
            u.a(this.f12236a, this.f12239d, colorStateList, this.f12241f);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(PorterDuff.Mode mode) {
        if (this.f12241f != mode) {
            this.f12241f = mode;
            u.a(this.f12236a, this.f12239d, this.f12240e, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z3) {
        int i4;
        if (k() != z3) {
            CheckableImageButton checkableImageButton = this.f12239d;
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            B();
            C();
        }
    }
}
