package com.bumptech.glide.load.resource.bitmap;

import X0.f;
import Z0.d;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.s;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b  reason: case insensitive filesystem */
public class C0563b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f11116a;

    /* renamed from: b  reason: collision with root package name */
    private final f f11117b;

    public C0563b(d dVar, f fVar) {
        this.f11116a = dVar;
        this.f11117b = fVar;
    }

    public EncodeStrategy b(X0.d dVar) {
        return this.f11117b.b(dVar);
    }

    /* renamed from: c */
    public boolean a(s sVar, File file, X0.d dVar) {
        return this.f11117b.a(new C0568g(((BitmapDrawable) sVar.get()).getBitmap(), this.f11116a), file, dVar);
    }
}
