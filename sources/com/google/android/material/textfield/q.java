package com.google.android.material.textfield;

import L1.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.C0406c;
import com.google.android.material.internal.CheckableImageButton;
import z1.C0970a;
import z1.h;

class q extends t {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f12357s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f12358e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12359f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f12360g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f12361h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f12362i = new m(this);

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f12363j = new n(this);

    /* renamed from: k  reason: collision with root package name */
    private final C0406c.b f12364k = new o(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f12365l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12366m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12367n;

    /* renamed from: o  reason: collision with root package name */
    private long f12368o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f12369p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f12370q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f12371r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f12371r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i4 = C0970a.motionDurationShort3;
        this.f12359f = d.f(context, i4, 67);
        this.f12358e = d.f(sVar.getContext(), i4, 50);
        this.f12360g = d.g(sVar.getContext(), C0970a.motionEasingLinearInterpolator, A1.a.f5a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i4, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f12360g);
        ofFloat.setDuration((long) i4);
        ofFloat.addUpdateListener(new j(this));
        return ofFloat;
    }

    private void F() {
        this.f12371r = E(this.f12359f, 0.0f, 1.0f);
        ValueAnimator E3 = E(this.f12358e, 1.0f, 0.0f);
        this.f12370q = E3;
        E3.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f12368o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f12361h.isPopupShowing();
        O(isPopupShowing);
        this.f12366m = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f12406d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z3) {
        this.f12365l = z3;
        r();
        if (!z3) {
            O(false);
            this.f12366m = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(boolean z3) {
        int i4;
        AutoCompleteTextView autoCompleteTextView = this.f12361h;
        if (autoCompleteTextView != null && !r.a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f12406d;
            if (z3) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            P.y0(checkableImageButton, i4);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f12366m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z3) {
        if (this.f12367n != z3) {
            this.f12367n = z3;
            this.f12371r.cancel();
            this.f12370q.start();
        }
    }

    private void P() {
        this.f12361h.setOnTouchListener(new k(this));
        if (f12357s) {
            this.f12361h.setOnDismissListener(new l(this));
        }
        this.f12361h.setThreshold(0);
    }

    private void Q() {
        if (this.f12361h != null) {
            if (G()) {
                this.f12366m = false;
            }
            if (!this.f12366m) {
                if (f12357s) {
                    O(!this.f12367n);
                } else {
                    this.f12367n = !this.f12367n;
                    r();
                }
                if (this.f12367n) {
                    this.f12361h.requestFocus();
                    this.f12361h.showDropDown();
                    return;
                }
                this.f12361h.dismissDropDown();
                return;
            }
            this.f12366m = false;
        }
    }

    private void R() {
        this.f12366m = true;
        this.f12368o = System.currentTimeMillis();
    }

    public void a(Editable editable) {
        if (this.f12369p.isTouchExplorationEnabled() && r.a(this.f12361h) && !this.f12406d.hasFocus()) {
            this.f12361h.dismissDropDown();
        }
        this.f12361h.post(new p(this));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.exposed_dropdown_menu_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if (f12357s) {
            return z1.d.mtrl_dropdown_arrow;
        }
        return z1.d.mtrl_ic_arrow_drop_down;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f12363j;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f12362i;
    }

    public C0406c.b h() {
        return this.f12364k;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i4) {
        return i4 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f12365l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f12367n;
    }

    public void n(EditText editText) {
        this.f12361h = D(editText);
        P();
        this.f12403a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f12369p.isTouchExplorationEnabled()) {
            P.y0(this.f12406d, 2);
        }
        this.f12403a.setEndIconVisible(true);
    }

    public void o(View view, A a4) {
        if (!r.a(this.f12361h)) {
            a4.j0(Spinner.class.getName());
        }
        if (a4.U()) {
            a4.t0((CharSequence) null);
        }
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
        boolean z3;
        if (this.f12369p.isEnabled() && !r.a(this.f12361h)) {
            if (accessibilityEvent.getEventType() != 32768 || !this.f12367n || this.f12361h.isPopupShowing()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z3) {
                Q();
                R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        F();
        this.f12369p = (AccessibilityManager) this.f12405c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f12361h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f12357s) {
                this.f12361h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
