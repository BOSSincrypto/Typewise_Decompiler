package com.google.android.material.textfield;

import N1.c;
import Q1.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0380d;
import androidx.appcompat.widget.P;
import com.google.android.material.internal.e;
import com.google.android.material.internal.j;
import z1.C0970a;
import z1.C0972c;
import z1.i;

public class w extends C0380d {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final P f12441e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f12442f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f12443g;

    /* renamed from: h  reason: collision with root package name */
    private final int f12444h;

    /* renamed from: i  reason: collision with root package name */
    private final float f12445i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f12446j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f12447k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12448l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            Object obj;
            w wVar = w.this;
            if (i4 < 0) {
                obj = wVar.f12441e.v();
            } else {
                obj = wVar.getAdapter().getItem(i4);
            }
            w.this.j(obj);
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i4 < 0) {
                    view = w.this.f12441e.y();
                    i4 = w.this.f12441e.x();
                    j4 = w.this.f12441e.w();
                }
                onItemClickListener.onItemClick(w.this.f12441e.g(), view, i4, j4);
            }
            w.this.f12441e.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ColorStateList f12450a;

        /* renamed from: b  reason: collision with root package name */
        private ColorStateList f12451b;

        b(Context context, int i4, String[] strArr) {
            super(context, i4, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{F1.a.h(w.this.f12447k, w.this.f12448l.getColorForState(iArr2, 0)), F1.a.h(w.this.f12447k, w.this.f12448l.getColorForState(iArr, 0)), w.this.f12447k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f12447k);
            if (this.f12451b == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f12450a);
            return new RippleDrawable(this.f12451b, colorDrawable, (Drawable) null);
        }

        private boolean c() {
            if (w.this.f12447k != 0) {
                return true;
            }
            return false;
        }

        private boolean d() {
            if (w.this.f12448l != null) {
                return true;
            }
            return false;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f12448l.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f12451b = e();
            this.f12450a = a();
        }

        public View getView(int i4, View view, ViewGroup viewGroup) {
            Drawable drawable;
            View view2 = super.getView(i4, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                if (w.this.getText().toString().contentEquals(textView.getText())) {
                    drawable = b();
                } else {
                    drawable = null;
                }
                androidx.core.view.P.s0(textView, drawable);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.f16503a);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f12442f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        return true;
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f4 = f();
        int i4 = 0;
        if (adapter == null || f4 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f12441e.x()) + 15);
        View view = null;
        int i5 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(max, view, f4);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        Drawable f5 = this.f12441e.f();
        if (f5 != null) {
            f5.getPadding(this.f12443g);
            Rect rect = this.f12443g;
            i5 += rect.left + rect.right;
        }
        return i5 + f4.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout f4 = f();
        if (f4 != null) {
            f4.o0();
        }
    }

    /* access modifiers changed from: private */
    public void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void dismissDropDown() {
        if (g()) {
            this.f12441e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f12446j;
    }

    public CharSequence getHint() {
        TextInputLayout f4 = f();
        if (f4 == null || !f4.Q()) {
            return super.getHint();
        }
        return f4.getHint();
    }

    public float getPopupElevation() {
        return this.f12445i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f12447k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f12448l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f4 = f();
        if (f4 != null && f4.Q() && super.getHint() == null && e.b()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12441e.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z3) {
        if (!g()) {
            super.onWindowFocusChanged(z3);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f12441e.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        P p4 = this.f12441e;
        if (p4 != null) {
            p4.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i4) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i4));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f12446j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).T(this.f12446j);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12441e.M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i4) {
        super.setRawInputType(i4);
        i();
    }

    public void setSimpleItemSelectedColor(int i4) {
        this.f12447k = i4;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f12448l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }

    public void showDropDown() {
        if (g()) {
            this.f12441e.d();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i4) {
        super(T1.a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f12443g = new Rect();
        Context context2 = getContext();
        TypedArray i5 = j.i(context2, attributeSet, z1.j.f16580Q1, i4, i.f16513b, new int[0]);
        int i6 = z1.j.f16584R1;
        if (i5.hasValue(i6) && i5.getInt(i6, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f12444h = i5.getResourceId(z1.j.f16596U1, z1.g.mtrl_auto_complete_simple_item);
        this.f12445i = (float) i5.getDimensionPixelOffset(z1.j.f16588S1, C0972c.mtrl_exposed_dropdown_menu_popup_elevation);
        int i7 = z1.j.f16592T1;
        if (i5.hasValue(i7)) {
            this.f12446j = ColorStateList.valueOf(i5.getColor(i7, 0));
        }
        this.f12447k = i5.getColor(z1.j.f16600V1, 0);
        this.f12448l = c.a(context2, i5, z1.j.f16604W1);
        this.f12442f = (AccessibilityManager) context2.getSystemService("accessibility");
        P p4 = new P(context2);
        this.f12441e = p4;
        p4.J(true);
        p4.D(this);
        p4.I(2);
        p4.p(getAdapter());
        p4.L(new a());
        int i8 = z1.j.f16608X1;
        if (i5.hasValue(i8)) {
            setSimpleItems(i5.getResourceId(i8, 0));
        }
        i5.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f12444h, strArr));
    }
}
