package com.google.android.material.bottomsheet;

import N.c;
import Q1.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0435o0;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.accessibility.D;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import z1.C0970a;
import z1.C0972c;
import z1.h;
import z1.i;
import z1.j;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: i0  reason: collision with root package name */
    private static final int f11606i0 = i.Widget_Design_BottomSheet_Modal;

    /* renamed from: A  reason: collision with root package name */
    private boolean f11607A;

    /* renamed from: B  reason: collision with root package name */
    private final g f11608B = new g(this, (a) null);

    /* renamed from: C  reason: collision with root package name */
    private ValueAnimator f11609C;

    /* renamed from: D  reason: collision with root package name */
    int f11610D;

    /* renamed from: E  reason: collision with root package name */
    int f11611E;

    /* renamed from: F  reason: collision with root package name */
    int f11612F;

    /* renamed from: G  reason: collision with root package name */
    float f11613G = 0.5f;

    /* renamed from: H  reason: collision with root package name */
    int f11614H;

    /* renamed from: I  reason: collision with root package name */
    float f11615I = -1.0f;

    /* renamed from: J  reason: collision with root package name */
    boolean f11616J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public boolean f11617K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public boolean f11618L = true;

    /* renamed from: M  reason: collision with root package name */
    int f11619M = 4;

    /* renamed from: N  reason: collision with root package name */
    int f11620N = 4;

    /* renamed from: O  reason: collision with root package name */
    N.c f11621O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f11622P;

    /* renamed from: Q  reason: collision with root package name */
    private int f11623Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f11624R;

    /* renamed from: S  reason: collision with root package name */
    private float f11625S = 0.1f;

    /* renamed from: T  reason: collision with root package name */
    private int f11626T;

    /* renamed from: U  reason: collision with root package name */
    int f11627U;

    /* renamed from: V  reason: collision with root package name */
    int f11628V;

    /* renamed from: W  reason: collision with root package name */
    WeakReference f11629W;

    /* renamed from: X  reason: collision with root package name */
    WeakReference f11630X;

    /* renamed from: Y  reason: collision with root package name */
    WeakReference f11631Y;

    /* renamed from: Z  reason: collision with root package name */
    private final ArrayList f11632Z = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private int f11633a = 0;

    /* renamed from: a0  reason: collision with root package name */
    private VelocityTracker f11634a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f11635b = true;

    /* renamed from: b0  reason: collision with root package name */
    L1.b f11636b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11637c = false;

    /* renamed from: c0  reason: collision with root package name */
    int f11638c0;

    /* renamed from: d  reason: collision with root package name */
    private float f11639d;

    /* renamed from: d0  reason: collision with root package name */
    private int f11640d0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f11641e;

    /* renamed from: e0  reason: collision with root package name */
    boolean f11642e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f11643f;

    /* renamed from: f0  reason: collision with root package name */
    private Map f11644f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11645g;

    /* renamed from: g0  reason: collision with root package name */
    final SparseIntArray f11646g0 = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private int f11647h;

    /* renamed from: h0  reason: collision with root package name */
    private final c.C0015c f11648h0 = new d();

    /* renamed from: i  reason: collision with root package name */
    private int f11649i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Q1.g f11650j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f11651k;

    /* renamed from: l  reason: collision with root package name */
    private int f11652l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f11653m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f11654n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11655o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f11656p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f11657q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f11658r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11659s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f11660t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f11661u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f11662v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f11663w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f11664x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11665y;

    /* renamed from: z  reason: collision with root package name */
    private k f11666z;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f11667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11668b;

        a(View view, int i4) {
            this.f11667a = view;
            this.f11668b = i4;
        }

        public void run() {
            BottomSheetBehavior.this.V0(this.f11667a, this.f11668b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f11650j != null) {
                BottomSheetBehavior.this.f11650j.U(floatValue);
            }
        }
    }

    class c implements m.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f11671a;

        c(boolean z3) {
            this.f11671a = z3;
        }

        public C0435o0 a(View view, C0435o0 o0Var, m.d dVar) {
            boolean z3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            androidx.core.graphics.f f4 = o0Var.f(C0435o0.m.f());
            androidx.core.graphics.f f5 = o0Var.f(C0435o0.m.d());
            int unused = BottomSheetBehavior.this.f11664x = f4.f4971b;
            boolean g4 = m.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f11656p) {
                int unused2 = BottomSheetBehavior.this.f11663w = o0Var.h();
                paddingBottom = dVar.f12171d + BottomSheetBehavior.this.f11663w;
            }
            if (BottomSheetBehavior.this.f11657q) {
                if (g4) {
                    i8 = dVar.f12170c;
                } else {
                    i8 = dVar.f12168a;
                }
                paddingLeft = i8 + f4.f4970a;
            }
            if (BottomSheetBehavior.this.f11658r) {
                if (g4) {
                    i7 = dVar.f12168a;
                } else {
                    i7 = dVar.f12170c;
                }
                paddingRight = i7 + f4.f4972c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z4 = true;
            if (!BottomSheetBehavior.this.f11660t || marginLayoutParams.leftMargin == (i6 = f4.f4970a)) {
                z3 = false;
            } else {
                marginLayoutParams.leftMargin = i6;
                z3 = true;
            }
            if (BottomSheetBehavior.this.f11661u && marginLayoutParams.rightMargin != (i5 = f4.f4972c)) {
                marginLayoutParams.rightMargin = i5;
                z3 = true;
            }
            if (!BottomSheetBehavior.this.f11662v || marginLayoutParams.topMargin == (i4 = f4.f4971b)) {
                z4 = z3;
            } else {
                marginLayoutParams.topMargin = i4;
            }
            if (z4) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f11671a) {
                int unused3 = BottomSheetBehavior.this.f11654n = f5.f4973d;
            }
            if (BottomSheetBehavior.this.f11656p || this.f11671a) {
                BottomSheetBehavior.this.a1(false);
            }
            return o0Var;
        }
    }

    class d extends c.C0015c {

        /* renamed from: a  reason: collision with root package name */
        private long f11673a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f11628V + bottomSheetBehavior.m0()) / 2) {
                return true;
            }
            return false;
        }

        public int a(View view, int i4, int i5) {
            return view.getLeft();
        }

        public int b(View view, int i4, int i5) {
            return I.a.b(i4, BottomSheetBehavior.this.m0(), e(view));
        }

        public int e(View view) {
            if (BottomSheetBehavior.this.e0()) {
                return BottomSheetBehavior.this.f11628V;
            }
            return BottomSheetBehavior.this.f11614H;
        }

        public void j(int i4) {
            if (i4 == 1 && BottomSheetBehavior.this.f11618L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        public void k(View view, int i4, int i5, int i6, int i7) {
            BottomSheetBehavior.this.j0(i5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
            if (r9 > r7.f11674b.f11612F) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f11674b.m0()) < java.lang.Math.abs(r8.getTop() - r7.f11674b.f11612F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
            if (r7.f11674b.T0() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.f11674b.f11611E) < java.lang.Math.abs(r9 - r7.f11674b.f11614H)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
            if (r7.f11674b.T0() != false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
            if (r7.f11674b.T0() == false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
            if (r10.Q0(r0, (((float) r9) * 100.0f) / ((float) r10.f11628V)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                r4 = 4
                if (r1 >= 0) goto L_0x003f
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f11635b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r2 = r3
                goto L_0x012a
            L_0x0013:
                int r9 = r8.getTop()
                long r0 = java.lang.System.currentTimeMillis()
                long r5 = r7.f11673a
                long r0 = r0 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.T0()
                if (r10 == 0) goto L_0x0037
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r10.f11628V
                float r2 = (float) r2
                float r9 = r9 / r2
                boolean r9 = r10.Q0(r0, r9)
                if (r9 == 0) goto L_0x00ad
                goto L_0x0010
            L_0x0037:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f11612F
                if (r9 <= r10) goto L_0x0010
                goto L_0x012a
            L_0x003f:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r1.f11616J
                if (r5 == 0) goto L_0x0094
                boolean r1 = r1.S0(r8, r10)
                if (r1 == 0) goto L_0x0094
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0062
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f11641e
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0068
            L_0x0062:
                boolean r9 = r7.n(r8)
                if (r9 == 0) goto L_0x006b
            L_0x0068:
                r2 = 5
                goto L_0x012a
            L_0x006b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f11635b
                if (r9 == 0) goto L_0x0074
                goto L_0x0010
            L_0x0074:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.m0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11612F
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x012a
                goto L_0x0010
            L_0x0094:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00d2
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a5
                goto L_0x00d2
            L_0x00a5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f11635b
                if (r9 == 0) goto L_0x00b0
            L_0x00ad:
                r2 = r4
                goto L_0x012a
            L_0x00b0:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f11612F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11614H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x00d2:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f11635b
                if (r10 == 0) goto L_0x00f5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f11611E
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11614H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                goto L_0x0010
            L_0x00f5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.f11612F
                if (r9 >= r0) goto L_0x0110
                int r10 = r10.f11614H
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0107
                goto L_0x0010
            L_0x0107:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x0110:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f11614H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ad
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012a
                goto L_0x00ad
            L_0x012a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.U0()
                r9.V0(r8, r2, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i4) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i5 = bottomSheetBehavior.f11619M;
            if (i5 == 1 || bottomSheetBehavior.f11642e0) {
                return false;
            }
            if (i5 == 3 && bottomSheetBehavior.f11638c0 == i4) {
                WeakReference weakReference = bottomSheetBehavior.f11631Y;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f11673a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f11629W;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    class e implements D {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11675a;

        e(int i4) {
            this.f11675a = i4;
        }

        public boolean a(View view, D.a aVar) {
            BottomSheetBehavior.this.N0(this.f11675a);
            return true;
        }
    }

    public BottomSheetBehavior() {
    }

    private void P0(View view) {
        boolean z3;
        if (Build.VERSION.SDK_INT < 29 || r0() || this.f11645g) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f11656p || this.f11657q || this.f11658r || this.f11660t || this.f11661u || this.f11662v || z3) {
            m.b(view, new c(z3));
        }
    }

    private boolean R0() {
        if (this.f11621O == null || (!this.f11618L && this.f11619M != 1)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void V0(View view, int i4, boolean z3) {
        int n02 = n0(i4);
        N.c cVar = this.f11621O;
        if (cVar == null || (!z3 ? !cVar.H(view, view.getLeft(), n02) : !cVar.F(view.getLeft(), n02))) {
            O0(i4);
            return;
        }
        O0(2);
        Y0(i4, true);
        this.f11608B.c(i4);
    }

    private void W0() {
        WeakReference weakReference = this.f11629W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f11630X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    private int X(View view, int i4, int i5) {
        return P.c(view, view.getResources().getString(i4), g0(i5));
    }

    private void X0(View view, int i4) {
        if (view != null) {
            f0(view, i4);
            int i5 = 6;
            if (!this.f11635b && this.f11619M != 6) {
                this.f11646g0.put(i4, X(view, h.bottomsheet_action_expand_halfway, 6));
            }
            if (this.f11616J && t0() && this.f11619M != 5) {
                w0(view, A.a.f5262y, 5);
            }
            int i6 = this.f11619M;
            if (i6 == 3) {
                if (this.f11635b) {
                    i5 = 4;
                }
                w0(view, A.a.f5261x, i5);
            } else if (i6 == 4) {
                if (this.f11635b) {
                    i5 = 3;
                }
                w0(view, A.a.f5260w, i5);
            } else if (i6 == 6) {
                w0(view, A.a.f5261x, 4);
                w0(view, A.a.f5260w, 3);
            }
        }
    }

    private void Y() {
        int c02 = c0();
        if (this.f11635b) {
            this.f11614H = Math.max(this.f11628V - c02, this.f11611E);
        } else {
            this.f11614H = this.f11628V - c02;
        }
    }

    private void Y0(int i4, boolean z3) {
        boolean q02;
        ValueAnimator valueAnimator;
        if (i4 != 2 && this.f11607A != (q02 = q0()) && this.f11650j != null) {
            this.f11607A = q02;
            float f4 = 1.0f;
            if (!z3 || (valueAnimator = this.f11609C) == null) {
                ValueAnimator valueAnimator2 = this.f11609C;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f11609C.cancel();
                }
                Q1.g gVar = this.f11650j;
                if (this.f11607A) {
                    f4 = b0();
                }
                gVar.U(f4);
            } else if (valueAnimator.isRunning()) {
                this.f11609C.reverse();
            } else {
                float w3 = this.f11650j.w();
                if (q02) {
                    f4 = b0();
                }
                this.f11609C.setFloatValues(new float[]{w3, f4});
                this.f11609C.start();
            }
        }
    }

    private float Z(float f4, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float a4 = (float) roundedCorner.getRadius();
            if (a4 > 0.0f && f4 > 0.0f) {
                return a4 / f4;
            }
        }
        return 0.0f;
    }

    private void Z0(boolean z3) {
        Map map;
        WeakReference weakReference = this.f11629W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z3) {
                    if (this.f11644f0 == null) {
                        this.f11644f0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    if (childAt != this.f11629W.get()) {
                        if (z3) {
                            this.f11644f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f11637c) {
                                P.y0(childAt, 4);
                            }
                        } else if (this.f11637c && (map = this.f11644f0) != null && map.containsKey(childAt)) {
                            P.y0(childAt, ((Integer) this.f11644f0.get(childAt)).intValue());
                        }
                    }
                }
                if (!z3) {
                    this.f11644f0 = null;
                } else if (this.f11637c) {
                    ((View) this.f11629W.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    private void a0() {
        this.f11612F = (int) (((float) this.f11628V) * (1.0f - this.f11613G));
    }

    /* access modifiers changed from: private */
    public void a1(boolean z3) {
        View view;
        if (this.f11629W != null) {
            Y();
            if (this.f11619M == 4 && (view = (View) this.f11629W.get()) != null) {
                if (z3) {
                    N0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    private float b0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f11650j == null || (weakReference = this.f11629W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f11629W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Z(this.f11650j.C(), rootWindowInsets.getRoundedCorner(0)), Z(this.f11650j.D(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int c0() {
        int i4;
        if (this.f11645g) {
            return Math.min(Math.max(this.f11647h, this.f11628V - ((this.f11627U * 9) / 16)), this.f11626T) + this.f11663w;
        }
        if (this.f11655o || this.f11656p || (i4 = this.f11654n) <= 0) {
            return this.f11643f + this.f11663w;
        }
        return Math.max(this.f11643f, i4 + this.f11649i);
    }

    private float d0(int i4) {
        float f4;
        float f5;
        int i5 = this.f11614H;
        if (i4 > i5 || i5 == m0()) {
            int i6 = this.f11614H;
            f4 = (float) (i6 - i4);
            f5 = (float) (this.f11628V - i6);
        } else {
            int i7 = this.f11614H;
            f4 = (float) (i7 - i4);
            f5 = (float) (i7 - m0());
        }
        return f4 / f5;
    }

    /* access modifiers changed from: private */
    public boolean e0() {
        if (!s0() || !t0()) {
            return false;
        }
        return true;
    }

    private void f0(View view, int i4) {
        if (view != null) {
            P.i0(view, 524288);
            P.i0(view, 262144);
            P.i0(view, 1048576);
            int i5 = this.f11646g0.get(i4, -1);
            if (i5 != -1) {
                P.i0(view, i5);
                this.f11646g0.delete(i4);
            }
        }
    }

    private D g0(int i4) {
        return new e(i4);
    }

    private void h0(Context context) {
        if (this.f11666z != null) {
            Q1.g gVar = new Q1.g(this.f11666z);
            this.f11650j = gVar;
            gVar.J(context);
            ColorStateList colorStateList = this.f11651k;
            if (colorStateList != null) {
                this.f11650j.T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f11650j.setTint(typedValue.data);
        }
    }

    private void i0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{b0(), 1.0f});
        this.f11609C = ofFloat;
        ofFloat.setDuration(500);
        this.f11609C.addUpdateListener(new b());
    }

    private int l0(int i4, int i5, int i6, int i7) {
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

    private int n0(int i4) {
        if (i4 == 3) {
            return m0();
        }
        if (i4 == 4) {
            return this.f11614H;
        }
        if (i4 == 5) {
            return this.f11628V;
        }
        if (i4 == 6) {
            return this.f11612F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i4);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f11634a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f11639d);
        return this.f11634a0.getYVelocity(this.f11638c0);
    }

    private boolean p0() {
        WeakReference weakReference = this.f11629W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f11629W.get()).getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return true;
        }
        return false;
    }

    private boolean q0() {
        if (this.f11619M != 3 || (!this.f11665y && !p0())) {
            return false;
        }
        return true;
    }

    private boolean u0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !P.R(view)) {
            return false;
        }
        return true;
    }

    private void w0(View view, A.a aVar, int i4) {
        P.k0(view, aVar, (CharSequence) null, g0(i4));
    }

    private void x0() {
        this.f11638c0 = -1;
        this.f11640d0 = -1;
        VelocityTracker velocityTracker = this.f11634a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11634a0 = null;
        }
    }

    private void y0(f fVar) {
        int i4 = this.f11633a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.f11643f = fVar.f11678d;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f11635b = fVar.f11679e;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.f11616J = fVar.f11680f;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f11617K = fVar.f11681g;
            }
        }
    }

    private void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
        this.f11623Q = 0;
        this.f11624R = false;
        if ((i4 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void A0(boolean z3) {
        this.f11618L = z3;
    }

    public void B0(int i4) {
        if (i4 >= 0) {
            this.f11610D = i4;
            Y0(this.f11619M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.f11612F) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f11611E) < java.lang.Math.abs(r3 - r2.f11614H)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (T0() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f11614H)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f11612F) < java.lang.Math.abs(r3 - r2.f11614H)) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.O0(r0)
            return
        L_0x000f:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference r3 = r2.f11631Y
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.f11624R
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.f11623Q
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f11635b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.f11612F
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.f11616J
            if (r3 == 0) goto L_0x0049
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.f11623Q
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f11635b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.f11611E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f11614H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.f11612F
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.f11614H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.T0()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f11614H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f11635b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = r6
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.f11612F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f11614H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = r5
        L_0x00aa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.f11624R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z3) {
        int i4;
        if (this.f11635b != z3) {
            this.f11635b = z3;
            if (this.f11629W != null) {
                Y();
            }
            if (!this.f11635b || this.f11619M != 6) {
                i4 = this.f11619M;
            } else {
                i4 = 3;
            }
            O0(i4);
            Y0(this.f11619M, true);
            W0();
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11619M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.f11621O.z(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f11634a0 == null) {
            this.f11634a0 = VelocityTracker.obtain();
        }
        this.f11634a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.f11622P && Math.abs(((float) this.f11640d0) - motionEvent.getY()) > ((float) this.f11621O.u())) {
            this.f11621O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f11622P;
    }

    public void D0(boolean z3) {
        this.f11655o = z3;
    }

    public void E0(float f4) {
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f11613G = f4;
        if (this.f11629W != null) {
            a0();
        }
    }

    public void F0(boolean z3) {
        if (this.f11616J != z3) {
            this.f11616J = z3;
            if (!z3 && this.f11619M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i4) {
        this.f11653m = i4;
    }

    public void H0(int i4) {
        this.f11652l = i4;
    }

    public void I0(int i4) {
        J0(i4, false);
    }

    public final void J0(int i4, boolean z3) {
        if (i4 == -1) {
            if (!this.f11645g) {
                this.f11645g = true;
            } else {
                return;
            }
        } else if (this.f11645g || this.f11643f != i4) {
            this.f11645g = false;
            this.f11643f = Math.max(0, i4);
        } else {
            return;
        }
        a1(z3);
    }

    public void K0(int i4) {
        this.f11633a = i4;
    }

    public void L0(int i4) {
        this.f11641e = i4;
    }

    public void M0(boolean z3) {
        this.f11617K = z3;
    }

    public void N0(int i4) {
        String str;
        int i5;
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
        } else if (this.f11616J || i4 != 5) {
            if (i4 != 6 || !this.f11635b || n0(i4) > this.f11611E) {
                i5 = i4;
            } else {
                i5 = 3;
            }
            WeakReference weakReference = this.f11629W;
            if (weakReference == null || weakReference.get() == null) {
                O0(i4);
                return;
            }
            View view = (View) this.f11629W.get();
            z0(view, new a(view, i5));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(int i4) {
        if (this.f11619M != i4) {
            this.f11619M = i4;
            if (i4 == 4 || i4 == 3 || i4 == 6 || (this.f11616J && i4 == 5)) {
                this.f11620N = i4;
            }
            WeakReference weakReference = this.f11629W;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i4 == 3) {
                    Z0(true);
                } else if (i4 == 6 || i4 == 5 || i4 == 4) {
                    Z0(false);
                }
                Y0(i4, true);
                if (this.f11632Z.size() <= 0) {
                    W0();
                } else {
                    F.a(this.f11632Z.get(0));
                    throw null;
                }
            }
        }
    }

    public boolean Q0(long j4, float f4) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean S0(View view, float f4) {
        if (this.f11617K) {
            return true;
        }
        if (!t0() || view.getTop() < this.f11614H) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f4 * this.f11625S)) - ((float) this.f11614H)) / ((float) c0()) > 0.5f) {
            return true;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f11629W = null;
        this.f11621O = null;
        this.f11636b0 = null;
    }

    public void j() {
        super.j();
        this.f11629W = null;
        this.f11621O = null;
        this.f11636b0 = null;
    }

    /* access modifiers changed from: package-private */
    public void j0(int i4) {
        if (((View) this.f11629W.get()) != null && !this.f11632Z.isEmpty()) {
            d0(i4);
            if (this.f11632Z.size() > 0) {
                F.a(this.f11632Z.get(0));
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r9.f11618L
            if (r0 != 0) goto L_0x000e
            goto L_0x00d4
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.x0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f11634a0
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f11634a0 = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f11634a0
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f11642e0 = r1
            r9.f11638c0 = r5
            boolean r11 = r9.f11622P
            if (r11 == 0) goto L_0x007f
            r9.f11622P = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f11640d0 = r7
            int r7 = r9.f11619M
            if (r7 == r4) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.f11631Y
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f11640d0
            boolean r7 = r10.A(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f11638c0 = r7
            r9.f11642e0 = r2
        L_0x006e:
            int r7 = r9.f11638c0
            if (r7 != r5) goto L_0x007c
            int r7 = r9.f11640d0
            boolean r11 = r10.A(r11, r6, r7)
            if (r11 != 0) goto L_0x007c
            r11 = r2
            goto L_0x007d
        L_0x007c:
            r11 = r1
        L_0x007d:
            r9.f11622P = r11
        L_0x007f:
            boolean r11 = r9.f11622P
            if (r11 != 0) goto L_0x008e
            N.c r11 = r9.f11621O
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.G(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.f11631Y
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r4) goto L_0x00d3
            if (r3 == 0) goto L_0x00d3
            boolean r11 = r9.f11622P
            if (r11 != 0) goto L_0x00d3
            int r11 = r9.f11619M
            if (r11 == r2) goto L_0x00d3
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.A(r3, r11, r0)
            if (r10 != 0) goto L_0x00d3
            N.c r10 = r9.f11621O
            if (r10 == 0) goto L_0x00d3
            int r10 = r9.f11640d0
            if (r10 == r5) goto L_0x00d3
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            N.c r11 = r9.f11621O
            int r11 = r11.u()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d3
            r1 = r2
        L_0x00d3:
            return r1
        L_0x00d4:
            r9.f11622P = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (P.T(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View k02 = k0(viewGroup.getChildAt(i4));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        if (P.y(coordinatorLayout) && !P.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f11629W == null) {
            this.f11647h = coordinatorLayout.getResources().getDimensionPixelSize(C0972c.design_bottom_sheet_peek_height_min);
            P0(view);
            P.H0(view, new a(view));
            this.f11629W = new WeakReference(view);
            this.f11636b0 = new L1.b(view);
            Q1.g gVar = this.f11650j;
            if (gVar != null) {
                P.s0(view, gVar);
                Q1.g gVar2 = this.f11650j;
                float f4 = this.f11615I;
                if (f4 == -1.0f) {
                    f4 = P.w(view);
                }
                gVar2.S(f4);
            } else {
                ColorStateList colorStateList = this.f11651k;
                if (colorStateList != null) {
                    P.t0(view, colorStateList);
                }
            }
            W0();
            if (P.z(view) == 0) {
                P.y0(view, 1);
            }
        }
        if (this.f11621O == null) {
            this.f11621O = N.c.m(coordinatorLayout, this.f11648h0);
        }
        int top = view.getTop();
        coordinatorLayout.I(view, i4);
        this.f11627U = coordinatorLayout.getWidth();
        this.f11628V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f11626T = height;
        int i5 = this.f11628V;
        int i6 = i5 - height;
        int i7 = this.f11664x;
        if (i6 < i7) {
            if (this.f11659s) {
                int i8 = this.f11653m;
                if (i8 != -1) {
                    i5 = Math.min(i5, i8);
                }
                this.f11626T = i5;
            } else {
                int i9 = i5 - i7;
                int i10 = this.f11653m;
                if (i10 != -1) {
                    i9 = Math.min(i9, i10);
                }
                this.f11626T = i9;
            }
        }
        this.f11611E = Math.max(0, this.f11628V - this.f11626T);
        a0();
        Y();
        int i11 = this.f11619M;
        if (i11 == 3) {
            P.Z(view, m0());
        } else if (i11 == 6) {
            P.Z(view, this.f11612F);
        } else if (this.f11616J && i11 == 5) {
            P.Z(view, this.f11628V);
        } else if (i11 == 4) {
            P.Z(view, this.f11614H);
        } else if (i11 == 1 || i11 == 2) {
            P.Z(view, top - view.getTop());
        }
        Y0(this.f11619M, false);
        this.f11631Y = new WeakReference(k0(view));
        if (this.f11632Z.size() <= 0) {
            return true;
        }
        F.a(this.f11632Z.get(0));
        throw null;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i4, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.f11652l, marginLayoutParams.width), l0(i6, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, this.f11653m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        int i4;
        if (this.f11635b) {
            return this.f11611E;
        }
        int i5 = this.f11610D;
        if (this.f11659s) {
            i4 = 0;
        } else {
            i4 = this.f11664x;
        }
        return Math.max(i5, i4);
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5) {
        WeakReference weakReference;
        if (!v0() || (weakReference = this.f11631Y) == null || view2 != weakReference.get()) {
            return false;
        }
        if (this.f11619M != 3 || super.o(coordinatorLayout, view, view2, f4, f5)) {
            return true;
        }
        return false;
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
        View view3;
        if (i6 != 1) {
            WeakReference weakReference = this.f11631Y;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (!v0() || view2 == view3) {
                int top = view.getTop();
                int i7 = top - i5;
                if (i5 > 0) {
                    if (i7 < m0()) {
                        int m02 = top - m0();
                        iArr[1] = m02;
                        P.Z(view, -m02);
                        O0(3);
                    } else if (this.f11618L) {
                        iArr[1] = i5;
                        P.Z(view, -i5);
                        O0(1);
                    } else {
                        return;
                    }
                } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
                    if (i7 > this.f11614H && !e0()) {
                        int i8 = top - this.f11614H;
                        iArr[1] = i8;
                        P.Z(view, -i8);
                        O0(4);
                    } else if (this.f11618L) {
                        iArr[1] = i5;
                        P.Z(view, -i5);
                        O0(1);
                    } else {
                        return;
                    }
                }
                j0(view.getTop());
                this.f11623Q = i5;
                this.f11624R = true;
            }
        }
    }

    public boolean r0() {
        return this.f11655o;
    }

    public boolean s0() {
        return this.f11616J;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.t());
        y0(fVar);
        int i4 = fVar.f11677c;
        if (i4 == 1 || i4 == 2) {
            this.f11619M = 4;
            this.f11620N = 4;
            return;
        }
        this.f11619M = i4;
        this.f11620N = i4;
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    private class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f11682a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f11683b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f11684c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = g.this.f11683b = false;
                N.c cVar = BottomSheetBehavior.this.f11621O;
                if (cVar == null || !cVar.k(true)) {
                    g gVar = g.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f11619M == 2) {
                        bottomSheetBehavior.O0(gVar.f11682a);
                        return;
                    }
                    return;
                }
                g gVar2 = g.this;
                gVar2.c(gVar2.f11682a);
            }
        }

        private g() {
            this.f11684c = new a();
        }

        /* access modifiers changed from: package-private */
        public void c(int i4) {
            WeakReference weakReference = BottomSheetBehavior.this.f11629W;
            if (weakReference != null && weakReference.get() != null) {
                this.f11682a = i4;
                if (!this.f11683b) {
                    P.g0((View) BottomSheetBehavior.this.f11629W.get(), this.f11684c);
                    this.f11683b = true;
                }
            }
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class f extends M.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f11677c;

        /* renamed from: d  reason: collision with root package name */
        int f11678d;

        /* renamed from: e  reason: collision with root package name */
        boolean f11679e;

        /* renamed from: f  reason: collision with root package name */
        boolean f11680f;

        /* renamed from: g  reason: collision with root package name */
        boolean f11681g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i4) {
                return new f[i4];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11677c = parcel.readInt();
            this.f11678d = parcel.readInt();
            boolean z3 = false;
            this.f11679e = parcel.readInt() == 1;
            this.f11680f = parcel.readInt() == 1;
            this.f11681g = parcel.readInt() == 1 ? true : z3;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f11677c);
            parcel.writeInt(this.f11678d);
            parcel.writeInt(this.f11679e ? 1 : 0);
            parcel.writeInt(this.f11680f ? 1 : 0);
            parcel.writeInt(this.f11681g ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f11677c = bottomSheetBehavior.f11619M;
            this.f11678d = bottomSheetBehavior.f11643f;
            this.f11679e = bottomSheetBehavior.f11635b;
            this.f11680f = bottomSheetBehavior.f11616J;
            this.f11681g = bottomSheetBehavior.f11617K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4;
        this.f11649i = context.getResources().getDimensionPixelSize(C0972c.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f16730x);
        int i5 = j.f16518B;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.f11651k = N1.c.a(context, obtainStyledAttributes, i5);
        }
        if (obtainStyledAttributes.hasValue(j.f16590T)) {
            this.f11666z = k.e(context, attributeSet, C0970a.bottomSheetStyle, f11606i0).m();
        }
        h0(context);
        i0();
        this.f11615I = obtainStyledAttributes.getDimension(j.f16514A, -1.0f);
        int i6 = j.f16734y;
        if (obtainStyledAttributes.hasValue(i6)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        int i7 = j.f16738z;
        if (obtainStyledAttributes.hasValue(i7)) {
            G0(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        int i8 = j.f16542H;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i8);
        if (peekValue == null || (i4 = peekValue.data) != -1) {
            I0(obtainStyledAttributes.getDimensionPixelSize(i8, -1));
        } else {
            I0(i4);
        }
        F0(obtainStyledAttributes.getBoolean(j.f16538G, false));
        D0(obtainStyledAttributes.getBoolean(j.f16558L, false));
        C0(obtainStyledAttributes.getBoolean(j.f16530E, true));
        M0(obtainStyledAttributes.getBoolean(j.f16554K, false));
        A0(obtainStyledAttributes.getBoolean(j.f16522C, true));
        K0(obtainStyledAttributes.getInt(j.f16546I, 0));
        E0(obtainStyledAttributes.getFloat(j.f16534F, 0.5f));
        int i9 = j.f16526D;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i9);
        if (peekValue2 == null || peekValue2.type != 16) {
            B0(obtainStyledAttributes.getDimensionPixelOffset(i9, 0));
        } else {
            B0(peekValue2.data);
        }
        L0(obtainStyledAttributes.getInt(j.f16550J, 500));
        this.f11656p = obtainStyledAttributes.getBoolean(j.f16574P, false);
        this.f11657q = obtainStyledAttributes.getBoolean(j.f16578Q, false);
        this.f11658r = obtainStyledAttributes.getBoolean(j.f16582R, false);
        this.f11659s = obtainStyledAttributes.getBoolean(j.f16586S, true);
        this.f11660t = obtainStyledAttributes.getBoolean(j.f16562M, false);
        this.f11661u = obtainStyledAttributes.getBoolean(j.f16566N, false);
        this.f11662v = obtainStyledAttributes.getBoolean(j.f16570O, false);
        this.f11665y = obtainStyledAttributes.getBoolean(j.f16594U, true);
        obtainStyledAttributes.recycle();
        this.f11639d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
