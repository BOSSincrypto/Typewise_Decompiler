package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.a;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    static final float[][] f4910a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    static final float[][] f4911b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    static final float[] f4912c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    static final float[][] f4913d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f4) {
        float f5;
        boolean z3;
        float f6;
        if (f4 < 1.0f) {
            return -16777216;
        }
        if (f4 > 99.0f) {
            return -1;
        }
        float f7 = (f4 + 16.0f) / 116.0f;
        if (f4 > 8.0f) {
            f5 = f7 * f7 * f7;
        } else {
            f5 = f4 / 903.2963f;
        }
        float f8 = f7 * f7 * f7;
        if (f8 > 0.008856452f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f6 = f8;
        } else {
            f6 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z3) {
            f8 = ((f7 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f4912c;
        return a.b((double) (f6 * fArr[0]), (double) (f5 * fArr[1]), (double) (f8 * fArr[2]));
    }

    static float b(int i4) {
        return c(g(i4));
    }

    static float c(float f4) {
        float f5 = f4 / 100.0f;
        if (f5 <= 0.008856452f) {
            return f5 * 903.2963f;
        }
        return (((float) Math.cbrt((double) f5)) * 116.0f) - 16.0f;
    }

    static float d(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    static float e(int i4) {
        float pow;
        float f4 = ((float) i4) / 255.0f;
        if (f4 <= 0.04045f) {
            pow = f4 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f4 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    static void f(int i4, float[] fArr) {
        float e4 = e(Color.red(i4));
        float e5 = e(Color.green(i4));
        float e6 = e(Color.blue(i4));
        float[][] fArr2 = f4913d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * e4) + (fArr3[1] * e5) + (fArr3[2] * e6);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * e4) + (fArr4[1] * e5) + (fArr4[2] * e6);
        float[] fArr5 = fArr2[2];
        fArr[2] = (e4 * fArr5[0]) + (e5 * fArr5[1]) + (e6 * fArr5[2]);
    }

    static float g(int i4) {
        float e4 = e(Color.red(i4));
        float e5 = e(Color.green(i4));
        float e6 = e(Color.blue(i4));
        float[] fArr = f4913d[1];
        return (e4 * fArr[0]) + (e5 * fArr[1]) + (e6 * fArr[2]);
    }

    static float h(float f4) {
        float f5;
        if (f4 > 8.0f) {
            f5 = (float) Math.pow((((double) f4) + 16.0d) / 116.0d, 3.0d);
        } else {
            f5 = f4 / 903.2963f;
        }
        return f5 * 100.0f;
    }
}
