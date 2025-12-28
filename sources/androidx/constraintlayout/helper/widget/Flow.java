package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.h;

public class Flow extends h {

    /* renamed from: l  reason: collision with root package name */
    private e f4171l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f4171l = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f4623n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.f4628o1) {
                    this.f4171l.D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4633p1) {
                    this.f4171l.I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4678z1) {
                    this.f4171l.N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4454A1) {
                    this.f4171l.K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4638q1) {
                    this.f4171l.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4643r1) {
                    this.f4171l.O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4648s1) {
                    this.f4171l.M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4653t1) {
                    this.f4171l.J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4554Z1) {
                    this.f4171l.I2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4514P1) {
                    this.f4171l.x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4550Y1) {
                    this.f4171l.H2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4490J1) {
                    this.f4171l.r2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4522R1) {
                    this.f4171l.z2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4498L1) {
                    this.f4171l.t2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4530T1) {
                    this.f4171l.B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == f.f4506N1) {
                    this.f4171l.v2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4486I1) {
                    this.f4171l.q2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4518Q1) {
                    this.f4171l.y2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4494K1) {
                    this.f4171l.s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4526S1) {
                    this.f4171l.A2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4542W1) {
                    this.f4171l.F2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == f.f4502M1) {
                    this.f4171l.u2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f4538V1) {
                    this.f4171l.E2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == f.f4510O1) {
                    this.f4171l.w2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4546X1) {
                    this.f4171l.G2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == f.f4534U1) {
                    this.f4171l.C2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4298d = this.f4171l;
        o();
    }

    public void j(ConstraintWidget constraintWidget, boolean z3) {
        this.f4171l.t1(z3);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        p(this.f4171l, i4, i5);
    }

    public void p(androidx.constraintlayout.core.widgets.h hVar, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (hVar != null) {
            hVar.C1(mode, size, mode2, size2);
            setMeasuredDimension(hVar.x1(), hVar.w1());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setFirstHorizontalBias(float f4) {
        this.f4171l.q2(f4);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f4171l.r2(i4);
        requestLayout();
    }

    public void setFirstVerticalBias(float f4) {
        this.f4171l.s2(f4);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f4171l.t2(i4);
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f4171l.u2(i4);
        requestLayout();
    }

    public void setHorizontalBias(float f4) {
        this.f4171l.v2(f4);
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f4171l.w2(i4);
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f4171l.x2(i4);
        requestLayout();
    }

    public void setLastHorizontalBias(float f4) {
        this.f4171l.y2(f4);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f4171l.z2(i4);
        requestLayout();
    }

    public void setLastVerticalBias(float f4) {
        this.f4171l.A2(f4);
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f4171l.B2(i4);
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f4171l.C2(i4);
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f4171l.D2(i4);
        requestLayout();
    }

    public void setPadding(int i4) {
        this.f4171l.I1(i4);
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f4171l.J1(i4);
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f4171l.L1(i4);
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f4171l.M1(i4);
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f4171l.O1(i4);
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f4171l.E2(i4);
        requestLayout();
    }

    public void setVerticalBias(float f4) {
        this.f4171l.F2(f4);
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f4171l.G2(i4);
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f4171l.H2(i4);
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f4171l.I2(i4);
        requestLayout();
    }
}
