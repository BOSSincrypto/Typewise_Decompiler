package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.app.F;
import androidx.core.graphics.i;
import androidx.core.text.n;
import androidx.core.widget.j;
import androidx.core.widget.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.C0836a;

public class D extends TextView implements m, androidx.core.widget.b {

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3184a;

    /* renamed from: b  reason: collision with root package name */
    private final C f3185b;

    /* renamed from: c  reason: collision with root package name */
    private final B f3186c;

    /* renamed from: d  reason: collision with root package name */
    private C0390n f3187d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3188e;

    /* renamed from: f  reason: collision with root package name */
    private a f3189f;

    /* renamed from: g  reason: collision with root package name */
    private Future f3190g;

    private interface a {
        void a(int[] iArr, int i4);

        void b(TextClassifier textClassifier);

        int[] c();

        void d(int i4);

        TextClassifier e();

        int f();

        void g(int i4, int i5, int i6, int i7);

        int h();

        int i();

        void j(int i4);

        int k();

        void setAutoSizeTextTypeWithDefaults(int i4);
    }

    class b implements a {
        b() {
        }

        public void a(int[] iArr, int i4) {
            D.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        public void b(TextClassifier textClassifier) {
            D.super.setTextClassifier(textClassifier);
        }

        public int[] c() {
            return D.super.getAutoSizeTextAvailableSizes();
        }

        public void d(int i4) {
        }

        public TextClassifier e() {
            return D.super.getTextClassifier();
        }

        public int f() {
            return D.super.getAutoSizeMaxTextSize();
        }

        public void g(int i4, int i5, int i6, int i7) {
            D.super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        public int h() {
            return D.super.getAutoSizeTextType();
        }

        public int i() {
            return D.super.getAutoSizeMinTextSize();
        }

        public void j(int i4) {
        }

        public int k() {
            return D.super.getAutoSizeStepGranularity();
        }

        public void setAutoSizeTextTypeWithDefaults(int i4) {
            D.super.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    class c extends b {
        c() {
            super();
        }

        public void d(int i4) {
            D.super.setLastBaselineToBottomHeight(i4);
        }

        public void j(int i4) {
            D.super.setFirstBaselineToTopHeight(i4);
        }
    }

    public D(Context context) {
        this(context, (AttributeSet) null);
    }

    private C0390n getEmojiTextViewHelper() {
        if (this.f3187d == null) {
            this.f3187d = new C0390n(this);
        }
        return this.f3187d;
    }

    private void q() {
        Future future = this.f3190g;
        if (future != null) {
            try {
                this.f3190g = null;
                F.a(future.get());
                j.n(this, (n) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (n0.f3645b) {
            return getSuperCaller().f();
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            return c4.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (n0.f3645b) {
            return getSuperCaller().i();
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            return c4.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (n0.f3645b) {
            return getSuperCaller().k();
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            return c4.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (n0.f3645b) {
            return getSuperCaller().c();
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            return c4.h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!n0.f3645b) {
            C c4 = this.f3185b;
            if (c4 != null) {
                return c4.i();
            }
            return 0;
        } else if (getSuperCaller().h() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.q(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return j.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return j.c(this);
    }

    /* access modifiers changed from: package-private */
    public a getSuperCaller() {
        if (this.f3189f == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                this.f3189f = new c();
            } else if (i4 >= 26) {
                this.f3189f = new b();
            }
        }
        return this.f3189f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3185b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3185b.k();
    }

    public CharSequence getText() {
        q();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        B b4;
        if (Build.VERSION.SDK_INT >= 28 || (b4 = this.f3186c) == null) {
            return getSuperCaller().e();
        }
        return b4.a();
    }

    public n.a getTextMetricsParamsCompat() {
        return j.f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3185b.r(this, onCreateInputConnection, editorInfo);
        return C0391o.a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.o(z3, i4, i5, i6, i7);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        q();
        super.onMeasure(i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C c4 = this.f3185b;
        if (c4 != null && !n0.f3645b && c4.l()) {
            this.f3185b.c();
        }
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (n0.f3645b) {
            getSuperCaller().g(i4, i5, i6, i7);
            return;
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.t(i4, i5, i6, i7);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (n0.f3645b) {
            getSuperCaller().a(iArr, i4);
            return;
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.u(iArr, i4);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (n0.f3645b) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.v(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C c4 = this.f3185b;
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

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i4);
        } else {
            j.k(this, i4);
        }
    }

    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i4);
        } else {
            j.l(this, i4);
        }
    }

    public void setLineHeight(int i4) {
        j.m(this, i4);
    }

    public void setPrecomputedText(n nVar) {
        j.n(this, nVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3184a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3185b.w(colorStateList);
        this.f3185b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3185b.x(mode);
        this.f3185b.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.q(context, i4);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        B b4;
        if (Build.VERSION.SDK_INT >= 28 || (b4 = this.f3186c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b4.b(textClassifier);
        }
    }

    public void setTextFuture(Future<n> future) {
        this.f3190g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n.a aVar) {
        j.p(this, aVar);
    }

    public void setTextSize(int i4, float f4) {
        if (n0.f3645b) {
            super.setTextSize(i4, f4);
            return;
        }
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.A(i4, f4);
        }
    }

    public void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (!this.f3188e) {
            if (typeface == null || i4 <= 0) {
                typeface2 = null;
            } else {
                typeface2 = i.a(getContext(), typeface, i4);
            }
            this.f3188e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i4);
            } finally {
                this.f3188e = false;
            }
        }
    }

    public D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public D(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        this.f3188e = false;
        this.f3189f = null;
        Y.a(this, getContext());
        C0381e eVar = new C0381e(this);
        this.f3184a = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3185b = c4;
        c4.m(attributeSet, i4);
        c4.b();
        this.f3186c = new B(this);
        getEmojiTextViewHelper().b(attributeSet, i4);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b4 = i4 != 0 ? C0836a.b(context, i4) : null;
        Drawable b5 = i5 != 0 ? C0836a.b(context, i5) : null;
        Drawable b6 = i6 != 0 ? C0836a.b(context, i6) : null;
        if (i7 != 0) {
            drawable = C0836a.b(context, i7);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b4, b5, b6, drawable);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b4 = i4 != 0 ? C0836a.b(context, i4) : null;
        Drawable b5 = i5 != 0 ? C0836a.b(context, i5) : null;
        Drawable b6 = i6 != 0 ? C0836a.b(context, i6) : null;
        if (i7 != 0) {
            drawable = C0836a.b(context, i7);
        }
        setCompoundDrawablesWithIntrinsicBounds(b4, b5, b6, drawable);
        C c4 = this.f3185b;
        if (c4 != null) {
            c4.p();
        }
    }
}
