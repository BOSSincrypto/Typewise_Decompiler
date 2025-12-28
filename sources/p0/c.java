package P0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.o;

public abstract class c {

    public static final class a extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1114b;

        a(View view, int i4) {
            this.f1113a = view;
            this.f1114b = i4;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f4, Transformation transformation) {
            int i4;
            ViewGroup.LayoutParams layoutParams = this.f1113a.getLayoutParams();
            int i5 = this.f1114b;
            if (f4 >= 1.0f) {
                i4 = 0;
            } else {
                i4 = (int) (((float) i5) * c.e(1.0f - f4));
            }
            layoutParams.width = i4;
            this.f1113a.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    public static final class b extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1115a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1116b;

        b(View view, int i4) {
            this.f1115a = view;
            this.f1116b = i4;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f4, Transformation transformation) {
            int i4;
            ViewGroup.LayoutParams layoutParams = this.f1115a.getLayoutParams();
            int i5 = this.f1116b;
            if (f4 >= 1.0f) {
                i4 = -2;
            } else {
                i4 = (int) (((float) i5) * c.e(f4));
            }
            layoutParams.width = i4;
            this.f1115a.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    public static final void d(View view, float f4, long j4, long j5) {
        o.e(view, "<this>");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, f4);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        translateAnimation.setDuration(j4);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -f4);
        translateAnimation2.setInterpolator(new AnticipateOvershootInterpolator());
        translateAnimation2.setStartOffset(j4);
        translateAnimation2.setDuration(j5);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        view.startAnimation(animationSet);
    }

    /* access modifiers changed from: private */
    public static final float e(float f4) {
        return Math.max(0.0f, Math.min(1.0f, (float) ((1.0d - Math.cos(((double) f4) * 3.141592653589793d)) / 2.0d)));
    }

    public static final void f(View view, long j4) {
        o.e(view, "<this>");
        view.measure(-2, -2);
        a aVar = new a(view, view.getMeasuredWidth());
        aVar.setDuration(j4);
        view.startAnimation(aVar);
    }

    public static final void g(View view, long j4) {
        o.e(view, "<this>");
        view.measure(-2, -2);
        int measuredWidth = view.getMeasuredWidth();
        view.getLayoutParams().width = 1;
        b bVar = new b(view, measuredWidth);
        bVar.setDuration(j4);
        view.startAnimation(bVar);
    }

    public static final ValueAnimator h(View view, int i4, long j4) {
        o.e(view, "<this>");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(j4);
        ofFloat.addUpdateListener(new b(view, i4));
        o.b(ofFloat);
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static final void i(View view, int i4, ValueAnimator valueAnimator) {
        o.e(valueAnimator, "it");
        view.getLayoutParams().width = (int) ((((float) 1) - valueAnimator.getAnimatedFraction()) * ((float) i4));
        view.requestLayout();
    }

    public static final ValueAnimator j(View view, int i4, long j4) {
        o.e(view, "<this>");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new OvershootInterpolator(3.0f));
        ofFloat.setDuration(j4);
        ofFloat.addUpdateListener(new a(view, i4));
        o.b(ofFloat);
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static final void k(View view, int i4, ValueAnimator valueAnimator) {
        o.e(valueAnimator, "it");
        double d4 = (double) i4;
        view.getLayoutParams().width = (int) ((0.7d * d4) + (((double) valueAnimator.getAnimatedFraction()) * 0.3d * d4));
        view.requestLayout();
    }

    public static final Animation l(long j4, long j5) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(j4);
        alphaAnimation.setStartOffset(j5);
        return alphaAnimation;
    }

    public static /* synthetic */ Animation m(long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j5 = 0;
        }
        return l(j4, j5);
    }

    public static final Animation n(long j4, long j5) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(j4);
        alphaAnimation.setStartOffset(j5);
        return alphaAnimation;
    }
}
