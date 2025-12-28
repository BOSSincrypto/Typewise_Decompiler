package ch.icoaching.wrio;

import android.content.res.Resources;

/* renamed from: ch.icoaching.wrio.q  reason: case insensitive filesystem */
public abstract class C0553q {
    public static final int a(int i4) {
        return (int) ((((float) i4) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final int b(int i4) {
        return (int) ((((float) i4) * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
