package i1;

import X0.g;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.C0568g;
import java.security.MessageDigest;
import p1.k;

public class f implements g {

    /* renamed from: b  reason: collision with root package name */
    private final g f13694b;

    public f(g gVar) {
        this.f13694b = (g) k.d(gVar);
    }

    public s a(Context context, s sVar, int i4, int i5) {
        c cVar = (c) sVar.get();
        C0568g gVar = new C0568g(cVar.e(), b.c(context).f());
        s a4 = this.f13694b.a(context, gVar, i4, i5);
        if (!gVar.equals(a4)) {
            gVar.d();
        }
        cVar.m(this.f13694b, (Bitmap) a4.get());
        return sVar;
    }

    public void b(MessageDigest messageDigest) {
        this.f13694b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f13694b.equals(((f) obj).f13694b);
        }
        return false;
    }

    public int hashCode() {
        return this.f13694b.hashCode();
    }
}
