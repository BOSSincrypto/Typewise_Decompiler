package A1;

import S.b;
import S.c;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f5a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f6b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f7c = new S.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f8d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f9e = new DecelerateInterpolator();

    public static float a(float f4, float f5, float f6) {
        return f4 + (f6 * (f5 - f4));
    }

    public static float b(float f4, float f5, float f6, float f7, float f8) {
        if (f8 <= f6) {
            return f4;
        }
        if (f8 >= f7) {
            return f5;
        }
        return a(f4, f5, (f8 - f6) / (f7 - f6));
    }

    public static int c(int i4, int i5, float f4) {
        return i4 + Math.round(f4 * ((float) (i5 - i4)));
    }
}
