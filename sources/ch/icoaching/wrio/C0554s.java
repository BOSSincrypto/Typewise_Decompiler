package ch.icoaching.wrio;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: ch.icoaching.wrio.s  reason: case insensitive filesystem */
public abstract class C0554s {
    public static final float a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        o.e(motionEvent, "<this>");
        o.e(motionEvent2, "other");
        double d4 = (double) 2.0f;
        return (float) Math.sqrt((double) (((float) Math.pow((double) (motionEvent2.getX() - motionEvent.getX()), d4)) + ((float) Math.pow((double) (motionEvent2.getY() - motionEvent.getY()), d4))));
    }
}
