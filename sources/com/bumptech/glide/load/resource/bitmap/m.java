package com.bumptech.glide.load.resource.bitmap;

import X0.b;
import Z0.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class m extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f11127b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(b.f1934a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f11127b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i4, int i5) {
        return E.c(dVar, bitmap, i4, i5);
    }

    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    public int hashCode() {
        return -670243078;
    }
}
