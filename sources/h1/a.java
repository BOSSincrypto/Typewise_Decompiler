package H1;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.Arrays;

public abstract class a {
    public static Drawable a(Drawable drawable, Drawable drawable2) {
        return b(drawable, drawable2, -1, -1);
    }

    public static Drawable b(Drawable drawable, Drawable drawable2, int i4, int i5) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i4 == -1) {
            i4 = g(drawable, drawable2);
        }
        if (i5 == -1) {
            i5 = f(drawable, drawable2);
        }
        if (i4 > drawable.getIntrinsicWidth() || i5 > drawable.getIntrinsicHeight()) {
            float f4 = ((float) i4) / ((float) i5);
            if (f4 >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int i6 = intrinsicWidth;
                i5 = (int) (((float) intrinsicWidth) / f4);
                i4 = i6;
            } else {
                i5 = drawable.getIntrinsicHeight();
                i4 = (int) (f4 * ((float) i5));
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i4, i5);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return d(drawable, colorStateList, mode, false);
    }

    private static Drawable d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z3) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        } else if (z3) {
            drawable.mutate();
        }
        return drawable;
    }

    public static int[] e(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == 16842912) {
                return iArr;
            }
            if (i5 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i4] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    private static int f(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight != -1) {
            return intrinsicHeight;
        }
        return drawable.getIntrinsicHeight();
    }

    private static int g(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        if (intrinsicWidth != -1) {
            return intrinsicWidth;
        }
        return drawable.getIntrinsicWidth();
    }

    public static void h(Outline outline, Path path) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            outline.setPath(path);
        } else if (i4 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static PorterDuffColorFilter i(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
