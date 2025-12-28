package Q1;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.m;

public abstract class h {
    static d a(int i4) {
        if (i4 == 0) {
            return new j();
        }
        if (i4 != 1) {
            return b();
        }
        return new e();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f4) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).S(f4);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.L()) {
            gVar.W(m.f(view));
        }
    }
}
