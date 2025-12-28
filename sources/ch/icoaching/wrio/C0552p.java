package ch.icoaching.wrio;

import android.content.res.Resources;

/* renamed from: ch.icoaching.wrio.p  reason: case insensitive filesystem */
public abstract class C0552p {
    public static final int a(float f4) {
        return (int) (f4 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float b(float f4) {
        return f4 * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float c(float f4) {
        return f4 / Resources.getSystem().getDisplayMetrics().density;
    }
}
