package com.google.android.material.datepicker;

import N1.c;
import Q1.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.g;
import androidx.core.view.P;
import z1.j;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f11948a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f11949b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f11950c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f11951d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11952e;

    /* renamed from: f  reason: collision with root package name */
    private final k f11953f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, k kVar, Rect rect) {
        g.d(rect.left);
        g.d(rect.top);
        g.d(rect.right);
        g.d(rect.bottom);
        this.f11948a = rect;
        this.f11949b = colorStateList2;
        this.f11950c = colorStateList;
        this.f11951d = colorStateList3;
        this.f11952e = i4;
        this.f11953f = kVar;
    }

    static b a(Context context, int i4) {
        boolean z3;
        if (i4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        g.b(z3, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, j.f16549I2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(j.f16553J2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f16561L2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f16557K2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f16565M2, 0));
        ColorStateList a4 = c.a(context, obtainStyledAttributes, j.f16569N2);
        ColorStateList a5 = c.a(context, obtainStyledAttributes, j.f16589S2);
        ColorStateList a6 = c.a(context, obtainStyledAttributes, j.f16581Q2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f16585R2, 0);
        k m4 = k.b(context, obtainStyledAttributes.getResourceId(j.f16573O2, 0), obtainStyledAttributes.getResourceId(j.f16577P2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a4, a5, a6, dimensionPixelSize, m4, rect);
    }

    /* access modifiers changed from: package-private */
    public void b(TextView textView) {
        c(textView, (ColorStateList) null, (ColorStateList) null);
    }

    /* access modifiers changed from: package-private */
    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        Q1.g gVar = new Q1.g();
        Q1.g gVar2 = new Q1.g();
        gVar.setShapeAppearanceModel(this.f11953f);
        gVar2.setShapeAppearanceModel(this.f11953f);
        if (colorStateList == null) {
            colorStateList = this.f11950c;
        }
        gVar.T(colorStateList);
        gVar.Y((float) this.f11952e, this.f11951d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f11949b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f11949b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f11948a;
        P.s0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
