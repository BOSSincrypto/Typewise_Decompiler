package d0;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: d0.M  reason: case insensitive filesystem */
abstract class C0606M {

    /* renamed from: a  reason: collision with root package name */
    private static Field f13384a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f13385b;

    C0606M() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i4, int i5, int i6, int i7);

    public abstract void e(View view, float f4);

    public void f(View view, int i4) {
        if (!f13385b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f13384a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f13385b = true;
        }
        Field field = f13384a;
        if (field != null) {
            try {
                f13384a.setInt(view, i4 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
