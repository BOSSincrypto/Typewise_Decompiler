package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.j;
import androidx.core.widget.m;
import n.C0822a;
import o.C0836a;

/* renamed from: androidx.appcompat.widget.h  reason: case insensitive filesystem */
public class C0384h extends CheckedTextView implements m {

    /* renamed from: a  reason: collision with root package name */
    private final C0385i f3585a;

    /* renamed from: b  reason: collision with root package name */
    private final C0381e f3586b;

    /* renamed from: c  reason: collision with root package name */
    private final C f3587c;

    /* renamed from: d  reason: collision with root package name */
    private C0390n f3588d;

    public C0384h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14683p);
    }

    private C0390n getEmojiTextViewHelper() {
        if (this.f3588d == null) {
            this.f3588d = new C0390n(this);
        }
        return this.f3588d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C c4 = this.f3587c;
        if (c4 != null) {
            c4.b();
        }
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            eVar.b();
        }
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3587c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3587c.k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0391o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            iVar.e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3587c;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3587c;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().d(z3);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3586b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            iVar.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0385i iVar = this.f3585a;
        if (iVar != null) {
            iVar.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3587c.w(colorStateList);
        this.f3587c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3587c.x(mode);
        this.f3587c.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C c4 = this.f3587c;
        if (c4 != null) {
            c4.q(context, i4);
        }
    }

    public C0384h(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        Y.a(this, getContext());
        C c4 = new C(this);
        this.f3587c = c4;
        c4.m(attributeSet, i4);
        c4.b();
        C0381e eVar = new C0381e(this);
        this.f3586b = eVar;
        eVar.e(attributeSet, i4);
        C0385i iVar = new C0385i(this);
        this.f3585a = iVar;
        iVar.d(attributeSet, i4);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    public void setCheckMarkDrawable(int i4) {
        setCheckMarkDrawable(C0836a.b(getContext(), i4));
    }
}
