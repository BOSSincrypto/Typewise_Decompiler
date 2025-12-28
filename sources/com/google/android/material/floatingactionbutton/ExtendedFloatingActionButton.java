package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import z1.j;

public abstract class ExtendedFloatingActionButton extends MaterialButton {

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f12031a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f12032b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f12031a = false;
            this.f12032b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean I(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!I(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            J(view, extendedFloatingActionButton);
            return false;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i4) {
            List r4 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r4.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) r4.get(i5);
                if (F(view) && J(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i4);
            return true;
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            F.a(view);
            return E(coordinatorLayout, (ExtendedFloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.f4717h == 0) {
                eVar.f4717h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            F.a(view);
            return G(coordinatorLayout, (ExtendedFloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            F.a(view);
            return H(coordinatorLayout, (ExtendedFloatingActionButton) null, i4);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f16675l1);
            this.f12031a = obtainStyledAttributes.getBoolean(j.f16680m1, false);
            this.f12032b = obtainStyledAttributes.getBoolean(j.f16685n1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
