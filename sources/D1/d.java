package D1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.F;
import androidx.appcompat.widget.C0383g;
import androidx.appcompat.widget.c0;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.internal.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0836a;
import z1.C0970a;
import z1.e;
import z1.h;
import z1.i;
import z1.j;

public class d extends C0383g {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f347A;

    /* renamed from: B  reason: collision with root package name */
    private static final int[][] f348B;

    /* renamed from: C  reason: collision with root package name */
    private static final int f349C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: y  reason: collision with root package name */
    private static final int f350y = i.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f351z = {C0970a.state_indeterminate};

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet f352e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashSet f353f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f354g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f355h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f356i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f357j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f358k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f359l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f360m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f361n;

    /* renamed from: o  reason: collision with root package name */
    ColorStateList f362o;

    /* renamed from: p  reason: collision with root package name */
    ColorStateList f363p;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f364q;

    /* renamed from: r  reason: collision with root package name */
    private int f365r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public int[] f366s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f367t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f368u;

    /* renamed from: v  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f369v;

    /* renamed from: w  reason: collision with root package name */
    private final c f370w;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f371x;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = d.this.f362o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
        }

        public void c(Drawable drawable) {
            super.c(drawable);
            d dVar = d.this;
            ColorStateList colorStateList = dVar.f362o;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.n(drawable, colorStateList.getColorForState(dVar.f366s, d.this.f362o.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f373a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (a) null);
            }

            /* renamed from: b */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String t() {
            int i4 = this.f373a;
            if (i4 == 1) {
                return "checked";
            }
            if (i4 != 2) {
                return "unchecked";
            }
            return "indeterminate";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + t() + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Integer.valueOf(this.f373a));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f373a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i4 = C0970a.state_error;
        f347A = new int[]{i4};
        f348B = new int[][]{new int[]{16842910, i4}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.f16504c);
    }

    private boolean c(c0 c0Var) {
        int n4 = c0Var.n(j.f16601V2, 0);
        int n5 = c0Var.n(j.f16605W2, 0);
        if (n4 == f349C && n5 == 0) {
            return true;
        }
        return false;
    }

    private void e() {
        this.f359l = H1.a.c(this.f359l, this.f362o, androidx.core.widget.d.c(this));
        this.f360m = H1.a.c(this.f360m, this.f363p, this.f364q);
        g();
        h();
        super.setButtonDrawable(H1.a.a(this.f359l, this.f360m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 30 && this.f368u == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    private void g() {
        c cVar;
        if (this.f361n) {
            c cVar2 = this.f370w;
            if (cVar2 != null) {
                cVar2.g(this.f371x);
                this.f370w.c(this.f371x);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f359l;
                if ((drawable instanceof AnimatedStateListDrawable) && (cVar = this.f370w) != null) {
                    int i4 = e.f16511b;
                    int i5 = e.f16510P;
                    ((AnimatedStateListDrawable) drawable).addTransition(i4, i5, cVar, false);
                    ((AnimatedStateListDrawable) this.f359l).addTransition(e.indeterminate, i5, this.f370w, false);
                }
            }
        }
    }

    private String getButtonStateDescription() {
        int i4 = this.f365r;
        if (i4 == 1) {
            return getResources().getString(h.mtrl_checkbox_state_description_checked);
        }
        if (i4 == 0) {
            return getResources().getString(h.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(h.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f354g == null) {
            int[][] iArr = f348B;
            int[] iArr2 = new int[iArr.length];
            int d4 = F1.a.d(this, C0970a.f16505e);
            int d5 = F1.a.d(this, C0970a.f16507g);
            int d6 = F1.a.d(this, C0970a.colorSurface);
            int d7 = F1.a.d(this, C0970a.colorOnSurface);
            iArr2[0] = F1.a.i(d6, d5, 1.0f);
            iArr2[1] = F1.a.i(d6, d4, 1.0f);
            iArr2[2] = F1.a.i(d6, d7, 0.54f);
            iArr2[3] = F1.a.i(d6, d7, 0.38f);
            iArr2[4] = F1.a.i(d6, d7, 0.38f);
            this.f354g = new ColorStateList(iArr, iArr2);
        }
        return this.f354g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f362o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f359l;
        if (!(drawable == null || (colorStateList2 = this.f362o) == null)) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f360m;
        if (drawable2 != null && (colorStateList = this.f363p) != null) {
            androidx.core.graphics.drawable.a.o(drawable2, colorStateList);
        }
    }

    private void i() {
    }

    public boolean d() {
        return this.f357j;
    }

    public Drawable getButtonDrawable() {
        return this.f359l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f360m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f363p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f364q;
    }

    public ColorStateList getButtonTintList() {
        return this.f362o;
    }

    public int getCheckedState() {
        return this.f365r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f358k;
    }

    public boolean isChecked() {
        if (this.f365r == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f355h && this.f362o == null && this.f363p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f351z);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f347A);
        }
        this.f366s = H1.a.e(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable a4;
        int i4;
        if (!this.f356i || !TextUtils.isEmpty(getText()) || (a4 = androidx.core.widget.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (m.g(this)) {
            i4 = -1;
        } else {
            i4 = 1;
        }
        int width = ((getWidth() - a4.getIntrinsicWidth()) / 2) * i4;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a4.getBounds();
            androidx.core.graphics.drawable.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f358k);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f373a);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f373a = getCheckedState();
        return bVar;
    }

    public void setButtonDrawable(int i4) {
        setButtonDrawable(C0836a.b(getContext(), i4));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f360m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(C0836a.b(getContext(), i4));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f363p != colorStateList) {
            this.f363p = colorStateList;
            e();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f364q != mode) {
            this.f364q = mode;
            e();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f362o != colorStateList) {
            this.f362o = colorStateList;
            e();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f356i = z3;
    }

    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        boolean z3;
        AutofillManager a4;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f365r != i4) {
            this.f365r = i4;
            if (i4 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            super.setChecked(z3);
            refreshDrawableState();
            f();
            if (!this.f367t) {
                this.f367t = true;
                LinkedHashSet linkedHashSet = this.f353f;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        F.a(it.next());
                        throw null;
                    }
                }
                if (!(this.f365r == 2 || (onCheckedChangeListener = this.f369v) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (a4 = b.a(getContext().getSystemService(a.a()))) != null) {
                    a4.notifyValueChanged(this);
                }
                this.f367t = false;
            }
        }
    }

    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f358k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        CharSequence charSequence;
        if (i4 != 0) {
            charSequence = getResources().getText(i4);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z3) {
        if (this.f357j != z3) {
            this.f357j = z3;
            refreshDrawableState();
            Iterator it = this.f352e.iterator();
            if (it.hasNext()) {
                F.a(it.next());
                throw null;
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f369v = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f368u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f355h = z3;
        if (z3) {
            androidx.core.widget.d.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.d.d(this, (ColorStateList) null);
        }
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f350y
            android.content.Context r9 = T1.a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f352e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f353f = r9
            android.content.Context r9 = r8.getContext()
            int r0 = z1.d.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.c r9 = androidx.vectordrawable.graphics.drawable.c.a(r9, r0)
            r8.f370w = r9
            D1.d$a r9 = new D1.d$a
            r9.<init>()
            r8.f371x = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.widget.d.a(r8)
            r8.f359l = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.f362o = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = z1.j.f16597U2
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.c0 r10 = com.google.android.material.internal.j.j(r0, r1, r2, r3, r4, r5)
            int r11 = z1.j.f16609X2
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.f360m = r11
            android.graphics.drawable.Drawable r11 = r8.f359l
            r0 = 1
            if (r11 == 0) goto L_0x007c
            boolean r11 = com.google.android.material.internal.j.g(r9)
            if (r11 == 0) goto L_0x007c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L_0x007c
            super.setButtonDrawable((android.graphics.drawable.Drawable) r6)
            int r11 = z1.d.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = o.C0836a.b(r9, r11)
            r8.f359l = r11
            r8.f361n = r0
            android.graphics.drawable.Drawable r11 = r8.f360m
            if (r11 != 0) goto L_0x007c
            int r11 = z1.d.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = o.C0836a.b(r9, r11)
            r8.f360m = r11
        L_0x007c:
            int r11 = z1.j.f16613Y2
            android.content.res.ColorStateList r9 = N1.c.b(r9, r10, r11)
            r8.f363p = r9
            int r9 = z1.j.f16617Z2
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.m.i(r9, r11)
            r8.f364q = r9
            int r9 = z1.j.f16642e3
            boolean r9 = r10.a(r9, r7)
            r8.f355h = r9
            int r9 = z1.j.f16622a3
            boolean r9 = r10.a(r9, r0)
            r8.f356i = r9
            int r9 = z1.j.f16637d3
            boolean r9 = r10.a(r9, r7)
            r8.f357j = r9
            int r9 = z1.j.f16632c3
            java.lang.CharSequence r9 = r10.p(r9)
            r8.f358k = r9
            int r9 = z1.j.f16627b3
            boolean r11 = r10.s(r9)
            if (r11 == 0) goto L_0x00c2
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        L_0x00c2:
            r10.w()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.d.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f359l = drawable;
        this.f361n = false;
        e();
    }
}
