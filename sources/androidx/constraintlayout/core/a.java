package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f3788l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f3789a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f3790b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f3791c;

    /* renamed from: d  reason: collision with root package name */
    private int f3792d = 8;

    /* renamed from: e  reason: collision with root package name */
    private SolverVariable f3793e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f3794f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f3795g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f3796h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f3797i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f3798j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3799k = false;

    a(b bVar, c cVar) {
        this.f3790b = bVar;
        this.f3791c = cVar;
    }

    public float a(int i4) {
        int i5 = this.f3797i;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f3789a) {
            if (i6 == i4) {
                return this.f3796h[i5];
            }
            i5 = this.f3795g[i5];
            i6++;
        }
        return 0.0f;
    }

    public final float b(SolverVariable solverVariable, boolean z3) {
        if (this.f3793e == solverVariable) {
            this.f3793e = null;
        }
        int i4 = this.f3797i;
        if (i4 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f3789a) {
            if (this.f3794f[i4] == solverVariable.f3772c) {
                if (i4 == this.f3797i) {
                    this.f3797i = this.f3795g[i4];
                } else {
                    int[] iArr = this.f3795g;
                    iArr[i6] = iArr[i4];
                }
                if (z3) {
                    solverVariable.d(this.f3790b);
                }
                solverVariable.f3782m--;
                this.f3789a--;
                this.f3794f[i4] = -1;
                if (this.f3799k) {
                    this.f3798j = i4;
                }
                return this.f3796h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f3795g[i4];
        }
        return 0.0f;
    }

    public int c() {
        return this.f3789a;
    }

    public final void clear() {
        int i4 = this.f3797i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            SolverVariable solverVariable = this.f3791c.f3809d[this.f3794f[i4]];
            if (solverVariable != null) {
                solverVariable.d(this.f3790b);
            }
            i4 = this.f3795g[i4];
            i5++;
        }
        this.f3797i = -1;
        this.f3798j = -1;
        this.f3799k = false;
        this.f3789a = 0;
    }

    public final float d(SolverVariable solverVariable) {
        int i4 = this.f3797i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            if (this.f3794f[i4] == solverVariable.f3772c) {
                return this.f3796h[i4];
            }
            i4 = this.f3795g[i4];
            i5++;
        }
        return 0.0f;
    }

    public boolean e(SolverVariable solverVariable) {
        int i4 = this.f3797i;
        if (i4 == -1) {
            return false;
        }
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            if (this.f3794f[i4] == solverVariable.f3772c) {
                return true;
            }
            i4 = this.f3795g[i4];
            i5++;
        }
        return false;
    }

    public float f(b bVar, boolean z3) {
        float d4 = d(bVar.f3800a);
        b(bVar.f3800a, z3);
        b.a aVar = bVar.f3804e;
        int c4 = aVar.c();
        for (int i4 = 0; i4 < c4; i4++) {
            SolverVariable h4 = aVar.h(i4);
            i(h4, aVar.d(h4) * d4, z3);
        }
        return d4;
    }

    public final void g(SolverVariable solverVariable, float f4) {
        if (f4 == 0.0f) {
            b(solverVariable, true);
            return;
        }
        int i4 = this.f3797i;
        if (i4 == -1) {
            this.f3797i = 0;
            this.f3796h[0] = f4;
            this.f3794f[0] = solverVariable.f3772c;
            this.f3795g[0] = -1;
            solverVariable.f3782m++;
            solverVariable.a(this.f3790b);
            this.f3789a++;
            if (!this.f3799k) {
                int i5 = this.f3798j + 1;
                this.f3798j = i5;
                int[] iArr = this.f3794f;
                if (i5 >= iArr.length) {
                    this.f3799k = true;
                    this.f3798j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = 0;
        int i7 = -1;
        while (i4 != -1 && i6 < this.f3789a) {
            int i8 = this.f3794f[i4];
            int i9 = solverVariable.f3772c;
            if (i8 == i9) {
                this.f3796h[i4] = f4;
                return;
            }
            if (i8 < i9) {
                i7 = i4;
            }
            i4 = this.f3795g[i4];
            i6++;
        }
        int i10 = this.f3798j;
        int i11 = i10 + 1;
        if (this.f3799k) {
            int[] iArr2 = this.f3794f;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f3794f;
        if (i10 >= iArr3.length && this.f3789a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f3794f;
                if (i12 >= iArr4.length) {
                    break;
                } else if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr5 = this.f3794f;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.f3792d * 2;
            this.f3792d = i13;
            this.f3799k = false;
            this.f3798j = i10 - 1;
            this.f3796h = Arrays.copyOf(this.f3796h, i13);
            this.f3794f = Arrays.copyOf(this.f3794f, this.f3792d);
            this.f3795g = Arrays.copyOf(this.f3795g, this.f3792d);
        }
        this.f3794f[i10] = solverVariable.f3772c;
        this.f3796h[i10] = f4;
        if (i7 != -1) {
            int[] iArr6 = this.f3795g;
            iArr6[i10] = iArr6[i7];
            iArr6[i7] = i10;
        } else {
            this.f3795g[i10] = this.f3797i;
            this.f3797i = i10;
        }
        solverVariable.f3782m++;
        solverVariable.a(this.f3790b);
        int i14 = this.f3789a + 1;
        this.f3789a = i14;
        if (!this.f3799k) {
            this.f3798j++;
        }
        int[] iArr7 = this.f3794f;
        if (i14 >= iArr7.length) {
            this.f3799k = true;
        }
        if (this.f3798j >= iArr7.length) {
            this.f3799k = true;
            this.f3798j = iArr7.length - 1;
        }
    }

    public SolverVariable h(int i4) {
        int i5 = this.f3797i;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f3789a) {
            if (i6 == i4) {
                return this.f3791c.f3809d[this.f3794f[i5]];
            }
            i5 = this.f3795g[i5];
            i6++;
        }
        return null;
    }

    public void i(SolverVariable solverVariable, float f4, boolean z3) {
        float f5 = f3788l;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f3797i;
            if (i4 == -1) {
                this.f3797i = 0;
                this.f3796h[0] = f4;
                this.f3794f[0] = solverVariable.f3772c;
                this.f3795g[0] = -1;
                solverVariable.f3782m++;
                solverVariable.a(this.f3790b);
                this.f3789a++;
                if (!this.f3799k) {
                    int i5 = this.f3798j + 1;
                    this.f3798j = i5;
                    int[] iArr = this.f3794f;
                    if (i5 >= iArr.length) {
                        this.f3799k = true;
                        this.f3798j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i6 = 0;
            int i7 = -1;
            while (i4 != -1 && i6 < this.f3789a) {
                int i8 = this.f3794f[i4];
                int i9 = solverVariable.f3772c;
                if (i8 == i9) {
                    float[] fArr = this.f3796h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f3788l;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = 0.0f;
                    }
                    fArr[i4] = f6;
                    if (f6 == 0.0f) {
                        if (i4 == this.f3797i) {
                            this.f3797i = this.f3795g[i4];
                        } else {
                            int[] iArr2 = this.f3795g;
                            iArr2[i7] = iArr2[i4];
                        }
                        if (z3) {
                            solverVariable.d(this.f3790b);
                        }
                        if (this.f3799k) {
                            this.f3798j = i4;
                        }
                        solverVariable.f3782m--;
                        this.f3789a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i7 = i4;
                }
                i4 = this.f3795g[i4];
                i6++;
            }
            int i10 = this.f3798j;
            int i11 = i10 + 1;
            if (this.f3799k) {
                int[] iArr3 = this.f3794f;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f3794f;
            if (i10 >= iArr4.length && this.f3789a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f3794f;
                    if (i12 >= iArr5.length) {
                        break;
                    } else if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            int[] iArr6 = this.f3794f;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.f3792d * 2;
                this.f3792d = i13;
                this.f3799k = false;
                this.f3798j = i10 - 1;
                this.f3796h = Arrays.copyOf(this.f3796h, i13);
                this.f3794f = Arrays.copyOf(this.f3794f, this.f3792d);
                this.f3795g = Arrays.copyOf(this.f3795g, this.f3792d);
            }
            this.f3794f[i10] = solverVariable.f3772c;
            this.f3796h[i10] = f4;
            if (i7 != -1) {
                int[] iArr7 = this.f3795g;
                iArr7[i10] = iArr7[i7];
                iArr7[i7] = i10;
            } else {
                this.f3795g[i10] = this.f3797i;
                this.f3797i = i10;
            }
            solverVariable.f3782m++;
            solverVariable.a(this.f3790b);
            this.f3789a++;
            if (!this.f3799k) {
                this.f3798j++;
            }
            int i14 = this.f3798j;
            int[] iArr8 = this.f3794f;
            if (i14 >= iArr8.length) {
                this.f3799k = true;
                this.f3798j = iArr8.length - 1;
            }
        }
    }

    public void j(float f4) {
        int i4 = this.f3797i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            float[] fArr = this.f3796h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f3795g[i4];
            i5++;
        }
    }

    public void k() {
        int i4 = this.f3797i;
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            float[] fArr = this.f3796h;
            fArr[i4] = fArr[i4] * -1.0f;
            i4 = this.f3795g[i4];
            i5++;
        }
    }

    public String toString() {
        int i4 = this.f3797i;
        String str = "";
        int i5 = 0;
        while (i4 != -1 && i5 < this.f3789a) {
            str = ((str + " -> ") + this.f3796h[i4] + " : ") + this.f3791c.f3809d[this.f3794f[i4]];
            i4 = this.f3795g[i4];
            i5++;
        }
        return str;
    }
}
