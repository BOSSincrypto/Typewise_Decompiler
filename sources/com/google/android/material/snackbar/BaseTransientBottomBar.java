package com.google.android.material.snackbar;

import Q1.g;
import Q1.k;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.P;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.m;
import com.google.android.material.snackbar.a;
import z1.C0970a;
import z1.C0972c;
import z1.j;

public abstract class BaseTransientBottomBar {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeInterpolator f12209a = A1.a.f6b;

    /* renamed from: b  reason: collision with root package name */
    private static final TimeInterpolator f12210b = A1.a.f5a;

    /* renamed from: c  reason: collision with root package name */
    private static final TimeInterpolator f12211c = A1.a.f8d;

    /* renamed from: d  reason: collision with root package name */
    static final Handler f12212d = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f12213e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f12214f = {C0970a.snackbarStyle};

    /* renamed from: g  reason: collision with root package name */
    private static final String f12215g = BaseTransientBottomBar.class.getSimpleName();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        private final b f12216k = new b(this);

        public boolean F(View view) {
            return this.f12216k.a(view);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f12216k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                F.a(message.obj);
                throw null;
            } else if (i4 != 1) {
                return false;
            } else {
                F.a(message.obj);
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    a.b().f((a.b) null);
                }
            } else if (coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                a.b().e((a.b) null);
            }
        }
    }

    protected static class c extends FrameLayout {

        /* renamed from: k  reason: collision with root package name */
        private static final View.OnTouchListener f12217k = new a();

        /* renamed from: a  reason: collision with root package name */
        k f12218a;

        /* renamed from: b  reason: collision with root package name */
        private int f12219b;

        /* renamed from: c  reason: collision with root package name */
        private final float f12220c;

        /* renamed from: d  reason: collision with root package name */
        private final float f12221d;

        /* renamed from: e  reason: collision with root package name */
        private final int f12222e;

        /* renamed from: f  reason: collision with root package name */
        private final int f12223f;

        /* renamed from: g  reason: collision with root package name */
        private ColorStateList f12224g;

        /* renamed from: h  reason: collision with root package name */
        private PorterDuff.Mode f12225h;

        /* renamed from: i  reason: collision with root package name */
        private Rect f12226i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f12227j;

        class a implements View.OnTouchListener {
            a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(T1.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.z4);
            int i4 = j.G4;
            if (obtainStyledAttributes.hasValue(i4)) {
                P.w0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i4, 0));
            }
            this.f12219b = obtainStyledAttributes.getInt(j.C4, 0);
            if (obtainStyledAttributes.hasValue(j.I4) || obtainStyledAttributes.hasValue(j.J4)) {
                this.f12218a = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f12220c = obtainStyledAttributes.getFloat(j.D4, 1.0f);
            setBackgroundTintList(N1.c.a(context2, obtainStyledAttributes, j.E4));
            setBackgroundTintMode(m.i(obtainStyledAttributes.getInt(j.F4, -1), PorterDuff.Mode.SRC_IN));
            this.f12221d = obtainStyledAttributes.getFloat(j.B4, 1.0f);
            this.f12222e = obtainStyledAttributes.getDimensionPixelSize(j.A4, -1);
            this.f12223f = obtainStyledAttributes.getDimensionPixelSize(j.H4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f12217k);
            setFocusable(true);
            if (getBackground() == null) {
                P.s0(this, a());
            }
        }

        private Drawable a() {
            Drawable drawable;
            int j4 = F1.a.j(this, C0970a.colorSurface, C0970a.colorOnSurface, getBackgroundOverlayColorAlpha());
            k kVar = this.f12218a;
            if (kVar != null) {
                drawable = BaseTransientBottomBar.d(j4, kVar);
            } else {
                drawable = BaseTransientBottomBar.c(j4, getResources());
            }
            if (this.f12224g == null) {
                return androidx.core.graphics.drawable.a.r(drawable);
            }
            Drawable r4 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r4, this.f12224g);
            return r4;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f12226i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f12221d;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f12219b;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f12220c;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f12223f;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f12222e;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            P.l0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
            super.onLayout(z3, i4, i5, i6, i7);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i4, int i5) {
            int i6;
            super.onMeasure(i4, i5);
            if (this.f12222e > 0 && getMeasuredWidth() > (i6 = this.f12222e)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i4) {
            this.f12219b = i4;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f12224g == null)) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f12224g);
                androidx.core.graphics.drawable.a.p(drawable, this.f12225h);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f12224g = colorStateList;
            if (getBackground() != null) {
                Drawable r4 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r4, colorStateList);
                androidx.core.graphics.drawable.a.p(r4, this.f12225h);
                if (r4 != getBackground()) {
                    super.setBackgroundDrawable(r4);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f12225h = mode;
            if (getBackground() != null) {
                Drawable r4 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r4, mode);
                if (r4 != getBackground()) {
                    super.setBackgroundDrawable(r4);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f12227j && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                b((ViewGroup.MarginLayoutParams) layoutParams);
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f12217k;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    public static GradientDrawable c(int i4, Resources resources) {
        float dimension = resources.getDimension(C0972c.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static g d(int i4, k kVar) {
        g gVar = new g(kVar);
        gVar.T(ColorStateList.valueOf(i4));
        return gVar;
    }
}
