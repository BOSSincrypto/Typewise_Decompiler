package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class b0 extends U {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f3510b;

    public b0(Context context, Resources resources) {
        super(resources);
        this.f3510b = new WeakReference(context);
    }

    public Drawable getDrawable(int i4) {
        Drawable a4 = a(i4);
        Context context = (Context) this.f3510b.get();
        if (!(a4 == null || context == null)) {
            T.h().x(context, i4, a4);
        }
        return a4;
    }
}
