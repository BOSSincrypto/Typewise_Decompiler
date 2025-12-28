package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.c;

public abstract class n implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f5135a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f5136b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5137c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5138d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f5139e;

        /* renamed from: androidx.core.text.n$a$a  reason: collision with other inner class name */
        public static class C0080a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f5140a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f5141b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            private int f5142c = 1;

            /* renamed from: d  reason: collision with root package name */
            private int f5143d = 1;

            public C0080a(TextPaint textPaint) {
                this.f5140a = textPaint;
            }

            public a a() {
                return new a(this.f5140a, this.f5141b, this.f5142c, this.f5143d);
            }

            public C0080a b(int i4) {
                this.f5142c = i4;
                return this;
            }

            public C0080a c(int i4) {
                this.f5143d = i4;
                return this;
            }

            public C0080a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f5141b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5139e = d.a(textPaint).setBreakStrategy(i4).setHyphenationFrequency(i5).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f5139e = null;
            }
            this.f5135a = textPaint;
            this.f5136b = textDirectionHeuristic;
            this.f5137c = i4;
            this.f5138d = i5;
        }

        public boolean a(a aVar) {
            int i4 = Build.VERSION.SDK_INT;
            if (this.f5137c != aVar.b() || this.f5138d != aVar.c() || this.f5135a.getTextSize() != aVar.e().getTextSize() || this.f5135a.getTextScaleX() != aVar.e().getTextScaleX() || this.f5135a.getTextSkewX() != aVar.e().getTextSkewX() || this.f5135a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f5135a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f5135a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i4 >= 24) {
                if (!this.f5135a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f5135a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f5135a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f5135a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.f5137c;
        }

        public int c() {
            return this.f5138d;
        }

        public TextDirectionHeuristic d() {
            return this.f5136b;
        }

        public TextPaint e() {
            return this.f5135a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar) && this.f5136b == aVar.d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return c.b(Float.valueOf(this.f5135a.getTextSize()), Float.valueOf(this.f5135a.getTextScaleX()), Float.valueOf(this.f5135a.getTextSkewX()), Float.valueOf(this.f5135a.getLetterSpacing()), Integer.valueOf(this.f5135a.getFlags()), this.f5135a.getTextLocales(), this.f5135a.getTypeface(), Boolean.valueOf(this.f5135a.isElegantTextHeight()), this.f5136b, Integer.valueOf(this.f5137c), Integer.valueOf(this.f5138d));
            }
            return c.b(Float.valueOf(this.f5135a.getTextSize()), Float.valueOf(this.f5135a.getTextScaleX()), Float.valueOf(this.f5135a.getTextSkewX()), Float.valueOf(this.f5135a.getLetterSpacing()), Integer.valueOf(this.f5135a.getFlags()), this.f5135a.getTextLocale(), this.f5135a.getTypeface(), Boolean.valueOf(this.f5135a.isElegantTextHeight()), this.f5136b, Integer.valueOf(this.f5137c), Integer.valueOf(this.f5138d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f5135a.getTextSize());
            sb.append(", textScaleX=" + this.f5135a.getTextScaleX());
            sb.append(", textSkewX=" + this.f5135a.getTextSkewX());
            int i4 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f5135a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f5135a.isElegantTextHeight());
            if (i4 >= 24) {
                sb.append(", textLocale=" + this.f5135a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f5135a.getTextLocale());
            }
            sb.append(", typeface=" + this.f5135a.getTypeface());
            if (i4 >= 26) {
                sb.append(", variationSettings=" + this.f5135a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f5136b);
            sb.append(", breakStrategy=" + this.f5137c);
            sb.append(", hyphenationFrequency=" + this.f5138d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f5135a = params.getTextPaint();
            this.f5136b = params.getTextDirection();
            this.f5137c = params.getBreakStrategy();
            this.f5138d = params.getHyphenationFrequency();
            this.f5139e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
