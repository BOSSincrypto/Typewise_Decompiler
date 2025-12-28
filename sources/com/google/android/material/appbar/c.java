package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class c extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private d f11558a;

    /* renamed from: b  reason: collision with root package name */
    private int f11559b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f11560c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.f11558a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.I(view, i4);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        F(coordinatorLayout, view, i4);
        if (this.f11558a == null) {
            this.f11558a = new d(view);
        }
        this.f11558a.c();
        this.f11558a.a();
        int i5 = this.f11559b;
        if (i5 != 0) {
            this.f11558a.e(i5);
            this.f11559b = 0;
        }
        int i6 = this.f11560c;
        if (i6 == 0) {
            return true;
        }
        this.f11558a.d(i6);
        this.f11560c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
