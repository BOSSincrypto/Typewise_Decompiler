package d0;

import android.os.Build;
import android.view.View;

/* renamed from: d0.K  reason: case insensitive filesystem */
class C0604K extends C0602I {

    /* renamed from: g  reason: collision with root package name */
    private static boolean f13383g = true;

    C0604K() {
    }

    public void f(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i4);
        } else if (f13383g) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f13383g = false;
            }
        }
    }
}
