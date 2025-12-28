package com.bumptech.glide.load.resource.bitmap;

import X0.d;
import X0.e;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.engine.s;
import java.io.InputStream;
import p1.C0851a;

public final class z implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C0567f f11166a = new C0567f();

    /* renamed from: c */
    public s a(InputStream inputStream, int i4, int i5, d dVar) {
        return this.f11166a.c(ImageDecoder.createSource(C0851a.b(inputStream)), i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, d dVar) {
        return true;
    }
}
