package androidx.core.content.res;

final class l {

    /* renamed from: k  reason: collision with root package name */
    static final l f4946k = k(b.f4912c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f4947a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4948b;

    /* renamed from: c  reason: collision with root package name */
    private final float f4949c;

    /* renamed from: d  reason: collision with root package name */
    private final float f4950d;

    /* renamed from: e  reason: collision with root package name */
    private final float f4951e;

    /* renamed from: f  reason: collision with root package name */
    private final float f4952f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f4953g;

    /* renamed from: h  reason: collision with root package name */
    private final float f4954h;

    /* renamed from: i  reason: collision with root package name */
    private final float f4955i;

    /* renamed from: j  reason: collision with root package name */
    private final float f4956j;

    private l(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f4952f = f4;
        this.f4947a = f5;
        this.f4948b = f6;
        this.f4949c = f7;
        this.f4950d = f8;
        this.f4951e = f9;
        this.f4953g = fArr;
        this.f4954h = f10;
        this.f4955i = f11;
        this.f4956j = f12;
    }

    static l k(float[] fArr, float f4, float f5, float f6, boolean z3) {
        float d4;
        float f7;
        float f8 = f4;
        float[][] fArr2 = b.f4910a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f9) + (fArr4[1] * f10) + (fArr4[2] * f11);
        float[] fArr5 = fArr2[2];
        float f14 = (f9 * fArr5[0]) + (f10 * fArr5[1]) + (f11 * fArr5[2]);
        float f15 = (f6 / 10.0f) + 0.8f;
        if (((double) f15) >= 0.9d) {
            d4 = b.d(0.59f, 0.69f, (f15 - 0.9f) * 10.0f);
        } else {
            d4 = b.d(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        }
        float f16 = d4;
        if (z3) {
            f7 = 1.0f;
        } else {
            f7 = (1.0f - (((float) Math.exp((double) (((-f8) - 42.0f) / 92.0f))) * 0.2777778f)) * f15;
        }
        double d5 = (double) f7;
        if (d5 > 1.0d) {
            f7 = 1.0f;
        } else if (d5 < 0.0d) {
            f7 = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * f7) + 1.0f) - f7, (((100.0f / f13) * f7) + 1.0f) - f7, (((100.0f / f14) * f7) + 1.0f) - f7};
        float f17 = 1.0f / ((5.0f * f8) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f8) + (0.1f * f19 * f19 * ((float) Math.cbrt(((double) f8) * 5.0d)));
        float h4 = b.h(f5) / fArr[1];
        double d6 = (double) h4;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f13)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f14)) / 100.0d, 0.42d)};
        float f20 = fArr7[0];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[1];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[2];
        float[] fArr8 = {f21, f23, (400.0f * f24) / (f24 + 27.13f)};
        return new l(h4, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, f16, f15, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f4947a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f4950d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f4954h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f4955i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f4952f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f4948b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f4951e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f4949c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f4953g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f4956j;
    }
}
