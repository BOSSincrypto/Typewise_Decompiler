package P0;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1111a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1112b;

    public /* synthetic */ b(View view, int i4) {
        this.f1111a = view;
        this.f1112b = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c.i(this.f1111a, this.f1112b, valueAnimator);
    }
}
