package g1;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;

final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static s f(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    public int a() {
        return Math.max(1, this.f13608a.getIntrinsicWidth() * this.f13608a.getIntrinsicHeight() * 4);
    }

    public Class c() {
        return this.f13608a.getClass();
    }

    public void d() {
    }
}
