package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.O;

public class ActionMenuView extends O implements g.b, n {

    /* renamed from: A  reason: collision with root package name */
    e f3130A;

    /* renamed from: p  reason: collision with root package name */
    private g f3131p;

    /* renamed from: q  reason: collision with root package name */
    private Context f3132q;

    /* renamed from: r  reason: collision with root package name */
    private int f3133r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3134s;

    /* renamed from: t  reason: collision with root package name */
    private C0379c f3135t;

    /* renamed from: u  reason: collision with root package name */
    private m.a f3136u;

    /* renamed from: v  reason: collision with root package name */
    g.a f3137v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3138w;

    /* renamed from: x  reason: collision with root package name */
    private int f3139x;

    /* renamed from: y  reason: collision with root package name */
    private int f3140y;

    /* renamed from: z  reason: collision with root package name */
    private int f3141z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements m.a {
        b() {
        }

        public void a(g gVar, boolean z3) {
        }

        public boolean b(g gVar) {
            return false;
        }
    }

    public static class c extends O.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3142a;

        /* renamed from: b  reason: collision with root package name */
        public int f3143b;

        /* renamed from: c  reason: collision with root package name */
        public int f3144c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3145d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3146e;

        /* renamed from: f  reason: collision with root package name */
        boolean f3147f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f3142a = cVar.f3142a;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f3142a = false;
        }
    }

    private class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f3130A;
            if (eVar == null || !eVar.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.f3137v;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    static int L(View view, int i4, int i5, int i6, int i7) {
        ActionMenuItemView actionMenuItemView;
        boolean z3;
        int i8;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z4 = false;
        if (actionMenuItemView == null || !actionMenuItemView.r()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 > 0) {
            i8 = 2;
            if (!z3 || i5 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i9 = measuredWidth / i4;
                if (measuredWidth % i4 != 0) {
                    i9++;
                }
                if (!z3 || i9 >= 2) {
                    i8 = i9;
                }
                if (!cVar.f3142a && z3) {
                    z4 = true;
                }
                cVar.f3145d = z4;
                cVar.f3143b = i8;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
                return i8;
            }
        }
        i8 = 0;
        z4 = true;
        cVar.f3145d = z4;
        cVar.f3143b = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
        return i8;
    }

    private void M(int i4, int i5) {
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        int i11;
        boolean z7;
        int i12;
        boolean z8;
        boolean z9;
        int i13;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f3140y;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j4 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z11 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z11) {
                    int i26 = this.f3141z;
                    i12 = i25;
                    z8 = false;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i12 = i25;
                    z8 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f3147f = z8;
                cVar.f3144c = z8 ? 1 : 0;
                cVar.f3143b = z8;
                cVar.f3145d = z8;
                cVar.leftMargin = z8;
                cVar.rightMargin = z8;
                if (!z11 || !((ActionMenuItemView) childAt).r()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                cVar.f3146e = z9;
                if (cVar.f3142a) {
                    i13 = 1;
                } else {
                    i13 = i16;
                }
                int L3 = L(childAt, i18, i13, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, L3);
                if (cVar.f3145d) {
                    i23++;
                }
                if (cVar.f3142a) {
                    z10 = true;
                }
                i16 -= L3;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (L3 == 1) {
                    j4 |= (long) (1 << i20);
                    i19 = i19;
                } else {
                    int i27 = i19;
                }
                i21 = i12;
            }
            i20++;
            size2 = i24;
        }
        int i28 = size2;
        if (!z10 || i21 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z12 = false;
        while (true) {
            if (i23 <= 0 || i16 <= 0) {
                i8 = mode;
                i6 = i14;
                z4 = z12;
                i7 = i19;
            } else {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j5 = 0;
                while (i31 < childCount) {
                    boolean z13 = z12;
                    c cVar2 = (c) getChildAt(i31).getLayoutParams();
                    int i32 = i19;
                    if (cVar2.f3145d) {
                        int i33 = cVar2.f3143b;
                        if (i33 < i29) {
                            j5 = 1 << i31;
                            i29 = i33;
                            i30 = 1;
                        } else if (i33 == i29) {
                            i30++;
                            j5 |= 1 << i31;
                        }
                    }
                    i31++;
                    i19 = i32;
                    z12 = z13;
                }
                z4 = z12;
                i7 = i19;
                j4 |= j5;
                if (i30 > i16) {
                    i8 = mode;
                    i6 = i14;
                    break;
                }
                int i34 = i29 + 1;
                int i35 = 0;
                while (i35 < childCount) {
                    View childAt2 = getChildAt(i35);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i36 = i14;
                    int i37 = mode;
                    long j6 = (long) (1 << i35);
                    if ((j5 & j6) == 0) {
                        if (cVar3.f3143b == i34) {
                            j4 |= j6;
                        }
                        z7 = z3;
                    } else {
                        if (!z3 || !cVar3.f3146e || i16 != 1) {
                            z7 = z3;
                        } else {
                            int i38 = this.f3141z;
                            z7 = z3;
                            childAt2.setPadding(i38 + i18, 0, i38, 0);
                        }
                        cVar3.f3143b++;
                        cVar3.f3147f = true;
                        i16--;
                    }
                    i35++;
                    mode = i37;
                    i14 = i36;
                    z3 = z7;
                }
                i19 = i7;
                z12 = true;
            }
        }
        if (z10 || i21 != 1) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i16 <= 0 || j4 == 0 || (i16 >= i21 - 1 && !z5 && i22 <= 1)) {
            i9 = 0;
            z6 = z4;
        } else {
            float bitCount = (float) Long.bitCount(j4);
            if (!z5) {
                i9 = 0;
                if ((j4 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f3146e) {
                    bitCount -= 0.5f;
                }
                int i39 = childCount - 1;
                if ((j4 & ((long) (1 << i39))) != 0 && !((c) getChildAt(i39).getLayoutParams()).f3146e) {
                    bitCount -= 0.5f;
                }
            } else {
                i9 = 0;
            }
            if (bitCount > 0.0f) {
                i11 = (int) (((float) (i16 * i18)) / bitCount);
            } else {
                i11 = i9;
            }
            z6 = z4;
            for (int i40 = i9; i40 < childCount; i40++) {
                if ((j4 & ((long) (1 << i40))) != 0) {
                    View childAt3 = getChildAt(i40);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f3144c = i11;
                        cVar4.f3147f = true;
                        if (i40 == 0 && !cVar4.f3146e) {
                            cVar4.leftMargin = (-i11) / 2;
                        }
                        z6 = true;
                    } else if (cVar4.f3142a) {
                        cVar4.f3144c = i11;
                        cVar4.f3147f = true;
                        cVar4.rightMargin = (-i11) / 2;
                        z6 = true;
                    } else {
                        if (i40 != 0) {
                            cVar4.leftMargin = i11 / 2;
                        }
                        if (i40 != childCount - 1) {
                            cVar4.rightMargin = i11 / 2;
                        }
                    }
                }
            }
        }
        if (z6) {
            for (int i41 = i9; i41 < childCount; i41++) {
                View childAt4 = getChildAt(i41);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f3147f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f3143b * i18) + cVar5.f3144c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i8 != 1073741824) {
            i10 = i7;
        } else {
            i10 = i28;
        }
        setMeasuredDimension(i6, i10);
    }

    public void B() {
        C0379c cVar = this.f3135t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return m();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C3 = m();
        C3.f3142a = true;
        return C3;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i4) {
        boolean z3 = false;
        if (i4 == 0) {
            return false;
        }
        View childAt = getChildAt(i4 - 1);
        View childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            z3 = ((a) childAt).a();
        }
        if (i4 <= 0 || !(childAt2 instanceof a)) {
            return z3;
        }
        return z3 | ((a) childAt2).b();
    }

    public boolean H() {
        C0379c cVar = this.f3135t;
        if (cVar == null || !cVar.B()) {
            return false;
        }
        return true;
    }

    public boolean I() {
        C0379c cVar = this.f3135t;
        if (cVar == null || !cVar.D()) {
            return false;
        }
        return true;
    }

    public boolean J() {
        C0379c cVar = this.f3135t;
        if (cVar == null || !cVar.E()) {
            return false;
        }
        return true;
    }

    public boolean K() {
        return this.f3134s;
    }

    public g N() {
        return this.f3131p;
    }

    public void O(m.a aVar, g.a aVar2) {
        this.f3136u = aVar;
        this.f3137v = aVar2;
    }

    public boolean P() {
        C0379c cVar = this.f3135t;
        if (cVar == null || !cVar.K()) {
            return false;
        }
        return true;
    }

    public boolean a(i iVar) {
        return this.f3131p.L(iVar, 0);
    }

    public void b(g gVar) {
        this.f3131p = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f3131p == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.f3131p = gVar;
            gVar.R(new d());
            C0379c cVar = new C0379c(context);
            this.f3135t = cVar;
            cVar.J(true);
            C0379c cVar2 = this.f3135t;
            m.a aVar = this.f3136u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.k(aVar);
            this.f3131p.c(this.f3135t, this.f3132q);
            this.f3135t.H(this);
        }
        return this.f3131p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3135t.A();
    }

    public int getPopupTheme() {
        return this.f3133r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0379c cVar = this.f3135t;
        if (cVar != null) {
            cVar.f(false);
            if (this.f3135t.E()) {
                this.f3135t.B();
                this.f3135t.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        if (!this.f3138w) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i6 - i4;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean b4 = n0.b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f3142a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b4) {
                        i9 = getPaddingLeft() + cVar.leftMargin;
                        i10 = i9 + measuredWidth;
                    } else {
                        i10 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i9 = i10 - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i9, i16, i10, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        if (i19 > 0) {
            i8 = paddingRight / i19;
        } else {
            i8 = 0;
        }
        int max = Math.max(0, i8);
        if (b4) {
            int width = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f3142a) {
                    int i21 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width = i21 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f3142a) {
                int i24 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = i24 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        boolean z3;
        g gVar;
        boolean z4 = this.f3138w;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3138w = z3;
        if (z4 != z3) {
            this.f3139x = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (!(!this.f3138w || (gVar = this.f3131p) == null || size == this.f3139x)) {
            this.f3139x = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.f3138w || childCount <= 0) {
            for (int i6 = 0; i6 < childCount; i6++) {
                c cVar = (c) getChildAt(i6).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        M(i4, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f3135t.G(z3);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f3130A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f3135t.I(drawable);
    }

    public void setOverflowReserved(boolean z3) {
        this.f3134s = z3;
    }

    public void setPopupTheme(int i4) {
        if (this.f3133r != i4) {
            this.f3133r = i4;
            if (i4 == 0) {
                this.f3132q = getContext();
            } else {
                this.f3132q = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(C0379c cVar) {
        this.f3135t = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3140y = (int) (56.0f * f4);
        this.f3141z = (int) (f4 * 4.0f);
        this.f3132q = context;
        this.f3133r = 0;
    }
}
