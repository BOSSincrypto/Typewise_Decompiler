package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.o;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f5116a = new x();

    private x() {
    }

    public static final void a(Resources.Theme theme, View view) {
        o.e(theme, "theme");
        o.e(view, "decor");
        c(theme, view, (TypedValue) null, 4, (Object) null);
    }

    public static final void b(Resources.Theme theme, View view, TypedValue typedValue) {
        int i4;
        o.e(theme, "theme");
        o.e(view, "decor");
        o.e(typedValue, "tv");
        if (!theme.resolveAttribute(16844000, typedValue, true) || typedValue.data == 0) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (theme.resolveAttribute(16844140, typedValue, true) && typedValue.data != 0) {
            i4 |= 16;
        }
        WindowInsetsController a4 = view.getWindowInsetsController();
        o.b(a4);
        a4.setSystemBarsAppearance(i4, 24);
    }

    public static /* synthetic */ void c(Resources.Theme theme, View view, TypedValue typedValue, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            typedValue = new TypedValue();
        }
        b(theme, view, typedValue);
    }
}
