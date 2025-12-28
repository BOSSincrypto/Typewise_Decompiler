package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public abstract class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, boolean z3) {
        if (!j(xmlPullParser, str)) {
            return z3;
        }
        return typedArray.getBoolean(i4, z3);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        if (!j(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getColor(i4, i5);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i4, typedValue);
        int i5 = typedValue.type;
        if (i5 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i4 + ": " + typedValue);
        } else if (i5 < 28 || i5 > 31) {
            return c.d(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
        } else {
            return d(typedValue);
        }
    }

    private static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4, int i5) {
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i6 = typedValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return d.b(typedValue.data);
            }
            d g4 = d.g(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            if (g4 != null) {
                return g4;
            }
        }
        return d.b(i5);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, float f4) {
        if (!j(xmlPullParser, str)) {
            return f4;
        }
        return typedArray.getFloat(i4, f4);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        if (!j(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getInt(i4, i5);
    }

    public static int h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4, int i5) {
        if (!j(xmlPullParser, str)) {
            return i5;
        }
        return typedArray.getResourceId(i4, i5);
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i4);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i4) {
        if (!j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i4);
    }
}
