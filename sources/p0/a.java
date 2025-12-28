package P0;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1110b;

    public /* synthetic */ a(View view, int i4) {
        this.f1109a = view;
        this.f1110b = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c.k(this.f1109a, this.f1110b, valueAnimator);
    }
}
