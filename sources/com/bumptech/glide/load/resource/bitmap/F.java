package com.bumptech.glide.load.resource.bitmap;

import X0.d;
import X0.e;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.s;
import p1.l;

public final class F implements e {

    private static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f11096a;

        a(Bitmap bitmap) {
            this.f11096a = bitmap;
        }

        public int a() {
            return l.g(this.f11096a);
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f11096a;
        }

        public Class c() {
            return Bitmap.class;
        }

        public void d() {
        }
    }

    /* renamed from: c */
    public s a(Bitmap bitmap, int i4, int i5, d dVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean b(Bitmap bitmap, d dVar) {
        return true;
    }
}
