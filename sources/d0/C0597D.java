package d0;

import android.view.View;

/* renamed from: d0.D  reason: case insensitive filesystem */
abstract class C0597D extends C0606M {

    /* renamed from: c  reason: collision with root package name */
    private static boolean f13379c = true;

    C0597D() {
    }

    public void a(View view) {
    }

    public float b(View view) {
        if (f13379c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f13379c = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public void e(View view, float f4) {
        if (f13379c) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f13379c = false;
            }
        }
        view.setAlpha(f4);
    }
}
