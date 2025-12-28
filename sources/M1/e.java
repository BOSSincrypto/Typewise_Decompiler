package m1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import n1.C0828b;

public abstract class e extends i implements C0828b.a {

    /* renamed from: h  reason: collision with root package name */
    private Animatable f14641h;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void p(Object obj) {
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f14641h = animatable;
            animatable.start();
            return;
        }
        this.f14641h = null;
    }

    private void s(Object obj) {
        r(obj);
        p(obj);
    }

    public void a() {
        Animatable animatable = this.f14641h;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void b(Drawable drawable) {
        super.b(drawable);
        s((Object) null);
        q(drawable);
    }

    public void c() {
        Animatable animatable = this.f14641h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void g(Drawable drawable) {
        super.g(drawable);
        s((Object) null);
        q(drawable);
    }

    public void h(Object obj, C0828b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            s(obj);
        } else {
            p(obj);
        }
    }

    public void j(Drawable drawable) {
        super.j(drawable);
        Animatable animatable = this.f14641h;
        if (animatable != null) {
            animatable.stop();
        }
        s((Object) null);
        q(drawable);
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f14644a).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public abstract void r(Object obj);
}
