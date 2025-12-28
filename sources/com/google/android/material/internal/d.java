package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.O;
import z1.j;

public abstract class d extends O {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f12147p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f12148q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    private final Rect f12149r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private int f12150s = 119;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f12151t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f12152u = false;

    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray i5 = j.i(context, attributeSet, j.f16720u1, i4, 0, new int[0]);
        this.f12150s = i5.getInt(j.f16728w1, this.f12150s);
        Drawable drawable = i5.getDrawable(j.f16724v1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f12151t = i5.getBoolean(j.f16732x1, true);
        i5.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f12147p;
        if (drawable != null) {
            if (this.f12152u) {
                this.f12152u = false;
                Rect rect = this.f12148q;
                Rect rect2 = this.f12149r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f12151t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f12150s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f12147p;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f12147p;
        if (drawable != null && drawable.isStateful()) {
            this.f12147p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f12147p;
    }

    public int getForegroundGravity() {
        return this.f12150s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12147p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        this.f12152u = z3 | this.f12152u;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f12152u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f12147p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f12147p);
            }
            this.f12147p = drawable;
            this.f12152u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f12150s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i4) {
        if (this.f12150s != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f12150s = i4;
            if (i4 == 119 && this.f12147p != null) {
                this.f12147p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f12147p) {
            return true;
        }
        return false;
    }
}
