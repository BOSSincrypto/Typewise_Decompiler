package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.g;

final class B {

    /* renamed from: a  reason: collision with root package name */
    private TextView f3150a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f3151b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    B(TextView textView) {
        this.f3150a = (TextView) g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f3151b;
        if (textClassifier == null) {
            return a.a(this.f3150a);
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f3151b = textClassifier;
    }
}
