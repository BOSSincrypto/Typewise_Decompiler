package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.f;
import z1.C0972c;

abstract class e {
    static f a(Context context, float f4, float f5, a aVar) {
        float f6;
        float b4 = b(context) + f4;
        float f7 = b4 / 2.0f;
        float f8 = 0.0f - f7;
        float f9 = (aVar.f11775f / 2.0f) + 0.0f;
        float f10 = aVar.f11775f;
        float max = (((float) Math.max(0, aVar.f11776g - 1)) * f10) + f9;
        float f11 = (f10 / 2.0f) + max;
        int i4 = aVar.f11773d;
        if (i4 > 0) {
            max = (aVar.f11774e / 2.0f) + f11;
        }
        if (i4 > 0) {
            f11 = (aVar.f11774e / 2.0f) + max;
        }
        if (aVar.f11772c > 0) {
            f6 = f11 + (aVar.f11771b / 2.0f);
        } else {
            f6 = max;
        }
        float f12 = f5 + f7;
        float a4 = d.a(b4, f10, f4);
        float a5 = d.a(aVar.f11771b, aVar.f11775f, f4);
        float a6 = d.a(aVar.f11774e, aVar.f11775f, f4);
        f.b d4 = new f.b(aVar.f11775f).a(f8, a4, b4).d(f9, 0.0f, aVar.f11775f, aVar.f11776g, true);
        if (aVar.f11773d > 0) {
            d4.a(max, a6, aVar.f11774e);
        }
        int i5 = aVar.f11772c;
        if (i5 > 0) {
            d4.c(f6, a5, aVar.f11771b, i5);
        }
        d4.a(f12, a4, b4);
        return d4.e();
    }

    static float b(Context context) {
        return context.getResources().getDimension(C0972c.m3_carousel_gone_size);
    }

    static float c(Context context) {
        return context.getResources().getDimension(C0972c.m3_carousel_small_item_size_max);
    }

    static float d(Context context) {
        return context.getResources().getDimension(C0972c.m3_carousel_small_item_size_min);
    }

    static int e(int[] iArr) {
        int i4 = Integer.MIN_VALUE;
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }
}
