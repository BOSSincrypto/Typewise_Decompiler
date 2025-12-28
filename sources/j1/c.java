package j1;

import Z0.d;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.bitmap.C0568g;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final d f13751a;

    /* renamed from: b  reason: collision with root package name */
    private final e f13752b;

    /* renamed from: c  reason: collision with root package name */
    private final e f13753c;

    public c(d dVar, e eVar, e eVar2) {
        this.f13751a = dVar;
        this.f13752b = eVar;
        this.f13753c = eVar2;
    }

    private static s b(s sVar) {
        return sVar;
    }

    public s a(s sVar, X0.d dVar) {
        Drawable drawable = (Drawable) sVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f13752b.a(C0568g.f(((BitmapDrawable) drawable).getBitmap(), this.f13751a), dVar);
        }
        if (drawable instanceof i1.c) {
            return this.f13753c.a(b(sVar), dVar);
        }
        return null;
    }
}
