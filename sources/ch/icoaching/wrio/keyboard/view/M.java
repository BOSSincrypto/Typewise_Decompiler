package ch.icoaching.wrio.keyboard.view;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public abstract class M {
    public static final Path a(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (float) 2;
        float f11 = f7 / f10;
        float sqrt = (f11 - (f9 * (f10 / ((float) Math.sqrt((double) 3.0f))))) - ((float) (((double) f8) / Math.cos(0.5235987755982988d)));
        PointF pointF = new PointF(f4 + (f6 / f10), f5 + f11);
        PointF pointF2 = new PointF(pointF.x, pointF.y - sqrt);
        PointF pointF3 = new PointF(pointF.x + (((float) Math.cos(0.5235987755982988d)) * sqrt), pointF.y - (((float) Math.sin(0.5235987755982988d)) * sqrt));
        PointF pointF4 = new PointF(pointF.x + (((float) Math.cos(0.5235987755982988d)) * sqrt), pointF.y + (((float) Math.sin(0.5235987755982988d)) * sqrt));
        PointF pointF5 = new PointF(pointF.x, pointF.y + sqrt);
        PointF pointF6 = new PointF(pointF.x - (((float) Math.cos(0.5235987755982988d)) * sqrt), pointF.y + (((float) Math.sin(0.5235987755982988d)) * sqrt));
        PointF pointF7 = new PointF(pointF.x - (((float) Math.cos(0.5235987755982988d)) * sqrt), pointF.y - (((float) Math.sin(0.5235987755982988d)) * sqrt));
        PointF pointF8 = new PointF(pointF2.x - (((float) Math.cos(1.0471975511965976d)) * f8), pointF2.y - (((float) Math.sin(1.0471975511965976d)) * f8));
        float f12 = pointF2.x;
        float f13 = pointF2.y;
        RectF rectF = new RectF(f12 - f8, f13 - f8, f12 + f8, f13 + f8);
        float f14 = pointF3.x;
        float f15 = pointF3.y;
        RectF rectF2 = new RectF(f14 - f8, f15 - f8, f14 + f8, f15 + f8);
        float f16 = pointF4.x;
        float f17 = pointF4.y;
        RectF rectF3 = new RectF(f16 - f8, f17 - f8, f16 + f8, f17 + f8);
        float f18 = pointF5.x;
        float f19 = pointF5.y;
        RectF rectF4 = new RectF(f18 - f8, f19 - f8, f18 + f8, f19 + f8);
        float f20 = pointF6.x;
        float f21 = pointF6.y;
        RectF rectF5 = new RectF(f20 - f8, f21 - f8, f20 + f8, f21 + f8);
        float f22 = pointF7.x;
        float f23 = pointF7.y;
        RectF rectF6 = new RectF(f22 - f8, f23 - f8, f22 + f8, f23 + f8);
        Path path = new Path();
        path.moveTo(pointF8.x, pointF8.y);
        path.arcTo(rectF, 240.0f, 60.0f);
        path.arcTo(rectF2, 300.0f, 60.0f);
        path.arcTo(rectF3, 0.0f, 60.0f);
        path.arcTo(rectF4, 60.0f, 60.0f);
        path.arcTo(rectF5, 120.0f, 60.0f);
        path.arcTo(rectF6, 180.0f, 60.0f);
        path.close();
        return path;
    }

    public static final Path b(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = (float) 2;
        float sqrt = f10 * (f11 / ((float) Math.sqrt((double) 3.0f)));
        float f12 = f7 / f11;
        float f13 = f12 - sqrt;
        float cos = f13 - ((float) (((double) f9) / Math.cos(0.5235987755982988d)));
        float f14 = sqrt + f5 + (f13 * f11 * f8);
        PointF pointF = new PointF(f4 + (f6 / f11), f5 + f12);
        PointF pointF2 = new PointF(pointF.x + (((float) Math.cos(0.5235987755982988d)) * cos), pointF.y + (((float) Math.sin(0.5235987755982988d)) * cos));
        PointF pointF3 = new PointF(pointF.x, pointF.y + cos);
        PointF pointF4 = new PointF(pointF.x - (((float) Math.cos(0.5235987755982988d)) * cos), pointF.y + (((float) Math.sin(0.5235987755982988d)) * cos));
        PointF pointF5 = new PointF(pointF2.x + f9, f14);
        PointF pointF6 = new PointF(pointF4.x - f9, f14);
        float f15 = pointF2.x;
        float f16 = pointF2.y;
        RectF rectF = new RectF(f15 - f9, f16 - f9, f15 + f9, f16 + f9);
        float f17 = pointF3.x;
        float f18 = pointF3.y;
        RectF rectF2 = new RectF(f17 - f9, f18 - f9, f17 + f9, f18 + f9);
        float f19 = pointF4.x;
        float f20 = pointF4.y;
        RectF rectF3 = new RectF(f19 - f9, f20 - f9, f19 + f9, f20 + f9);
        Path path = new Path();
        path.moveTo(pointF5.x, pointF5.y);
        path.arcTo(rectF, 0.0f, 60.0f);
        path.arcTo(rectF2, 60.0f, 60.0f);
        path.arcTo(rectF3, 120.0f, 60.0f);
        path.lineTo(pointF6.x, pointF6.y);
        path.close();
        return path;
    }

    public static final Path c(float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = (float) 2;
        float sqrt = ((float) (((double) (((float) 1) * f6)) / (Math.sqrt(3.0d) / ((double) 2)))) / f10;
        float cos = sqrt - ((float) (((double) f8) / Math.cos(0.5235987755982988d)));
        PointF pointF = new PointF((f6 / f10) + f4, (f7 + f5) - sqrt);
        PointF pointF2 = new PointF(f4, f5);
        PointF pointF3 = new PointF(f4 + f6, f5);
        PointF pointF4 = new PointF(pointF.x + (((float) Math.cos(0.5235987755982988d)) * cos), (pointF.y + (((float) Math.sin(0.5235987755982988d)) * cos)) - f9);
        PointF pointF5 = new PointF(pointF.x, (pointF.y + cos) - f9);
        PointF pointF6 = new PointF(pointF.x - (((float) Math.cos(0.5235987755982988d)) * cos), (pointF.y + (((float) Math.sin(0.5235987755982988d)) * cos)) - f9);
        float f11 = pointF4.x;
        float f12 = pointF4.y;
        RectF rectF = new RectF(f11 - f8, f12 - f8, f11 + f8, f12 + f8);
        float f13 = pointF5.x;
        float f14 = pointF5.y;
        RectF rectF2 = new RectF(f13 - f8, f14 - f8, f13 + f8, f14 + f8);
        float f15 = pointF6.x;
        float f16 = pointF6.y;
        RectF rectF3 = new RectF(f15 - f8, f16 - f8, f15 + f8, f16 + f8);
        Path path = new Path();
        path.moveTo(pointF2.x, pointF2.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.arcTo(rectF, 0.0f, 60.0f);
        path.arcTo(rectF2, 60.0f, 60.0f);
        path.arcTo(rectF3, 120.0f, 60.0f);
        path.close();
        return path;
    }

    public static final Path d(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11 = (float) 2;
        float sqrt = f10 * (f11 / ((float) Math.sqrt((double) 3.0f)));
        float f12 = f7 / f11;
        float f13 = f12 - sqrt;
        float cos = f13 - ((float) (((double) f9) / Math.cos(0.5235987755982988d)));
        float f14 = sqrt + f5 + (f13 * f11 * f8);
        PointF pointF = new PointF(f4 + (f6 / f11), f5 + f12);
        PointF pointF2 = new PointF(pointF.x, pointF.y - cos);
        PointF pointF3 = new PointF(pointF.x + (((float) Math.cos(0.5235987755982988d)) * cos), pointF.y - (((float) Math.sin(0.5235987755982988d)) * cos));
        PointF pointF4 = new PointF(pointF.x - (((float) Math.cos(0.5235987755982988d)) * cos), pointF.y - (((float) Math.sin(0.5235987755982988d)) * cos));
        float f15 = pointF2.x;
        float f16 = pointF2.y;
        RectF rectF = new RectF(f15 - f9, f16 - f9, f15 + f9, f16 + f9);
        float f17 = pointF3.x;
        float f18 = pointF3.y;
        RectF rectF2 = new RectF(f17 - f9, f18 - f9, f17 + f9, f18 + f9);
        PointF pointF5 = new PointF(pointF3.x + f9, f14);
        PointF pointF6 = new PointF(pointF4.x - f9, f14);
        float f19 = pointF4.x;
        float f20 = pointF4.y;
        RectF rectF3 = new RectF(f19 - f9, f20 - f9, f19 + f9, f20 + f9);
        Path path = new Path();
        path.moveTo(pointF6.x, pointF6.y);
        path.arcTo(rectF3, 180.0f, 60.0f);
        path.arcTo(rectF, 240.0f, 60.0f);
        path.arcTo(rectF2, 300.0f, 60.0f);
        path.lineTo(pointF5.x, pointF5.y);
        path.close();
        return path;
    }
}
