package S1;

import N1.b;
import N1.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;
import z1.C0970a;
import z1.j;

public class a extends D {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void r(Resources.Theme theme, int i4) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i4, j.f16692o3);
        int v3 = v(getContext(), obtainStyledAttributes, j.f16702q3, j.f16707r3);
        obtainStyledAttributes.recycle();
        if (v3 >= 0) {
            setLineHeight(v3);
        }
    }

    private static boolean s(Context context) {
        return b.b(context, C0970a.textAppearanceLineHeightEnabled, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f16712s3, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(j.f16717t3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void u(AttributeSet attributeSet, int i4, int i5) {
        int t4;
        Context context = getContext();
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (!w(context, theme, attributeSet, i4, i5) && (t4 = t(theme, attributeSet, i4, i5)) != -1) {
                r(theme, t4);
            }
        }
    }

    private static int v(Context context, TypedArray typedArray, int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            i4 = c.c(context, typedArray, iArr[i5], -1);
        }
        return i4;
    }

    private static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f16712s3, i4, i5);
        int v3 = v(context, obtainStyledAttributes, j.u3, j.v3);
        obtainStyledAttributes.recycle();
        if (v3 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (s(context)) {
            r(context.getTheme(), i4);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i4) {
        super(T1.a.c(context, attributeSet, i4, 0), attributeSet, i4);
        u(attributeSet, i4, 0);
    }
}
