package com.google.android.material.carousel;

final class a {

    /* renamed from: a  reason: collision with root package name */
    final int f11770a;

    /* renamed from: b  reason: collision with root package name */
    float f11771b;

    /* renamed from: c  reason: collision with root package name */
    final int f11772c;

    /* renamed from: d  reason: collision with root package name */
    final int f11773d;

    /* renamed from: e  reason: collision with root package name */
    float f11774e;

    /* renamed from: f  reason: collision with root package name */
    float f11775f;

    /* renamed from: g  reason: collision with root package name */
    final int f11776g;

    /* renamed from: h  reason: collision with root package name */
    final float f11777h;

    a(int i4, float f4, float f5, float f6, int i5, float f7, int i6, float f8, int i7, float f9) {
        this.f11770a = i4;
        this.f11771b = I.a.a(f4, f5, f6);
        this.f11772c = i5;
        this.f11774e = f7;
        this.f11773d = i6;
        this.f11775f = f8;
        this.f11776g = i7;
        d(f9, f5, f6, f8);
        this.f11777h = b(f8);
    }

    private float a(float f4, int i4, float f5, int i5, int i6) {
        if (i4 <= 0) {
            f5 = 0.0f;
        }
        float f6 = ((float) i5) / 2.0f;
        return (f4 - ((((float) i4) + f6) * f5)) / (((float) i6) + f6);
    }

    private float b(float f4) {
        if (!f()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f4 - this.f11775f) * ((float) this.f11770a);
    }

    static a c(float f4, float f5, float f6, float f7, int[] iArr, float f8, int[] iArr2, float f9, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        a aVar = null;
        int i4 = 1;
        for (int i5 : iArr3) {
            int length = iArr5.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = iArr5[i6];
                int length2 = iArr4.length;
                int i8 = 0;
                while (i8 < length2) {
                    a aVar2 = r8;
                    int i9 = i8;
                    int i10 = length2;
                    int i11 = i6;
                    int i12 = length;
                    a aVar3 = new a(i4, f5, f6, f7, iArr4[i8], f8, i7, f9, i5, f4);
                    if (aVar == null || aVar2.f11777h < aVar.f11777h) {
                        if (aVar2.f11777h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i4++;
                    i8 = i9 + 1;
                    length2 = i10;
                    i6 = i11;
                    length = i12;
                }
                int i13 = length;
                i6++;
            }
        }
        return aVar;
    }

    private void d(float f4, float f5, float f6, float f7) {
        float e4 = f4 - e();
        int i4 = this.f11772c;
        if (i4 > 0 && e4 > 0.0f) {
            float f8 = this.f11771b;
            this.f11771b = f8 + Math.min(e4 / ((float) i4), f6 - f8);
        } else if (i4 > 0 && e4 < 0.0f) {
            float f9 = this.f11771b;
            this.f11771b = f9 + Math.max(e4 / ((float) i4), f5 - f9);
        }
        float a4 = a(f4, this.f11772c, this.f11771b, this.f11773d, this.f11776g);
        this.f11775f = a4;
        float f10 = (this.f11771b + a4) / 2.0f;
        this.f11774e = f10;
        int i5 = this.f11773d;
        if (i5 > 0 && a4 != f7) {
            float f11 = (f7 - a4) * ((float) this.f11776g);
            float min = Math.min(Math.abs(f11), f10 * 0.1f * ((float) i5));
            if (f11 > 0.0f) {
                this.f11774e -= min / ((float) this.f11773d);
                this.f11775f += min / ((float) this.f11776g);
                return;
            }
            this.f11774e += min / ((float) this.f11773d);
            this.f11775f -= min / ((float) this.f11776g);
        }
    }

    private float e() {
        return (this.f11775f * ((float) this.f11776g)) + (this.f11774e * ((float) this.f11773d)) + (this.f11771b * ((float) this.f11772c));
    }

    private boolean f() {
        int i4 = this.f11776g;
        if (i4 > 0 && this.f11772c > 0 && this.f11773d > 0) {
            float f4 = this.f11775f;
            float f5 = this.f11774e;
            if (f4 <= f5 || f5 <= this.f11771b) {
                return false;
            }
            return true;
        } else if (i4 <= 0 || this.f11772c <= 0) {
            return true;
        } else {
            if (this.f11775f > this.f11771b) {
                return true;
            }
            return false;
        }
    }

    public String toString() {
        return "Arrangement [priority=" + this.f11770a + ", smallCount=" + this.f11772c + ", smallSize=" + this.f11771b + ", mediumCount=" + this.f11773d + ", mediumSize=" + this.f11774e + ", largeCount=" + this.f11776g + ", largeSize=" + this.f11775f + ", cost=" + this.f11777h + "]";
    }
}
