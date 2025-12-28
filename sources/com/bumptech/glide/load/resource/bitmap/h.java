package com.bumptech.glide.load.resource.bitmap;

import X0.g;
import Z0.d;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.s;
import p1.l;

public abstract class h implements g {
    public final s a(Context context, s sVar, int i4, int i5) {
        if (l.s(i4, i5)) {
            d f4 = b.c(context).f();
            Bitmap bitmap = (Bitmap) sVar.get();
            if (i4 == Integer.MIN_VALUE) {
                i4 = bitmap.getWidth();
            }
            if (i5 == Integer.MIN_VALUE) {
                i5 = bitmap.getHeight();
            }
            Bitmap c4 = c(f4, bitmap, i4, i5);
            if (bitmap.equals(c4)) {
                return sVar;
            }
            return C0568g.f(c4, f4);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i4 + " or height: " + i5 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(d dVar, Bitmap bitmap, int i4, int i5);
}
