package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: x  reason: collision with root package name */
    private static g f4185x;

    /* renamed from: a  reason: collision with root package name */
    SparseArray f4186a = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f4187b = new ArrayList(4);

    /* renamed from: c  reason: collision with root package name */
    protected d f4188c = new d();

    /* renamed from: d  reason: collision with root package name */
    private int f4189d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f4190e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f4191f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    private int f4192g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f4193h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f4194i = 257;

    /* renamed from: j  reason: collision with root package name */
    private c f4195j = null;

    /* renamed from: k  reason: collision with root package name */
    protected b f4196k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f4197l = -1;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f4198m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private int f4199n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f4200o = -1;

    /* renamed from: p  reason: collision with root package name */
    int f4201p = -1;

    /* renamed from: q  reason: collision with root package name */
    int f4202q = -1;

    /* renamed from: r  reason: collision with root package name */
    int f4203r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f4204s = 0;

    /* renamed from: t  reason: collision with root package name */
    private SparseArray f4205t = new SparseArray();

    /* renamed from: u  reason: collision with root package name */
    c f4206u = new c(this);

    /* renamed from: v  reason: collision with root package name */
    private int f4207v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f4208w = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4209a = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4209a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4209a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4209a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements b.C0061b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f4286a;

        /* renamed from: b  reason: collision with root package name */
        int f4287b;

        /* renamed from: c  reason: collision with root package name */
        int f4288c;

        /* renamed from: d  reason: collision with root package name */
        int f4289d;

        /* renamed from: e  reason: collision with root package name */
        int f4290e;

        /* renamed from: f  reason: collision with root package name */
        int f4291f;

        /* renamed from: g  reason: collision with root package name */
        int f4292g;

        public c(ConstraintLayout constraintLayout) {
            this.f4286a = constraintLayout;
        }

        private boolean d(int i4, int i5, int i6) {
            if (i4 == i5) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i6 == size) {
                return true;
            }
            return false;
        }

        public final void a() {
            int childCount = this.f4286a.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                this.f4286a.getChildAt(i4);
            }
            int size = this.f4286a.f4187b.size();
            if (size > 0) {
                for (int i5 = 0; i5 < size; i5++) {
                    ((a) this.f4286a.f4187b.get(i5)).l(this.f4286a);
                }
            }
        }

        public final void b(ConstraintWidget constraintWidget, b.a aVar) {
            int i4;
            int i5;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            int i6;
            int i7;
            int i8;
            int i9;
            boolean z9;
            boolean z10;
            int i10;
            int i11;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            ConstraintWidget constraintWidget2 = constraintWidget;
            b.a aVar2 = aVar;
            if (constraintWidget2 != null) {
                if (constraintWidget.V() == 8 && !constraintWidget.j0()) {
                    aVar2.f4004e = 0;
                    aVar2.f4005f = 0;
                    aVar2.f4006g = 0;
                } else if (constraintWidget.K() != null) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f4000a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f4001b;
                    int i12 = aVar2.f4002c;
                    int i13 = aVar2.f4003d;
                    int i14 = this.f4287b + this.f4288c;
                    int i15 = this.f4289d;
                    View view = (View) constraintWidget.s();
                    int[] iArr = a.f4209a;
                    int i16 = iArr[dimensionBehaviour.ordinal()];
                    if (i16 == 1) {
                        i4 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else if (i16 == 2) {
                        i4 = ViewGroup.getChildMeasureSpec(this.f4291f, i15, -2);
                    } else if (i16 == 3) {
                        i4 = ViewGroup.getChildMeasureSpec(this.f4291f, i15 + constraintWidget.B(), -1);
                    } else if (i16 != 4) {
                        i4 = 0;
                    } else {
                        i4 = ViewGroup.getChildMeasureSpec(this.f4291f, i15, -2);
                        if (constraintWidget2.f3954w == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i17 = aVar2.f4009j;
                        if (i17 == b.a.f3998l || i17 == b.a.f3999m) {
                            if (view.getMeasuredHeight() == constraintWidget.x()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (aVar2.f4009j == b.a.f3999m || !z13 || ((z13 && z14) || constraintWidget.n0())) {
                                i4 = View.MeasureSpec.makeMeasureSpec(constraintWidget.W(), 1073741824);
                            }
                        }
                    }
                    int i18 = iArr[dimensionBehaviour2.ordinal()];
                    if (i18 == 1) {
                        i5 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else if (i18 == 2) {
                        i5 = ViewGroup.getChildMeasureSpec(this.f4292g, i14, -2);
                    } else if (i18 == 3) {
                        i5 = ViewGroup.getChildMeasureSpec(this.f4292g, i14 + constraintWidget.U(), -1);
                    } else if (i18 != 4) {
                        i5 = 0;
                    } else {
                        i5 = ViewGroup.getChildMeasureSpec(this.f4292g, i14, -2);
                        if (constraintWidget2.f3956x == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i19 = aVar2.f4009j;
                        if (i19 == b.a.f3998l || i19 == b.a.f3999m) {
                            if (view.getMeasuredWidth() == constraintWidget.W()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (aVar2.f4009j == b.a.f3999m || !z11 || ((z11 && z12) || constraintWidget.o0())) {
                                i5 = View.MeasureSpec.makeMeasureSpec(constraintWidget.x(), 1073741824);
                            }
                        }
                    }
                    d dVar = (d) constraintWidget.K();
                    if (dVar == null || !g.b(ConstraintLayout.this.f4194i, 256) || view.getMeasuredWidth() != constraintWidget.W() || view.getMeasuredWidth() >= dVar.W() || view.getMeasuredHeight() != constraintWidget.x() || view.getMeasuredHeight() >= dVar.x() || view.getBaseline() != constraintWidget.p() || constraintWidget.m0() || !d(constraintWidget.C(), i4, constraintWidget.W()) || !d(constraintWidget.D(), i5, constraintWidget.x())) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour == dimensionBehaviour3) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dimensionBehaviour2 == dimensionBehaviour3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                        if (dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z3 || constraintWidget2.f3917d0 <= 0.0f) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (!z4 || constraintWidget2.f3917d0 <= 0.0f) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (view != null) {
                            b bVar = (b) view.getLayoutParams();
                            int i20 = aVar2.f4009j;
                            if (i20 == b.a.f3998l || i20 == b.a.f3999m || !z3 || constraintWidget2.f3954w != 0 || !z4 || constraintWidget2.f3956x != 0) {
                                if (!(view instanceof h) || !(constraintWidget2 instanceof h)) {
                                    view.measure(i4, i5);
                                } else {
                                    ((h) view).p((h) constraintWidget2, i4, i5);
                                }
                                constraintWidget2.V0(i4, i5);
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                i7 = view.getBaseline();
                                int i21 = constraintWidget2.f3960z;
                                if (i21 > 0) {
                                    i6 = Math.max(i21, measuredWidth);
                                } else {
                                    i6 = measuredWidth;
                                }
                                int i22 = constraintWidget2.f3874A;
                                if (i22 > 0) {
                                    i6 = Math.min(i22, i6);
                                }
                                int i23 = constraintWidget2.f3878C;
                                if (i23 > 0) {
                                    i8 = Math.max(i23, measuredHeight);
                                    i10 = i4;
                                } else {
                                    i10 = i4;
                                    i8 = measuredHeight;
                                }
                                int i24 = constraintWidget2.f3880D;
                                if (i24 > 0) {
                                    i8 = Math.min(i24, i8);
                                }
                                if (!g.b(ConstraintLayout.this.f4194i, 1)) {
                                    if (z7 && z5) {
                                        i6 = (int) ((((float) i8) * constraintWidget2.f3917d0) + 0.5f);
                                    } else if (z8 && z6) {
                                        i8 = (int) ((((float) i6) / constraintWidget2.f3917d0) + 0.5f);
                                    }
                                }
                                if (!(measuredWidth == i6 && measuredHeight == i8)) {
                                    if (measuredWidth != i6) {
                                        i11 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                    } else {
                                        i11 = i10;
                                    }
                                    if (measuredHeight != i8) {
                                        i5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                    }
                                    view.measure(i11, i5);
                                    constraintWidget2.V0(i11, i5);
                                    i6 = view.getMeasuredWidth();
                                    i8 = view.getMeasuredHeight();
                                    i7 = view.getBaseline();
                                }
                                i9 = -1;
                            } else {
                                i9 = -1;
                                i8 = 0;
                                i7 = 0;
                                i6 = 0;
                            }
                            if (i7 != i9) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (i6 == aVar2.f4002c && i8 == aVar2.f4003d) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            aVar2.f4008i = z10;
                            if (bVar.f4249g0) {
                                z9 = true;
                            }
                            if (!(!z9 || i7 == -1 || constraintWidget.p() == i7)) {
                                aVar2.f4008i = true;
                            }
                            aVar2.f4004e = i6;
                            aVar2.f4005f = i8;
                            aVar2.f4007h = z9;
                            aVar2.f4006g = i7;
                            return;
                        }
                        return;
                    }
                    aVar2.f4004e = constraintWidget.W();
                    aVar2.f4005f = constraintWidget.x();
                    aVar2.f4006g = constraintWidget.p();
                }
            }
        }

        public void c(int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f4287b = i6;
            this.f4288c = i7;
            this.f4289d = i8;
            this.f4290e = i9;
            this.f4291f = i4;
            this.f4292g = i5;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        q((AttributeSet) null, 0, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            } else if (getChildAt(i4).isLayoutRequested()) {
                z3 = true;
                break;
            } else {
                i4++;
            }
        }
        if (z3) {
            w();
        }
        return z3;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static g getSharedValues() {
        if (f4185x == null) {
            f4185x = new g();
        }
        return f4185x;
    }

    private final ConstraintWidget k(int i4) {
        if (i4 == 0) {
            return this.f4188c;
        }
        View view = (View) this.f4186a.get(i4);
        if (view == null && (view = findViewById(i4)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f4188c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f4279v0;
    }

    private void q(AttributeSet attributeSet, int i4, int i5) {
        this.f4188c.B0(this);
        this.f4188c.V1(this.f4206u);
        this.f4186a.put(getId(), this);
        this.f4195j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f4623n1, i4, i5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == f.f4670x1) {
                    this.f4189d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4189d);
                } else if (index == f.f4674y1) {
                    this.f4190e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4190e);
                } else if (index == f.f4662v1) {
                    this.f4191f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4191f);
                } else if (index == f.f4666w1) {
                    this.f4192g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4192g);
                } else if (index == f.f4590g3) {
                    this.f4194i = obtainStyledAttributes.getInt(index, this.f4194i);
                } else if (index == f.f4564b2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4196k = null;
                        }
                    }
                } else if (index == f.f4474F1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.f4195j = cVar;
                        cVar.o(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4195j = null;
                    }
                    this.f4197l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4188c.W1(this.f4194i);
    }

    private void s() {
        this.f4193h = true;
        this.f4199n = -1;
        this.f4200o = -1;
        this.f4201p = -1;
        this.f4202q = -1;
        this.f4203r = 0;
        this.f4204s = 0;
    }

    private void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ConstraintWidget p4 = p(getChildAt(i4));
            if (p4 != null) {
                p4.t0();
            }
        }
        if (isInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    k(childAt.getId()).C0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f4197l != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                getChildAt(i6).getId();
            }
        }
        c cVar = this.f4195j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f4188c.u1();
        int size = this.f4187b.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((a) this.f4187b.get(i7)).n(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8);
        }
        this.f4205t.clear();
        this.f4205t.put(0, this.f4188c);
        this.f4205t.put(getId(), this.f4188c);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            this.f4205t.put(childAt2.getId(), p(childAt2));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            ConstraintWidget p5 = p(childAt3);
            if (p5 != null) {
                this.f4188c.c(p5);
                d(isInEditMode, childAt3, p5, (b) childAt3.getLayoutParams(), this.f4205t);
            }
        }
    }

    private void z(ConstraintWidget constraintWidget, b bVar, SparseArray sparseArray, int i4, ConstraintAnchor.Type type) {
        View view = (View) this.f4186a.get(i4);
        ConstraintWidget constraintWidget2 = (ConstraintWidget) sparseArray.get(i4);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f4249g0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f4249g0 = true;
                bVar2.f4279v0.K0(true);
            }
            constraintWidget.o(type2).b(constraintWidget2.o(type), bVar.f4213D, bVar.f4212C, true);
            constraintWidget.K0(true);
            constraintWidget.o(ConstraintAnchor.Type.TOP).q();
            constraintWidget.o(ConstraintAnchor.Type.BOTTOM).q();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void d(boolean z3, View view, ConstraintWidget constraintWidget, b bVar, SparseArray sparseArray) {
        int i4;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        View view2 = view;
        ConstraintWidget constraintWidget6 = constraintWidget;
        b bVar2 = bVar;
        SparseArray sparseArray2 = sparseArray;
        bVar.a();
        bVar2.f4281w0 = false;
        constraintWidget6.j1(view.getVisibility());
        if (bVar2.f4255j0) {
            constraintWidget6.T0(true);
            constraintWidget6.j1(8);
        }
        constraintWidget6.B0(view2);
        if (view2 instanceof a) {
            ((a) view2).j(constraintWidget6, this.f4188c.P1());
        }
        if (bVar2.f4251h0) {
            f fVar = (f) constraintWidget6;
            int i5 = bVar2.f4273s0;
            int i6 = bVar2.f4275t0;
            float f4 = bVar2.f4277u0;
            if (f4 != -1.0f) {
                fVar.z1(f4);
            } else if (i5 != -1) {
                fVar.x1(i5);
            } else if (i6 != -1) {
                fVar.y1(i6);
            }
        } else {
            int i7 = bVar2.f4259l0;
            int i8 = bVar2.f4261m0;
            int i9 = bVar2.f4263n0;
            int i10 = bVar2.f4265o0;
            int i11 = bVar2.f4267p0;
            int i12 = bVar2.f4269q0;
            float f5 = bVar2.f4271r0;
            int i13 = bVar2.f4266p;
            if (i13 != -1) {
                ConstraintWidget constraintWidget7 = (ConstraintWidget) sparseArray2.get(i13);
                if (constraintWidget7 != null) {
                    constraintWidget6.l(constraintWidget7, bVar2.f4270r, bVar2.f4268q);
                }
            } else {
                if (i7 != -1) {
                    ConstraintWidget constraintWidget8 = (ConstraintWidget) sparseArray2.get(i7);
                    if (constraintWidget8 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        constraintWidget.e0(type, constraintWidget8, type, bVar2.leftMargin, i11);
                    }
                } else if (!(i8 == -1 || (constraintWidget5 = (ConstraintWidget) sparseArray2.get(i8)) == null)) {
                    constraintWidget.e0(ConstraintAnchor.Type.LEFT, constraintWidget5, ConstraintAnchor.Type.RIGHT, bVar2.leftMargin, i11);
                }
                if (i9 != -1) {
                    ConstraintWidget constraintWidget9 = (ConstraintWidget) sparseArray2.get(i9);
                    if (constraintWidget9 != null) {
                        constraintWidget.e0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, bVar2.rightMargin, i12);
                    }
                } else if (!(i10 == -1 || (constraintWidget4 = (ConstraintWidget) sparseArray2.get(i10)) == null)) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.e0(type2, constraintWidget4, type2, bVar2.rightMargin, i12);
                }
                int i14 = bVar2.f4252i;
                if (i14 != -1) {
                    ConstraintWidget constraintWidget10 = (ConstraintWidget) sparseArray2.get(i14);
                    if (constraintWidget10 != null) {
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                        constraintWidget.e0(type3, constraintWidget10, type3, bVar2.topMargin, bVar2.f4282x);
                    }
                } else {
                    int i15 = bVar2.f4254j;
                    if (!(i15 == -1 || (constraintWidget3 = (ConstraintWidget) sparseArray2.get(i15)) == null)) {
                        constraintWidget.e0(ConstraintAnchor.Type.TOP, constraintWidget3, ConstraintAnchor.Type.BOTTOM, bVar2.topMargin, bVar2.f4282x);
                    }
                }
                int i16 = bVar2.f4256k;
                if (i16 != -1) {
                    ConstraintWidget constraintWidget11 = (ConstraintWidget) sparseArray2.get(i16);
                    if (constraintWidget11 != null) {
                        constraintWidget.e0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, bVar2.bottomMargin, bVar2.f4284z);
                    }
                } else {
                    int i17 = bVar2.f4258l;
                    if (!(i17 == -1 || (constraintWidget2 = (ConstraintWidget) sparseArray2.get(i17)) == null)) {
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                        constraintWidget.e0(type4, constraintWidget2, type4, bVar2.bottomMargin, bVar2.f4284z);
                    }
                }
                int i18 = bVar2.f4260m;
                if (i18 != -1) {
                    z(constraintWidget, bVar, sparseArray, i18, ConstraintAnchor.Type.BASELINE);
                } else {
                    int i19 = bVar2.f4262n;
                    if (i19 != -1) {
                        z(constraintWidget, bVar, sparseArray, i19, ConstraintAnchor.Type.TOP);
                    } else {
                        int i20 = bVar2.f4264o;
                        if (i20 != -1) {
                            z(constraintWidget, bVar, sparseArray, i20, ConstraintAnchor.Type.BOTTOM);
                        }
                    }
                }
                if (f5 >= 0.0f) {
                    constraintWidget6.M0(f5);
                }
                float f6 = bVar2.f4217H;
                if (f6 >= 0.0f) {
                    constraintWidget6.d1(f6);
                }
            }
            if (z3 && !((i4 = bVar2.f4233X) == -1 && bVar2.f4234Y == -1)) {
                constraintWidget6.b1(i4, bVar2.f4234Y);
            }
            if (bVar2.f4245e0) {
                constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.k1(bVar2.width);
                if (bVar2.width == -2) {
                    constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f4237a0) {
                    constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.o(ConstraintAnchor.Type.LEFT).f3868g = bVar2.leftMargin;
                constraintWidget6.o(ConstraintAnchor.Type.RIGHT).f3868g = bVar2.rightMargin;
            } else {
                constraintWidget6.P0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.k1(0);
            }
            if (bVar2.f4247f0) {
                constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.L0(bVar2.height);
                if (bVar2.height == -2) {
                    constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f4239b0) {
                    constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.o(ConstraintAnchor.Type.TOP).f3868g = bVar2.topMargin;
                constraintWidget6.o(ConstraintAnchor.Type.BOTTOM).f3868g = bVar2.bottomMargin;
            } else {
                constraintWidget6.g1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.L0(0);
            }
            constraintWidget6.D0(bVar2.f4218I);
            constraintWidget6.R0(bVar2.f4221L);
            constraintWidget6.i1(bVar2.f4222M);
            constraintWidget6.N0(bVar2.f4223N);
            constraintWidget6.e1(bVar2.f4224O);
            constraintWidget6.l1(bVar2.f4243d0);
            constraintWidget6.Q0(bVar2.f4225P, bVar2.f4227R, bVar2.f4229T, bVar2.f4231V);
            constraintWidget6.h1(bVar2.f4226Q, bVar2.f4228S, bVar2.f4230U, bVar2.f4232W);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f4187b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((a) this.f4187b.get(i4)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i6 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i7 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f4 = (float) i6;
                        float f5 = (float) i7;
                        float f6 = (float) (i6 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f7 = f5;
                        float f8 = f5;
                        float f9 = f6;
                        float f10 = f4;
                        Paint paint2 = paint;
                        canvas2.drawLine(f4, f7, f9, f8, paint);
                        float parseInt4 = (float) (i7 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f11 = f6;
                        float f12 = parseInt4;
                        canvas2.drawLine(f11, f8, f9, f12, paint);
                        float f13 = parseInt4;
                        float f14 = f10;
                        canvas2.drawLine(f11, f13, f14, f12, paint);
                        float f15 = f10;
                        canvas2.drawLine(f15, f13, f14, f8, paint);
                        paint.setColor(-16711936);
                        float f16 = f6;
                        Paint paint3 = paint;
                        canvas2.drawLine(f15, f8, f16, parseInt4, paint);
                        canvas2.drawLine(f15, parseInt4, f16, f8, paint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    /* renamed from: f */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i4, Object obj) {
        if (i4 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f4198m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f4198m.get(str);
    }

    public int getMaxHeight() {
        return this.f4192g;
    }

    public int getMaxWidth() {
        return this.f4191f;
    }

    public int getMinHeight() {
        return this.f4190e;
    }

    public int getMinWidth() {
        return this.f4189d;
    }

    public int getOptimizationLevel() {
        return this.f4188c.J1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f4188c.f3938o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f4188c.f3938o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f4188c.f3938o = "parent";
            }
        }
        if (this.f4188c.t() == null) {
            d dVar = this.f4188c;
            dVar.C0(dVar.f3938o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.f4188c.t());
        }
        Iterator it = this.f4188c.r1().iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            View view = (View) constraintWidget.s();
            if (view != null) {
                if (constraintWidget.f3938o == null && (id = view.getId()) != -1) {
                    constraintWidget.f3938o = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.t() == null) {
                    constraintWidget.C0(constraintWidget.f3938o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(constraintWidget.t());
                }
            }
        }
        this.f4188c.O(sb);
        return sb.toString();
    }

    public View l(int i4) {
        return (View) this.f4186a.get(i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f4279v0;
            if ((childAt.getVisibility() != 8 || bVar.f4251h0 || bVar.f4253i0 || bVar.f4257k0 || isInEditMode) && !bVar.f4255j0) {
                int X3 = constraintWidget.X();
                int Y3 = constraintWidget.Y();
                childAt.layout(X3, Y3, constraintWidget.W() + X3, constraintWidget.x() + Y3);
            }
        }
        int size = this.f4187b.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((a) this.f4187b.get(i9)).k(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        if (this.f4207v == i4) {
            int i6 = this.f4208w;
        }
        if (!this.f4193h) {
            int childCount = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                } else if (getChildAt(i7).isLayoutRequested()) {
                    this.f4193h = true;
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f4207v = i4;
        this.f4208w = i5;
        this.f4188c.Y1(r());
        if (this.f4193h) {
            this.f4193h = false;
            if (A()) {
                this.f4188c.a2();
            }
        }
        v(this.f4188c, this.f4194i, i4, i5);
        u(i4, i5, this.f4188c.W(), this.f4188c.x(), this.f4188c.Q1(), this.f4188c.O1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget p4 = p(view);
        if ((view instanceof Guideline) && !(p4 instanceof f)) {
            b bVar = (b) view.getLayoutParams();
            f fVar = new f();
            bVar.f4279v0 = fVar;
            bVar.f4251h0 = true;
            fVar.A1(bVar.f4235Z);
        }
        if (view instanceof a) {
            a aVar = (a) view;
            aVar.o();
            ((b) view.getLayoutParams()).f4253i0 = true;
            if (!this.f4187b.contains(aVar)) {
                this.f4187b.add(aVar);
            }
        }
        this.f4186a.put(view.getId(), view);
        this.f4193h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4186a.remove(view.getId());
        this.f4188c.t1(p(view));
        this.f4187b.remove(view);
        this.f4193h = true;
    }

    public final ConstraintWidget p(View view) {
        if (view == this) {
            return this.f4188c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f4279v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f4279v0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean r() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.f4195j = cVar;
    }

    public void setId(int i4) {
        this.f4186a.remove(getId());
        super.setId(i4);
        this.f4186a.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 != this.f4192g) {
            this.f4192g = i4;
            requestLayout();
        }
    }

    public void setMaxWidth(int i4) {
        if (i4 != this.f4191f) {
            this.f4191f = i4;
            requestLayout();
        }
    }

    public void setMinHeight(int i4) {
        if (i4 != this.f4190e) {
            this.f4190e = i4;
            requestLayout();
        }
    }

    public void setMinWidth(int i4) {
        if (i4 != this.f4189d) {
            this.f4189d = i4;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(d dVar) {
        b bVar = this.f4196k;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public void setOptimizationLevel(int i4) {
        this.f4194i = i4;
        this.f4188c.W1(i4);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void t(int i4) {
        this.f4196k = new b(getContext(), this, i4);
    }

    /* access modifiers changed from: protected */
    public void u(int i4, int i5, int i6, int i7, boolean z3, boolean z4) {
        c cVar = this.f4206u;
        int i8 = cVar.f4290e;
        int resolveSizeAndState = View.resolveSizeAndState(i6 + cVar.f4289d, i4, 0);
        int min = Math.min(this.f4191f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f4192g, View.resolveSizeAndState(i7 + i8, i5, 0) & 16777215);
        if (z3) {
            min |= 16777216;
        }
        if (z4) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f4199n = min;
        this.f4200o = min2;
    }

    /* access modifiers changed from: protected */
    public void v(d dVar, int i4, int i5, int i6) {
        int i7;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i8 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f4206u.c(i5, i6, max, max2, paddingWidth, i8);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i7 = Math.max(0, getPaddingLeft());
        } else if (r()) {
            i7 = max4;
        } else {
            i7 = max3;
        }
        int i9 = size - paddingWidth;
        int i10 = size2 - i8;
        y(dVar, mode, i9, mode2, i10);
        dVar.R1(i4, mode, i9, mode2, i10, this.f4199n, this.f4200o, i7, max);
    }

    public void x(int i4, Object obj, Object obj2) {
        if (i4 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f4198m == null) {
                this.f4198m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f4198m.put(str, num);
        }
    }

    /* access modifiers changed from: protected */
    public void y(d dVar, int i4, int i5, int i6, int i7) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        c cVar = this.f4206u;
        int i8 = cVar.f4290e;
        int i9 = cVar.f4289d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i4 != Integer.MIN_VALUE) {
            if (i4 == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i5 = Math.max(0, this.f4189d);
                }
            } else if (i4 != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i5 = Math.min(this.f4191f - i9, i5);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i5 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f4189d);
            }
        }
        if (i6 != Integer.MIN_VALUE) {
            if (i6 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i7 = Math.max(0, this.f4190e);
                }
            } else if (i6 == 1073741824) {
                i7 = Math.min(this.f4192g - i8, i7);
            }
            i7 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i7 = Math.max(0, this.f4190e);
            }
        }
        if (!(i5 == dVar.W() && i7 == dVar.x())) {
            dVar.N1();
        }
        dVar.m1(0);
        dVar.n1(0);
        dVar.X0(this.f4191f - i9);
        dVar.W0(this.f4192g - i8);
        dVar.a1(0);
        dVar.Z0(0);
        dVar.P0(dimensionBehaviour);
        dVar.k1(i5);
        dVar.g1(dimensionBehaviour2);
        dVar.L0(i7);
        dVar.a1(this.f4189d - i9);
        dVar.Z0(this.f4190e - i8);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        q(attributeSet, i4, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A  reason: collision with root package name */
        public int f4210A = Integer.MIN_VALUE;

        /* renamed from: B  reason: collision with root package name */
        public int f4211B = Integer.MIN_VALUE;

        /* renamed from: C  reason: collision with root package name */
        public int f4212C = Integer.MIN_VALUE;

        /* renamed from: D  reason: collision with root package name */
        public int f4213D = 0;

        /* renamed from: E  reason: collision with root package name */
        boolean f4214E = true;

        /* renamed from: F  reason: collision with root package name */
        boolean f4215F = true;

        /* renamed from: G  reason: collision with root package name */
        public float f4216G = 0.5f;

        /* renamed from: H  reason: collision with root package name */
        public float f4217H = 0.5f;

        /* renamed from: I  reason: collision with root package name */
        public String f4218I = null;

        /* renamed from: J  reason: collision with root package name */
        float f4219J = 0.0f;

        /* renamed from: K  reason: collision with root package name */
        int f4220K = 1;

        /* renamed from: L  reason: collision with root package name */
        public float f4221L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f4222M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public int f4223N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f4224O = 0;

        /* renamed from: P  reason: collision with root package name */
        public int f4225P = 0;

        /* renamed from: Q  reason: collision with root package name */
        public int f4226Q = 0;

        /* renamed from: R  reason: collision with root package name */
        public int f4227R = 0;

        /* renamed from: S  reason: collision with root package name */
        public int f4228S = 0;

        /* renamed from: T  reason: collision with root package name */
        public int f4229T = 0;

        /* renamed from: U  reason: collision with root package name */
        public int f4230U = 0;

        /* renamed from: V  reason: collision with root package name */
        public float f4231V = 1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f4232W = 1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f4233X = -1;

        /* renamed from: Y  reason: collision with root package name */
        public int f4234Y = -1;

        /* renamed from: Z  reason: collision with root package name */
        public int f4235Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f4236a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f4237a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f4238b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f4239b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f4240c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f4241c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4242d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f4243d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4244e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f4245e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f4246f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f4247f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f4248g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f4249g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f4250h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f4251h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f4252i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f4253i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f4254j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f4255j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f4256k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f4257k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f4258l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f4259l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f4260m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f4261m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f4262n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f4263n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f4264o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f4265o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f4266p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f4267p0 = Integer.MIN_VALUE;

        /* renamed from: q  reason: collision with root package name */
        public int f4268q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f4269q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f4270r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f4271r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f4272s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f4273s0;

        /* renamed from: t  reason: collision with root package name */
        public int f4274t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f4275t0;

        /* renamed from: u  reason: collision with root package name */
        public int f4276u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f4277u0;

        /* renamed from: v  reason: collision with root package name */
        public int f4278v = -1;

        /* renamed from: v0  reason: collision with root package name */
        ConstraintWidget f4279v0 = new ConstraintWidget();

        /* renamed from: w  reason: collision with root package name */
        public int f4280w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f4281w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f4282x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f4283y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f4284z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f4285a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4285a = sparseIntArray;
                sparseIntArray.append(f.f4523R2, 64);
                sparseIntArray.append(f.f4659u2, 65);
                sparseIntArray.append(f.f4467D2, 8);
                sparseIntArray.append(f.f4471E2, 9);
                sparseIntArray.append(f.f4479G2, 10);
                sparseIntArray.append(f.f4483H2, 11);
                sparseIntArray.append(f.f4507N2, 12);
                sparseIntArray.append(f.f4503M2, 13);
                sparseIntArray.append(f.f4609k2, 14);
                sparseIntArray.append(f.f4604j2, 15);
                sparseIntArray.append(f.f4584f2, 16);
                sparseIntArray.append(f.f4594h2, 52);
                sparseIntArray.append(f.f4589g2, 53);
                sparseIntArray.append(f.f4614l2, 2);
                sparseIntArray.append(f.f4624n2, 3);
                sparseIntArray.append(f.f4619m2, 4);
                sparseIntArray.append(f.f4543W2, 49);
                sparseIntArray.append(f.f4547X2, 50);
                sparseIntArray.append(f.f4644r2, 5);
                sparseIntArray.append(f.f4649s2, 6);
                sparseIntArray.append(f.f4654t2, 7);
                sparseIntArray.append(f.f4559a2, 67);
                sparseIntArray.append(f.f4628o1, 1);
                sparseIntArray.append(f.f4487I2, 17);
                sparseIntArray.append(f.f4491J2, 18);
                sparseIntArray.append(f.f4639q2, 19);
                sparseIntArray.append(f.f4634p2, 20);
                sparseIntArray.append(f.f4565b3, 21);
                sparseIntArray.append(f.f4580e3, 22);
                sparseIntArray.append(f.f4570c3, 23);
                sparseIntArray.append(f.f4555Z2, 24);
                sparseIntArray.append(f.f4575d3, 25);
                sparseIntArray.append(f.f4560a3, 26);
                sparseIntArray.append(f.f4551Y2, 55);
                sparseIntArray.append(f.f4585f3, 54);
                sparseIntArray.append(f.f4679z2, 29);
                sparseIntArray.append(f.f4511O2, 30);
                sparseIntArray.append(f.f4629o2, 44);
                sparseIntArray.append(f.f4459B2, 45);
                sparseIntArray.append(f.f4519Q2, 46);
                sparseIntArray.append(f.f4455A2, 47);
                sparseIntArray.append(f.f4515P2, 48);
                sparseIntArray.append(f.f4574d2, 27);
                sparseIntArray.append(f.f4569c2, 28);
                sparseIntArray.append(f.f4527S2, 31);
                sparseIntArray.append(f.f4663v2, 32);
                sparseIntArray.append(f.f4535U2, 33);
                sparseIntArray.append(f.f4531T2, 34);
                sparseIntArray.append(f.f4539V2, 35);
                sparseIntArray.append(f.f4671x2, 36);
                sparseIntArray.append(f.f4667w2, 37);
                sparseIntArray.append(f.f4675y2, 38);
                sparseIntArray.append(f.f4463C2, 39);
                sparseIntArray.append(f.f4499L2, 40);
                sparseIntArray.append(f.f4475F2, 41);
                sparseIntArray.append(f.f4599i2, 42);
                sparseIntArray.append(f.f4579e2, 43);
                sparseIntArray.append(f.f4495K2, 51);
                sparseIntArray.append(f.f4595h3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f4623n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = a.f4285a.get(index);
                switch (i5) {
                    case 1:
                        this.f4235Z = obtainStyledAttributes.getInt(index, this.f4235Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f4266p);
                        this.f4266p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f4266p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f4268q = obtainStyledAttributes.getDimensionPixelSize(index, this.f4268q);
                        break;
                    case 4:
                        float f4 = obtainStyledAttributes.getFloat(index, this.f4270r) % 360.0f;
                        this.f4270r = f4;
                        if (f4 >= 0.0f) {
                            break;
                        } else {
                            this.f4270r = (360.0f - f4) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f4236a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4236a);
                        break;
                    case 6:
                        this.f4238b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4238b);
                        break;
                    case 7:
                        this.f4240c = obtainStyledAttributes.getFloat(index, this.f4240c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f4244e);
                        this.f4244e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f4244e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f4246f);
                        this.f4246f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f4246f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f4248g);
                        this.f4248g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f4248g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f4250h);
                        this.f4250h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f4250h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f4252i);
                        this.f4252i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f4252i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f4254j);
                        this.f4254j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f4254j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f4256k);
                        this.f4256k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f4256k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f4258l);
                        this.f4258l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f4258l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f4260m);
                        this.f4260m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f4260m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f4272s);
                        this.f4272s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f4272s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f4274t);
                        this.f4274t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f4274t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f4276u);
                        this.f4276u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f4276u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f4278v);
                        this.f4278v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f4278v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f4280w = obtainStyledAttributes.getDimensionPixelSize(index, this.f4280w);
                        break;
                    case 22:
                        this.f4282x = obtainStyledAttributes.getDimensionPixelSize(index, this.f4282x);
                        break;
                    case 23:
                        this.f4283y = obtainStyledAttributes.getDimensionPixelSize(index, this.f4283y);
                        break;
                    case 24:
                        this.f4284z = obtainStyledAttributes.getDimensionPixelSize(index, this.f4284z);
                        break;
                    case 25:
                        this.f4210A = obtainStyledAttributes.getDimensionPixelSize(index, this.f4210A);
                        break;
                    case 26:
                        this.f4211B = obtainStyledAttributes.getDimensionPixelSize(index, this.f4211B);
                        break;
                    case 27:
                        this.f4237a0 = obtainStyledAttributes.getBoolean(index, this.f4237a0);
                        break;
                    case 28:
                        this.f4239b0 = obtainStyledAttributes.getBoolean(index, this.f4239b0);
                        break;
                    case 29:
                        this.f4216G = obtainStyledAttributes.getFloat(index, this.f4216G);
                        break;
                    case 30:
                        this.f4217H = obtainStyledAttributes.getFloat(index, this.f4217H);
                        break;
                    case 31:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.f4225P = i6;
                        if (i6 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f4226Q = i7;
                        if (i7 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f4227R = obtainStyledAttributes.getDimensionPixelSize(index, this.f4227R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f4227R) != -2) {
                                break;
                            } else {
                                this.f4227R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f4229T = obtainStyledAttributes.getDimensionPixelSize(index, this.f4229T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f4229T) != -2) {
                                break;
                            } else {
                                this.f4229T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f4231V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f4231V));
                        this.f4225P = 2;
                        break;
                    case 36:
                        try {
                            this.f4228S = obtainStyledAttributes.getDimensionPixelSize(index, this.f4228S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f4228S) != -2) {
                                break;
                            } else {
                                this.f4228S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f4230U = obtainStyledAttributes.getDimensionPixelSize(index, this.f4230U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f4230U) != -2) {
                                break;
                            } else {
                                this.f4230U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f4232W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f4232W));
                        this.f4226Q = 2;
                        break;
                    default:
                        switch (i5) {
                            case 44:
                                c.t(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f4221L = obtainStyledAttributes.getFloat(index, this.f4221L);
                                break;
                            case 46:
                                this.f4222M = obtainStyledAttributes.getFloat(index, this.f4222M);
                                break;
                            case 47:
                                this.f4223N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f4224O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f4233X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4233X);
                                break;
                            case 50:
                                this.f4234Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f4234Y);
                                break;
                            case 51:
                                this.f4241c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f4262n);
                                this.f4262n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f4262n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f4264o);
                                this.f4264o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f4264o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f4213D = obtainStyledAttributes.getDimensionPixelSize(index, this.f4213D);
                                break;
                            case 55:
                                this.f4212C = obtainStyledAttributes.getDimensionPixelSize(index, this.f4212C);
                                break;
                            default:
                                switch (i5) {
                                    case 64:
                                        c.r(this, obtainStyledAttributes, index, 0);
                                        this.f4214E = true;
                                        break;
                                    case 65:
                                        c.r(this, obtainStyledAttributes, index, 1);
                                        this.f4215F = true;
                                        break;
                                    case 66:
                                        this.f4243d0 = obtainStyledAttributes.getInt(index, this.f4243d0);
                                        break;
                                    case 67:
                                        this.f4242d = obtainStyledAttributes.getBoolean(index, this.f4242d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f4251h0 = false;
            this.f4245e0 = true;
            this.f4247f0 = true;
            int i4 = this.width;
            if (i4 == -2 && this.f4237a0) {
                this.f4245e0 = false;
                if (this.f4225P == 0) {
                    this.f4225P = 1;
                }
            }
            int i5 = this.height;
            if (i5 == -2 && this.f4239b0) {
                this.f4247f0 = false;
                if (this.f4226Q == 0) {
                    this.f4226Q = 1;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f4245e0 = false;
                if (i4 == 0 && this.f4225P == 1) {
                    this.width = -2;
                    this.f4237a0 = true;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f4247f0 = false;
                if (i5 == 0 && this.f4226Q == 1) {
                    this.height = -2;
                    this.f4239b0 = true;
                }
            }
            if (this.f4240c != -1.0f || this.f4236a != -1 || this.f4238b != -1) {
                this.f4251h0 = true;
                this.f4245e0 = true;
                this.f4247f0 = true;
                if (!(this.f4279v0 instanceof f)) {
                    this.f4279v0 = new f();
                }
                ((f) this.f4279v0).A1(this.f4235Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f4263n0 = r4
                r10.f4265o0 = r4
                r10.f4259l0 = r4
                r10.f4261m0 = r4
                int r5 = r10.f4280w
                r10.f4267p0 = r5
                int r5 = r10.f4283y
                r10.f4269q0 = r5
                float r5 = r10.f4216G
                r10.f4271r0 = r5
                int r6 = r10.f4236a
                r10.f4273s0 = r6
                int r7 = r10.f4238b
                r10.f4275t0 = r7
                float r8 = r10.f4240c
                r10.f4277u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f4272s
                if (r11 == r4) goto L_0x003f
                r10.f4263n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f4274t
                if (r11 == r4) goto L_0x0046
                r10.f4265o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f4276u
                if (r11 == r4) goto L_0x004d
                r10.f4261m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f4278v
                if (r11 == r4) goto L_0x0054
                r10.f4259l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f4210A
                if (r11 == r9) goto L_0x005a
                r10.f4269q0 = r11
            L_0x005a:
                int r11 = r10.f4211B
                if (r11 == r9) goto L_0x0060
                r10.f4267p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f4271r0 = r2
            L_0x0068:
                boolean r2 = r10.f4251h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f4235Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f4242d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f4277u0 = r11
                r10.f4273s0 = r4
                r10.f4275t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f4275t0 = r6
                r10.f4273s0 = r4
                r10.f4277u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f4273s0 = r7
                r10.f4275t0 = r4
                r10.f4277u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f4272s
                if (r11 == r4) goto L_0x009a
                r10.f4261m0 = r11
            L_0x009a:
                int r11 = r10.f4274t
                if (r11 == r4) goto L_0x00a0
                r10.f4259l0 = r11
            L_0x00a0:
                int r11 = r10.f4276u
                if (r11 == r4) goto L_0x00a6
                r10.f4263n0 = r11
            L_0x00a6:
                int r11 = r10.f4278v
                if (r11 == r4) goto L_0x00ac
                r10.f4265o0 = r11
            L_0x00ac:
                int r11 = r10.f4210A
                if (r11 == r9) goto L_0x00b2
                r10.f4267p0 = r11
            L_0x00b2:
                int r11 = r10.f4211B
                if (r11 == r9) goto L_0x00b8
                r10.f4269q0 = r11
            L_0x00b8:
                int r11 = r10.f4276u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f4278v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f4274t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f4272s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f4248g
                if (r11 == r4) goto L_0x00d7
                r10.f4263n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f4250h
                if (r11 == r4) goto L_0x00e5
                r10.f4265o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f4244e
                if (r11 == r4) goto L_0x00f4
                r10.f4259l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f4246f
                if (r11 == r4) goto L_0x0102
                r10.f4261m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i4, int i5) {
            super(i4, i5);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
