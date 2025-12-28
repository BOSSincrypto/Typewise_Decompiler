package ch.icoaching.wrio.keyboard.view;

import android.graphics.PointF;
import android.view.MotionEvent;
import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
import kotlin.jvm.internal.o;

public abstract class N {
    public static final PointF b(KeyboardLayoutView.b bVar) {
        o.e(bVar, "<this>");
        return new PointF(bVar.c().x + ((float) (bVar.g().getWidth() / 2)), bVar.c().y + ((float) (bVar.g().getHeight() / 2)));
    }

    /* access modifiers changed from: private */
    public static final PointF c(MotionEvent motionEvent, int i4) {
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex > -1) {
            return new PointF(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        }
        return new PointF(motionEvent.getX(), motionEvent.getY());
    }
}
