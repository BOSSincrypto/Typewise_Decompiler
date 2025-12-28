package g1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;
import i1.c;
import p1.k;

public abstract class j implements s, o {

    /* renamed from: a  reason: collision with root package name */
    protected final Drawable f13608a;

    public j(Drawable drawable) {
        this.f13608a = (Drawable) k.d(drawable);
    }

    public void b() {
        Drawable drawable = this.f13608a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof c) {
            ((c) drawable).e().prepareToDraw();
        }
    }

    /* renamed from: e */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f13608a.getConstantState();
        if (constantState == null) {
            return this.f13608a;
        }
        return constantState.newDrawable();
    }
}
