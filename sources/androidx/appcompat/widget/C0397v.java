package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.l;
import androidx.core.widget.m;
import n.C0822a;
import o.C0836a;

/* renamed from: androidx.appcompat.widget.v  reason: case insensitive filesystem */
public class C0397v extends RadioButton implements l, m {

    /* renamed from: a  reason: collision with root package name */
    private final C0386j f3666a;

    /* renamed from: b  reason: collision with root package name */
    private final C0381e f3667b;

    /* renamed from: c  reason: collision with root package name */
    private final C f3668c;

    /* renamed from: d  reason: collision with root package name */
    private C0390n f3669d;

    public C0397v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14660D);
    }

    private C0390n getEmojiTextViewHelper() {
        if (this.f3669d == null) {
            this.f3669d = new C0390n(this);
        }
        return this.f3669d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3668c;
        if (c4 != null) {
            c4.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            return jVar.b(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3668c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3668c.k();
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            jVar.f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3668c;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3668c;
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
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3667b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0386j jVar = this.f3666a;
        if (jVar != null) {
            jVar.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3668c.w(colorStateList);
        this.f3668c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3668c.x(mode);
        this.f3668c.b();
    }

    public C0397v(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        Y.a(this, getContext());
        C0386j jVar = new C0386j(this);
        this.f3666a = jVar;
        jVar.e(attributeSet, i4);
        C0381e eVar = new C0381e(this);
        this.f3667b = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3668c = c4;
        c4.m(attributeSet, i4);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    public void setButtonDrawable(int i4) {
        setButtonDrawable(C0836a.b(getContext(), i4));
    }
}
