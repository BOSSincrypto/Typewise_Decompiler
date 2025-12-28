package com.google.android.material.appbar;

import Q1.g;
import Q1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.a;
import androidx.core.view.P;
import com.google.android.material.internal.k;
import z1.C0970a;
import z1.i;

public class MaterialToolbar extends Toolbar {

    /* renamed from: c0  reason: collision with root package name */
    private static final int f11537c0 = i.Widget_MaterialComponents_Toolbar;

    /* renamed from: d0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f11538d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: U  reason: collision with root package name */
    private Integer f11539U;

    /* renamed from: V  reason: collision with root package name */
    private boolean f11540V;

    /* renamed from: W  reason: collision with root package name */
    private boolean f11541W;

    /* renamed from: a0  reason: collision with root package name */
    private ImageView.ScaleType f11542a0;

    /* renamed from: b0  reason: collision with root package name */
    private Boolean f11543b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.f16502O);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i4 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i4 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i4 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        int i4;
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            if (background != null) {
                i4 = ((ColorDrawable) background).getColor();
            } else {
                i4 = 0;
            }
            gVar.T(ColorStateList.valueOf(i4));
            gVar.J(context);
            gVar.S(P.w(this));
            P.s0(this, gVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i5 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i4, view.getTop(), i5, view.getBottom());
    }

    private void V() {
        if (this.f11540V || this.f11541W) {
            TextView e4 = k.e(this);
            TextView c4 = k.c(this);
            if (e4 != null || c4 != null) {
                Pair S3 = S(e4, c4);
                if (this.f11540V && e4 != null) {
                    U(e4, S3);
                }
                if (this.f11541W && c4 != null) {
                    U(c4, S3);
                }
            }
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f11539U == null) {
            return drawable;
        }
        Drawable r4 = a.r(drawable.mutate());
        a.n(r4, this.f11539U.intValue());
        return r4;
    }

    private void X() {
        ImageView b4 = k.b(this);
        if (b4 != null) {
            Boolean bool = this.f11543b0;
            if (bool != null) {
                b4.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f11542a0;
            if (scaleType != null) {
                b4.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f11542a0;
    }

    public Integer getNavigationIconTint() {
        return this.f11539U;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        V();
        X();
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        h.d(this, f4);
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f11543b0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f11543b0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f11542a0 != scaleType) {
            this.f11542a0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i4) {
        this.f11539U = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f11541W != z3) {
            this.f11541W = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f11540V != z3) {
            this.f11540V = z3;
            requestLayout();
        }
    }

    public void x(int i4) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof androidx.appcompat.view.menu.g;
        if (z3) {
            ((androidx.appcompat.view.menu.g) menu).d0();
        }
        super.x(i4);
        if (z3) {
            ((androidx.appcompat.view.menu.g) menu).c0();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f11537c0
            android.content.Context r8 = T1.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = z1.j.x3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.i(r0, r1, r2, r3, r4, r5)
            int r10 = z1.j.A3
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = z1.j.C3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f11540V = r10
            int r10 = z1.j.B3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f11541W = r10
            int r10 = z1.j.z3
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f11538d0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f11542a0 = r10
        L_0x004a:
            int r10 = z1.j.y3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f11543b0 = r10
        L_0x005c:
            r9.recycle()
            r7.T(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
