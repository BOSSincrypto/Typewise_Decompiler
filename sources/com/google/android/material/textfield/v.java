package com.google.android.material.textfield;

import L1.d;
import N1.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.D;
import androidx.core.view.P;
import androidx.core.widget.j;
import java.util.ArrayList;
import java.util.List;
import z1.C0970a;
import z1.C0972c;
import z1.e;

final class v {

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f12407A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f12408B;

    /* renamed from: a  reason: collision with root package name */
    private final int f12409a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12410b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12411c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f12412d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f12413e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f12414f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f12415g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f12416h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f12417i;

    /* renamed from: j  reason: collision with root package name */
    private int f12418j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f12419k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Animator f12420l;

    /* renamed from: m  reason: collision with root package name */
    private final float f12421m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f12422n;

    /* renamed from: o  reason: collision with root package name */
    private int f12423o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f12424p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12425q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public TextView f12426r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f12427s;

    /* renamed from: t  reason: collision with root package name */
    private int f12428t;

    /* renamed from: u  reason: collision with root package name */
    private int f12429u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f12430v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f12431w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f12432x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f12433y;

    /* renamed from: z  reason: collision with root package name */
    private int f12434z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f12436b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12437c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f12438d;

        a(int i4, TextView textView, int i5, TextView textView2) {
            this.f12435a = i4;
            this.f12436b = textView;
            this.f12437c = i5;
            this.f12438d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = v.this.f12422n = this.f12435a;
            Animator unused2 = v.this.f12420l = null;
            TextView textView = this.f12436b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f12437c == 1 && v.this.f12426r != null) {
                    v.this.f12426r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f12438d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f12438d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f12438d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f12438d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f12416h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12415g = context;
        this.f12416h = textInputLayout;
        this.f12421m = (float) context.getResources().getDimensionPixelSize(C0972c.design_textinput_caption_translate_y);
        int i4 = C0970a.motionDurationShort4;
        this.f12409a = d.f(context, i4, 217);
        this.f12410b = d.f(context, C0970a.motionDurationMedium4, 167);
        this.f12411c = d.f(context, i4, 167);
        int i5 = C0970a.motionEasingEmphasizedDecelerateInterpolator;
        this.f12412d = d.g(context, i5, A1.a.f8d);
        TimeInterpolator timeInterpolator = A1.a.f5a;
        this.f12413e = d.g(context, i5, timeInterpolator);
        this.f12414f = d.g(context, C0970a.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i4, int i5) {
        TextView m4;
        TextView m5;
        if (i4 != i5) {
            if (!(i5 == 0 || (m5 = m(i5)) == null)) {
                m5.setVisibility(0);
                m5.setAlpha(1.0f);
            }
            if (!(i4 == 0 || (m4 = m(i4)) == null)) {
                m4.setVisibility(4);
                if (i4 == 1) {
                    m4.setText((CharSequence) null);
                }
            }
            this.f12422n = i5;
        }
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i4) {
        if (i4 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (!P.S(this.f12416h) || !this.f12416h.isEnabled() || (this.f12423o == this.f12422n && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    private void S(int i4, int i5, boolean z3) {
        boolean z4 = z3;
        if (i4 != i5) {
            if (z4) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f12420l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i4;
                int i7 = i5;
                i(arrayList2, this.f12432x, this.f12433y, 2, i6, i7);
                i(arrayList2, this.f12425q, this.f12426r, 1, i6, i7);
                A1.b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i5, m(i4), i4, m(i5)));
                animatorSet.start();
            } else {
                D(i4, i5);
            }
            this.f12416h.n0();
            this.f12416h.r0(z4);
            this.f12416h.x0();
        }
    }

    private boolean g() {
        if (this.f12417i == null || this.f12416h.getEditText() == null) {
            return false;
        }
        return true;
    }

    private void i(List list, boolean z3, TextView textView, int i4, int i5, int i6) {
        boolean z4;
        if (textView != null && z3) {
            if (i4 == i6 || i4 == i5) {
                if (i6 == i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ObjectAnimator j4 = j(textView, z4);
                if (i4 == i6 && i5 != 0) {
                    j4.setStartDelay((long) this.f12411c);
                }
                list.add(j4);
                if (i6 == i4 && i5 != 0) {
                    ObjectAnimator k4 = k(textView);
                    k4.setStartDelay((long) this.f12411c);
                    list.add(k4);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z3) {
        float f4;
        int i4;
        TimeInterpolator timeInterpolator;
        if (z3) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f4});
        if (z3) {
            i4 = this.f12410b;
        } else {
            i4 = this.f12411c;
        }
        ofFloat.setDuration((long) i4);
        if (z3) {
            timeInterpolator = this.f12413e;
        } else {
            timeInterpolator = this.f12414f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f12421m, 0.0f});
        ofFloat.setDuration((long) this.f12409a);
        ofFloat.setInterpolator(this.f12412d);
        return ofFloat;
    }

    private TextView m(int i4) {
        if (i4 == 1) {
            return this.f12426r;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f12433y;
    }

    private int v(boolean z3, int i4, int i5) {
        if (z3) {
            return this.f12415g.getResources().getDimensionPixelSize(i4);
        }
        return i5;
    }

    private boolean y(int i4) {
        if (i4 != 1 || this.f12426r == null || TextUtils.isEmpty(this.f12424p)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f12425q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.f12432x;
    }

    /* access modifiers changed from: package-private */
    public void C(TextView textView, int i4) {
        FrameLayout frameLayout;
        if (this.f12417i != null) {
            if (!z(i4) || (frameLayout = this.f12419k) == null) {
                this.f12417i.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i5 = this.f12418j - 1;
            this.f12418j = i5;
            O(this.f12417i, i5);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i4) {
        this.f12428t = i4;
        TextView textView = this.f12426r;
        if (textView != null) {
            P.q0(textView, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f12427s = charSequence;
        TextView textView = this.f12426r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z3) {
        if (this.f12425q != z3) {
            h();
            if (z3) {
                D d4 = new D(this.f12415g);
                this.f12426r = d4;
                d4.setId(e.textinput_error);
                this.f12426r.setTextAlignment(5);
                Typeface typeface = this.f12408B;
                if (typeface != null) {
                    this.f12426r.setTypeface(typeface);
                }
                H(this.f12429u);
                I(this.f12430v);
                F(this.f12427s);
                E(this.f12428t);
                this.f12426r.setVisibility(4);
                e(this.f12426r, 0);
            } else {
                w();
                C(this.f12426r, 0);
                this.f12426r = null;
                this.f12416h.n0();
                this.f12416h.x0();
            }
            this.f12425q = z3;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i4) {
        this.f12429u = i4;
        TextView textView = this.f12426r;
        if (textView != null) {
            this.f12416h.a0(textView, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f12430v = colorStateList;
        TextView textView = this.f12426r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i4) {
        this.f12434z = i4;
        TextView textView = this.f12433y;
        if (textView != null) {
            j.o(textView, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z3) {
        if (this.f12432x != z3) {
            h();
            if (z3) {
                D d4 = new D(this.f12415g);
                this.f12433y = d4;
                d4.setId(e.textinput_helper_text);
                this.f12433y.setTextAlignment(5);
                Typeface typeface = this.f12408B;
                if (typeface != null) {
                    this.f12433y.setTypeface(typeface);
                }
                this.f12433y.setVisibility(4);
                P.q0(this.f12433y, 1);
                J(this.f12434z);
                L(this.f12407A);
                e(this.f12433y, 1);
                this.f12433y.setAccessibilityDelegate(new b());
            } else {
                x();
                C(this.f12433y, 1);
                this.f12433y = null;
                this.f12416h.n0();
                this.f12416h.x0();
            }
            this.f12432x = z3;
        }
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.f12407A = colorStateList;
        TextView textView = this.f12433y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.f12408B) {
            this.f12408B = typeface;
            M(this.f12426r, typeface);
            M(this.f12433y, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f12424p = charSequence;
        this.f12426r.setText(charSequence);
        int i4 = this.f12422n;
        if (i4 != 1) {
            this.f12423o = 1;
        }
        S(i4, this.f12423o, P(this.f12426r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f12431w = charSequence;
        this.f12433y.setText(charSequence);
        int i4 = this.f12422n;
        if (i4 != 2) {
            this.f12423o = 2;
        }
        S(i4, this.f12423o, P(this.f12433y, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i4) {
        if (this.f12417i == null && this.f12419k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f12415g);
            this.f12417i = linearLayout;
            linearLayout.setOrientation(0);
            this.f12416h.addView(this.f12417i, -1, -2);
            this.f12419k = new FrameLayout(this.f12415g);
            this.f12417i.addView(this.f12419k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f12416h.getEditText() != null) {
                f();
            }
        }
        if (z(i4)) {
            this.f12419k.setVisibility(0);
            this.f12419k.addView(textView);
        } else {
            this.f12417i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f12417i.setVisibility(0);
        this.f12418j++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f12416h.getEditText();
            boolean g4 = c.g(this.f12415g);
            LinearLayout linearLayout = this.f12417i;
            int i4 = C0972c.material_helper_text_font_1_3_padding_horizontal;
            P.D0(linearLayout, v(g4, i4, P.G(editText)), v(g4, C0972c.material_helper_text_font_1_3_padding_top, this.f12415g.getResources().getDimensionPixelSize(C0972c.material_helper_text_default_padding_top)), v(g4, i4, P.F(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f12420l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f12423o);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f12428t;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f12427s;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f12424p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f12426r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f12426r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f12431w;
    }

    /* access modifiers changed from: package-private */
    public View t() {
        return this.f12433y;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f12433y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f12424p = null;
        h();
        if (this.f12422n == 1) {
            if (!this.f12432x || TextUtils.isEmpty(this.f12431w)) {
                this.f12423o = 0;
            } else {
                this.f12423o = 2;
            }
        }
        S(this.f12422n, this.f12423o, P(this.f12426r, ""));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h();
        int i4 = this.f12422n;
        if (i4 == 2) {
            this.f12423o = 0;
        }
        S(i4, this.f12423o, P(this.f12433y, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i4) {
        return i4 == 0 || i4 == 1;
    }
}
