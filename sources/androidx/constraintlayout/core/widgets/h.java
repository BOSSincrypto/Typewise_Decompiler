package androidx.constraintlayout.core.widgets;

import C.b;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.HashSet;

public abstract class h extends b {

    /* renamed from: N0  reason: collision with root package name */
    private int f4158N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    private int f4159O0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    private int f4160P0 = 0;

    /* renamed from: Q0  reason: collision with root package name */
    private int f4161Q0 = 0;

    /* renamed from: R0  reason: collision with root package name */
    private int f4162R0 = 0;

    /* renamed from: S0  reason: collision with root package name */
    private int f4163S0 = 0;

    /* renamed from: T0  reason: collision with root package name */
    private int f4164T0 = 0;

    /* renamed from: U0  reason: collision with root package name */
    private int f4165U0 = 0;

    /* renamed from: V0  reason: collision with root package name */
    private boolean f4166V0 = false;

    /* renamed from: W0  reason: collision with root package name */
    private int f4167W0 = 0;

    /* renamed from: X0  reason: collision with root package name */
    private int f4168X0 = 0;

    /* renamed from: Y0  reason: collision with root package name */
    protected b.a f4169Y0 = new b.a();

    /* renamed from: Z0  reason: collision with root package name */
    b.C0061b f4170Z0 = null;

    public int A1() {
        return this.f4165U0;
    }

    public int B1() {
        return this.f4158N0;
    }

    public abstract void C1(int i4, int i5, int i6, int i7);

    /* access modifiers changed from: protected */
    public void D1(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i4, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i5) {
        while (this.f4170Z0 == null && K() != null) {
            this.f4170Z0 = ((d) K()).I1();
        }
        b.a aVar = this.f4169Y0;
        aVar.f4000a = dimensionBehaviour;
        aVar.f4001b = dimensionBehaviour2;
        aVar.f4002c = i4;
        aVar.f4003d = i5;
        this.f4170Z0.b(constraintWidget, aVar);
        constraintWidget.k1(this.f4169Y0.f4004e);
        constraintWidget.L0(this.f4169Y0.f4005f);
        constraintWidget.K0(this.f4169Y0.f4007h);
        constraintWidget.A0(this.f4169Y0.f4006g);
    }

    /* access modifiers changed from: protected */
    public boolean E1() {
        b.C0061b bVar;
        ConstraintWidget constraintWidget = this.f3911a0;
        if (constraintWidget != null) {
            bVar = ((d) constraintWidget).I1();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        for (int i4 = 0; i4 < this.f218M0; i4++) {
            ConstraintWidget constraintWidget2 = this.f217L0[i4];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour u3 = constraintWidget2.u(0);
                ConstraintWidget.DimensionBehaviour u4 = constraintWidget2.u(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (u3 != dimensionBehaviour || constraintWidget2.f3954w == 1 || u4 != dimensionBehaviour || constraintWidget2.f3956x == 1) {
                    if (u3 == dimensionBehaviour) {
                        u3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (u4 == dimensionBehaviour) {
                        u4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    b.a aVar = this.f4169Y0;
                    aVar.f4000a = u3;
                    aVar.f4001b = u4;
                    aVar.f4002c = constraintWidget2.W();
                    this.f4169Y0.f4003d = constraintWidget2.x();
                    bVar.b(constraintWidget2, this.f4169Y0);
                    constraintWidget2.k1(this.f4169Y0.f4004e);
                    constraintWidget2.L0(this.f4169Y0.f4005f);
                    constraintWidget2.A0(this.f4169Y0.f4006g);
                }
            }
        }
        return true;
    }

    public boolean F1() {
        return this.f4166V0;
    }

    /* access modifiers changed from: protected */
    public void G1(boolean z3) {
        this.f4166V0 = z3;
    }

    public void H1(int i4, int i5) {
        this.f4167W0 = i4;
        this.f4168X0 = i5;
    }

    public void I1(int i4) {
        this.f4160P0 = i4;
        this.f4158N0 = i4;
        this.f4161Q0 = i4;
        this.f4159O0 = i4;
        this.f4162R0 = i4;
        this.f4163S0 = i4;
    }

    public void J1(int i4) {
        this.f4159O0 = i4;
    }

    public void K1(int i4) {
        this.f4163S0 = i4;
    }

    public void L1(int i4) {
        this.f4160P0 = i4;
        this.f4164T0 = i4;
    }

    public void M1(int i4) {
        this.f4161Q0 = i4;
        this.f4165U0 = i4;
    }

    public void N1(int i4) {
        this.f4162R0 = i4;
        this.f4164T0 = i4;
        this.f4165U0 = i4;
    }

    public void O1(int i4) {
        this.f4158N0 = i4;
    }

    public void a(d dVar) {
        u1();
    }

    public void t1(boolean z3) {
        int i4 = this.f4162R0;
        if (i4 <= 0 && this.f4163S0 <= 0) {
            return;
        }
        if (z3) {
            this.f4164T0 = this.f4163S0;
            this.f4165U0 = i4;
            return;
        }
        this.f4164T0 = i4;
        this.f4165U0 = this.f4163S0;
    }

    public void u1() {
        for (int i4 = 0; i4 < this.f218M0; i4++) {
            ConstraintWidget constraintWidget = this.f217L0[i4];
            if (constraintWidget != null) {
                constraintWidget.U0(true);
            }
        }
    }

    public boolean v1(HashSet hashSet) {
        for (int i4 = 0; i4 < this.f218M0; i4++) {
            if (hashSet.contains(this.f217L0[i4])) {
                return true;
            }
        }
        return false;
    }

    public int w1() {
        return this.f4168X0;
    }

    public int x1() {
        return this.f4167W0;
    }

    public int y1() {
        return this.f4159O0;
    }

    public int z1() {
        return this.f4164T0;
    }
}
