package androidx.core.content.res;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f4901a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4902b;

    /* renamed from: c  reason: collision with root package name */
    private final float f4903c;

    /* renamed from: d  reason: collision with root package name */
    private final float f4904d;

    /* renamed from: e  reason: collision with root package name */
    private final float f4905e;

    /* renamed from: f  reason: collision with root package name */
    private final float f4906f;

    /* renamed from: g  reason: collision with root package name */
    private final float f4907g;

    /* renamed from: h  reason: collision with root package name */
    private final float f4908h;

    /* renamed from: i  reason: collision with root package name */
    private final float f4909i;

    a(float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f4901a = f4;
        this.f4902b = f5;
        this.f4903c = f6;
        this.f4904d = f7;
        this.f4905e = f8;
        this.f4906f = f9;
        this.f4907g = f10;
        this.f4908h = f11;
        this.f4909i = f12;
    }

    private static a b(float f4, float f5, float f6) {
        float f7 = 100.0f;
        float f8 = 1000.0f;
        float f9 = 0.0f;
        a aVar = null;
        float f10 = 1000.0f;
        while (Math.abs(f9 - f7) > 0.01f) {
            float f11 = ((f7 - f9) / 2.0f) + f9;
            int p4 = e(f11, f5, f4).p();
            float b4 = b.b(p4);
            float abs = Math.abs(f6 - b4);
            if (abs < 0.2f) {
                a c4 = c(p4);
                float a4 = c4.a(e(c4.k(), c4.i(), f4));
                if (a4 <= 1.0f) {
                    aVar = c4;
                    f8 = abs;
                    f10 = a4;
                }
            }
            if (f8 == 0.0f && f10 == 0.0f) {
                break;
            } else if (b4 < f6) {
                f9 = f11;
            } else {
                f7 = f11;
            }
        }
        return aVar;
    }

    static a c(int i4) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i4, l.f4946k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i4, l lVar, float[] fArr, float[] fArr2) {
        float f4;
        float[] fArr3 = fArr2;
        b.f(i4, fArr3);
        float[][] fArr4 = b.f4910a;
        float f5 = fArr3[0];
        float[] fArr5 = fArr4[0];
        float f6 = fArr3[1];
        float f7 = fArr3[2];
        float f8 = (fArr5[0] * f5) + (fArr5[1] * f6) + (fArr5[2] * f7);
        float[] fArr6 = fArr4[1];
        float f9 = (fArr6[0] * f5) + (fArr6[1] * f6) + (fArr6[2] * f7);
        float[] fArr7 = fArr4[2];
        float f10 = lVar.i()[0] * f8;
        float f11 = lVar.i()[1] * f9;
        float f12 = lVar.i()[2] * ((f5 * fArr7[0]) + (f6 * fArr7[1]) + (f7 * fArr7[2]));
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f10))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f11))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f12))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d4 = (double) signum3;
        float f13 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d4)) / 11.0f;
        float f14 = ((float) (((double) (signum + signum2)) - (d4 * 2.0d))) / 9.0f;
        float f15 = signum2 * 20.0f;
        float f16 = (((signum * 20.0f) + f15) + (21.0f * signum3)) / 20.0f;
        float f17 = (((signum * 40.0f) + f15) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f14, (double) f13)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = (3.1415927f * atan2) / 180.0f;
        float f19 = f16;
        float f20 = f14;
        float pow4 = ((float) Math.pow((double) ((f17 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float b4 = (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f) * lVar.d();
        if (((double) atan2) < 20.14d) {
            f4 = 360.0f + atan2;
        } else {
            f4 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f4) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f13 * f13) + (f20 * f20))))) / (f19 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        float d5 = lVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d5) + 1.0f))) * 43.85965f;
        double d6 = (double) f18;
        float cos = ((float) Math.cos(d6)) * log;
        float sin = log * ((float) Math.sin(d6));
        fArr3[0] = atan2;
        fArr3[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b4;
            fArr[2] = d5;
            fArr[3] = sqrt2;
            fArr[4] = f21;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static a e(float f4, float f5, float f6) {
        return f(f4, f5, f6, l.f4946k);
    }

    private static a f(float f4, float f5, float f6, l lVar) {
        float f7 = f4;
        double d4 = ((double) f7) / 100.0d;
        float b4 = (4.0f / lVar.b()) * ((float) Math.sqrt(d4)) * (lVar.a() + 4.0f) * lVar.d();
        float d5 = f5 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f5 / ((float) Math.sqrt(d4))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f8 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((((double) d5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (double) ((3.1415927f * f6) / 180.0f);
        return new a(f6, f5, f7, b4, d5, sqrt, f8, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public static int m(float f4, float f5, float f6) {
        return n(f4, f5, f6, l.f4946k);
    }

    static int n(float f4, float f5, float f6, l lVar) {
        float f7;
        if (((double) f5) < 1.0d || ((double) Math.round(f6)) <= 0.0d || ((double) Math.round(f6)) >= 100.0d) {
            return b.a(f6);
        }
        if (f4 < 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = Math.min(360.0f, f4);
        }
        a aVar = null;
        boolean z3 = true;
        float f8 = 0.0f;
        float f9 = f5;
        while (Math.abs(f8 - f5) >= 0.4f) {
            a b4 = b(f7, f9, f6);
            if (!z3) {
                if (b4 == null) {
                    f5 = f9;
                } else {
                    f8 = f9;
                    aVar = b4;
                }
                f9 = ((f5 - f8) / 2.0f) + f8;
            } else if (b4 != null) {
                return b4.o(lVar);
            } else {
                f9 = ((f5 - f8) / 2.0f) + f8;
                z3 = false;
            }
        }
        if (aVar == null) {
            return b.a(f6);
        }
        return aVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(a aVar) {
        float l4 = l() - aVar.l();
        float g4 = g() - aVar.g();
        float h4 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l4 * l4) + (g4 * g4) + (h4 * h4))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f4908h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f4909i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f4902b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f4901a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f4903c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f4907g;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float f4;
        if (((double) i()) == 0.0d || ((double) k()) == 0.0d) {
            f4 = 0.0f;
        } else {
            f4 = i() / ((float) Math.sqrt(((double) k()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f4) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j4 = (double) ((j() * 3.1415927f) / 180.0f);
        float a4 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j4) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f5 = a4 / lVar.f();
        float sin = (float) Math.sin(j4);
        float cos2 = (float) Math.cos(j4);
        float f6 = (((0.305f + f5) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f7 = cos2 * f6;
        float f8 = f6 * sin;
        float f9 = f5 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f10) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
        float signum2 = Math.signum(f11) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
        float signum3 = Math.signum(f12) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))))), 2.380952380952381d));
        float f13 = signum / lVar.i()[0];
        float f14 = signum2 / lVar.i()[1];
        float f15 = signum3 / lVar.i()[2];
        float[][] fArr = b.f4911b;
        float[] fArr2 = fArr[0];
        float f16 = (fArr2[0] * f13) + (fArr2[1] * f14) + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.b((double) f16, (double) ((fArr3[0] * f13) + (fArr3[1] * f14) + (fArr3[2] * f15)), (double) ((f13 * fArr4[0]) + (f14 * fArr4[1]) + (f15 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.f4946k);
    }
}
