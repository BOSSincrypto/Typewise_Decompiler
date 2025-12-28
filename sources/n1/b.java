package N1;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public abstract class b {
    public static TypedValue a(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i4, boolean z3) {
        TypedValue a4 = a(context, i4);
        if (a4 == null || a4.type != 18) {
            return z3;
        }
        if (a4.data != 0) {
            return true;
        }
        return false;
    }

    public static int c(Context context, int i4, int i5) {
        TypedValue a4 = a(context, i4);
        if (a4 == null || a4.type != 16) {
            return i5;
        }
        return a4.data;
    }

    public static int d(Context context, int i4, String str) {
        return e(context, i4, str).data;
    }

    public static TypedValue e(Context context, int i4, String str) {
        TypedValue a4 = a(context, i4);
        if (a4 != null) {
            return a4;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i4)}));
    }

    public static TypedValue f(View view, int i4) {
        return e(view.getContext(), i4, view.getClass().getCanonicalName());
    }
}
