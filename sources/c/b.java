package C;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.m;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class b extends ConstraintWidget implements a {

    /* renamed from: L0  reason: collision with root package name */
    public ConstraintWidget[] f217L0 = new ConstraintWidget[4];

    /* renamed from: M0  reason: collision with root package name */
    public int f218M0 = 0;

    public void a(d dVar) {
    }

    public void b() {
        this.f218M0 = 0;
        Arrays.fill(this.f217L0, (Object) null);
    }

    public void c(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i4 = this.f218M0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f217L0;
            if (i4 > constraintWidgetArr.length) {
                this.f217L0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f217L0;
            int i5 = this.f218M0;
            constraintWidgetArr2[i5] = constraintWidget;
            this.f218M0 = i5 + 1;
        }
    }

    public void r1(ArrayList arrayList, int i4, m mVar) {
        for (int i5 = 0; i5 < this.f218M0; i5++) {
            mVar.a(this.f217L0[i5]);
        }
        for (int i6 = 0; i6 < this.f218M0; i6++) {
            g.a(this.f217L0[i6], i4, arrayList, mVar);
        }
    }

    public int s1(int i4) {
        int i5;
        int i6;
        for (int i7 = 0; i7 < this.f218M0; i7++) {
            ConstraintWidget constraintWidget = this.f217L0[i7];
            if (i4 == 0 && (i6 = constraintWidget.f3891I0) != -1) {
                return i6;
            }
            if (i4 == 1 && (i5 = constraintWidget.f3893J0) != -1) {
                return i5;
            }
        }
        return -1;
    }
}
