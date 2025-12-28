package androidx.core.view;

import android.view.ViewGroup;

public abstract class r {

    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.resolveLayoutDirection(i4);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setLayoutDirection(i4);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginEnd(i4);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
            marginLayoutParams.setMarginStart(i4);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.g(marginLayoutParams, i4);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i4) {
        a.h(marginLayoutParams, i4);
    }
}
