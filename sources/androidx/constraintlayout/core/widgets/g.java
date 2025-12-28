package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f4157a = new boolean[3];

    static void a(d dVar, d dVar2, ConstraintWidget constraintWidget) {
        constraintWidget.f3948t = -1;
        constraintWidget.f3950u = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f3909Z[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f3909Z[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i4 = constraintWidget.f3898O.f3868g;
            int W3 = dVar.W() - constraintWidget.f3900Q.f3868g;
            ConstraintAnchor constraintAnchor = constraintWidget.f3898O;
            constraintAnchor.f3870i = dVar2.q(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f3900Q;
            constraintAnchor2.f3870i = dVar2.q(constraintAnchor2);
            dVar2.f(constraintWidget.f3898O.f3870i, i4);
            dVar2.f(constraintWidget.f3900Q.f3870i, W3);
            constraintWidget.f3948t = 2;
            constraintWidget.O0(i4, W3);
        }
        if (dVar.f3909Z[1] != dimensionBehaviour2 && constraintWidget.f3909Z[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i5 = constraintWidget.f3899P.f3868g;
            int x3 = dVar.x() - constraintWidget.f3901R.f3868g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f3899P;
            constraintAnchor3.f3870i = dVar2.q(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f3901R;
            constraintAnchor4.f3870i = dVar2.q(constraintAnchor4);
            dVar2.f(constraintWidget.f3899P.f3870i, i5);
            dVar2.f(constraintWidget.f3901R.f3870i, x3);
            if (constraintWidget.f3933l0 > 0 || constraintWidget.V() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f3902S;
                constraintAnchor5.f3870i = dVar2.q(constraintAnchor5);
                dVar2.f(constraintWidget.f3902S.f3870i, constraintWidget.f3933l0 + i5);
            }
            constraintWidget.f3950u = 2;
            constraintWidget.f1(i5, x3);
        }
    }

    public static final boolean b(int i4, int i5) {
        return (i4 & i5) == i5;
    }
}
