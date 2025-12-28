package com.google.android.material.appbar;

import I.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0434o;
import androidx.core.view.C0435o0;
import androidx.core.view.P;
import java.util.List;

abstract class b extends c {

    /* renamed from: d  reason: collision with root package name */
    final Rect f11554d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f11555e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f11556f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f11557g;

    public b() {
    }

    private static int L(int i4) {
        if (i4 == 0) {
            return 8388659;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View G3 = G(coordinatorLayout.r(view));
        if (G3 != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f11554d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, G3.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + G3.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C0435o0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && P.y(coordinatorLayout) && !P.y(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f11555e;
            C0434o.a(L(eVar.f4712c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
            int H3 = H(G3);
            view.layout(rect2.left, rect2.top - H3, rect2.right, rect2.bottom - H3);
            this.f11556f = rect2.top - G3.getBottom();
            return;
        }
        super.F(coordinatorLayout, view, i4);
        this.f11556f = 0;
    }

    /* access modifiers changed from: package-private */
    public abstract View G(List list);

    /* access modifiers changed from: package-private */
    public final int H(View view) {
        if (this.f11557g == 0) {
            return 0;
        }
        float I3 = I(view);
        int i4 = this.f11557g;
        return a.b((int) (I3 * ((float) i4)), 0, i4);
    }

    /* access modifiers changed from: package-private */
    public abstract float I(View view);

    /* access modifiers changed from: package-private */
    public int J(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int K() {
        return this.f11556f;
    }

    public final void M(int i4) {
        this.f11557g = i4;
    }

    /* access modifiers changed from: protected */
    public boolean N() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        View G3;
        int i8;
        C0435o0 lastWindowInsets;
        int i9 = view.getLayoutParams().height;
        if ((i9 != -1 && i9 != -2) || (G3 = G(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (P.y(G3) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int J3 = size + J(G3);
        int measuredHeight = G3.getMeasuredHeight();
        if (N()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            J3 -= measuredHeight;
        }
        if (i9 == -1) {
            i8 = 1073741824;
        } else {
            i8 = Integer.MIN_VALUE;
        }
        coordinatorLayout.J(view, i4, i5, View.MeasureSpec.makeMeasureSpec(J3, i8), i7);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
