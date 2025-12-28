package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

abstract class g extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    Drawable f6975a;

    g() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            a.i(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        return super.onLevelChange(i4);
    }

    public void setChangingConfigurations(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i4);
        } else {
            super.setChangingConfigurations(i4);
        }
    }

    public void setColorFilter(int i4, PorterDuff.Mode mode) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setColorFilter(i4, mode);
        } else {
            super.setColorFilter(i4, mode);
        }
    }

    public void setFilterBitmap(boolean z3) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            a.k(drawable, f4, f5);
        }
    }

    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            a.l(drawable, i4, i5, i6, i7);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }
}
