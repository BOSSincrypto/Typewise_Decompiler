package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class d {
    public static Interpolator a(Context context, int i4) {
        return AnimationUtils.loadInterpolator(context, i4);
    }
}
