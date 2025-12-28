package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

public abstract class a {

    /* renamed from: androidx.core.view.animation.a$a  reason: collision with other inner class name */
    static class C0083a {
        static Interpolator a(float f4, float f5) {
            return new PathInterpolator(f4, f5);
        }

        static Interpolator b(float f4, float f5, float f6, float f7) {
            return new PathInterpolator(f4, f5, f6, f7);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f4, float f5, float f6, float f7) {
        return C0083a.b(f4, f5, f6, f7);
    }

    public static Interpolator b(Path path) {
        return C0083a.c(path);
    }
}
