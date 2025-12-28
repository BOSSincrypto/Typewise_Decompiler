package com.bumptech.glide.load.resource.bitmap;

import X0.e;
import Z0.d;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import e1.l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f  reason: case insensitive filesystem */
public final class C0567f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final d f11121a = new Z0.e();

    public /* bridge */ /* synthetic */ s a(Object obj, int i4, int i5, X0.d dVar) {
        return c(C0565d.a(obj), i4, i5, dVar);
    }

    public /* bridge */ /* synthetic */ boolean b(Object obj, X0.d dVar) {
        return d(C0565d.a(obj), dVar);
    }

    public s c(ImageDecoder.Source source, int i4, int i5, X0.d dVar) {
        Bitmap a4 = ImageDecoder.decodeBitmap(source, new l(i4, i5, dVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Decoded [");
            sb.append(a4.getWidth());
            sb.append("x");
            sb.append(a4.getHeight());
            sb.append("] for [");
            sb.append(i4);
            sb.append("x");
            sb.append(i5);
            sb.append("]");
        }
        return new C0568g(a4, this.f11121a);
    }

    public boolean d(ImageDecoder.Source source, X0.d dVar) {
        return true;
    }
}
