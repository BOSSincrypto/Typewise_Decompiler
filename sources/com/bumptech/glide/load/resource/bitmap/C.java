package com.bumptech.glide.load.resource.bitmap;

import X0.e;
import Z0.d;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.engine.s;
import g1.l;

public class C implements e {

    /* renamed from: a  reason: collision with root package name */
    private final l f11070a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11071b;

    public C(l lVar, d dVar) {
        this.f11070a = lVar;
        this.f11071b = dVar;
    }

    /* renamed from: c */
    public s a(Uri uri, int i4, int i5, X0.d dVar) {
        s c4 = this.f11070a.a(uri, i4, i5, dVar);
        if (c4 == null) {
            return null;
        }
        return t.a(this.f11071b, (Drawable) c4.get(), i4, i5);
    }

    /* renamed from: d */
    public boolean b(Uri uri, X0.d dVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
