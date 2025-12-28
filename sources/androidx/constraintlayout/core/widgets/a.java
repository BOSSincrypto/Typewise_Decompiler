package androidx.constraintlayout.core.widgets;

import C.b;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class a extends b {

    /* renamed from: N0  reason: collision with root package name */
    private int f3965N0 = 0;

    /* renamed from: O0  reason: collision with root package name */
    private boolean f3966O0 = true;

    /* renamed from: P0  reason: collision with root package name */
    private int f3967P0 = 0;

    /* renamed from: Q0  reason: collision with root package name */
    boolean f3968Q0 = false;

    public void A1(int i4) {
        this.f3965N0 = i4;
    }

    public void B1(int i4) {
        this.f3967P0 = i4;
    }

    public void g(d dVar, boolean z3) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ConstraintAnchor[] constraintAnchorArr2 = this.f3906W;
        constraintAnchorArr2[0] = this.f3898O;
        constraintAnchorArr2[2] = this.f3899P;
        constraintAnchorArr2[1] = this.f3900Q;
        constraintAnchorArr2[3] = this.f3901R;
        int i9 = 0;
        while (true) {
            constraintAnchorArr = this.f3906W;
            if (i9 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i9];
            constraintAnchor.f3870i = dVar.q(constraintAnchor);
            i9++;
        }
        int i10 = this.f3965N0;
        if (i10 >= 0 && i10 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i10];
            if (!this.f3968Q0) {
                t1();
            }
            if (this.f3968Q0) {
                this.f3968Q0 = false;
                int i11 = this.f3965N0;
                if (i11 == 0 || i11 == 1) {
                    dVar.f(this.f3898O.f3870i, this.f3921f0);
                    dVar.f(this.f3900Q.f3870i, this.f3921f0);
                } else if (i11 == 2 || i11 == 3) {
                    dVar.f(this.f3899P.f3870i, this.f3923g0);
                    dVar.f(this.f3901R.f3870i, this.f3923g0);
                }
            } else {
                int i12 = 0;
                while (true) {
                    if (i12 >= this.f218M0) {
                        z4 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.f217L0[i12];
                    if ((this.f3966O0 || constraintWidget.h()) && ((((i7 = this.f3965N0) == 0 || i7 == 1) && constraintWidget.A() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f3898O.f3867f != null && constraintWidget.f3900Q.f3867f != null) || (((i8 = this.f3965N0) == 2 || i8 == 3) && constraintWidget.T() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f3899P.f3867f != null && constraintWidget.f3901R.f3867f != null))) {
                        z4 = true;
                    } else {
                        i12++;
                    }
                }
                z4 = true;
                if (this.f3898O.l() || this.f3900Q.l()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f3899P.l() || this.f3901R.l()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4 || (((i6 = this.f3965N0) != 0 || !z5) && ((i6 != 2 || !z6) && ((i6 != 1 || !z5) && (i6 != 3 || !z6))))) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!z7) {
                    i4 = 4;
                } else {
                    i4 = 5;
                }
                for (int i13 = 0; i13 < this.f218M0; i13++) {
                    ConstraintWidget constraintWidget2 = this.f217L0[i13];
                    if (this.f3966O0 || constraintWidget2.h()) {
                        SolverVariable q4 = dVar.q(constraintWidget2.f3906W[this.f3965N0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f3906W;
                        int i14 = this.f3965N0;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i14];
                        constraintAnchor3.f3870i = q4;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f3867f;
                        if (constraintAnchor4 == null || constraintAnchor4.f3865d != this) {
                            i5 = 0;
                        } else {
                            i5 = constraintAnchor3.f3868g;
                        }
                        if (i14 == 0 || i14 == 2) {
                            dVar.i(constraintAnchor2.f3870i, q4, this.f3967P0 - i5, z4);
                        } else {
                            dVar.g(constraintAnchor2.f3870i, q4, this.f3967P0 + i5, z4);
                        }
                        dVar.e(constraintAnchor2.f3870i, q4, this.f3967P0 + i5, i4);
                    }
                }
                int i15 = this.f3965N0;
                if (i15 == 0) {
                    dVar.e(this.f3900Q.f3870i, this.f3898O.f3870i, 0, 8);
                    dVar.e(this.f3898O.f3870i, this.f3911a0.f3900Q.f3870i, 0, 4);
                    dVar.e(this.f3898O.f3870i, this.f3911a0.f3898O.f3870i, 0, 0);
                } else if (i15 == 1) {
                    dVar.e(this.f3898O.f3870i, this.f3900Q.f3870i, 0, 8);
                    dVar.e(this.f3898O.f3870i, this.f3911a0.f3898O.f3870i, 0, 4);
                    dVar.e(this.f3898O.f3870i, this.f3911a0.f3900Q.f3870i, 0, 0);
                } else if (i15 == 2) {
                    dVar.e(this.f3901R.f3870i, this.f3899P.f3870i, 0, 8);
                    dVar.e(this.f3899P.f3870i, this.f3911a0.f3901R.f3870i, 0, 4);
                    dVar.e(this.f3899P.f3870i, this.f3911a0.f3899P.f3870i, 0, 0);
                } else if (i15 == 3) {
                    dVar.e(this.f3899P.f3870i, this.f3901R.f3870i, 0, 8);
                    dVar.e(this.f3899P.f3870i, this.f3911a0.f3899P.f3870i, 0, 4);
                    dVar.e(this.f3899P.f3870i, this.f3911a0.f3901R.f3870i, 0, 0);
                }
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean n0() {
        return this.f3968Q0;
    }

    public boolean o0() {
        return this.f3968Q0;
    }

    public boolean t1() {
        int i4;
        int i5;
        int i6;
        boolean z3 = true;
        int i7 = 0;
        while (true) {
            i4 = this.f218M0;
            if (i7 >= i4) {
                break;
            }
            ConstraintWidget constraintWidget = this.f217L0[i7];
            if ((this.f3966O0 || constraintWidget.h()) && ((((i5 = this.f3965N0) == 0 || i5 == 1) && !constraintWidget.n0()) || (((i6 = this.f3965N0) == 2 || i6 == 3) && !constraintWidget.o0()))) {
                z3 = false;
            }
            i7++;
        }
        if (!z3 || i4 <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z4 = false;
        for (int i9 = 0; i9 < this.f218M0; i9++) {
            ConstraintWidget constraintWidget2 = this.f217L0[i9];
            if (this.f3966O0 || constraintWidget2.h()) {
                if (!z4) {
                    int i10 = this.f3965N0;
                    if (i10 == 0) {
                        i8 = constraintWidget2.o(ConstraintAnchor.Type.LEFT).e();
                    } else if (i10 == 1) {
                        i8 = constraintWidget2.o(ConstraintAnchor.Type.RIGHT).e();
                    } else if (i10 == 2) {
                        i8 = constraintWidget2.o(ConstraintAnchor.Type.TOP).e();
                    } else if (i10 == 3) {
                        i8 = constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).e();
                    }
                    z4 = true;
                }
                int i11 = this.f3965N0;
                if (i11 == 0) {
                    i8 = Math.min(i8, constraintWidget2.o(ConstraintAnchor.Type.LEFT).e());
                } else if (i11 == 1) {
                    i8 = Math.max(i8, constraintWidget2.o(ConstraintAnchor.Type.RIGHT).e());
                } else if (i11 == 2) {
                    i8 = Math.min(i8, constraintWidget2.o(ConstraintAnchor.Type.TOP).e());
                } else if (i11 == 3) {
                    i8 = Math.max(i8, constraintWidget2.o(ConstraintAnchor.Type.BOTTOM).e());
                }
            }
        }
        int i12 = i8 + this.f3967P0;
        int i13 = this.f3965N0;
        if (i13 == 0 || i13 == 1) {
            F0(i12, i12);
        } else {
            I0(i12, i12);
        }
        this.f3968Q0 = true;
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i4 = 0; i4 < this.f218M0; i4++) {
            ConstraintWidget constraintWidget = this.f217L0[i4];
            if (i4 > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.t();
        }
        return str + "}";
    }

    public boolean u1() {
        return this.f3966O0;
    }

    public int v1() {
        return this.f3965N0;
    }

    public int w1() {
        return this.f3967P0;
    }

    public int x1() {
        int i4 = this.f3965N0;
        if (i4 == 0 || i4 == 1) {
            return 0;
        }
        if (i4 == 2 || i4 == 3) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void y1() {
        for (int i4 = 0; i4 < this.f218M0; i4++) {
            ConstraintWidget constraintWidget = this.f217L0[i4];
            if (this.f3966O0 || constraintWidget.h()) {
                int i5 = this.f3965N0;
                if (i5 == 0 || i5 == 1) {
                    constraintWidget.S0(0, true);
                } else if (i5 == 2 || i5 == 3) {
                    constraintWidget.S0(1, true);
                }
            }
        }
    }

    public void z1(boolean z3) {
        this.f3966O0 = z3;
    }
}
