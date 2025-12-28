package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2364a = new a();

    private a() {
    }

    public final BackEvent a(float f4, float f5, float f6, int i4) {
        return new BackEvent(f4, f5, f6, i4);
    }

    public final float b(BackEvent backEvent) {
        o.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        o.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        o.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        o.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
