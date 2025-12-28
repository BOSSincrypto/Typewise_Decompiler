package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.a;
import androidx.core.view.P;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

abstract class u {
    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = a.r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                a.o(drawable, colorStateList);
            } else {
                a.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static ImageView.ScaleType b(int i4) {
        if (i4 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i4 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i4 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i4 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i4 == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i4 != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    private static int[] c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = a.r(drawable).mutate();
            a.o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    static void e(CheckableImageButton checkableImageButton) {
    }

    private static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z3;
        boolean N3 = P.N(checkableImageButton);
        boolean z4 = false;
        int i4 = 1;
        if (onLongClickListener != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (N3 || z3) {
            z4 = true;
        }
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(N3);
        checkableImageButton.setPressable(N3);
        checkableImageButton.setLongClickable(z3);
        if (!z4) {
            i4 = 2;
        }
        P.y0(checkableImageButton, i4);
    }

    static void g(CheckableImageButton checkableImageButton, int i4) {
        checkableImageButton.setMinimumWidth(i4);
        checkableImageButton.setMinimumHeight(i4);
    }

    static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
