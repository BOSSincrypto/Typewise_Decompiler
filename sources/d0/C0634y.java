package d0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: d0.y  reason: case insensitive filesystem */
class C0634y implements C0635z {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f13531a;

    C0634y(View view) {
        this.f13531a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.f13531a.add(drawable);
    }

    public void d(Drawable drawable) {
        this.f13531a.remove(drawable);
    }
}
