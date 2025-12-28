package com.google.android.material.carousel;

import I.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11803b = {1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11804c = {1, 0};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f11805d = {0};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11806a;

    public h() {
        this(false);
    }

    /* access modifiers changed from: package-private */
    public f b(b bVar, View view) {
        int[] iArr;
        float d4 = (float) bVar.d();
        if (bVar.j()) {
            d4 = (float) bVar.a();
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f4 = (float) (pVar.topMargin + pVar.bottomMargin);
        float measuredHeight = (float) view.getMeasuredHeight();
        if (bVar.j()) {
            f4 = (float) (pVar.leftMargin + pVar.rightMargin);
            measuredHeight = (float) view.getMeasuredWidth();
        }
        float f5 = f4;
        float d5 = e.d(view.getContext()) + f5;
        float c4 = e.c(view.getContext()) + f5;
        float min = Math.min(measuredHeight + f5, d4);
        float a4 = a.a((measuredHeight / 3.0f) + f5, e.d(view.getContext()) + f5, e.c(view.getContext()) + f5);
        float f6 = (min + a4) / 2.0f;
        int[] iArr2 = f11803b;
        if (this.f11806a) {
            iArr = f11805d;
        } else {
            iArr = f11804c;
        }
        int[] iArr3 = iArr;
        int max = (int) Math.max(1.0d, Math.floor((double) (((d4 - (((float) e.e(iArr3)) * f6)) - (((float) e.e(iArr2)) * c4)) / min)));
        int ceil = (int) Math.ceil((double) (d4 / min));
        int i4 = (ceil - max) + 1;
        int[] iArr4 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            iArr4[i5] = ceil - i5;
        }
        return e.a(view.getContext(), f5, d4, a.c(d4, a4, d5, c4, iArr2, f6, iArr3, min, iArr4));
    }

    public h(boolean z3) {
        this.f11806a = z3;
    }
}
