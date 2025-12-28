package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.j;
import androidx.core.widget.m;
import n.C0822a;

/* renamed from: androidx.appcompat.widget.f  reason: case insensitive filesystem */
public class C0382f extends Button implements b, m {

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3555a;

    /* renamed from: b  reason: collision with root package name */
    private final C f3556b;

    /* renamed from: c  reason: collision with root package name */
    private C0390n f3557c;

    public C0382f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14681n);
    }

    private C0390n getEmojiTextViewHelper() {
        if (this.f3557c == null) {
            this.f3557c = new C0390n(this);
        }
        return this.f3557c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            eVar.b();
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (n0.f3645b) {
            return super.getAutoSizeMaxTextSize();
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            return c4.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (n0.f3645b) {
            return super.getAutoSizeMinTextSize();
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            return c4.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (n0.f3645b) {
            return super.getAutoSizeStepGranularity();
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            return c4.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (n0.f3645b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            return c4.h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!n0.f3645b) {
            C c4 = this.f3556b;
            if (c4 != null) {
                return c4.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3556b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3556b.k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.o(z3, i4, i5, i6, i7);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C c4 = this.f3556b;
        if (c4 != null && !n0.f3645b && c4.l()) {
            this.f3556b.c();
        }
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().c(z3);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (n0.f3645b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.t(i4, i5, i6, i7);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (n0.f3645b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.u(iArr, i4);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (n0.f3645b) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.v(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            eVar.g(i4);
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

    public void setSupportAllCaps(boolean z3) {
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.s(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3555a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f3556b.w(colorStateList);
        this.f3556b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f3556b.x(mode);
        this.f3556b.b();
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.q(context, i4);
        }
    }

    public void setTextSize(int i4, float f4) {
        if (n0.f3645b) {
            super.setTextSize(i4, f4);
            return;
        }
        C c4 = this.f3556b;
        if (c4 != null) {
            c4.A(i4, f4);
        }
    }

    public C0382f(Context context, AttributeSet attributeSet, int i4) {
        super(Z.b(context), attributeSet, i4);
        Y.a(this, getContext());
        C0381e eVar = new C0381e(this);
        this.f3555a = eVar;
        eVar.e(attributeSet, i4);
        C c4 = new C(this);
        this.f3556b = c4;
        c4.m(attributeSet, i4);
        c4.b();
        getEmojiTextViewHelper().b(attributeSet, i4);
    }
}
