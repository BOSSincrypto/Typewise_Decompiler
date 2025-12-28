package com.google.android.material.textfield;

import L1.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import z1.C0970a;
import z1.h;

/* renamed from: com.google.android.material.textfield.f  reason: case insensitive filesystem */
class C0579f extends t {

    /* renamed from: e  reason: collision with root package name */
    private final int f12337e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12338f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f12339g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f12340h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f12341i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f12342j = new C0574a(this);

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f12343k = new C0575b(this);

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f12344l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f12345m;

    /* renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            C0579f.this.f12404b.a0(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            C0579f.this.f12404b.a0(false);
        }
    }

    C0579f(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i4 = C0970a.motionDurationShort3;
        this.f12337e = d.f(context, i4, 100);
        this.f12338f = d.f(sVar.getContext(), i4, 150);
        this.f12339g = d.g(sVar.getContext(), C0970a.motionEasingLinearInterpolator, A1.a.f5a);
        this.f12340h = d.g(sVar.getContext(), C0970a.motionEasingEmphasizedInterpolator, A1.a.f8d);
    }

    private void A(boolean z3) {
        boolean z4;
        if (this.f12404b.F() == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && !this.f12344l.isRunning()) {
            this.f12345m.cancel();
            this.f12344l.start();
            if (z4) {
                this.f12344l.end();
            }
        } else if (!z3) {
            this.f12344l.cancel();
            this.f12345m.start();
            if (z4) {
                this.f12345m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f12339g);
        ofFloat.setDuration((long) this.f12337e);
        ofFloat.addUpdateListener(new C0576c(this));
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f12340h);
        ofFloat.setDuration((long) this.f12338f);
        ofFloat.addUpdateListener(new C0578e(this));
        return ofFloat;
    }

    private void D() {
        ValueAnimator C3 = C();
        ValueAnimator B3 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12344l = animatorSet;
        animatorSet.playTogether(new Animator[]{C3, B3});
        this.f12344l.addListener(new a());
        ValueAnimator B4 = B(1.0f, 0.0f);
        this.f12345m = B4;
        B4.addListener(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f12406d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f12406d.setScaleX(floatValue);
        this.f12406d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f12341i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z3) {
        A(J());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f12341i;
        if (editText == null || ((!editText.hasFocus() && !this.f12406d.hasFocus()) || this.f12341i.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
        if (this.f12404b.w() == null) {
            A(J());
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.clear_text_end_icon_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return z1.d.mtrl_ic_cancel;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f12343k;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f12342j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return this.f12343k;
    }

    public void n(EditText editText) {
        this.f12341i = editText;
        this.f12403a.setEndIconVisible(J());
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z3) {
        if (this.f12404b.w() != null) {
            A(z3);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f12341i;
        if (editText != null) {
            editText.post(new C0577d(this));
        }
    }
}
