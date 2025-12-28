package O1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1065a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1066b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1067c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f1068d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f1069e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f1070f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f1071g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f1072h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1073i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f1074j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f1075k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f1076l = b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1075k, 0)) != 0) {
            Log.w(f1076l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 : iArr) {
            if (i4 == 16842910) {
                z3 = true;
            } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                z4 = true;
            }
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }
}
