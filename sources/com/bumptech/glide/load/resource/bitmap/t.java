package com.bumptech.glide.load.resource.bitmap;

import Z0.d;
import Z0.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import java.util.concurrent.locks.Lock;

abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private static final d f11142a = new a();

    class a extends e {
        a() {
        }

        public void d(Bitmap bitmap) {
        }
    }

    static s a(d dVar, Drawable drawable, int i4, int i5) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z3 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(dVar, current, i4, i5);
            z3 = true;
        } else {
            bitmap = null;
        }
        if (!z3) {
            dVar = f11142a;
        }
        return C0568g.f(bitmap, dVar);
    }

    private static Bitmap b(d dVar, Drawable drawable, int i4, int i5) {
        if (i4 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i5 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i4 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i5 = drawable.getIntrinsicHeight();
            }
            Lock f4 = E.f();
            f4.lock();
            Bitmap c4 = dVar.c(i4, i5, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c4);
                drawable.setBounds(0, 0, i4, i5);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return c4;
            } finally {
                f4.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
