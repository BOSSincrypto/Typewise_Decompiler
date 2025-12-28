package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

class s implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5538a = false;

    /* renamed from: b  reason: collision with root package name */
    private Spannable f5539b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return false;
        }
    }

    static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return t.a(charSequence);
        }
    }

    s(Spannable spannable) {
        this.f5539b = spannable;
    }

    private void a() {
        Spannable spannable = this.f5539b;
        if (!this.f5538a && c().a(spannable)) {
            this.f5539b = new SpannableString(spannable);
        }
        this.f5538a = true;
    }

    static b c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new b();
        }
        return new c();
    }

    /* access modifiers changed from: package-private */
    public Spannable b() {
        return this.f5539b;
    }

    public char charAt(int i4) {
        return this.f5539b.charAt(i4);
    }

    public IntStream chars() {
        return a.a(this.f5539b);
    }

    public IntStream codePoints() {
        return a.b(this.f5539b);
    }

    public int getSpanEnd(Object obj) {
        return this.f5539b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f5539b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f5539b.getSpanStart(obj);
    }

    public Object[] getSpans(int i4, int i5, Class cls) {
        return this.f5539b.getSpans(i4, i5, cls);
    }

    public int length() {
        return this.f5539b.length();
    }

    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f5539b.nextSpanTransition(i4, i5, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f5539b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f5539b.setSpan(obj, i4, i5, i6);
    }

    public CharSequence subSequence(int i4, int i5) {
        return this.f5539b.subSequence(i4, i5);
    }

    public String toString() {
        return this.f5539b.toString();
    }

    s(CharSequence charSequence) {
        this.f5539b = new SpannableString(charSequence);
    }
}
