package com.google.android.material.timepicker;

import Q1.g;
import Q1.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z1.j;

abstract class e extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private g f12514A;

    /* renamed from: y  reason: collision with root package name */
    private final Runnable f12515y = new d(this);

    /* renamed from: z  reason: collision with root package name */
    private int f12516z;

    public e(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(z1.g.material_radial_view_group, this);
        P.s0(this, C());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.V3, i4, 0);
        this.f12516z = obtainStyledAttributes.getDimensionPixelSize(j.W3, 0);
        obtainStyledAttributes.recycle();
    }

    private void B(List list, c cVar, int i4) {
        Iterator it = list.iterator();
        float f4 = 0.0f;
        while (it.hasNext()) {
            cVar.i(((View) it.next()).getId(), z1.e.circle_center, i4, f4);
            f4 += 360.0f / ((float) list.size());
        }
    }

    private Drawable C() {
        g gVar = new g();
        this.f12514A = gVar;
        gVar.R(new i(0.5f));
        this.f12514A.T(ColorStateList.valueOf(-1));
        return this.f12514A;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f12515y);
            handler.post(this.f12515y);
        }
    }

    /* access modifiers changed from: package-private */
    public int D(int i4) {
        if (i4 == 2) {
            return Math.round(((float) this.f12516z) * 0.66f);
        }
        return this.f12516z;
    }

    public int E() {
        return this.f12516z;
    }

    public void F(int i4) {
        this.f12516z = i4;
        H();
    }

    /* access modifiers changed from: protected */
    public void H() {
        c cVar = new c();
        cVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != z1.e.circle_center && !G(childAt)) {
                int i5 = (Integer) childAt.getTag(z1.e.material_clock_level);
                if (i5 == null) {
                    i5 = 1;
                }
                if (!hashMap.containsKey(i5)) {
                    hashMap.put(i5, new ArrayList());
                }
                ((List) hashMap.get(i5)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            B((List) entry.getValue(), cVar, D(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(P.k());
        }
        I();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    public void setBackgroundColor(int i4) {
        this.f12514A.T(ColorStateList.valueOf(i4));
    }
}
