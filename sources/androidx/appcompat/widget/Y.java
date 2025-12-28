package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.a;
import n.j;

public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f3480a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f3481b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f3482c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f3483d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f3484e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f3485f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    static final int[] f3486g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    static final int[] f3487h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    static final int[] f3488i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f3489j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.f15060y0);
        try {
            if (!obtainStyledAttributes.hasValue(j.f14852D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList e4 = e(context, i4);
        if (e4 != null && e4.isStateful()) {
            return e4.getColorForState(f3481b, e4.getDefaultColor());
        }
        TypedValue f4 = f();
        context.getTheme().resolveAttribute(16842803, f4, true);
        return d(context, i4, f4.getFloat());
    }

    public static int c(Context context, int i4) {
        int[] iArr = f3489j;
        iArr[0] = i4;
        c0 u3 = c0.u(context, (AttributeSet) null, iArr);
        try {
            return u3.b(0, 0);
        } finally {
            u3.w();
        }
    }

    static int d(Context context, int i4, float f4) {
        int c4 = c(context, i4);
        return a.k(c4, Math.round(((float) Color.alpha(c4)) * f4));
    }

    public static ColorStateList e(Context context, int i4) {
        int[] iArr = f3489j;
        iArr[0] = i4;
        c0 u3 = c0.u(context, (AttributeSet) null, iArr);
        try {
            return u3.c(0);
        } finally {
            u3.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f3480a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
