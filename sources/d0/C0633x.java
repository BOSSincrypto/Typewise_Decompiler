package d0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: d0.x  reason: case insensitive filesystem */
abstract class C0633x {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13530a = true;

    static C0631v a(ViewGroup viewGroup) {
        return new C0630u(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z3) {
        if (f13530a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f13530a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else {
            b(viewGroup, z3);
        }
    }
}
