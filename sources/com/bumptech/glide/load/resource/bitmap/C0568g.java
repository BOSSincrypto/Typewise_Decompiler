package com.bumptech.glide.load.resource.bitmap;

import Z0.d;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import p1.k;
import p1.l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g  reason: case insensitive filesystem */
public class C0568g implements s, o {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f11122a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11123b;

    public C0568g(Bitmap bitmap, d dVar) {
        this.f11122a = (Bitmap) k.e(bitmap, "Bitmap must not be null");
        this.f11123b = (d) k.e(dVar, "BitmapPool must not be null");
    }

    public static C0568g f(Bitmap bitmap, d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C0568g(bitmap, dVar);
    }

    public int a() {
        return l.g(this.f11122a);
    }

    public void b() {
        this.f11122a.prepareToDraw();
    }

    public Class c() {
        return Bitmap.class;
    }

    public void d() {
        this.f11123b.d(this.f11122a);
    }

    /* renamed from: e */
    public Bitmap get() {
        return this.f11122a;
    }
}
