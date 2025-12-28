package com.bumptech.glide.load.resource.bitmap;

import X0.b;
import Z0.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class l extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f11126b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(b.f1934a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f11126b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i4, int i5) {
        return E.b(dVar, bitmap, i4, i5);
    }

    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    public int hashCode() {
        return -599754482;
    }
}
