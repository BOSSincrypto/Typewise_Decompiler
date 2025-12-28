package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

public final class p extends j {

    /* renamed from: f  reason: collision with root package name */
    private static Paint f5537f;

    public p(h hVar) {
        super(hVar);
    }

    private static Paint c() {
        if (f5537f == null) {
            TextPaint textPaint = new TextPaint();
            f5537f = textPaint;
            textPaint.setColor(f.b().c());
            f5537f.setStyle(Paint.Style.FILL);
        }
        return f5537f;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
        if (f.b().i()) {
            canvas.drawRect(f4, (float) i6, f4 + ((float) b()), (float) i8, c());
        }
        a().a(canvas, f4, (float) i7, paint);
    }
}
