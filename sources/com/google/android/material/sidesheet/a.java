package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f12206a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f12206a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i4) {
        float d4 = (float) d();
        return (((float) i4) - d4) / (((float) c()) - d4);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.max(0, this.f12206a.f0() + this.f12206a.d0());
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return (-this.f12206a.Y()) - this.f12206a.d0();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f12206a.d0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return -this.f12206a.Y();
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        return view.getRight() + this.f12206a.d0();
    }

    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean j(float f4) {
        return f4 > 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        if (view.getRight() < (c() - d()) / 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f4, float f5) {
        if (!d.a(f4, f5) || Math.abs(f4) <= ((float) this.f12206a.h0())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m(View view, float f4) {
        if (Math.abs(((float) view.getLeft()) + (f4 * this.f12206a.b0())) > this.f12206a.c0()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5) {
        if (i4 <= this.f12206a.g0()) {
            marginLayoutParams.leftMargin = i5;
        }
    }
}
