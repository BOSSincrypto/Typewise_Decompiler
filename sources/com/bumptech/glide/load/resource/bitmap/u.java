package com.bumptech.glide.load.resource.bitmap;

import X0.g;
import Z0.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.s;
import java.security.MessageDigest;

public class u implements g {

    /* renamed from: b  reason: collision with root package name */
    private final g f11143b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11144c;

    public u(g gVar, boolean z3) {
        this.f11143b = gVar;
        this.f11144c = z3;
    }

    private s d(Context context, s sVar) {
        return A.f(context.getResources(), sVar);
    }

    public s a(Context context, s sVar, int i4, int i5) {
        d f4 = b.c(context).f();
        Drawable drawable = (Drawable) sVar.get();
        s a4 = t.a(f4, drawable, i4, i5);
        if (a4 != null) {
            s a5 = this.f11143b.a(context, a4, i4, i5);
            if (!a5.equals(a4)) {
                return d(context, a5);
            }
            a5.d();
            return sVar;
        } else if (!this.f11144c) {
            return sVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void b(MessageDigest messageDigest) {
        this.f11143b.b(messageDigest);
    }

    public g c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f11143b.equals(((u) obj).f11143b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11143b.hashCode();
    }
}
