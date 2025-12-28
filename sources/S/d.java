package S;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f1390a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1391b;

    protected d(float[] fArr) {
        this.f1390a = fArr;
        this.f1391b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1390a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f4), fArr.length - 2);
        float f5 = this.f1391b;
        float f6 = (f4 - (((float) min) * f5)) / f5;
        float[] fArr2 = this.f1390a;
        float f7 = fArr2[min];
        return f7 + (f6 * (fArr2[min + 1] - f7));
    }
}
