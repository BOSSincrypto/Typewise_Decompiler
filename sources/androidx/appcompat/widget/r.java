package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class r extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3654a;

    /* renamed from: b  reason: collision with root package name */
    private final C0393q f3655b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3656c;

    public r(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            eVar.b();
        }
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        if (!this.f3655b.f() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0393q qVar = this.f3655b;
        if (!(qVar == null || drawable == null || this.f3656c)) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0393q qVar2 = this.f3655b;
        if (qVar2 != null) {
            qVar2.c();
            if (!this.f3656c) {
                this.f3655b.b();
            }
        }
    }

    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f3656c = true;
    }

    public void setImageResource(int i4) {
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.i(i4);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3654a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0393q qVar = this.f3655b;
        if (qVar != null) {
            qVar.k(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        this.f3656c = false;
        Y.a(this, getContext());
        C0381e eVar = new C0381e(this);
        this.f3654a = eVar;
        eVar.e(attributeSet, i4);
        C0393q qVar = new C0393q(this);
        this.f3655b = qVar;
        qVar.g(attributeSet, i4);
    }
}
