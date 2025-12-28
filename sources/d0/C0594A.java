package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.P;

/* renamed from: d0.A  reason: case insensitive filesystem */
abstract class C0594A {

    /* renamed from: a  reason: collision with root package name */
    private static final C0606M f13376a;

    /* renamed from: b  reason: collision with root package name */
    static final Property f13377b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    static final Property f13378c = new b(Rect.class, "clipBounds");

    /* renamed from: d0.A$a */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0594A.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f4) {
            C0594A.g(view, f4.floatValue());
        }
    }

    /* renamed from: d0.A$b */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return P.u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            P.v0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f13376a = new C0605L();
        } else {
            f13376a = new C0604K();
        }
    }

    static void a(View view) {
        f13376a.a(view);
    }

    static C0635z b(View view) {
        return new C0634y(view);
    }

    static float c(View view) {
        return f13376a.b(view);
    }

    static C0609P d(View view) {
        return new C0608O(view);
    }

    static void e(View view) {
        f13376a.c(view);
    }

    static void f(View view, int i4, int i5, int i6, int i7) {
        f13376a.d(view, i4, i5, i6, i7);
    }

    static void g(View view, float f4) {
        f13376a.e(view, f4);
    }

    static void h(View view, int i4) {
        f13376a.f(view, i4);
    }

    static void i(View view, Matrix matrix) {
        f13376a.g(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f13376a.h(view, matrix);
    }
}
