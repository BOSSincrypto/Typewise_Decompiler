package com.bumptech.glide.load.resource.bitmap;

import Z0.d;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class E {

    /* renamed from: a  reason: collision with root package name */
    private static final Paint f11091a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f11092b = new Paint(7);

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f11093c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set f11094d;

    /* renamed from: e  reason: collision with root package name */
    private static final Lock f11095e;

    private static final class a implements Lock {
        a() {
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public void unlock() {
        }

        public boolean tryLock(long j4, TimeUnit timeUnit) {
            return true;
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f11094d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new a();
        }
        f11095e = lock;
        Paint paint = new Paint(7);
        f11093c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f11095e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f11091a);
            d(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f11095e.unlock();
            throw th;
        }
    }

    public static Bitmap b(d dVar, Bitmap bitmap, int i4, int i5) {
        float f4;
        float f5;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f6 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i4) {
            f5 = ((float) i5) / ((float) bitmap.getHeight());
            f6 = (((float) i4) - (((float) bitmap.getWidth()) * f5)) * 0.5f;
            f4 = 0.0f;
        } else {
            f5 = ((float) i4) / ((float) bitmap.getWidth());
            f4 = (((float) i5) - (((float) bitmap.getHeight()) * f5)) * 0.5f;
        }
        matrix.setScale(f5, f5);
        matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (f4 + 0.5f)));
        Bitmap c4 = dVar.c(i4, i5, h(bitmap));
        l(bitmap, c4);
        a(bitmap, c4, matrix);
        return c4;
    }

    public static Bitmap c(d dVar, Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() > i4 || bitmap.getHeight() > i5) {
            Log.isLoggable("TransformationUtils", 2);
            return e(dVar, bitmap, i4, i5);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    public static Bitmap e(d dVar, Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(((float) i4) / ((float) bitmap.getWidth()), ((float) i5) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap c4 = dVar.c((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), h(bitmap));
        l(bitmap, c4);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(c4.getWidth());
            sb3.append("x");
            sb3.append(c4.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, c4, matrix);
        return c4;
    }

    public static Lock f() {
        return f11095e;
    }

    public static int g(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    private static Bitmap.Config h(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    static void i(int i4, Matrix matrix) {
        switch (i4) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean j(int i4) {
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap k(d dVar, Bitmap bitmap, int i4) {
        if (!j(i4)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        i(i4, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap c4 = dVar.c(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        c4.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, c4, matrix);
        return c4;
    }

    public static void l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
