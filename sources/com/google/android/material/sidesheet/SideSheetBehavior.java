package com.google.android.material.sidesheet;

import N.c;
import Q1.g;
import Q1.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0434o;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.D;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import z1.h;
import z1.i;
import z1.j;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: A  reason: collision with root package name */
    private static final int f12173A = i.Widget_Material3_SideSheet;

    /* renamed from: z  reason: collision with root package name */
    private static final int f12174z = h.side_sheet_accessibility_pane_title;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f12175a;

    /* renamed from: b  reason: collision with root package name */
    private float f12176b;

    /* renamed from: c  reason: collision with root package name */
    private g f12177c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f12178d;

    /* renamed from: e  reason: collision with root package name */
    private k f12179e;

    /* renamed from: f  reason: collision with root package name */
    private final c f12180f = new c();

    /* renamed from: g  reason: collision with root package name */
    private float f12181g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f12182h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f12183i = 5;

    /* renamed from: j  reason: collision with root package name */
    private int f12184j = 5;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public N.c f12185k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12186l;

    /* renamed from: m  reason: collision with root package name */
    private float f12187m = 0.1f;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f12188n;

    /* renamed from: o  reason: collision with root package name */
    private int f12189o;

    /* renamed from: p  reason: collision with root package name */
    private int f12190p;

    /* renamed from: q  reason: collision with root package name */
    private int f12191q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public WeakReference f12192r;

    /* renamed from: s  reason: collision with root package name */
    private WeakReference f12193s;

    /* renamed from: t  reason: collision with root package name */
    private int f12194t = -1;

    /* renamed from: u  reason: collision with root package name */
    private VelocityTracker f12195u;

    /* renamed from: v  reason: collision with root package name */
    private L1.c f12196v;

    /* renamed from: w  reason: collision with root package name */
    private int f12197w;

    /* renamed from: x  reason: collision with root package name */
    private final Set f12198x = new LinkedHashSet();

    /* renamed from: y  reason: collision with root package name */
    private final c.C0015c f12199y = new a();

    class a extends c.C0015c {
        a() {
        }

        public int a(View view, int i4, int i5) {
            return I.a.b(i4, SideSheetBehavior.this.f12175a.f(), SideSheetBehavior.this.f12175a.e());
        }

        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        public int d(View view) {
            return SideSheetBehavior.this.f12188n + SideSheetBehavior.this.d0();
        }

        public void j(int i4) {
            if (i4 == 1 && SideSheetBehavior.this.f12182h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        public void k(View view, int i4, int i5, int i6, int i7) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View Z3 = SideSheetBehavior.this.Z();
            if (!(Z3 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) Z3.getLayoutParams()) == null)) {
                SideSheetBehavior.this.f12175a.n(marginLayoutParams, view.getLeft(), view.getRight());
                Z3.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i4);
        }

        public void l(View view, float f4, float f5) {
            int L3 = SideSheetBehavior.this.R(view, f4, f5);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, L3, sideSheetBehavior.F0());
        }

        public boolean m(View view, int i4) {
            if (SideSheetBehavior.this.f12183i == 1 || SideSheetBehavior.this.f12192r == null || SideSheetBehavior.this.f12192r.get() != view) {
                return false;
            }
            return true;
        }
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        private int f12202a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12203b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f12204c = new e(this);

        c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f12203b = false;
            if (SideSheetBehavior.this.f12185k != null && SideSheetBehavior.this.f12185k.k(true)) {
                b(this.f12202a);
            } else if (SideSheetBehavior.this.f12183i == 2) {
                SideSheetBehavior.this.B0(this.f12202a);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i4) {
            if (SideSheetBehavior.this.f12192r != null && SideSheetBehavior.this.f12192r.get() != null) {
                this.f12202a = i4;
                if (!this.f12203b) {
                    P.g0((View) SideSheetBehavior.this.f12192r.get(), this.f12204c);
                    this.f12203b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    private boolean C0() {
        if (this.f12185k == null || (!this.f12182h && this.f12183i != 1)) {
            return false;
        }
        return true;
    }

    private boolean E0(View view) {
        if ((view.isShown() || P.p(view) != null) && this.f12182h) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void G0(View view, int i4, boolean z3) {
        if (p0(view, i4, z3)) {
            B0(2);
            this.f12180f.b(i4);
            return;
        }
        B0(i4);
    }

    private void H0() {
        View view;
        WeakReference weakReference = this.f12192r;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            P.i0(view, 262144);
            P.i0(view, 1048576);
            if (this.f12183i != 5) {
                t0(view, A.a.f5262y, 5);
            }
            if (this.f12183i != 3) {
                t0(view, A.a.f5260w, 3);
            }
        }
    }

    private void I0(k kVar) {
        g gVar = this.f12177c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void J0(View view) {
        int i4;
        if (this.f12183i == 5) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
    }

    private int P(int i4, View view) {
        int i5 = this.f12183i;
        if (i5 == 1 || i5 == 2) {
            return i4 - this.f12175a.g(view);
        }
        if (i5 == 3) {
            return 0;
        }
        if (i5 == 5) {
            return this.f12175a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f12183i);
    }

    private float Q(float f4, float f5) {
        return Math.abs(f4 - f5);
    }

    /* access modifiers changed from: private */
    public int R(View view, float f4, float f5) {
        if (n0(f4)) {
            return 3;
        }
        if (D0(view, f4)) {
            if (!this.f12175a.l(f4, f5) && !this.f12175a.k(view)) {
                return 3;
            }
        } else if (f4 == 0.0f || !d.a(f4, f5)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.f12175a.d())) {
                return 3;
            }
        }
        return 5;
    }

    private void S() {
        WeakReference weakReference = this.f12193s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12193s = null;
    }

    private D T(int i4) {
        return new R1.a(this, i4);
    }

    private void U(Context context) {
        if (this.f12179e != null) {
            g gVar = new g(this.f12179e);
            this.f12177c = gVar;
            gVar.J(context);
            ColorStateList colorStateList = this.f12178d;
            if (colorStateList != null) {
                this.f12177c.T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f12177c.setTint(typedValue.data);
        }
    }

    /* access modifiers changed from: private */
    public void V(View view, int i4) {
        if (!this.f12198x.isEmpty()) {
            this.f12175a.b(i4);
            Iterator it = this.f12198x.iterator();
            if (it.hasNext()) {
                F.a(it.next());
                throw null;
            }
        }
    }

    private void W(View view) {
        if (P.p(view) == null) {
            P.r0(view, view.getResources().getString(f12174z));
        }
    }

    private int X(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    private CoordinatorLayout.e j0() {
        View view;
        WeakReference weakReference = this.f12192r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.e j02 = j0();
        if (j02 == null || j02.leftMargin <= 0) {
            return false;
        }
        return true;
    }

    private boolean l0() {
        CoordinatorLayout.e j02 = j0();
        if (j02 == null || j02.rightMargin <= 0) {
            return false;
        }
        return true;
    }

    private boolean m0(MotionEvent motionEvent) {
        if (C0() && Q((float) this.f12197w, motionEvent.getX()) > ((float) this.f12185k.u())) {
            return true;
        }
        return false;
    }

    private boolean n0(float f4) {
        return this.f12175a.j(f4);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !P.R(view)) {
            return false;
        }
        return true;
    }

    private boolean p0(View view, int i4, boolean z3) {
        int e02 = e0(i4);
        N.c i02 = i0();
        if (i02 == null || (!z3 ? !i02.H(view, e02, view.getTop()) : !i02.F(e02, view.getTop()))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean q0(int i4, View view, D.a aVar) {
        A0(i4);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r0(int i4) {
        View view = (View) this.f12192r.get();
        if (view != null) {
            G0(view, i4, false);
        }
    }

    private void s0(CoordinatorLayout coordinatorLayout) {
        int i4;
        View findViewById;
        if (this.f12193s == null && (i4 = this.f12194t) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f12193s = new WeakReference(findViewById);
        }
    }

    private void t0(View view, A.a aVar, int i4) {
        P.k0(view, aVar, (CharSequence) null, T(i4));
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f12195u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12195u = null;
        }
    }

    private void v0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i4) {
        c cVar = this.f12175a;
        if (cVar != null && cVar.i() == i4) {
            return;
        }
        if (i4 == 0) {
            this.f12175a = new b(this);
            if (this.f12179e != null && !l0()) {
                k.b v3 = this.f12179e.v();
                v3.E(0.0f).w(0.0f);
                I0(v3.m());
            }
        } else if (i4 == 1) {
            this.f12175a = new a(this);
            if (this.f12179e != null && !k0()) {
                k.b v4 = this.f12179e.v();
                v4.A(0.0f).s(0.0f);
                I0(v4.m());
            }
        } else {
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i4 + ". Must be " + 0 + " or " + 1 + ".");
        }
    }

    private void z0(View view, int i4) {
        int i5;
        if (C0434o.b(((CoordinatorLayout.e) view.getLayoutParams()).f4712c, i4) == 3) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        y0(i5);
    }

    public void A0(int i4) {
        String str;
        if (i4 == 1 || i4 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            if (i4 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            sb.append(str);
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f12192r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i4);
        } else {
            v0((View) this.f12192r.get(), new R1.b(this, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void B0(int i4) {
        View view;
        if (this.f12183i != i4) {
            this.f12183i = i4;
            if (i4 == 3 || i4 == 5) {
                this.f12184j = i4;
            }
            WeakReference weakReference = this.f12192r;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                J0(view);
                Iterator it = this.f12198x.iterator();
                if (!it.hasNext()) {
                    H0();
                } else {
                    F.a(it.next());
                    throw null;
                }
            }
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12183i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f12185k.z(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f12195u == null) {
            this.f12195u = VelocityTracker.obtain();
        }
        this.f12195u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f12186l && m0(motionEvent)) {
            this.f12185k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f12186l;
    }

    /* access modifiers changed from: package-private */
    public boolean D0(View view, float f4) {
        return this.f12175a.m(view, f4);
    }

    public boolean F0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int Y() {
        return this.f12188n;
    }

    public View Z() {
        WeakReference weakReference = this.f12193s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f12175a.c();
    }

    public float b0() {
        return this.f12187m;
    }

    /* access modifiers changed from: package-private */
    public float c0() {
        return 0.5f;
    }

    /* access modifiers changed from: package-private */
    public int d0() {
        return this.f12191q;
    }

    /* access modifiers changed from: package-private */
    public int e0(int i4) {
        if (i4 == 3) {
            return a0();
        }
        if (i4 == 5) {
            return this.f12175a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i4);
    }

    /* access modifiers changed from: package-private */
    public int f0() {
        return this.f12190p;
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f12192r = null;
        this.f12185k = null;
        this.f12196v = null;
    }

    /* access modifiers changed from: package-private */
    public int g0() {
        return this.f12189o;
    }

    /* access modifiers changed from: package-private */
    public int h0() {
        return 500;
    }

    /* access modifiers changed from: package-private */
    public N.c i0() {
        return this.f12185k;
    }

    public void j() {
        super.j();
        this.f12192r = null;
        this.f12185k = null;
        this.f12196v = null;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        N.c cVar;
        if (!E0(view)) {
            this.f12186l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.f12195u == null) {
            this.f12195u = VelocityTracker.obtain();
        }
        this.f12195u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f12197w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f12186l) {
            this.f12186l = false;
            return false;
        }
        if (this.f12186l || (cVar = this.f12185k) == null || !cVar.G(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        int i5;
        if (P.y(coordinatorLayout) && !P.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f12192r == null) {
            this.f12192r = new WeakReference(view);
            this.f12196v = new L1.c(view);
            g gVar = this.f12177c;
            if (gVar != null) {
                P.s0(view, gVar);
                g gVar2 = this.f12177c;
                float f4 = this.f12181g;
                if (f4 == -1.0f) {
                    f4 = P.w(view);
                }
                gVar2.S(f4);
            } else {
                ColorStateList colorStateList = this.f12178d;
                if (colorStateList != null) {
                    P.t0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (P.z(view) == 0) {
                P.y0(view, 1);
            }
            W(view);
        }
        z0(view, i4);
        if (this.f12185k == null) {
            this.f12185k = N.c.m(coordinatorLayout, this.f12199y);
        }
        int g4 = this.f12175a.g(view);
        coordinatorLayout.I(view, i4);
        this.f12189o = coordinatorLayout.getWidth();
        this.f12190p = this.f12175a.h(coordinatorLayout);
        this.f12188n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i5 = this.f12175a.a(marginLayoutParams);
        } else {
            i5 = 0;
        }
        this.f12191q = i5;
        P.Y(view, P(g4, view));
        s0(coordinatorLayout);
        for (Object a4 : this.f12198x) {
            F.a(a4);
        }
        return true;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i4, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, -1, marginLayoutParams.width), X(i6, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i4) {
        this.f12194t = i4;
        S();
        WeakReference weakReference = this.f12192r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i4 != -1 && P.S(view)) {
                view.requestLayout();
            }
        }
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.t() != null) {
            super.x(coordinatorLayout, view, bVar.t());
        }
        int i4 = bVar.f12201c;
        if (i4 == 1 || i4 == 2) {
            i4 = 5;
        }
        this.f12183i = i4;
        this.f12184j = i4;
    }

    public void x0(boolean z3) {
        this.f12182h = z3;
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    protected static class b extends M.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f12201c;

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

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12201c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f12201c);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f12201c = sideSheetBehavior.f12183i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.r4);
        int i4 = j.t4;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f12178d = N1.c.a(context, obtainStyledAttributes, i4);
        }
        if (obtainStyledAttributes.hasValue(j.w4)) {
            this.f12179e = k.e(context, attributeSet, 0, f12173A).m();
        }
        int i5 = j.v4;
        if (obtainStyledAttributes.hasValue(i5)) {
            w0(obtainStyledAttributes.getResourceId(i5, -1));
        }
        U(context);
        this.f12181g = obtainStyledAttributes.getDimension(j.s4, -1.0f);
        x0(obtainStyledAttributes.getBoolean(j.u4, true));
        obtainStyledAttributes.recycle();
        this.f12176b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
