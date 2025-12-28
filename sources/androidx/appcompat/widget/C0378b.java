package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b  reason: case insensitive filesystem */
class C0378b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f3509a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0378b(ActionBarContainer actionBarContainer) {
        this.f3509a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f3509a;
        if (actionBarContainer.f3078h) {
            Drawable drawable = actionBarContainer.f3077g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3075e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f3509a;
        Drawable drawable3 = actionBarContainer2.f3076f;
        if (drawable3 != null && actionBarContainer2.f3079i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f3509a;
        if (!actionBarContainer.f3078h) {
            Drawable drawable = actionBarContainer.f3075e;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        } else if (actionBarContainer.f3077g != null) {
            a.a(actionBarContainer.f3075e, outline);
        }
    }

    public void setAlpha(int i4) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
