package ch.icoaching.wrio.theming;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.core.view.C0403a0;
import androidx.core.view.M0;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.logging.Log;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference f10670a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f10671b;

    /* renamed from: c  reason: collision with root package name */
    private int f10672c;

    private final void b(Window window) {
        try {
            window.setNavigationBarColor(this.f10672c);
        } catch (NullPointerException e4) {
            Log log = Log.f10572a;
            String localizedMessage = e4.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            log.e("NavigationBarColorHandler", localizedMessage, e4);
        }
    }

    public void a(Context context, Dialog dialog) {
        o.e(context, "inputMethodServiceContext");
        o.e(dialog, "inputMethodServiceWindow");
        this.f10670a = new WeakReference(context);
        this.f10671b = new WeakReference(dialog);
        Window window = dialog.getWindow();
        o.b(window);
        this.f10672c = window.getNavigationBarColor();
    }

    public void e() {
        WeakReference weakReference = this.f10671b;
        WeakReference weakReference2 = null;
        if (weakReference == null) {
            o.p("inputMethodServiceWindow");
            weakReference = null;
        }
        weakReference.clear();
        WeakReference weakReference3 = this.f10670a;
        if (weakReference3 == null) {
            o.p("inputMethodServiceContext");
        } else {
            weakReference2 = weakReference3;
        }
        weakReference2.clear();
    }

    public void o(ThemeModel themeModel) {
        Window window;
        o.e(themeModel, "theme");
        WeakReference weakReference = this.f10671b;
        if (weakReference == null) {
            o.p("inputMethodServiceWindow");
            weakReference = null;
        }
        Dialog dialog = (Dialog) weakReference.get();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            try {
                C0403a0.b(window, true);
                window.setNavigationBarColor(themeModel.getBackgroundColor());
                new M0(window, window.getDecorView()).c(themeModel.getAreNavigationBarButtonsDark());
            } catch (Exception e4) {
                Log log = Log.f10572a;
                String localizedMessage = e4.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                log.e("NavigationBarColorHandler", localizedMessage, e4);
                b(window);
            }
        }
    }
}
