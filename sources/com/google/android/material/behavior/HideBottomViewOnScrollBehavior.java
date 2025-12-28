package com.google.android.material.behavior;

import L1.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z1.C0970a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: j  reason: collision with root package name */
    private static final int f11568j = C0970a.motionDurationLong2;

    /* renamed from: k  reason: collision with root package name */
    private static final int f11569k = C0970a.motionDurationMedium4;

    /* renamed from: l  reason: collision with root package name */
    private static final int f11570l = C0970a.motionEasingEmphasizedInterpolator;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet f11571a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f11572b;

    /* renamed from: c  reason: collision with root package name */
    private int f11573c;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f11574d;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f11575e;

    /* renamed from: f  reason: collision with root package name */
    private int f11576f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f11577g = 2;

    /* renamed from: h  reason: collision with root package name */
    private int f11578h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f11579i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f11579i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void F(View view, int i4, long j4, TimeInterpolator timeInterpolator) {
        this.f11579i = view.animate().translationY((float) i4).setInterpolator(timeInterpolator).setDuration(j4).setListener(new a());
    }

    private void M(View view, int i4) {
        this.f11577g = i4;
        Iterator it = this.f11571a.iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        return i4 == 2;
    }

    public boolean G() {
        if (this.f11577g == 1) {
            return true;
        }
        return false;
    }

    public boolean H() {
        if (this.f11577g == 2) {
            return true;
        }
        return false;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z3) {
        if (!G()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f11579i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            M(view, 1);
            int i4 = this.f11576f + this.f11578h;
            if (z3) {
                F(view, i4, (long) this.f11573c, this.f11575e);
                return;
            }
            view.setTranslationY((float) i4);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z3) {
        if (!H()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f11579i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            M(view, 2);
            if (z3) {
                F(view, 0, (long) this.f11572b, this.f11574d);
                return;
            }
            view.setTranslationY((float) 0);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f11576f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f11572b = d.f(view.getContext(), f11568j, 225);
        this.f11573c = d.f(view.getContext(), f11569k, 175);
        Context context = view.getContext();
        int i5 = f11570l;
        this.f11574d = d.g(context, i5, A1.a.f8d);
        this.f11575e = d.g(view.getContext(), i5, A1.a.f7c);
        return super.l(coordinatorLayout, view, i4);
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        if (i5 > 0) {
            I(view);
        } else if (i5 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
