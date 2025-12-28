package com.bumptech.glide.load.resource.bitmap;

import X0.d;
import X0.e;
import android.content.res.Resources;
import com.bumptech.glide.load.engine.s;
import p1.k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a  reason: case insensitive filesystem */
public class C0562a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f11114a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f11115b;

    public C0562a(Resources resources, e eVar) {
        this.f11115b = (Resources) k.d(resources);
        this.f11114a = (e) k.d(eVar);
    }

    public s a(Object obj, int i4, int i5, d dVar) {
        return A.f(this.f11115b, this.f11114a.a(obj, i4, i5, dVar));
    }

    public boolean b(Object obj, d dVar) {
        return this.f11114a.b(obj, dVar);
    }
}
