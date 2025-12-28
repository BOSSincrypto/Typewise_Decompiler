package ch.icoaching.wrio;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;

public abstract class W {
    public static final int a(View view) {
        o.e(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        Context context = view.getContext();
        o.d(context, "getContext(...)");
        return (C0551o.a(context).y - iArr[1]) - view.getHeight();
    }

    public static final boolean b(View view) {
        o.e(view, "<this>");
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        return !rect.isEmpty();
    }
}
