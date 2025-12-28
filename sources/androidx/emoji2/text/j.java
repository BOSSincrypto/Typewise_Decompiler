package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.g;

public abstract class j extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f5507a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final h f5508b;

    /* renamed from: c  reason: collision with root package name */
    private short f5509c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f5510d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f5511e = 1.0f;

    j(h hVar) {
        g.h(hVar, "metadata cannot be null");
        this.f5508b = hVar;
    }

    public final h a() {
        return this.f5508b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f5509c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f5507a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f5507a;
        this.f5511e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f5508b.e());
        this.f5510d = (short) ((int) (((float) this.f5508b.e()) * this.f5511e));
        short i6 = (short) ((int) (((float) this.f5508b.i()) * this.f5511e));
        this.f5509c = i6;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f5507a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i6;
    }
}
