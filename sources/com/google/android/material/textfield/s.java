package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.F;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.c0;
import androidx.core.view.P;
import androidx.core.view.accessibility.C0406c;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0836a;
import z1.C0972c;
import z1.e;
import z1.g;
import z1.h;
import z1.j;

class s extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f12373a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f12374b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckableImageButton f12375c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f12376d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f12377e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnLongClickListener f12378f;

    /* renamed from: g  reason: collision with root package name */
    private final CheckableImageButton f12379g;

    /* renamed from: h  reason: collision with root package name */
    private final d f12380h;

    /* renamed from: i  reason: collision with root package name */
    private int f12381i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashSet f12382j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f12383k;

    /* renamed from: l  reason: collision with root package name */
    private PorterDuff.Mode f12384l;

    /* renamed from: m  reason: collision with root package name */
    private int f12385m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView.ScaleType f12386n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnLongClickListener f12387o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f12388p;

    /* renamed from: q  reason: collision with root package name */
    private final TextView f12389q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f12390r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public EditText f12391s;

    /* renamed from: t  reason: collision with root package name */
    private final AccessibilityManager f12392t;

    /* renamed from: u  reason: collision with root package name */
    private C0406c.b f12393u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final TextWatcher f12394v = new a();

    /* renamed from: w  reason: collision with root package name */
    private final TextInputLayout.g f12395w;

    class a extends i {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            s.this.m().b(charSequence, i4, i5, i6);
        }
    }

    class b implements TextInputLayout.g {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            if (s.this.f12391s != textInputLayout.getEditText()) {
                if (s.this.f12391s != null) {
                    s.this.f12391s.removeTextChangedListener(s.this.f12394v);
                    if (s.this.f12391s.getOnFocusChangeListener() == s.this.m().e()) {
                        s.this.f12391s.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = s.this.f12391s = textInputLayout.getEditText();
                if (s.this.f12391s != null) {
                    s.this.f12391s.addTextChangedListener(s.this.f12394v);
                }
                s.this.m().n(s.this.f12391s);
                s sVar = s.this;
                sVar.h0(sVar.m());
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f12399a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        private final s f12400b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f12401c;

        /* renamed from: d  reason: collision with root package name */
        private final int f12402d;

        d(s sVar, c0 c0Var) {
            this.f12400b = sVar;
            this.f12401c = c0Var.n(j.M5, 0);
            this.f12402d = c0Var.n(j.k6, 0);
        }

        private t b(int i4) {
            if (i4 == -1) {
                return new C0580g(this.f12400b);
            }
            if (i4 == 0) {
                return new x(this.f12400b);
            }
            if (i4 == 1) {
                return new z(this.f12400b, this.f12402d);
            }
            if (i4 == 2) {
                return new C0579f(this.f12400b);
            }
            if (i4 == 3) {
                return new q(this.f12400b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i4);
        }

        /* access modifiers changed from: package-private */
        public t c(int i4) {
            t tVar = (t) this.f12399a.get(i4);
            if (tVar != null) {
                return tVar;
            }
            t b4 = b(i4);
            this.f12399a.append(i4, b4);
            return b4;
        }
    }

    s(TextInputLayout textInputLayout, c0 c0Var) {
        super(textInputLayout.getContext());
        b bVar = new b();
        this.f12395w = bVar;
        this.f12392t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f12373a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12374b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i4 = i(this, from, e.text_input_error_icon);
        this.f12375c = i4;
        CheckableImageButton i5 = i(frameLayout, from, e.text_input_end_icon);
        this.f12379g = i5;
        this.f12380h = new d(this, c0Var);
        D d4 = new D(getContext());
        this.f12389q = d4;
        C(c0Var);
        B(c0Var);
        D(c0Var);
        frameLayout.addView(i5);
        addView(d4);
        addView(frameLayout);
        addView(i4);
        textInputLayout.h(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(c0 c0Var) {
        int i4 = j.l6;
        if (!c0Var.s(i4)) {
            int i5 = j.Q5;
            if (c0Var.s(i5)) {
                this.f12383k = N1.c.b(getContext(), c0Var, i5);
            }
            int i6 = j.R5;
            if (c0Var.s(i6)) {
                this.f12384l = m.i(c0Var.k(i6, -1), (PorterDuff.Mode) null);
            }
        }
        int i7 = j.O5;
        if (c0Var.s(i7)) {
            U(c0Var.k(i7, 0));
            int i8 = j.L5;
            if (c0Var.s(i8)) {
                Q(c0Var.p(i8));
            }
            O(c0Var.a(j.K5, true));
        } else if (c0Var.s(i4)) {
            int i9 = j.m6;
            if (c0Var.s(i9)) {
                this.f12383k = N1.c.b(getContext(), c0Var, i9);
            }
            int i10 = j.n6;
            if (c0Var.s(i10)) {
                this.f12384l = m.i(c0Var.k(i10, -1), (PorterDuff.Mode) null);
            }
            U(c0Var.a(i4, false) ? 1 : 0);
            Q(c0Var.p(j.j6));
        }
        T(c0Var.f(j.N5, getResources().getDimensionPixelSize(C0972c.mtrl_min_touch_target_size)));
        int i11 = j.P5;
        if (c0Var.s(i11)) {
            X(u.b(c0Var.k(i11, -1)));
        }
    }

    private void C(c0 c0Var) {
        int i4 = j.W5;
        if (c0Var.s(i4)) {
            this.f12376d = N1.c.b(getContext(), c0Var, i4);
        }
        int i5 = j.X5;
        if (c0Var.s(i5)) {
            this.f12377e = m.i(c0Var.k(i5, -1), (PorterDuff.Mode) null);
        }
        int i6 = j.V5;
        if (c0Var.s(i6)) {
            c0(c0Var.g(i6));
        }
        this.f12375c.setContentDescription(getResources().getText(h.error_icon_content_description));
        P.y0(this.f12375c, 2);
        this.f12375c.setClickable(false);
        this.f12375c.setPressable(false);
        this.f12375c.setFocusable(false);
    }

    private void D(c0 c0Var) {
        this.f12389q.setVisibility(8);
        this.f12389q.setId(e.textinput_suffix_text);
        this.f12389q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        P.q0(this.f12389q, 1);
        q0(c0Var.n(j.C6, 0));
        int i4 = j.D6;
        if (c0Var.s(i4)) {
            r0(c0Var.c(i4));
        }
        p0(c0Var.p(j.B6));
    }

    /* access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        C0406c.b bVar = this.f12393u;
        if (bVar != null && (accessibilityManager = this.f12392t) != null) {
            C0406c.b(accessibilityManager, bVar);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f12393u != null && this.f12392t != null && P.R(this)) {
            C0406c.a(this.f12392t, this.f12393u);
        }
    }

    /* access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f12391s != null) {
            if (tVar.e() != null) {
                this.f12391s.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f12379g.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(g.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        u.e(checkableImageButton);
        if (N1.c.g(getContext())) {
            r.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i4) {
        Iterator it = this.f12382j.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f12393u = tVar.h();
        g();
    }

    private int t(t tVar) {
        int a4 = this.f12380h.f12401c;
        if (a4 == 0) {
            return tVar.d();
        }
        return a4;
    }

    private void t0(t tVar) {
        M();
        this.f12393u = null;
        tVar.u();
    }

    private void u0(boolean z3) {
        if (!z3 || n() == null) {
            u.a(this.f12373a, this.f12379g, this.f12383k, this.f12384l);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f12373a.getErrorCurrentTextColors());
        this.f12379g.setImageDrawable(mutate);
    }

    private void v0() {
        int i4;
        boolean z3;
        FrameLayout frameLayout = this.f12374b;
        int i5 = 8;
        if (this.f12379g.getVisibility() != 0 || G()) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        frameLayout.setVisibility(i4);
        if (this.f12388p == null || this.f12390r) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (F() || G() || !z3) {
            i5 = 0;
        }
        setVisibility(i5);
    }

    private void w0() {
        boolean z3;
        int i4 = 0;
        if (s() == null || !this.f12373a.M() || !this.f12373a.b0()) {
            z3 = false;
        } else {
            z3 = true;
        }
        CheckableImageButton checkableImageButton = this.f12375c;
        if (!z3) {
            i4 = 8;
        }
        checkableImageButton.setVisibility(i4);
        v0();
        x0();
        if (!A()) {
            this.f12373a.m0();
        }
    }

    private void y0() {
        int i4;
        int visibility = this.f12389q.getVisibility();
        boolean z3 = false;
        if (this.f12388p == null || this.f12390r) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        if (visibility != i4) {
            t m4 = m();
            if (i4 == 0) {
                z3 = true;
            }
            m4.q(z3);
        }
        v0();
        this.f12389q.setVisibility(i4);
        this.f12373a.m0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        if (this.f12381i != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        if (!A() || !this.f12379g.isChecked()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        if (this.f12374b.getVisibility() == 0 && this.f12379g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        if (this.f12375c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z3) {
        this.f12390r = z3;
        y0();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f12373a.b0());
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        u.d(this.f12373a, this.f12379g, this.f12383k);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        u.d(this.f12373a, this.f12375c, this.f12376d);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean isChecked;
        t m4 = m();
        boolean z5 = true;
        if (!m4.l() || (isChecked = this.f12379g.isChecked()) == m4.m()) {
            z4 = false;
        } else {
            this.f12379g.setChecked(!isChecked);
            z4 = true;
        }
        if (!m4.j() || (isActivated = this.f12379g.isActivated()) == m4.k()) {
            z5 = z4;
        } else {
            N(!isActivated);
        }
        if (z3 || z5) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z3) {
        this.f12379g.setActivated(z3);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z3) {
        this.f12379g.setCheckable(z3);
    }

    /* access modifiers changed from: package-private */
    public void P(int i4) {
        CharSequence charSequence;
        if (i4 != 0) {
            charSequence = getResources().getText(i4);
        } else {
            charSequence = null;
        }
        Q(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f12379g.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        S(drawable);
    }

    /* access modifiers changed from: package-private */
    public void S(Drawable drawable) {
        this.f12379g.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f12373a, this.f12379g, this.f12383k, this.f12384l);
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i4 != this.f12385m) {
            this.f12385m = i4;
            u.g(this.f12379g, i4);
            u.g(this.f12375c, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i4) {
        boolean z3;
        if (this.f12381i != i4) {
            t0(m());
            int i5 = this.f12381i;
            this.f12381i = i4;
            j(i5);
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            a0(z3);
            t m4 = m();
            R(t(m4));
            P(m4.c());
            O(m4.l());
            if (m4.i(this.f12373a.getBoxBackgroundMode())) {
                s0(m4);
                V(m4.f());
                EditText editText = this.f12391s;
                if (editText != null) {
                    m4.n(editText);
                    h0(m4);
                }
                u.a(this.f12373a, this.f12379g, this.f12383k, this.f12384l);
                L(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f12373a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(View.OnClickListener onClickListener) {
        u.h(this.f12379g, onClickListener, this.f12387o);
    }

    /* access modifiers changed from: package-private */
    public void W(View.OnLongClickListener onLongClickListener) {
        this.f12387o = onLongClickListener;
        u.i(this.f12379g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void X(ImageView.ScaleType scaleType) {
        this.f12386n = scaleType;
        u.j(this.f12379g, scaleType);
        u.j(this.f12375c, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        if (this.f12383k != colorStateList) {
            this.f12383k = colorStateList;
            u.a(this.f12373a, this.f12379g, colorStateList, this.f12384l);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(PorterDuff.Mode mode) {
        if (this.f12384l != mode) {
            this.f12384l = mode;
            u.a(this.f12373a, this.f12379g, this.f12383k, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(boolean z3) {
        int i4;
        if (F() != z3) {
            CheckableImageButton checkableImageButton = this.f12379g;
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            v0();
            x0();
            this.f12373a.m0();
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        c0(drawable);
        K();
    }

    /* access modifiers changed from: package-private */
    public void c0(Drawable drawable) {
        this.f12375c.setImageDrawable(drawable);
        w0();
        u.a(this.f12373a, this.f12375c, this.f12376d, this.f12377e);
    }

    /* access modifiers changed from: package-private */
    public void d0(View.OnClickListener onClickListener) {
        u.h(this.f12375c, onClickListener, this.f12378f);
    }

    /* access modifiers changed from: package-private */
    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f12378f = onLongClickListener;
        u.i(this.f12375c, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void f0(ColorStateList colorStateList) {
        if (this.f12376d != colorStateList) {
            this.f12376d = colorStateList;
            u.a(this.f12373a, this.f12375c, colorStateList, this.f12377e);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(PorterDuff.Mode mode) {
        if (this.f12377e != mode) {
            this.f12377e = mode;
            u.a(this.f12373a, this.f12375c, this.f12376d, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f12379g.performClick();
        this.f12379g.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i4) {
        CharSequence charSequence;
        if (i4 != 0) {
            charSequence = getResources().getText(i4);
        } else {
            charSequence = null;
        }
        j0(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void j0(CharSequence charSequence) {
        this.f12379g.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (G()) {
            return this.f12375c;
        }
        if (!A() || !F()) {
            return null;
        }
        return this.f12379g;
    }

    /* access modifiers changed from: package-private */
    public void k0(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        l0(drawable);
    }

    /* access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f12379g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public void l0(Drawable drawable) {
        this.f12379g.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public t m() {
        return this.f12380h.c(this.f12381i);
    }

    /* access modifiers changed from: package-private */
    public void m0(boolean z3) {
        if (z3 && this.f12381i != 1) {
            U(1);
        } else if (!z3) {
            U(0);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.f12379g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public void n0(ColorStateList colorStateList) {
        this.f12383k = colorStateList;
        u.a(this.f12373a, this.f12379g, colorStateList, this.f12384l);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f12385m;
    }

    /* access modifiers changed from: package-private */
    public void o0(PorterDuff.Mode mode) {
        this.f12384l = mode;
        u.a(this.f12373a, this.f12379g, this.f12383k, mode);
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f12381i;
    }

    /* access modifiers changed from: package-private */
    public void p0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f12388p = charSequence2;
        this.f12389q.setText(charSequence);
        y0();
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f12386n;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i4) {
        androidx.core.widget.j.o(this.f12389q, i4);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f12379g;
    }

    /* access modifiers changed from: package-private */
    public void r0(ColorStateList colorStateList) {
        this.f12389q.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public Drawable s() {
        return this.f12375c.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f12379g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable v() {
        return this.f12379g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f12388p;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f12389q.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        int i4;
        if (this.f12373a.f12279d != null) {
            if (F() || G()) {
                i4 = 0;
            } else {
                i4 = P.F(this.f12373a.f12279d);
            }
            P.D0(this.f12389q, getContext().getResources().getDimensionPixelSize(C0972c.material_input_text_to_prefix_suffix_padding), this.f12373a.f12279d.getPaddingTop(), i4, this.f12373a.f12279d.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public int y() {
        int i4;
        if (F() || G()) {
            i4 = this.f12379g.getMeasuredWidth() + r.b((ViewGroup.MarginLayoutParams) this.f12379g.getLayoutParams());
        } else {
            i4 = 0;
        }
        return P.F(this) + P.F(this.f12389q) + i4;
    }

    /* access modifiers changed from: package-private */
    public TextView z() {
        return this.f12389q;
    }
}
