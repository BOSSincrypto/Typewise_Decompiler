package com.google.android.material.snackbar;

import A1.a;
import L1.d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.P;
import z1.C0970a;
import z1.C0972c;
import z1.e;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f12228a;

    /* renamed from: b  reason: collision with root package name */
    private Button f12229b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeInterpolator f12230c;

    /* renamed from: d  reason: collision with root package name */
    private int f12231d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12230c = d.g(context, C0970a.motionEasingEmphasizedInterpolator, a.f6b);
    }

    private static void a(View view, int i4, int i5) {
        if (P.U(view)) {
            P.D0(view, P.G(view), i4, P.F(view), i5);
        } else {
            view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i5);
        }
    }

    private boolean b(int i4, int i5, int i6) {
        boolean z3;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f12228a.getPaddingTop() == i5 && this.f12228a.getPaddingBottom() == i6) {
            return z3;
        }
        a(this.f12228a, i5, i6);
        return true;
    }

    public Button getActionView() {
        return this.f12229b;
    }

    public TextView getMessageView() {
        return this.f12228a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12228a = (TextView) findViewById(e.snackbar_text);
        this.f12229b = (Button) findViewById(e.snackbar_action);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        boolean z3;
        super.onMeasure(i4, i5);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0972c.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0972c.design_snackbar_padding_vertical);
            Layout layout = this.f12228a.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || this.f12231d <= 0 || this.f12229b.getMeasuredWidth() <= this.f12231d) {
                if (!z3) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i4, i5);
        }
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f12231d = i4;
    }
}
