package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.P;
import n.f;
import n.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3071a;

    /* renamed from: b  reason: collision with root package name */
    private View f3072b;

    /* renamed from: c  reason: collision with root package name */
    private View f3073c;

    /* renamed from: d  reason: collision with root package name */
    private View f3074d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f3075e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f3076f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f3077g;

    /* renamed from: h  reason: collision with root package name */
    boolean f3078h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3079i;

    /* renamed from: j  reason: collision with root package name */
    private int f3080j;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        P.s0(this, new C0378b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f14943a);
        this.f3075e = obtainStyledAttributes.getDrawable(j.f14948b);
        this.f3076f = obtainStyledAttributes.getDrawable(j.f14958d);
        this.f3080j = obtainStyledAttributes.getDimensionPixelSize(j.f14988j, -1);
        boolean z3 = true;
        if (getId() == f.f14768H) {
            this.f3078h = true;
            this.f3077g = obtainStyledAttributes.getDrawable(j.f14953c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3078h ? !(this.f3075e == null && this.f3076f == null) : this.f3077g != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3075e;
        if (drawable != null && drawable.isStateful()) {
            this.f3075e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3076f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3076f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3077g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f3077g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f3072b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3075e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3076f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3077g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3073c = findViewById(f.f14777a);
        this.f3074d = findViewById(f.f14782f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f3071a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f3072b
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f3078h
            if (r6 == 0) goto L_0x004b
            android.graphics.drawable.Drawable r5 = r4.f3077g
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00be
        L_0x0048:
            r9 = r0
            goto L_0x00be
        L_0x004b:
            android.graphics.drawable.Drawable r6 = r4.f3075e
            if (r6 == 0) goto L_0x00a3
            android.view.View r6 = r4.f3073c
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0075
            android.graphics.drawable.Drawable r6 = r4.f3075e
            android.view.View r7 = r4.f3073c
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f3073c
            int r8 = r8.getTop()
            android.view.View r0 = r4.f3073c
            int r0 = r0.getRight()
            android.view.View r2 = r4.f3073c
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x0075:
            android.view.View r6 = r4.f3074d
            if (r6 == 0) goto L_0x009d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x009d
            android.graphics.drawable.Drawable r6 = r4.f3075e
            android.view.View r7 = r4.f3074d
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f3074d
            int r8 = r8.getTop()
            android.view.View r0 = r4.f3074d
            int r0 = r0.getRight()
            android.view.View r2 = r4.f3074d
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x00a2
        L_0x009d:
            android.graphics.drawable.Drawable r6 = r4.f3075e
            r6.setBounds(r0, r0, r0, r0)
        L_0x00a2:
            r0 = r9
        L_0x00a3:
            r4.f3079i = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f3076f
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00be:
            if (r9 == 0) goto L_0x00c3
            r4.invalidate()
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f3073c == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i8 = this.f3080j) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f3073c != null) {
            int mode = View.MeasureSpec.getMode(i5);
            View view = this.f3072b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f3073c)) {
                    i6 = a(this.f3073c);
                } else if (!b(this.f3074d)) {
                    i6 = a(this.f3074d);
                } else {
                    i6 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i7 = View.MeasureSpec.getSize(i5);
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i6 + a(this.f3072b), i7));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3075e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3075e);
        }
        this.f3075e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3073c;
            if (view != null) {
                this.f3075e.setBounds(view.getLeft(), this.f3073c.getTop(), this.f3073c.getRight(), this.f3073c.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3078h ? this.f3075e == null && this.f3076f == null : this.f3077g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3077g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3077g);
        }
        this.f3077g = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3078h && (drawable2 = this.f3077g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f3078h ? this.f3075e == null && this.f3076f == null : this.f3077g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3076f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3076f);
        }
        this.f3076f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3079i && (drawable2 = this.f3076f) != null) {
                drawable2.setBounds(this.f3072b.getLeft(), this.f3072b.getTop(), this.f3072b.getRight(), this.f3072b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3078h ? this.f3075e == null && this.f3076f == null : this.f3077g == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(W w3) {
        View view = this.f3072b;
        if (view != null) {
            removeView(view);
        }
        this.f3072b = w3;
    }

    public void setTransitioning(boolean z3) {
        int i4;
        this.f3071a = z3;
        if (z3) {
            i4 = 393216;
        } else {
            i4 = 262144;
        }
        setDescendantFocusability(i4);
    }

    public void setVisibility(int i4) {
        boolean z3;
        super.setVisibility(i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f3075e;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f3076f;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f3077g;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.f3075e || this.f3078h) && ((drawable != this.f3076f || !this.f3079i) && ((drawable != this.f3077g || !this.f3078h) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
