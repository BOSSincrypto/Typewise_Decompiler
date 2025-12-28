package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;
import z.C0966a;

public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f3810r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f3811s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f3812t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f3813u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f3814v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f3815w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static long f3816x;

    /* renamed from: y  reason: collision with root package name */
    public static long f3817y;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3818a;

    /* renamed from: b  reason: collision with root package name */
    int f3819b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f3820c;

    /* renamed from: d  reason: collision with root package name */
    private a f3821d;

    /* renamed from: e  reason: collision with root package name */
    private int f3822e;

    /* renamed from: f  reason: collision with root package name */
    private int f3823f;

    /* renamed from: g  reason: collision with root package name */
    b[] f3824g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3825h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3826i;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f3827j;

    /* renamed from: k  reason: collision with root package name */
    int f3828k;

    /* renamed from: l  reason: collision with root package name */
    int f3829l;

    /* renamed from: m  reason: collision with root package name */
    private int f3830m;

    /* renamed from: n  reason: collision with root package name */
    final c f3831n;

    /* renamed from: o  reason: collision with root package name */
    private SolverVariable[] f3832o;

    /* renamed from: p  reason: collision with root package name */
    private int f3833p;

    /* renamed from: q  reason: collision with root package name */
    private a f3834q;

    interface a {
        SolverVariable a(d dVar, boolean[] zArr);

        void b(SolverVariable solverVariable);

        void c(a aVar);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    class b extends b {
        public b(c cVar) {
            this.f3804e = new h(this, cVar);
        }
    }

    public d() {
        this.f3818a = false;
        this.f3819b = 0;
        this.f3820c = null;
        this.f3822e = 32;
        this.f3823f = 32;
        this.f3824g = null;
        this.f3825h = false;
        this.f3826i = false;
        this.f3827j = new boolean[32];
        this.f3828k = 1;
        this.f3829l = 0;
        this.f3830m = 32;
        this.f3832o = new SolverVariable[f3815w];
        this.f3833p = 0;
        this.f3824g = new b[32];
        C();
        c cVar = new c();
        this.f3831n = cVar;
        this.f3821d = new g(cVar);
        if (f3814v) {
            this.f3834q = new b(cVar);
        } else {
            this.f3834q = new b(cVar);
        }
    }

    private final int B(a aVar, boolean z3) {
        for (int i4 = 0; i4 < this.f3828k; i4++) {
            this.f3827j[i4] = false;
        }
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            i5++;
            if (i5 >= this.f3828k * 2) {
                return i5;
            }
            if (aVar.getKey() != null) {
                this.f3827j[aVar.getKey().f3772c] = true;
            }
            SolverVariable a4 = aVar.a(this, this.f3827j);
            if (a4 != null) {
                boolean[] zArr = this.f3827j;
                int i6 = a4.f3772c;
                if (zArr[i6]) {
                    return i5;
                }
                zArr[i6] = true;
            }
            if (a4 != null) {
                float f4 = Float.MAX_VALUE;
                int i7 = -1;
                for (int i8 = 0; i8 < this.f3829l; i8++) {
                    b bVar = this.f3824g[i8];
                    if (bVar.f3800a.f3779j != SolverVariable.Type.UNRESTRICTED && !bVar.f3805f && bVar.t(a4)) {
                        float d4 = bVar.f3804e.d(a4);
                        if (d4 < 0.0f) {
                            float f5 = (-bVar.f3801b) / d4;
                            if (f5 < f4) {
                                i7 = i8;
                                f4 = f5;
                            }
                        }
                    }
                }
                if (i7 > -1) {
                    b bVar2 = this.f3824g[i7];
                    bVar2.f3800a.f3773d = -1;
                    bVar2.x(a4);
                    SolverVariable solverVariable = bVar2.f3800a;
                    solverVariable.f3773d = i7;
                    solverVariable.h(this, bVar2);
                }
            } else {
                z4 = true;
            }
        }
        return i5;
    }

    private void C() {
        int i4 = 0;
        if (f3814v) {
            while (i4 < this.f3829l) {
                b bVar = this.f3824g[i4];
                if (bVar != null) {
                    this.f3831n.f3806a.a(bVar);
                }
                this.f3824g[i4] = null;
                i4++;
            }
            return;
        }
        while (i4 < this.f3829l) {
            b bVar2 = this.f3824g[i4];
            if (bVar2 != null) {
                this.f3831n.f3807b.a(bVar2);
            }
            this.f3824g[i4] = null;
            i4++;
        }
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f3831n.f3808c.b();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.g(type, str);
        } else {
            solverVariable.e();
            solverVariable.g(type, str);
        }
        int i4 = this.f3833p;
        int i5 = f3815w;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f3815w = i6;
            this.f3832o = (SolverVariable[]) Arrays.copyOf(this.f3832o, i6);
        }
        SolverVariable[] solverVariableArr = this.f3832o;
        int i7 = this.f3833p;
        this.f3833p = i7 + 1;
        solverVariableArr[i7] = solverVariable;
        return solverVariable;
    }

    private final void l(b bVar) {
        int i4;
        if (!f3812t || !bVar.f3805f) {
            b[] bVarArr = this.f3824g;
            int i5 = this.f3829l;
            bVarArr[i5] = bVar;
            SolverVariable solverVariable = bVar.f3800a;
            solverVariable.f3773d = i5;
            this.f3829l = i5 + 1;
            solverVariable.h(this, bVar);
        } else {
            bVar.f3800a.f(this, bVar.f3801b);
        }
        if (f3812t && this.f3818a) {
            int i6 = 0;
            while (i6 < this.f3829l) {
                if (this.f3824g[i6] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f3824g[i6];
                if (bVar2 != null && bVar2.f3805f) {
                    bVar2.f3800a.f(this, bVar2.f3801b);
                    if (f3814v) {
                        this.f3831n.f3806a.a(bVar2);
                    } else {
                        this.f3831n.f3807b.a(bVar2);
                    }
                    this.f3824g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i4 = this.f3829l;
                        if (i7 >= i4) {
                            break;
                        }
                        b[] bVarArr2 = this.f3824g;
                        int i9 = i7 - 1;
                        b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f3800a;
                        if (solverVariable2.f3773d == i7) {
                            solverVariable2.f3773d = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i4) {
                        this.f3824g[i8] = null;
                    }
                    this.f3829l = i4 - 1;
                    i6--;
                }
                i6++;
            }
            this.f3818a = false;
        }
    }

    private void n() {
        for (int i4 = 0; i4 < this.f3829l; i4++) {
            b bVar = this.f3824g[i4];
            bVar.f3800a.f3775f = bVar.f3801b;
        }
    }

    public static b s(d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f4) {
        return dVar.r().j(solverVariable, solverVariable2, f4);
    }

    private int u(a aVar) {
        for (int i4 = 0; i4 < this.f3829l; i4++) {
            b bVar = this.f3824g[i4];
            if (bVar.f3800a.f3779j != SolverVariable.Type.UNRESTRICTED && bVar.f3801b < 0.0f) {
                boolean z3 = false;
                int i5 = 0;
                while (!z3) {
                    i5++;
                    float f4 = Float.MAX_VALUE;
                    int i6 = 0;
                    int i7 = -1;
                    int i8 = -1;
                    int i9 = 0;
                    while (true) {
                        if (i6 >= this.f3829l) {
                            break;
                        }
                        b bVar2 = this.f3824g[i6];
                        if (bVar2.f3800a.f3779j != SolverVariable.Type.UNRESTRICTED && !bVar2.f3805f && bVar2.f3801b < 0.0f) {
                            int i10 = 9;
                            if (f3813u) {
                                int c4 = bVar2.f3804e.c();
                                int i11 = 0;
                                while (i11 < c4) {
                                    SolverVariable h4 = bVar2.f3804e.h(i11);
                                    float d4 = bVar2.f3804e.d(h4);
                                    if (d4 > 0.0f) {
                                        int i12 = 0;
                                        while (i12 < i10) {
                                            float f5 = h4.f3777h[i12] / d4;
                                            if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                                i9 = i12;
                                                i8 = h4.f3772c;
                                                i7 = i6;
                                                f4 = f5;
                                            }
                                            i12++;
                                            i10 = 9;
                                        }
                                    }
                                    i11++;
                                    i10 = 9;
                                }
                            } else {
                                for (int i13 = 1; i13 < this.f3828k; i13++) {
                                    SolverVariable solverVariable = this.f3831n.f3809d[i13];
                                    float d5 = bVar2.f3804e.d(solverVariable);
                                    if (d5 > 0.0f) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f6 = solverVariable.f3777h[i14] / d5;
                                            if ((f6 < f4 && i14 == i9) || i14 > i9) {
                                                i7 = i6;
                                                i8 = i13;
                                                i9 = i14;
                                                f4 = f6;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6++;
                    }
                    if (i7 != -1) {
                        b bVar3 = this.f3824g[i7];
                        bVar3.f3800a.f3773d = -1;
                        bVar3.x(this.f3831n.f3809d[i8]);
                        SolverVariable solverVariable2 = bVar3.f3800a;
                        solverVariable2.f3773d = i7;
                        solverVariable2.h(this, bVar3);
                    } else {
                        z3 = true;
                    }
                    if (i5 > this.f3828k / 2) {
                        z3 = true;
                    }
                }
                return i5;
            }
        }
        return 0;
    }

    public static C0966a w() {
        return null;
    }

    private void y() {
        int i4 = this.f3822e * 2;
        this.f3822e = i4;
        this.f3824g = (b[]) Arrays.copyOf(this.f3824g, i4);
        c cVar = this.f3831n;
        cVar.f3809d = (SolverVariable[]) Arrays.copyOf(cVar.f3809d, this.f3822e);
        int i5 = this.f3822e;
        this.f3827j = new boolean[i5];
        this.f3823f = i5;
        this.f3830m = i5;
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i4 = 0;
        while (true) {
            cVar = this.f3831n;
            SolverVariable[] solverVariableArr = cVar.f3809d;
            if (i4 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i4];
            if (solverVariable != null) {
                solverVariable.e();
            }
            i4++;
        }
        cVar.f3808c.c(this.f3832o, this.f3833p);
        this.f3833p = 0;
        Arrays.fill(this.f3831n.f3809d, (Object) null);
        HashMap hashMap = this.f3820c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f3819b = 0;
        this.f3821d.clear();
        this.f3828k = 1;
        for (int i5 = 0; i5 < this.f3829l; i5++) {
            b bVar = this.f3824g[i5];
            if (bVar != null) {
                bVar.f3802c = false;
            }
        }
        C();
        this.f3829l = 0;
        if (f3814v) {
            this.f3834q = new b(this.f3831n);
        } else {
            this.f3834q = new b(this.f3831n);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f4, int i4) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable q4 = q(constraintWidget3.o(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable q5 = q(constraintWidget3.o(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable q6 = q(constraintWidget3.o(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable q7 = q(constraintWidget3.o(type4));
        SolverVariable q8 = q(constraintWidget4.o(type));
        SolverVariable q9 = q(constraintWidget4.o(type2));
        SolverVariable q10 = q(constraintWidget4.o(type3));
        SolverVariable q11 = q(constraintWidget4.o(type4));
        b r4 = r();
        double d4 = (double) f4;
        SolverVariable solverVariable = q10;
        double d5 = (double) i4;
        r4.q(q5, q7, q9, q11, (float) (Math.sin(d4) * d5));
        d(r4);
        b r5 = r();
        r5.q(q4, q6, q8, solverVariable, (float) (Math.cos(d4) * d5));
        d(r5);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, float f4, SolverVariable solverVariable3, SolverVariable solverVariable4, int i5, int i6) {
        int i7 = i6;
        b r4 = r();
        r4.h(solverVariable, solverVariable2, i4, f4, solverVariable3, solverVariable4, i5);
        if (i7 != 8) {
            r4.d(this, i7);
        }
        d(r4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(androidx.constraintlayout.core.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f3829l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f3830m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f3828k
            int r0 = r0 + r1
            int r2 = r5.f3823f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.y()
        L_0x0015:
            boolean r0 = r6.f3805f
            r2 = 0
            if (r0 != 0) goto L_0x0084
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L_0x007b
            androidx.constraintlayout.core.SolverVariable r0 = r5.p()
            r6.f3800a = r0
            int r3 = r5.f3829l
            r5.l(r6)
            int r4 = r5.f3829l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            androidx.constraintlayout.core.d$a r2 = r5.f3834q
            r2.c(r6)
            androidx.constraintlayout.core.d$a r2 = r5.f3834q
            r5.B(r2, r1)
            int r2 = r0.f3773d
            r3 = -1
            if (r2 != r3) goto L_0x007c
            androidx.constraintlayout.core.SolverVariable r2 = r6.f3800a
            if (r2 != r0) goto L_0x0059
            androidx.constraintlayout.core.SolverVariable r0 = r6.v(r0)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f3805f
            if (r0 != 0) goto L_0x0062
            androidx.constraintlayout.core.SolverVariable r0 = r6.f3800a
            r0.h(r5, r6)
        L_0x0062:
            boolean r0 = f3814v
            if (r0 == 0) goto L_0x006e
            androidx.constraintlayout.core.c r0 = r5.f3831n
            androidx.constraintlayout.core.e r0 = r0.f3806a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            androidx.constraintlayout.core.c r0 = r5.f3831n
            androidx.constraintlayout.core.e r0 = r0.f3807b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f3829l
            int r0 = r0 - r1
            r5.f3829l = r0
            goto L_0x007c
        L_0x007b:
            r1 = r2
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r2 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.d(androidx.constraintlayout.core.b):void");
    }

    public b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        if (!f3811s || i5 != 8 || !solverVariable2.f3776g || solverVariable.f3773d != -1) {
            b r4 = r();
            r4.n(solverVariable, solverVariable2, i4);
            if (i5 != 8) {
                r4.d(this, i5);
            }
            d(r4);
            return r4;
        }
        solverVariable.f(this, solverVariable2.f3775f + ((float) i4));
        return null;
    }

    public void f(SolverVariable solverVariable, int i4) {
        if (!f3811s || solverVariable.f3773d != -1) {
            int i5 = solverVariable.f3773d;
            if (i5 != -1) {
                b bVar = this.f3824g[i5];
                if (bVar.f3805f) {
                    bVar.f3801b = (float) i4;
                } else if (bVar.f3804e.c() == 0) {
                    bVar.f3805f = true;
                    bVar.f3801b = (float) i4;
                } else {
                    b r4 = r();
                    r4.m(solverVariable, i4);
                    d(r4);
                }
            } else {
                b r5 = r();
                r5.i(solverVariable, i4);
                d(r5);
            }
        } else {
            float f4 = (float) i4;
            solverVariable.f(this, f4);
            for (int i6 = 0; i6 < this.f3819b + 1; i6++) {
                SolverVariable solverVariable2 = this.f3831n.f3809d[i6];
                if (solverVariable2 != null && solverVariable2.f3783n && solverVariable2.f3784o == solverVariable.f3772c) {
                    solverVariable2.f(this, solverVariable2.f3785p + f4);
                }
            }
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, boolean z3) {
        b r4 = r();
        SolverVariable t4 = t();
        t4.f3774e = 0;
        r4.o(solverVariable, solverVariable2, t4, i4);
        d(r4);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        b r4 = r();
        SolverVariable t4 = t();
        t4.f3774e = 0;
        r4.o(solverVariable, solverVariable2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f3804e.d(t4) * -1.0f), i5);
        }
        d(r4);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, boolean z3) {
        b r4 = r();
        SolverVariable t4 = t();
        t4.f3774e = 0;
        r4.p(solverVariable, solverVariable2, t4, i4);
        d(r4);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i4, int i5) {
        b r4 = r();
        SolverVariable t4 = t();
        t4.f3774e = 0;
        r4.p(solverVariable, solverVariable2, t4, i4);
        if (i5 != 8) {
            m(r4, (int) (r4.f3804e.d(t4) * -1.0f), i5);
        }
        d(r4);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f4, int i4) {
        b r4 = r();
        r4.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f4);
        if (i4 != 8) {
            r4.d(this, i4);
        }
        d(r4);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i4, int i5) {
        bVar.e(o(i5, (String) null), i4);
    }

    public SolverVariable o(int i4, String str) {
        if (this.f3828k + 1 >= this.f3823f) {
            y();
        }
        SolverVariable a4 = a(SolverVariable.Type.ERROR, str);
        int i5 = this.f3819b + 1;
        this.f3819b = i5;
        this.f3828k++;
        a4.f3772c = i5;
        a4.f3774e = i4;
        this.f3831n.f3809d[i5] = a4;
        this.f3821d.b(a4);
        return a4;
    }

    public SolverVariable p() {
        if (this.f3828k + 1 >= this.f3823f) {
            y();
        }
        SolverVariable a4 = a(SolverVariable.Type.SLACK, (String) null);
        int i4 = this.f3819b + 1;
        this.f3819b = i4;
        this.f3828k++;
        a4.f3772c = i4;
        this.f3831n.f3809d[i4] = a4;
        return a4;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f3828k + 1 >= this.f3823f) {
            y();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.i();
            if (solverVariable == null) {
                constraintAnchor.s(this.f3831n);
                solverVariable = constraintAnchor.i();
            }
            int i4 = solverVariable.f3772c;
            if (i4 == -1 || i4 > this.f3819b || this.f3831n.f3809d[i4] == null) {
                if (i4 != -1) {
                    solverVariable.e();
                }
                int i5 = this.f3819b + 1;
                this.f3819b = i5;
                this.f3828k++;
                solverVariable.f3772c = i5;
                solverVariable.f3779j = SolverVariable.Type.UNRESTRICTED;
                this.f3831n.f3809d[i5] = solverVariable;
            }
        }
        return solverVariable;
    }

    public b r() {
        b bVar;
        if (f3814v) {
            bVar = (b) this.f3831n.f3806a.b();
            if (bVar == null) {
                bVar = new b(this.f3831n);
                f3817y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (b) this.f3831n.f3807b.b();
            if (bVar == null) {
                bVar = new b(this.f3831n);
                f3816x++;
            } else {
                bVar.y();
            }
        }
        SolverVariable.c();
        return bVar;
    }

    public SolverVariable t() {
        if (this.f3828k + 1 >= this.f3823f) {
            y();
        }
        SolverVariable a4 = a(SolverVariable.Type.SLACK, (String) null);
        int i4 = this.f3819b + 1;
        this.f3819b = i4;
        this.f3828k++;
        a4.f3772c = i4;
        this.f3831n.f3809d[i4] = a4;
        return a4;
    }

    public c v() {
        return this.f3831n;
    }

    public int x(Object obj) {
        SolverVariable i4 = ((ConstraintAnchor) obj).i();
        if (i4 != null) {
            return (int) (i4.f3775f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f3821d.isEmpty()) {
            n();
        } else if (this.f3825h || this.f3826i) {
            for (int i4 = 0; i4 < this.f3829l; i4++) {
                if (!this.f3824g[i4].f3805f) {
                    A(this.f3821d);
                    return;
                }
            }
            n();
        } else {
            A(this.f3821d);
        }
    }
}
