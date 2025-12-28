package com.google.android.material.button;

import Q1.h;
import Q1.k;
import Q1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.app.F;
import androidx.appcompat.widget.C0382f;
import androidx.core.view.P;
import androidx.core.widget.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0836a;
import z1.C0970a;
import z1.i;

public class MaterialButton extends C0382f implements Checkable, n {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f11691r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f11692s = {16842912};

    /* renamed from: t  reason: collision with root package name */
    private static final int f11693t = i.Widget_MaterialComponents_Button;

    /* renamed from: d  reason: collision with root package name */
    private final a f11694d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet f11695e;

    /* renamed from: f  reason: collision with root package name */
    private a f11696f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f11697g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f11698h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f11699i;

    /* renamed from: j  reason: collision with root package name */
    private String f11700j;

    /* renamed from: k  reason: collision with root package name */
    private int f11701k;

    /* renamed from: l  reason: collision with root package name */
    private int f11702l;

    /* renamed from: m  reason: collision with root package name */
    private int f11703m;

    /* renamed from: n  reason: collision with root package name */
    private int f11704n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11705o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11706p;

    /* renamed from: q  reason: collision with root package name */
    private int f11707q;

    interface a {
        void a(MaterialButton materialButton, boolean z3);
    }

    static class b extends M.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f11708c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void u(Parcel parcel) {
            boolean z3 = true;
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            this.f11708c = z3;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f11708c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            u(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.materialButtonStyle);
    }

    private boolean b() {
        int i4 = this.f11707q;
        if (i4 == 3 || i4 == 4) {
            return true;
        }
        return false;
    }

    private boolean c() {
        int i4 = this.f11707q;
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        return false;
    }

    private boolean d() {
        int i4 = this.f11707q;
        if (i4 == 16 || i4 == 32) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (P.B(this) == 1) {
            return true;
        }
        return false;
    }

    private boolean f() {
        a aVar = this.f11694d;
        if (aVar == null || aVar.o()) {
            return false;
        }
        return true;
    }

