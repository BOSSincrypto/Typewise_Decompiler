package ch.icoaching.wrio;

import android.graphics.PointF;
import kotlin.jvm.internal.o;

/* renamed from: ch.icoaching.wrio.x  reason: case insensitive filesystem */
public abstract class C0559x {
    public static final float a(PointF pointF, PointF pointF2) {
        o.e(pointF, "<this>");
        o.e(pointF2, "other");
        double d4 = (double) 2.0f;
        return (float) Math.sqrt((double) (((float) Math.pow((double) (pointF2.x - pointF.x), d4)) + ((float) Math.pow((double) (pointF2.y - pointF.y), d4))));
    }

    public static final float b(PointF pointF, PointF pointF2, PointF pointF3) {
        o.e(pointF, "<this>");
        o.e(pointF2, "startPoint");
        o.e(pointF3, "endPoint");
        float f4 = pointF3.x;
        float f5 = pointF2.x;
        float f6 = pointF2.y;
        double d4 = (double) 2;
        return Math.abs(((f4 - f5) * (f6 - pointF.y)) - ((f5 - pointF.x) * (pointF3.y - f6))) / ((float) Math.sqrt((double) (((float) Math.pow((double) (pointF3.x - pointF2.x), d4)) + ((float) Math.pow((double) (pointF3.y - pointF2.y), d4)))));
    }
}
