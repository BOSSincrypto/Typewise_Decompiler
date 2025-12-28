package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* renamed from: p.c  reason: case insensitive filesystem */
public abstract class C0846c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f15821a;

    public C0846c(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f15821a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f15821a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f15821a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f15821a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f15821a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f15821a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f15821a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f15821a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f15821a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f15821a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f15821a.getPadding(rect);
    }

    public int[] getState() {
        return this.f15821a.getState();
    }

    public Region getTransparentRegion() {
        return this.f15821a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f15821a);
    }

    public boolean isStateful() {
        return this.f15821a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f15821a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f15821a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        return this.f15821a.setLevel(i4);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    public void setAlpha(int i4) {
        this.f15821a.setAlpha(i4);
    }

    public void setAutoMirrored(boolean z3) {
        a.j(this.f15821a, z3);
    }

    public void setChangingConfigurations(int i4) {
        this.f15821a.setChangingConfigurations(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15821a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z3) {
        this.f15821a.setDither(z3);
    }

    public void setFilterBitmap(boolean z3) {
        this.f15821a.setFilterBitmap(z3);
    }

    public void setHotspot(float f4, float f5) {
        a.k(this.f15821a, f4, f5);
    }

    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        a.l(this.f15821a, i4, i5, i6, i7);
    }

    public boolean setState(int[] iArr) {
        return this.f15821a.setState(iArr);
    }

    public void setTint(int i4) {
        a.n(this.f15821a, i4);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f15821a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f15821a, mode);
    }

    public boolean setVisible(boolean z3, boolean z4) {
        if (super.setVisible(z3, z4) || this.f15821a.setVisible(z3, z4)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
