package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    int f11488a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    int f11489b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    int f11490c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    int f11491d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    int f11492e;

    /* renamed from: f  reason: collision with root package name */
    int f11493f;

    /* renamed from: g  reason: collision with root package name */
    int f11494g;

    /* renamed from: h  reason: collision with root package name */
    int f11495h;

    /* renamed from: i  reason: collision with root package name */
    int f11496i;

    /* renamed from: j  reason: collision with root package name */
    float f11497j;

    /* renamed from: k  reason: collision with root package name */
    float f11498k;

    /* renamed from: l  reason: collision with root package name */
    int f11499l;

    /* renamed from: m  reason: collision with root package name */
    int f11500m;

    /* renamed from: n  reason: collision with root package name */
    List f11501n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    int f11502o;

    /* renamed from: p  reason: collision with root package name */
    int f11503p;

    /* renamed from: q  reason: collision with root package name */
    boolean f11504q;

    /* renamed from: r  reason: collision with root package name */
    boolean f11505r;

    c() {
    }

    public int a() {
        return this.f11494g;
    }

    public int b() {
        return this.f11495h;
    }

    public int c() {
        return this.f11495h - this.f11496i;
    }

    /* access modifiers changed from: package-private */
    public void d(View view, int i4, int i5, int i6, int i7) {
        b bVar = (b) view.getLayoutParams();
        this.f11488a = Math.min(this.f11488a, (view.getLeft() - bVar.q()) - i4);
        this.f11489b = Math.min(this.f11489b, (view.getTop() - bVar.s()) - i5);
        this.f11490c = Math.max(this.f11490c, view.getRight() + bVar.i() + i6);
        this.f11491d = Math.max(this.f11491d, view.getBottom() + bVar.p() + i7);
    }
}
