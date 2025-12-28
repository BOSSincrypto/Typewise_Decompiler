package com.google.android.material.chip;

import N1.d;
import N1.f;
import Q1.k;
import Q1.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0383g;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import com.google.android.material.chip.a;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.util.List;
import z1.C0970a;
import z1.h;
import z1.i;

public class Chip extends C0383g implements a.C0169a, n, Checkable {

    /* renamed from: w  reason: collision with root package name */
    private static final int f11807w = i.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public static final Rect f11808x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f11809y = {16842913};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f11810z = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f11811e;

    /* renamed from: f  reason: collision with root package name */
    private InsetDrawable f11812f;

    /* renamed from: g  reason: collision with root package name */
    private RippleDrawable f11813g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public View.OnClickListener f11814h;

    /* renamed from: i  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f11815i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11816j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11817k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11818l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public boolean f11819m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11820n;

    /* renamed from: o  reason: collision with root package name */
    private int f11821o;

    /* renamed from: p  reason: collision with root package name */
    private int f11822p;

    /* renamed from: q  reason: collision with root package name */
    private CharSequence f11823q;

    /* renamed from: r  reason: collision with root package name */
    private final c f11824r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11825s;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f11826t;

    /* renamed from: u  reason: collision with root package name */
    private final RectF f11827u;

    /* renamed from: v  reason: collision with root package name */
    private final f f11828v;

    class a extends f {
        a() {
        }

        public void a(int i4) {
        }

