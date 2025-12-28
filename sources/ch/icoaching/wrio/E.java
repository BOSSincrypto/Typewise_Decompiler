package ch.icoaching.wrio;

import android.content.res.Resources;
import kotlin.jvm.internal.o;

public abstract class E {
    public static final int a(Resources resources) {
        o.e(resources, "<this>");
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final int b(Resources resources) {
        o.e(resources, "<this>");
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
