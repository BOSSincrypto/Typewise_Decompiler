package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import com.getcapacitor.PluginMethod;
import java.util.Arrays;

public class h implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f3848n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f3849a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f3850b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f3851c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f3852d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f3853e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f3854f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f3855g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f3856h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f3857i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f3858j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f3859k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f3860l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f3861m;

    h(b bVar, c cVar) {
        this.f3860l = bVar;
        this.f3861m = cVar;
        clear();
    }

    private void l(SolverVariable solverVariable, int i4) {
        int[] iArr;
        int i5 = solverVariable.f3772c % this.f3851c;
        int[] iArr2 = this.f3852d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f3853e;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    break;
                }
                i6 = i7;
            }
            iArr[i6] = i4;
        }
        this.f3853e[i4] = -1;
    }

    private void m(int i4, SolverVariable solverVariable, float f4) {
        this.f3854f[i4] = solverVariable.f3772c;
        this.f3855g[i4] = f4;
        this.f3856h[i4] = -1;
        this.f3857i[i4] = -1;
        solverVariable.a(this.f3860l);
        solverVariable.f3782m++;
        this.f3858j++;
    }

    private int n() {
        for (int i4 = 0; i4 < this.f3850b; i4++) {
            if (this.f3854f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    private void o() {
        int i4 = this.f3850b * 2;
        this.f3854f = Arrays.copyOf(this.f3854f, i4);
        this.f3855g = Arrays.copyOf(this.f3855g, i4);
        this.f3856h = Arrays.copyOf(this.f3856h, i4);
        this.f3857i = Arrays.copyOf(this.f3857i, i4);
        this.f3853e = Arrays.copyOf(this.f3853e, i4);
        for (int i5 = this.f3850b; i5 < i4; i5++) {
            this.f3854f[i5] = -1;
            this.f3853e[i5] = -1;
        }
        this.f3850b = i4;
    }

    private void q(int i4, SolverVariable solverVariable, float f4) {
        int n4 = n();
        m(n4, solverVariable, f4);
        if (i4 != -1) {
            this.f3856h[n4] = i4;
            int[] iArr = this.f3857i;
            iArr[n4] = iArr[i4];
            iArr[i4] = n4;
        } else {
            this.f3856h[n4] = -1;
            if (this.f3858j > 0) {
                this.f3857i[n4] = this.f3859k;
                this.f3859k = n4;
            } else {
                this.f3857i[n4] = -1;
            }
        }
        int i5 = this.f3857i[n4];
        if (i5 != -1) {
            this.f3856h[i5] = n4;
        }
        l(solverVariable, n4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(androidx.constraintlayout.core.SolverVariable r6) {
        /*
            r5 = this;
            int r6 = r6.f3772c
            int r0 = r5.f3851c
            int r0 = r6 % r0
            int[] r1 = r5.f3852d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f3854f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f3853e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f3853e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f3854f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f3854f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.h.r(androidx.constraintlayout.core.SolverVariable):void");
    }

    public float a(int i4) {
        int i5 = this.f3858j;
        int i6 = this.f3859k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f3855g[i6];
            }
            i6 = this.f3857i[i6];
            if (i6 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public float b(SolverVariable solverVariable, boolean z3) {
        int p4 = p(solverVariable);
        if (p4 == -1) {
            return 0.0f;
        }
        r(solverVariable);
        float f4 = this.f3855g[p4];
        if (this.f3859k == p4) {
            this.f3859k = this.f3857i[p4];
        }
        this.f3854f[p4] = -1;
        int[] iArr = this.f3856h;
        int i4 = iArr[p4];
        if (i4 != -1) {
            int[] iArr2 = this.f3857i;
            iArr2[i4] = iArr2[p4];
        }
        int i5 = this.f3857i[p4];
        if (i5 != -1) {
            iArr[i5] = iArr[p4];
        }
        this.f3858j--;
        solverVariable.f3782m--;
        if (z3) {
            solverVariable.d(this.f3860l);
        }
        return f4;
    }

    public int c() {
        return this.f3858j;
    }

    public void clear() {
        int i4 = this.f3858j;
        for (int i5 = 0; i5 < i4; i5++) {
            SolverVariable h4 = h(i5);
            if (h4 != null) {
                h4.d(this.f3860l);
            }
        }
        for (int i6 = 0; i6 < this.f3850b; i6++) {
            this.f3854f[i6] = -1;
            this.f3853e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f3851c; i7++) {
            this.f3852d[i7] = -1;
        }
        this.f3858j = 0;
        this.f3859k = -1;
    }

    public float d(SolverVariable solverVariable) {
        int p4 = p(solverVariable);
        if (p4 != -1) {
            return this.f3855g[p4];
        }
        return 0.0f;
    }

    public boolean e(SolverVariable solverVariable) {
        if (p(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    public float f(b bVar, boolean z3) {
        float d4 = d(bVar.f3800a);
        b(bVar.f3800a, z3);
        h hVar = (h) bVar.f3804e;
        int c4 = hVar.c();
        int i4 = 0;
        int i5 = 0;
        while (i4 < c4) {
            int i6 = hVar.f3854f[i5];
            if (i6 != -1) {
                i(this.f3861m.f3809d[i6], hVar.f3855g[i5] * d4, z3);
                i4++;
            }
            i5++;
        }
        return d4;
    }

    public void g(SolverVariable solverVariable, float f4) {
        float f5 = f3848n;
        if (f4 <= (-f5) || f4 >= f5) {
            if (this.f3858j == 0) {
                m(0, solverVariable, f4);
                l(solverVariable, 0);
                this.f3859k = 0;
                return;
            }
            int p4 = p(solverVariable);
            if (p4 != -1) {
                this.f3855g[p4] = f4;
                return;
            }
            if (this.f3858j + 1 >= this.f3850b) {
                o();
            }
            int i4 = this.f3858j;
            int i5 = this.f3859k;
            int i6 = -1;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = this.f3854f[i5];
                int i9 = solverVariable.f3772c;
                if (i8 == i9) {
                    this.f3855g[i5] = f4;
                    return;
                }
                if (i8 < i9) {
                    i6 = i5;
                }
                i5 = this.f3857i[i5];
                if (i5 == -1) {
                    break;
                }
            }
            q(i6, solverVariable, f4);
            return;
        }
        b(solverVariable, true);
    }

    public SolverVariable h(int i4) {
        int i5 = this.f3858j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f3859k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f3861m.f3809d[this.f3854f[i6]];
            }
            i6 = this.f3857i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    public void i(SolverVariable solverVariable, float f4, boolean z3) {
        float f5 = f3848n;
        if (f4 <= (-f5) || f4 >= f5) {
            int p4 = p(solverVariable);
            if (p4 == -1) {
                g(solverVariable, f4);
                return;
            }
            float[] fArr = this.f3855g;
            float f6 = fArr[p4] + f4;
            fArr[p4] = f6;
            float f7 = f3848n;
            if (f6 > (-f7) && f6 < f7) {
                fArr[p4] = 0.0f;
                b(solverVariable, z3);
            }
        }
    }

    public void j(float f4) {
        int i4 = this.f3858j;
        int i5 = this.f3859k;
        int i6 = 0;
        while (i6 < i4) {
            float[] fArr = this.f3855g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f3857i[i5];
            if (i5 != -1) {
                i6++;
            } else {
                return;
            }
        }
    }

    public void k() {
        int i4 = this.f3858j;
        int i5 = this.f3859k;
        int i6 = 0;
        while (i6 < i4) {
            float[] fArr = this.f3855g;
            fArr[i5] = fArr[i5] * -1.0f;
            i5 = this.f3857i[i5];
            if (i5 != -1) {
                i6++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(androidx.constraintlayout.core.SolverVariable r4) {
        /*
            r3 = this;
            int r0 = r3.f3858j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f3772c
            int r0 = r3.f3851c
            int r0 = r4 % r0
            int[] r2 = r3.f3852d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f3854f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f3853e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f3854f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f3854f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.h.p(androidx.constraintlayout.core.SolverVariable):int");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i4 = this.f3858j;
        for (int i5 = 0; i5 < i4; i5++) {
            SolverVariable h4 = h(i5);
            if (h4 != null) {
                String str4 = str3 + h4 + " = " + a(i5) + " ";
                int p4 = p(h4);
                String str5 = str4 + "[p: ";
                if (this.f3856h[p4] != -1) {
                    str = str5 + this.f3861m.f3809d[this.f3854f[this.f3856h[p4]]];
                } else {
                    str = str5 + PluginMethod.RETURN_NONE;
                }
                String str6 = str + ", n: ";
                if (this.f3857i[p4] != -1) {
                    str2 = str6 + this.f3861m.f3809d[this.f3854f[this.f3857i[p4]]];
                } else {
                    str2 = str6 + PluginMethod.RETURN_NONE;
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
