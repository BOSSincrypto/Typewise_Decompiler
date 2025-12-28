package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import p1.k;

public final class A implements s, o {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f11067a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11068b;

    private A(Resources resources, s sVar) {
        this.f11067a = (Resources) k.d(resources);
        this.f11068b = (s) k.d(sVar);
    }

    public static s f(Resources resources, s sVar) {
        if (sVar == null) {
            return null;
        }
        return new A(resources, sVar);
    }

    public int a() {
        return this.f11068b.a();
    }

    public void b() {
        s sVar = this.f11068b;
        if (sVar instanceof o) {
            ((o) sVar).b();
        }
    }

    public Class c() {
        return BitmapDrawable.class;
    }

    public void d() {
        this.f11068b.d();
    }

    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f11067a, (Bitmap) this.f11068b.get());
    }
}
