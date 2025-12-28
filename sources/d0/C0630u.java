package d0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: d0.u  reason: case insensitive filesystem */
class C0630u implements C0631v {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f13529a;

    C0630u(ViewGroup viewGroup) {
        this.f13529a = viewGroup.getOverlay();
    }

    public void a(View view) {
        this.f13529a.add(view);
    }

    public void b(Drawable drawable) {
        this.f13529a.add(drawable);
    }

    public void c(View view) {
        this.f13529a.remove(view);
    }

    public void d(Drawable drawable) {
        this.f13529a.remove(drawable);
    }
}
