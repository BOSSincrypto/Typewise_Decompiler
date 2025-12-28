package N1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
import o.C0836a;

public abstract class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList a4;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (a4 = C0836a.a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i4);
        }
        return a4;
    }

    public static ColorStateList b(Context context, c0 c0Var, int i4) {
        int n4;
        ColorStateList a4;
        if (!c0Var.s(i4) || (n4 = c0Var.n(i4, 0)) == 0 || (a4 = C0836a.a(context, n4)) == null) {
            return c0Var.c(i4);
        }
        return a4;
    }

    public static int c(Context context, TypedArray typedArray, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i4, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i4, i5);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i5);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable b4;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (b4 = C0836a.b(context, resourceId)) == null) {
            return typedArray.getDrawable(i4);
        }
        return b4;
    }

    static int e(TypedArray typedArray, int i4, int i5) {
        if (typedArray.hasValue(i4)) {
            return i4;
        }
        return i5;
    }

    public static d f(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return new d(context, resourceId);
    }

    public static boolean g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
