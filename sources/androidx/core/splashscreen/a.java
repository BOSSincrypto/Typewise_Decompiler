package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f5078a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5079b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f5080c;

    public a(Drawable drawable, float f4) {
        o.e(drawable, "drawable");
        this.f5078a = drawable;
        this.f5079b = f4;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f4 / 2.0f, Path.Direction.CW);
        this.f5080c = path;
    }

    public void draw(Canvas canvas) {
        o.e(canvas, "canvas");
        canvas.clipPath(this.f5080c);
        this.f5078a.draw(canvas);
    }

    public int getOpacity() {
        return this.f5078a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        o.e(rect, "bounds");
        super.onBoundsChange(rect);
        this.f5078a.setBounds(rect);
        this.f5080c.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    public void setAlpha(int i4) {
        this.f5078a.setAlpha(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5078a.setColorFilter(colorFilter);
    }
}
