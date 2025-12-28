package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import java.lang.ref.WeakReference;
import java.util.List;
import z1.j;

public abstract class AppBarLayout extends LinearLayout {

    protected static class BaseBehavior<T extends AppBarLayout> extends a {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f11528k;

        /* renamed from: l  reason: collision with root package name */
        private int f11529l;

        /* renamed from: m  reason: collision with root package name */
        private a f11530m;

        /* renamed from: n  reason: collision with root package name */
        private WeakReference f11531n;

        protected static class a extends M.a {
            public static final Parcelable.Creator<a> CREATOR = new C0167a();

            /* renamed from: c  reason: collision with root package name */
            boolean f11532c;

            /* renamed from: d  reason: collision with root package name */
            boolean f11533d;

            /* renamed from: e  reason: collision with root package name */
            int f11534e;

            /* renamed from: f  reason: collision with root package name */
            float f11535f;

            /* renamed from: g  reason: collision with root package name */
            boolean f11536g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            class C0167a implements Parcelable.ClassLoaderCreator {
                C0167a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                /* renamed from: c */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z3;
                boolean z4;
                boolean z5 = false;
                if (parcel.readByte() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f11532c = z3;
                if (parcel.readByte() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f11533d = z4;
                this.f11534e = parcel.readInt();
                this.f11535f = parcel.readFloat();
                this.f11536g = parcel.readByte() != 0 ? true : z5;
            }

            public void writeToParcel(Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeByte(this.f11532c ? (byte) 1 : 0);
                parcel.writeByte(this.f11533d ? (byte) 1 : 0);
                parcel.writeInt(this.f11534e);
                parcel.writeFloat(this.f11535f);
                parcel.writeByte(this.f11536g ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        private void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        private void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            P.i0(coordinatorLayout, A.a.f5254q.b());
            P.i0(coordinatorLayout, A.a.f5255r.b());
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            F.a(view);
            return b0(coordinatorLayout, (AppBarLayout) null, view2, view3, i4, i5);
        }

        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            F.a(view);
            c0(coordinatorLayout, (AppBarLayout) null, view2, i4);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ boolean G(View view) {
            F.a(view);
            return R((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int J(View view) {
            F.a(view);
            return S((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int K(View view) {
            F.a(view);
            return T((AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public int L() {
            return E() + this.f11528k;
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            F.a(view);
            U(coordinatorLayout, (AppBarLayout) null);
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
            F.a(view);
            return f0(coordinatorLayout, (AppBarLayout) null, i4, i5, i6);
        }

        /* access modifiers changed from: package-private */
        public boolean R(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f11531n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public int S(AppBarLayout appBarLayout) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public int T(AppBarLayout appBarLayout) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            g0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            super.l(coordinatorLayout, appBarLayout, i4);
            throw null;
        }

        public boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            throw null;
        }

        public void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            if (i5 == 0) {
                throw null;
            } else if (i5 < 0) {
                throw null;
            } else {
                throw null;
            }
        }

        public void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            if (i7 < 0) {
                throw null;
            } else if (i7 == 0) {
                h0(coordinatorLayout, appBarLayout);
            }
        }

        public void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof a) {
                d0((a) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f11530m.t());
                return;
            }
            super.x(coordinatorLayout, appBarLayout, parcelable);
            this.f11530m = null;
        }

        public Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y3 = super.y(coordinatorLayout, appBarLayout);
            a e02 = e0(y3, appBarLayout);
            if (e02 == null) {
                return y3;
            }
            return e02;
        }

        public boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
            if ((i4 & 2) == 0) {
                this.f11531n = null;
                this.f11529l = i5;
                return false;
            }
            throw null;
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
            if (this.f11529l == 0 || i4 == 1) {
                g0(coordinatorLayout, appBarLayout);
                throw null;
            } else {
                this.f11531n = new WeakReference(view);
            }
        }

        /* access modifiers changed from: package-private */
        public void d0(a aVar, boolean z3) {
            if (this.f11530m == null || z3) {
                this.f11530m = aVar;
            }
        }

        /* access modifiers changed from: package-private */
        public a e0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        /* access modifiers changed from: package-private */
        public int f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6) {
            int L3 = L();
            if (i5 == 0 || L3 < i5 || L3 > i6) {
                this.f11528k = 0;
            } else if (L3 != I.a.b(i4, i5, i6)) {
                throw null;
            }
            h0(coordinatorLayout, appBarLayout);
            return 0;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            F.a(view);
            return V(coordinatorLayout, (AppBarLayout) null, i4);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            F.a(view);
            return W(coordinatorLayout, (AppBarLayout) null, i4, i5, i6, i7);
        }

        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
            F.a(view);
            X(coordinatorLayout, (AppBarLayout) null, view2, i4, i5, iArr, i6);
        }

        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            F.a(view);
            Y(coordinatorLayout, (AppBarLayout) null, view2, i4, i5, i6, i7, i8, iArr);
        }

        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            F.a(view);
            Z(coordinatorLayout, (AppBarLayout) null, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            F.a(view);
            return a0(coordinatorLayout, (AppBarLayout) null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        public /* bridge */ /* synthetic */ boolean V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            return super.V(coordinatorLayout, appBarLayout, i4);
        }

        public /* bridge */ /* synthetic */ boolean W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            return super.W(coordinatorLayout, appBarLayout, i4, i5, i6, i7);
        }

        public /* bridge */ /* synthetic */ void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            super.X(coordinatorLayout, appBarLayout, view, i4, i5, iArr, i6);
        }

        public /* bridge */ /* synthetic */ void Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            super.Y(coordinatorLayout, appBarLayout, view, i4, i5, i6, i7, i8, iArr);
        }

        public /* bridge */ /* synthetic */ void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.Z(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.a0(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
            return super.b0(coordinatorLayout, appBarLayout, view, view2, i4, i5);
        }

        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
            super.c0(coordinatorLayout, appBarLayout, view, i4);
        }

        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private void P(View view, View view2) {
            CoordinatorLayout.b e4 = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (e4 instanceof BaseBehavior) {
                P.Z(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e4).f11528k) + K()) - H(view2));
            }
        }

        private void Q(View view, View view2) {
        }

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        /* access modifiers changed from: package-private */
        public float I(View view) {
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int J(View view) {
            return super.J(view);
        }

        /* access modifiers changed from: package-private */
        public AppBarLayout O(List list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) list.get(i4);
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return super.l(coordinatorLayout, view, i4);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return super.m(coordinatorLayout, view, i4, i5, i6, i7);
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            O(coordinatorLayout.r(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.b4);
            M(obtainStyledAttributes.getDimensionPixelSize(j.c4, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
