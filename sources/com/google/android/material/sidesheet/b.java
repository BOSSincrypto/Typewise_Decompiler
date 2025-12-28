package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f12207a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f12207a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i4) {
        float d4 = (float) d();
        return (d4 - ((float) i4)) / (d4 - ((float) c()));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.max(0, (d() - this.f12207a.Y()) - this.f12207a.d0());
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f12207a.g0();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12207a.g0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return c();
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        return view.getLeft() - this.f12207a.d0();
    }

    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j(float f4) {
        return f4 < 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        if (view.getLeft() > (d() + c()) / 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f4, float f5) {
        if (!d.a(f4, f5) || Math.abs(f4) <= ((float) this.f12207a.h0())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m(View view, float f4) {
        if (Math.abs(((float) view.getRight()) + (f4 * this.f12207a.b0())) > this.f12207a.c0()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5) {
        int g02 = this.f12207a.g0();
        if (i4 <= g02) {
            marginLayoutParams.rightMargin = g02 - i4;
        }
    }
}
