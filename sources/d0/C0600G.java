package d0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: d0.G  reason: case insensitive filesystem */
abstract class C0600G extends C0597D {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f13380d = true;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f13381e = true;

    C0600G() {
    }

    public void g(View view, Matrix matrix) {
        if (f13380d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f13380d = false;
            }
        }
    }

    public void h(View view, Matrix matrix) {
        if (f13381e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f13381e = false;
            }
        }
    }
}
