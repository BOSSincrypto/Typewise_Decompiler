package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.widget.m;
import n.C0822a;
import o.C0836a;

/* renamed from: androidx.appcompat.widget.s  reason: case insensitive filesystem */
public class C0394s extends MultiAutoCompleteTextView implements m {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f3657d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3658a;

    /* renamed from: b  reason: collision with root package name */
    private final C f3659b;

    /* renamed from: c  reason: collision with root package name */
    private final C0389m f3660c;

    public C0394s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14680m);
    }

    /* access modifiers changed from: package-private */
    public void a(C0389m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a4 = mVar.a(keyListener);
            if (a4 != keyListener) {
                super.setKeyListener(a4);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3659b;
        if (c4 != null) {
            c4.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3659b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3659b.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f3660c.d(C0391o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3659b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3659b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(C0836a.b(getContext(), i4));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f3660c.e(z3);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3660c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3658a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3659b.w(colorStateList);
        this.f3659b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3659b.x(mode);
        this.f3659b.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C c4 = this.f3659b;
        if (c4 != null) {
            c4.q(context, i4);
        }
    }

    public C0394s(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        Y.a(this, getContext());
        c0 v3 = c0.v(getContext(), attributeSet, f3657d, i4, 0);
        if (v3.s(0)) {
            setDropDownBackgroundDrawable(v3.g(0));
        }
        v3.w();
        C0381e eVar = new C0381e(this);
        this.f3658a = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3659b = c4;
        c4.m(attributeSet, i4);
        c4.b();
        C0389m mVar = new C0389m(this);
        this.f3660c = mVar;
        mVar.c(attributeSet, i4);
        a(mVar);
    }
}
