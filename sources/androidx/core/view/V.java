package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class V implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Z f5200a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f5201b;

    public /* synthetic */ V(Z z3, View view) {
        this.f5200a = z3;
        this.f5201b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5200a.a(this.f5201b);
    }
}
