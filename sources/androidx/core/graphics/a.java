package androidx.core.graphics;

import android.graphics.Color;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f4957a = new ThreadLocal();

    public static void a(int i4, int i5, int i6, double[] dArr) {
        double pow;
        double pow2;
        double d4;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d5 = ((double) i4) / 255.0d;
            if (d5 < 0.04045d) {
                pow = d5 / 12.92d;
            } else {
                pow = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i5) / 255.0d;
            if (d6 < 0.04045d) {
                pow2 = d6 / 12.92d;
            } else {
                pow2 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            double d7 = ((double) i6) / 255.0d;
            if (d7 < 0.04045d) {
                d4 = d7 / 12.92d;
            } else {
                d4 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * d4)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * d4)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (d4 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int b(double d4, double d5, double d6) {
        double d7;
        double d8;
        double d9;
        double d10 = (((3.2406d * d4) + (-1.5372d * d5)) + (-0.4986d * d6)) / 100.0d;
        double d11 = (((-0.9689d * d4) + (1.8758d * d5)) + (0.0415d * d6)) / 100.0d;
        double d12 = (((0.0557d * d4) + (-0.204d * d5)) + (1.057d * d6)) / 100.0d;
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        if (d11 > 0.0031308d) {
            d8 = (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d8 = d11 * 12.92d;
        }
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = d12 * 12.92d;
        }
        return Color.rgb(i((int) Math.round(d7 * 255.0d), 0, 255), i((int) Math.round(d8 * 255.0d), 0, 255), i((int) Math.round(d9 * 255.0d), 0, 255));
    }

    public static int c(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((((float) Color.alpha(i4)) * f5) + (((float) Color.alpha(i5)) * f4)), (int) ((((float) Color.red(i4)) * f5) + (((float) Color.red(i5)) * f4)), (int) ((((float) Color.green(i4)) * f5) + (((float) Color.green(i5)) * f4)), (int) ((((float) Color.blue(i4)) * f5) + (((float) Color.blue(i5)) * f4)));
    }

    public static double d(int i4) {
        double[] j4 = j();
        e(i4, j4);
        return j4[1] / 100.0d;
    }

    public static void e(int i4, double[] dArr) {
        a(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    private static int f(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    public static int g(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int f4 = f(alpha2, alpha);
        return Color.argb(f4, h(Color.red(i4), alpha2, Color.red(i5), alpha, f4), h(Color.green(i4), alpha2, Color.green(i5), alpha, f4), h(Color.blue(i4), alpha2, Color.blue(i5), alpha, f4));
    }

    private static int h(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    private static int i(int i4, int i5, int i6) {
        if (i4 < i5) {
            return i5;
        }
        return Math.min(i4, i6);
    }

    private static double[] j() {
        ThreadLocal threadLocal = f4957a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i4, int i5) {
        if (i5 >= 0 && i5 <= 255) {
            return (i4 & 16777215) | (i5 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
