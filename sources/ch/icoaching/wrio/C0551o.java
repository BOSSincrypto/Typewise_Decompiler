package ch.icoaching.wrio;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: ch.icoaching.wrio.o  reason: case insensitive filesystem */
public abstract class C0551o {
    public static final Point a(Context context) {
        o.e(context, "<this>");
        Object systemService = context.getSystemService("window");
        o.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            Rect a4 = windowManager.getCurrentWindowMetrics().getBounds();
            o.d(a4, "getBounds(...)");
            return new Point(a4.right, a4.bottom);
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static final boolean b(Context context) {
        o.e(context, "<this>");
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }
}
