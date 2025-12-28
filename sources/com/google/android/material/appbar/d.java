package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.P;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f11561a;

    /* renamed from: b  reason: collision with root package name */
    private int f11562b;

    /* renamed from: c  reason: collision with root package name */
    private int f11563c;

    /* renamed from: d  reason: collision with root package name */
    private int f11564d;

    /* renamed from: e  reason: collision with root package name */
    private int f11565e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11566f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11567g = true;

    public d(View view) {
        this.f11561a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f11561a;
        P.Z(view, this.f11564d - (view.getTop() - this.f11562b));
        View view2 = this.f11561a;
        P.Y(view2, this.f11565e - (view2.getLeft() - this.f11563c));
    }

    public int b() {
        return this.f11564d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f11562b = this.f11561a.getTop();
        this.f11563c = this.f11561a.getLeft();
    }

    public boolean d(int i4) {
        if (!this.f11567g || this.f11565e == i4) {
            return false;
        }
        this.f11565e = i4;
        a();
        return true;
    }

    public boolean e(int i4) {
        if (!this.f11566f || this.f11564d == i4) {
            return false;
        }
        this.f11564d = i4;
        a();
        return true;
    }
}
