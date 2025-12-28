package C;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

public abstract class c extends ConstraintWidget {

    /* renamed from: L0  reason: collision with root package name */
    public ArrayList f219L0 = new ArrayList();

    public void c(ConstraintWidget constraintWidget) {
        this.f219L0.add(constraintWidget);
        if (constraintWidget.K() != null) {
            ((c) constraintWidget.K()).t1(constraintWidget);
        }
        constraintWidget.c1(this);
    }

    public ArrayList r1() {
        return this.f219L0;
    }

    public abstract void s1();

    public void t0() {
        this.f219L0.clear();
        super.t0();
    }

    public void t1(ConstraintWidget constraintWidget) {
        this.f219L0.remove(constraintWidget);
        constraintWidget.t0();
    }

    public void u1() {
        this.f219L0.clear();
    }

    public void w0(androidx.constraintlayout.core.c cVar) {
        super.w0(cVar);
        int size = this.f219L0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ConstraintWidget) this.f219L0.get(i4)).w0(cVar);
        }
    }
}
