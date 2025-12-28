package androidx.constraintlayout.core.widgets;

import C.c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class d extends c {

    /* renamed from: M0  reason: collision with root package name */
    b f4075M0 = new b(this);

    /* renamed from: N0  reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f4076N0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);

    /* renamed from: O0  reason: collision with root package name */
    private int f4077O0;

    /* renamed from: P0  reason: collision with root package name */
    protected b.C0061b f4078P0 = null;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f4079Q0 = false;

    /* renamed from: R0  reason: collision with root package name */
    protected androidx.constraintlayout.core.d f4080R0 = new androidx.constraintlayout.core.d();

    /* renamed from: S0  reason: collision with root package name */
    int f4081S0;

    /* renamed from: T0  reason: collision with root package name */
    int f4082T0;

    /* renamed from: U0  reason: collision with root package name */
    int f4083U0;

    /* renamed from: V0  reason: collision with root package name */
    int f4084V0;

    /* renamed from: W0  reason: collision with root package name */
    public int f4085W0 = 0;

    /* renamed from: X0  reason: collision with root package name */
    public int f4086X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    c[] f4087Y0 = new c[4];

    /* renamed from: Z0  reason: collision with root package name */
    c[] f4088Z0 = new c[4];

    /* renamed from: a1  reason: collision with root package name */
    public boolean f4089a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f4090b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f4091c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public int f4092d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public int f4093e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private int f4094f1 = 257;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f4095g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    private boolean f4096h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    private boolean f4097i1 = false;

    /* renamed from: j1  reason: collision with root package name */
    int f4098j1 = 0;

    /* renamed from: k1  reason: collision with root package name */
    private WeakReference f4099k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    private WeakReference f4100l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    private WeakReference f4101m1 = null;

    /* renamed from: n1  reason: collision with root package name */
    private WeakReference f4102n1 = null;

    /* renamed from: o1  reason: collision with root package name */
    HashSet f4103o1 = new HashSet();

    /* renamed from: p1  reason: collision with root package name */
    public b.a f4104p1 = new b.a();

    private void A1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f4080R0.h(solverVariable, this.f4080R0.q(constraintAnchor), 0, 5);
    }

    private void B1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f4080R0.h(this.f4080R0.q(constraintAnchor), solverVariable, 0, 5);
    }

    private void C1(ConstraintWidget constraintWidget) {
        int i4 = this.f4086X0 + 1;
        c[] cVarArr = this.f4087Y0;
        if (i4 >= cVarArr.length) {
            this.f4087Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4087Y0[this.f4086X0] = new c(constraintWidget, 1, P1());
        this.f4086X0++;
    }

    public static boolean S1(int i4, ConstraintWidget constraintWidget, b.C0061b bVar, b.a aVar, int i5) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.V() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f4004e = 0;
            aVar.f4005f = 0;
            return false;
        }
        aVar.f4000a = constraintWidget.A();
        aVar.f4001b = constraintWidget.T();
        aVar.f4002c = constraintWidget.W();
        aVar.f4003d = constraintWidget.x();
        aVar.f4008i = false;
        aVar.f4009j = i5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f4000a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aVar.f4001b == dimensionBehaviour2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || constraintWidget.f3917d0 <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 || constraintWidget.f3917d0 <= 0.0f) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3 && constraintWidget.a0(0) && constraintWidget.f3954w == 0 && !z5) {
            aVar.f4000a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z4 && constraintWidget.f3956x == 0) {
                aVar.f4000a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z3 = false;
        }
        if (z4 && constraintWidget.a0(1) && constraintWidget.f3956x == 0 && !z6) {
            aVar.f4001b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z3 && constraintWidget.f3954w == 0) {
                aVar.f4001b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z4 = false;
        }
        if (constraintWidget.n0()) {
            aVar.f4000a = ConstraintWidget.DimensionBehaviour.FIXED;
            z3 = false;
        }
        if (constraintWidget.o0()) {
            aVar.f4001b = ConstraintWidget.DimensionBehaviour.FIXED;
            z4 = false;
        }
        if (z5) {
            if (constraintWidget.f3958y[0] == 4) {
                aVar.f4000a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z4) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f4001b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i7 = aVar.f4003d;
                } else {
                    aVar.f4000a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.b(constraintWidget, aVar);
                    i7 = aVar.f4005f;
                }
                aVar.f4000a = dimensionBehaviour4;
                aVar.f4002c = (int) (constraintWidget.v() * ((float) i7));
            }
        }
        if (z6) {
            if (constraintWidget.f3958y[1] == 4) {
                aVar.f4001b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z3) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f4000a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i6 = aVar.f4002c;
                } else {
                    aVar.f4001b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.b(constraintWidget, aVar);
                    i6 = aVar.f4004e;
                }
                aVar.f4001b = dimensionBehaviour6;
                if (constraintWidget.w() == -1) {
                    aVar.f4003d = (int) (((float) i6) / constraintWidget.v());
                } else {
                    aVar.f4003d = (int) (constraintWidget.v() * ((float) i6));
                }
            }
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.k1(aVar.f4004e);
        constraintWidget.L0(aVar.f4005f);
        constraintWidget.K0(aVar.f4007h);
        constraintWidget.A0(aVar.f4006g);
        aVar.f4009j = b.a.f3997k;
        return aVar.f4008i;
    }

    private void U1() {
        this.f4085W0 = 0;
        this.f4086X0 = 0;
    }

    private void x1(ConstraintWidget constraintWidget) {
        int i4 = this.f4085W0 + 1;
        c[] cVarArr = this.f4088Z0;
        if (i4 >= cVarArr.length) {
            this.f4088Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f4088Z0[this.f4085W0] = new c(constraintWidget, 0, P1());
        this.f4085W0++;
    }

    /* access modifiers changed from: package-private */
    public void D1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f4101m1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f4101m1.get()).e()) {
            this.f4101m1 = new WeakReference(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    public void E1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f4099k1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f4099k1.get()).e()) {
            this.f4099k1 = new WeakReference(constraintAnchor);
        }
    }

    public boolean F1(boolean z3) {
        return this.f4076N0.f(z3);
    }

    public boolean G1(boolean z3) {
        return this.f4076N0.g(z3);
    }

    public boolean H1(boolean z3, int i4) {
        return this.f4076N0.h(z3, i4);
    }

    public b.C0061b I1() {
        return this.f4078P0;
    }

    public int J1() {
        return this.f4094f1;
    }

    public androidx.constraintlayout.core.d K1() {
        return this.f4080R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.f4076N0.j();
    }

    public void N1() {
        this.f4076N0.k();
    }

    public void O(StringBuilder sb) {
        sb.append(this.f3938o + ":{\n");
        sb.append("  actualWidth:" + this.f3913b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f3915c0);
        sb.append("\n");
        Iterator it = r1().iterator();
        while (it.hasNext()) {
            ((ConstraintWidget) it.next()).O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean O1() {
        return this.f4097i1;
    }

    public boolean P1() {
        return this.f4079Q0;
    }

    public boolean Q1() {
        return this.f4096h1;
    }

    public long R1(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13 = i11;
        this.f4081S0 = i13;
        int i14 = i12;
        this.f4082T0 = i14;
        return this.f4075M0.d(this, i4, i13, i14, i5, i6, i7, i8, i9, i10);
    }

    public boolean T1(int i4) {
        if ((this.f4094f1 & i4) == i4) {
            return true;
        }
        return false;
    }

    public void V1(b.C0061b bVar) {
        this.f4078P0 = bVar;
        this.f4076N0.n(bVar);
    }

    public void W1(int i4) {
        this.f4094f1 = i4;
        androidx.constraintlayout.core.d.f3810r = T1(512);
    }

    public void X1(int i4) {
        this.f4077O0 = i4;
    }

    public void Y1(boolean z3) {
        this.f4079Q0 = z3;
    }

    public boolean Z1(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean T12 = T1(64);
        q1(dVar, T12);
        int size = this.f219L0.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f219L0.get(i4);
            constraintWidget.q1(dVar, T12);
            if (constraintWidget.c0()) {
                z3 = true;
            }
        }
        return z3;
    }

    public void a2() {
        this.f4075M0.e(this);
    }

    public void p1(boolean z3, boolean z4) {
        super.p1(z3, z4);
        int size = this.f219L0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ConstraintWidget) this.f219L0.get(i4)).p1(z3, z4);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0310  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f3921f0 = r2
            r1.f3923g0 = r2
            r1.f4096h1 = r2
            r1.f4097i1 = r2
            java.util.ArrayList r0 = r1.f219L0
            int r3 = r0.size()
            int r0 = r18.W()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.x()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f3909Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f4077O0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f4094f1
            boolean r8 = androidx.constraintlayout.core.widgets.g.b(r8, r6)
            if (r8 == 0) goto L_0x0084
            androidx.constraintlayout.core.widgets.analyzer.b$b r8 = r18.I1()
            androidx.constraintlayout.core.widgets.analyzer.f.h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList r9 = r1.f219L0
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.m0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.f
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.h
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.l0()
            if (r10 != 0) goto L_0x0081
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.u(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.u(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0075
            int r10 = r9.f3954w
            if (r10 == r6) goto L_0x0075
            if (r11 != r12) goto L_0x0075
            int r10 = r9.f3956x
            if (r10 == r6) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            androidx.constraintlayout.core.widgets.analyzer.b$a r10 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r10.<init>()
            androidx.constraintlayout.core.widgets.analyzer.b$b r11 = r1.f4078P0
            int r12 = androidx.constraintlayout.core.widgets.analyzer.b.a.f3997k
            S1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f4094f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = androidx.constraintlayout.core.widgets.g.b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            androidx.constraintlayout.core.widgets.analyzer.b$b r10 = r18.I1()
            boolean r10 = androidx.constraintlayout.core.widgets.analyzer.g.c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.W()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.k1(r0)
            r1.f4096h1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.W()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.x()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.L0(r4)
            r1.f4097i1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.x()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.T1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.T1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            androidx.constraintlayout.core.d r12 = r1.f4080R0
            r12.f3825h = r2
            r12.f3826i = r2
            int r13 = r1.f4094f1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f3826i = r6
        L_0x00f2:
            java.util.ArrayList r11 = r1.f219L0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.A()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.T()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = r2
            goto L_0x0106
        L_0x0105:
            r12 = r6
        L_0x0106:
            r18.U1()
            r13 = r2
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList r14 = r1.f219L0
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof C.c
            if (r15 == 0) goto L_0x011d
            C.c r14 = (C.c) r14
            r14.s1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.T1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x0317
            int r15 = r0 + 1
            androidx.constraintlayout.core.d r0 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            r0.D()     // Catch:{ Exception -> 0x014d }
            r18.U1()     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r0 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            r1.m(r0)     // Catch:{ Exception -> 0x014d }
            r0 = r2
        L_0x0139:
            if (r0 >= r3) goto L_0x0150
            java.util.ArrayList r6 = r1.f219L0     // Catch:{ Exception -> 0x014d }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r2 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            r6.m(r2)     // Catch:{ Exception -> 0x014d }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            r0 = move-exception
            goto L_0x01db
        L_0x0150:
            androidx.constraintlayout.core.d r0 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            boolean r14 = r1.w1(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.ref.WeakReference r0 = r1.f4099k1     // Catch:{ Exception -> 0x014d }
            r2 = 0
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0176
            java.lang.ref.WeakReference r0 = r1.f4099k1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r6 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f3899P     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f4099k1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0176:
            java.lang.ref.WeakReference r0 = r1.f4101m1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.ref.WeakReference r0 = r1.f4101m1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r6 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f3901R     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f4101m1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0195:
            java.lang.ref.WeakReference r0 = r1.f4100l1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r1.f4100l1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r6 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f3898O     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f4100l1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01b4:
            java.lang.ref.WeakReference r0 = r1.f4102n1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.ref.WeakReference r0 = r1.f4102n1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.d r6 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f3900Q     // Catch:{ Exception -> 0x014d }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f4102n1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01d3:
            if (r14 == 0) goto L_0x01f4
            androidx.constraintlayout.core.d r0 = r1.f4080R0     // Catch:{ Exception -> 0x014d }
            r0.z()     // Catch:{ Exception -> 0x014d }
            goto L_0x01f4
        L_0x01db:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f4:
            if (r14 == 0) goto L_0x01ff
            androidx.constraintlayout.core.d r0 = r1.f4080R0
            boolean[] r2 = androidx.constraintlayout.core.widgets.g.f4157a
            boolean r0 = r1.Z1(r0, r2)
            goto L_0x0218
        L_0x01ff:
            androidx.constraintlayout.core.d r0 = r1.f4080R0
            r1.q1(r0, r10)
            r0 = 0
        L_0x0205:
            if (r0 >= r3) goto L_0x0217
            java.util.ArrayList r2 = r1.f219L0
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.d r6 = r1.f4080R0
            r2.q1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0205
        L_0x0217:
            r0 = 0
        L_0x0218:
            r2 = 8
            if (r12 == 0) goto L_0x0289
            if (r15 >= r2) goto L_0x0289
            boolean[] r6 = androidx.constraintlayout.core.widgets.g.f4157a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0289
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0228:
            if (r6 >= r3) goto L_0x0252
            java.util.ArrayList r2 = r1.f219L0
            java.lang.Object r2 = r2.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r16 = r0
            int r0 = r2.f3921f0
            int r17 = r2.W()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f3923g0
            int r2 = r2.x()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0228
        L_0x0252:
            r16 = r0
            int r0 = r1.f3935m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f3937n0
            int r2 = java.lang.Math.max(r2, r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r6) goto L_0x0275
            int r8 = r18.W()
            if (r8 >= r0) goto L_0x0275
            r1.k1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0275:
            if (r7 != r6) goto L_0x028b
            int r0 = r18.x()
            if (r0 >= r2) goto L_0x028b
            r1.L0(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028b
        L_0x0289:
            r16 = r0
        L_0x028b:
            int r0 = r1.f3935m0
            int r2 = r18.W()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.W()
            if (r0 <= r2) goto L_0x02a8
            r1.k1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a8:
            int r0 = r1.f3937n0
            int r2 = r18.x()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.x()
            if (r0 <= r2) goto L_0x02c6
            r1.L0(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c8
        L_0x02c6:
            r6 = 1
            r2 = r13
        L_0x02c8:
            if (r2 != 0) goto L_0x0307
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e9
            if (r4 <= 0) goto L_0x02e9
            int r0 = r18.W()
            if (r0 <= r4) goto L_0x02e9
            r1.f4096h1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.k1(r4)
            r2 = r6
            r16 = r2
        L_0x02e9:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0307
            if (r9 <= 0) goto L_0x0307
            int r0 = r18.x()
            if (r0 <= r9) goto L_0x0307
            r1.f4097i1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r2
            r1.L0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030c
        L_0x0307:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030c:
            if (r15 <= r0) goto L_0x0310
            r14 = 0
            goto L_0x0311
        L_0x0310:
            r14 = r2
        L_0x0311:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0317:
            r1.f219L0 = r11
            if (r13 == 0) goto L_0x0323
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f3909Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0323:
            androidx.constraintlayout.core.d r0 = r1.f4080R0
            androidx.constraintlayout.core.c r0 = r0.v()
            r1.w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.s1():void");
    }

    public void t0() {
        this.f4080R0.D();
        this.f4081S0 = 0;
        this.f4083U0 = 0;
        this.f4082T0 = 0;
        this.f4084V0 = 0;
        this.f4095g1 = false;
        super.t0();
    }

    /* access modifiers changed from: package-private */
    public void v1(ConstraintWidget constraintWidget, int i4) {
        if (i4 == 0) {
            x1(constraintWidget);
        } else if (i4 == 1) {
            C1(constraintWidget);
        }
    }

    public boolean w1(androidx.constraintlayout.core.d dVar) {
        int i4;
        boolean T12 = T1(64);
        g(dVar, T12);
        int size = this.f219L0.size();
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.f219L0.get(i5);
            constraintWidget.S0(0, false);
            constraintWidget.S0(1, false);
            if (constraintWidget instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.f219L0.get(i6);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).y1();
                }
            }
        }
        this.f4103o1.clear();
        for (int i7 = 0; i7 < size; i7++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.f219L0.get(i7);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof h) {
                    this.f4103o1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(dVar, T12);
                }
            }
        }
        while (this.f4103o1.size() > 0) {
            int size2 = this.f4103o1.size();
            Iterator it = this.f4103o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h hVar = (h) ((ConstraintWidget) it.next());
                if (hVar.v1(this.f4103o1)) {
                    hVar.g(dVar, T12);
                    this.f4103o1.remove(hVar);
                    break;
                }
            }
            if (size2 == this.f4103o1.size()) {
                Iterator it2 = this.f4103o1.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).g(dVar, T12);
                }
                this.f4103o1.clear();
            }
        }
        if (androidx.constraintlayout.core.d.f3810r) {
            HashSet hashSet = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.f219L0.get(i8);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            if (A() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            e(this, dVar, hashSet, i4, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it3.next();
                g.a(this, dVar, constraintWidget5);
                constraintWidget5.g(dVar, T12);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) this.f219L0.get(i9);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f3909Z;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(dVar, T12);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.P0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.g1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(dVar, T12);
                    }
                }
            }
        }
        if (this.f4085W0 > 0) {
            b.b(this, dVar, (ArrayList) null, 0);
        }
        if (this.f4086X0 > 0) {
            b.b(this, dVar, (ArrayList) null, 1);
        }
        return true;
    }

    public void y1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f4102n1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f4102n1.get()).e()) {
            this.f4102n1 = new WeakReference(constraintAnchor);
        }
    }

    public void z1(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f4100l1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f4100l1.get()).e()) {
            this.f4100l1 = new WeakReference(constraintAnchor);
        }
    }
}
