package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;

public class Barrier extends a {

    /* renamed from: j  reason: collision with root package name */
    private int f4172j;

    /* renamed from: k  reason: collision with root package name */
    private int f4173k;

    /* renamed from: l  reason: collision with root package name */
    private a f4174l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(ConstraintWidget constraintWidget, int i4, boolean z3) {
        this.f4173k = i4;
        if (z3) {
            int i5 = this.f4172j;
            if (i5 == 5) {
                this.f4173k = 1;
            } else if (i5 == 6) {
                this.f4173k = 0;
            }
        } else {
            int i6 = this.f4172j;
            if (i6 == 5) {
                this.f4173k = 0;
            } else if (i6 == 6) {
                this.f4173k = 1;
            }
        }
        if (constraintWidget instanceof a) {
            ((a) constraintWidget).A1(this.f4173k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f4174l.u1();
    }

    public int getMargin() {
        return this.f4174l.w1();
    }

    public int getType() {
        return this.f4172j;
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f4174l = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f4623n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.f4466D1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4462C1) {
                    this.f4174l.z1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == f.f4470E1) {
                    this.f4174l.B1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4298d = this.f4174l;
        o();
    }

    public void j(ConstraintWidget constraintWidget, boolean z3) {
        p(constraintWidget, this.f4172j, z3);
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f4174l.z1(z3);
    }

    public void setDpMargin(int i4) {
        a aVar = this.f4174l;
        aVar.B1((int) ((((float) i4) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i4) {
        this.f4174l.B1(i4);
    }

    public void setType(int i4) {
        this.f4172j = i4;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
