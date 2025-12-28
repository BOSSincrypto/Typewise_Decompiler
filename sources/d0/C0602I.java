package d0;

import android.view.View;

/* renamed from: d0.I  reason: case insensitive filesystem */
abstract class C0602I extends C0600G {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f13382f = true;

    C0602I() {
    }

    public void d(View view, int i4, int i5, int i6, int i7) {
        if (f13382f) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f13382f = false;
            }
        }
    }
}
