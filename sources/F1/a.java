package F1;

import N1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

public abstract class a {
    public static int a(int i4, int i5) {
        return androidx.core.graphics.a.k(i4, (Color.alpha(i4) * i5) / 255);
    }

    public static int b(Context context, int i4, int i5) {
        TypedValue a4 = b.a(context, i4);
        if (a4 != null) {
            return k(context, a4);
        }
        return i5;
    }

    public static int c(Context context, int i4, String str) {
        return k(context, b.e(context, i4, str));
    }

    public static int d(View view, int i4) {
        return k(view.getContext(), b.f(view, i4));
    }

    public static int e(View view, int i4, int i5) {
        return b(view.getContext(), i4, i5);
    }

    public static ColorStateList f(Context context, int i4) {
        TypedValue a4 = b.a(context, i4);
        if (a4 == null) {
            return null;
        }
        int i5 = a4.resourceId;
        if (i5 != 0) {
            return androidx.core.content.a.c(context, i5);
        }
        int i6 = a4.data;
        if (i6 != 0) {
            return ColorStateList.valueOf(i6);
        }
        return null;
    }

    public static boolean g(int i4) {
        if (i4 == 0 || androidx.core.graphics.a.d(i4) <= 0.5d) {
            return false;
        }
        return true;
    }

    public static int h(int i4, int i5) {
        return androidx.core.graphics.a.g(i5, i4);
    }

    public static int i(int i4, int i5, float f4) {
        return h(i4, androidx.core.graphics.a.k(i5, Math.round(((float) Color.alpha(i5)) * f4)));
    }

    public static int j(View view, int i4, int i5, float f4) {
        return i(d(view, i4), d(view, i5), f4);
    }

    private static int k(Context context, TypedValue typedValue) {
        int i4 = typedValue.resourceId;
        if (i4 != 0) {
            return androidx.core.content.a.b(context, i4);
        }
        return typedValue.data;
    }
}
