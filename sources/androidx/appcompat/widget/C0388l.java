package androidx.appcompat.widget;

import J.c;
import J.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0412d;
import androidx.core.view.E;
import androidx.core.view.P;
import androidx.core.widget.j;
import androidx.core.widget.k;
import androidx.core.widget.m;
import n.C0822a;

/* renamed from: androidx.appcompat.widget.l  reason: case insensitive filesystem */
public class C0388l extends EditText implements E, m {

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3624a;

    /* renamed from: b  reason: collision with root package name */
    private final C f3625b;

    /* renamed from: c  reason: collision with root package name */
    private final B f3626c;

    /* renamed from: d  reason: collision with root package name */
    private final k f3627d;

    /* renamed from: e  reason: collision with root package name */
    private final C0389m f3628e;

    /* renamed from: f  reason: collision with root package name */
    private a f3629f;

    /* renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C0388l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C0388l.super.setTextClassifier(textClassifier);
        }
    }

    public C0388l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14692y);
    }

    private a getSuperCaller() {
        if (this.f3629f == null) {
            this.f3629f = new a();
        }
        return this.f3629f;
    }

    public C0412d a(C0412d dVar) {
        return this.f3627d.a(this, dVar);
    }

    /* access modifiers changed from: package-private */
    public void d(C0389m mVar) {
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
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3625b;
        if (c4 != null) {
            c4.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3625b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3625b.k();
    }

    public TextClassifier getTextClassifier() {
        B b4;
        if (Build.VERSION.SDK_INT >= 28 || (b4 = this.f3626c) == null) {
            return getSuperCaller().a();
        }
        return b4.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3625b.r(this, onCreateInputConnection, editorInfo);
        InputConnection a4 = C0391o.a(onCreateInputConnection, editorInfo, this);
        if (!(a4 == null || Build.VERSION.SDK_INT > 30 || (E3 = P.E(this)) == null)) {
            c.d(editorInfo, E3);
            a4 = e.c(this, a4, editorInfo);
        }
        return this.f3628e.d(a4, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0399x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i4) {
        if (C0399x.b(this, i4)) {
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3625b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3625b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f3628e.e(z3);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3628e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3624a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3625b.w(colorStateList);
        this.f3625b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3625b.x(mode);
        this.f3625b.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C c4 = this.f3625b;
        if (c4 != null) {
            c4.q(context, i4);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        B b4;
        if (Build.VERSION.SDK_INT >= 28 || (b4 = this.f3626c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b4.b(textClassifier);
        }
    }

    public C0388l(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        Y.a(this, getContext());
        C0381e eVar = new C0381e(this);
        this.f3624a = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3625b = c4;
        c4.m(attributeSet, i4);
        c4.b();
        this.f3626c = new B(this);
        this.f3627d = new k();
        C0389m mVar = new C0389m(this);
        this.f3628e = mVar;
        mVar.c(attributeSet, i4);
        d(mVar);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
