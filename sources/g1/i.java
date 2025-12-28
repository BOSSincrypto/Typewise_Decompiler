package g1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.d;
import androidx.core.content.a;
import androidx.core.content.res.h;
import o.C0836a;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f13607a = true;

    public static Drawable a(Context context, int i4, Resources.Theme theme) {
        return c(context, context, i4, theme);
    }

    public static Drawable b(Context context, Context context2, int i4) {
        return c(context, context2, i4, (Resources.Theme) null);
    }

    private static Drawable c(Context context, Context context2, int i4, Resources.Theme theme) {
        try {
            if (f13607a) {
                return e(context2, i4, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f13607a = false;
        } catch (IllegalStateException e4) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return a.d(context2, i4);
            }
            throw e4;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i4, theme);
    }

    private static Drawable d(Context context, int i4, Resources.Theme theme) {
        return h.e(context.getResources(), i4, theme);
    }

    private static Drawable e(Context context, int i4, Resources.Theme theme) {
        if (theme != null) {
            d dVar = new d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C0836a.b(context, i4);
    }
}
