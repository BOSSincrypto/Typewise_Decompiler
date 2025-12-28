package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    static class C0072a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i4) {
            return drawableContainerState.getChild(i4);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z3) {
            drawable.setAutoMirrored(z3);
        }
    }

    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f4, float f5) {
            drawable.setHotspot(f4, f5);
        }

        static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }

        static void g(Drawable drawable, int i4) {
            drawable.setTint(i4);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i4) {
            return drawable.setLayoutDirection(i4);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(Drawable drawable) {
        return C0072a.a(drawable);
    }

    public static ColorFilter e(Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(Drawable drawable) {
        return c.a(drawable);
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return C0072a.d(drawable);
    }

    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z3) {
        C0072a.e(drawable, z3);
    }

    public static void k(Drawable drawable, float f4, float f5) {
        b.e(drawable, f4, f5);
    }

    public static void l(Drawable drawable, int i4, int i5, int i6, int i7) {
        b.f(drawable, i4, i5, i6, i7);
    }

    public static boolean m(Drawable drawable, int i4) {
        return c.b(drawable, i4);
    }

    public static void n(Drawable drawable, int i4) {
        b.g(drawable, i4);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    public static Drawable q(Drawable drawable) {
        if (drawable instanceof b) {
            return ((b) drawable).b();
        }
        return drawable;
    }

    public static Drawable r(Drawable drawable) {
        return drawable;
    }
}
