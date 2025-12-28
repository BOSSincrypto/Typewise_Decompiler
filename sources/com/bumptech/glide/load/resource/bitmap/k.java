package com.bumptech.glide.load.resource.bitmap;

import X0.d;
import X0.e;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.s;
import java.nio.ByteBuffer;

public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C0567f f11125a = new C0567f();

    /* renamed from: c */
    public s a(ByteBuffer byteBuffer, int i4, int i5, d dVar) {
        return this.f11125a.c(ImageDecoder.createSource(byteBuffer), i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(ByteBuffer byteBuffer, d dVar) {
        return true;
    }
}
