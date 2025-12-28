package com.google.android.material.internal;

import N1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
import z1.C0970a;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12161a = {C0970a.f16508i};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f12162b = {C0970a.colorPrimaryVariant};

    public static void a(Context context) {
        e(context, f12161a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z1.j.E6, i4, i5);
        boolean z3 = obtainStyledAttributes.getBoolean(z1.j.G6, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0970a.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f12162b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        boolean z3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z1.j.E6, i4, i5);
        boolean z4 = false;
        if (!obtainStyledAttributes.getBoolean(z1.j.H6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(z1.j.F6, -1) != -1) {
                z4 = true;
            }
            z3 = z4;
        } else {
            z3 = f(context, attributeSet, iArr, i4, i5, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z3) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return b.b(context, C0970a.isMaterial3Theme, false);
    }

    private static boolean h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static c0 j(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return c0.v(context, attributeSet, iArr, i4, i5);
    }
}
