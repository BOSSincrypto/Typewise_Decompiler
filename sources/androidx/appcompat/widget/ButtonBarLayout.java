package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.P;
import n.f;
import n.j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3152a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3153b;

    /* renamed from: c  reason: collision with root package name */
    private int f3154c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = j.f14892N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        P.m0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f3152a = obtainStyledAttributes.getBoolean(j.f14896O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3152a);
        }
    }

    private int a(int i4) {
        int childCount = getChildCount();
        while (i4 < childCount) {
            if (getChildAt(i4).getVisibility() == 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private boolean b() {
        return this.f3153b;
    }

    private void setStacked(boolean z3) {
        int i4;
        int i5;
        if (this.f3153b == z3) {
            return;
        }
        if (!z3 || this.f3152a) {
            this.f3153b = z3;
            setOrientation(z3 ? 1 : 0);
            if (z3) {
                i4 = 8388613;
            } else {
                i4 = 80;
            }
            setGravity(i4);
            View findViewById = findViewById(f.f14767G);
            if (findViewById != null) {
                if (z3) {
                    i5 = 8;
                } else {
                    i5 = 4;
                }
                findViewById.setVisibility(i5);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        boolean z3;
        int i6;
        int size = View.MeasureSpec.getSize(i4);
        int i7 = 0;
        if (this.f3152a) {
            if (size > this.f3154c && b()) {
                setStacked(false);
            }
            this.f3154c = size;
        }
        if (b() || View.MeasureSpec.getMode(i4) != 1073741824) {
            i6 = i4;
            z3 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f3152a && !b() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i4, i5);
        }
        int a4 = a(0);
        if (a4 >= 0) {
            View childAt = getChildAt(a4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a5 = a(a4 + 1);
                if (a5 >= 0) {
                    paddingTop += getChildAt(a5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i7 = paddingTop;
            } else {
                i7 = paddingTop + getPaddingBottom();
            }
        }
        if (P.C(this) != i7) {
            setMinimumHeight(i7);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f3152a != z3) {
            this.f3152a = z3;
            if (!z3 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