    private void g() {
        if (c()) {
            j.j(this, this.f11699i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            j.j(this, (Drawable) null, (Drawable) null, this.f11699i, (Drawable) null);
        } else if (d()) {
            j.j(this, (Drawable) null, this.f11699i, (Drawable) null, (Drawable) null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < lineCount; i4++) {
            f4 = Math.max(f4, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil((double) f4);
    }

    private void h(boolean z3) {
        Drawable drawable = this.f11699i;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f11699i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f11698h);
            PorterDuff.Mode mode = this.f11697g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f11699i, mode);
            }
            int i4 = this.f11701k;
            if (i4 == 0) {
                i4 = this.f11699i.getIntrinsicWidth();
            }
            int i5 = this.f11701k;
            if (i5 == 0) {
                i5 = this.f11699i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11699i;
            int i6 = this.f11702l;
            int i7 = this.f11703m;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
            this.f11699i.setVisible(true, z3);
        }
        if (z3) {
            g();
            return;
        }
        Drawable[] a4 = j.a(this);
        Drawable drawable3 = a4[0];
        Drawable drawable4 = a4[1];
        Drawable drawable5 = a4[2];
        if ((c() && drawable3 != this.f11699i) || ((b() && drawable5 != this.f11699i) || (d() && drawable4 != this.f11699i))) {
            g();
        }
    }

    private void i(int i4, int i5) {
        if (this.f11699i != null && getLayout() != null) {
            if (c() || b()) {
                this.f11703m = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i6 = this.f11707q;
                boolean z3 = true;
                if (i6 == 1 || i6 == 3 || ((i6 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i6 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f11702l = 0;
                    h(false);
                    return;
                }
                int i7 = this.f11701k;
                if (i7 == 0) {
                    i7 = this.f11699i.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i4 - getTextLayoutWidth()) - P.F(this)) - i7) - this.f11704n) - P.G(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean e4 = e();
                if (this.f11707q != 4) {
                    z3 = false;
                }
                if (e4 != z3) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f11702l != textLayoutWidth) {
                    this.f11702l = textLayoutWidth;
                    h(false);
                }
            } else if (d()) {
                this.f11702l = 0;
                if (this.f11707q == 16) {
                    this.f11703m = 0;
                    h(false);
                    return;
                }
                int i8 = this.f11701k;
                if (i8 == 0) {
                    i8 = this.f11699i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - i8) - this.f11704n) - getPaddingBottom()) / 2);
                if (this.f11703m != max) {
                    this.f11703m = max;
                    h(false);
                }
            }
        }
    }

    public boolean a() {
        a aVar = this.f11694d;
        if (aVar == null || !aVar.p()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f11700j)) {
            return this.f11700j;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f11694d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11699i;
    }

    public int getIconGravity() {
        return this.f11707q;
    }

    public int getIconPadding() {
        return this.f11704n;
    }

    public int getIconSize() {
        return this.f11701k;
    }

    public ColorStateList getIconTint() {
        return this.f11698h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11697g;
    }

    public int getInsetBottom() {
        return this.f11694d.c();
    }

    public int getInsetTop() {
        return this.f11694d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f11694d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f11694d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f11694d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f11694d.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (f()) {
            return this.f11694d.l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (f()) {
            return this.f11694d.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f11705o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f11694d.f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f11691r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11692s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.t());
        setChecked(bVar.f11708c);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f11708c = this.f11705o;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.f11694d.q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f11699i != null) {
            if (this.f11699i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setA11yClassName(String str) {
        this.f11700j = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i4) {
        if (f()) {
            this.f11694d.s(i4);
        } else {
            super.setBackgroundColor(i4);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f11694d.t();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (f()) {
            this.f11694d.u(z3);
        }
    }

    public void setChecked(boolean z3) {
        if (a() && isEnabled() && this.f11705o != z3) {
            this.f11705o = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f11705o);
            }
            if (!this.f11706p) {
                this.f11706p = true;
                Iterator it = this.f11695e.iterator();
                if (!it.hasNext()) {
                    this.f11706p = false;
                } else {
                    F.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i4) {
        if (f()) {
            this.f11694d.v(i4);
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        if (f()) {
            this.f11694d.f().S(f4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11699i != drawable) {
            this.f11699i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f11707q != i4) {
            this.f11707q = i4;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f11704n != i4) {
            this.f11704n = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0836a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f11701k != i4) {
            this.f11701k = i4;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11698h != colorStateList) {
            this.f11698h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11697g != mode) {
            this.f11697g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(C0836a.a(getContext(), i4));
    }

    public void setInsetBottom(int i4) {
        this.f11694d.w(i4);
    }

    public void setInsetTop(int i4) {
        this.f11694d.x(i4);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f11696f = aVar;
    }

    public void setPressed(boolean z3) {
        a aVar = this.f11696f;
        if (aVar != null) {
            aVar.a(this, z3);
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f11694d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i4) {
        if (f()) {
            setRippleColor(C0836a.a(getContext(), i4));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (f()) {
            this.f11694d.z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (f()) {
            this.f11694d.A(z3);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f11694d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i4) {
        if (f()) {
            setStrokeColor(C0836a.a(getContext(), i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (f()) {
            this.f11694d.C(i4);
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f11694d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f11694d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f11694d.F(z3);
    }

    public void toggle() {
        setChecked(!this.f11705o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f11693t
            android.content.Context r9 = T1.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f11695e = r9
            r9 = 0
            r8.f11705o = r9
            r8.f11706p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = z1.j.f16612Y1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.j.i(r0, r1, r2, r3, r4, r5)
            int r1 = z1.j.f16676l2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f11704n = r1
            int r1 = z1.j.f16691o2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.m.i(r1, r2)
            r8.f11697g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = z1.j.f16686n2
            android.content.res.ColorStateList r1 = N1.c.a(r1, r0, r2)
            r8.f11698h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = z1.j.f16666j2
            android.graphics.drawable.Drawable r1 = N1.c.d(r1, r0, r2)
            r8.f11699i = r1
            int r1 = z1.j.f16671k2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f11707q = r1
            int r1 = z1.j.f16681m2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f11701k = r1
            Q1.k$b r10 = Q1.k.e(r7, r10, r11, r6)
            Q1.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f11694d = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.f11704n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f11699i
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
