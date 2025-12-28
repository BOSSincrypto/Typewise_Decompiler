package O1;

import Q1.g;
import Q1.k;
import Q1.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class a extends Drawable implements n {

    /* renamed from: a  reason: collision with root package name */
    private b f1062a;

    /* renamed from: a */
    public a mutate() {
        this.f1062a = new b(this.f1062a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f1062a;
        if (bVar.f1064b) {
            bVar.f1063a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1062a;
    }

    public int getOpacity() {
        return this.f1062a.f1063a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1062a.f1063a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f1062a.f1063a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b4 = b.b(iArr);
        b bVar = this.f1062a;
        if (bVar.f1064b == b4) {
            return onStateChange;
        }
        bVar.f1064b = b4;
        return true;
    }

    public void setAlpha(int i4) {
        this.f1062a.f1063a.setAlpha(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1062a.f1063a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f1062a.f1063a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i4) {
        this.f1062a.f1063a.setTint(i4);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1062a.f1063a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1062a.f1063a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f1063a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1064b;

        public b(g gVar) {
            this.f1063a = gVar;
            this.f1064b = false;
        }

        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f1063a = (g) bVar.f1063a.getConstantState().newDrawable();
            this.f1064b = bVar.f1064b;
        }
    }

    private a(b bVar) {
        this.f1062a = bVar;
    }
}
