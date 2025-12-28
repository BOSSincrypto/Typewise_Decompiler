package m1;

import android.graphics.drawable.Drawable;
import p1.l;

public abstract class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final int f14638a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14639b;

    /* renamed from: c  reason: collision with root package name */
    private com.bumptech.glide.request.c f14640c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public void a() {
    }

    public void b(Drawable drawable) {
    }

    public void c() {
    }

    public final void d(g gVar) {
        gVar.g(this.f14638a, this.f14639b);
    }

    public void e() {
    }

    public final void f(g gVar) {
    }

    public void g(Drawable drawable) {
    }

    public final com.bumptech.glide.request.c i() {
        return this.f14640c;
    }

    public final void k(com.bumptech.glide.request.c cVar) {
        this.f14640c = cVar;
    }

    public c(int i4, int i5) {
        if (l.s(i4, i5)) {
            this.f14638a = i4;
            this.f14639b = i5;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i4 + " and height: " + i5);
    }
}
