package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.core.view.P;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f3644a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f3645b;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f3645b = z3;
        try {
            Class<Rect> cls = Rect.class;
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f3644a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f3644a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f3644a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(View view) {
        if (P.B(view) == 1) {
            return true;
        }
        return false;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, (Object[]) null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
