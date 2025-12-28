package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.h0;
import androidx.core.content.res.h;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.widget.j;
import n.C0822a;
import z1.C0972c;
import z1.d;
import z1.e;
import z1.g;

public class NavigationMenuItemView extends d implements n.a {

    /* renamed from: G  reason: collision with root package name */
    private static final int[] f12043G = {16842912};

    /* renamed from: A  reason: collision with root package name */
    private FrameLayout f12044A;

    /* renamed from: B  reason: collision with root package name */
    private i f12045B;

    /* renamed from: C  reason: collision with root package name */
    private ColorStateList f12046C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f12047D;

    /* renamed from: E  reason: collision with root package name */
    private Drawable f12048E;

    /* renamed from: F  reason: collision with root package name */
    private final C0402a f12049F;

    /* renamed from: v  reason: collision with root package name */
    private int f12050v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12051w;

    /* renamed from: x  reason: collision with root package name */
    boolean f12052x;

    /* renamed from: y  reason: collision with root package name */
    boolean f12053y;

    /* renamed from: z  reason: collision with root package name */
    private final CheckedTextView f12054z;

    class a extends C0402a {
        a() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.h0(NavigationMenuItemView.this.f12052x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f12054z.setVisibility(8);
            FrameLayout frameLayout = this.f12044A;
            if (frameLayout != null) {
                O.a aVar = (O.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f12044A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f12054z.setVisibility(0);
        FrameLayout frameLayout2 = this.f12044A;
        if (frameLayout2 != null) {
            O.a aVar2 = (O.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f12044A.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0822a.f14687t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f12043G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        if (this.f12045B.getTitle() == null && this.f12045B.getIcon() == null && this.f12045B.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f12044A == null) {
                this.f12044A = (FrameLayout) ((ViewStub) findViewById(e.design_menu_item_action_area_stub)).inflate();
            }
            this.f12044A.removeAllViews();
            this.f12044A.addView(view);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i4) {
        int i5;
        this.f12045B = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        if (iVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        if (getBackground() == null) {
            P.s0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        h0.a(this, iVar.getTooltipText());
        B();
    }

    public i getItemData() {
        return this.f12045B;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        i iVar = this.f12045B;
        if (iVar != null && iVar.isCheckable() && this.f12045B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12043G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f12052x != z3) {
            this.f12052x = z3;
            this.f12049F.l(this.f12054z, 2048);
        }
    }

    public void setChecked(boolean z3) {
        int i4;
        refreshDrawableState();
        this.f12054z.setChecked(z3);
        CheckedTextView checkedTextView = this.f12054z;
        Typeface typeface = checkedTextView.getTypeface();
        if (!z3 || !this.f12053y) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        checkedTextView.setTypeface(typeface, i4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f12047D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.f12046C);
            }
            int i4 = this.f12050v;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f12051w) {
            if (this.f12048E == null) {
                Drawable e4 = h.e(getResources(), d.navigation_empty_icon, getContext().getTheme());
                this.f12048E = e4;
                if (e4 != null) {
                    int i5 = this.f12050v;
                    e4.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f12048E;
        }
        j.j(this.f12054z, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i4) {
        this.f12054z.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f12050v = i4;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z3;
        this.f12046C = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f12047D = z3;
        i iVar = this.f12045B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f12054z.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f12051w = z3;
    }

    public void setTextAppearance(int i4) {
        j.o(this.f12054z, i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12054z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12054z.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f12053y = true;
        a aVar = new a();
        this.f12049F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(g.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0972c.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.design_menu_item_text);
        this.f12054z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        P.o0(checkedTextView, aVar);
    }
}
