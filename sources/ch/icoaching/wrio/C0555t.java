package ch.icoaching.wrio;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import kotlin.jvm.internal.o;

/* renamed from: ch.icoaching.wrio.t  reason: case insensitive filesystem */
public final class C0555t extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f10657a;

    public C0555t(Drawable drawable) {
        o.e(drawable, "innerDrawable");
        this.f10657a = drawable;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        o.e(canvas, "canvas");
        this.f10657a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f10657a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        Drawable current = this.f10657a.getCurrent();
        o.d(current, "getCurrent(...)");
        return current;
    }

    public int getIntrinsicHeight() {
        return this.f10657a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f10657a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return 0;
    }

    public int getMinimumWidth() {
        return 0;
    }

    public int getOpacity() {
        return this.f10657a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        o.e(rect, "padding");
        return this.f10657a.getPadding(rect);
    }

    public int[] getState() {
        int[] state = this.f10657a.getState();
        o.d(state, "getState(...)");
        return state;
    }

    public Region getTransparentRegion() {
        return this.f10657a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        o.e(drawable, "who");
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f10657a);
    }

    public boolean isStateful() {
        return this.f10657a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f10657a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        return this.f10657a.setLevel(i4);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        o.e(drawable, "who");
        o.e(runnable, "what");
        scheduleSelf(runnable, j4);
    }

    public void setAlpha(int i4) {
        this.f10657a.setAlpha(i4);
    }

    public void setAutoMirrored(boolean z3) {
        a.j(this.f10657a, z3);
    }

    public void setBounds(int i4, int i5, int i6, int i7) {
        super.setBounds(i4, i5, i6, i7);
        this.f10657a.setBounds(i4, i5, i6, i7);
    }

    public void setChangingConfigurations(int i4) {
        this.f10657a.setChangingConfigurations(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10657a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z3) {
        this.f10657a.setDither(z3);
    }

    public void setFilterBitmap(boolean z3) {
        this.f10657a.setFilterBitmap(z3);
    }

    public void setHotspot(float f4, float f5) {
        a.k(this.f10657a, f4, f5);
    }

    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        a.l(this.f10657a, i4, i5, i6, i7);
    }

    public boolean setState(int[] iArr) {
        o.e(iArr, "stateSet");
        return this.f10657a.setState(iArr);
    }

    public void setTint(int i4) {
        a.n(this.f10657a, i4);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f10657a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10657a;
        o.b(mode);
        a.p(drawable, mode);
    }

    public boolean setVisible(boolean z3, boolean z4) {
        if (super.setVisible(z3, z4) || this.f10657a.setVisible(z3, z4)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        o.e(drawable, "who");
        o.e(runnable, "what");
        unscheduleSelf(runnable);
    }
}
