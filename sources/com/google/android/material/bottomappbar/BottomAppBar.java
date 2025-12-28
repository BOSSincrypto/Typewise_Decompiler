package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.F;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.P;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import z1.C0970a;
import z1.i;

public abstract class BottomAppBar extends Toolbar {

    /* renamed from: U  reason: collision with root package name */
    private static final int f11598U = i.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: V  reason: collision with root package name */
    private static final int f11599V = C0970a.motionDurationLong2;

    /* renamed from: W  reason: collision with root package name */
    private static final int f11600W = C0970a.motionEasingEmphasizedInterpolator;

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* access modifiers changed from: private */
    public static void V(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).f4713d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m  reason: collision with root package name */
        private final Rect f11601m = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public WeakReference f11602n;

        /* renamed from: o  reason: collision with root package name */
        private int f11603o;

        /* renamed from: p  reason: collision with root package name */
        private final View.OnLayoutChangeListener f11604p = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                F.a(Behavior.this.f11602n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            F.a(view);
            return P(coordinatorLayout, (BottomAppBar) null, view2, view3, i4, i5);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i4) {
            this.f11602n = new WeakReference(bottomAppBar);
            View T3 = BottomAppBar.T(bottomAppBar);
            if (T3 != null && !P.S(T3)) {
                BottomAppBar.V(bottomAppBar, T3);
                this.f11603o = ((CoordinatorLayout.e) T3.getLayoutParams()).bottomMargin;
                T3.addOnLayoutChangeListener(this.f11604p);
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.I(bottomAppBar, i4);
            return super.l(coordinatorLayout, bottomAppBar, i4);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i4, int i5) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            F.a(view);
            return O(coordinatorLayout, (BottomAppBar) null, i4);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
