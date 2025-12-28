package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.P;
import androidx.core.view.W;
import androidx.core.view.X;
import n.C0822a;
import n.j;

/* renamed from: androidx.appcompat.widget.a  reason: case insensitive filesystem */
abstract class C0377a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0054a f3494a = new C0054a();

    /* renamed from: b  reason: collision with root package name */
    protected final Context f3495b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f3496c;

    /* renamed from: d  reason: collision with root package name */
    protected C0379c f3497d;

    /* renamed from: e  reason: collision with root package name */
    protected int f3498e;

    /* renamed from: f  reason: collision with root package name */
    protected W f3499f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3500g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3501h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    protected class C0054a implements X {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3502a = false;

        /* renamed from: b  reason: collision with root package name */
        int f3503b;

        protected C0054a() {
        }

        public void a(View view) {
            this.f3502a = true;
        }

        public void b(View view) {
            if (!this.f3502a) {
                C0377a aVar = C0377a.this;
                aVar.f3499f = null;
                C0377a.super.setVisibility(this.f3503b);
            }
        }

        public void c(View view) {
            C0377a.super.setVisibility(0);
            this.f3502a = false;
        }

        public C0054a d(W w3, int i4) {
            C0377a.this.f3499f = w3;
            this.f3503b = i4;
            return this;
        }
    }

    C0377a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0822a.f14668a, typedValue, true) || typedValue.resourceId == 0) {
            this.f3495b = context;
        } else {
            this.f3495b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i4, int i5, boolean z3) {
        return z3 ? i4 - i5 : i4 + i5;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i4, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z3) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public W f(int i4, long j4) {
        W w3 = this.f3499f;
        if (w3 != null) {
            w3.c();
        }
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            W b4 = P.e(this).b(1.0f);
            b4.f(j4);
            b4.h(this.f3494a.d(b4, i4));
            return b4;
        }
        W b5 = P.e(this).b(0.0f);
        b5.f(j4);
        b5.h(this.f3494a.d(b5, i4));
        return b5;
    }

    public int getAnimatedVisibility() {
        if (this.f3499f != null) {
            return this.f3494a.f3503b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3498e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f14943a, C0822a.f14670c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f14988j, 0));
        obtainStyledAttributes.recycle();
        C0379c cVar = this.f3497d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3501h = false;
        }
        if (!this.f3501h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3501h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3501h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3500g = false;
        }
        if (!this.f3500g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3500g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3500g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i4);

    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            W w3 = this.f3499f;
            if (w3 != null) {
                w3.c();
            }
            super.setVisibility(i4);
        }
    }
}