        public void b(Typeface typeface, boolean z3) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f11811e.G2()) {
                charSequence = Chip.this.f11811e.b1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f11811e != null) {
                Chip.this.f11811e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends N.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f4, float f5) {
            if (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f4, f5)) {
                return 0;
            }
            return 1;
        }

        /* access modifiers changed from: protected */
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f11814h != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i4, int i5, Bundle bundle) {
            if (i5 != 16) {
                return false;
            }
            if (i4 == 0) {
                return Chip.this.performClick();
            }
            if (i4 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(A a4) {
            a4.h0(Chip.this.r());
            a4.k0(Chip.this.isClickable());
            a4.j0(Chip.this.getAccessibilityClassName());
            a4.F0(Chip.this.getText());
        }

        /* access modifiers changed from: protected */
        public void N(int i4, A a4) {
            CharSequence charSequence = "";
            if (i4 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    a4.n0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i5 = h.mtrl_chip_close_icon_content_description;
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    a4.n0(context.getString(i5, new Object[]{charSequence}).trim());
                }
                a4.f0(Chip.this.getCloseIconTouchBoundsInt());
                a4.b(A.a.f5246i);
                a4.o0(Chip.this.isEnabled());
                return;
            }
            a4.n0(charSequence);
            a4.f0(Chip.f11808x);
        }

        /* access modifiers changed from: protected */
        public void O(int i4, boolean z3) {
            if (i4 == 1) {
                boolean unused = Chip.this.f11819m = z3;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.chipStyle);
    }

    private void A() {
        this.f11813g = new RippleDrawable(O1.b.a(this.f11811e.Z0()), getBackgroundDrawable(), (Drawable) null);
        this.f11811e.F2(false);
        P.s0(this, this.f11813g);
        B();
    }

    private void B() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f11811e) != null) {
            int D02 = (int) (aVar.D0() + this.f11811e.d1() + this.f11811e.k0());
            int I02 = (int) (this.f11811e.I0() + this.f11811e.e1() + this.f11811e.g0());
            if (this.f11812f != null) {
                Rect rect = new Rect();
                this.f11812f.getPadding(rect);
                I02 += rect.left;
                D02 += rect.right;
            }
            P.D0(this, I02, getPaddingTop(), D02, getPaddingBottom());
        }
    }

    private void C() {
        TextPaint paint = getPaint();
        a aVar = this.f11811e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f11828v);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f11827u.setEmpty();
        if (n() && this.f11814h != null) {
            this.f11811e.S0(this.f11827u);
        }
        return this.f11827u;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f11826t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f11826t;
    }

    private d getTextAppearance() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    private void j(a aVar) {
        aVar.j2(this);
    }

    private int[] k() {
        int isEnabled = isEnabled();
        if (this.f11819m) {
            isEnabled++;
        }
        if (this.f11818l) {
            isEnabled++;
        }
        if (this.f11817k) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i4 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i4 = 1;
        }
        if (this.f11819m) {
            iArr[i4] = 16842908;
            i4++;
        }
        if (this.f11818l) {
            iArr[i4] = 16843623;
            i4++;
        }
        if (this.f11817k) {
            iArr[i4] = 16842919;
            i4++;
        }
        if (isChecked()) {
            iArr[i4] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f11812f && this.f11811e.getCallback() == null) {
            this.f11811e.setCallback(this.f11812f);
        }
    }

    /* access modifiers changed from: private */
    public boolean n() {
        a aVar = this.f11811e;
        if (aVar == null || aVar.L0() == null) {
            return false;
        }
        return true;
    }

    private void o(Context context, AttributeSet attributeSet, int i4) {
        TypedArray i5 = j.i(context, attributeSet, z1.j.f16614Z, i4, f11807w, new int[0]);
        this.f11820n = i5.getBoolean(z1.j.f16535F0, false);
        this.f11822p = (int) Math.ceil((double) i5.getDimension(z1.j.f16714t0, (float) Math.ceil((double) m.c(getContext(), 48))));
        i5.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i4, int i5, int i6, int i7) {
        this.f11812f = new InsetDrawable(this.f11811e, i4, i5, i6, i7);
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f11818l != z3) {
            this.f11818l = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f11817k != z3) {
            this.f11817k = z3;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z3) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f11815i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
        }
    }

    private void v() {
        if (this.f11812f != null) {
            this.f11812f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(a aVar) {
        if (aVar != null) {
            aVar.j2((a.C0169a) null);
        }
    }

    private void y() {
        if (!n() || !s() || this.f11814h == null) {
            P.o0(this, (C0402a) null);
            this.f11825s = false;
            return;
        }
        P.o0(this, this.f11824r);
        this.f11825s = true;
    }

    private void z() {
        if (O1.b.f1065a) {
            A();
            return;
        }
        this.f11811e.F2(true);
        P.s0(this, getBackgroundDrawable());
        B();
        m();
    }

    public void a() {
        l(this.f11822p);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f11825s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f11824r.v(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11825s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f11824r.w(keyEvent) || this.f11824r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        a aVar = this.f11811e;
        if (aVar == null || !aVar.j1()) {
            z3 = false;
        } else {
            z3 = this.f11811e.f2(k());
        }
        if (z3) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f11823q)) {
            return this.f11823q;
        }
        if (r()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f11812f;
        if (insetDrawable == null) {
            return this.f11811e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.z0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.C0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f11811e;
    }

    public float getChipEndPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f11825s || !(this.f11824r.A() == 1 || this.f11824r.x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public A1.c getHideMotionSpec() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f11811e.A();
    }

    public A1.c getShowMotionSpec() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f11811e;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public boolean l(int i4) {
        int i5;
        this.f11822p = i4;
        int i6 = 0;
        if (!w()) {
            if (this.f11812f != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i4 - this.f11811e.getIntrinsicHeight());
        int max2 = Math.max(0, i4 - this.f11811e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i5 = max2 / 2;
            } else {
                i5 = 0;
            }
            if (max > 0) {
                i6 = max / 2;
            }
            if (this.f11812f != null) {
                Rect rect = new Rect();
                this.f11812f.getPadding(rect);
                if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                    z();
                    return true;
                }
            }
            if (getMinHeight() != i4) {
                setMinHeight(i4);
            }
            if (getMinWidth() != i4) {
                setMinWidth(i4);
            }
            q(i5, i6, i5, i6);
            z();
            return true;
        }
        if (this.f11812f != null) {
            v();
        } else {
            z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q1.h.f(this, this.f11811e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11809y);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f11810z);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (this.f11825s) {
            this.f11824r.I(z3, i4, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i4);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f11821o != i4) {
            this.f11821o = i4;
            B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0035
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f11817k
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r3)
        L_0x002a:
            r0 = r2
            goto L_0x0041
        L_0x002c:
            boolean r0 = r5.f11817k
            if (r0 == 0) goto L_0x0035
            r5.u()
            r0 = r2
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
            goto L_0x002a
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        a aVar = this.f11811e;
        if (aVar == null || !aVar.i1()) {
            return false;
        }
        return true;
    }

    public boolean s() {
        a aVar = this.f11811e;
        if (aVar == null || !aVar.k1()) {
            return false;
        }
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f11823q = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11813g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f11813g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.r1(z3);
        }
    }

    public void setCheckableResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.s1(i4);
        }
    }

    public void setChecked(boolean z3) {
        a aVar = this.f11811e;
        if (aVar == null) {
            this.f11816j = z3;
        } else if (aVar.i1()) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.t1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.u1(i4);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.v1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.w1(i4);
        }
    }

    public void setCheckedIconVisible(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.x1(i4);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.z1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.A1(i4);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.B1(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.C1(i4);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f11811e;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f11811e = aVar;
            aVar.u2(false);
            j(this.f11811e);
            l(this.f11822p);
        }
    }

    public void setChipEndPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.D1(f4);
        }
    }

    public void setChipEndPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.E1(i4);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.F1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.G1(i4);
        }
    }

    public void setChipIconSize(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.H1(f4);
        }
    }

    public void setChipIconSizeResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.I1(i4);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.K1(i4);
        }
    }

    public void setChipIconVisible(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.L1(i4);
        }
    }

    public void setChipMinHeight(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.N1(f4);
        }
    }

    public void setChipMinHeightResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.O1(i4);
        }
    }

    public void setChipStartPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.P1(f4);
        }
    }

    public void setChipStartPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.Q1(i4);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.S1(i4);
        }
    }

    public void setChipStrokeWidth(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.T1(f4);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.U1(i4);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.W1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.X1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.Y1(f4);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.Z1(i4);
        }
    }

    public void setCloseIconResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.a2(i4);
        }
        y();
    }

    public void setCloseIconSize(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.b2(f4);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.c2(i4);
        }
    }

    public void setCloseIconStartPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.d2(f4);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.e2(i4);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.g2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.h2(i4);
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.S(f4);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f11811e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f11811e;
                if (aVar != null) {
                    aVar.k2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f11820n = z3;
        l(this.f11822p);
    }

    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(A1.c cVar) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.l2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.m2(i4);
        }
    }

    public void setIconEndPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.n2(f4);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.o2(i4);
        }
    }

    public void setIconStartPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.p2(f4);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.q2(i4);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    public void setLayoutDirection(int i4) {
        if (this.f11811e != null) {
            super.setLayoutDirection(i4);
        }
    }

    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.r2(i4);
        }
    }

    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f11815i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f11814h = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
        if (!this.f11811e.g1()) {
            A();
        }
    }

    public void setRippleColorResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.t2(i4);
            if (!this.f11811e.g1()) {
                A();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f11811e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(A1.c cVar) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.v2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.w2(i4);
        }
    }

    public void setSingleLine(boolean z3) {
        if (z3) {
            super.setSingleLine(z3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        a aVar = this.f11811e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.G2()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            a aVar2 = this.f11811e;
            if (aVar2 != null) {
                aVar2.x2(charSequence);
            }
        }
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.y2(dVar);
        }
        C();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.A2(f4);
        }
    }

    public void setTextEndPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.B2(i4);
        }
    }

    public void setTextSize(int i4, float f4) {
        super.setTextSize(i4, f4);
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.C2(TypedValue.applyDimension(i4, f4, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.D2(f4);
        }
    }

    public void setTextStartPaddingResource(int i4) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.E2(i4);
        }
    }

    public boolean u() {
        boolean z3 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f11814h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z3 = true;
        }
        if (this.f11825s) {
            this.f11824r.U(1, 1);
        }
        return z3;
    }

    public boolean w() {
        return this.f11820n;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f11807w
            android.content.Context r7 = T1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f11826t = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f11827u = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f11828v = r7
            android.content.Context r0 = r6.getContext()
            r6.D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.p0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.P.w(r6)
            r7.S(r1)
            int[] r2 = z1.j.f16614Z
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.j.i(r0, r1, r2, r3, r4, r5)
            int r9 = z1.j.f16555K0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f11824r = r8
            r6.y()
            if (r9 != 0) goto L_0x0059
            r6.p()
        L_0x0059:
            boolean r8 = r6.f11816j
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.b1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.V0()
            r6.setEllipsize(r7)
            r6.C()
            com.google.android.material.chip.a r7 = r6.f11811e
            boolean r7 = r7.G2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.B()
            boolean r7 = r6.w()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f11822p
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.P.B(r6)
            r6.f11821o = r7
            E1.b r7 = new E1.b
            r7.<init>(r6)
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z3) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.i2(z3);
        }
        y();
    }

    public void setCheckedIconVisible(boolean z3) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.y1(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.M1(z3);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.z2(i4);
        }
        C();
    }

    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        a aVar = this.f11811e;
        if (aVar != null) {
            aVar.z2(i4);
        }
        C();
    }
}
