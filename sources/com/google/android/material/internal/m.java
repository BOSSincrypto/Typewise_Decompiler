package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C;
import androidx.core.view.C0435o0;
import androidx.core.view.M0;
import androidx.core.view.P;

public abstract class m {

    class a implements C {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f12166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f12167b;

        a(c cVar, d dVar) {
            this.f12166a = cVar;
            this.f12167b = dVar;
        }

        public C0435o0 a(View view, C0435o0 o0Var) {
            return this.f12166a.a(view, o0Var, new d(this.f12167b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            P.l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        C0435o0 a(View view, C0435o0 o0Var, d dVar);
    }

    public static void b(View view, c cVar) {
        P.C0(view, new a(cVar, new d(P.G(view), view.getPaddingTop(), P.F(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i4) {
        return TypedValue.applyDimension(1, (float) i4, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) androidx.core.content.a.g(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f4 += P.w((View) parent);
        }
        return f4;
    }

    public static boolean g(View view) {
        if (P.B(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode i(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (P.R(view)) {
            P.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(View view, boolean z3) {
        view.requestFocus();
        view.post(new l(view, z3));
    }

    public static void l(View view, boolean z3) {
        M0 K3;
        if (!z3 || (K3 = P.K(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            K3.e(C0435o0.m.b());
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f12168a;

        /* renamed from: b  reason: collision with root package name */
        public int f12169b;

        /* renamed from: c  reason: collision with root package name */
        public int f12170c;

        /* renamed from: d  reason: collision with root package name */
        public int f12171d;

        public d(int i4, int i5, int i6, int i7) {
            this.f12168a = i4;
            this.f12169b = i5;
            this.f12170c = i6;
            this.f12171d = i7;
        }

        public d(d dVar) {
            this.f12168a = dVar.f12168a;
            this.f12169b = dVar.f12169b;
            this.f12170c = dVar.f12170c;
            this.f12171d = dVar.f12171d;
        }
    }
}
