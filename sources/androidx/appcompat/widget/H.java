package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.widget.m;

public class H extends ToggleButton implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3209a;

    /* renamed from: b  reason: collision with root package name */
    private final C f3210b;

    /* renamed from: c  reason: collision with root package name */
    private C0390n f3211c;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private C0390n getEmojiTextViewHelper() {
        if (this.f3211c == null) {
            this.f3211c = new C0390n(this);
        }
        return this.f3211c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3210b;
        if (c4 != null) {
            c4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3210b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3210b.k();
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3210b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3210b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3209a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3210b.w(colorStateList);
        this.f3210b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3210b.x(mode);
        this.f3210b.b();
    }

    public H(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Y.a(this, getContext());
        C0381e eVar = new C0381e(this);
        this.f3209a = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3210b = c4;
        c4.m(attributeSet, i4);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }
}
