package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.x  reason: case insensitive filesystem */
public abstract class C0443x {
    public static boolean a(MotionEvent motionEvent, int i4) {
        if ((motionEvent.getSource() & i4) == i4) {
            return true;
        }
        return false;
    }
}
