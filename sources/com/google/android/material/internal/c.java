package com.google.android.material.internal;

import F1.a;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.C0403a0;
import kotlin.uuid.Uuid;

public abstract class c {
    public static void a(Window window, boolean z3, Integer num, Integer num2) {
        boolean z4;
        boolean z5 = false;
        if (num == null || num.intValue() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (num2 == null || num2.intValue() == 0) {
            z5 = true;
        }
        if (z4 || z5) {
            int b4 = a.b(window.getContext(), 16842801, -16777216);
            if (z4) {
                num = Integer.valueOf(b4);
            }
            if (z5) {
                num2 = Integer.valueOf(b4);
            }
        }
        C0403a0.b(window, !z3);
        int c4 = c(window.getContext(), z3);
        int b5 = b(window.getContext(), z3);
        window.setStatusBarColor(c4);
        window.setNavigationBarColor(b5);
        f(window, d(c4, a.g(num.intValue())));
        e(window, d(b5, a.g(num2.intValue())));
    }

    private static int b(Context context, boolean z3) {
        if (z3 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.k(a.b(context, 16843858, -16777216), Uuid.SIZE_BITS);
        }
        if (z3) {
            return 0;
        }
        return a.b(context, 16843858, -16777216);
    }

    private static int c(Context context, boolean z3) {
        if (z3) {
            return 0;
        }
        return a.b(context, 16843857, -16777216);
    }

    private static boolean d(int i4, boolean z3) {
        if (a.g(i4) || (i4 == 0 && z3)) {
            return true;
        }
        return false;
    }

    public static void e(Window window, boolean z3) {
        C0403a0.a(window, window.getDecorView()).c(z3);
    }

    public static void f(Window window, boolean z3) {
        C0403a0.a(window, window.getDecorView()).d(z3);
    }
}
