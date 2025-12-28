package com.google.android.material.transformation;

import J1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.P;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private int f12525a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    public a E(CoordinatorLayout coordinatorLayout, View view) {
        List r4 = coordinatorLayout.r(view);
        int size = r4.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) r4.get(i4);
            if (e(coordinatorLayout, view, view2)) {
                F.a(view2);
                return null;
            }
        }
        return null;
    }

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        F.a(view2);
        throw null;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (P.S(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
