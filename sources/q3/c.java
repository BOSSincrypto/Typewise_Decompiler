package q3;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.C0435o0;
import ch.icoaching.wrio.logging.Log;
import kotlin.jvm.internal.o;

public abstract class c {
    /* access modifiers changed from: private */
    public static final int[] b(Context context) {
        int i4;
        int i5;
        Object systemService = context.getSystemService("window");
        o.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics a4 = windowManager.getCurrentWindowMetrics();
            o.d(a4, "getCurrentWindowMetrics(...)");
            Log log = Log.f10572a;
            Log.d(log, "CurrentDisplaySizeProvider", "getCurrentDisplaySize() :: windowMetrics = " + a4, (Throwable) null, 4, (Object) null);
            Insets a5 = a4.getWindowInsets().getInsetsIgnoringVisibility(C0435o0.m.f());
            o.d(a5, "getInsetsIgnoringVisibility(...)");
            Insets a6 = a4.getWindowInsets().getInsets(C0435o0.m.a());
            o.d(a6, "getInsets(...)");
            Log.d(log, "CurrentDisplaySizeProvider", "getCurrentDisplaySize() :: insetsSystemBar = " + a5, (Throwable) null, 4, (Object) null);
            Log.d(log, "CurrentDisplaySizeProvider", "getCurrentDisplaySize() :: insetsDisplayCutout = " + a6, (Throwable) null, 4, (Object) null);
            Rect a7 = a4.getBounds();
            o.d(a7, "getBounds(...)");
            int width = a7.width();
            int height = a7.height();
            i5 = (width - Math.max(a5.left, a6.left)) - Math.max(a5.right, a6.right);
            i4 = (height - Math.max(a5.top, a6.top)) - Math.max(a5.bottom, a6.bottom);
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i6 = displayMetrics.widthPixels;
            int i7 = displayMetrics.heightPixels;
            i5 = i6;
            i4 = i7;
        }
        return new int[]{i5, i4};
    }
}
