package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f5205a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f5206b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f5207c = null;

    /* renamed from: d  reason: collision with root package name */
    int f5208d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ X f5209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5210b;

        a(X x3, View view) {
            this.f5209a = x3;
            this.f5210b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5209a.a(this.f5210b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f5209a.b(this.f5210b);
        }

        public void onAnimationStart(Animator animator) {
            this.f5209a.c(this.f5210b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    W(View view) {
        this.f5205a = new WeakReference(view);
    }

    private void i(View view, X x3) {
        if (x3 != null) {
            view.animate().setListener(new a(x3, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public W b(float f4) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f5205a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public W f(long j4) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    public W g(Interpolator interpolator) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public W h(X x3) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            i(view, x3);
        }
        return this;
    }

    public W j(long j4) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    public W k(Z z3) {
        V v3;
        View view = (View) this.f5205a.get();
        if (view != null) {
            if (z3 != null) {
                v3 = new V(z3, view);
            } else {
                v3 = null;
            }
            b.a(view.animate(), v3);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public W m(float f4) {
        View view = (View) this.f5205a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }
}
