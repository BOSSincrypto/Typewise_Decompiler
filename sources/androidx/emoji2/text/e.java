package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.core.graphics.g;
import androidx.emoji2.text.f;

class e implements f.d {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f5453b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f5454a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f5454a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f5453b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    public boolean a(CharSequence charSequence, int i4, int i5, int i6) {
        StringBuilder b4 = b();
        b4.setLength(0);
        while (i4 < i5) {
            b4.append(charSequence.charAt(i4));
            i4++;
        }
        return g.a(this.f5454a, b4.toString());
    }
}
