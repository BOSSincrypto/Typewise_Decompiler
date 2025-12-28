package T1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import z1.C0970a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f1456a = {16842752, C0970a.f16501N};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1457b = {C0970a.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1456a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1457b, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i4, int i5) {
        boolean z3;
        int b4 = b(context, attributeSet, i4, i5);
        if (!(context instanceof d) || ((d) context).c() != b4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (b4 == 0 || z3) {
            return context;
        }
        d dVar = new d(context, b4);
        int a4 = a(context, attributeSet);
        if (a4 != 0) {
            dVar.getTheme().applyStyle(a4, true);
        }
        return dVar;
    }
}
