package ch.icoaching.wrio.keyboard.view;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public abstract class P {
    public static final Path a(float f4, float f5, float f6, float f7, float f8) {
        PointF pointF = new PointF(f4, f5);
        float f9 = f6 + f4;
        PointF pointF2 = new PointF(f9, f5);
        float f10 = (f5 + f7) - f8;
        PointF pointF3 = new PointF(f9 - f8, f10);
        PointF pointF4 = new PointF(f4 + f8, f10);
        float f11 = pointF3.x;
        float f12 = pointF3.y;
        RectF rectF = new RectF(f11 - f8, f12 - f8, f11 + f8, f12 + f8);
        float f13 = pointF4.x;
        float f14 = pointF4.y;
        RectF rectF2 = new RectF(f13 - f8, f14 - f8, f13 + f8, f14 + f8);
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.arcTo(rectF, 0.0f, 90.0f);
        path.arcTo(rectF2, 90.0f, 90.0f);
        path.close();
        return path;
    }

    public static final Path b(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (float) 2;
        float f11 = f10 * f9;
        float f12 = f7 - f11;
        float f13 = f4 + f9;
        float f14 = (f6 - f11) + f13;
        float f15 = ((f5 + f9) + f12) - f8;
        PointF pointF = new PointF(f14 - f8, f15);
        PointF pointF2 = new PointF(f13 + f8, f15);
        float f16 = f5 + (f12 / f10) + f9;
        PointF pointF3 = new PointF(f13, f16);
        PointF pointF4 = new PointF(f14, f16);
        float f17 = pointF.x;
        float f18 = pointF.y;
        RectF rectF = new RectF(f17 - f8, f18 - f8, f17 + f8, f18 + f8);
        float f19 = pointF2.x;
        float f20 = pointF2.y;
        RectF rectF2 = new RectF(f19 - f8, f20 - f8, f19 + f8, f20 + f8);
        Path path = new Path();
        path.moveTo(pointF3.x, pointF3.y);
        path.lineTo(pointF4.x, pointF4.y);
        path.arcTo(rectF, 0.0f, 90.0f);
        path.arcTo(rectF2, 90.0f, 90.0f);
        path.close();
        return path;
    }

    public static final Path c(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = ((float) 2) * f9;
        float f11 = f6 - f10;
        float f12 = f7 - f10;
        float f13 = f4 + f9;
        float f14 = f13 + f8;
        float f15 = f5 + f9;
        float f16 = f15 + f8;
        PointF pointF = new PointF(f14, f16);
        float f17 = (f13 + f11) - f8;
        PointF pointF2 = new PointF(f17, f16);
        float f18 = (f15 + f12) - f8;
        PointF pointF3 = new PointF(f17, f18);
        PointF pointF4 = new PointF(f14, f18);
        float f19 = pointF.x;
        float f20 = pointF.y;
        RectF rectF = new RectF(f19 - f8, f20 - f8, f19 + f8, f20 + f8);
        float f21 = pointF2.x;
        float f22 = pointF2.y;
        RectF rectF2 = new RectF(f21 - f8, f22 - f8, f21 + f8, f22 + f8);
        float f23 = pointF3.x;
        float f24 = pointF3.y;
        RectF rectF3 = new RectF(f23 - f8, f24 - f8, f23 + f8, f24 + f8);
        float f25 = pointF4.x;
        float f26 = pointF4.y;
        RectF rectF4 = new RectF(f25 - f8, f26 - f8, f25 + f8, f26 + f8);
        Path path = new Path();
        path.arcTo(rectF, 180.0f, 90.0f);
        path.arcTo(rectF2, 270.0f, 90.0f);
        path.arcTo(rectF3, 0.0f, 90.0f);
        path.arcTo(rectF4, 90.0f, 90.0f);
        return path;
    }

    public static final Path d(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (float) 2;
        float f11 = f10 * f9;
        float f12 = f6 - f11;
        float f13 = f7 - f11;
        float f14 = f4 + f9;
        float f15 = f5 + f9;
        float f16 = f15 + f8;
        PointF pointF = new PointF(f14 + f8, f16);
        float f17 = f12 + f14;
        PointF pointF2 = new PointF(f17 - f8, f16);
        float f18 = f15 + (f13 / f10);
        PointF pointF3 = new PointF(f14, f18);
        PointF pointF4 = new PointF(f17, f18);
        float f19 = pointF.x;
        float f20 = pointF.y;
        RectF rectF = new RectF(f19 - f8, f20 - f8, f19 + f8, f20 + f8);
        float f21 = pointF2.x;
        float f22 = pointF2.y;
        RectF rectF2 = new RectF(f21 - f8, f22 - f8, f21 + f8, f22 + f8);
        Path path = new Path();
        path.moveTo(pointF3.x, pointF3.y);
        path.arcTo(rectF, 180.0f, 90.0f);
        path.arcTo(rectF2, 270.0f, 90.0f);
        path.lineTo(pointF4.x, pointF4.y);
        path.close();
        return path;
    }
}
